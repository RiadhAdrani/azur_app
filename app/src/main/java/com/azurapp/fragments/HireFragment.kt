package com.azurapp.fragments

import android.app.Activity
import android.content.Intent
import android.media.VolumeShaper
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.azurapp.R
import com.jaiselrahman.filepicker.activity.FilePickerActivity
import com.jaiselrahman.filepicker.config.Configurations

class HireFragment: BaseFragment(R.layout.fragment_hiring) {

    override fun onCreated(view: View, savedInstanceState: Bundle?) {

        val firstName : EditText = view.findViewById(R.id.fragment_first_name_box)
        val lastName : EditText = view.findViewById(R.id.fragment_last_name_box)
        val cin : EditText = view.findViewById(R.id.fragment_cin_box)
        val activity : EditText = view.findViewById(R.id.fragment_activity_box)
        val attachButton : Button = view.findViewById(R.id.fragment_embed_cv_button)
        val attachedFile : TextView = view.findViewById(R.id.fragment_embedded_file)

        attachButton.setOnClickListener {

            val i = Intent(activity.context, FilePickerActivity::class.java)
            i.putExtra(
                FilePickerActivity.CONFIGS, Configurations.Builder()
                    .setCheckPermission(true)
                    .setShowFiles(true)
                    .setShowImages(false)
                    .setShowVideos(false)
                    .setMaxSelection(1)
                    .setSuffixes("txt","pdf","doc","docx")
                    .setSkipZeroSizeFiles(true)
                    .build()
            )

            startActivityForResult(i,102)

//            val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result ->
//                if (result.resultCode == Activity.RESULT_OK){
//                    val data: Intent? = result.data
//                    //TODO do your shit here !!!
//                }
//            }
//
//
//            resultLauncher.launch(i)
        }

    }

    fun pickFile(){

    }

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "HIRE_FRAGMENT"
}