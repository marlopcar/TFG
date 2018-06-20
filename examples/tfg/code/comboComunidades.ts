<!-- More code above -->
<div class="half-block">
	<div class="form-group half-item">
		<label class="form-control-label" jhiTranslate="oncosupApp.paciente.comunidadActual" for="field_comunidadActual">Comunidad Actual</label>
		<select class="form-control" id="field_comunidadActual" name="comunidadActual" (change)="onComunidadActual(paciente.comunidadActualId)" [(ngModel)]="paciente.comunidadActualId" >
			<option [ngValue]="null"></option>
			<option [ngValue]="comunidadAutonomaOption.id" *ngFor="let comunidadAutonomaOption of comunidadesAutonomas; trackBy: trackComunidadAutonomaById">{{comunidadAutonomaOption.nombre}}</option>
		</select>
	</div>
	<div class="form-group half-item">
		<label class="form-control-label" jhiTranslate="oncosupApp.paciente.provinciaActual" for="field_provinciaActual">Provincia Actual</label>
		<select class="form-control" id="field_provinciaActual" name="provinciaActual" [(ngModel)]="paciente.provinciaActualId" >
			<option [ngValue]="null"></option>
			<option [ngValue]="provinciaPaisOption.id" *ngFor="let provinciaPaisOption of provinciasPaisActual; trackBy: trackProvinciaPaisById">{{provinciaPaisOption.nombre}}</option>
		</select>
	</div>
</div>
<!-- More code above -->