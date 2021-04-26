package com.example.stream.service.impl;

import com.example.stream.service.ForEachService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ForEachServiceImpl implements ForEachService {

    @Override
    public ArrayList<Integer> main() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        return new ArrayList(numbers.stream().map(i-> i*i).distinct().collect(Collectors.toList()));
    }
}
