
fun main(){
    println("-----------------------------")
    var num = 5
    var num1 = 10
    println("num : $num num1 $num1")
    
    num = num1
    println("num : $num num1 $num1")
    println(num + num1)
    println(num - num1)
    println(num * num1)
    println(num / num1)
    println(num % num1)
    num1++
    println(num1)
    num1--
    println(num1)
    num1 += 1
    println(num1)
    num1 -= 1
    println(num1)
    
    if(num < num1){
        println("num1 num dan kÃ¼Ã§Ã¼k")
    }else if(num > num1){
        println("num num1 dan bÃ¼yÃ¼k")
    }else if(num <= num1){
        println("num1 num dan kÃ¼Ã§Ã¼k veya eÅitse")
    }else if(num >= num1){
        println("num num1 dan kÃ¼Ã§Ã¼k veya eÅitse")
    }else if(num == num1){
        println("num num1 eÅit")
    }else if(num != num1){
        println("num num1 eÅit deÄilse")
    }else{
        println("hata")
    }
    
    when(num1) {
        in 1..10 -> println("1 ile 10 Araasında")
        else -> println("hata")
    }
    
    
    for(i in 1..5) println("hello world")
    for(i in 5 downTo 1) println(i)
    for(i in 1..5 step 2) println(i)
    for(i in 5 downTo 1 step 2) println(i)
    
    (0..10).forEach{i -> println(i)}
    (10 downTo 1).forEach{i -> println(i)}
    (10 downTo 1 step 2).forEach{i -> println(i)}
    
     while(num < 100){
        num +=1
        println(num)
    }
    
    
     var username : String
    var sifre : Int 
    do {
        println("Kullancı Adı :")
        username = readLine().toString()
        
        println("Şifre :")
        sifre = readLine()?.toIntOrNull() ?: -1
    while(username != "kotlin" && sifre != 123) 
    println("Giriş başarılı") */
    
    val sayi = (1..100).random() 
    var tahmin: Int
    var sayac = 0

    println(" Tahmin Oyunu Başladı!")
    println("1 ile 100 arasında bir sayı tuttum. Bakalım kaç tahminde bulacaksın?")

    while (true) {
        print("Tahmininizi girin: ")
        val input = readLine()
        tahmin = input?.toIntOrNull() ?: continue 
        sayac++
        when {
            tahmin > sayi -> println("⬇️ Daha küçük bir sayı girin.")
            tahmin < sayi -> println("⬆️ Daha büyük bir sayı girin.")
            else -> {
                println("🎉 Tebrikler! $sayac tahminde doğru bildiniz. ")
                break
            }
        }
    }

    
    println("----------------------------")
}