package com.example.androidarch.common

/**
 * @author Arpit Agarwal <arpit.agarwal@lenskart.in>
 * @version $Revision 1.0 $, $Date 2022/02/16 03:03 $
 * @since 0.1.0
 */
sealed class Resource<T> (val data: T?, val msg: String?) {
    class Success<T>(data: T): Resource<T>(data, null)
    class Error<T>(msg: String): Resource<T>(null, msg)
}