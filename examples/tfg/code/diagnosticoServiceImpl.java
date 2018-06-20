// ... More code above ... //

	public DiagnosticoDTO save(DiagnosticoDTO diagnosticoDTO) {
		log.debug("Request to save Diagnostico : {}", diagnosticoDTO);
		Diagnostico diagnostico = diagnosticoMapper.toEntity(diagnosticoDTO);
		diagnostico = diagnosticoRepository.save(diagnostico);
		DiagnosticoDTO result = diagnosticoMapper.toDto(diagnostico);
		diagnosticoSearchRepository.save(diagnostico);
        
		Paciente  paciente = pacienteRepository.findOne(diagnosticoDTO.getPacienteId());
		paciente.setDiagnostico(diagnostico);
		pacienteRepository.saveAndFlush(paciente);
        
		return result;
	}

// ... More code below ... //
