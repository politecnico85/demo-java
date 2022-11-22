package com.example.demo;

import com.example.demo.repository.PersonaRepository;
import com.example.demo.utils.ProvinciasEcuador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private final PersonaRepository personaRepository;

    public MyRunner(PersonaRepository personaRepository){ this.personaRepository = personaRepository;}

    @Override
    public void run(String... args) throws Exception {
        personaRepository.findAll().forEach(persona -> {
            logger.info("'"+ persona.getNombreCompleto()+"'" +";"+persona.getIdentificacion());
        });

        personaRepository.findAll().stream()
                            .map(s -> s.getIdentificacion().startsWith(ProvinciasEcuador.AZUAY.getCodigo()))
                            .forEach(persona -> {
                                logger.info(persona.toString());
                            });

    }
}
