package com.calltouch.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ListSearch {

    private static final Logger logger = LoggerFactory.getLogger(ListSearch.class);

    /**
     * @param elements list to be linear searched
     * @param x element to find
     * @return -1 if x not in elements and index of x in other case
     */
    public static int linear(List<Integer> elements, int x) {
        logger.info("linear() elements: {}, x: {}", elements, x);
        int length = elements.size();
        int iterations = 0;
        for(int i = 0; i < length; i++) {
            iterations++;
            if(elements.get(i) == x) {
                logger.info("linear() iterations: {}, result: {}", iterations, i);
                return i;
            }
        }
        logger.info("linear() iterations: {}, result: {}", iterations, -1);
        return -1;
    }

    /**
     * @param elements list to be binary searched, should be sorted
     * @param x element to find
     * @return -1 if x not in elements and index of x in other case
     */
    public static int binary(List<Integer> elements, int x) {
        logger.info("binary() elements: {}, x: {}", elements, x);
        int start = 0;
        int stop = elements.size() - 1;
        int middle = (start + stop) / 2;
        int iterations = 0;
        while(start < stop) {
            iterations++;
            if(elements.get(middle) == x) {
                logger.info("binary() iterations: {}, result: {}", iterations, middle);
                return middle;
            }

            if(elements.get(middle) > x) {
                stop = middle - 1;
            }

            if(elements.get(middle) < x) {
                start = middle + 1;
            }

            middle = (start + stop) / 2;
        }

        int result = (elements.get(middle) != x) ? -1 : middle;
        logger.info("binary() iterations: {}, result: {}", iterations, result);
        return result;
    }

    /**
     * @param elements list to be interpolated binary searched, should be sorted
     * @param x element to find
     * @return -1 if x not in elements and index of x in other case
     */
    public static int interpolation(List<Integer> elements, int x) {
        logger.info("interpolation() elements: {}, x: {}", elements, x);
        int low = 0;
        int high = elements.size() - 1;
        int iterations = 0;

        while (low <= high && x >= elements.get(low) && x <= elements.get(high)) {
            iterations++;
            if(low == high) {
                if(elements.get(low) == x) {
                    logger.info("interpolation() iterations: {}, result: {}", iterations, low);
                    return low;
                }
                else {
                    return -1;
                }
            }

            int pos = low + (high - low) / (elements.get(high) - elements.get(low)) * (x - elements.get(low));

            if(elements.get(pos) == x) {
                logger.info("interpolation() iterations: {}, result: {}", iterations, pos);
                return pos;
            }

            if (elements.get(pos) < x) {
                low = pos + 1;
            }
            else {
                high = pos - 1;
            }
        }

        logger.info("interpolation() iterations: {}, result: {}", iterations, -1);
        return -1;
    }
}
