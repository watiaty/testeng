package pl.watiaty.testeng.entity;

public enum Permission {
    TESTS_READ("tests:read"),
    TESTES_WRITE("tests:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
