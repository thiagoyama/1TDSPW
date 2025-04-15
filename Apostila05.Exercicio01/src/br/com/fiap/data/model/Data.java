package br.com.fiap.data.model;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int validateDatePart(int datePart, String part) {
        boolean validDay = datePart >= 1 && datePart <= 31;
        boolean validMonth = datePart >= 1 && datePart <= 12;
        boolean validYear = datePart > 0;
        switch (part) {
            case "day" -> {
                return validDay ? datePart : 1;
            }
            case "month" -> {
                return validMonth ? datePart : 1;
            }
            case "year" -> {
                return validYear ? datePart : 2023;
            }
            default -> {
                return 0;
            }

        }
    }

    public String returnDate() {
        return String.format("%s/%s/%s", dia, mes, ano);
    }

    public String resturnDateMonth() {
        return switch (mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Mês inválido";
        };
    }
}
