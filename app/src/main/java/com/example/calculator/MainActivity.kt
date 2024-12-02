package com.example.calculator

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val listOfNumbers = listOf<String>("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
        val listOfMathActions = listOf<String>("+", "—", "×", "÷")

        //обработка кнопок циферок
        findViewById<TextView>(R.id.button_0).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (symb.toString() == ")")  addSymbol("×0,")
                    else if (symb.toString() == "0" && isDotAllowed(findViewById<TextView>(R.id.math_operation).text.toString()) == true) {}
                    else addSymbol("0")
                } else addSymbol("0")
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_1).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (symb.toString() == ")")  addSymbol("×1")
                    else if (symb.toString() == "0" && isDotAllowed(findViewById<TextView>(R.id.math_operation).text.toString()) == true) {}
                    else addSymbol("1")
                } else addSymbol("1")
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_2).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (symb.toString() == ")")  addSymbol("×2")
                    else if (symb.toString() == "0" && isDotAllowed(findViewById<TextView>(R.id.math_operation).text.toString()) == true) {}
                    else addSymbol("2")
                } else addSymbol("2")
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_3).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (symb.toString() == ")")  addSymbol("×3")
                    else if (symb.toString() == "0" && isDotAllowed(findViewById<TextView>(R.id.math_operation).text.toString()) == true) {}
                    else addSymbol("3")
                } else addSymbol("3")
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_4).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (symb.toString() == ")")  addSymbol("×4")
                    else if (symb.toString() == "0" && isDotAllowed(findViewById<TextView>(R.id.math_operation).text.toString()) == true) {}
                    else addSymbol("4")
                } else addSymbol("4")
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_5).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (symb.toString() == ")")  addSymbol("×5")
                    else if (symb.toString() == "0" && isDotAllowed(findViewById<TextView>(R.id.math_operation).text.toString()) == true) {}
                    else addSymbol("5")
                } else addSymbol("5")
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_6).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (symb.toString() == ")")  addSymbol("×6")
                    else if (symb.toString() == "0" && isDotAllowed(findViewById<TextView>(R.id.math_operation).text.toString()) == true) {}
                    else addSymbol("6")
                } else addSymbol("6")
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_7).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (symb.toString() == ")")  addSymbol("×7")
                    else if (symb.toString() == "0" && isDotAllowed(findViewById<TextView>(R.id.math_operation).text.toString()) == true) {}
                    else addSymbol("7")
                } else addSymbol("7")
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_8).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (symb.toString() == ")")  addSymbol("×8")
                    else if (symb.toString() == "0" && isDotAllowed(findViewById<TextView>(R.id.math_operation).text.toString()) == true) {}
                    else addSymbol("8")
                } else addSymbol("8")
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_9).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (symb.toString() == ")")  addSymbol("×9")
                    else if (symb.toString() == "0" && isDotAllowed(findViewById<TextView>(R.id.math_operation).text.toString()) == true) {}
                    else addSymbol("9")
                } else addSymbol("9")
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }

        //обработка кнопок действий
        findViewById<TextView>(R.id.button_open_bracket).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (listOfNumbers.contains(symb.toString()) || symb.toString() == ")")  addSymbol("×(")
                    else if (listOfMathActions.contains(symb.toString()) || symb.toString() == "(") addSymbol("(")
                } else addSymbol("(")
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_close_bracket).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val openBracketsCounter = findViewById<TextView>(R.id.math_operation).text.count { it == '(' }
                    val closeBracketsCounter = findViewById<TextView>(R.id.math_operation).text.count { it == ')' }
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (listOfNumbers.contains(symb.toString()) && openBracketsCounter > closeBracketsCounter)  addSymbol(")")
                }
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_division).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (listOfNumbers.contains(symb.toString()) || symb.toString() == ")")  addSymbol("÷")
                }
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_multiplication).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (listOfNumbers.contains(symb.toString()) || symb.toString() == ")")  addSymbol("×")
                }
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_minus).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (listOfNumbers.contains(symb.toString()) || symb.toString() == ")" || symb.toString() == "(")  addSymbol("—")
                } else addSymbol("—")
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_plus).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (listOfNumbers.contains(symb.toString()) || symb.toString() == ")")  addSymbol("+")
                }
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
        findViewById<TextView>(R.id.button_dot).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (listOfNumbers.contains(symb.toString()) && isDotAllowed(findViewById<TextView>(R.id.math_operation).text.toString()) == true) {
                        addSymbol(",")
                    }
                } else addSymbol("0,")
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }

        //обработка кнопки полного очищения
        findViewById<TextView>(R.id.button_ac).setOnClickListener {
            findViewById<TextView>(R.id.math_operation).text = ""
            findViewById<TextView>(R.id.math_result).text = ""
        }

        //обработка кнопки удаления символа
        findViewById<TextView>(R.id.button_back).setOnClickListener {
            var textik = findViewById<TextView>(R.id.math_operation).text.toString()
            if (textik.length != 0) {
                findViewById<TextView>(R.id.math_operation).text = textik.substring(0, textik.length - 1)
                findViewById<TextView>(R.id.math_result).text = ""
            }
        }

        //обработка кнопки равно
        findViewById<TextView>(R.id.button_compare).setOnClickListener {
            try {
                if (findViewById<TextView>(R.id.math_operation).text.isNotEmpty()) {
                    val symb = findViewById<TextView>(R.id.math_operation).text[findViewById<TextView>(R.id.math_operation).text.length-1]
                    if (listOfNumbers.contains(symb.toString()) || symb.toString() == ")"){
                        var text = findViewById<TextView>(R.id.math_operation).text.toString()
                        text = text.replace(",", ".")
                        text = text.replace("+", "+")
                        text = text.replace("—", "-")
                        text = text.replace("÷", "/")
                        text = text.replace("×", "*")

                        val ex = ExpressionBuilder(text).build()
                        val res = ex.evaluate()
                        if (res.toLong().toDouble() == res) findViewById<TextView>(R.id.math_result).text = res.toLong().toString()
                        else findViewById<TextView>(R.id.math_result).text = res.toString().replace(".", ",")
                    }
                }
            } catch (e: Exception) {
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }
    }

    //создание функции, которая добавляет символ, в строку, в зависимости от нажатой кнопки
    fun addSymbol(x: String) {
        if (findViewById<TextView>(R.id.math_result).text.isNotEmpty()) {
            findViewById<TextView>(R.id.math_operation).text = findViewById<TextView>(R.id.math_result).text
            findViewById<TextView>(R.id.math_result).text = ""
        }
        findViewById<TextView>(R.id.math_operation).append(x)
    }

    fun isDotAllowed(str: String) : Boolean {
        val dotCounter = str.count { it == ',' }
        var newStr = str
        if (dotCounter == 0) return true
        for (i in 0..dotCounter - 1) {
            newStr = newStr.substringAfter(",")
        }
        if (newStr.contains("+") || newStr.contains("—") || newStr.contains("×") || newStr.contains("÷")) return true
        else return false
    }
}