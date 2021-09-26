package com.aggreyah

interface Signatory  {
  fun sign()
}

class Person : Signatory {
  override fun sign() = println("I can sign documents.")
}

fun main(args: Array<String>){
    val person = Person()
    person.sign()
}