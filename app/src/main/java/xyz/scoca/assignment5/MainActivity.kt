package xyz.scoca.assignment5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import xyz.scoca.assignment5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {  //Set Options Menu Items
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.nav_menu,menu)
        return true
    }
}