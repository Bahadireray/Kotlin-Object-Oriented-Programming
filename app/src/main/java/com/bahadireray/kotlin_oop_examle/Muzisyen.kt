package com.bahadireray.kotlin_oop_examle


open class Muzisyen(name: String, instrument: String, age: Int) {
    /*
     Primary constructor tanımlaması
    Müzisyen diye bir sınıf oluşturuyoruz
    bu sınıfımızın özellikleri; Name,Enstrüman,Yaş gibi özelliklere sahip olacak
    Bu özellikleri sınırlayıp kullanımlarını nasıl belirleyeceğiz derse,
    değişkeni tanımlarken PRİVATE diye bir erişim belirliyoruz.
    PRİVATE nedir, erişime açmazsak sadece sınıf içerisinde ulaşabildiğimiz
    bir tanımlama şeklidir.
     */


    /*Encapsulation tanımlama Private olarak kısıtlayabiliriz peki sadece veriyi okumak
    Sadece veriye yazmaya izin vermek için diğer programlama dillerinde GET SETTER tanımlamaları
    Kullanarak değişiklik yapabiliyoruz ama Kotlinde bu işler biraz farklı bu "get set"
    kotlin tarafından otomatik olarak oluşturuluyor aslında ama nasıl kullanılıyor,
     */
    var name: String?= name
        private set
        get

    private var instrument: String?= instrument

    var age:Int?= age
        get
        private set

}