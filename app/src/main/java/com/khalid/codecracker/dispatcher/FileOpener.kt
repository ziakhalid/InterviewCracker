package com.khalid.codecracker.dispatcher

import java.io.IOException
import java.io.InputStream

interface FileOpener {
	@Throws(IOException::class)
	fun openFile(filename: String): InputStream
}
