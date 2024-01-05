package ex04

fun main() {

    //java Object == Any
    //기본적으론 불변형태
    val map = mapOf<String, Any>(
        Pair("", ""),
        "key" to "value"
    )

    //가변형태의 map
    val mutableMap = mutableMapOf<String, Any>(
        "key" to "value"
    )

    //mutableMap.put("key", "value")
    mutableMap["key"] = "value"

    //val value = mutableMap.get("key")
    val value = mutableMap["key"]

    //hashMap도 같음

    //값을 세가지를 가지는 객체
    var triple = Triple<String, String, String>(
        first = "",
        second = "",
        third = ""
    )
}