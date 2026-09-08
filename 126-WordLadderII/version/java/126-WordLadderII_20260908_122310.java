// Last updated: 9/8/2026, 12:23:10 PM
1class MedianFinder {
2    PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
3    PriorityQueue<Integer> large = new PriorityQueue<>();
4    public MedianFinder() {
5    }
6    public void addNum(int num) {
7        small.add(num);
8        large.add(small.poll());
9        if (large.size() > small.size())
10            small.add(large.poll());
11    }
12    public double findMedian() {
13        if (small.size() > large.size())
14            return small.peek();
15        return (small.peek() + large.peek()) / 2.0;
16    }
17}