package com.mycompany.bookstore.serdeser;

import com.mycompany.bookstore.entity.BookEntity;

import java.io.*;

public class BookSerializer {

    public static void serializeBook(BookEntity bookEntity){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
             fos = new FileOutputStream(bookEntity.getBookId()+".ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(bookEntity);
        }
        catch (IOException ex){
            ex.printStackTrace();

        }
        finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static BookEntity deSerializeBook(Long bookId){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        BookEntity be = null;
        try{
            fis = new FileInputStream(bookId+".ser");
            ois = new ObjectInputStream(fis);
            be = (BookEntity) ois.readObject();
        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException ie){
            ie.printStackTrace();
        }
        finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return be;
    }
}
