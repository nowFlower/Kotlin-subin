package com.example.study_kotlin

import android.content.Context
import android.media.MediaPlayer

//주말에 본가다녀오느라 늦은 복습

//# Kotlin
//1. JVM 기반의 언어, 간결한 문법 제공
//2. NULL 안정성 제공  등등
//변수명을 먼저 쓰고 : 타입을 명시
fun main() : Unit { //Unit은 java의 void와 같음 (리턴타입이 없다는 의미로 생략이 가능함)
    println("Kotlin entry 함수")
}

//변수 초기화
//코틀린은 차후에 변수에 값을 저장하는 경우를 허용하지 않기 때문에 값이 빌 때는 null로,
//아닌 경우는 그에 맞는 타입으로 반드시 초기화 해야함함
// val vs var
//1. val(value)은 java = final 과 같은 상수를 의미
//한 번 값이 할당 되면 재할당 할 수 없음
//불변이(immutable) 변경되지 않아야 하는 값들에 사용

//#. 지연초기화(lateinit과 lazy)
//모든 변수를 같은 시점에 사용하지 않고 한참 뒤에나 사용하는 경우가 있을 수 있음
//이때 사용하는 방법

//lateint var 변수명 : 타입
//var 프로퍼티만 가능
//non-null 프로퍼티만 가능
//primitive type에 적용 x -> int, Boolean, Double등 기본적인 타입을 의미함
//get~setter 정의 불가
    lateinit var test : String
//변수가 초기화 되었는지 확인 후 사용해야함 -> :: 콜론 두개를 통해서 접근이 가능함
    //초기화를 하지 않고 사용시 오류가 발생

//lazy
//val 변수명 : 타입 by lazy {초기화코드}
//lazy역시 lateinit과 같은 역할을 하는데 파라미터를 람다식으로 받고,
//Lazy<T> 인스턴스를 반환하는 함수 형태를 띔
//val 프로퍼티만 가능
//non-null, nullable 모두 가능
    //호출시점에서 최초 1회 초기화가 진행이 됨 -> 호출시점에서 초기화가 되기때문에 늦은 초기화
   // val test2 : String by lazy { }
//    private val mediaPlayer : MediaPlayer by lazy {
//        MediaPlayer.create(this, R.raw.bts_dynamite)
//}



//2. var은 값이 할당 되더라도
// 재할당이 가능함 변이(mutable) 값으로 값을 변경할 수 있음

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
//코틀린의 경우 if Expression이 있어서 if-else에서 결정된 갑승ㄹ 바로 변수에 대입할 수 있음
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

fun testif3() {
    val res : Int
    var n : Int = 10
    if(n==10) {
        res = 1
    }else {
        res = 0
    }
    println(res)
}
//res를 선언과 동시에 초기화 하지 않음
//1. var로 선언과 동시에 초기화하고 if-else에서 값을 넣으면 그것 역시 초기화로 인지하여 경고문이 뜸
//2. val의 경우는 불변의 값을 변경하려고 하는 경우이기 때문에 컴파일 오류가 발생
fun testif4() {
    var n : Int = 10
    var res = if(n==10) 1 else 0 //{ 1 } else { 0 }
    println(res)
}
//if 표현식을 사용하여 조건에 해당 값을 바로 변수에 할당 ▲

//2. switch case -> when
//break;가 필요하지 않음 -> { }로 범위를 지정해줄 수 있음
//when에서의 else는 switch문의 default:와 동일한 역할을 함
fun testCheckNum(score : Int) {
    when(score) {
        0 -> println("test is 0")
        1 -> println("test is 1")
        2,3,4 -> println("test is 2,3,4")
        //복수를 조건으로 내새울 수 있음
    }
}

fun testCheckNum2() {
    var n : Int = 10
    when(n) {
        in 1..3 -> println("1~3")
        4 -> println("4")
        //in 으로 값의 범위를 지정해주면 모든 조건이 아닐때 else를 명시해줘야함
        else -> println("else")
    }
}
//when 표현식
fun testCheckNum3(){
    var n : Int = 10
    var res = when(n) { 10-> 1 else -> 2}
    println(res)
}


