package mvc.Controller;

import mvc.CSV.CsvFileWriter;
import mvc.Model.BookDTO;
import mvc.POJO.Book;
import mvc.POJO.Books;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {

    @RequestMapping(value = "/searchBooks", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody List<Book> searchBook(@RequestBody String searchString){
        BookDTO bookDTO = new BookDTO();
        List<Book> books = bookDTO.getBooks(searchString);

        return books;
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody String addBook(@RequestBody Book book){
        BookDTO bookDTO = new BookDTO();
        bookDTO.addBook(book);

        return "";
    }

    @RequestMapping(value = "/updateBook", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody String updateBook(@RequestBody Book book){
        BookDTO bookDTO = new BookDTO();
        bookDTO.updateBook(book);

        return "";
    }

    @RequestMapping(value = "/deleteBook", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody String deleteBook(@RequestBody Book book){
        BookDTO bookDTO = new BookDTO();
        bookDTO.deleteBook(book);

        return "";
    }

    @RequestMapping(value = "/createReport", method = RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private void createReport(){
        CsvFileWriter.writeToCvsFile();
    }
}
