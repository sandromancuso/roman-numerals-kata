package com.codurance;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.codurance.RomanNumeralConverter.romanFor;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class RomanNumeralConverterShould {

    @Test
    @Parameters({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "7, VII",
            "9, IX",
            "10, X",
            "17, XVII",
            "30, XXX",
            "38, XXXVIII",

            "479, CDLXXIX",
            "3999, MMMCMXCIX"
    }) public void
    convert_arabic_numbers_into_their_respective_roman_numeral(int arabic, String roman) {
        assertThat(romanFor(arabic), is(roman));
    }

}