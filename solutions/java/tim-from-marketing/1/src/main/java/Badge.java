class Badge {
    public String print(Integer id, String name, String department) {
        String idVal = id == null ? "" : "["+id+"]"+" - ";
        String factoryDepartment = department != null ? department.toUpperCase() : "OWNER";
        return String.format("%s%s - %s",idVal,name,factoryDepartment);
    }
}
