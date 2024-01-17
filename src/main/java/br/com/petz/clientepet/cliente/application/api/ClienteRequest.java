package br.com.petz.clientepet.cliente.application.api;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.petz.clientepet.cliente.domain.Sexo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Value;

@Value
public class ClienteRequest {

	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
	@Getter
	private String telefone;
	@Getter
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	@CPF
	private String cpf;

	@NotNull
	@Getter(value = AccessLevel.NONE)
	private Boolean aceitaTermos;
}
