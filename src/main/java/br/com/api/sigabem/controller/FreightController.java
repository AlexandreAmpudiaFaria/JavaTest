package br.com.api.sigabem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
}
