import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;

class DateEx 
{
	public static void main(String[] args) 
	{
		 
           String inputDate = "29-02-2018";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate date = LocalDate.parse(inputDate, formatter);
            System.out.println("Given date: " + date);
            System.out.println("Month: " + date.getMonth());
			date=LocalDate.of(2018,02,29);
        } catch (DateTimeException e) {
            System.out.println("Invalid date: " + inputDate);
        }
	}
}
