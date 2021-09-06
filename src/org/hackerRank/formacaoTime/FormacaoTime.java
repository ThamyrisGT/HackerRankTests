package org.hackerRank.formacaoTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FormacaoTime {
	public static long formacaoDeTime(List<Integer> pontuacao, int tamanho_do_time, int k)
			throws NumberOutOfLimitException {
		List<Integer> primeirosNumeros = new ArrayList<>();
		List<Integer> ultimosNumeros = new ArrayList<>();
		List<Integer> resultado = new ArrayList<>();
		int y = 1;

		for (Integer integer : resultado) {
			if (integer > 109) {
				throw new NumberOutOfLimitException("pontuação[i]>109");
			}
		}
		while (y <= tamanho_do_time) {
			primeirosNumeros.clear();
			ultimosNumeros.clear();
			int limite = 1;
			int limite2 = 1;
			int numeroMaior = 0;

			for (Integer integer : pontuacao) {
				if (limite <= k) {
					if (k < pontuacao.size()) {
						primeirosNumeros.add(integer);
						limite++;
					} else
						primeirosNumeros.add(integer);
				}
			}
			Collections.reverse(pontuacao);
			for (Integer integer : pontuacao) {
				if (limite2 < k) {
					if (k <= pontuacao.size()) {
						ultimosNumeros.add(integer);
						limite2++;
					} else
						ultimosNumeros.add(integer);
				}
			}
			Collections.reverse(pontuacao);
			for (Integer integer : primeirosNumeros) {
				for (Integer integer2 : ultimosNumeros) {
					if (integer == integer2) {
						if (primeirosNumeros.indexOf(integer) > ultimosNumeros.indexOf(integer2)) {
							numeroMaior = integer2;
						} else
							numeroMaior = integer;
					} else if (integer > integer2 && integer > numeroMaior) {
						numeroMaior = integer;
					} else if (numeroMaior < integer2) {
						numeroMaior = integer2;
					}
				}
			}
			for (Integer integer : pontuacao) {
				if (integer.equals(numeroMaior)) {
					resultado.add(integer);
					pontuacao.remove(integer);
					break;
				}
			}
			y++;
		}
		int soma = 0;
		for (Integer integer : resultado) {
			soma += integer;
		}
		System.out.println(soma);
		return soma;
	}
}
