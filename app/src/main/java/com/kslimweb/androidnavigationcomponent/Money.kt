package com.kslimweb.androidnavigationcomponent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

@Parcelize
data class Money(val amount: BigDecimal) : Parcelable