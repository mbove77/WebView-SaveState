package com.bove.martin.bairesdevchallenge.utils

import android.app.Activity
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

/**
 * Created by Martín Bove on 17-Aug-20.
 * E-mail: mbove77@gmail.com
 */

fun Activity.toast(mensaje: CharSequence, duracion: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, mensaje, duracion).show()
}

fun ImageView.loadFromUrl(url: Any) = Glide.with(this)
    .load(url)
    .apply(RequestOptions().circleCrop())
    .into(this)