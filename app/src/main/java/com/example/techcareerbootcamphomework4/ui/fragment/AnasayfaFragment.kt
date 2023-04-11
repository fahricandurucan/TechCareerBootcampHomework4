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
import com.example.techcareerbootcamphomework4.data.Kategori
import com.example.techcareerbootcamphomework4.databinding.FragmentAnasayfaBinding
import com.example.techcareerbootcamphomework4.ui.adapter.KategoriAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)


        binding.toolbarAnasayfa.title = "ewlkfmwklefjwe"
        binding.rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        binding.rvKategori.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


        val ilanListesi = ArrayList<Kategori>()
        val i1 = Kategori("xxxxx")
        val i2 = Kategori("yyyyyy")
        val i3 = Kategori("zzzzz")
        val i4 = Kategori("xxxxx")

        ilanListesi.add(i1)
        ilanListesi.add(i2)
        ilanListesi.add(i3)
        ilanListesi.add(i4)
        val adapter2 = KategoriAdapter(requireContext(),ilanListesi)
        binding.rv.adapter = adapter2

        val kategoriListesi = ArrayList<Kategori>()
        val k1 = Kategori("xxxxx")
        val k2 = Kategori("yyyyyy")
        val k3 = Kategori("zzzzz")
        val k4 = Kategori("xxxxx")
        val k5 = Kategori("yyyyyy")
        val k6 = Kategori("zzzzz")
        val k7 = Kategori("xxxxx")
        val k8 = Kategori("yyyyyy")
        val k9 = Kategori("zzzzz")
        val k10 = Kategori("xxxxx")
        val k11 = Kategori("yyyyyy")
        val k12 = Kategori("zzzzz")
        val k13 = Kategori("xxxxx")
        val k14 = Kategori("yyyyyy")
        val k15 = Kategori("zzzzz")

        kategoriListesi.add(k1)
        kategoriListesi.add(k2)
        kategoriListesi.add(k3)
        kategoriListesi.add(k4)
        kategoriListesi.add(k5)
        kategoriListesi.add(k6)
        kategoriListesi.add(k7)
        kategoriListesi.add(k8)
        kategoriListesi.add(k9)
        kategoriListesi.add(k10)
        kategoriListesi.add(k11)
        kategoriListesi.add(k12)
        kategoriListesi.add(k13)
        kategoriListesi.add(k14)
        kategoriListesi.add(k14)

        val adapter = KategoriAdapter(requireContext(),kategoriListesi)
        binding.rvKategori.adapter = adapter

        return binding.root


    }
}