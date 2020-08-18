package com.bove.martin.bairesdevchallenge.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.bove.martin.bairesdevchallenge.R
import com.bove.martin.bairesdevchallenge.utils.Constants
import kotlinx.android.synthetic.main.fragment_google.*


class GoogleFragment : Fragment() {
    private var webViewBundle: Bundle? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_google, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.subtitle = getString(R.string.google_subtitle)

        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        if (webViewBundle == null) {
            webView.loadUrl(Constants.GOOGLE_URL)
        } else {
            webView.restoreState(webViewBundle);
        }
    }

     //for maintain state of the webView
    override fun onPause() {
        super.onPause()
        webViewBundle = Bundle()
        webView.saveState(webViewBundle)
    }
}