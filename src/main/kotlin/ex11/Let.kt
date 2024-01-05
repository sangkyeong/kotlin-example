package ex11

import java.time.LocalDateTime

fun main() {
    //let
    //map이랑 비슷한 느낌이지만 map은 collection, let은 객체에서 사용한다고 생각
    val now = LocalDateTime.now()
    val localDataTime: LocalDateTime?=null

    val kst = now?.let{ localDataTime2 ->    //기본 스코프 변수는 it이고 다른 이름으로 지정 가능. (nullPoint error방지?)
                                            //해당 스코프내에서만 사용가능
        println("let scope : $localDataTime2") // let scope : 2024-01-05T17:28:05.317223800
        "let scope return value"         //let안에 맨 마지막 값이 return됨
    }?: LocalDateTime.now()

    println("result : $kst")                //result : let scope return value

    UserDto(name = "홍길동").let {
        logic(it)
    }
}

fun logic(userDto: UserDto?): UserResponse?{
   return userDto?.let{userDto ->
        println("dto : $userDto")   //dto : UserDto(name=홍길동)

        UserEntity(
            name = userDto.name
        )
    }?.let{//위에서 마지막으로 UserEntity를 반환하기 때문에 UserEntity스코프가 됨
        println("UserEntity : $it") //UserEntity : UserEntity(name=홍길동)

        UserResponse(
            userName = it.name
        )
    }
}

data class UserDto(
    var name: String?=null
)

data class UserEntity(
    var name: String?=null,
)
data class UserResponse(
    var userName: String?=null,
)