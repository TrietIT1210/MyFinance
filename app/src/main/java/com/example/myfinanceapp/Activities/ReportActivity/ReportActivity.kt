package com.example.myfinanceapp.Activities.ReportActivity

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModel
import com.example.myfinanceapp.Activities.ReportActivity.screens.ReportScreen
import com.example.myfinanceapp.R
import com.example.myfinanceapp.ViewModel.MainViewModel

class ReportActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReportScreen(
                budgets = mainViewModel.loadBudget(),
                onBack = { finish() }
            )
        }
    }
}