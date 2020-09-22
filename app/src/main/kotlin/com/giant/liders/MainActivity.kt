package com.giant.liders

import ...


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        init()
    }

    private fun navigateTo(fragment: Fragment) {

        supportFragmentManager
                .beginTransaction()
                .replace(R.id.content, fragment)
                .commit()
    }

    private fun init() {
        navigateTo(InitFragment())
    }

    fun navigateToHome(message: String) {
        val fragment = HomeFragment()
        fragment.arguments = bundleOf(HomeFragment.MESSAGE to message)
        navigateTo(fragment)
    }

    companion object {

        private val TAG = MainActivity::class.qualifiedName;
    }

}
