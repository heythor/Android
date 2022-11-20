package com.projetos.txoza

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCalculate = findViewById<Button>(R.id.calculate_button)
        result = findViewById<TextView>(R.id.txt_result)

        
        buttonCalculate.setOnClickListener() {

            val newResult = calculate()
            result.text = "${newResult}"
            result.visibility = View.VISIBLE
        }
    }



    private fun operations(): String {

        var resultOperatio: String
        val operatorSelected = findViewById<RadioGroup>(R.id.radioGroup_operators)
        val checked = operatorSelected.checkedRadioButtonId
        when (checked) {
            R.id.radio_sum ->  resultOperatio = "Soma"
            R.id.radio_subtraction ->  resultOperatio = "Subtração"
            R.id.radio_multiplication ->  resultOperatio = "Multiplicação"
            R.id.radio_division ->  resultOperatio = "Divisão"
            else ->  resultOperatio = "Operação não selecionada"
        }
        return resultOperatio
    }

    private fun calculate (): String  {
        val input1 = findViewById<EditText>(R.id.editText_input1).text
        val input2 = findViewById<EditText>(R.id.editText_input2).text
        val value1 = input1.toString()
        val value2 = input2.toString()
        val num1 = value1.toInt()
        val num2 = value2.toInt()


        var resultCalculate: Int?

        when(operations()) {
            "Soma" -> { resultCalculate = num1 + num2 }
            "Subtração" -> { resultCalculate = num1 - num2 }
            "Multiplicação" -> { resultCalculate = num1 * num2 }
            "Divisão" -> {resultCalculate = num1 / num2 }
            else -> resultCalculate = null
        }
        val resultOperation = "O resultado é: ${resultCalculate}"
        return resultOperation
    }
}
