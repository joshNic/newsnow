package com.example.newsnow.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment

import android.view.View

import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import com.example.newsnow.R
import com.example.newsnow.ui.NewsActivity
import com.example.newsnow.ui.NewsViewModel
import kotlinx.android.synthetic.main.fragment_article.*

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel
    val args: ArticleFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
        val article = args.article
        webView.apply {
            webViewClient = WebViewClient()
            loadUrl(article.url)
        }
    }
}