// ... More code above ... //
	onComunidadActual(selectedValue) {
		this.provinciaPaisActual = [];
		for (let i = 0; i < this.provinciapais.length; i++) {
			if (this.provinciapais[i].comunidadAutonomaId === selectedValue) {
				this.provinciaPaisActual.push(this.provinciapais[i]);
			}
		}
	}
// ... More code below ... //