package com.lumina.monsterhunterfieldbook

import org.junit.Assert.*
import org.junit.Test

class SearchRankingTest {
    @Test fun exactNamesComeBeforePartialNames(){
        assertTrue(SearchRanking.rank("Rathalos","Rathalos")<SearchRanking.rank("Azure Rathalos","Rathalos"))
        assertTrue(SearchRanking.rank("Iron Sword I","iron sword")<SearchRanking.rank("Chrome Iron Sword","iron sword"))
    }
    @Test fun minorSpellingMistakesAreBounded(){
        assertEquals(1,SearchRanking.distance("rathalos","rathlos"))
        assertTrue(SearchRanking.distance("rathalos","potion")>2)
    }
    @Test fun untrustedQueryPunctuationCannotBecomeFtsSyntax(){
        assertEquals(listOf("rathalos","or","1"),SearchRanking.tokens("Rathalos\" OR * 1"))
        assertEquals("elders recess",SearchRanking.normalise("Élder’s Recess"))
    }
}
