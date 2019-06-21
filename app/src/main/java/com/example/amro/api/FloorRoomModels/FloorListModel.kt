package com.example.amro.api.FloorRoomModels

import com.google.gson.annotations.SerializedName

/**
 * Created by PawanYadav
 */
class FloorListModel {

    @SerializedName("floors")
    var floors: ArrayList<FloorModel>? = null
}