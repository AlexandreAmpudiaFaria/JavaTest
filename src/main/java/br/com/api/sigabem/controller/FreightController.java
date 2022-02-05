package br.com.api.sigabem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.sigabem.service.FreightService;
import br.com.api.sigabem.service.ViaCepClient;

@RestController
@RequestMapping("/frete")
@CrossOrigin(origins = "*")
public class FreightController {

	@Autowired
	private final ViaCepClient viaCepClient;
	private final FreightService freightService;
	
	public FreightController(ViaCepClient viaCepClient, FreightService freightService) {
        this.viaCepClient = viaCepClient;
        this.freightService = freightService;
    }
	
	 @PostMapping("/consulta")
	    public ResponseEntity<FreightResponse>
	    consultaFrete(@RequestBody FreightRequest freightRequest)  {
	        return ResponseEntity.status(HttpStatus.CREATED)
	                .body(freightService.calculaFrete(freightRequest));
	    }
}
