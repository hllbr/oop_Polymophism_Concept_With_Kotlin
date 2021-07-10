package com.hllbr.ooppolymophism

class Dog : Animal() {
    fun Test(){
        println("Test")
        super.sing()
        //Super  anahtar kelimesi ile burda inheritance aldığım sınıfa referans veriyorum

    }
    override fun sing() {
        println("Dog Class")
    }
}