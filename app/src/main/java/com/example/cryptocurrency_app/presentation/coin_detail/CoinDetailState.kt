package com.example.cryptocurrency_app.presentation.coin_detail

import com.example.cryptocurrency_app.domain.model.Coin
import com.example.cryptocurrency_app.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading : Boolean = false,
    val coin : CoinDetail ? = null,
    val error : String = ""
)
