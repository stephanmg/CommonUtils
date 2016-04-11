/// package's name
package de.zucker.syntaktischer.utils;

/// imports
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @brief memory utilities
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
public final class MemoryUtil {
	private static final int MIB = (int) Math.pow(1024, 2);
	private static final Runtime RUNTIME = Runtime.getRuntime();
	private static final String NL = System.getProperty("line.separator");

	/**
	 * @brief get the architecture of the JVM 
	 * Note: This could be different from the OS architecture
	 * @return bitness of JVM
	 */
	public static String printBitnessJVM() {
		try {
			Process p = Runtime.getRuntime().exec("java -version");
			try {
				p.waitFor();
			} catch (InterruptedException iex) {
				System.err.println("Error: Could not wait for command: 'java -version': " + iex);
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";
			while ((line = reader.readLine()) != null) {
				if (line.matches(".*64.*")) {
					return "64bit";
				}
				if (line.matches(".*32.*")) {
					return "32bit";
				}
			}
		} catch (IOException ioe) {
			System.err.println("Error: Could not execute command 'java -version' or read from its inputstream: " + ioe);
		}
		return "";
	}

	/**
	 * @brief returns the architecture
	 * @return bitness of OS
	 */
	public static String printBitness() {
		return System.getProperty("os.arch");
	}

	/**
	 * @brief prints formatted heap memory statistics
	 */
	public static void printHeapMemoryStatistics() {
		System.out.println(getHeapMemoryStatistics());
	}

	/**
	 * @brief returns memory information as String
	 * @return
	 */
	public static String getHeapMemoryStatistics() {
		StringBuilder sb = new StringBuilder();
		sb.append("Used memory: ");
		sb.append(getUsedMemory());
		sb.append(NL);
		sb.append("Free memory: ");
		sb.append(getFreeMemory());
		sb.append(NL);
		sb.append("Total memory: ");
		sb.append(getTotalMemory());
		sb.append(NL);
		sb.append("Max memory: ");
		sb.append(getMaxMemory());
		sb.append(NL);
		return sb.toString();
	}

	/**
	 * @brief returns the used memory in MiB
	 * @return
	 */
	public static long getUsedMemory() {
		return getTotalMemory() - getFreeMemory();
	}

	/**
	 * @brief returns the free memory in MiB
	 * @return
	 */
	public static long getFreeMemory() {
		return RUNTIME.freeMemory() / MIB;
	}

	/**
	 * @brief returns the total memory in MiB
	 * @return
	 */
	public static long getTotalMemory() {
		return RUNTIME.totalMemory() / MIB;
	}

	/**
	 * @brief returns the max memory in MiB
	 * @return
	 */
	public static long getMaxMemory() {
		return RUNTIME.maxMemory() / MIB;
	}

}
