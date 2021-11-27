package com.awais.weatherapp.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.awais.weatherapp.data.LocationWeather
import com.awais.weatherapp.databinding.LiLocationWeatherBinding

class LocationWeatherAdapter : ListAdapter<LocationWeather, LocationWeatherAdapter.LocationWeatherViewHolder>(
    LocationWeatherDiffCallback()
){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationWeatherViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: LocationWeatherViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class LocationWeatherViewHolder(binding: LiLocationWeatherBinding) : RecyclerView.ViewHolder(binding.rootView) {

        fun bind(obj : LocationWeather){

        }

    }

}

class LocationWeatherDiffCallback : DiffUtil.ItemCallback<LocationWeather>() {
    override fun areItemsTheSame(oldItem: LocationWeather, newItem: LocationWeather): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: LocationWeather, newItem: LocationWeather): Boolean {
        return oldItem == newItem
    }
}