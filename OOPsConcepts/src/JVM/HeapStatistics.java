package JVM;

public class HeapStatistics {

	public static void main(String[] args) {

		/**
		 * We can get all heap memory detail using Runtime class.
		 * It's present in java.lang package.
		 */
		Runtime runTime = Runtime.getRuntime();
		long maxMemory = runTime.maxMemory();
		long totalMem = runTime.totalMemory();
		long freeMem = runTime.freeMemory();
		
		long mb = 1024*1024;
		System.out.println("Max heap memory :" + (maxMemory/mb) + " mb");
		System.out.println("Total heap memory :" + (totalMem/mb) + " mb");
		System.out.println("Free heap memory :" + (freeMem/mb) + " mb");
		System.out.println("Consumed memory :" + ((totalMem - freeMem)/mb) + " mb");
		
	}

}
