package org.toncarvalho.graficos;

/**
 * Created by ton on 5/16/14.
 */
public class MyTimeSeriesA {

    public Double ano;
    public Double demanda;
    public Double peso;

    public MyTimeSeriesA() { }

    public static MyTimeSeriesA[] getTimeSeries() {

        MyTimeSeriesA tm1996 = new MyTimeSeriesA();
        tm1996.ano = new Double(1996);
        tm1996.demanda = new Double(4767.7000);

        MyTimeSeriesA tm1997 = new MyTimeSeriesA();
        tm1997.ano = new Double(1997);
        tm1997.demanda = new Double(4932.9000);

        MyTimeSeriesA tm1998 = new MyTimeSeriesA();
        tm1998.ano = new Double(1998);
        tm1998.demanda = new Double(5593.0000);

        MyTimeSeriesA tm1999 = new MyTimeSeriesA();
        tm1999.ano = new Double(1999);
        tm1999.demanda = new Double(5871.0000);

        MyTimeSeriesA tm2000 = new MyTimeSeriesA();
        tm2000.ano = new Double(2000);
        tm2000.demanda = new Double(5258.0000);

        MyTimeSeriesA tm2001 = new MyTimeSeriesA();
        tm2001.ano = new Double(2001);
        tm2001.demanda = new Double(4577.8000);

        MyTimeSeriesA tm2002 = new MyTimeSeriesA();
        tm2002.ano = new Double(2002);
        tm2002.demanda = new Double(5304.4000);

        MyTimeSeriesA tm2003 = new MyTimeSeriesA();
        tm2003.ano = new Double(2003);
        tm2003.demanda = new Double(6442.3000);

        MyTimeSeriesA tm2004 = new MyTimeSeriesA();
        tm2004.ano = new Double(2004);
        tm2004.demanda = new Double(6461.4000);

        MyTimeSeriesA tm2005 = new MyTimeSeriesA();
        tm2005.ano = new Double(2005);
        tm2005.demanda = new Double(5810.3000);

        MyTimeSeriesA tm2006 = new MyTimeSeriesA();
        tm2006.ano = new Double(2006);
        tm2006.demanda = new Double(4328.5000);

        MyTimeSeriesA tm2007 = new MyTimeSeriesA();
        tm2007.ano = new Double(2007);
        tm2007.demanda = new Double(4313.2000);

        MyTimeSeriesA tm2008 = new MyTimeSeriesA();
        tm2008.ano = new Double(2008);
        tm2008.demanda = new Double(4267.6000);

        MyTimeSeriesA tm2009 = new MyTimeSeriesA();
        tm2009.ano = new Double(2009);
        tm2009.demanda = new Double(4934.2000);

        MyTimeSeriesA tm2010 = new MyTimeSeriesA();
        tm2010.ano = new Double(2010);
        tm2010.demanda = new Double(5584.7000);

        MyTimeSeriesA[] tsArray = new MyTimeSeriesA[15];
        tsArray[0] = tm1996;
        tsArray[1] = tm1997;
        tsArray[2] = tm1998;
        tsArray[3] = tm1999;
        tsArray[4] = tm2000;
        tsArray[5] = tm2001;
        tsArray[6] = tm2002;
        tsArray[7] = tm2003;
        tsArray[8] = tm2004;
        tsArray[9] = tm2005;
        tsArray[10] = tm2006;
        tsArray[11] = tm2007;
        tsArray[12] = tm2008;
        tsArray[13] = tm2009;
        tsArray[14] = tm2010;

        return tsArray;
    }

    public Double getAno() {
        return ano;
    }

    public void setAno(final Double ano) {
        this.ano = ano;
    }

    public Double getDemanda() {
        return demanda;
    }

    public void setDemanda(final Double demanda) {
        this.demanda = demanda;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(final Double peso) {
        this.peso = peso;
    }



}
