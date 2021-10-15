// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie03.task04;

/* ************************************************************************* *\
*                Programmierung 1 HS 2020 - Serie 3-1                         * 
\* ************************************************************************* */

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.*;
import java.util.concurrent.TimeUnit;

public class Book
{
	private int id;
	private String title;
	private String author;
	private Date dateOfPublication;

	public static final String DATE_FORMAT = "dd.MM.yyyy";

	//--- constructors ---

	/**
	 * @param id id of the book
	 * @param title title of the book
	 * @param author author of the book
	 * @param dateOfPublication date of publication as a string (dd.mm.yyyy)
	 */
	public Book(int id, String title, String author, String dateOfPublication) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.dateOfPublication = stringToDate(dateOfPublication);
	}

	/**
	 * Returns the age of the book in days since publication
	 * @return age
	 */
	public int age()
	{
		return (int) TimeUnit.MILLISECONDS.toDays(new Date().getTime() - dateOfPublication.getTime());
	}

	/** Returns a String representation of the book */
	public String toString()
	{
		return id + ", " + title + ", " + author + ", " + dateToString(dateOfPublication); //this is to avoid compiler errors, replace it!
	}

	/** Reads all book data from user input */
	public void input() 
	{
		Scanner scn = new Scanner( System.in );
		System.out.println( "Please enter id: " );
		this.id = scn.nextInt();

		System.out.println( "Please enter the title: " );
		this.title = scn.nextLine();

		System.out.println( "Please enter the author: " );
		this.author = scn.nextLine();

		System.out.println( "Please enter the date of publication: " );
		this.dateOfPublication = stringToDate(scn.nextLine());
	}

	//--- Get-/Set-methods ---

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(Date dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	//--- helper methods -- DO NOT CHANGE ------------------------------------
	/** Converts the Date object d into a String object */
	public static String dateToString( Date d )
	{
		SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
		return fmt.format( d );
	}

	/** Converts the String object s into a Date object */
	public static Date stringToDate( String s ) 
	{
		Date r = null;
		try {
			SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
			r = fmt.parse( s );
		} catch ( ParseException e ){
			System.err.println( e );
			System.exit(1);
		}
		return r;
	}
}
