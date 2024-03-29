package com.tom.week04.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7, 5, 3, 5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1, 2, 3, 4, 5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

  @Test
  void testAdd() {
    assertEquals(2, extension.add(1, 1));
  }

  @Test
  void testMaxOfThree() {
    assertEquals(3, extension.maxOfThree(1, 3, 1));
  }

  @Test
  void testOddMedian() {
    assertEquals(2, extension.median(Arrays.asList(1, 2, 3)));
  }

  @Test
  void testEvenMedian() {
    assertEquals(3, extension.median(Arrays.asList(1, 2, 4, 6)));
  }

  @Test
  void testVowel() {
    // 'Y' is "sometimes" also a vowel https://en.wikipedia.org/wiki/Vowel
    assertTrue(extension.isVowel('y'));
  }
}