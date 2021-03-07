package com.hbs.myaccessibility

import android.os.Bundle
import android.view.accessibility.AccessibilityNodeInfo
import androidx.appcompat.app.AppCompatActivity
import com.hbs.myaccessibility.databinding.ActivityMoveFocusBinding

class MoveFocusActivity : AppCompatActivity() {
    var isMovable = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMoveFocusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.targetButton.setOnClickListener {
            if (isMovable) {
                binding.targetTextview.text = "ACTION_ACCESSIBILITY_FOCUS"
                binding.targetTextview.performAccessibilityAction(AccessibilityNodeInfo.ACTION_ACCESSIBILITY_FOCUS, null)
            } else {
                binding.targetTextview.text = "ACTION_CLEAR_ACCESSIBILITY_FOCUS"
                binding.targetButton.performAccessibilityAction(AccessibilityNodeInfo.ACTION_CLEAR_ACCESSIBILITY_FOCUS, null)
            }
            isMovable = !isMovable
        }
    }
}