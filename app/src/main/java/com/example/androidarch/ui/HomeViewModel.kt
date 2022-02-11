package com.example.androidarch.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
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
            var data = Repository.getPosts()
            if(data.isSuccessful){
                _tweetsData.postValue(data.body())
            } else {
                _errorData.postValue(data.errorBody().toString())
            }
        }
    }

}