package com.example.androidarch.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidarch.common.Resource
import com.example.androidarch.data.Repository
import com.example.androidarch.models.TweetsData
import kotlinx.coroutines.launch

/**
 * @author Arpit Agarwal <arpit.agarwal@lenskart.in>
 * @version $Revision 1.0 $, $Date 2022/02/06 13:56 $
 * @since 0.1.0
 */
class HomeViewModel : ViewModel() {

    private val _tweetsData = MutableLiveData<TweetsData>()
    val tweetsData = _tweetsData as LiveData<TweetsData>

    private val _errorData = MutableLiveData<String>()
    val errorData = _errorData as LiveData<String>

    fun getPosts() {
        viewModelScope.launch {
            when(val response = Repository.getPosts()) {
                is Resource.Success -> {
                    _tweetsData.postValue(response.data)
                }
                is Resource.Error -> {
                    _errorData.postValue(response.msg)
                }
            }
        }
    }

}