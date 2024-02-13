public class Programa {

    public static void main(String args[]) {
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Lucas");
        empregado.setSobrenome("Santiago");
        empregado.setSalario(100d);
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Lucas2");
        comissionado.setSobrenome("Santiago");
        comissionado.setTotalVenda(1000d);
        comissionado.setTotalComissao(01d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setCpf("3");
        horista.setNome("Lucas3");
        horista.setSobrenome("Santiago");
        horista.setPrecoHora(100d);
        horista.setTotalHoraTrabalhada(60d);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado) {
        System.out.println(empregado.getNome() + " Tem salário de " + empregado.vencimento());
    }
}
