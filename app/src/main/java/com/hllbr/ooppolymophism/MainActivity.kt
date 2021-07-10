package com.hllbr.ooppolymophism

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Polymorphism = aynı ismi kullanarak farklı işlemler yapabilme özelliği olarak tanımlanabilir.
        aynı metodlar ile farklı sonuçlar elde etmek
        Static polmorphism
        farklı sınıflarla aynı sonuçalara ulaşmak olarak tarif edebiliriz
        Dynamic polmorphism
         */




        //1)Static polmorphism =

        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(5,6))
        println(mathematics.sum(5,6,7))

        //Dynamic Polymorphism =

        var animal = Animal()
        animal.sing()
        var doge = Dog()
        doge.Test()
        doge.sing()
    }

}