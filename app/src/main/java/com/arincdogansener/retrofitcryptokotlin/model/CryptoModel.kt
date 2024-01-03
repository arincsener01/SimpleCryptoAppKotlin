package com.arincdogansener.retrofitcryptokotlin.model

//Data sınıfı amacı içine veri çekip işleyebileceğimiz bir yapı oluşturmak
data class CryptoModel(val currency: String, val price: String)
//Belirlediğimiz değişkenler çekeceğimiz data ile aynı isimdeyse @SerializedName gibi bir şey yapmamıza gerek yok
