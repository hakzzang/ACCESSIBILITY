package com.hbs.myaccessibility

import android.os.Bundle
import android.view.View
import android.view.accessibility.AccessibilityNodeInfo
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.hbs.myaccessibility.databinding.ActivityHintMessageBinding

class HintMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHintMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.target1Button.setOnClickListener {

        }

        binding.target2Button.setOnClickListener {

        }

        binding.target3Button.setOnClickListener {

        }

        binding.target4Button.setOnClickListener {

        }

        binding.target2Button.accessibilityDelegate = object : View.AccessibilityDelegate() {
            override fun onInitializeAccessibilityNodeInfo(
                host: View?,
                info: AccessibilityNodeInfo?
            ) {
                super.onInitializeAccessibilityNodeInfo(host, info)
                info?.removeAction(AccessibilityNodeInfo.ACTION_CLICK)
                host?.isClickable = false
            }
        }

        binding.target4Button.accessibilityDelegate = object : View.AccessibilityDelegate() {
            override fun onInitializeAccessibilityNodeInfo(
                host: View?,
                info: AccessibilityNodeInfo?
            ) {
                super.onInitializeAccessibilityNodeInfo(host, info)
                val orderAction = AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.ACTION_CLICK, "주문")
                info?.addAction(orderAction)
            }
        }
    }
}