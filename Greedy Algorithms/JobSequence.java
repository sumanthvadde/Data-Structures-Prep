import java.util.*;
class Job
{
	private int taskID, deadline, profit;

	public Job(int taskID, int deadline, int profit) {
		this.taskID = taskID;
		this.deadline = deadline;
		this.profit = profit;
	}

	public int getDeadline() {
		return deadline;
	}

	public int getProfit() {
		return profit;
	}

	public int getTaskID() {
		return taskID;
	}
};

class JobSequence
{
	public static int scheduleJobs(List<Job> jobs, int T)
	{
		int profit = 0;
		int[] slot = new int[T];
		Arrays.fill(slot, -1);
		
		for (Job job: jobs)
		{
			// search for next free slot and map the task to that slot
			for (int j = job.getDeadline() - 1; j >= 0; j--)
			{
				if (j < T && slot[j] == -1)
				{
					slot[j] = job.getTaskID();
					profit += job.getProfit();
					break;
				}
			}
		}

		System.out.println("The Scheduled jobs are - ");
		Arrays.stream(slot)			
				.filter(val -> val != -1)
				.forEach(System.out::println);

		return profit;
	}

	public static void main(String[] args)
	{
		List<Job> jobs = Arrays.asList(
				new Job(1, 9, 15), new Job(2, 2, 2),
				new Job(3, 5, 18), new Job(4, 7, 1),
				new Job(5, 4, 25), new Job(6, 2, 20),
				new Job(7, 5, 8), new Job(8, 7, 10),
				new Job(9, 4, 12), new Job(10, 3, 5)
		);

		
		final int T = 15;

		
		Collections.sort(jobs, (a, b) -> b.getProfit() - a.getProfit());

		System.out.println("\nTotal Profit is: " + scheduleJobs(jobs, T));
	}
}