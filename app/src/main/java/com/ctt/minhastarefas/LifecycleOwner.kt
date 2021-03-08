//package com.ctt.minhastarefas
//
//import androidx.fragment.app.Fragment
//import androidx.fragment.app.FragmentManager
//import androidx.fragment.app.FragmentPagerAdapter
//
//class LifecycleOwner {
//
//    //interface name LifecycleObserver which listens to these events and respond accordingly
//
//    class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
//
//
//        override fun getCount(): Int {
//            return 3
//        }
//
//
//        override fun getPageTitle(position: Int): CharSequence? {
//            return when(position){
//                0 -> "A fazer"
//                1 -> "Em progresso"
//                2 -> "Feitas"
//                else -> super.getPageTitle(position)
//            }
//        }
//    }
//
//}
//
//class MyActivity : AppCompatActivity() {
//    private lateinit var myLocationListener: MyLocationListener
//
//    override fun onCreate(...) {
//        myLocationListener = MyLocationListener(this, lifecycle) { location ->
//            // update UI
//        }
//        Util.checkUserStatus { result ->
//            if (result) {
//                myLocationListener.enable()
//            }
//        }
//    }
//}
