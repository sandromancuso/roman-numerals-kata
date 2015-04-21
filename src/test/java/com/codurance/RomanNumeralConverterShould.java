package com.codurance;

import org.junit.Test;

import static com.codurance.RomanNumeralConverter.romanFor;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralConverterShould {

    @Test public void
    generate_a_roman_numeral_for_a_given_arabic_number() {
        assertThat(romanFor(1), is("I"));
        assertThat(romanFor(2), is("II"));
        assertThat(romanFor(3), is("III"));
        assertThat(romanFor(4), is("IV"));
        assertThat(romanFor(5), is("V"));
        assertThat(romanFor(7), is("VII"));
        assertThat(romanFor(9), is("IX"));
        assertThat(romanFor(10), is("X"));
        assertThat(romanFor(18), is("XVIII"));
        assertThat(romanFor(30), is("XXX"));

        assertThat(romanFor(2494), is("MMCDXCIV"));
        assertThat(romanFor(3548), is("MMMDXLVIII"));
    }

}