@file:JvmName("ExtensionUtils")

package com.example.kurianvithayathil.keddit.kedditbysteps.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Kurian on 01-Jan-18.
 */
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}