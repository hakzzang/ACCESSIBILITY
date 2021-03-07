package com.hbs.myaccessibility

import android.os.Bundle
import android.view.accessibility.AccessibilityEvent
import androidx.appcompat.app.AppCompatActivity
import com.hbs.myaccessibility.databinding.ActivitySendEventBinding

class SendEventActivity : AppCompatActivity() {
    private var intCount = 0
    private var intCount2 = 0
    private var intCount3 = 0
    private var intCount4 = 0
    private var intCount5 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySendEventBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.target1Button.setOnClickListener {
            intCount++
            binding.target1Button.text = intCount.toString()
            binding.target1Button.sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED)
        }

        binding.target2Button.setOnClickListener {
            intCount2++
            binding.target2Button.text = intCount2.toString()
            binding.target2Button.sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUSED)
        }

        binding.target3Button.setOnClickListener {
            intCount3++
            binding.target3Button.text = intCount3.toString()
            binding.target3Button.sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED)
        }

        binding.target4Button.setOnClickListener {
            intCount4++
            binding.target4Button.text = intCount4.toString()
            binding.target4Button.sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_CLICKED)
        }

        binding.target5Button.setOnClickListener{
            intCount5++
            binding.target5Button.text = intCount5.toString()
        }

        binding.target1Textview.setOnClickListener {
            intCount++
            binding.target1Textview.text = intCount.toString()
            binding.target1Textview.sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED)
        }

        binding.target2Textview.setOnClickListener {
            intCount2++
            binding.target2Textview.text = intCount2.toString()
            binding.target2Textview.sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUSED)
        }

        binding.target3Textview.setOnClickListener {
            intCount3++
            binding.target3Textview.text = intCount3.toString()
            binding.target3Textview.sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED)
        }

        binding.target4Textview.setOnClickListener {
            intCount4++
            binding.target4Textview.text = intCount4.toString()
            binding.target4Textview.sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_CLICKED)
        }

        binding.target5Textview.setOnClickListener{
            intCount5++
            binding.target5Textview.text = intCount5.toString()
        }
    }
}