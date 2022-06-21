package com.example.study_kotlin

fun main() {
    checkNum2(1)
    maxBy(5,7)
}

//조건문
//1. if
//ex 어떤 수가 더 큰지 비교하는
fun maxBy(a : Int, b : Int) : Int {

    //기본적인 방법
    if(a > b) {
        println(a)
        return a

    }else {
        println(b)
        return b

    }
}
//조금더 수월한 방법
//java의 삼항연산자와 비슷함
//return (a>b) ? a : b
fun maxBy2(a : Int, b :Int ) = if(a>b) a else b

//2. when -> Switch
fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        //복수 조건 인정함
        2,3 -> println("this is 2 or 3")
        4,5,6,7 -> println("this is 4~7")
        //fun의 경우는 else를 명시하지 않아도됨
        //else -> println("I don't know")
    }
    when(score) {
        in 90..100 -> println("good")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}
//2-1 when 다른 경우
fun checkNum2(score: Int) {
    var point = when(score) {
        1-> 4
        2-> 2
        //return 식으로 사용할 경우 else를 명시해야함(모든 조건이 아닐 수 있기 때문
        else -> 3
    }
    println("point : ${point}")
}

// Expression & Statement
// Expression => 값을 만들면 표현식 -> maxBy2
// 코틀린의 모든 함수는 Expression -> 왜냐하면 : Unit 을 리턴하고 있기 때문

// Statement => 값을 만들지 않고 실행하도록 문장으로 쓰임 -> chekcNum
// 자바의 void의 경우 Statement

//자바의 if문 Statement
//public int max(int a, int b) {
//    int max;
//
//    // statement
//    if( a > b ) {
//        max = a;
//    } else {
//        max = b;
//    }
//
//    max = a > b ? a : b;
//    return max;
//}

//1. fun max(a: Int, b: Int) : Int {
//  return if(a > b) a else b // expression
//}

//2. 삼항연산자 대처
//fun max(a: Int, b: Int) : Int = if(a > b) a else b // expression
//등호와 식으로만 이루어진 함수를 expression body function 이라고 함
//값을 만들어내는 식(Expression)은 컴파일시점에 컴파일러가 타입을 분석하여 추론하는 것이 가능함
//fun max(a : Int, b : Int) = if(a>b) a else b
//따라서, 반환타입을 명시하지 않아도 됨됨




