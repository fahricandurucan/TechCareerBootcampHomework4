package com.example.techcareerbootcamphomework4.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.techcareerbootcamphomework4.R
import com.example.techcareerbootcamphomework4.data.Ilan
import com.example.techcareerbootcamphomework4.data.Kategori
import com.example.techcareerbootcamphomework4.databinding.FragmentAnasayfaBinding
import com.example.techcareerbootcamphomework4.ui.adapter.IlanAdapter
import com.example.techcareerbootcamphomework4.ui.adapter.KategoriAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)


//        binding.toolbarAnasayfa.title = "ewlkfmwklefjwe"
//        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        binding.rvKategori.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        var ilanListesi = ArrayList<Ilan>()
        var i1 = Ilan("ps","PlayStation","6.500 Tl")
        var i2 = Ilan("ilanaraba","Araba","6.500 Tl")
        var i3 = Ilan("ps","PlayStation","6.500 Tl")
        var i4 = Ilan("ps","PlayStation","6.500 Tl")
        var i5 = Ilan("ps","PlayStation","6.500 Tl")
        var i6 = Ilan("ps","PlayStation","6.500 Tl")

        ilanListesi.add(i1)
        ilanListesi.add(i2)
        ilanListesi.add(i3)
        ilanListesi.add(i4)
        ilanListesi.add(i5)
        ilanListesi.add(i6)

        val adapterIlan = IlanAdapter(requireContext(),ilanListesi)
        binding.rv.adapter = adapterIlan


        val kategoriListesi = ArrayList<Kategori>()
        val k1 = Kategori("car_icon","Araba")
        val k2 = Kategori("telefon_icon","Telefon")
        val k3 = Kategori("evesyalari_icon","Ev Eşyaları")
        val k4 = Kategori("elektronik_icon","Elektronik")
        val k5= Kategori("spor_icon","Outdoor")


        kategoriListesi.add(k1)
        kategoriListesi.add(k2)
        kategoriListesi.add(k3)
        kategoriListesi.add(k4)
        kategoriListesi.add(k5)


        val adapter = KategoriAdapter(requireContext(),kategoriListesi)
        binding.rvKategori.adapter = adapter

        return binding.root


    }
}