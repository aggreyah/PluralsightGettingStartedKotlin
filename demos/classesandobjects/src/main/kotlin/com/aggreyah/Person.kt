package com.aggreyah

interface Signatory  {
  fun sign()
}

open class Person(val name: String, var age:Int) : Signatory {
    override fun sign() = println("$name aged $age can sign documents.")
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val person = Person("Aggrey", 37)
            person.sign()
            person.age = 38
            person.sign()

            val user = User("Oluande", 1)
            println(user)
            //deconstruction
            val(name, id) = user
            println("User is $name and their id is $id.")
            val otheruser = user.copy(id = 34)
            println(otheruser)
        }
    }
}

class Student(name: String, age: Int) : Person(name, age)

data class User(val name: String, val id: Int)