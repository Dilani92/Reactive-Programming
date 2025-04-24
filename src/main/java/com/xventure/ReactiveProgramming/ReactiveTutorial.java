package com.xventure.ReactiveProgramming;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Locale;

public class ReactiveTutorial {

    private Mono<String> testMono(){
        return Mono.just("java").log();
    }

    private Flux<String> testFlux(){
        List<String> programmingLang = List.of("Java" , "Spring" , "MongoDB" , "Maven" , "C++");
        return Flux.fromIterable(programmingLang);
    }

    private Flux<String> fluxMap(){
        Flux<String> flux = Flux.just("java" , "Spring" , "mongoDB" , "Maven" , "C++");
        return flux.map(s -> s.toUpperCase(Locale.ROOT));
    }

    private Flux<String> fluxFlatMap(){
        Flux<String> flux = Flux.just("java" , "Spring" , "mongoDB" , "Maven" , "C++");
        return flux.flatMap(s -> Mono.just(s.toUpperCase()));
    }

    public static void main(String[] args) {
        ReactiveTutorial reactiveTutorial = new ReactiveTutorial();
        reactiveTutorial.testMono().subscribe(System.out::println);

        reactiveTutorial.fluxFlatMap().subscribe(
                System.out::println
        );
    }
}
