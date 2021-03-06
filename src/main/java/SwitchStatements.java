import java.util.List;

public class SwitchStatements {
    public class Problem {
        public List<String> getSortedData(String searchType, List<String> data) {
            List<String> sortedData = null;

            switch (searchType) {
                case "BubbleSort":
                    // perform bubble sort and assign to data.
                    break;
                case "HeapSort":
                    // perform heap sort and assign to data.
                    break;
                case "MergeSort":
                    // perform merge sort and assign to data.
                    break;
                case "InsertionSort":
                    // perform insertion sort and assign to data.
                    break;
            }
            return sortedData;
        }

    }

    public static class Solution {
        // polymorphism, strategy pattern
        public interface SortData {
            List<String> getSortedData(List<String> data);
        }
        public class BubbleSortData implements  SortData {
            @Override
            public List<String> getSortedData(List<String> data) {
                // implement bubble sort and sort the data.
                return data;
            }
        }
        public class HeapSortData implements  SortData {
            @Override
            public List<String> getSortedData(List<String> data) {
                // implement heap sort and sort the data.
                return data;
            }
        }
        public class MergeSortData implements  SortData {
            @Override
            public List<String> getSortedData(List<String> data) {
                // implement merge sort and sort the data.
                return data;
            }
        }
        public class InsertionSortData implements  SortData {
            @Override
            public List<String> getSortedData(List<String> data) {
                // implement insertion sort and sort the data.
                return data;
            }
        }
    }
}
