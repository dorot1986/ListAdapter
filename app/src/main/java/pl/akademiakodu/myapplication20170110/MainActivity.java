package pl.akademiakodu.myapplication20170110;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.listOfBooks)
    ListView listOfBooks;

//    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        String[] booksName = {"Alicja", "4 dni", "java programming", "Junit tests", "Pragmatyczne testy", "Ty i ja"};
//        ArrayList<String> list = new ArrayList<String>();
//        list.addAll(Arrays.asList(booksName));
//        adapter = new ArrayAdapter<String>(this, R.layout.custom_row_book, list);
//
//        listOfBooks.setAdapter(adapter);

        createCustomList();


    }

    private void createCustomList(){
        List<BookData> booksData = new ArrayList<>();
        booksData.add(new BookData("Oskar", "Java", 99));
        booksData.add(new BookData("Wojtek B.", "Życie i nie życie", 53));
        booksData.add(new BookData("Tomasz K.", "Junit", 221));
        booksData.add(new BookData("Oskar", "Spring framework", 122));
        booksData.add(new BookData("Michał P.", "Hibernate podstawy", 320));

        BooksAdapter booksAdapter = new BooksAdapter(booksData, this);
        listOfBooks.setAdapter(booksAdapter);

    }
}
