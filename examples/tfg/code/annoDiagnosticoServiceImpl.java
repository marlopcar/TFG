// ... More code above ... //

public DiagnosticoDTO save(DiagnosticoDTO diagnosticoDTO, boolean update) {
	log.debug("Request to save Diagnostico : {}", diagnosticoDTO);
	Diagnostico diagnostico = diagnosticoMapper.toEntity(diagnosticoDTO);
	diagnostico = diagnosticoRepository.save(diagnostico);
	DiagnosticoDTO result = diagnosticoMapper.toDto(diagnostico);
	diagnosticoSearchRepository.save(diagnostico);

	Paciente  paciente = pacienteRepository.findOne(diagnosticoDTO.getPacienteId());
	paciente.setAnnoDiagnostico(Integer.toString(diagnostico.getFechaDiagnostico().getYear)));

	if (update) {
		createAuditoria(EDITAR_DIAGNOSTICO, diagnostico.getId(), ipAddress);
	} else {
		createAuditoria(CREAR_DIAGNOSTICO, diagnostico.getId(), ipAddress);
		paciente.setDiagnostico(diagnostico);
	}
	pacienteRepository.saveAndFlush(paciente);
 	return result;
}

// ... More code below ... //