package mvc.CSV;

import mvc.Model.BookDTO;
import mvc.Model.UserDTO;
import mvc.POJO.Book;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvFileWriter {

    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";

    private static final String NEW_LINE_SEPARATOR = "\n";

    //CSV file header
    private static final String FILE_HEADER = "id, name, author ,quantity, price";


    static final String fileName = "C:\\Users\\vlad_\\Desktop\\UserSDGabrielM-sd2016_30434_marinescu_gabriel-b63c02c25026\\VladFloreaDS\\A2\\Source\\jaxb-users.xml";

    public static void writeToCvsFile(){
        BookDTO bookDTO = new BookDTO();

        List<Book> books = bookDTO.getBooks("*");

        FileWriter fileWriter = null;

        try{
            fileWriter = new FileWriter(fileName);

            //Write the CSV file header
            fileWriter.append(FILE_HEADER);
            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            for(Book book : books){
                if(book.getQuantity() == 0){
                    fileWriter.append(String.valueOf(book.getId()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(book.getName());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(book.getAuthor());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(book.getQuantity()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(book.getPrice()));
                    fileWriter.append(NEW_LINE_SEPARATOR);
                }
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
    }
}
