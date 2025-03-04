package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createBeer(@RequestBody BeerDto beerDto) {
        //todo implementation
    }

    @PutMapping("/{beerId}")
    @ResponseStatus(HttpStatus.OK)
    public void updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
        //todo implementation
    }
}
