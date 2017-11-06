package com.werfad.utils

import java.util.*

fun String.findAll(c: Char): List<Int> {
    val res = ArrayList<Int>()
    var index = indexOf(c)
    while (index >= 0) {
        res.add(index)
        index = indexOf(c, index + 1)
    }
    return res
}

fun String.findAll(find: String): List<Int> {
    val res = ArrayList<Int>()
    var index = indexOf(find)
    while (index >= 0) {
        res.add(index)
        index = indexOf(find, index + 1)
    }
    return res
}