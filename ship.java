import java.util.Scanner;

class info {
    info() {
        System.out.println("\nWelcome To Ship Management System \n");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Ship Name is :- Empress Of The Seas");
        System.out.println("Goa To Lakshadweep Destination :- 1,189 Km");
        System.out.println("Goa To Lakshadweep (4N Bangaram Bliss Package From Goa) Time :- 5 Days/4 Night");
        System.out.println("Goa To Lakshadweep Time :- 35 Hours 43 Minites"); // Price 52,440
        System.out.println("Goa To Lakshadweep One Person Price :- 52,440");
        System.out.println("Ship Room Available : 200 \n \n \n");
        
    }
}

class room extends info {
    void ship_room() { // ship room informations
        Scanner info = new Scanner(System.in);
        Scanner Ocean = new Scanner(System.in);
        Scanner Mini = new Scanner(System.in);
        Scanner Suite = new Scanner(System.in);
        Scanner Chairman = new Scanner(System.in);
        int room_book;
        int Ocean_view; // 14,857
        int Mini_Suite; //21,912
        int suite;  //34,860
        int Chairman_suite; //56,274

        room_info();
        // room_book = info.nextLine();
        // try{
        // }
        // catch(Exception e) {
        //     System.out.println("number value available");
        // }
        System.out.print("Enter Your Viewable Points :- ");
        
        room_book = info.nextInt();


        if(room_book == 1) {
            System.out.println("Welcome To Ocean View Information \n");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ocean View");
            System.out.println("Ocean View Rooms Available : 50");
            System.out.println("Ocean view One Person Price :- 17,845");
            System.out.println("Ocean view Of Series ('O') Consider");
            System.out.println("Ocean view 50 Rooms available but 35 Rooms Reserved...");
            System.out.println("Available Ocean Rooms :- 36,37,38,39,40,41,42,43,44,45,46,47,48,49,50");
            System.out.print("Enter Your 'O' Series Number :- ");
            Ocean_view = Ocean.nextInt();
            if (Ocean_view > 35 && Ocean_view < 51) {
                System.out.println("Room Is Available \n");
            }
            else {
                System.out.println("Room Is Not Available \n");
            }
        }

        else if(room_book == 2) {
            System.out.println("Welcome To Mini Suite Information ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Mini Suite View");
            System.out.println("Mini Suite Rooms Available : 50");
            System.out.println("Mini Suite One Person Price :- 24,568");
            System.out.println("Mini Suite Of Series ('M') Consider");
            System.out.println("Mini Suite 50 Rooms available but 40 Rooms Reserved...");
            System.out.println("Available Mini Suite Rooms :- 41,42,43,44,45,46,47,48,49,50");
            System.out.print("Enter Your 'M' Series Number :- ");
            Mini_Suite = Mini.nextInt();
            if (Mini_Suite > 40 && Mini_Suite < 51) {
                System.out.println("Room Is Available \n");
            }
            else {
                System.out.println("Room Is Not Available \n");
            }
        }

        else if(room_book == 3) {
            System.out.println("Welcome To Suite Information ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Suite View");
            System.out.println("Suite Rooms Available : 50");
            System.out.println("Suite One Person Price :- 35,441");
            System.out.println("Suite Of Series ('M') Consider");
            System.out.println("Suite 50 Rooms available but 30 Rooms Reserved...");
            System.out.println("Available Mini Suite Rooms :- 31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50");
            System.out.print("Enter Your 'S' Series Number :- ");
            suite = Suite.nextInt();
            if (suite > 40 && suite < 51) {
                System.out.println("Room Is Available \n");
            }
            else {
                System.out.println("Room Is Not Available \n");
            }
        }

        else if(room_book == 4) {
            System.out.println("Welcome To Chairman`s Suite Information ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Chairman`s Suite View");
            System.out.println("Chairman`s Suite Rooms Available : 50");
            System.out.println("Chairman`s Suite One Person Price :- 54,780");
            System.out.println("Chairman`s Suite Of Series ('M') Consider");
            System.out.println("Chairman`s Suite 50 Rooms available but 45 Rooms Reserved...");
            System.out.println("Available Chairman`s Suite Rooms :- 46,47,48,49,50");
            System.out.print("Enter Your 'C' Series Number :- ");
            Chairman_suite = Chairman.nextInt();
            if (Chairman_suite > 45 && Chairman_suite < 51) {
                System.out.println("Room Is Available \n");
            }
            else {
                System.out.println("Room Is Not Available \n");
            }
        }
        else {
            System.out.println("Rooms Is Not Available \n");
        }
    }

