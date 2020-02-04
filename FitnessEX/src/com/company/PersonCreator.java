package com.company;

import java.util.ArrayList;

public class PersonCreator {



    public ArrayList<Employee>  employees () {

        ArrayList<Employee> em = new ArrayList<>();
        em.add(new Administration("Anne", "065489-1234", 37, 23000, true));
        em.add(new Instructor("Nadia", "020398-0412", 20, 456, false));
        em.add(new Administration("Christian", "020499-0913", 37, 23000, true));
        em.add(new Instructor("Andreas", "010579-0612", 12, 456, false));

        return em;
    }

    public ArrayList<Member> Members () {
        ArrayList<Member> me = new ArrayList<>();

        me.add(new Member("Molle", "654597-2335", true));
        me.add(new Member("Helle", "643278-0000", true));
        me.add(new Member("Francis", "010290-3210",false));
        me.add(new Member("Erik", "065434-0712", false));

        return me;
    }


}
