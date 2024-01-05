package ex08

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    //[Kotlin의 DefaultValue개념]
    Exam08(Store())
    println(DateTimeUtil().localDateTimeToString()) //2024년 01월 05일 15시 19분 33초
}

data class Store(
    var registeredAt: LocalDateTime ?= null
)

class  Exam08(store: Store) {
    init {  //constructor(store: Store){ 이거랑 같음 Exam08이 시작할때 실행되는 메소드
        val strLocalDateTime = toLocalDateTimeString(store.registeredAt)
    }

    fun toLocalDateTimeString(localDateTime: LocalDateTime?): String{    //String으로 return
        val temp = localDateTime ?: LocalDateTime.now()

        /* 같은문장
            var temp = if(localDateTime == null){
                LocalDateTime.now()
            }else{
                localDateTime
            }
        */

        return temp.format(DateTimeFormatter.ofPattern("yyyy MM dd"))
    }
}

class DateTimeUtil{

    private val KST_FORMAT = "yyyy년 MM월 dd일 HH시 mm분 ss초"

    fun localDateTimeToString(
        localDateTime: LocalDateTime? = LocalDateTime.now(),    //코틀린은 기본값을 설정하면 nullPoint에러에 유연하게 대응 가능
        pattern: String ?= KST_FORMAT
    ): String{
        return (localDateTime?: LocalDateTime.now()).format(DateTimeFormatter.ofPattern(pattern))
    }
}
