package ex01

fun main(){

    //kotlin은 클래스명을 똑같이 제시하지 않아도 main으로 인식가능
    //kotlin에서 변수선언
    // var = mutable(가변) / val = final immutable(불변)

    //: [타입] = 초기화
    val name: String = "홍길동"
    var _name: String = "홍길동"
    val n = "홍길동"

/*  [JAVA]
    String name = "홍길동";
    String msg = "사용자의 이름은: %s";
    String rst = String.format(msg, name);
    System.out.println(rst);    //사용자의 이름은: 홍길동 */

    println("사용자의 이름은 : $name")

    //조건식있을때
    println("사용자의 이름은 : ${if(true) name else null }")

    var i = 10

    //java와 다르게 int와 Integer구별하지 않는다. primitive 타입이 기본 => 모든 것이 객체로 관리
    var _i: Int = 10

    var d: Double = 20.0
    var f: Float = 10f

    var b: Boolean = true

}