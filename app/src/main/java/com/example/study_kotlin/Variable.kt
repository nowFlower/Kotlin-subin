package com.example.study_kotlin

//엔트리 함수
fun main() {

    println(add(4, 3))
}

fun HelloWorld() : Unit{ //Unit -> void 역할(리턴 값이 없다면 생략이 가능함)
    println("wow..")
}

//두 수를 입력 받아 더해주는 메소드
//변수명을 먼저 입력 후 : 타입을 적어준다
//리턴 값이 있을 경우 () : 타입을 명시
fun add(a : Int, b : Int) : Int{ //
    return a+b
}

// 변수명을 타입보다 먼저 명시
// 리턴 타입은 인수이후 바디 직전에 명시

//val & var
//val = value -> (상수) 변하지 않는 값
//var = 변할 수 있음
fun test() {
    val a : Int = 10
    var b : Int = 9

    //오류 a = 100
    b = 100 //재대입 가능

    //자동으로 타입 추론을 해주기 때문에
    val c : Int = 100
    val d = 100  //Int 생략이 가능
    var e = 100 //var와 val 모두 가능함
    //String 추론
    var name : String = "Subin"
    var name2 = "Yoon"
    //변수에 바로 값을 할당하지 않을 경우는
    //var f 오류
    var f : String // 타입을 선언 해줘야함
}

//String Template
fun TemplateTest() {
    val name = "Subin"
    val point : Int = 100
    println("my name is $name")  //$표시를 사용하여 변수명을 입력해 출력이 가능함
    //$변수명뒤 뛰어쓰지 않으면 함께 변수명으로 인식하여 오류가 날 수 있음
    println("my name is ${name}I'm a 98") //${ 변수명 } -> 대괄호안은 모두 변수로 인식함
    val lastNaem = "Yoon"
    println("my name is ${name + lastNaem} I'm a 77") // { + }로 이어갈 수 있음
    //ex
    println("is this true? ${1==2}")
    println("this is 2\$a") // '\'입력후 $를 사용하면 문자로 인식함
    println("point : ${point}")
}






