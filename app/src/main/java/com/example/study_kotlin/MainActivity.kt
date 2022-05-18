package com.example.study_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.study_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //gradle 에 viewBinding 추가
    //private var mBinding : ActivityMainBinding? = null // 바인딩 객체 선언
    private var mBinding : ActivityMainBinding? = null
    //구현부에서 null safety로 처리할건지 아닌지 계속 물어봄\
    //null 발생시 nullPointerException을 발생 시키려고
    private val binding get() = mBinding!!  //null 체크


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding()

        btnclick()

        //var a : String? = null
        lateinit var a : String

        binding.btn2.setOnClickListener {
            binding.text2.text = "머임"

        }
    }
    private fun viewBinding() : Unit{
        mBinding = ActivityMainBinding.inflate(layoutInflater) //xml 붙힘
        setContentView(binding.root) //생선한 루트 ㅂ ㅠ 붙힘
        //같은 layout id 넘겨주면 inflater 두 번 발생함
        //xml을 감싸는 최상단 부모를 root라는 property로 제공
        //반드시 binding 객체의 root를 넘겨줘야함
    }



    private fun btnclick() : Unit {
        binding.btn.setOnClickListener {
            binding.text.text = "가고싶다고 집에"

            binding.btn2.setOnClickListener {
                binding.text2.text = "이거 여기에 추가하면 생김?"
            }
        }
    }


}


