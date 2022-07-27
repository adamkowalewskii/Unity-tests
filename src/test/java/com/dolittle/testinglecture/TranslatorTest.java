package com.dolittle.testinglecture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TranslatorTest {
    @Mock
    private PolishToEnglishDictionary dictionary;

    @Test
    void shouldTranslateWhenTranslatedWordExistsInDictionary() {
        // given
        Translator translator = new Translator(new TestDictionary());
        String input = "someWord";
        // when
        String translate = translator.translate(input);
        // then
        Assertions.assertEquals("translated", translate);
    }

    @Test
    void shouldTranslateWhenTranslatedWordExistsInDictionary2() {
        // given
        Translator translator = new Translator(dictionary);
        String expected = "someTrasnsaltion";
        when(dictionary.translate(anyString())).thenReturn(expected);
        // when
        String actualTranslation = translator.translate("input");
        // then
        Assertions.assertEquals(expected, actualTranslation);

    }

    private class TestDictionary implements Dictionary {
        @Override
        public String translate(String word) {
            return "translated";
        }
    }

}