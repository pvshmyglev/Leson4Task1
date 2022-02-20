package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateCommissionMasterCardТоpGrade() {

        val expectedValue = 2270

        val sumAmount : Int = 55000
        val sumOldAmount : Int = 7490000
        val cardType : String = MASTERCARD

        val result = calculateCommission(sumAmount, cardType, sumOldAmount)

        assertEquals(expectedValue, result)

    }

    @Test
    fun calculateCommissionMasterCardLowGrade() {

        val expectedValue = 2180

        val sumAmount : Int = 55000
        val sumOldAmount : Int = 0
        val cardType : String = MASTERCARD

        val result = calculateCommission(sumAmount, cardType, sumOldAmount)

        assertEquals(expectedValue, result)

    }

    @Test
    fun calculateCommissionMasterCardТоpLowGrade() {

        val expectedValue = 2780

        val sumAmount : Int = 7600000
        val sumOldAmount : Int = 0
        val cardType : String = MASTERCARD

        val result = calculateCommission(sumAmount, cardType, sumOldAmount)

        assertEquals(expectedValue, result)

    }


    @Test
    fun calculateCommissionMasterCardNotТоpLowGrade() {

        val expectedValue = 0

        val sumAmount : Int = 30000
        val sumOldAmount : Int = 35000
        val cardType : String = MASTERCARD

        val result = calculateCommission(sumAmount, cardType, sumOldAmount)

        assertEquals(expectedValue, result)

    }

    @Test
    fun calculateCommissionMaestroТоpGrade() {

        val expectedValue = 2270

        val sumAmount : Int = 55000
        val sumOldAmount : Int = 7490000
        val cardType : String = MAESTRO

        val result = calculateCommission(sumAmount, cardType, sumOldAmount)

        assertEquals(expectedValue, result)

    }

    @Test
    fun calculateCommissionMaestroLowGrade() {

        val expectedValue = 2180

        val sumAmount : Int = 55000
        val sumOldAmount : Int = 0
        val cardType : String = MAESTRO

        val result = calculateCommission(sumAmount, cardType, sumOldAmount)

        assertEquals(expectedValue, result)

    }

    @Test
    fun calculateCommissionMaestroТоpLowGrade() {

        val expectedValue = 2780

        val sumAmount : Int = 7600000
        val sumOldAmount : Int = 0
        val cardType : String = MAESTRO

        val result = calculateCommission(sumAmount, cardType, sumOldAmount)

        assertEquals(expectedValue, result)

    }


    @Test
    fun calculateCommissionMaestroNotТоpLowGrade() {

        val expectedValue = 0

        val sumAmount : Int = 30000
        val sumOldAmount : Int = 35000
        val cardType : String = MAESTRO

        val result = calculateCommission(sumAmount, cardType, sumOldAmount)

        assertEquals(expectedValue, result)

    }

    @Test
    fun calculateCommissionVisaMinCommission() {

        val expectedValue = 3500

        val sumAmount : Int = 550
        val sumOldAmount : Int = 7490000
        val cardType : String = VISA

        val result = calculateCommission(sumAmount, cardType, sumOldAmount)

        assertEquals(expectedValue, result)

    }

    @Test
    fun calculateCommissionVisaNotMinCommission() {

        val expectedValue = 7500

        val sumAmount : Int = 1000000
        val sumOldAmount : Int = 7490000
        val cardType : String = VISA

        val result = calculateCommission(sumAmount, cardType, sumOldAmount)

        assertEquals(expectedValue, result)

    }

    @Test
    fun calculateCommissionMirMinCommission() {

        val expectedValue = 3500

        val sumAmount : Int = 550
        val sumOldAmount : Int = 7490000
        val cardType : String = MIR

        val result = calculateCommission(sumAmount, cardType, sumOldAmount)

        assertEquals(expectedValue, result)

    }

    @Test
    fun calculateCommissionMirNotMinCommission() {

        val expectedValue = 7500

        val sumAmount : Int = 1000000
        val sumOldAmount : Int = 7490000
        val cardType : String = MIR

        val result = calculateCommission(sumAmount, cardType, sumOldAmount)

        assertEquals(expectedValue, result)

    }

    @Test
    fun calculateCommissionVK() {

        val expectedValue = 0

        val sumAmount : Int = 550
        val sumOldAmount : Int = 7490000
        val cardType : String = VKPAY

        val result = calculateCommission(sumAmount, cardType, sumOldAmount)

        assertEquals(expectedValue, result)

    }

    @Test
    fun calculateCommissionDefaultAll() {

        val expectedValue = 0

        val sumAmount : Int = 550

        val result = calculateCommission(sumAmount)

        assertEquals(expectedValue, result)

    }

    @Test
    fun calculateCommissionDefaultType() {

        val expectedValue = 3500

        val sumAmount : Int = 550
        val cardType : String = MIR

        val result = calculateCommission(sumAmount, cardType)

        assertEquals(expectedValue, result)

    }

    @Test
    fun calculateCommissionDefaultOldAmount() {

        val expectedValue = 0

        val sumAmount : Int = 550
        val sumOldAmount : Int = 7490000
        val result = calculateCommission(sumAmount = sumAmount, sumOldAmount = sumOldAmount)

        assertEquals(expectedValue, result)

    }

}