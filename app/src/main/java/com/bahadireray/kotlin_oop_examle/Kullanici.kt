package com.bahadireray.kotlin_oop_examle

class Kullanici : Insanlar{

    //Kotlin'de ilk değer olarak bir NuLL atama yapmamız gerekiyor
    //Property, kullanıcı sınıfımızın sahip olabileceği değerleri tanımladık
    var name: String?=null
    var age: Int?=null

    // Constructor vs Init

    /*içerisinde sınıfımızın istediğimiz girdileri alıp
    Onlarlar işlemler yapacağız
     */

    constructor(nameInput:String,ageInput:Int){
        /*This kullanımı genelde bir üstteki kaplayan sınıfa referans eder.
        Buradaki this kullanımı KULLANICI sınıfına referans ediyor
         */
        this.name=nameInput
        this.age=ageInput
        /*
       Bu ne işe yarıyor, Artık Kullanıcı sınıfı çağrıldığında
       Bizden bir NameInput ve AgeInput değişkeni tanımlamamızı isteyerek işlem yap demektir.
         */
    }
    init {
        println("Inıt fonksiyonu otomatik çağrılıyor")
    }
}