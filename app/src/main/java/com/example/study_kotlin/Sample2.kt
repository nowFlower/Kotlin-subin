package com.example.study_kotlin

fun main() {
    checkNum(1)

}

//1. 조건식
fun maxBy(a : Int, b : Int) : Int {
    if(a>b) {
        return a
    }else {
        return b
    }
}
//다른 방식 (위와 같음)
fun maxBy2(a : Int, b : Int) = if(a>b) a else b
//코틀린 3항 연산자가 없음 -> 위처럼 사용

fun checkNum(score : Int) {//: Unit { //문장으로 쓰였음
    when(score) { //when -> switch와 같음
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3") //복수로 조건 인정
        else -> println("I don't know") //function의 경우 else 생략 가능
    }

    //when 다른 방식
    var b = when(score) { //Expression 값
        1-> 1
        2-> 2
        //리턴식으로 사용 가능 -> 반드시 else를 적용해야함
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("90~100")
        in 10..80 -> println("10~80")
        else -> println("80~90")
    }

    lateinit var text : String
    //나중에 초기화

    var a : String? = null
    //null 지양 -> Kotlin

    lateinit var aa : String

    var test : Int = 30

    aa = "test : ${test}"
    println(aa)

    var test2 : Int = 50

    aa = "test : ${test + test2}"
    println(aa)

    println("${1==0}")


}

// Expression vs Statement -> 값 : 문장의 느낌 
//코틀린 함수는 Expression : Unit -> 리턴 값이 없더라도 Unit을 반환함
//자바의 void의 경우 Statement


//어우 뭐 오랜만에 보니까 뭐라는건지 모르겠네
