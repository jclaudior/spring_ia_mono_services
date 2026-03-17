package com.jcr.monoservices.shared.util;

import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

public class SortUtils {

    public static Sort createSort(List<String> sortParams) {

        if (sortParams == null || sortParams.isEmpty()) {
            return Sort.unsorted();
        }

        List<Sort.Order> orders = new ArrayList<>();

        for (String param : sortParams) {

            if (param == null || param.isBlank()) {
                continue;
            }

            String[] parts = param.split(",");

            String field = parts[0];
            Sort.Direction direction = Sort.Direction.ASC;

            if (parts.length > 1) {
                direction = Sort.Direction.fromString(parts[1]);
            }

            orders.add(new Sort.Order(direction, field));
        }

        return Sort.by(orders);
    }
}