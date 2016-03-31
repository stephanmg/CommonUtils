/// package's name
package de.zucker.syntaktischer.utils;

/**
 * @brief Memory utilities
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
public final class MemoryUtil {
	/// private static members
	private static final int MIB = (int) Math.pow(1024, 2);
	private static final Runtime RUNTIME = Runtime.getRuntime();
	private static final String NL = System.getProperty("line.separator");

	/**
	 * @brief ctor
	 */
	private MemoryUtil() {

	}

	/**
	 * @brief TODO figure out
	 * @return
	 */
	public static String printBitnessJVM() {
		return "";
	}

	/**
	 * @brief returns the architecture
	 * @return
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
