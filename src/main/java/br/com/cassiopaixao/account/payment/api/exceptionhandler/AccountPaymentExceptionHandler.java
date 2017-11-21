package br.com.cassiopaixao.account.payment.api.exceptionhandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class AccountPaymentExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	private MessageSource messageSource;

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		String messageUser = messageSource.getMessage("message.invalid", null, LocaleContextHolder.getLocale());
		String messageDeveloper = ex.getCause() != null ? ex.getCause().toString() : ex.toString();
		List<Error> errors = Arrays.asList(new Error(messageUser, messageDeveloper));
		return handleExceptionInternal(ex, errors, headers, HttpStatus.BAD_REQUEST, request);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<Error> errors = createListErros(ex.getBindingResult());
		return handleExceptionInternal(ex, errors, headers, HttpStatus.BAD_REQUEST, request);
	}
	
	@ExceptionHandler
	public ResponseEntity<Object> handleEmptyResultDataAccessException(EmptyResultDataAccessException ex, WebRequest webRequest){
		String messageUser = messageSource.getMessage("recurso.nao-encontrado", null, LocaleContextHolder.getLocale());
		String messageDeveloper = ex.toString();
		List<Error> errors = Arrays.asList(new Error(messageUser, messageDeveloper));
		return handleExceptionInternal(ex, errors, new HttpHeaders(), HttpStatus.NOT_FOUND, webRequest);
	}

	private List<Error> createListErros(BindingResult bindingResult) {
		List<Error> errors = new ArrayList<Error>();
		for (FieldError fieldError : bindingResult.getFieldErrors()) {
			String messageUser = messageSource.getMessage(fieldError, LocaleContextHolder.getLocale());
			String messageDeveloper = fieldError.toString();
			errors.add(new Error(messageUser, messageDeveloper));
		}
		return errors;
	}

	public static class Error {

		private String messageUser;
		private String messageDeveloper;

		public Error(String messageUser, String messageDeveloper) {
			this.messageUser = messageUser;
			this.messageDeveloper = messageDeveloper;
		}

		public String getMessageUser() {
			return messageUser;
		}

		public String getMessageDeveloper() {
			return messageDeveloper;
		}

	}
}
