package ex10

fun main() {
    //확장함수
    val user = ExamUser(name = "abcd")
    exam10(user)
}

fun exam10(examUser: ExamUser?){
    examUser?.let {//null이 아닐때
        it.name?.let{
            name -> println(name)
        }

    }?: run{    //null일때

    }

    //이렇게 쓰기도 함 확장함수 연계
    examUser?.let {
        if (it.name.isNotNullOrBlank()) {
            println(it.name)
        }
    }

    //java에서 모든 클래스의 부모는 Object라면 kotlin은 Any
    //메소드를 만들어 사용
    if(examUser.isNotNull() && examUser?.name.isNotNullOrBlank()){
        println(examUser?.name)
    }
}

data class ExamUser(
    var name: String ?= null
)

fun String?.isNotNullOrBlank():Boolean{  //확장함수  extensions function
    return !this.isNullOrBlank()
}

fun Any?.isNotNull(): Boolean{
    return this != null
}