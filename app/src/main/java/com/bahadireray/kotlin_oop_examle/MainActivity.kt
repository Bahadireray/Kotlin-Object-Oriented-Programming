package com.bahadireray.kotlin_oop_examle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.E

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Tanımladığımız değişkene erisebilmek için bir atama yapıyoruz.
           Daha sonra bu değişkenin değerlerine erişim sağlabiliriyoruz.

        var mykullanici= Kullanici()
        mykullanici.name="Bahadır"
        mykullanici.age=24

        System.out.println("Kullanıcı ${mykullanici.name}"+" Yaşı ${mykullanici.age}" )

         */

/*
  var mykullanici= Kullanici("Bahadır",24)

        var bahadir=Muzisyen("Bahadir","Gitar",24)
        println(bahadir.age.toString())


 */

        /*
        var eray = SuperMuzisyen("Eray","Klarnet",25)
        println(eray.name)
        println(eray.yetenek())

         */


        /*
        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(2, 3))
        println(mathematics.sum(2, 4, 5))

         */

        /*

        var kullanici=Kullanici("Eray",15)
        println(kullanici.bilgi())
 */


        var aileArabalar = Arabalar()
        aileArabalar.marka="HARİKA"
        aileArabalar.stationWagon()
        println(aileArabalar.marka)
    }
}