package com.example.study_kotlin

//엔트리 함수 ->
fun main() {
    helloWorld()
    add(4,5)

    //3. String Template
    val name = "subin"
    val lastName = "Yun"
    println("My name is ${name + lastName} I'm 28")
    println("is this true ${1==0}")
    println("this is 2\$a")

}

//. 함수 fun -> function의 준말
// Unit -> void의 개념 (리턴이 없을때) #코틀린은 타입 추론이 가능하기 때문에 생략이 가능함
fun helloWorld() : Unit{
    println("Hello World다 이말이야")
}

//1-1. 리턴 타입이 있는 경우, 파라미터가 있는 경우
//변수(이름 : 타입) : 리턴 타입 -> 대문자 명시(ex Int
//변수명을 타입보다 먼저 명시
//리턴 타입은 바디 직전에
fun add(a : Int, b : Int) : Int {
    return a+b
}

//2. val vs var
//val = value -> 바뀌지 않는 값을 의미함 -> 상수
//var -> 재대입 가능
fun hi() {
    val a : Int = 10 //변할 수 없음
    //a = 100 다시 할당 할 수 없어서 오류가 발생함
    var b : Int = 9 //변할 수 있는 값
    b = 100
    val c : Int = 100
    var d = 200
    //추론때문에 둘다 사용가능 -> val과 var 구분


    var name2 : String = "subin"
    var name = "subin"
    //스트링을 자동으로 추론

    //바로 할당하지 않을 경우 선언
    // var e -> x
    var e : String
}














