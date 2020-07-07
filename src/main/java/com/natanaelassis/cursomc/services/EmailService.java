package com.natanaelassis.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.natanaelassis.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
