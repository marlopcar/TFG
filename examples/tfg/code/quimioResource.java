// ... More code above ... //

import javax.servlet.http.HttpServletRequest;

// ... More code between ... //

	/**
	* DELETE  /quimioterapias/:id : delete the "id" quimioterapia.
	*	
	* @param id the id of the quimioterapiaDTO to delete
	* @param request the request
	* @return the ResponseEntity with status 200 (OK)
	*/
	@DeleteMapping("/quimioterapias/{id}")
	@Timed	
	public ResponseEntity<Void> deleteQuimioterapia(@PathVariable Long id, HttpServletRequest request) {
		log.debug("REST request to delete Quimioterapia : {}", id);
		quimioterapiaService.delete(id, request.getRemoteAddr());
		return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
	}

	// ... More code below ... //