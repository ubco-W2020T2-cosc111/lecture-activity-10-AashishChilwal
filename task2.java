import java.util.Random;
public class task2 {
	    public static void main(String[] args) {
	        Random random = new Random();
	        int[] random_numbers = new int[1000000];
	        
	        for(int i = 0; i < random_numbers.length; i++) {
	            random_numbers[i] = random.nextInt(1000);
	        }
	

	        StopWatch stopWatch = new StopWatch();
	        selectionSort(random_numbers);
	        stopWatch.stop();
	

	        System.out.println("The elapse time is " + stopWatch.getElapsedTime() + "mms");
	    }
	

	    public static void selectionSort(int[] arr) {
	        for (int i = 0; i < arr.length; i++) { 
	            int c_min = arr[i]; 
	            int c_min_index = i;
	

	            for (int j = i + 1; j < arr.length; j++) {
	                if (c_min > arr[j]) {
	                    c_min_index = arr[j];
	                    c_min_index = j;
	                }
	            }   
	

	            if (c_min_index != i) {
	                arr[c_min_index] = arr[i];
	                arr[i] = c_min;
	            }
	        }
	    }
	}
	

	

	class StopWatch {
	    private long startTime = System.currentTimeMillis();
	    private long endTime = startTime;
	

	

	    public StopWatch() {
	    }
	

	    public long getStartTime() {
	        return this.startTime;
	    }
	

	    public long getEndTime() {
	        return this.endTime;
	    }
	

	    public void start() {
	        this.startTime = System.currentTimeMillis();
	    }
	

	    public void stop() {
	        this.endTime = System.currentTimeMillis();
	    }
	

	    public long getElapsedTime() {
	        return this.endTime - this.startTime;
	    }
	}
