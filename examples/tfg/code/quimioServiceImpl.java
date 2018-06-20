// ... More code above ... //

import com.iecisa.oncosup.repository.PersistenceAuditEventRepository;

// ... More code between ... //

public class QuimioterapiaServiceImpl extends AuditoriaService implements QuimioterapiaService {

	// ... More code between ... //

	private static final String CREAR_QUIMIOTERAPIA = "CREAR QUIMIOTERAPIA";
	private static final String EDITAR_QUIMIOTERAPIA = "EDITAR QUIMIOTERAPIA";
	private static final String ELIMINAR_QUIMIOTERAPIA = "ELIMINAR QUIMIOTERAPIA";


	public QuimioterapiaServiceImpl(QuimioterapiaRepository quimioterapiaRepository, QuimioterapiaMapper quimioterapiaMapper, QuimioterapiaSearchRepository quimioterapiaSearchRepository, TratamientoRepository tratamientoRepository, RamaRepository ramaRepository, FarmacoQuimioRepository farmacoQuimioRepository, FarmacoAsociadoRepository farmacoAsociadoRepository, AuditoriaRepository auditoriaRepository) {
    		FarmacoAsociadoRepository farmacoAsociadoRepository, PersistenceAuditEventRepository persistenceAuditEventRepository) {
		super(persistenceAuditEventRepository);
		// ... More code between ... //
        
	}
	// ... More code between ... //

	public QuimioterapiaDTO save(QuimioterapiaDTO quimioterapiaDTO, boolean update, String ipAddress) {

		// ... More code between ... //
		if (update) {
			createAuditoria(EDITAR_QUIMIOTERAPIA, quimioterapia.getId(), ipAddress);
		} else {
			createAuditoria(CREAR_QUIMIOTERAPIA, quimioterapia.getId(), ipAddress);
		}
		return result;
	}

	// ... More code below ... //
}