package com.ijaaz.patterns.creational.factory;

public class PlanFactory {

    public Plan getPlan(String planType){

        if(planType.equalsIgnoreCase("DOMESTIC_PLAN")){
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIAL_PLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONAL_PLAN")) {
            return new InstitutionalPlan();
        }

        return null;
    }
}
