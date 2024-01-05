package ex07

data class User (
    //Getter, Setter자동 생성
    var name: String?=null,
    var age: Int?=null,
    var email: String?=null
){
//data class로 만들면 toString안해도 자동으로 됨
//    override fun toString(): String {
//        return "User(name=$name, age=$age, email=$email)"
//    }
}