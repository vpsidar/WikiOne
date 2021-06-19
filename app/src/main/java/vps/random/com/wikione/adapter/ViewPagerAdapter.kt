package vps.random.com.wikione.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    private val mFragmentList = arrayListOf<Fragment>()
    private val mFragmentTitleList = arrayListOf<String>()

     fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitleList[position]
    }



    fun addFragment(fragment: Fragment,title :String){
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }

    override fun getItemCount(): Int {
        return  mFragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return mFragmentList[position];
    }


}