package com.example.assignment31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener {
            var a = 0
            var nn1 = n1.text.toString()
            var nn2 = n2.text.toString()
            if (nn2 == "" || nn1 == "") {
                Toast.makeText(applicationContext,"input num 1 and num 2",Toast.LENGTH_SHORT).show()
            } else {
                var n01 = nn1.toInt()
                var n02 = nn2.toInt()
                a = n01 + n02
                var b = a.toDouble()
                res.setText(b.toString())
                m1.setText("+")
            }
        }

        minus.setOnClickListener {
            var a = 0
            var nn1 = n1.text.toString()
            var nn2 = n2.text.toString()
            if (nn2 == "" || nn1 == "") {
                Toast.makeText(applicationContext,"input num 1 and num 2",Toast.LENGTH_SHORT).show()
            } else {
                var n01 = nn1.toInt()
                var n02 = nn2.toInt()
                a = n01 - n02
                var b = a.toDouble()
                res.setText(b.toString())
                m1.setText("-")
            }
        }

        multiply.setOnClickListener {
            var a = 0
            var nn1 = n1.text.toString()
            var nn2 = n2.text.toString()
            if (nn2 == "" || nn1 == "") {
                Toast.makeText(applicationContext,"input num 1 and num 2",Toast.LENGTH_SHORT).show()
            } else {
                var n01 = nn1.toInt()
                var n02 = nn2.toInt()
                a = n01 * n02
                var b = a.toDouble()
                res.setText(b.toString())
                m1.setText("*")
            }
        }

        divider.setOnClickListener {
            var a = 0
            var nn1 = n1.text.toString()
            var nn2 = n2.text.toString()
            if (nn2 == "" || nn1 == "") {
                Toast.makeText(applicationContext,"input num 1 and num 2",Toast.LENGTH_SHORT).show()
            } else {
                var n01 = nn1.toInt()
                var n02 = nn2.toInt()
                a = n01 / n02
                var b = a.toDouble()
                res.setText(b.toString())
                m1.setText("/")
            }
        }

        modulo.setOnClickListener {
            var a = 0
            var nn1 = n1.text.toString()
            var nn2 = n2.text.toString()
            if (nn2 == "" || nn1 == "") {
                Toast.makeText(applicationContext,"input num 1 and num 2",Toast.LENGTH_SHORT).show()
            } else {
                var n01 = nn1.toInt()
                var n02 = nn2.toInt()
                a = n01 % n02
                var b = a.toDouble()
                res.setText(b.toString())
                m1.setText("%")
            }
        }

        clear.setOnClickListener {
            n1.setText("")
            m1.setText("")
            n2.setText("")
            res.setText("")
        }
    }
}