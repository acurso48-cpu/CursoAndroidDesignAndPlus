package com.kuvuni.materialcomponents

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

sealed class TopicListItem {
    data class Header(val title: String) : TopicListItem()
    data class Topic(val name: String) : TopicListItem()
}

class TopicAdapter(private val items: List<TopicListItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is TopicListItem.Header -> TYPE_HEADER
            is TopicListItem.Topic -> TYPE_TOPIC
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == TYPE_HEADER) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_header, parent, false)
            HeaderViewHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_topic, parent, false)
            TopicViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val item = items[position]) {
            is TopicListItem.Header -> (holder as HeaderViewHolder).headerTitle.text = item.title
            is TopicListItem.Topic -> (holder as TopicViewHolder).topicName.text = item.name
        }
    }

    override fun getItemCount() = items.size

    class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val headerTitle: TextView = itemView.findViewById(R.id.header_title)
    }

    class TopicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val topicName: TextView = itemView.findViewById(R.id.topic_name)
    }

    companion object {
        private const val TYPE_HEADER = 0
        private const val TYPE_TOPIC = 1
    }
}