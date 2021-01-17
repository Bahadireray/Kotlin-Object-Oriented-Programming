package com.bahadireray.kotlin_oop_examle

class Arabalar : Lastikler, Kapılar {
    //İnterface Kullanarak iki farklı soyut sınıftan objeler üretebildik.
    var marka: String?=null
    override fun summer() {
        println("Yazlık lastiklerin hazır")
    }

    override fun snow() {
       println("Kışlık lastiklerin Hazır")
    }

    override fun hatchback() {
        println("3 kapılı spor araban hazır")
    }

    override fun stationWagon() {
        println("4 kapılı aile araban hazır")
    }

}