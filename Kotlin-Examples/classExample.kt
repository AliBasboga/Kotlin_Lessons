import kotlin.Int

class cars {
    var marka: String = ""
    var model: String = ""
    var yas: Int = 0

   var speed = if ((this.model == String()) && (this.marka == String()) && (this.yas == 0)) {
        println("200")
    }else{
        println("asasas")
    }

}

fun main(){
    val c1 = cars()
        c1.marka = "BMW"
        c1.model = "M5"
        c1.yas = 20225


    println(c1.model)
    println(c1.marka)
    println(c1.yas)
    
}

