class Badge {
    public String print(Integer id, String name, String department) {
        String idVal = (id == null) ? "" : id.toString();
        String factoryDepartment = (department == null) ? "OWNER": department.toUpperCase();
        StringBuilder message = new StringBuilder();
        if(!idVal.equals("")){
            message.append("["+idVal+"]"+" - ");
        }
        message.append(name + " - " + factoryDepartment);
        return message.toString();
    }
}
