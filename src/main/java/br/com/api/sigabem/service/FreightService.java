package br.com.api.sigabem.service;

import org.springframework.stereotype.Service;

import br.com.api.sigabem.repository.FreightRepository;

@Service
@RequiredArgsConstructor
public class FreightService {
	
	private final FreightRepository freightRepository;
	private final ViaCepClient viaCepClient;
	
	
	

}
