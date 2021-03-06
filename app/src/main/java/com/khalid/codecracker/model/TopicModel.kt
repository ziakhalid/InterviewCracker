package com.khalid.codecracker.model

import com.droidcba.kedditbysteps.commons.adapter.ViewType
import com.khalid.codecracker.util.AdapterConstants

data class TopicItem(val id:String, val name: String, val questionCount: Int) : ViewType {
    override fun getViewType(): Int {
        return AdapterConstants.TOPIC
    }
}