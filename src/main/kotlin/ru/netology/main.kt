package ru.netology

import kotlin.math.min

const val MASTERCARD = "MasterCard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "Mir"
const val VKPAY = "VK Pay"

fun main() {
    val sumAmount : Int = 55000
    val sumOldAmount : Int = 7490000
    val cardType : String = MASTERCARD

    val result = calculateCommission(sumAmount, cardType, sumOldAmount)
        println("Комиссия составляет: ${result / 100} руб. ${result % 100} коп.")
}

fun calculateCommission(sumAmount : Int, cardType: String = VKPAY, sumOldAmount: Int = 0): Int {

    val sumTopLimitMastercard : Int = 7500000
    val sumLowLimitMastercard : Int = 30000
    val percentCommissionMastercard : Int = 60
    val sumCommissionMastercard : Int = 2000

    val percentCommissionMir : Int = 75
    val minCommissionMir : Int = 3500

    return when {

        (cardType == MASTERCARD || cardType == MAESTRO) -> {

            val exceedLimit = when {
                (sumOldAmount + sumAmount > sumTopLimitMastercard && sumOldAmount < sumLowLimitMastercard) -> (sumOldAmount + sumAmount - sumTopLimitMastercard) + min(sumLowLimitMastercard - sumOldAmount, sumAmount)
                (sumOldAmount + sumAmount > sumTopLimitMastercard) -> (sumOldAmount + sumAmount - sumTopLimitMastercard)
                (sumOldAmount < sumLowLimitMastercard) -> min(sumLowLimitMastercard - sumOldAmount, sumAmount)
                else -> 0
            }

            if (exceedLimit > 0) exceedLimit * percentCommissionMastercard / 10000 + sumCommissionMastercard else 0
        }

        (cardType == VISA || cardType == MIR) -> {
            if ((sumAmount * percentCommissionMir / 10000) < minCommissionMir) minCommissionMir else sumAmount * percentCommissionMir / 10000
        }
        else -> 0

    }
}