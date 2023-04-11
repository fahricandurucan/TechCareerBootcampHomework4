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


//        binding.toolbarAnasayfa.title = "ewlkfmwklefjwe"
        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        binding.rvKategori.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)


        val ilanListesi = ArrayList<Kategori>()
        val i1 = Kategori("xxxxx")
        val i2 = Kategori("yyyyyy")
        val i3 = Kategori("zzzzz")
        val i4 = Kategori("xxxxx")
        val i5 = Kategori("xxxxx")
        val i6 = Kategori("xxxxx")
        val i7 = Kategori("xxxxx")


        ilanListesi.add(i1)
        ilanListesi.add(i2)
        ilanListesi.add(i3)
        ilanListesi.add(i4)
        ilanListesi.add(i5)
        ilanListesi.add(i6)
        ilanListesi.add(i7)
        val adapter2 = KategoriAdapter(requireContext(),ilanListesi)
        binding.rv.adapter = adapter2

        val kategoriListesi = ArrayList<Kategori>()
        val k1 = Kategori("xxxxx")
        val k2 = Kategori("yyyyyy")
        val k3 = Kategori("zzzzz")
        val k4 = Kategori("xxxxx")


        kategoriListesi.add(k1)
        kategoriListesi.add(k2)
        kategoriListesi.add(k3)
        kategoriListesi.add(k4)


        val adapter = KategoriAdapter(requireContext(),kategoriListesi)
        binding.rvKategori.adapter = adapter

        return binding.root


    }
}