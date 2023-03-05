package Homework.Seminar_06;

import java.util.HashMap;

public class Notebook {

    private int ram;
    private int ssd;
    private int cpu;
    private String firm;
    private String color;
    private String os;
    private HashMap<String, Integer> techParams = new HashMap<>();
    private HashMap<String, String> labelParams = new HashMap<>();

    public Notebook(int ram, int ssd, int cpu, String firm, String color, String os) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
        this.firm = firm;
        this.color = color;
        this.os = os;
        this.techParams.put("RAM", ram);
        this.techParams.put("SSD", ssd);
        this.techParams.put("CPU", cpu);
        this.labelParams.put("OC", os);
        this.labelParams.put("Color", color);
        this.labelParams.put("Firm", firm);
    }

    public int getTechParams(String key) {
        return techParams.get(key);
    }

    public Object getLabelParams(String key) {
        return labelParams.get(key);
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public int getCpu() {
        return cpu;
    }

    public String getFirm() {
        return firm;
    }

    public String getColor() {
        return color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
        labelParams.put("OC", os);
    }

    @Override
    public String toString() {
        return "Notebook " + firm + " ОЗУ " + ram + "; SSD " + ssd + "; CPU " + cpu + "; Цвет: " + color + "; ОС: " + os
                + ".";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ram;
        result = prime * result + ssd;
        result = prime * result + cpu;
        result = prime * result + ((firm == null) ? 0 : firm.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        result = prime * result + ((techParams == null) ? 0 : techParams.hashCode());
        result = prime * result + ((labelParams == null) ? 0 : labelParams.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Notebook other = (Notebook) obj;
        if (ram != other.ram)
            return false;
        if (ssd != other.ssd)
            return false;
        if (cpu != other.cpu)
            return false;
        if (firm == null) {
            if (other.firm != null)
                return false;
        } else if (!firm.equals(other.firm))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (techParams == null) {
            if (other.techParams != null)
                return false;
        } else if (!techParams.equals(other.techParams))
            return false;
        if (labelParams == null) {
            if (other.labelParams != null)
                return false;
        } else if (!labelParams.equals(other.labelParams))
            return false;
        return true;
    }
    
}