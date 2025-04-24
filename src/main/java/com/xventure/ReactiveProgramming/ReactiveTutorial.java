package com.xventure.ReactiveProgramming;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveTutorial {

    private Mono<String> testMono(){
        return Mono.just("java").log();
    }

    private Flux<String> testFlux(){
        return Flux.just("Java" , "Spring" , "MongoDB" , "Maven" , "C++");
    }

    public static void main(String[] args) {
        ReactiveTutorial reactiveTutorial = new ReactiveTutorial();
        reactiveTutorial.testMono().subscribe(data -> System.out.println(data));

        reactiveTutorial.testFlux().subscribe(
                System.out::println
        );
    }
}
