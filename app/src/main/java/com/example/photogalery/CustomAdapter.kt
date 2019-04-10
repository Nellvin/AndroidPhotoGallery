package com.example.photogalery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CustomAdapter(
    val mData: ArrayList<MyData>
//    val mWeight: ArrayList<String>,
//    val mHeight: ArrayList<String>,
//    val mMeasures: ArrayList<String>,
//    val mBMI: ArrayList<String>,
//    val mDate: ArrayList<String>
) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.layout_listitem, parent, false)
        return ViewHolder(v)
    }


    override fun getItemCount(): Int {
        return mData.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var tmp = mData[position]
//        holder.image.setImageResource(R.drawable.mewa_blada)
        Picasso.get().load("https://www.mapofpoland.pl/zdjecia-109478/Mewa-smieszka.jpg").into(holder.image)
        holder.name.text=tmp.Name
        holder.date.text=tmp.date.toString()
        holder.tags.text="#"+tmp.tags[0]+"#"+tmp.tags[1]+"#"+tmp.tags[2]
//             holder.number.text = position.toString()
//            holder.height.text = mHeight[position]
//            holder.weight.text = mWeight[position]
//            holder.measures.text = mMeasures[position]
//            holder.BMI.text = mBMI[position]
//            holder.Date.text = mDate[position]

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //            val number = itemView.findViewById(R.id.textView7) as TextView
//            val weight = itemView.findViewById(R.id.textView8) as TextView
//            val height = itemView.findViewById(R.id.textView9) as TextView
//            val measures = itemView.findViewById(R.id.textView12) as TextView
//            val BMI = itemView.findViewById(R.id.textView13) as TextView
//            val Date = itemView.findViewById(R.id.textView14) as TextView
        val image = itemView.findViewById(R.id.imageView) as ImageView
        val name = itemView.findViewById(R.id.textView) as TextView
        val date = itemView.findViewById(R.id.textView2) as TextView
        val tags = itemView.findViewById(R.id.textView3) as TextView

        // val parentLayout=itemView.findViewById(R.id.parent_layout) as TextView
    }


}
