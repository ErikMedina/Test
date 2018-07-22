package com.erikmedina.article.util

import com.erikmedina.article.data.local.model.ItemView
import com.erikmedina.article.data.remote.model.ContentListResponse

object Mapper {

    fun map(contentListResponse: ContentListResponse): List<ItemView> {
        val items = contentListResponse.items
        val itemViews = ArrayList<ItemView>()
        for (item in items) {
            val itemView = ItemView(
                    id = item.id,
                    title = item.title,
                    subtitle = item.subtitle,
                    body = item.body,
                    date = item.date
            )
            itemViews.add(itemView)
        }
        return itemViews
    }
}
