package org.codefornepal.nepalmap.ui.blogs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.codefornepal.nepalmap.data.repository.BlogRepository
import org.codefornepal.nepalmap.data.source.BlogDataSource

/**
 * ViewModel provider factory to instantiate BlogViewModel.
 * Required given BlogViewModel has a non-empty constructor
 */
class BlogViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BlogViewModel::class.java)) {
            return BlogViewModel(
                repository = BlogRepository(
                    dataSource = BlogDataSource()
                )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
