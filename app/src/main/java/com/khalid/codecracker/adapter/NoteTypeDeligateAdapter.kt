package com.khalid.codecracker.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.codecracker.R
import com.droidcba.kedditbysteps.commons.adapter.ViewType
import com.droidcba.kedditbysteps.commons.adapter.ViewTypeDelegateAdapter
import com.khalid.codecracker.extensions.inflate
import com.khalid.codecracker.model.TopicDetailItem
import com.khalid.codecracker.viewmodel.NoteTypeRowViewModel
import com.khalid.codecracker.viewmodel.SingleOptTypeRowViewModel
import kotlinx.android.synthetic.main.note_type.view.*
import kotlinx.android.synthetic.main.single_opt_type.view.*
import kotlinx.android.synthetic.main.single_opt_type_row.view.*


class NoteTypeDeligateAdapter: ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return NoteTypeViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as NoteTypeViewHolder
        holder.bind(item as TopicDetailItem)
    }

    inner class NoteTypeViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.note_type)) {

        fun bind(item: TopicDetailItem) = with(itemView) {
            noteTypeRowView.viewModel = NoteTypeRowViewModel(item)
        }

    }

}