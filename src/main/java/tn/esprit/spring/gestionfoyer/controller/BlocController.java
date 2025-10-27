package tn.esprit.spring.gestionfoyer.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyer.Service.Interface.IBlocService;
import tn.esprit.spring.gestionfoyer.entity.Bloc;

import java.util.List;
@Tag(name = "Gestion Bloc Mouhib")
@RestController
@AllArgsConstructor
@RequestMapping("blocController")
public class BlocController {

    IBlocService blocService;
    @Operation(description = "My Description - Mouhib")
    @GetMapping
    public List<Bloc> retrieveBlocs() {
        return blocService.retrieveBlocs();
    }
    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }
    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }
    @GetMapping ("/retrieveBloc/{idBloc}")
    public Bloc retrieveBloc(@PathVariable long idBloc) {
        return blocService.retrieveBloc(idBloc);
    }
    @DeleteMapping("/removeBloc/{idBloc}")
    public void removeBloc(@PathVariable long idBloc) {
        blocService.removeBloc(idBloc);
    }


}
