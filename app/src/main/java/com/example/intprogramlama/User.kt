package com.example.intprogramlama

class User {

    var id:Int = 0
    var name:String = ""
    var apName:String = ""
    var daNo:Int = 0
    var phone:Int = 0
    var email:String = ""

    constructor(name:String, apName:String, daNo:Int,  phone:Int, email:String){
        this.name = name
        this.apName = apName
        this.daNo = daNo
        this.phone = phone
        this.email = email
    }
}