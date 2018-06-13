package org.djbv;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.djbv.entity.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by dborbor on 02/08/2017.
 */
public class Application {

    private static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        List<Attribute<Integer>> atributes =
            Stream.iterate(1, i -> i + 1).map(i -> new Attribute<>("name" + i, Integer.valueOf(1))).limit(10).collect(Collectors.toList());

        atributes.forEach(a -> log.info("Attribute: " + a));

    }
}
