package week_3.FlyApp;

public class BuyTicketServiceImp implements IBuyTicket{


    @Override
    public void buyTicket(AirlineCompany airlineCompany ,Voyage voyage, String chairNumber) {

        if(voyage.getPlane().getChairList().containsKey(chairNumber)) {
            if(!voyage.getPlane().getChairList().get(chairNumber)) {
                voyage.getPlane().setChairState(chairNumber);
                System.out.println(airlineCompany.getCompanyName() + " wish have a good fly");
            }else {
                System.out.println("This chair is already sold.");
            }

        }else {
            System.out.println("There is not chair which one's number is " + chairNumber);
        }

    }
}
