package module.second.collection;

import java.util.LinkedList;

class MyHashSet<T> {
    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList<T>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
    }

    private int getBucketIndex(T key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    public void add(T key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }

    public void remove(T key) {
        int index = getBucketIndex(key);
        if (buckets[index] != null) {
            buckets[index].remove(key);
        }
    }

    public boolean contains(T key) {
        int index = getBucketIndex(key);
        return buckets[index] != null && buckets[index].contains(key);
    }

    public static void main(String[] args) {
        MyHashSet<Integer> set = new MyHashSet<>();
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(30);

        System.out.println(set.contains(20));
        set.remove(20);
        System.out.println(set.contains(20));
    }
}
