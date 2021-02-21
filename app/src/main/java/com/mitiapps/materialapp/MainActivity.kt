package com.mitiapps.materialapp


import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mitiapps.materialapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity()  {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
//            openFragment()
        }
    }

//    private fun openFragment() {
//        supportFragmentManager.beginTransaction()
//            .add(R.id.fragment_container, ProductGridFragment())
//            .addToBackStack(null)
//            .commit()
//    }


}


