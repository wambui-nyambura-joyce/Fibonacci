package dev.nyambura7.fibonacciseries


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NamesRvAdapter (var namesList: List<String>): RecyclerView.Adapter<NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_item,parent,false)
        return NamesViewHolder(itemView)
    } //creates many views as it can fill the view port)-the function of the onCreateViewHolder

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val currentName = namesList.get(position)
        holder.tvName.text =currentName
    }

    override fun getItemCount(): Int {
        return namesList.size //stops the recycling once you are at the end of the list
    }

}

class NamesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName =itemView.findViewById<TextView>(R.id.tvNumbers)
}