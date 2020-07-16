package com.example.project1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testVariable()
        testButton()
        testIfExpression(txtInsert1.text.toString().toInt(), txtInsert2.text.toString().toInt())
        testWhen(txtInsert1.text.toString().toInt())
        testFor()
    }

    private fun testFor() {
        var collection = arrayListOf<Int>(1,2,3,4)
        for (item in collection) {
            println(item)
        }
    }

    // look like switch case
    private fun testWhen(variable1: Int) {
        when (variable1) {
            1 -> print("variable = 1")
            2 -> print("variable = 2")
            else -> { //Note the block
                print("x is neither 1 or 2")
            }
        }
    }

    private fun testIfExpression(variable1: Int, variable2: Int) {
        val max = if (variable1 > variable2) variable1 else variable2
    }

    private fun testButton() {
        btnKiemTra.setOnClickListener {
            txtResult.setText(
                testFun(
                    (txtInsert1.text.toString()).toInt(),
                    (txtInsert2.text.toString()).toInt()
                ).toString()
            )
        }
    }

    private fun testFun(variable1: Int, variable2: Int) = variable1 + variable2

    private fun testVariable() {
        var str: String = ""
        var str2: String = str.toUpperCase()
        var str3 = true
        var str4 = 0x00f
        var str5 = 0.05f
    }

    private fun sum(variable1: Int, variable2: Int): Int {
        return variable1 + variable2
    }

    private fun checkDatatype(objects: Any?): String {
        if (objects is String) {
            return "This is my ass"
        } else if (objects is Int) {
            return "this is my mount"
        } else if (objects is Char) {
            return "this is my nose"
        } else {
            return "Noooo"
        }
    }
    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }
    fun testFor1(){
        var arrayList = arrayListOf<Int>(1,2,3,4)
        for (item in arrayList) println(item)
    }
    fun testFor3(){
        for (item in 2..6 step 2){
            println(item)
        }
    }
    fun testFor2(){
        var arrayList2 = arrayListOf<Int>(1,2,3,4)
        for(item: Any in arrayList2){
            println(item)
        }
    }
}
