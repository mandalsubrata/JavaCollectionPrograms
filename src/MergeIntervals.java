import java.util.ArrayList;

public class MergeIntervals {

	public static void main(String[] args) {
		Interval i1 = new Interval(1, 3);
		Interval i2 = new Interval(6, 9);
		Interval newInterval = new Interval(2, 5);

		ArrayList<Interval> intervals = new ArrayList<MergeIntervals.Interval>();
		intervals.add(i1);
		intervals.add(i2);

		System.out.println("Ans: " + insert(intervals, newInterval));
	}

	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		ArrayList<Interval> answer = new ArrayList<Interval>();

		for (Interval interval : intervals) {
			

			System.out.println("interval:" + interval);
			System.out.println("newInterval:" + newInterval);

			if (interval.end < newInterval.start) {
				System.out.println("1");
				answer.add(interval);
			} else if (interval.start > newInterval.end) {
				System.out.println("2");
				answer.add(newInterval);
				newInterval = interval;
			} else if (interval.end >= newInterval.start || interval.start <= newInterval.end) {
				System.out.println("3");
				newInterval = new Interval(Math.min(interval.start, newInterval.start),
						Math.max(newInterval.end, interval.end));
			}
		}
		answer.add(newInterval);
		return answer;
	}

	public static class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}

		@Override
		public String toString() {
			return "Interval [start=" + start + ", end=" + end + "]";
		}
	}
}
