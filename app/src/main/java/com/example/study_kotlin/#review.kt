package com.example.study_kotlin

//주말에 본가다녀오느라 늦은 복습

//# Kotlin
//1. JVM 기반의 언어, 간결한 문법 제공
//2. NULL 안정성 제공  등등
//변수명을 먼저 쓰고 : 타입을 명시
fun main() : Unit { //Unit은 java의 void와 같음 (리턴타입이 없다는 의미로 생략이 가능함)
    println("Kotlin entry 함수")
}

// val vs var
//1. val(value)은 java = final 과 같은 상수를 의미
//한 번 값이 할당 되면 재할당 할 수 없음

//2. var은 값이 할당 되더라도
// 재할당이 가능함

fun testvalorvar() {
    val a : Int = 100
    //a = 200 //재할당 할 수 없어 오류가 발생
    var b : Int = 100
    b = 200
    //var의 경우는 오류가 발생하지 않는다.
    var c = 200
    //타입을 추론하기 때문에 Int를 명시하지 않아줘도 선언이 가능함
    var d : Int
    var e : String
    e = "test"
    val name : String
    name = "Subin"
    println("test name is ${name}")
    //스트링 템플릿 사용
}

//조건문
//1. if
//기본적인 사용 방법
fun testif(a: Int, b : Int) : Int {
    if (a > b) {
        return a
    }else {
        return b
    }
}
//java의 삼항연산자와 비슷한 방법으로 사용하기
fun testif2(a : Int, b : Int) = if (a>b) a else b



