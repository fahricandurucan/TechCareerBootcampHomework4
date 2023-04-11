package com.example.techcareerbootcamphomework4.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.techcareerbootcamphomework4.R
import com.example.techcareerbootcamphomework4.data.Kategori
import com.example.techcareerbootcamphomework4.databinding.KategoriCardTasarimBinding

class KategoriAdapter(var mContext: Context, var kategoriListesi:List<Kategori>)
    : RecyclerView.Adapter<KategoriAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(var binding: KategoriCardTasarimBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = KategoriCardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun getItemCount(): Int {
        return kategoriListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        var data =kategoriListesi.get(position)
        val t = holder.binding

        t.imageView4.setImageResource(mContext.resources.getIdentifier(data.image,"drawable",mContext.packageName))
        t.textView2.text = data.title
    }
}