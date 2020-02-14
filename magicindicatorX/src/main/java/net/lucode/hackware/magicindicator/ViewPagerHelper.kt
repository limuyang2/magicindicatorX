package net.lucode.hackware.magicindicator

import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

fun MagicIndicator.bind(viewPager: ViewPager) {
    viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {
            this@bind.onPageScrolled(position, positionOffset, positionOffsetPixels)
        }

        override fun onPageSelected(position: Int) {
            this@bind.onPageSelected(position)
        }

        override fun onPageScrollStateChanged(state: Int) {
            this@bind.onPageScrollStateChanged(state)
        }
    })
}

fun MagicIndicator.bind(viewPager: ViewPager2) {
    viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
        override fun onPageScrollStateChanged(state: Int) {
            this@bind.onPageScrollStateChanged(state)
        }

        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {
            this@bind.onPageScrolled(position, positionOffset, positionOffsetPixels)
        }

        override fun onPageSelected(position: Int) {
            this@bind.onPageSelected(position)
        }
    })
}