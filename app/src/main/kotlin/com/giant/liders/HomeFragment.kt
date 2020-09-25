package com.giant.liders

import ...

class HomeFragment : Fragment(R.layout.fragment_home){
  override fun onViewCreated(view: View, savedInstanceState: Bundle){
    super.onViewCreated(view, savedInstanceState)
    
    lifecycleScope.launchWhenStarted {
      val response = RetrofitProvider.LidersApi.getapi()
      recycleViewArticles.adapter = LidersAdapter(reaponse.articles.orEmpty().toMutableList()){
        val direction = HomeFragmentDirections.actionHomeFragmentToLookFragment(it)
        findNavController().navigation(direction)
      }
    }
    
  }
}