package AmusementPark;

public class AmusementPark {

    public static void main(String[] args) {

        parkTickets(70 ,true,true);
        parkThrill(11, 3);
    }
    
    public static void parkTickets(int age, boolean student, boolean coupon) {


        double totalPrice;
        double childTicket = 10.00;
        double adultTicket = 17.50;
        double elderlyTicket = 12.50;

        if (age < 19) {
            totalPrice = childTicket;
          } else if 
                (age >= 19 && age <= 64) {
                totalPrice = adultTicket;
                } else {
                    totalPrice = elderlyTicket;
                }
       if (student == true) {
            totalPrice = totalPrice * .9;
          } else {
            totalPrice = totalPrice * 1;      
            }
       if (coupon == true) {
           totalPrice = totalPrice * .85; 
          }  else {
            totalPrice = totalPrice * 1;
        }
        if (totalPrice < 8.75) {
            totalPrice = 8.75;
        }
        System.out.println(String.format("%.2f",totalPrice));
    
    }
    public static void parkThrill(int age, int height) {

        if (age > 17 && height >= 5) {
            System.out.println("This ride is extreme");
          }  else if (age >= 12 || height > 4) {
                System.out.println("This ride is adventurous");
                } else {
                    System.out.println("This ride is for everyone");
        }

    }
}
