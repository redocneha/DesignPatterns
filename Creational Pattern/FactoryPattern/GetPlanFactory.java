
public class GetPlanFactory{
    public Plan getPlan(String planName){
        if(planName==null) return null;
        else if(planName.equals("Domestic")) return new DomesticPlan();
        else return new CommercialPlan();
    }
}