    void room_info() {
        System.out.println("Welcome To Ship Room Information");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("1. Ocean view \n");
        System.out.println("2. Mini Suite \n");
        System.out.println("3. Suite \n");
        System.out.println("4. Chairman`s Suite \n");
    }
}


class room_booking extends room{
    static int ocean_value = 17845;
    static int Mini_value = 24568;
    static int Suite_value = 35441;
    static int Chairman_value = 54780;
    static int Total_value = 52440;
   void book () {

        Scanner Ocean = new Scanner(System.in);
        Scanner Mini = new Scanner(System.in);
        Scanner Suite = new Scanner(System.in);
        Scanner Chairman = new Scanner(System.in);
        Scanner Seat_info = new Scanner(System.in);

        int seat_info;
        int seat;
        int O_price;
        int M_price;
        int S_price;
        int C_price;
        // static int Ocean_price = 17845;

        System.out.println("Welcome to Room booking");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("1. choice Ocean View \n");
        System.out.println("2. choice Mini Suite \n");
        System.out.println("3. choice Suite \n");
        System.out.println("4. choice Chairman`s Suite ");
        System.out.print("Enter Your Choice Your Location :- ");
        seat_info = Seat_info.nextInt();


        if (seat_info == 1){
            // Ocean View Seat Booking
            System.out.print("\n Maximum Person 2...");
            System.out.println("Enter Your Choice Person :- ");
            seat = Seat_info.nextInt();

            if (seat == 1) {
                System.out.println("One Person Price is " + ocean_value);
                Total_value += ocean_value;
                System.out.println("Total One Person Price " + Total_value+ "\n"); 
            }

            else if (seat == 2) {
                O_price = ocean_value + ocean_value;
                Total_value += O_price;
                System.out.println("Two Person Price is " + O_price);
                System.out.println("Total Two Person Price "+Total_value+ "\n");
            }
            
        }

        else if(seat_info == 2) {
            // Mini Suite Booking
            System.out.print("\n Maximum Person 2...");
            System.out.println("Enter Your Choice Person :- ");
            seat = Seat_info.nextInt();

            if (seat == 1) {
                System.out.println("One Person Price is " + Mini_value);
                Total_value += Mini_value;
                System.out.println("Total One Person Price " + Total_value+ "\n");
            }

            else if (seat == 2) {
                M_price = Mini_value + Mini_value;
                Total_value += M_price;
                System.out.println("Two Person Price is " + M_price);
                System.out.println("Total Two Person Price "+Total_value+ "\n");
            }
        }

        else if(seat_info == 3) {
            //Suite Seat Booking
            System.out.println("\n Maximum Person 2...");
            System.out.print("Enter Your Choice Person :- ");
            seat = Seat_info.nextInt();

            if (seat == 1) {
                System.out.println("One Person Price is " + Suite_value);
                Total_value += Suite_value;
                System.out.println("Total One Person Price " + Total_value+ "\n");
            }

            else if (seat == 2) {
                S_price = Suite_value + Suite_value;
                Total_value += S_price;
                System.out.println("Two Person Price is " + S_price);
                System.out.println("Total Two Person Price " + Total_value+ "\n");
            }
        }

        else if(seat_info == 4) {
            //Chairman`s Suite Seat Booking

            System.out.println("\n Maximum Person 2...");
            System.out.print("Enter Your Choice Person :- ");
            seat = Seat_info.nextInt();

            if (seat == 1) {
                System.out.println("One Person Price is " + Chairman_value);
                Total_value += Chairman_value;
                System.out.println("Total One Person Price "+ Total_value+ "\n");
            }

            else if (seat == 2) {
                C_price = Chairman_value + Chairman_value;
                Total_value += C_price;
                System.out.println("Two Person Price is " + C_price);
                System.out.println("Total Two Person Price "+ Total_value+ "\n");
            }            
        }

    }
}



