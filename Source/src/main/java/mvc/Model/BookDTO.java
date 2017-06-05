package mvc.Model;

import mvc.POJO.Book;
import mvc.POJO.Books;
import mvc.POJO.helper.IdAdapter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BookDTO {

    private static final String FILE_NAME = "D:\\Cursuri\\An3\\Sem2\\SD\\WebAssign2\\books\\jaxb-books.xml";

    public List<Book> getBooks(String criteria){
        Books books = readFromXml();
        List<Book> booksWithCriteria = new ArrayList<>();

        for(Book book : books.getBooks()){
            if(book.getName().toLowerCase().contains(criteria.toLowerCase())){
                booksWithCriteria.add(book);
            } else if (book.getAuthor().toLowerCase().contains(criteria.toLowerCase())){
                booksWithCriteria.add(book);
            } else if ("".equals(criteria) || "*".equals(criteria)){
                booksWithCriteria = books.getBooks();
                break;
            }
        }

        return booksWithCriteria;
    }

    public void updateBook(Book book){
        Books books = readFromXml();

        for(Book b : books.getBooks()){
            if(b.getId().equals(book.getId())){
                books.getBooks().set(b.getId() - 1, book);
                writeToXml(books);
            }
        }
    }

    public void deleteBook(Book book){
        Books books = readFromXml();

        books.getBooks().remove(book.getId() - 1);
        writeToXml(books);
    }

    public void addBook(Book book){
        Books books = readFromXml();

        books.getBooks().add(book);
        writeToXml(books);
    }

    private void writeToXml(Books books){
        try {
            JAXBContext context = JAXBContext.newInstance(Books.class);
            Marshaller m = context.createMarshaller();
            //for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.setAdapter(new IdAdapter());
            // Write to System.out for debugging
            // m.marshal(emp, System.out);

            // Write to File
            m.marshal(books, new File(FILE_NAME));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private Books readFromXml(){
        Books books = new Books();

        try{
            JAXBContext context = JAXBContext.newInstance(Books.class);
            Unmarshaller un = context.createUnmarshaller();
            books = (Books) un.unmarshal(new File(FILE_NAME));
        } catch (JAXBException e){
            e.printStackTrace();
        }

        return books;
    }

}
