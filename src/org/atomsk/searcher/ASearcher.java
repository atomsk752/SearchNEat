package org.atomsk.searcher;

import org.atomsk.domain.Store;

import java.util.ArrayList;

public class ASearcher extends AbstractSearcher{

    ASearcher() throws  Exception{

    }
    @Override
    public ArrayList<Store> search() {
        System.out.println("Search the area. 1.Jeju, 2. Jeonla, 3.Kangwon, 4. Kyengsang");
        String area = scanner.nextLine();

        String fileName = "C:\\zzz\\" + area + "_store.txt";

        try {
            load(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    }


