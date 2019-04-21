package br.ufjf.dcc193.trabalho1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class,args);
		/*
		SedeRepository rep = ctx.getBean(SedeRepository.class);
		rep.save(new Sede("nome1Fatasia", "estadoDaFeder1acao", "c1idade", "ba1irro", "tele1fon", "e1mail"));
		rep.save(new Sede("Ola2", "estadoDaFederacao", "cidade", "bai2rro", "te2lefon", "emai2l"));
		rep.save(new Sede("nomeFatasia3", "est3adoDaFederacao", "ci3dade", "b33airro", "t3elefon", "e3mail"));
		System.out.println(rep.findAll().toString());
		*/
	}

}
