package org.codefornepal.nepalmap.ui.blogs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.codefornepal.nepalmap.data.repository.BlogRepository

class BlogViewModel(private val repository: BlogRepository) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Blog Fragment"
    }
    val text: LiveData<String> = _text
}