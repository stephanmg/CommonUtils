/// package's name
package de.zucker.syntaktischer.utils;

/// imports
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @brief File utilities
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
public class FileUtil {
	/**
	 * @brief copy a file from source to test
	 * @param source
	 * @param dest
	 * @throws IOException
	 */
	@SuppressWarnings("NestedAssignment")
	public static void copyFile(File source, File dest) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} finally {
			is.close();
			os.close();
		}
	}

}
