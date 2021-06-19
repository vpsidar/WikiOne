package vps.random.com.wikione.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import vps.random.com.wikione.R
import vps.random.com.wikione.adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.viewPager)
        setupTabs()
    }

    fun setupTabs() {
        val vAdapter = ViewPagerAdapter(this)
        vAdapter.addFragment(LatestArticleFragment(),"Latest Articles")
        vAdapter.addFragment(FeaturedImagesFragment(),"Featured Images")
        vAdapter.addFragment(CategoryFragment(),"Category")
        viewPager.adapter = vAdapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = vAdapter.getPageTitle(position)
        }.attach()
    }
}