class payment_Methods{
     
    void payment_Method() {  
        Scanner pay = new Scanner(System.in);
        Scanner passport_number = new Scanner(System.in);
        Scanner email = new Scanner(System.in);
        Scanner password = new Scanner(System.in);
        Scanner name = new Scanner(System.in);

        int Payment;
        int Passport;
        int Password;
        String Email;
        String Name;

        System.out.println("Welcome To Payment Methods");
        System.out.println("_______________________________________________________________________");

        System.out.println("1. Google Pay\n");
        System.out.println("2. Amazon Pay\n");
        System.out.println("3. Phone Pay\n");
        System.out.println("4. Paytm \n");

        System.out.print("Enter Your Choice Payment Methods :- ");
        Payment = pay.nextInt();

        if (Payment == 1) {

            System.out.println("Welcome To Google Pay Methods");
            System.out.println("_______________________________________________________________________");

            System.out.print("Enter Your Name : ");
            Name = name.nextLine();
            System.out.println();

            System.out.print("Enter your Email Address : ");
            Email = email.nextLine();
            System.out.println();

            System.out.print("Enter Your Password : ");
            Password = password.nextInt();
            System.out.println();

            System.out.print("Enter your Passport Number : ");
            Passport = passport_number.nextInt();
            System.out.println();

            System.out.println("! Thank You Your Room SuccessFully Booking");

        }
        else if(Payment == 2) {

            System.out.print("Welcome To Amazon Pay Methods");
            System.out.println("_______________________________________________________________________");
            
            System.out.print("Enter Your Name : ");
            try {
                Name = name.nextLine();
                String N;
                Name="1234567890";
            }
            catch(Exception e)
            {
                System.out.println("Please Enter Your Name");
            }
            System.out.println();

            System.out.print("Enter your Email Address : ");
            Email = email.nextLine();
            System.out.println();

            System.out.print("Enter Your Password : ");
            Password = password.nextInt();
            System.out.println();

            System.out.print("Enter your Passport Number : ");
            Passport = passport_number.nextInt();
            System.out.println();

            System.out.println("! Thank You Your Room SuccessFully Booking");

        }

        else if (Payment == 3) {

            System.out.println("Welcome To Phone Pay Methods");
            System.out.println("_______________________________________________________________________");

            System.out.print("Enter Your Name : ");
            Name = name.nextLine();
            System.out.println();

            System.out.print("Enter your Email Address : ");
            Email = email.nextLine();
            System.out.println();

            System.out.print("Enter Your Password : ");
            Password = password.nextInt();
            System.out.println();

            System.out.print("Enter your Passport Number : ");
            Passport = passport_number.nextInt();
            System.out.println();

            System.out.println("! Thank You Your Room SuccessFully Booking");
        
        }

        else if (Payment == 4) {
        
            System.out.println("Welcome To Paytm Methods");
            System.out.println("_______________________________________________________________________");

            System.out.print("Enter Your Name : ");
            Name = name.nextLine();
            System.out.println();

            System.out.print("Enter your Email Address : ");
            Email = email.nextLine();
            System.out.println();

            System.out.print("Enter Your Password : ");
            Password = password.nextInt();
            System.out.println();

            System.out.print("Enter your Passport Number : ");
            Passport = passport_number.nextInt();
            System.out.println();

            System.out.println("! Thank You Your Room SuccessFully Booking");
        
        }

    }

}


class Ship {
    public static void main(String[] args) {
        // Create instances of your classes
        room_booking rb = new room_booking();
        payment_Methods pm = new payment_Methods();

        rb.ship_room();
        rb.book();

        pm.payment_Method();

    }


}