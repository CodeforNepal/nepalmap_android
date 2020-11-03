package org.codefornepal.nepalmap.ui.settings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.codefornepal.nepalmap.data.repository.SettingsRepository
import org.codefornepal.nepalmap.data.source.SettingsDataSource

/**
 * ViewModel provider factory to instantiate BlogViewModel.
 * Required given BlogViewModel has a non-empty constructor
 */
class SettingsViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SettingsViewModel::class.java)) {
            return SettingsViewModel(
                repository = SettingsRepository(
                    dataSource = SettingsDataSource()
                )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
