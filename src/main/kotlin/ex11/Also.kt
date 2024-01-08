package ex11

fun main(){
    //also 또한
    val userDto = UserDto(
        name = "홍길동"
    )?.also {dto: UserDto -> //UserDto라는 객체를 'dto'라고 사용하겠다

        println(dto)           //UserDto(name=홍길동)

        UserDto(
            "유관순"
        )
                                //dto.name = "유관순" 이렇게 해야 setter를 통해 값이 바뀜

        /** also는 unit형을 반환 -> java에서 void를 레퍼런스타입객체로 맵핑한 것?
         *  즉, 넘어온 객체 그대로 반환
         *
         * let이랑 차이점
         *  let은 마지막으로 넘겨준 타입이 반환이 되지만
         *  also는 처음에 넘어온 파라미터가 반환된다
         */
    }
    println("result $userDto")  //result UserDto(name=홍길동)
}