package ex11

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){
    //run
    //주로 지역 스코프를 만들때 사용

    val userDto = UserDto("").run {

        //확장함수람다로 접달
        name = "홍길동"
        "empty" //마지막에 있는 게 반환 ->let함수와 비슷
    }
    println("result $userDto")  //result empty

    val x = 10      //지역 스코프기 때문에 바깥 x는 아무 영향없음

    val sum = run{
        val x = 2
        val y = 3
        x + y   //마지막에 있는 게 반환
    }

    println(sum)    //5

    val now: LocalDateTime? = LocalDateTime.now()

    //단순 null 체크 시 let만 사용해도 충분
    val n = now?.let{ it }?: LocalDateTime.now()

    //하지만 로직이 필요하다면 run사용 추천
    val d = now?.let{
        val minusTime = it.minusHours(1)
        minusTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"))

        /**
         * 예)
         *  now가 값이 있는 상태 >> val now: LocalDateTime? = LocalDateTime.now()
         *  let함수 실행됨
         *  println("result $d") //result 20240108
         */

    }?:run{     //now라는 변수가 null이라면 아래 스코프 로직 실행
        val now = LocalDateTime.now()
        val minusTime = now.minusHours(2)
        minusTime.format(DateTimeFormatter.ofPattern("yyyyMMdd HH"))

        /**
         * 예)
         *  now가 값이 없는 상태 >> val now: LocalDateTime? = null
         *  run함수 실행됨
         *  println("result $d") //result 20240108 08
         */
    }

    println("result $d")
}