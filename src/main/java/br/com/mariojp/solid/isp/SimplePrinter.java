package br.com.mariojp.solid.isp;

public class SimplePrinter implements Printer {

    @Override
    public void print(String document) {
        System.out.println("Imprimindo documento : " +document);
    }
}
