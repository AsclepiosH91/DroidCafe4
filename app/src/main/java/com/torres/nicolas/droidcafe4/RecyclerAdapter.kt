package com.torres.nicolas.droidcafe4


import android.support.design.widget.Snackbar
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class RecyclerAdapter(private val titles:Array<String>, private val details:Array<String>, private val images:IntArray ) : RecyclerView.Adapter<RecyclerAdapter.ArticleHolder>() {

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onCreateViewHolder(Parent: ViewGroup, viewType: Int): RecyclerAdapter.ArticleHolder {
        val inflatedView = LayoutInflater.from(Parent.context).inflate(R.layout.card_layout, Parent, false)
        return ArticleHolder(inflatedView)
    }

    override fun onBindViewHolder(viewHolder: RecyclerAdapter.ArticleHolder, position: Int) {

        viewHolder.itemTitle.text = titles[position]
        viewHolder.itemDetail.text = details[position]
        viewHolder.itemImage.setImageResource(images[position])

    }


    class ArticleHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        override fun onClick(v: View?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)


            itemView.setOnClickListener { v: View ->
                var position: Int = this.adapterPosition

                Snackbar.make(v, "Click detected on item $position",
                        Snackbar.LENGTH_LONG).setAction("Action", null).show()
            }

        }

    }

}


