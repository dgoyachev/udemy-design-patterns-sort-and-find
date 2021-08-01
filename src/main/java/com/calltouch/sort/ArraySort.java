package com.calltouch.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ArraySort {

    private static final Logger logger = LoggerFactory.getLogger(ArraySort.class);

    /**
     * selection search algorithm implementation
     * @param elements input array
     * @return output array
     */
    public static int[] selection(int[] elements) {
        logger.info("selection() elements: {}", Arrays.toString(elements));
        int iterations = 0;
        int len = elements.length;
        for(int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < len; j++) {
                iterations++;
                if(elements[j] < elements[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = elements[minIndex];
            elements[minIndex] = elements[i];
            elements[i] = temp;
        }

        logger.info("selection() result: {}, iterations: {}", Arrays.toString(elements), iterations);
        return elements;
    }

    /**
     * bubble search algorithm implementation
     * @param elements input array
     * @return output array
     */
    public static int[] bubble(int[] elements) {
        logger.info("bubble() elements: {}", Arrays.toString(elements));
        int iterations = 0;
        int len = elements.length;
        for (int i = len - 1; i >= 0; i--) {
            int swaps = 0;
            for(int j = 1; j <= i; j++) {
                iterations++;
                if(elements[j - 1] > elements[j]) {
                    swaps++;
                    int temp = elements[j - 1];
                    elements[j - 1] = elements[j];
                    elements[j] = temp;
                }
            }
            if (swaps == 0) {
                logger.info("bubble() result: {}, iterations: {}", Arrays.toString(elements), iterations);
                return elements;
            }
        }

        logger.info("bubble() result: {}, iterations: {}", Arrays.toString(elements), iterations);
        return elements;
    }

    /**
     * quick search algorithm implementation
     * @param elements input array
     * @return output array
     */
    public static int[] quick(int[] elements, int left, int right) {
        logger.info("quick() elements: {}, left: {}, right: {}", Arrays.toString(elements), left, right);
        if(left < right) {
            int pivot = quickPivot(elements, left, right);
            if(pivot > 1) {
                quick(elements, left, pivot - 1);
            }
            if (pivot + 1 < right){
                quick(elements, pivot + 1, right);
            }
        }

        logger.info("quick() result: {}", Arrays.toString(elements));
        return elements;
    }

    private static int quickPivot(int[] elements, int left, int right) {
        logger.info("quickPivot() elements: {}, left: {}, right: {}", Arrays.toString(elements), left, right);
        int pivot = elements[left];
        logger.info("quickPivot() pivot: {}", pivot);
        while (true) {
            while (elements[left] < pivot) {
                left++;
            }

            while (elements[right] > pivot) {
                right--;
            }

            if(left < right) {
                if(elements[left] == elements[right]) {
                    return right;
                }

                int temp = elements[left];
                elements[left] = elements[right];
                elements[right] = temp;
            }
            else {
                return right;
            }
        }
    }

    /**
     * merge search algorithm implementation
     * @param elements input array
     * @return output array
     */
    public static int[] merge(int[] elements) {
        logger.info("merge() elements: {}", Arrays.toString(elements));
        int[] left, right, result;

        if(elements.length <= 1) {
            return elements;
        }

        int midPoint = elements.length / 2;
        left = new int[midPoint];
        right = (elements.length % 2 == 0) ? new int[midPoint] : new int[midPoint + 1];

        System.arraycopy(elements, 0, left, 0, midPoint);
        System.arraycopy(elements, midPoint, right, 0, elements.length - midPoint);

        left = merge(left);
        right = merge(right);

        result = merge(left, right);

        return result;
    }

    private static int[] merge(int[] left, int[] right) {
        int resultLength = left.length + right.length;
        int[] result = new int[resultLength];
        int indexLeft = 0, indexRight = 0, indexResult = 0;

        while (indexLeft < left.length || indexRight < right.length) {
            if(indexLeft < left.length && indexRight < right.length) {
                if(left[indexLeft] <= right[indexRight]) {
                    result[indexResult++] = left[indexLeft++];
                }
                else {
                    result[indexResult++] = right[indexRight++];
                }
            }
            else if(indexLeft < left.length) {
                result[indexResult++] = left[indexLeft++];
            }
            else {
                result[indexResult++] = right[indexRight++];
            }
        }

        return result;
    }

    /**
     * insertion search algorithm implementation
     * @param elements input array
     * @return output array
     */
    public static int[] insertion(int[] elements) {
        logger.info("insertion() elements: {}", Arrays.toString(elements));
        int length = elements.length;
        int iterations = 0;

        for(int i = 1; i < length; i++) {
            int value = elements[i];
            int j = i - 1;
            iterations++;
            while (j >= 0 && elements[j] > value) {
                iterations++;
                elements[j + 1] = elements[j];
                j--;
            }

            elements[j + 1] = value;
        }

        logger.info("insertion() result: {}, iterations: {}", Arrays.toString(elements), iterations);
        return elements;
    }

    /**
     * radix search algorithm implementation
     * @param elements input array
     * @return output array
     */
    public static int[] radix(int[] elements) {
        logger.info("radix() elements: {}", Arrays.toString(elements));
        int iterations = 0;
        int[] temp = new int[elements.length];
        for(int shift = 31; shift > -1; shift--) {
            iterations++;
            int j = 0;
            for(int i = 0; i < elements.length; i++) {
                iterations++;
                boolean move = (elements[i] << shift) >= 0;
                if((shift == 0) != move) {
                    elements[i - j] = elements[i];
                }
                else {
                    temp[j++] = elements[i];
                }
            }

            System.arraycopy(temp, 0, elements, elements.length - j, j);
        }
        logger.info("radix() result: {}, iterations: {}", Arrays.toString(elements), iterations);
        return elements;
    }

    /**
     * heap search algorithm implementation
     * @param elements input array
     * @return output array
     */
    public static int[] heap(int[] elements) {
        logger.info("heap() elements: {}", Arrays.toString(elements));

        int n = elements.length;
        for(int i = n / 2 - 1; i >= 0; i--) {
            heapify(elements, n, i);
        }
        for(int i = n - 1; i >= 0; i--) {
            swap(elements, 0, i);
            heapify(elements, i, 0);
        }

        logger.info("heap() result: {}", Arrays.toString(elements));
        return elements;
    }

    private static void swap(int[] elements, int index1, int index2) {
        int temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }

    private static void heapify(int[] elements, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && elements[left] > elements[largest]) {
            largest = left;
        }

        if(right < n && elements[right] > elements[largest]) {
            largest = right;
        }

        if(largest != i) {
            swap(elements, i, largest);
            heapify(elements, n, largest);
        }
    }


    /**
     * shell search algorithm implementation
     * @param elements input array
     * @return output array
     */
    public static int[] shell(int[] elements) {
        logger.info("shell() elements: {}", Arrays.toString(elements));
        int iterations = 0;
        for(int gap = elements.length / 2; gap > 0; gap /= 2) {
            iterations++;
            for(int i = gap; i < elements.length; i++) {
                iterations++;
                int temp = elements[i];
                int j;
                for(j = i; j >= gap && elements[j - gap] > temp; j -= gap) {
                    iterations++;
                    elements[j] = elements[j - gap];
                }
                elements[j] = temp;
            }
        }
        logger.info("shell() result: {}, iterations: {}", Arrays.toString(elements), iterations);
        return elements;
    }
}
