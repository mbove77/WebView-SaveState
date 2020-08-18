package com.bove.martin.bairesdevchallenge.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.bove.martin.bairesdevchallenge.R
import com.bove.martin.bairesdevchallenge.utils.toast

import kotlinx.android.synthetic.main.custom_dialog.view.*
import kotlinx.android.synthetic.main.fragment_button.*


class ButtonFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_button, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.subtitle = getString(R.string.button_subtitle)

        buttonToast.setOnClickListener {
            activity?.toast(getString(R.string.toast_msg))
        }

        buttonAlert.setOnClickListener{
            showAlertDialog(getString(R.string.alert_tittle), getString(R.string.alert_msg), null,null,null,null)
        }
    }

    private fun showAlertDialog(tittle: String, menssage: String, positiveButton: String?, positiveIntent: Intent?, negativeButton: String?, negativeIntent: Intent?) {
        val builder = AlertDialog.Builder(activity as Context)
        val inflateView = LayoutInflater.from(activity as Context).inflate(R.layout.custom_dialog, null)
        builder.setView(inflateView)

        inflateView.alertTitle.text = tittle
        inflateView.alertMensaje.text = menssage

        if (positiveButton != null) {
            builder.setPositiveButton(positiveButton) { _, _ -> positiveIntent?.let { startActivity(it) } }
        }
        if (negativeButton != null) {
            builder.setNegativeButton(negativeButton) { _, _ -> negativeIntent?.let { startActivity(it) } }
        }
        if (positiveButton == null && negativeButton == null) {
            builder.setPositiveButton(getString(R.string.alert_ok)) { dialog, _ -> let { dialog.dismiss() } }
        }

        builder.setCancelable(false)
        builder.create().show()
    }

}