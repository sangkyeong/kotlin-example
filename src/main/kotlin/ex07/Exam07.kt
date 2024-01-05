package ex07
fun main() {
    //[dataClass]

    val user = User(null, 10, null)
    println(user)   //User(name=null, age=10, email=null)

    user.name = "이순신"
    user.age = 20
    user.email = "gmail"
    println(user)   //User(name=이순신, age=20, email=gmail)

    val user2 = user.copy(name = "홍길동")
    println(user2)  //User(name=홍길동, age=20, email=gmail)

    //JAVA에서는 순서대로 값을 넣어줘야하지만 여기에선 이름만 제시하면됨(named arguments)
    val user3 = User(
        age = 10,
        email = "naver",
        name = "강감찬",
    )
    println(user3)  //User(name=강감찬, age=10, email=naver)

}
