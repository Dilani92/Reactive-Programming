package com.xventure.ReactiveProgramming;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveTutorial {

    private Mono<String> testMono(){
        return Mono.just("java").log();
    }

    public static void main(String[] args) {
        ReactiveTutorial reactiveTutorial = new ReactiveTutorial();
        reactiveTutorial.testMono().subscribe(data -> System.out.println(data));

    }
}
