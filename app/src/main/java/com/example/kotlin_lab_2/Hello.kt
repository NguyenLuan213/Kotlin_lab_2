import java.util.*


//fun main(args: Array<String>) {
//    println("Hello, ${args[0]}")
//
//    val isUnit = println("Anh ấy bị gay")
//    println(isUnit)
//
//    val temperature = 10
//    val isHot = if (temperature > 50) true else false
//    println(isHot)
//
//    val tmp = 10
//    val message = "Nhiệt độ nước ${ if(tmp >40) "quá nóng" else "bình thường" }."
//    println(message)
//}
fun ngayAn() {
    val ngay = randomDay()
    val doAn = "cơm"
    println ("Hôm nay $ngay tôi ăn $doAn")
}

fun randomDay(): String {
    val ngay = arrayOf("Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy", "Chủ nhật")
    return ngay[Random().nextInt(ngay.size)]
}
fun thucAn (ngay :String) :String{
//    var doAn = ""
    //var doAn: String
    //tương tự swich
    return when(ngay){
        "Thứ hai" -> "cá"
        "Thứ ba" -> "tôm hùm"
//        "Thứ ba" -> doAn = "tôm hùm"
//        "Thứ tư" -> doAn = "hàu"
//        "Thứ năm" -> doAn = "dưa leo"
//        "Thứ sáu" -> doAn = "cơm cuộn"
//        "Thứ bảy" -> doAn = "xà lách"
        "Chủ nhật" ->  "muối"
        else ->"không khí"
    }
    //return doAn
}
fun anGi(){
    val ngay = randomDay()
    val thucAn = thucAn(ngay)
    println("Hôm nay $ngay tôi ăn $thucAn")
}
fun main(args: Array<String>) {
    ngayAn()
    anGi()
}