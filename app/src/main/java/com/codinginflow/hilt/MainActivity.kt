package com.codinginflow.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.codinginflow.hilt.ui.gallery.GalleryViewModel
import com.codinginflow.hilt.ui.gallery.TestClass
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity  : AppCompatActivity() {


//    @Inject
 //    lateinit var viewModel: GalleryViewModel

  //  var viewModel by viewModels<GalleryViewModel>()

    private val viewModel: GalleryViewModel by viewModels()

    @Inject
    lateinit var test: TestClass



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        test.print()


      //  viewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)

        viewModel.callSearch()
    }


}