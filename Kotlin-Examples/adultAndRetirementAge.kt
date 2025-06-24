fun main() {
   println("Yaşınızı Giriniz :")
   val yas = readLine()?.toIntOrNull() 
    
    if(yas != null) {
    yas >= 18
    println("Şuan $yas Reşitsin")
   }else{
    println("Reşit değilsin")
   }
   
     if(yas != null){
       val emekli  = 65 - yas
        println("emekli olma yaşınız $emekli")
    }else{
        println("hatalı")
    }
}
