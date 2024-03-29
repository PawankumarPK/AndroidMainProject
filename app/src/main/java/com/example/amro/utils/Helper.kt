package com.example.amro.utils

/**
 * Created by ajayvishnu on 29/05/19.
 */

import com.example.amro.R
import android.content.Context
import android.content.res.Resources
import android.util.Log
import java.io.IOException
import java.util.*

object Helper {

    private val TAG = "Helper"

    fun getConfigValue(context:Context, name: String): String? {
        val resources = context.getResources()

        try {
            val rawResource = resources.openRawResource(R.raw.config)
            val properties = Properties()
            properties.load(rawResource)
            return properties.getProperty(name)
        } catch (e: Resources.NotFoundException) {
            Log.e(TAG, "Unable to find the config file: " + e.message)
        } catch (e: IOException) {
            Log.e(TAG, "Failed to open config file.")
        }

        return null
    }
}