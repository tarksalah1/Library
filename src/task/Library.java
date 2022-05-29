package task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Library {
	private static book[] books;
	private static String username;
	private static student[] studentbooks2;

	Library(int booksnum, int studentsnum) {
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		books = new book[booksnum];
		studentbooks2 = new student[studentsnum];
		System.out.print("please enter your name : ");
		username = Scan.nextLine().toLowerCase();
		System.out.println();
	}

	public static void insertnum(int num, int num2) {
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		System.out.println("Welcome Mr " + username);
		System.out.println("Which one of the following operation would you like to do, please press");
		System.out.println("1 to check your name in");
		System.out.println("2 to search for Book's name");
		System.out.println("3 to search for Books by date");
		System.out.println("4 to search for number of copies of a book");
		System.out.println("5 for Book Insertion");
		System.out.println("6 to borrow a book");
		System.out.println("7 to search for an author");
		System.out.println("8 to back a book");
		System.out.println("9 to delete a book edition");
		System.out.println("10 to show books that someone borrowed");
		System.out.println("11 to delete a user");
		System.out.println("12 to see the list once more");
		System.out.println("-1 to exit the program");
		int x = Scan.nextInt();
		if (x == 1) {
			checkname(username, num);
		} else if (x == 2) {
			searchname();
		} else if (x == 3) {
			searchdate();
		} else if (x == 4) {
			bookcopies();
		} else if (x == 5) {
			Insertion();
		} else if (x == 6) {
			borrowbook(num);
		} else if (x == 7) {
			AuthorSearch();
		} else if (x == 8) {
			backbook();
		} else if (x == 9) {
			deletebookcopy();
		} else if (x == 10) {
			booksborrowed();
		} else if (x == 11) {
			deleteuser();
		} else if (x == 12) {
			insertnum(num, num2);
		} else if (x == -1) {
			return;
		} else {
			System.out.println("invalid number");
		}
	}

	public static boolean check(String username) {
		for (int i = 0; i < studentbooks2.length; i++) {
			if (studentbooks2[i] == null) {
				break;
			}
			String hh = studentbooks2[i].getname();
			if (hh.equalsIgnoreCase(username)) {
				return true;
			}
		}
		return false;
	}

	public static void checkname(String username, int booksnum) {
		for (int i = 0; i < studentbooks2.length; i++) {
			if (studentbooks2[i] == null) {
				break;
			}
			String hh = studentbooks2[i].getname();
			if (hh.equalsIgnoreCase(username)) {
				System.out.println("this name is already member in the library");
				return;
			}
		}
		for (int i = 0; i < studentbooks2.length; i++) {
			if (studentbooks2[i] == null) {
				book[] books = new book[booksnum];
				student Student = new student(username, books);
				studentbooks2[i] = Student;
				System.out.println("done Mr " + username + " you are now a member in the library");
				return;
			}
		}
		System.out.println("library is full now null in another time");
	}

	public static void searchname() {
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter book's name : ");
		String namebook = Scan.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				break;
			}
			String booksx = books[i].getname();

			if (namebook.equalsIgnoreCase(booksx)) {
				System.out.println(books[i].getbook());
				return;
			}
		}
		System.out.println("no books with that name");
	}

	public static void searchdate() {
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter date you want to search for : ");
		String datebook = Scan.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				break;
			}
			String booksx = books[i].getdate();
			if (datebook.equalsIgnoreCase(booksx)) {
				System.out.println("book with that date is " + books[i].getbook());
				return;
			}
		}
		System.out.println("no books with that date");
	}

	public static void bookcopies() {
		Scanner Scan = new Scanner(System.in);
		System.out.println("name of the book you want to know it's number of copies : ");
		String x = Scan.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				break;
			}
			String h = books[i].getname();
			if (h.equalsIgnoreCase(x)) {
				System.out.println("number of copies of that book are : " + books[i].getcopies());
				return;
			}
		}
		System.out.println("no books with that name please null again");
	}

	public static void Insertion() {
		Scanner Scan = new Scanner(System.in);
		String bookname;
		String authorname;
		String dateofrelase;
		System.out.print("before insertion library contains : ");
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				break;
			}
			System.out.println(i + 1 + " -" + " " + books[i].getbook() + " ");
		}
		System.out.println();
		System.out.print("name of the book : ");
		bookname = Scan.nextLine();
		System.out.println();
		System.out.println("name of the author is : ");
		authorname = Scan.nextLine();
		System.out.println();
		System.out.print("date of relase for the book : ");
		dateofrelase = Scan.nextLine();
		System.out.println();
		System.out.print("number of copies you want to insert of this edition : ");
		int x = Scan.nextInt();
		book books2 = new book(bookname, dateofrelase, x, authorname);
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = books2;
				break;
			}
			if (books[i] == books2) {
				System.out.println("this book is in the library");
				return;
			}
		}
		System.out.print("after insertion library contains : ");
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				break;
			}
			System.out.println(i + 1 + " -" + " " + books[i].getbook() + " ");
		}
		System.out.println();
		System.out.println("done added");
	}

	@SuppressWarnings("static-access")
	public static void borrowbook(int booksnum) {
		Scanner Scan = new Scanner(System.in);
		boolean ifit = check(username);
		if (ifit == false) {
			System.out.println("you should check in first");
			return;
		}
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("date of borrowing is " + dtf.format(now));
		System.out.print("enter book's name : ");
		String lol = Scan.nextLine();
		System.out.println();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				break;
			}
			String lol2 = books[i].getname();
			if (lol.equalsIgnoreCase(lol2)) {
				System.out.println("enter authors name : ");
				String x = Scan.nextLine();
				String h = books[i].getAuthor();
				if (h.equalsIgnoreCase(x)) {
					System.out.println("enter date of the book : ");
					String date = Scan.nextLine();
					String datename = books[i].getdate();
					if (datename.equalsIgnoreCase(date)) {
						System.out.print("before borrowing : ");
						for (int j = 0; j < books.length; j++) {
							if (books[j] != null) {
								System.out.println(books[j].getbook());
							}
						}
						System.out.println();
						System.out.println("borrow is done");
						books[i].setcopies(1);
						if (books[i].getcopies() == 0) {
							books[i] = null;
						}
						System.out.print("after borrowing : ");
						for (int j = 0; j < books.length; j++) {
							if (books[j] != null) {
								System.out.println(books[j].getbook());
							}
						}
						for (int j = 0; j < studentbooks2.length; j++) {
							String name = studentbooks2[j].getname();
							if (studentbooks2[j] != null) {
								if (name.equalsIgnoreCase(username)) {
									book Book = new book(lol, date, books[i].getcopies(), x);
									studentbooks2[j].setstudentbooks(Book);
								}
							}
							if (studentbooks2[i].getbooks()[booksnum - 1] != null) {
								System.out.println("you can't take more than " + booksnum + " book");
								break;
							}
						}
						System.out.println();
						LocalDateTime now2 = LocalDateTime.now();
						String h2 = now2.toString();
						String hh2 = h2.substring(8, 10);
						String hh3 = h2.substring(5, 7);
						int ii2 = Integer.parseInt(hh2);
						int ii3 = Integer.parseInt(hh3);
						ii2 = ii2 + 14;
						if (ii2 > 31) {
							ii2 -= 31;
							ii3 += 1;
							String hsa = Integer.toString(ii2);
							String hsa2 = Integer.toString(ii3);
							String last = h2.substring(0, 5) + hsa2 + "-" + hsa + " " + h2.substring(11, 19);
							System.out.println("last date to back the book is " + last);
							return;
						}
						String hsa = Integer.toString(ii2);
						String last = h2.substring(0, 8) + hsa + " " + h2.substring(11, 19);
						System.out.println("last date to back the book is " + last);
						return;
					}
				}
			}
		}
		System.out.println("no books with this name,Author or date");
	}

	public static void AuthorSearch() {
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		int z = 0;
		System.out.print("enter name of the author : ");
		String nameAuth = Scan.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				break;
			}
			String h = books[i].getAuthor();
			if (h.equalsIgnoreCase(nameAuth)) {
				z++;
				System.out.println(i + 1 + "-" + books[i].getbook());
			}
		}
		if (z == 0) {
			System.out.println("no authors with that name");
		}
	}

	@SuppressWarnings("static-access")
	public static void backbook() {
		Scanner Scan = new Scanner(System.in);
		boolean h = check(username);
		if (h == false) {
			System.out.println("you should check in first");
			return;
		}
		System.out.print("Enter book's name that you have borrowed : ");
		String namebook = Scan.nextLine();
		System.out.println();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				break;
			}
			String name = books[i].getname();
			if (name.equalsIgnoreCase(namebook)) {
				System.out.print("book before back yours : ");
				System.out.println(books[i].getbook());
				for (int j = 0; j < studentbooks2.length; j++) {
					if (studentbooks2[j] == null) {
						break;
					}
					if (studentbooks2[j].getname().equalsIgnoreCase(username)) {
						for (int k = 0; k < studentbooks2[j].getbooks().length; k++) {
							if (studentbooks2[k].getbooks()[k] == books[i]) {
								studentbooks2[k].getbooks()[k] = null;
								break;
							}
						}
					}
				}
				System.out.print("book after adding your copy : ");
				books[i].setcopies2(1);
				System.out.println(books[i].getbook());
				return;
			}
		}
		System.out.println("no another copies of that book");
		for (int i = 0; i < studentbooks2.length; i++) {
			if (studentbooks2[i] == null) {
				break;
			}
			if (studentbooks2[i].getname().equalsIgnoreCase(username)) {
				for (int j = 0; j < studentbooks2[i].getbooks().length; j++) {
					if (studentbooks2[j] == null) {
						break;
					}
					String name = studentbooks2[i].getbooks()[j].getname();
					if (name.equalsIgnoreCase(namebook)) {
						System.out.print("Enter date of the book that you have borrowed : ");
						String bookdate = Scan.nextLine();
						System.out.println();
						System.out.print("number of copies : ");
						int x = Scan.nextInt();
						System.out.println();
						System.out.println("name of author");
						String name2 = Scan.nextLine();
						book book2 = new book(namebook, bookdate, x, name2);
						for (int k = 0; k < books.length; k++) {
							if (books[k] == null) {
								books[k] = book2;
								break;
							}
						}
						System.out.print("books after adding the new one are : ");
						for (int k = 0; k < books.length; k++) {
							if (books[k] == null) {
								break;
							}
							System.out.println(k + 1 + "-" + books[k].getbook());
						}
						for (int k = 0; k < studentbooks2.length; k++) {
							if (studentbooks2[k].getname().equalsIgnoreCase(username)) {
								for (int l = 0; l < studentbooks2[k].getbooks().length; l++) {
									if (studentbooks2[l].getbooks()[l] == book2) {
										studentbooks2[l].getbooks()[l] = null;
									}
								}
							}
						}
					} else
						System.out.println("you dont have a book with that name");
				}
			}
		}
	}

	public static void deletebookcopy() {
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter name of book that you want to delete it's copy : ");
		String x = Scan.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				break;
			}
			String h = books[i].getname();
			if (h.equalsIgnoreCase(x)) {
				System.out.println("enter num of copies that you want to delete");
				int hh = Scan.nextInt();
				books[i].setcopies(hh);
			}
		}
		System.out.println("no books with that name please null again");
	}

	@SuppressWarnings("static-access")
	public static void booksborrowed() {
		Scanner Scan = new Scanner(System.in);
		System.out.print("enter name of the person you want to know what he has borrowed : ");
		String name = Scan.nextLine();
		boolean hh = check(name);
		if (hh == false) {
			System.out.println("he isn't a member");
			return;
		}
		for (int j = 0; j < studentbooks2.length; j++) {
			if (studentbooks2[j] != null) {
				if (studentbooks2[j].getname().equalsIgnoreCase(name)) {
					for (int i = 0; i < studentbooks2[j].getbooks().length; i++) {
						if (studentbooks2[j].getbooks()[i] != null) {
							System.out.println("he has borrowed : " + studentbooks2[j].getbooks()[i].getbook2());
							
						}
					}
				}
			}
		}
	}

	public static void deleteuser() {
		Scanner Scan = new Scanner(System.in);
		System.out.print("before deleting user, students in library are : ");
		for (int key = 0; key < studentbooks2.length; key++) {
			if (studentbooks2[key] == null) {
				break;
			}
			System.out.print(studentbooks2[key].getname() + ".");
		}
		System.out.println();
		System.out.print("enter name of the person you want to delete : ");
		String name = Scan.nextLine();
		for (int i = 0; i < studentbooks2.length; i++) {
			if (studentbooks2[i] == null) {
				break;
			}
			if (studentbooks2[i].getname().equalsIgnoreCase(name)) {
				studentbooks2[i] = null;
				System.out.print("after deleting that user : ");
				if (studentbooks2[0] == null) {
					System.out.println("no one has borrowed books in library now");
				}
				for (int key = 0; key < studentbooks2.length; key++) {
					if (studentbooks2[key] == null) {
						break;
					}
					System.out.print(studentbooks2[key].getname() + ".");
				}
				return;
			}
		}
		System.out.println("no one with that name");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter num of books you want to put in library");
		int y = Scan.nextInt();
		System.out.println("enter num of Students you want to put in library");
		int z = Scan.nextInt();
		Library library = new Library(y, z);
		book book1 = new book("tark", "1919", 5, "micheal");
		book book2 = new book("tarok", "1919", 5, "mego");
		book book3 = new book("lol", "1950", 4, "tark");
		book[] f = new book[y];
		f[0] = book1;
		f[1] = book2;
		f[2] = book3;
		books[0] = book1;
		books[1] = book2;
		student Student = new student("tark", f);
		studentbooks2[0] = Student;
		insertnum(y, z);
		boolean x = true;
		while (x) {
			System.out.println(
					"do you want to do another thing ? Answer with yes if you want or anything else to close program");
			Scan.nextLine();
			String choose = Scan.nextLine();
			if (choose.equalsIgnoreCase("yes")) {
				insertnum(y, z);
			} else {
				System.out.println("Thank You !");
				return;
			}
		}
	}
}

