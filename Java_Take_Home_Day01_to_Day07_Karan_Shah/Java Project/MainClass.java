import java.util.*;

public class MainClass {
    int ap = 0, ph = 0, ask = 0;
    int score = 0;

    public static void main(String args[]) throws Exception {

        String sname;
        int age;

        try {
            MainClass x = new MainClass();
            Scanner m = new Scanner(System.in);

            // logo of kbc

            Logo logo = new Logo();

            logo.getLogo(System.currentTimeMillis());

            System.out.print("\nCreated by:-");
            Thread.sleep(500);
            System.out.print("R");
            Thread.sleep(500);
            System.out.print("o");
            Thread.sleep(500);
            System.out.print("o");
            Thread.sleep(500);
            System.out.print("m");
            Thread.sleep(500);
            System.out.print("-");
            Thread.sleep(500);
            System.out.print(">");
            Thread.sleep(500);
            System.out.print("8");

            Thread.sleep(2500);

            for(int clr=1;clr<=25;clr++){
                System.out.println("");}
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("+   Enter Your choice    +");
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("+ 1.Play                 +");
                System.out.println("++++++++++++++++++++++++++");
                 for(int clr=1;clr<=25;clr++){
                System.out.println("");}          
                Thread.sleep(1100);
             
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("+   Enter Your choice    +");
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("+ 1.Play                 +");
                System.out.println("+ 2.How to play          +");
                System.out.println("++++++++++++++++++++++++++");
                   for(int clr=1;clr<=24;clr++){
                System.out.println("");} 
                          Thread.sleep(1100);
                 for(int clr=1;clr<=25;clr++){
                System.out.println("");} 
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("+   Enter Your choice    +");
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("+ 1.Play                 +");
                System.out.println("+ 2.How to play          +");
                System.out.println("+ 3.Exit                 +");
                System.out.println("++++++++++++++++++++++++++");
                
            
            for (int clr = 1; clr <= 23; clr++) {
                System.out.println("");
            }
            System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");

            int enterOption = m.nextInt();

            if (enterOption == 1) {
                System.out.println("\nTo Register for the game full fill the requirement");
                System.out.println("\nEnter your name:-");
                sname = m.next();

                System.out.println("Enter your Age:-");
                age = m.nextInt();
                if(age<0) {
                	System.out.println("Age is not valid");
                	return;
                }
                	

                System.out.println("Hello " + sname + " welcome to K.B.C");
                Thread.sleep(5000);
                LoadingAnimation.getLoadingAnimation();

                if(age<100){
					System.out.println("\n\n\n\n\t\t\tFastest Finger First Question");
					Thread.sleep(1000);
					long fq=System.currentTimeMillis();

					if(fq%3==1){
						System.out.println("Arrange these languages in the correct order they released in market?");
						System.out.println("A. JAVA                            B. PYTHON \n");
						System.out.println("C. C                           D. C++    ");
						for(int clr=1;clr<=25;clr++){
							System.out.println("");}

						System.out.print("****>>>>>>>>>>>>>>**********<<<<<<<<<<<<<<<<<<****\nAns:-");
						String ffq=m.next();
						switch(ffq){
						case "CDAB":
						case "cdab":
							break;
						default :
							System.out.print("YOU Answered WRONG .");
							Thread.sleep(500);
							System.out.print("Correct Answer is  CDAB");
							return;
						}
					}
					else {     
						System.out.println("Arrange these Algorithm in ascending order of their Time Complexity ?");
						System.out.println("(A) Quick Sort                       (B) Binary Search  \n");
						System.out.println("(C) Linear Search                    (D) Bubble sort    ");
						for(int clr=1;clr<=25;clr++){
							System.out.println("");}

						System.out.print("****>>>>>>>>>>>>>>**********<<<<<<<<<<<<<<<<<<****\nAns:-");
						String ffq=m.next();
						switch(ffq){
						case "bcad":
						case "BCAD":
							break;
						default :
							Thread.sleep(500);
							System.out.print("Correct Answer is  BCAD");
							return;
						}


					}

					move :
					{
						long change=System.currentTimeMillis();


						System.out.println("\t\t\t\t\t\t _____________________________");
						System.out.println("\t\t\t\t\t\t|your Question for Rs 10,000 is |");
						Thread.sleep(500);
						System.out.println("Who developed Python Programming Language?\r\n                             ");
						System.out.println("(A) Wick van Rossum                  (B) Rasmus Lerdorf                                           \t\t| Type lifeline                 |");
						System.out.println("                                                                                      \t\t|-------------------------------|");
						System.out.println("(C) Niene Stom                       (D) Guido van Rossum");


						for(int clr=1;clr<=25;clr++){
							System.out.println("");}

						System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
						long first=System.currentTimeMillis();
						String sss=m.next();
						long second=System.currentTimeMillis();
						long timer=second-first;
						if(timer>31000){                  
							System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
							Thread.sleep(1500);
							System.out.print("Correct Answer is D");
							return;
						}          switch(sss)
						{
						case "d":
						case "D":

							System.out.println("yes you are right you won Rs.10,000");
							Thread.sleep(1600);
							System.out.println("\nYour next question for Rs.50,000");
							Thread.sleep(2000);
							for(int asd=1;asd<=1000;asd++){
								System.out.println("\b");} 
							break move;
						case "LIFELINE" :
						case "Lifeline" :
						case "lifeline" :
							for(int asd=1;asd<=1000;asd++){
								System.out.println("\b");}
							x.lifeline(4);
							System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");       
							first=System.currentTimeMillis();
							sss=m.next();
							second=System.currentTimeMillis();
							timer=second-first+timer;
							if(timer>31000){
								System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
								return;
							}
							switch(sss)
							{
							case "d":
							case "D":

								System.out.println("yes you are right you won Rs.10,000");
								Thread.sleep(1600);
								System.out.println("\nYour next question for Rs.50,000");
								Thread.sleep(2000);
								for(int asd=1;asd<=1000;asd++){
									System.out.println("\b");} 
								break move;
							case "LIFELINE" :
							case "Lifeline" :
							case "lifeline" :
								for(int asd=1;asd<=1000;asd++){
									System.out.println("\b");}
								x.lifeline(4); 
								System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
								first=System.currentTimeMillis();
								sss=m.next();
								second=System.currentTimeMillis();
								timer=second-first+timer;
								if(timer>31000){
									System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
									return;
								}
								switch(sss)
								{
								case "d":
								case "D":


									System.out.println("yes you are right you won Rs.10,000");
									Thread.sleep(1600);
									System.out.println("\nYour next question for Rs.50,000");
									Thread.sleep(2000);
									for(int asd=1;asd<=1000;asd++){
										System.out.println("\b");} 
									break move;
								default :
									System.out.println("Sorry You are wrong today you won Nothing");
									return;
								}
							default :
								System.out.println("Sorry You are wrong today you won Nothing");
								return;
							}          
						default :
							System.out.println("Sorry You are wrong today you won Nothing");
							return; 
						}





					}    
					//********************************************************************************************************************************************
					//********************************************************************************************************************************************   

					move1 :
					{
						long change=System.currentTimeMillis();

						System.out.println("\t\t\t\t\t\t _____________________________");
						System.out.println("\t\t\t\t\t\t|your Question for Rs 50,000 is |");
						System.out.println("Which type of Programming does Python support?                                      \t\t|-----------Lifeline------------|");
						System.out.println("(A) object-oriented programming           (B) all of the mentioned                                            \t\t|Type lifeline\t\t\t|");
						System.out.println("                                                                                      \t\t|-------------------------------|");
						System.out.println("(C) structured programming              (D) functional programming");


						for(int clr=1;clr<=25;clr++){
							System.out.println("");}

						System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
						long first=System.currentTimeMillis();
						String sss=m.next();
						long second=System.currentTimeMillis();
						long timer=second-first;
						if(timer>31000){                  
							System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
							Thread.sleep(1500);

							return;
						}
						switch(sss)
						{
						case "b":
						case "B":


							System.out.println("yes you are right you won Rs.50,000");
							Thread.sleep(1600);
							System.out.println("\nYour next question for Rs.1,00,000");
							Thread.sleep(2000);
							for(int asd=1;asd<=1000;asd++){
								System.out.println("\b");} 
							break move1;
						case "LIFELINE" :
						case "Lifeline" :
						case "lifeline" :
							for(int asd=1;asd<=1000;asd++){
								System.out.println("\b");}
							System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");      
							x.lifeline(2);
							first=System.currentTimeMillis();
							sss=m.next();
							second=System.currentTimeMillis();
							timer=second-first+timer;
							if(timer>31000){
								System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
								return;
							}
							switch(sss)
							{
							case "b":
							case "B":

								System.out.println("yes you are right you won Rs.50,000");
								Thread.sleep(1600);
								System.out.println("\nYour next question for Rs.1,00,000");
								Thread.sleep(2000);
								for(int asd=1;asd<=1000;asd++){
									System.out.println("\b");} 
								break move1;
							case "LIFELINE" :
							case "Lifeline" :
							case "lifeline" :
								for(int asd=1;asd<=100;asd++){
									System.out.println("");
								}
								x.lifeline(2);
								System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
								first=System.currentTimeMillis();
								sss=m.next();
								second=System.currentTimeMillis();
								timer=second-first+timer;
								if(timer>31000){
									System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
									System.out.println("Correct Answer is B");
									return;
								}
								switch(sss)
								{
								case "b":
								case "B":

									System.out.println("yes you are right you won Rs.50,000");
									Thread.sleep(1600);
									System.out.println("\nYour next question for Rs.1,00,000");
									Thread.sleep(2000);
									for(int asd=1;asd<=1000;asd++){
										System.out.println("\b");} 
									break move1;
								default :
									System.out.println("Sorry You are wrong today you won nothing");
									System.out.println("Correct Answer is B");
									return;
								}
							default :
								System.out.println("Sorry You are wrong today you won nothing");
								System.out.println("Correct Answer is B");
								return;
							}          
						default :
							System.out.println("Sorry You are wrong today you won nothing");
							System.out.println("Correct Answer is B");
							return; 
						}
					}


					//********************************************************************************************************************************************
					//******************************************************************************************************************************************** 

					move2 :
					{
						long change=System.currentTimeMillis();

						System.out.println("\t\t\t\t\t\t _____________________________");
						System.out.println("\t\t\t\t\t\t|your Question for Rs 1,00,000 is |");
						System.out.println("Which component is used to compile, debug and execute the java programs? ?                    \t\t|-----------Lifeline------------|");
						System.out.println("(A) JRE                            (B) JIT                                     \t\t|Type lifeline\t\t\t|");
						System.out.println("                                                                                      \t\t|-------------------------------|");
						System.out.println("(C) JVM                            (D) JDK");


						for(int clr=1;clr<=25;clr++){
							System.out.println("");}

						System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
						long first=System.currentTimeMillis();
						String sss=m.next();
						long second=System.currentTimeMillis();
						long timer=second-first;
						if(timer>31000){                  
							System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
							System.out.println("Correct Answer is D");
							Thread.sleep(1500);

							return;
						}
						switch(sss)
						{
						case "d":
						case "D":

							System.out.println("yes you are right you won Rs.1,00,000");
							Thread.sleep(1600);
							System.out.println("\nYour next question for Rs.50,00,000");
							Thread.sleep(2000);
							for(int asd=1;asd<=1000;asd++){
								System.out.println("\b");} 
							break move2;
						case "LIFELINE" :
						case "Lifeline" :
						case "lifeline" :
							for(int asd=1;asd<=1000;asd++){
								System.out.println("\b");}
							x.lifeline(4);
							System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");    
							first=System.currentTimeMillis();
							sss=m.next();
							second=System.currentTimeMillis();
							timer=second-first+timer;
							if(timer>31000){
								System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
								System.out.println("Correct Answer is B");
								return;
							}
							switch(sss)
							{
							case "d":
							case "D":

								System.out.println("yes you are right you won Rs.1,00,000");
								Thread.sleep(1600);
								System.out.println("\nYour next question for Rs.50,00,000");
								Thread.sleep(2000);
								for(int asd=1;asd<=1000;asd++){
									System.out.println("\b");} 
								break move2;
							case "LIFELINE" :
							case "Lifeline" :
							case "lifeline" :
								for(int asd=1;asd<=1000;asd++){
									System.out.println("\b");}
								x.lifeline(4);
								System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");    
								first=System.currentTimeMillis();
								sss=m.next();
								second=System.currentTimeMillis();
								timer=second-first+timer;
								if(timer>31000){
									System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
									System.out.println("Correct Answer is B");
									return;
								}
								switch(sss)
								{
								case "d":
								case "D":

									System.out.println("yes you are right you won Rs.1,00,000");
									Thread.sleep(1600);
									System.out.println("\nYour next question for Rs.50,00,000");
									Thread.sleep(2000);
									for(int asd=1;asd<=1000;asd++){
										System.out.println("\b");} 
									break move2;
								default :
									System.out.println("Sorry You are wrong today you won nothing");
									System.out.println("Correct Answer is B");
									return;
								}
							default :
								System.out.println("Sorry You are wrong today you won nothing");
								System.out.println("Correct Answer is B");
								return;
							}          
						default :
							System.out.println("Sorry You are wrong today you won nothing");
							System.out.println("Correct Answer is B");
							return; 
						}
					}
					//********************************************************************************************************************************************
					//******************************************************************************************************************************************** 

					move3 :
					{
						long change=System.currentTimeMillis();

						System.out.println("\t\t\t\t\t\t _______________________________");
						System.out.println("\t\t\t\t\t\t|your Question for Rs 50,00,000 is |");
						System.out.println("Which exception is thrown when java is out of memory?\r\n"+ "\r\n"+ "?\t\t|-----------Lifeline------------|");
						System.out.println("(A) MemoryError                          (B) OutOfMemoryError                                                   \t\t|Type lifeline\t\t\t|");
						System.out.println("                                                                                                                    \t\t|-------------------------------|");
						System.out.println("(C) MemoryOutOfBoundsException                          (D) MemoryFullException");

						for(int clr=1;clr<=25;clr++){
							System.out.println("");}

						System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
						long first=System.currentTimeMillis();
						String sss=m.next();
						long second=System.currentTimeMillis();
						long timer=second-first;
						if(timer>31000){                  
							System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
							System.out.println("Correct Answer is B");
							Thread.sleep(1500);

							return;
						}
						switch(sss)
						{
						case "b":
						case "B":
							int sc1=80000;     
							System.out.println("yes you are right you won Rs.50,00,000");
							Thread.sleep(1600);
							System.out.println("\nYour next question for Rs.100,00,000");
							Thread.sleep(2000);
							for(int asd=1;asd<=1000;asd++){
								System.out.println("\b");} 
							break move3;
						case "LIFELINE" :
						case "Lifeline" :
						case "lifeline" :
							for(int asd=1;asd<=1000;asd++){
								System.out.println("\b");}
							x.lifeline(2);
							System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");              
							first=System.currentTimeMillis();
							sss=m.next();
							second=System.currentTimeMillis();
							timer=second-first+timer;
							if(timer>31000){
								System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
								System.out.println("Correct Answer is B");
								return;
							}
							switch(sss)
							{
							case "b":
							case "B":

								sc1=40000;       
								System.out.println("yes you are right you won Rs.50,00,000");
								Thread.sleep(1600);
								System.out.println("\nYour next question for Rs.100,00,000");
								Thread.sleep(2000);
								for(int asd=1;asd<=1000;asd++){
									System.out.println("\b");} 
								break move3;
							case "LIFELINE" :
							case "Lifeline" :
							case "lifeline" :
								for(int asd=1;asd<=1000;asd++){
									System.out.println("\b");}
								x.lifeline(2);
								System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
								first=System.currentTimeMillis();
								sss=m.next();
								second=System.currentTimeMillis();
								timer=second-first+timer;
								if(timer>31000){
									System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
									System.out.println("Correct Answer is B");
									return;
								}
								switch(sss)
								{
								case "b":
								case "B":
									sc1=40000;  
									System.out.println("yes you are right you won Rs.50,00,000");
									Thread.sleep(1600);
									System.out.println("\nYour next question for Rs.100,00,000");
									Thread.sleep(2000);
									for(int asd=1;asd<=1000;asd++){
										System.out.println("\b");} 
									break move3;
								default :
									System.out.println("Sorry You are wrong today you won nothing");
									System.out.println("Correct Answer is B");
									return;
								}
							default :
								System.out.println("Sorry You are wrong today you won nothing");
								System.out.println("Correct Answer is B");
								return;
							}          
						default :
							System.out.println("Sorry You are wrong today you won nothing");
							System.out.println("Correct Answer is B");
							return; 
						}
					}
                    // ********************************************************************************************************************************************
                    // ********************************************************************************************************************************************

                    move4: {
    					{
    						long change=System.currentTimeMillis();

    						System.out.println("\t\t\t\t\t\t _________________________________");
    						System.out.println("\t\t\t\t\t\t|your Question for Rs.700,00,000 is |");
    						System.out.println("What makes java not s fully object oriented programming language?\t\t|-----------Lifeline------------|");
    						System.out.println("(A) Array                                 (B) Primitive datatype                                         \t\t|Type lifeline\t\t\t|");
    						System.out.println("                                                                                          \t\t|-------------------------------|");
    						System.out.println("(C) Exception Handling                               (D) Polymorphism");

    					}
    					for(int clr=1;clr<=25;clr++){
    						System.out.println("");}

    					System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
    					long first=System.currentTimeMillis();
    					String sss=m.next();
    					long second=System.currentTimeMillis();
    					long timer=second-first;
    					if(timer>31000){                  
    						System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
    						System.out.println("Correct Answer is B");
    						Thread.sleep(1500);

    						return;
    					}
                        switch (sss) {
                            case "a":
                            case "A":
                                int sc4 = 70000000;
                                System.out.println("yes you are right you won Rs.7 Crore\n");
                                Thread.sleep(500);
                                for (int asd = 1; asd <= 100; asd++) {
                                    System.out.println("");
                                }
                                for (int win = 1; win <= 4; win++) {

                                    System.out.println(
                                            "\t\t\t\t************************************You Won*************************************");
                                    System.out.println(
                                            "\t\t\t\t*                                                                              *");
                                    System.out.println(
                                            "\t\t\t\t*   W       W   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   RRRRRRRR     *  ");
                                    System.out.println(
                                            "\t\t\t\t*   W       W        II        N N     N   N N     N   EE         R       R    *  ");
                                    System.out.println(
                                            "\t\t\t\t*   W       W        II        N  N    N   N  N    N   EE         R       R    *  ");
                                    System.out.println(
                                            "\t\t\t\t*   W   W   W        II        N   N   N   N   N   N   EEEEEEEE   RRRRRRRR     *  ");
                                    System.out.println(
                                            "\t\t\t\t*   W  W W  W        II        N    N  N   N    N  N   EE         R R          *  ");
                                    System.out.println(
                                            "\t\t\t\t*   W W   W W        II        N     N N   N     N N   EE         R   R        * ");
                                    System.out.println(
                                            "\t\t\t\t*   WW     WW   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   R     R      *  ");
                                    System.out.println(
                                            "\t\t\t\t*                                                                              *");
                                    System.out.println(
                                            "\t\t\t\t************************************You Won*************************************");
                                    for (int asd = 1; asd <= 18; asd++) {
                                        System.out.println("");
                                    }
                                    Thread.sleep(500);
                                    for (int asd = 1; asd <= 18; asd++) {
                                        System.out.println("");
                                    }
                                    System.out.println(
                                            "\t\t\t\t++++++++++++++++++++++++++++++++++++You Won+++++++++++++++++++++++++++++++++++++");
                                    System.out.println(
                                            "\t\t\t\t+                                                                              +");
                                    System.out.println(
                                            "\t\t\t\t+   +       +   ++++++++++++   +       +   +       +   ++++++++   ++++++++     +  ");
                                    System.out.println(
                                            "\t\t\t\t+   +       +        ++        + +     +   + +     +   ++         +       +    +  ");
                                    System.out.println(
                                            "\t\t\t\t+   +       +        ++        +  +    +   +  +    +   ++         +       +    +  ");
                                    System.out.println(
                                            "\t\t\t\t+   +   +   +        ++        +   +   +   +   +   +   ++++++++   ++++++++     +  ");
                                    System.out.println(
                                            "\t\t\t\t+   +  + +  +        ++        +    +  +   +    +  +   ++         + +          +  ");
                                    System.out.println(
                                            "\t\t\t\t+   + +   + +        ++        +     + +   +     + +   ++         +   +        + ");
                                    System.out.println(
                                            "\t\t\t\t+   ++     ++   ++++++++++++   +       +   +       +   ++++++++   +     +      +  ");
                                    System.out.println(
                                            "\t\t\t\t+                                                                              +");
                                    System.out.println(
                                            "\t\t\t\t++++++++++++++++++++++++++++++++++++You Won+++++++++++++++++++++++++++++++++++++");
                                    for (int asd = 1; asd <= 18; asd++) {
                                        System.out.println("");
                                    }
                                    Thread.sleep(500);
                                    for (int asd = 1; asd <= 18; asd++) {
                                        System.out.println("");
                                    }
                                    System.out.println(
                                            "\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~You Won~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    System.out.println(
                                            "\t\t\t\t~                                                                              ~");
                                    System.out.println(
                                            "\t\t\t\t~   ~       ~   ~~~~~~~~~~~~   ~       ~   ~       ~   ~~~~~~~~   ~~~~~~~~     ~  ");
                                    System.out.println(
                                            "\t\t\t\t~   ~       ~        ~~        ~ ~     ~   ~ ~     ~   ~~         ~       ~    ~  ");
                                    System.out.println(
                                            "\t\t\t\t~   ~       ~        ~~        ~  ~    ~   ~  ~    ~   ~~         ~       ~    ~  ");
                                    System.out.println(
                                            "\t\t\t\t~   ~   ~   ~        ~~        ~   ~   ~   ~   ~   ~   ~~~~~~~~   ~~~~~~~~     ~  ");
                                    System.out.println(
                                            "\t\t\t\t~   ~  ~ ~  ~        ~~        ~    ~  ~   ~    ~  ~   ~~         ~ ~          ~  ");
                                    System.out.println(
                                            "\t\t\t\t~   ~ ~   ~ ~        ~~        ~     ~ ~   ~     ~ ~   ~~         ~   ~        ~ ");
                                    System.out.println(
                                            "\t\t\t\t~   ~~     ~~   ~~~~~~~~~~~~   ~       ~   ~       ~   ~~~~~~~~   ~     ~      ~  ");
                                    System.out.println(
                                            "\t\t\t\t~                                                                              ~");
                                    System.out.println(
                                            "\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~You Won~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    for (int asd = 1; asd <= 18; asd++) {
                                        System.out.println("");
                                    }
                                }
                                Thread.sleep(3000);
                                break move4;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                x.lifeline(1);
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                switch (sss) {
                                    case "a":
                                    case "A":
                                        sc4 = 70000000;
                                        System.out.println("yes you are right you won Rs.7 Crore\n");
                                        Thread.sleep(5000);
                                        for (int asd = 1; asd <= 100; asd++) {
                                            System.out.println("");
                                        }
                                        for (int win = 1; win <= 4; win++) {

                                            System.out.println(
                                                    "\t\t\t\t************************************You Won*************************************");
                                            System.out.println(
                                                    "\t\t\t\t*                                                                              *");
                                            System.out.println(
                                                    "\t\t\t\t*   W       W   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   RRRRRRRR     *  ");
                                            System.out.println(
                                                    "\t\t\t\t*   W       W        II        N N     N   N N     N   EE         R       R    *  ");
                                            System.out.println(
                                                    "\t\t\t\t*   W       W        II        N  N    N   N  N    N   EE         R       R    *  ");
                                            System.out.println(
                                                    "\t\t\t\t*   W   W   W        II        N   N   N   N   N   N   EEEEEEEE   RRRRRRRR     *  ");
                                            System.out.println(
                                                    "\t\t\t\t*   W  W W  W        II        N    N  N   N    N  N   EE         R R          *  ");
                                            System.out.println(
                                                    "\t\t\t\t*   W W   W W        II        N     N N   N     N N   EE         R   R        * ");
                                            System.out.println(
                                                    "\t\t\t\t*   WW     WW   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   R     R      *  ");
                                            System.out.println(
                                                    "\t\t\t\t*                                                                              *");
                                            System.out.println(
                                                    "\t\t\t\t************************************You Won*************************************");
                                            for (int asd = 1; asd <= 18; asd++) {
                                                System.out.println("");
                                            }
                                            Thread.sleep(800);
                                            for (int asd = 1; asd <= 18; asd++) {
                                                System.out.println("");
                                            }
                                            System.out.println(
                                                    "\t\t\t\t++++++++++++++++++++++++++++++++++++You Won+++++++++++++++++++++++++++++++++++++");
                                            System.out.println(
                                                    "\t\t\t\t+                                                                              +");
                                            System.out.println(
                                                    "\t\t\t\t+   +       +   ++++++++++++   +       +   +       +   ++++++++   ++++++++     +  ");
                                            System.out.println(
                                                    "\t\t\t\t+   +       +        ++        + +     +   + +     +   ++         +       +    +  ");
                                            System.out.println(
                                                    "\t\t\t\t+   +       +        ++        +  +    +   +  +    +   ++         +       +    +  ");
                                            System.out.println(
                                                    "\t\t\t\t+   +   +   +        ++        +   +   +   +   +   +   ++++++++   ++++++++     +  ");
                                            System.out.println(
                                                    "\t\t\t\t+   +  + +  +        ++        +    +  +   +    +  +   ++         + +          +  ");
                                            System.out.println(
                                                    "\t\t\t\t+   + +   + +        ++        +     + +   +     + +   ++         +   +        + ");
                                            System.out.println(
                                                    "\t\t\t\t+   ++     ++   ++++++++++++   +       +   +       +   ++++++++   +     +      +  ");
                                            System.out.println(
                                                    "\t\t\t\t+                                                                              +");
                                            System.out.println(
                                                    "\t\t\t\t++++++++++++++++++++++++++++++++++++You Won+++++++++++++++++++++++++++++++++++++");
                                            for (int asd = 1; asd <= 18; asd++) {
                                                System.out.println("");
                                            }
                                            Thread.sleep(800);
                                        }
                                        Thread.sleep(5000);
                                        break move4;
                                    case "LIFELINE":
                                    case "Lifeline":
                                    case "lifeline":
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        x.lifeline(1);
                                        first = System.currentTimeMillis();
                                        sss = m.next();
                                        second = System.currentTimeMillis();
                                        timer = second - first + timer;
                                        if (timer > 31000) {
                                            System.out.println(
                                                    "Sorry you are too late. You have 30 Seconds to give answer");
                                            return;
                                        }
                                        sss = m.next();
                                        switch (sss) {
                                            case "a":
                                            case "A":
                                                sc4 = 70000000;
                                                System.out.println("yes you are right you won Rs.7 Crore\n");
                                                Thread.sleep(2000);
                                                for (int asd = 1; asd <= 100; asd++) {
                                                    System.out.println("");
                                                }
                                                for (int win = 1; win <= 4; win++) {

                                                    System.out.println(
                                                            "\t\t\t\t************************************You Won*************************************");
                                                    System.out.println(
                                                            "\t\t\t\t*                                                                              *");
                                                    System.out.println(
                                                            "\t\t\t\t*   W       W   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   RRRRRRRR     *  ");
                                                    System.out.println(
                                                            "\t\t\t\t*   W       W        II        N N     N   N N     N   EE         R       R    *  ");
                                                    System.out.println(
                                                            "\t\t\t\t*   W       W        II        N  N    N   N  N    N   EE         R       R    *  ");
                                                    System.out.println(
                                                            "\t\t\t\t*   W   W   W        II        N   N   N   N   N   N   EEEEEEEE   RRRRRRRR     *  ");
                                                    System.out.println(
                                                            "\t\t\t\t*   W  W W  W        II        N    N  N   N    N  N   EE         R R          *  ");
                                                    System.out.println(
                                                            "\t\t\t\t*   W W   W W        II        N     N N   N     N N   EE         R   R        * ");
                                                    System.out.println(
                                                            "\t\t\t\t*   WW     WW   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   R     R      *  ");
                                                    System.out.println(
                                                            "\t\t\t\t*                                                                              *");
                                                    System.out.println(
                                                            "\t\t\t\t************************************You Won*************************************");
                                                    for (int asd = 1; asd <= 18; asd++) {
                                                        System.out.println("");
                                                    }
                                                    Thread.sleep(800);
                                                    for (int asd = 1; asd <= 18; asd++) {
                                                        System.out.println("");
                                                    }
                                                    System.out.println(
                                                            "\t\t\t\t++++++++++++++++++++++++++++++++++++You Won+++++++++++++++++++++++++++++++++++++");
                                                    System.out.println(
                                                            "\t\t\t\t+                                                                              +");
                                                    System.out.println(
                                                            "\t\t\t\t+   +       +   ++++++++++++   +       +   +       +   ++++++++   ++++++++     +  ");
                                                    System.out.println(
                                                            "\t\t\t\t+   +       +        ++        + +     +   + +     +   ++         +       +    +  ");
                                                    System.out.println(
                                                            "\t\t\t\t+   +       +        ++        +  +    +   +  +    +   ++         +       +    +  ");
                                                    System.out.println(
                                                            "\t\t\t\t+   +   +   +        ++        +   +   +   +   +   +   ++++++++   ++++++++     +  ");
                                                    System.out.println(
                                                            "\t\t\t\t+   +  + +  +        ++        +    +  +   +    +  +   ++         + +          +  ");
                                                    System.out.println(
                                                            "\t\t\t\t+   + +   + +        ++        +     + +   +     + +   ++         +   +        + ");
                                                    System.out.println(
                                                            "\t\t\t\t+   ++     ++   ++++++++++++   +       +   +       +   ++++++++   +     +      +  ");
                                                    System.out.println(
                                                            "\t\t\t\t+                                                                              +");
                                                    System.out.println(
                                                            "\t\t\t\t++++++++++++++++++++++++++++++++++++You Won+++++++++++++++++++++++++++++++++++++");
                                                    for (int asd = 1; asd <= 18; asd++) {
                                                        System.out.println("");
                                                    }
                                                    Thread.sleep(800);
                                                }
                                                Thread.sleep(5000);
                                                for (int asd = 1; asd <= 100; asd++) {
                                                    System.out.println("\b");
                                                }
                                                break move4;
                                            default:
                                                System.out.println("You are wrong today you won Only Rs.1 Crore");
                                                return;
                                        }
                                    default:
                                        System.out.println("You are wrong today you won Only Rs.1 Crore");
                                        return;
                                }
                            default:
                                System.out.println("You are wrong today you won Only Rs.1 Crore/-");
                                return;
                        }
                    }
                    // ********************************************************************************************************************************************
                    // ********************************************************************************************************************************************

                } else {
                    System.out.println("Process under Development");
                }
            }
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            else if (enterOption == 2) {
                for (int clr = 1; clr <= 20; clr++) {
                    System.out.println("");
                }
                
                // help msg displayed here
                Help.getHelpMsg();

                Thread.sleep(5500);
                for(int i=1;i<=20;i++) {
                	System.out.println();
                }
                x.main(args);
            } else if(enterOption == 3) {
                return;
            }

        } catch (InterruptedException exc) {
            System.out.println("sleep\\wait is not working");
        }

    }

