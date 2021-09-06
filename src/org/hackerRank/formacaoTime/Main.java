package org.hackerRank.formacaoTime;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberOutOfLimitException {
		List<Integer> pontuacao = new ArrayList<>();
		pontuacao.add(10);
		pontuacao.add(20);
		pontuacao.add(10);
		pontuacao.add(15);
		pontuacao.add(5);
		pontuacao.add(30);
		pontuacao.add(20);

		FormacaoTime.formacaoDeTime(pontuacao, 2, 3);

	}

}
