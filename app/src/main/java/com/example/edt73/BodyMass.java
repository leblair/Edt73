package com.example.edt73;

public class BodyMass  {
    private GENDER gender;
    private MORFOLOGY morfology;
    //metodos
    public double relativeFatMass(double altura, double cintura, GENDER gender){
        double result;
        if(gender.equals(GENDER.MALE)) result = Constants.menN - 20*altura/cintura;
        else result = Constants.womenN - 20*altura/cintura;
        return result;
    }

    public static double wanDerVael(double altura, GENDER gender ){
        return (gender.equals(GENDER.MALE)?(altura-150)*Constants.menM+50:(altura-150)*Constants.womenM);
    }

    public static double lorentz(double altura, GENDER gender, int edat){
        return (gender.equals(GENDER.MALE)?altura-100-(altura-150)/4 + (double) (edat-20)/Constants.menK:altura-100-(altura-150)/4 + (double) (edat-20)/Constants.womenK);
    }
    public static double creff(double altura, int edat, MORFOLOGY morfology){
        switch (morfology){
            case SMALL:
                return (altura-100+(double)edat/10)*Math.pow(0.9,2);
            case MEDIUM:
                return (altura-100+(double)edat/10)*0.9;
            case BROAD:
                return (altura-100+(double)edat/10)*0.9*1.1;
            default:
                return 0;
        }
    }
}
