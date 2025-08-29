package br.com.mariojp.solid.isp;

public class OfficeService {

    private Printer device;

    public OfficeService(Printer device) {
        this.device = device;
    }

    public void printReport(String report){
        this.device.print(report);
    }
}
