<!-- More code above -->

<div class="item-diagnostico">
	<span class="item-titulo" jhiTranslate="oncosupApp.paciente.diagnostico">Diagnostico</span><br>
	<div *ngIf="paciente.diagnosticoId">
		<a [routerLink]="['/diagnostico', paciente.diagnosticoId]">
			<span jhiTranslate="{{'oncosupApp.PatologiaOncologica.' + paciente.diagnosticoNombre}}"></span>
		</a>
		<span> - {{paciente.diagnosticoEspecifico}}</span>
	</div>
	<!-- More code between -->
</div>

<!-- More code below -->