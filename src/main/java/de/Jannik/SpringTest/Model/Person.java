package de.Jannik.SpringTest.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class Person {
    private final UUID id;
    @Getter
    private final String name;

}
