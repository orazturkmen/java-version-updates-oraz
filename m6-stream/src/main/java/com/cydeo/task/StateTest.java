package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {
        State state = new State();
        state.addCity("Ashkabad");
        state.addCity("Kerki");
        state.addCity("Turkmenabad");
        state.addCity("Mary");

        State state2 = new State();
        state2.addCity("AstanaBaba");
        state2.addCity("Balkhan");
        state2.addCity("BayramAli");
        state2.addCity("DashOghuz");

        List<State> list = Arrays.asList(state,state2);

        list.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
