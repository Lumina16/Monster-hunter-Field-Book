package com.lumina.monsterhunterfieldbook

import java.text.Normalizer
import java.util.Locale
import kotlin.math.min

object SearchRanking {
    fun normalise(text: String): String = Normalizer.normalize(text, Normalizer.Form.NFD)
        .replace(Regex("\\p{M}+"), "").lowercase(Locale.ROOT).replace(Regex("[’']"), "").replace(Regex("[^a-z0-9 ]"), " ")
        .replace(Regex("\\s+"), " ").trim()
    fun tokens(text: String): List<String> = normalise(text).split(' ').filter { it.isNotBlank() }.take(12)
    fun distance(a: String, b: String): Int {
        if (kotlin.math.abs(a.length-b.length)>3) return 4
        var row=IntArray(b.length+1){it}
        a.forEachIndexed { i, x ->
            val next=IntArray(b.length+1);next[0]=i+1
            b.forEachIndexed { j, y -> next[j+1]=min(min(next[j]+1,row[j+1]+1),row[j]+if(x==y)0 else 1) }
            row=next
        }
        return row[b.length]
    }
    fun rank(name: String, query: String): Int {
        val n=normalise(name);val q=normalise(query)
        return when {n==q->0;n.startsWith(q)->1;n.contains(q)->2;tokens(q).all{n.contains(it)}->3;else->10}
    }
}
