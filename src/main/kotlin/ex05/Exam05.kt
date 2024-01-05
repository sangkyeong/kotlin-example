package ex05

import java.util.function.Predicate

fun main(){
    //고차함수
    var numberList = listOf<Int>(1,2,3,4,5)

    val pred =  object : Predicate<Int>{
        override fun test(t: Int): Boolean {
            return t % 2 == 0
        }
    }
    //람다식 => val pred = Predicate<Int> { t -> t % 2 == 0 }

    numberList.stream().filter(pred)


    //pred안쓰고 다른방식 => numberList.filter { it % 2 == 0 }


    val add = fun(x: Int, y: Int): Int{
        return x+y
    }
    println(add)

    //val add = { x: Int, y: Int -> x + y}
    //println(add(2,3))

    //function 사용
    lammda(4,5, add)
}

fun lammda(x: Int, y:Int, method: (Int, Int) -> Int){
    println(method(x,y))
}
