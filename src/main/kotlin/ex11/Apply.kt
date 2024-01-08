package ex11

fun main(){
    //생성자 패턴에서 많이 사용
    // = 초기화를 시킬때 주로 사용

    val userDto = UserDto().apply{
        //also와 똑같이 넘어온 객체가 반환된다(자기자신)
        //단, 넘어온 객체의 이름은 바꾸지 못함 this사용

        //확장함수람다 -> 람다식으로 파라미터가 들어오는데 확장함수가 됨?
        //람다는 apply 스코프 내에서만 사용가능
        name = "홍길동"    //this.name = "홍길동" -> O
    }
    println(userDto)        //UserDto(name=홍길동)
}

fun UserDto.myUserDto(){    //dataClass로 만든 UserDto를 사용할 것이고 이름은 myUserDto라고 사용, 리턴형은 없음
    println(this.name)
}