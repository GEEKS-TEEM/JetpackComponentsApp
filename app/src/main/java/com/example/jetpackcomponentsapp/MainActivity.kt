package com.example.jetpackcomponentsapp

import android.os.Bundle
import android.view.View

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import com.example.jetpackcomponentsapp.databinding.MainBinder

class MainActivity : AppCompatActivity() {

    private lateinit var binding : MainBinder
    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        binding.viewModel = viewModel
        //binding.setLifecycleOwner()
    }

    private fun setLiveDataObservers() {
        //viewModel.getData().observe(this, Observer { string -> binding.textResult.text = string })
        viewModel.getData().observe(this, object : Observer<String> {
            override fun onChanged(string: String) {
                binding.textResult.text = string
            }
        })
    }

    private fun setEventListeners() {
        /*binding.buttonSendData.setOnClickListener {
            binding.viewModel!!.setData(
                    CustomModel(
                            binding.editTextFirstName.text.toString(),
                            binding.editTextLastName.text.toString()
                    )
            )
        }*/
        binding.buttonSendData.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                //This was for the sample for the transformations map
                //This call is intended to use in the back end calling
                binding.viewModel!!.setData(
                        CustomModel(
                                binding.editTextFirstName.text.toString(),
                                binding.editTextLastName.text.toString()
                        )
                )
            }

        })
    }

    override fun onStart() {
        super.onStart()

        setLiveDataObservers()
        setEventListeners()
    }
}