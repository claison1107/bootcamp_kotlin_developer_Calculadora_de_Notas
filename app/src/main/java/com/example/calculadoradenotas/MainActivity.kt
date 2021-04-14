package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btCalcular = buttonCalcular
        val resultado = resultado

        btCalcular.setOnClickListener{
            val nota1 = Integer.parseInt(textNota1.text.toString())

            val nota2 = Integer.parseInt(textNota2.text.toString())
            val media = (nota1 + nota2)/2
            Log.e("media", "Resultado media $media")
            val faltas = Integer.parseInt(numeroFalta.text.toString())
            Log.e("falta", "Quantidade de falta $faltas")
            //Log.i("bntCalcular", "Clicando no botao de resultado")
            throw Exception()
            if(media >= 6 && faltas <= 10){
                resultado.setText("Aluno foi Aprovado \n Nota final: ${media} \n Faltas: ${faltas}")
                resultado.setTextColor(Color.GREEN)
            }else{
                resultado.setText("Aluno foi reprovado \n Nota final: ${media} \n Faltas: ${faltas}")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}