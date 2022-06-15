package com.example.study_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.study_kotlin.databinding.ActivityMainBinding

class SubActivity : AppCompatActivity() {
    //전역단에 바인딩 객체를 선언
    private var mBinding : ActivityMainBinding? = null
    //null 체크 편의성을 위한 바인딩 변수 재선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        //액티비티를 생성하게 되면 ()안에 있는 객채를 가지고
        //액티비티를 중단히게 되면 savedInstanceState 메서드를 호출하여 데이터를 임시저장
        //그리고 다시 동작을 하게 되면 저장된 데이터를 가지고 다시 액티비티를 생성한다.
        //ex) 핸드폰을 가로모드와 세로모드 사용시 단순히 화면이 돌아가는 것이 아닌
        //가로에서 세로모드로(반대포함) 전환시 onCreate 함수가 다시 호출 되며 사용하고 있던 데이터를 유지함

        //Bundle은 여러타입을 저장하는 Map클래스
        //액티비티간 데이터를 주고 받을때 Bundle클래스를 사용해 데이터를 전송

        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sub) // xml 화면 뷰를 연결

        viewBinding()

        //기존 접근 -> 오류
//        TextView textview = findViewById(R.id.myTextView)
//        textview.setText("~~")

//        //코틀린 접근
//        val myText : TextView = findViewById(R.id.myTextView)
//        myText.text = "Kotlin findView Test" //컨트롤 클릭을 통해 setText()임을 확인 할 수 있음
    //          kotilin-android-extensions을 더이상 제공하지 않을 예정이기에 ViewBinding을 권장하고 있음
        // 뷰결합 -> findViewById를 대체함

        //build.gradle에 추가하여 viewbinding 사용
        //  buildFeatures {
        //        viewBinding true
        //    }
   }

    private fun viewBinding(){
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun print(){
        print("값을 입력하세요")
        val input = readLine()

        print("값은 :${input}")
    }
}