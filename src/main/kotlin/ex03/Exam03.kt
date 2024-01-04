package ex03

fun main(){

    //가변이냐(var)-mutable 불변이냐가(val)-immutable 중요

    //가변리스트
    val userList = mutableListOf<User>()
    userList.add(User("1",10))
    userList.add(User("2",20))
    userList.add(User("3",30))

    //불변리스트
    val list = listOf<User>(
        User("4", 40)
    )

    //for문 사용
    for(element in userList){
        println(element)
    }

    //foreach문 사용
    userList.forEach{it -> println(it)}

    //foreach문 index 사용
    userList.forEachIndexed{ index, user ->
        println("index: $index user: $user")
    }

    //다른방법
    userList.forEachIndexed(fun(index, user){
        println("index: $index user: $user")
    })

    //for문으로 index사용
    for((index, element) in userList.withIndex()){
        println("index: $index user: $element")
    }
}

class User(
    var name: String,
    var age: Int
)