package fredboat.util.extension

import fredboat.util.TextUtils

fun String.substringPreserveWords(len: Int) = TextUtils.substringPreserveWords(this, len)
fun String.parseTime() = TextUtils.parseTimeString(this)
fun String.asCodeBlock(style: String? = null) = TextUtils.asCodeBlock(this, style)
fun String.escapeAndDefuse() = TextUtils.escapeAndDefuse(this)
fun String.defuse() = TextUtils.defuse(this)
fun String.shorten(size: Int) = TextUtils.shorten(this, size)
fun String.isSplitSelect() = TextUtils.isSplitSelect(this)
