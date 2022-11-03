package com.heeyjinny.viewbindingsetting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heeyjinny.viewbindingsetting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //build.gradle (:app)에 뷰 바인딩 설정 추가

    //자동변환 공식으로 레이아웃파일 생성 ActivityMainBinding
    //클래스로 변환된 바인딩의 inflate함수에 layoutInflater를 전달하여 초기화 하고 변수에 저장
    //함수에 전달되는 layoutInflater : MainActivity가 가지고 있음, 모든 Activity에서 호출 가능
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //변수에 저장된 바인딩의 root뷰를 setContentView에 전달
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        //바인딩을 도트 연산자(.)로 뷰(연결한 xml)의 id에 접근 후 사용
        binding.textView.text = "Hello"

    }

}











