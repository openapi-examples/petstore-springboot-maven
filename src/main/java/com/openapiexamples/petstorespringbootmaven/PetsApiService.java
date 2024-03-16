package com.openapiexamples.petstorespringbootmaven;

import com.openapiexamples.petstorespringbootmaven.api.PetsApiDelegate;
import com.openapiexamples.petstorespringbootmaven.openapi.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetsApiService implements PetsApiDelegate {

    @Override
    public ResponseEntity<List<Pet>> listPets(Integer limit) {
        return ResponseEntity.ok(List.of(new Pet(1L, "dog"), new Pet(2L, "cat")));
    }
}
