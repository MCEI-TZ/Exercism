class Badge {
    public String print(Integer id, String name, String department) {
        String factoryDepartment = (department == null) ? "OWNER": department.toUpperCase();
        StringBuilder message = new StringBuilder();
        if(id != null){
            message.append("["+id+"]"+" - ");
        }
        message.append(name + " - " + factoryDepartment);
        return message.toString();
    }
}
