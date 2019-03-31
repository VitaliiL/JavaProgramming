package ru.academits.ArrayList.LV.arrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class MyArrayListTest {
    private MyArrayList<Object> list;
    private static final int DEFAULT_CAPACITY = 3;
    private MyArrayList<Object> list2;
    private MyArrayList<Object> list3;

    @Before
    public void createNewListAndSetSizeViaConstructor() {
        list = new MyArrayList<>();
        list2 = new MyArrayList<>(DEFAULT_CAPACITY);

        list3 = new MyArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
    }

    @Test
    public void add() {
        Assert.assertTrue((int) list3.get(0) == 1 && (int) list3.get(1) == 2 && (int) list3.get(2) == 3 && list3.size() == 3);
    }

    @Test
    public void firstConstructorTest() {
        Assert.assertNotNull(list);
    }

    @Test
    public void secondConstructorTest() {
        Assert.assertNotNull(list2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void secondConstructorCapacityShouldThanZero1Test() {
        new MyArrayList<>(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void secondConstructorCapacityShouldThanZero2Test() {
        new MyArrayList<>(0);
    }

    @Test
    public void equalsListCapacityViaConstructor() {
        Assert.assertEquals(DEFAULT_CAPACITY, list2.getCapacity());
    }

    @Test
    public void equalsObjectSizeViaAddTest() {
        Assert.assertEquals(3, list3.size());
    }

    @Test
    public void isEmptyOrNotListTest() {
        Assert.assertTrue(list.isEmpty());

        list.add(1);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void containsOrNotElementList() {
        list.add(34);

        Assert.assertTrue(list.contains(34));
        Assert.assertFalse(list.contains(1));
    }

    @Test
    public void iteratorTest() {
        Iterator<Object> iterator = list3.iterator();
        StringBuilder sb = new StringBuilder();

        while (iterator.hasNext()) {
            sb.append(iterator.next()).append(";");
        }

        Assert.assertEquals(sb.toString(), "1;2;3;");
    }

    @Test
    public void toArray() {
        Object[] array = list3.toArray();

        Assert.assertTrue((int) array[0] == 1 && (int) array[1] == 2 && (int) array[2] == 3 && array.length == 3);
    }

    @Test
    public void removeElementTrueTest() {
        Assert.assertTrue(list3.remove(Integer.valueOf(2)));
    }

    @Test
    public void removeElementFalseTest() {
        Assert.assertFalse(list3.remove(Integer.valueOf(5)));
    }

    @Test
    public void containsAllTest() {
        MyArrayList<Integer> listComparison = new MyArrayList<>();
        listComparison.add(1);
        listComparison.add(2);

        Assert.assertTrue(list3.containsAll(listComparison));
    }

    @Test
    public void addAll() {
    }

    @Test
    public void addAll1() {
    }

    @Test
    public void removeAll() {
    }

    @Test
    public void retainAll() {
    }

    @Test
    public void clearListTest() {
        list3.clear();
        Assert.assertEquals(0, list3.size());
    }

    @Test
    public void get() {
    }

    @Test
    public void set() {
    }

    @Test
    public void getCapacity() {
    }

    @Test
    public void add1() {
    }

    @Test
    public void remove1() {
    }

    @Test
    public void indexOf() {
    }

    @Test
    public void lastIndexOf() {
    }

    @Test
    public void ensureCapacity() {
    }

    @Test
    public void trimToSize() {
    }
}