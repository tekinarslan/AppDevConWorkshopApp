package com.holidaypirates.common


/**
 * Represents a result which can be in an error or success state.
 *
 * To prevent confusions with the kotlin [Result] class this class is named [Outcome] instead.
 */
sealed class Outcome<out T> {

    val isSuccess: Boolean get() = this is Success
    val isError: Boolean get() = this is Error

    class Error<T : Any>(val reason: Exception, val message: String = "") : Outcome<T>() {
        override fun toString(): String = "Outcome.Error(message='$message', reason=$reason)"
    }

    class Success<T : Any>(val data: T) : Outcome<T>() {
        override fun toString(): String = "OutcomeSuccess(data=$data)"
    }

    companion object {
        fun success() = Success(Unit)
    }
}

fun <T> Outcome<T>.mapToResult(): Result<T> = when (this) {
    is Outcome.Success -> Result.Success(data)
    is Outcome.Error -> Result.Error(reason)
}

fun <T : Any> T.asOutcome(): Outcome<T> = Outcome.Success(this)