class book {
	private String title;
	private String date;
	private int copies;
	private String Authorname;

	public book(String T, String D, int C, String name) {
		this.title = T;
		this.date = D;
		this.copies = C;
		this.Authorname = name;
	}

	public String getbook2() {
		return "book title is " + title + " book's author is " + Authorname + " it's date is " + date;
	}

	public void setcopies() {
		copies = 1;
	}

	public String getbook() {
		return "book title is " + title + " book's author is " + Authorname + " it's date is " + date
				+ " and number of copies = " + copies;
	}

	public String getname() {
		return title;
	}

	public String getAuthor() {
		return Authorname;
	}

	public String getdate() {
		return date;
	}

	public int getcopies() {
		return copies;
	}

	public void setcopies(int numcopies) {
		copies -= numcopies;
	}

	public void setcopies2(int numcopies) {
		copies += numcopies;
	}
}

class student {
	private String name;
	private static book[] studentbooks;

	student(String name, book[] x) {
		this.name = name;
		studentbooks = x;
	}

	public String getname() {
		return name;
	}

	public static book[] getbooks() {
		return studentbooks;
	}

	public static void setstudentbooks(book s) {
		for (int k = 0; k < studentbooks.length; k++) {
			if (studentbooks[k] == null) {
				studentbooks[k] = s;
			}
		}
	}
}