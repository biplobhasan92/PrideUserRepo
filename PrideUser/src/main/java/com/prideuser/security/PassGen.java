package com.prideuser.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGen {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		System.out.println(encoder.encode("hamid"));
		System.out.println(encoder.encode("hasan"));
	}
}

//$2a$10$G6BnV0YosGu3VUemnp039eMtrgbcvhrBAa2PecuujGekTRwSRIUPS
//$2a$10$o17vDWmUp63GQPuWMhTbxeY9woH/gdLfokhYmsQRMdVlOX9ul8dgm