    // +++++++++++++++++++++++++++++++++++++LIFELINE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // +++++++++++++++++++++++++++++++++++++LIFELINE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			public void lifeline(int quesno){
				Scanner m=new Scanner(System.in);      
				if(quesno==1)
				{
					try{
						System.out.print("------------------------------------------------------");
						System.out.print("\n|\t\t    Lifeline\t\t\t     |\n");
						System.out.println("------------------------------------------------------");
						System.out.println("1.Audience poll \t\t2.Phone a friend");
						System.out.println("3.Ask an expert");
						for(int space=1;space<=23;space++){
							System.out.println("");
						}
						int lifeline=m.nextInt();
						System.out.println();
						System.out.println();
						if(lifeline==1){
							try{
								ap=ap+1;
								if(ap==1){
									System.out.print("Audience are voting");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".\n\n\n\n\n");
									System.out.println("          Audience Rating");
									System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|");        
									System.out.println(" |-|     A     B    C   D     |-|");
									System.out.println(" |-|                          |-|");
									System.out.println(" |-|                          |-|");
									System.out.println(" |-|                          |-|");
									System.out.println(" |-|     __                   |-|");
									System.out.println(" |-|    |  |                  |-|");
									System.out.println(" |-|    |  |                  |-|");
									System.out.println(" |-|    |  |                  |-|");
									System.out.println(" |-|    |  |  __              |-|");
									System.out.println(" |-|    |60| |20|  __   __    |-|");
									System.out.println(" |-|    |  |_|  |_|10|_|10|   |-|");
									System.out.println(" |-|    |__|_|__|_|__|_|__|   |-|");
									System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|"); 
									for(int move=1;move<=16;move++){
										System.out.println();}
								}
								else{
									System.out.println("you have used this lifeline");
									lifeline(1);
								}
							}
							catch(InterruptedException exc){

							}
						}


						else if(lifeline==2){
							for(int space=1;space<=25;space++){
								System.out.println("");}
							ph=ph+1;
							if(ph==1){
								System.out.println("Choose any friend to call for help");
								System.out.println(" _________          _________            _________         _________  ");
								System.out.println("|         |\\      |         |\\        |         |\\     |         |\\");
								System.out.println("| SUNIL   | |      |  DEEPAK | |       	| PRAKHAR | |     |  KARAN  | |");
								System.out.println("|_________| |      |_________| |        |_________| |     |_________| |");
								System.out.println(" \\|________\\|     \\|_________\\|      \\|_________\\|   \\|_________\\|");
								System.out.println("Enter any one name for calling");

								for(int space=1;space<=24;space++){
									System.out.println("");  }         
								String call=m.next();
								switch(call){

								case "Sunil" :
								case "SUNIL" :   
								case "sunil" :
								case "Deepak" :
								case "deepak" :
								case "DEEPAK" :
								case "Prakhar" :
								case "prakhar" :
								case "PRAKHAR" :    
								case "Karan" :
								case "karan" :
								case "KARAN" :   

									System.out.print("Call is Diverting to "+call);

									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print("."); 
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print("."); 
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.println("."); 
									System.out.println("Hello");
									String as=m.next();

									System.out.println("Enter your question");
									String a=m.next();
									System.out.println("give me option");
									String asa=m.next(); 
									System.out.println("I think A is True");
									break;
								}
							}else{
								System.out.println("You have already used this lifeline");
								lifeline(1);
							}       
						}
						else if(lifeline==3){
							ask=ask+1;
							if(ask==1){
								System.out.println("Ask an Expert");
								System.out.println("our today expert is Pasha");
								System.out.print("Redirecting to Pasha");
								Thread.sleep(1000);
								System.out.println(".");
								Thread.sleep(1000);
								System.out.println(".");
								Thread.sleep(1000);
								System.out.println(".");
								Thread.sleep(1000);
								System.out.println(".");
								Thread.sleep(1000);
								System.out.println(".");
								Thread.sleep(1000);
								System.out.println("I think Option A is right");
								Thread.sleep(1000);

							}else{
								System.out.println("You have Already used this lifeline");
								lifeline(1);
							}
						}
						else{
							System.out.println("you have enter wrong choice");
							lifeline(1);
						}
					}
					catch(InterruptedException exc){ 
						System.out.println("!!!!!!!!!!!!!!!!!!!!RESTART!!!!!!!!!!!!!!!!!!!");
					}
				}
				//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
				//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


				else if(quesno==2){
					{
						try{
							System.out.print("------------------------------------------------------");
							System.out.print("\n|\t\t    Lifeline\t\t\t     |\n");
							System.out.println("------------------------------------------------------");
							System.out.println("1.Audience poll \t\t2.Phone a friend");
							System.out.println("3.Ask an expert");
							for(int space=1;space<=23;space++){
								System.out.println("");
							}
							int lifeline=m.nextInt();
							System.out.println();
							System.out.println();
							if(lifeline==1){
								try{
									ap=ap+1;
									if(ap==1){
										System.out.print("Audience are voting");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".\n\n\n\n\n");
										System.out.println("          Audience Rating");
										System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|");        
										System.out.println(" |-|     A     B    C   D     |-|");
										System.out.println(" |-|                          |-|");
										System.out.println(" |-|                          |-|");
										System.out.println(" |-|          __              |-|");
										System.out.println(" |-|         |  |             |-|");
										System.out.println(" |-|         |  |             |-|");
										System.out.println(" |-|         |  |             |-|");
										System.out.println(" |-|         |  |             |-|");
										System.out.println(" |-|         |  |             |-|");
										System.out.println(" |-|     __  |80|  __   __    |-|");
										System.out.println(" |-|    |10|_|  |_|10|_|10|   |-|");
										System.out.println(" |-|    |__|_|__|_|__|_|__|   |-|");
										System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|"); 
										for(int move=1;move<=16;move++){
											System.out.println();}
									}
									else{
										System.out.println("you have used this lifeline");
										lifeline(1);
									}

								}
								catch(InterruptedException exc){

								}
							}

							else if(lifeline==2){
								for(int space=1;space<=25;space++){
									System.out.println("");}
								ph=ph+1;
								if(ph==1){
									System.out.println("Choose any friend to call for help");
									System.out.println(" _________          _________            _________         _________  ");
									System.out.println("|         |\\      |         |\\        |         |\\     |         |\\");
									System.out.println("| PAVAN   | |      | INDIRA  | |        | DEEPAK  | |     |  KARAN  | |");
									System.out.println("|_________| |      |_________| |        |_________| |     |_________| |");
									System.out.println(" \\|________\\|     \\|_________\\|      \\|_________\\|   \\|_________\\|");
									System.out.println("Enter any one name for calling");

									for(int space=1;space<=24;space++){
										System.out.println("");  }         
									String call=m.next();
									switch(call){

									case "Pavan" :
									case "PAVAN" :   
									case "pavan" :
									case "Indira" :
									case "indira" :
									case "INDIRA" :
									case "Deepak" :
									case "deepak" :
									case "DEEPAK" :    
									case "Karan" :
									case "karan" :
									case "KARAN" :   

										System.out.print("Call is Diverting to "+call);

										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print("."); 
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print("."); 
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.println("."); 
										System.out.println("Hello");
										String as=m.next();

										System.out.println("Enter your question");
										String a=m.next();
										System.out.println("give me option");
										String asa=m.next(); 
										System.out.println("I think B is True");
										break;
									}
								}else{
									System.out.println("You have already used this lifeline");
									lifeline(2);
								}
							}
							else if(lifeline==3){
								ask=ask+1;
								if(ask==1){
									System.out.println("Ask an Expert");
									System.out.println("our today expert is Prakash");
									System.out.print("Redirecting to Prakash");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									Thread.sleep(1000);
									System.out.print(".");
									System.out.println("I think B is right");
								}else{
									System.out.println("You have Already used this lifeline");
									lifeline(2);
								}
							}
							else{
								System.out.println("you have enter wrong choice");
								lifeline(2);
							}
						}
						catch(InterruptedException exc){ 
							System.out.println("!!!!!!!!!!!!!!!!!!!!RESTART!!!!!!!!!!!!!!!!!!!");
						}
					} 
				}

				//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
				//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

				else if(quesno==3){
					{
						try{
							System.out.print("------------------------------------------------------");
							System.out.print("\n|\t\t    Lifeline\t\t\t     |\n");
							System.out.println("------------------------------------------------------");
							System.out.println("1.Audience poll \t\t2.Phone a friend");
							System.out.println("3.Ask an expert");
							for(int space=1;space<=23;space++){
								System.out.println("");
							}
							int lifeline=m.nextInt();
							System.out.println();
							System.out.println();
							if(lifeline==1){
								try{
									ap=ap+1;
									if(ap==1){
										System.out.print("Audience are voting");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".\n\n\n\n\n");
										System.out.println("          Audience Rating");
										System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|");        
										System.out.println(" |-|     A     B    C   D     |-|");
										System.out.println(" |-|                          |-|");
										System.out.println(" |-|                          |-|");
										System.out.println(" |-|                          |-|");
										System.out.println(" |-|                          |-|");
										System.out.println(" |-|                          |-|");
										System.out.println(" |-|               __         |-|");
										System.out.println(" |-|     __       |  |        |-|");
										System.out.println(" |-|    |  |  __  |  |        |-|");
										System.out.println(" |-|    |30| |20| |  |  __    |-|");
										System.out.println(" |-|    |  |_|  |_|40|_|10|   |-|");
										System.out.println(" |-|    |__|_|__|_|__|_|__|   |-|");
										System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|"); 
										for(int move=1;move<=15;move++){
											System.out.println();}
									}
									else{
										System.out.println("you have used this lifeline");
										lifeline(3);
									}
								}
								catch(InterruptedException exc){

								}
							}
							else if(lifeline==2){
								for(int space=1;space<=25;space++){
									System.out.println("");}
								ph=ph+1;
								if(ph==1){
									System.out.println("Choose any friend to call for help");
									System.out.println(" _________          _________            _________         _________  ");
									System.out.println("|         |\\      |         |\\        |         |\\     |         |\\");
									System.out.println("| PRAKHAR | |      |  PAVAN  | |        |  INDIRA | |     |  SUNIL  | |");
									System.out.println("|_________| |      |_________| |        |_________| |     |_________| |");
									System.out.println(" \\|________\\|     \\|_________\\|      \\|_________\\|   \\|_________\\|");
									System.out.println("Enter any one name for calling");

									for(int space=1;space<=24;space++){
										System.out.println("");  }         
									String call=m.next();
									switch(call){

									case "Prakhar" :
									case "PRAKHAR" :   
									case "prakhar" :
									case "Pavan" :
									case "pavan" :
									case "PAVAN" :
									case "Indira" :
									case "indira" :
									case "INDIRA" :    
									case "Sunil" :
									case "sunil" :
									case "SUNIL" :   

										System.out.print("Call is Diverting to "+call);

										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print("."); 
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print("."); 
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.println("."); 
										System.out.println("Hello");
										String as=m.next();

										System.out.println("Enter your question");
										String a=m.next();
										System.out.println("give me option");
										String asa=m.next(); 
										System.out.println("I think C is True");
										break;              

									}
								}else{
									System.out.println("You have already used this lifeline");
									lifeline(3);
								}
							}
							else if(lifeline==3){
								ask=ask+1;
								if(ask==1){
									System.out.println("Ask an Expert");
									System.out.println("our today expert is Pasha");
									System.out.print("Redirecting to Pasha");
									Thread.sleep(1000);
									System.out.println(".");
									Thread.sleep(1000);
									System.out.println(".");
									Thread.sleep(1000);
									System.out.println(".");
									Thread.sleep(1000);
									System.out.println(".");
									Thread.sleep(1000);
									System.out.println(".");
									System.out.println("I Think C is true");
								}else{
									System.out.println("You have Already used this lifeline");
									lifeline(3);
								}
							}
							else{
								System.out.println("you have enter wrong choice");
								lifeline(3);
							}
						}
						catch(InterruptedException exc){ 
							System.out.println("!!!!!!!!!!!!!!!!!!!!RESTART!!!!!!!!!!!!!!!!!!!");
						}
					}
				}
				else{
					{
						try{
							System.out.print("------------------------------------------------------");
							System.out.print("\n|\t\t    Lifeline\t\t\t     |\n");
							System.out.println("------------------------------------------------------");
							System.out.println("1.Audience poll \t\t2.Phone a friend");
							System.out.println("3.Ask an expert");
							for(int space=1;space<=23;space++){
								System.out.println("");
							}
							int lifeline=m.nextInt();
							System.out.println();
							System.out.println();
							if(lifeline==1){
								try{
									ap=ap+1;
									if(ap==1){
										System.out.print("Audience are voting");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".\n\n\n\n\n");
										System.out.println("          Audience Rating");
										System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|");        
										System.out.println(" |-|     A     B    C   D     |-|");
										System.out.println(" |-|                          |-|");
										System.out.println(" |-|                          |-|");
										System.out.println(" |-|                          |-|");
										System.out.println(" |-|                    __    |-|");
										System.out.println(" |-|                   |  |   |-|");
										System.out.println(" |-|                   |  |   |-|");
										System.out.println(" |-|                   |  |   |-|");
										System.out.println(" |-|          __       |  |   |-|");
										System.out.println(" |-|     __  |20|  __  |  |   |-|");
										System.out.println(" |-|    |10|_|  |_|10|_|60|   |-|");
										System.out.println(" |-|    |__|_|__|_|__|_|__|   |-|");
										System.out.println(" |-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|"); 
										for(int move=1;move<=16;move++){
											System.out.println();}
									}
									else{
										System.out.println("you have used this lifeline");
										lifeline(4);
									}

								}
								catch(InterruptedException exc){

								}
							}

							else if(lifeline==2){
								for(int space=1;space<=25;space++){
									System.out.println("");}
								ph=ph+1;
								if(ph==1){
									System.out.println("Choose any friend to call for help");
									System.out.println(" _________          _________            _________         _________  ");
									System.out.println("|         |\\      |         |\\        |         |\\     |         |\\");
									System.out.println("| KARAN   | |      |  SUNIL	 | |        |  DEEPAK | |     | PRAKHAR | |");
									System.out.println("|_________| |      |_________| |        |_________| |     |_________| |");
									System.out.println(" \\|________\\|     \\|_________\\|      \\|_________\\|   \\|_________\\|");
									System.out.println("Enter any one name for calling");



									for(int space=1;space<=24;space++){
										System.out.println("");  }         
									String call=m.next();
									switch(call){

									case "Karan" :
									case "KARAN" :   
									case "karan" :
									case "Sunil" :
									case "sunil" :
									case "SUNIL" :
									case "Deepak" :
									case "deepak" :
									case "DEEPAK" :    
									case "Prakhar" :
									case "prakhar" :
									case "PRAKHAR" :   

										System.out.print("Call is Diverting to "+call);

										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print("."); 
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print("."); 
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.print(".");
										Thread.sleep(1000);
										System.out.println("."); 
										System.out.println("Hello");
										String as=m.next();

										System.out.println("Enter your question");
										String a=m.next();
										System.out.println("give me option");
										String asa=m.next(); 
										System.out.println("I think D is True");
										break;
									}
								}
								else{
									System.out.println("You have already used this lifeline");
									lifeline(4);
								}
							}
							else if(lifeline==3){
								ask=ask+1;
								if(ask==1){
									System.out.println("Ask an Expert");
									System.out.println("our today expert is Prakash");
									System.out.print("Redirecting to Prakash");
									Thread.sleep(1000);
									System.out.println(".");
									Thread.sleep(1000);
									System.out.println(".");
									Thread.sleep(1000);
									System.out.println(".");
									Thread.sleep(1000);
									System.out.println(".");
									Thread.sleep(1000);
									System.out.println(".");
									System.out.println("I think D is right answer");

								}else{
									System.out.println("You have Already used this lifeline");
									lifeline(4);
								}
							}
							else{
								System.out.println("you have enter wrong choice");
								lifeline(4);
							}
						}
						catch(InterruptedException exc){ 
							System.out.println("!!!!!!!!!!!!!!!!!!!!RESTART!!!!!!!!!!!!!!!!!!!");
						}
					}
				}
			}   
		}


