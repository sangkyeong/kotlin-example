package ex09

fun main() {
    //[Kotlin의 when]

    //break; 필요없음
    val rst = when(""){
        "" -> {
            ""
        }
        "ADMIN", "MASTER" -> {
            "master"
        }
        "USER" -> {
            "user"
        }
        else -> {
            "default"
        }
    }

    var any : Any = "";

    when(any){
        is String ->{

        }
        is Boolean ->{

        }
        is Int ->{

        }
    }

    var exception = RuntimeException()
    //type casting 가능
    when(exception){
        is NullPointerException -> {

        }
        is RuntimeException -> {

        }
    }

    var number = 10
    //지역변수 처럼 선언 가능
    when(val n = number % 2){
        0 -> {
            println(n) //0
        }

        else -> {
            println(n)
        }
    }

    //계산식도 가능
    val r = when{
        number % 2 == 0 -> {
            100
        }
        else -> {
            200
        }
    }
    println(r)  //100


}
