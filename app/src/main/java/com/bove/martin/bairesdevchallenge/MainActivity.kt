package com.bove.martin.bairesdevchallenge


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.bove.martin.bairesdevchallenge.fragments.ButtonFragment
import com.bove.martin.bairesdevchallenge.fragments.GithubFragment
import com.bove.martin.bairesdevchallenge.fragments.GoogleFragment

class MainActivity : AppCompatActivity() {

    private val googleFragment: Fragment = GoogleFragment()
    private val buttonFragment: Fragment = ButtonFragment()
    private val githubFragment: Fragment = GithubFragment()

    private val fm: FragmentManager = supportFragmentManager
    private lateinit var transaction: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeFragment(googleFragment)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menuGoogle -> {
                changeFragment(googleFragment)
            }
            R.id.menuButtons -> {
                changeFragment(buttonFragment)
            }
            R.id.menuGithub -> {
                changeFragment(githubFragment)
            }
        }
        return true
    }

    private fun changeFragment(fragment: Fragment) {
        transaction = fm.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.commit()
    }
}