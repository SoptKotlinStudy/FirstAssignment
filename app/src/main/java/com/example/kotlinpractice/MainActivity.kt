package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.util.stream.IntStream.range
import kotlin.random.Random

/*
    코틀린 스터디 1차 과제입니다
    위의 주석을 확인하셨다면
    갠톡으로 "확인했어용"라고 보내주세용
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var chance = 10
        //1000부터 9999까지의 숫자중 하나를 뽑을 수 있는 랜덤 객체입니
        val random : Int = (1000..10000).random()
        //숫자를 String으로 형변환합니다
        val randomString = random.toString()
        Log.d("answer", randomString)

        // 버튼의 기능을 부여해주는 Click Listener입니다
        btn_input.setOnClickListener{
            // EditText내의 Text를 변수에 저장합니다
            val etText = et_input.editableText.toString()

            // 아래부터 빈 곳을 코딩해주시면 됩니다
            if(etText == randomString){
                Log.d("answer", "정답입니다")
                //어다 플리케이션 종료 코드입니
                ActivityCompat.finishAffinity(this)
            }
            else {
                Log.d("answer", "아닙니다")
                Log.d("answer", "남은 기회는 ${--chance}")
                /*
                이 곳에 들어갈 코드를 코딩하세요!
                 */
            }
            // chance가 0이 되면 어플리케이션이 종료가 될 수 있게 코딩해주세요
        }
    }
}