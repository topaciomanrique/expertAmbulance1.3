package com.example.expertambulance13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.expertambulance13.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity(){

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    binding.btnAceptar.setOnClickListener {
        binding.apply {
            btnAceptar.setOnClickListener {
                if (ckbxAsfixia.isChecked == true || ckbxEmabrazada.isChecked == true || ckbxAsfixia.isChecked == true && ckbxEmabrazada.isChecked == true) {
                    Toast.makeText(this@MainActivity2, "Una ambulancia de urgencias básicas va en camino", Toast.LENGTH_SHORT).show()
                }
                if (ckbxInfarto.isChecked == true || ckbxInfarto.isChecked == true && ckbxAsfixia.isChecked == true || ckbxInfarto.isChecked == true && ckbxEmabrazada.isChecked == true || ckbxInfarto.isChecked == true && ckbxAsfixia.isChecked == true && ckbxEmabrazada.isChecked == true ){
                    Toast.makeText(this@MainActivity2,"Una ambulancia de urgencias avanzadas va en camino",Toast.LENGTH_SHORT).show()
                }
                if (ckbxSobredosis.isChecked == true){
                    Toast.makeText(this@MainActivity2, "Una ambulancia de cuidados intensivos va en camino", Toast.LENGTH_SHORT).show()
                }
                if (ckbxMontana.isChecked == true){
                    Toast.makeText(this@MainActivity2, "Una helicoptero ambulancia va en camino", Toast.LENGTH_SHORT).show()
                }
                if (ckbxAsfixia.isChecked == false && ckbxInfarto.isChecked == false && ckbxSobredosis.isChecked == false && ckbxMontana.isChecked == false && ckbxEmabrazada.isChecked == false) {
                    Toast.makeText(this@MainActivity2, "No has seleccionado ninguna opcion", Toast.LENGTH_SHORT).show()
                }
                /**when () {
                    ckbxSobredosis.isChecked == true -> Toast.makeText(this@MainActivity2, "Una ambulancia de cuidados intensivos va en camino", Toast.LENGTH_SHORT).show()
                    ckbxMontana.isChecked == true ->     Toast.makeText(this@MainActivity2, "Una helicoptero ambulancia va en camino", Toast.LENGTH_SHORT).show()
                    else ->     Toast.makeText(this@MainActivity2, "No has seleccionado ninguna opcion", Toast.LENGTH_SHORT).show()
                }**/
            }
        }
    }
    }
}