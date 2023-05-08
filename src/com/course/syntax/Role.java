package com.course.syntax;

public class Role {
    private boolean viewAll;
    private boolean editAll;
    private boolean addAll;
    private boolean deleteAll;
    Type type;

    enum Type {
        ADMIN,
        MAIN_CUSTOMER,
        CUSTOMER,
        VIEWER
    }

    public Role(Type type) {
        this.type = type;
        switch (type) {
            case ADMIN -> {
                viewAll = true;
                editAll = true;
                addAll = true;
                deleteAll = true;
            }
            case MAIN_CUSTOMER -> {
                viewAll = true;
                editAll = true;
                addAll = true;
                deleteAll = false;
            }
            case VIEWER -> {
                viewAll = true;
                editAll = false;
                addAll = false;
                deleteAll = false;
            }
            case CUSTOMER -> {
                viewAll = true;
                editAll = false;
                addAll = true;
                deleteAll = false;
            }
        }
    }

    @Override
    public String toString() {
        return "Role{" +
                "type=" + type +
                '}';
    }
}


