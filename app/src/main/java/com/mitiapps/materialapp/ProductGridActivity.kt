package com.mitiapps.materialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.codelabs.mdc.kotlin.shrine.network.ProductEntry
import com.mitiapps.materialapp.Adapters.ProductCardRecyclerViewAdapter
import com.mitiapps.materialapp.databinding.ActivityProductGridBinding


class ProductGridActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductGridBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductGridBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = GridLayoutManager(applicationContext, 2, RecyclerView.VERTICAL, false)
        val adapter = ProductCardRecyclerViewAdapter(
            ProductEntry.initProductEntryList(resources))
        binding.recyclerView.adapter = adapter
        val largePadding = resources.getDimensionPixelSize(R.dimen.shr_product_grid_spacing)
        val smallPadding = resources.getDimensionPixelSize(R.dimen.shr_product_grid_spacing_small)
        binding.recyclerView.addItemDecoration(ProductGridItemDecoration(largePadding, smallPadding))


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        super.onCreateOptionsMenu(menu)
        return true
    }
}