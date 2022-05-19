import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int enter , year , nbWords, size , count ;
		String name , location , title ;
		
		System.out.println("Welcome to Conference management");
		System.out.println("To log in to the hotel management");
		System.out.print("please enter the Conference name .. ");  name = input.next();
		System.out.print("please enter the Conference location .. ");  location = input.next();
		System.out.print("please enter the Conference year .. ");  year = input.nextInt();
		System.out.print("Please enter the conference How many Conference has papers .. ");  size = input.nextInt();

		Conference conf = new Conference(name , location , year , size);
		
		do {
			System.out.println("");

			System.out.println("To add papers to the conference, Enter 1");
			System.out.println("To print the youngest author , Enter 2");
			System.out.println("To print the number of senior authors in the conference, Enter 3");
			System.out.println("To and print both long and short papers, Enter 4");
			System.out.println("To exit, Enter 5");

			System.out.print("Enter Your Option: "); enter = input.nextInt();
			
			System.out.println("");
			
			if (enter == 1 ) {
				System.out.print("please enter the Paper title .. ");  title = input.next();
				System.out.print("Please enter the Paper year .. ");  year = input.nextInt();
				System.out.print("Please enter the Number of words .. ");  nbWords = input.nextInt();
				Paper p = new Paper(title , year, nbWords);      
				System.out.print("this paper how mony authors .. ");
				int a = input.nextInt();
				if (a > 0 && a < 6) {
					for (int i = 0 ; i < a ; i++) {
						System.out.print("Enter name of author .. ");
						String n = input.next();
						System.out.print("Enter age of author .. ");
						int g = input.nextInt();
						Author obj = new Author(n,g);
						p.addAuthor(obj);
					}
				} else {
					System.out.print("outside the domin");
				}
				conf.addPaper(p); 
			}
			else if (enter == 2 ) {
				conf.printYoungest();
			}
			else if (enter == 3 ) {
				count = conf.countSeniorAuthors();
				System.out.println("Authors whose ages are greater than or equal to 50 is " + count +" Authores.");
			}
			else if (enter == 4 ) {
				Paper longPapers[] = new Paper[size];
				Paper shortPapers[] = new Paper[size];
				
				System.out.println("The minimum number of words per sheet");
				int n = input.nextInt();
				conf.splitPapers(n, longPapers, shortPapers);
				

				System.out.println("The long Papers ");

				for (int i = 0 ; i <longPapers.length  ; i++) {
					if (longPapers[i] != null) {
						System.out.println("Peaper " + longPapers[i].getTitle() + 
								" has words is " + longPapers[i].getnbWords() + 
								" and it wrote in " + longPapers[i].getYear());
					}
				}
				
				System.out.println("");
				System.out.println("The short Papers ");

				for (int i = 0 ; i <longPapers.length  ; i++) {
					if (longPapers[i] != null) {
						System.out.println("Peaper " + longPapers[i].getTitle() + 
								" has words is " + longPapers[i].getnbWords() + 			
								" and it wrote in " + longPapers[i].getYear());
					}
				}
			
			} else if (enter == 5 ) {
				System.out.println("Thank you for use Conference management!!!");
			}
		} while (enter > 0 && enter < 5);
	}

}
