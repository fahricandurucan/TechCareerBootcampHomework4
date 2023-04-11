package com.example.techcareerbootcamphomework4.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.techcareerbootcamphomework4.data.Ilan
import com.example.techcareerbootcamphomework4.databinding.IlanCardTasarimBinding

class IlanAdapter(var mContext:Context,var ilanList: List<Ilan>)
    : RecyclerView.Adapter<IlanAdapter.CardTasarimTutucu>(){


        inner class CardTasarimTutucu(var binding:IlanCardTasarimBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = IlanCardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun getItemCount(): Int {
        return ilanList.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        var data = ilanList.get(position)
        var t = holder.binding

        t.imageView5.setImageResource(mContext.resources.getIdentifier(data.image,"drawable",mContext.packageName))
        t.textViewFiyat.text = data.price
        t.textViewName.text = data.name
        t.textViewSehir.text = data.sehir

    }

}