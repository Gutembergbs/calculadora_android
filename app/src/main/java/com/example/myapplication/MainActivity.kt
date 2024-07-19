package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calculo = binding.calculo
        val resultado = binding.resultado

        binding.um.setOnClickListener(){
            calculo.text = "${calculo.text}1"
        }
        binding.dois.setOnClickListener(){
            calculo.text = "${calculo.text}2"
        }
        binding.tres.setOnClickListener(){
            calculo.text = "${calculo.text}3"
        }
        binding.quatro.setOnClickListener(){
            calculo.text = "${calculo.text}4"
        }
        binding.cinco.setOnClickListener(){
            calculo.text = "${calculo.text}5"
        }
        binding.seis.setOnClickListener(){
            calculo.text = "${calculo.text}6"
        }
        binding.sete.setOnClickListener(){
            calculo.text = "${calculo.text}7"
        }
        binding.oito.setOnClickListener(){
            calculo.text = "${calculo.text}8"
        }
        binding.nove.setOnClickListener(){
            calculo.text = "${calculo.text}9"
        }
        binding.zero.setOnClickListener(){
            calculo.text = "${calculo.text}0"
        }
        binding.parenteseAbrindo.setOnClickListener(){
            calculo.text = "${calculo.text}("
        }
        binding.parenteseFechando.setOnClickListener(){
            calculo.text = "${calculo.text})"
        }
        binding.ponto.setOnClickListener(){
            calculo.text = "${calculo.text}."
        }
        binding.adicao.setOnClickListener(){
            if (resultado.text == "") {
                calculo.text = "${calculo.text}+"
            }else{
                calculo.text = "${resultado.text}+"
                resultado.text = ""
            }
        }
        binding.subitracao.setOnClickListener(){
            if (resultado.text == "") {
                calculo.text = "${calculo.text}-"
            }else{
                calculo.text = "${resultado.text}-"
                resultado.text = ""
            }
        }
        binding.multiplicacao.setOnClickListener(){
            if (resultado.text == "") {
                calculo.text = "${calculo.text}*"
            }else{
                calculo.text = "${resultado.text}*"
                resultado.text = ""
            }
        }
        binding.divisao.setOnClickListener(){
            if (resultado.text == "") {
                calculo.text = "${calculo.text}/"
            }else{
                calculo.text = "${resultado.text}/"
                resultado.text = ""
            }
        }
        binding.apagar.setOnClickListener{
            calculo.text = calculo.text.dropLast(1)
        }
        binding.ce.setOnClickListener{
            calculo.text = ""
            resultado.text = ""
        }
        binding.igual.setOnClickListener{
            val resultadoCalculado = Expression(calculo.text.toString()).calculate()
            resultado.text = resultadoCalculado.toString()
        }
        binding.raiz.setOnClickListener {
            if (resultado.text == "") {
                calculo.text = "${calculo.text}√"
            }else{
                calculo.text = "√(${resultado.text})"
                resultado.text = ""
            }
        }


        binding.potencia.setOnClickListener{
            if (resultado.text == "") {
                calculo.text = "${calculo.text}^"
            }else{
                calculo.text = "${resultado.text}^"
                resultado.text = ""
            }
        }
    }
}