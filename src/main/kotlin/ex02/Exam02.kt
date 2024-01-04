package ex02

import java.util.*

fun main(){

    val a:Int = 0
    val b = 10
    val c: Int = 20

    //? => 엘비스 연산자
    //null값도 올 수 있다는 뜻
    val d: Int? = null

    callFunction(a) //0
    callFunction(b) //10
    callFunction(c) //20
    callFunction(d) //null
}


fun callFunction(i: Int?){
    //변수뒤 ?  해당 변수가 null인지 확인
    //?. 일때 변수가 null이 아닐때
    //?: 일때 변수가 null일때

    i?.let {
        println(it)
    }?: run{
        println("null 값 입니다")
    }

    //다른방식 자바의 삼항연산비슷
    val temp = if (i == null) "null값 입니다" else i
    println(temp)

    //다른방식
    val temp2 = i ?: "null값 입니다"
    println(temp2)

    //매개변수가 null이 아니면 *10 null이면 문구출력
    val cal = i ?. let { it * 10 } ?: "null값 입니다"
    println(cal)
    /**
     * 0
     * 100
     * 200
     * null값 입니다
      */

    //fun callFunction(i: Int? = 100){
    //callFunction() 처럼 매개변수가 없을땐 100으로 초기화 후 메소드 실행

}