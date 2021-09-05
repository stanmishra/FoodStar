package com.ravi.foodstar.bindingadapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import coil.load
import com.ravi.foodstar.R

class RecipesRowBinding {

    companion object{


        @BindingAdapter("loadImageFrom")
        @JvmStatic
        fun loadImageFromUrl(imageView: ImageView, imageUrl: String){
            imageView.load(imageUrl){
                crossfade(600)
            }
        }

        @BindingAdapter("setNumberOfLikes")
        @JvmStatic
        fun setNumberOfLikes(textview: TextView, likes: Int){
            textview.text = likes.toString();
        }

        @BindingAdapter("setNumberOfMinutes")
        @JvmStatic
        fun setNumberOfMinutes(textview: TextView, minutes: Int){
            textview.text = minutes.toString();
        }

        @BindingAdapter("applyVeganColor")
        @JvmStatic
        fun applyVeganColor(view: View, vegan: Boolean){
            if(vegan){
                when(view){
                    is TextView -> {
                        view.setTextColor(
                            ContextCompat.getColor(
                                view.context,
                                R.color.green
                            )
                        )
                    }
                    is ImageView -> {
                        view.setColorFilter(
                            ContextCompat.getColor(
                                view.context,
                                R.color.green
                            )
                        )
                    }
                }
            }
        }

    }

}