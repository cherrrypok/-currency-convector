package com.example.win

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val const_RUB: Float = 69.68F
        val const_USD: Float = 1.0F
        val const_GBP: Float = 0.79F
        val const_EUR: Float = 0.88F
        val const_UAH: Float = 26.6F
        val const_JPY: Float = 107.27F

        var summ1: Float = 100.0F
        var summ2: Float = summ1 / const_RUB
        var input_currency: Float = const_RUB
        var output_currency: Float = const_USD

        currency_input.setText("Russian Ruble (RUB)")
        currency_output.setText("United States Dollar (USD)")
        amount_output.text = summ2.toString()

        fun chech(): Boolean {
            if (input_currency == output_currency) {
                amount_output.text = amount_input.text.toString().toFloat().toString()
                return false
            }
            return true
        }

        fun chech2(str: String): Boolean {
            if (str.toFloatOrNull() == null) {
                amount_output.text =
                    "Oшибка. Введенные данные не являются числом. Повторите попытку."
                return false
            }
            return true
        }

        fun RUB_input_click(v: View) {
            currency_input.setText("Russian Ruble (RUB)")
            input_currency = const_RUB
            if (chech2(amount_input.text.toString()) && chech()) {
                amount_output.text = (amount_input.text.toString()
                    .toFloat() / input_currency * output_currency).toString()
            }
        }

        fun RUB_output_click(v: View) {
            currency_output.setText("Russian Ruble (RUB)")
            output_currency = const_RUB
            if (chech2(amount_input.text.toString()) && chech()) {
                amount_output.text = (amount_input.text.toString()
                    .toFloat() / input_currency * output_currency).toString()
            }
        }

        fun USD_input_click(v: View) {
            currency_input.setText("United States Dollar (USD)")
            input_currency = const_USD
            if (chech2(amount_input.text.toString()) && chech()) {
                amount_output.text = (amount_input.text.toString()
                    .toFloat() / input_currency * output_currency).toString()
            }
        }

        fun USD_output_click(v: View) {
            currency_output.setText("United States Dollar (USD)")
            output_currency = const_USD
            if (chech2(amount_input.text.toString()) && chech()) {
                amount_output.text = (amount_input.text.toString()
                    .toFloat() / input_currency * output_currency).toString()
            }
        }

        fun GBP_input_click(v: View) {
            currency_input.setText("Great Britain Pound (GBP)")
            input_currency = const_GBP
            if (chech2(amount_input.text.toString()) && chech()) {
                amount_output.text = (amount_input.text.toString()
                    .toFloat() / input_currency * output_currency).toString()
            }
        }

        fun GBP_output_click(v: View) {
            currency_output.setText("Great Britain Pound (GBP)")
            output_currency = const_GBP
            if (chech2(amount_input.text.toString()) && chech()) {
                amount_output.text = (amount_input.text.toString()
                    .toFloat() / input_currency * output_currency).toString()
            }
        }

        fun EUR_input_click(v: View) {
            currency_input.setText("Euro (EUR)")
            input_currency = const_EUR
            if (chech2(amount_input.text.toString()) && chech()) {
                amount_output.text = (amount_input.text.toString()
                    .toFloat() / input_currency * output_currency).toString()
            }
        }

        fun EUR_output_click(v: View) {
            currency_output.setText("Euro (EUR)")
            output_currency = const_EUR
            if (chech2(amount_input.text.toString()) && chech()) {
                amount_output.text = (amount_input.text.toString()
                    .toFloat() / input_currency * output_currency).toString()
            }
        }

        fun UAH_input_click(v: View) {
            currency_input.setText("Ukraine Hryvnia (UAH)")
            input_currency = const_UAH
            if (chech2(amount_input.text.toString()) && chech()) {
                amount_output.text = (amount_input.text.toString()
                    .toFloat() / input_currency * output_currency).toString()
            }
        }

        fun UAH_output_click(v: View) {
            currency_output.setText("Ukraine Hryvnia (UAH)")
            output_currency = const_UAH
            if (chech2(amount_input.text.toString()) && chech()) {
                amount_output.text = (amount_input.text.toString()
                    .toFloat() / input_currency * output_currency).toString()
            }
        }

        fun JPY_input_click(v: View) {
            currency_input.setText("Japanese Yen (JPY)")
            input_currency = const_JPY
            if (chech2(amount_input.text.toString()) && chech()) {
                amount_output.text = (amount_input.text.toString()
                    .toFloat() / input_currency * output_currency).toString()
            }
        }

        fun JPY_output_click(v: View) {
            currency_output.setText("Japanese Yen (JPY)")
            output_currency = const_JPY
            if (chech2(amount_input.text.toString()) && chech()) {
                amount_output.text = (amount_input.text.toString()
                    .toFloat() / input_currency * output_currency).toString()
            }
        }

        RUB_input.setOnClickListener(::RUB_input_click)
        RUB_output.setOnClickListener(::RUB_output_click)

        USD_input.setOnClickListener(::USD_input_click)
        USD_output.setOnClickListener(::USD_output_click)

        GBP_input.setOnClickListener(::GBP_input_click)
        GBP_output.setOnClickListener(::GBP_output_click)

        EUR_input.setOnClickListener(::EUR_input_click)
        EUR_output.setOnClickListener(::EUR_output_click)

        UAH_input.setOnClickListener(::UAH_input_click)
        UAH_output.setOnClickListener(::UAH_output_click)

        JPY_input.setOnClickListener(::JPY_input_click)
        JPY_output.setOnClickListener(::JPY_output_click)

        amount_input.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (chech2(amount_input.text.toString())){
                    amount_output.text = (amount_input.text.toString()
                        .toFloat() / input_currency * output_currency).toString()
                }
            }
        })
    }
}

//RUB USD GBP EUR UAH JPY

