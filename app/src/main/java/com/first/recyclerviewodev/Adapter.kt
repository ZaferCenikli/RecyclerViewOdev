package com.first.recyclerviewodev

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapter(private var mContext:Context,private var filmlerlist:List<Filmler>)
    :RecyclerView.Adapter<Adapter.cardTasarimNesneleriTutucu>() {

    inner class cardTasarimNesneleriTutucu (view:View):RecyclerView.ViewHolder(view){
        var textView_isim:TextView
        var textView_fiyat:TextView
        var imageView:ImageView
        var button_sepete_ekle:Button

        init {
            imageView =view.findViewById(R.id.imageView)
            textView_isim=view.findViewById(R.id.textView_isim)
            textView_fiyat=view.findViewById(R.id.textView_fiyat)
            button_sepete_ekle=view.findViewById(R.id.button_sepete_ekle)
        }






    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasarimNesneleriTutucu {
        val tasarim=LayoutInflater.from(mContext).inflate(R.layout.recyclerview_tasarim,parent,false)
        return cardTasarimNesneleriTutucu(tasarim)

    }

    override fun getItemCount(): Int {
        return filmlerlist.size
    }

    override fun onBindViewHolder(holder: cardTasarimNesneleriTutucu, position: Int) {
        val film=filmlerlist[position]
        holder.textView_isim.text=film.film_ad
        holder.textView_fiyat.text= "${film.film_fiyat} TL"
        holder.imageView.setImageResource(mContext.resources.getIdentifier(film.film_resim_ad,"drawable",mContext.packageName))
        holder.button_sepete_ekle.setOnClickListener {
            Toast.makeText(mContext,"${film.film_ad} Sepete eklendi",Toast.LENGTH_SHORT).show()
        }



    }


}