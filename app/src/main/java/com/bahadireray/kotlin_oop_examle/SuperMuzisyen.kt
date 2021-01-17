package com.bahadireray.kotlin_oop_examle

class SuperMuzisyen(name: String, instrument: String, age: Int) : Muzisyen(name, instrument, age) {

    //Muzisyen sınıfımızdan mirasımızı aldık :)
    fun yetenek(){
        println("Rock Müzik yapabiliyor")
    }

}