package Week6.RoleManagement;

import java.sql.SQLOutput;

public class Dashboard {
    static void main(String[] args) {
        EnumRoleManagement enumRoleManagement = EnumRoleManagement.ADMIN;
        switch (enumRoleManagement){
            case USER -> System.out.println("this for user");
            case ADMIN -> System.out.println("admin for use");
            case MODERATOR -> System.out.println("moderator in use");
            case GUEST -> System.out.println("This is for guest");
        }
    }
}
