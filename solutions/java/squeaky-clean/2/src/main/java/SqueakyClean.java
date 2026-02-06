class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder  builder = new StringBuilder();
        boolean capitalLetter = false;
        
        char[] asArray = identifier.toCharArray();
        for(Character ch: asArray){
            if(ch.isWhitespace(ch)){
                ch = '_';
                builder.append(ch);
            }else if(ch == '-'){
                capitalLetter = true;
            }
            else if(ch.isLetter(ch)){
                if(capitalLetter){
                    builder.append(ch.toUpperCase(ch));
                    capitalLetter = false;
                }else{
                    builder.append(ch);
                }
            }
            else {
                switch(ch){
                        case '4' -> builder.append('a');
                        case '3' -> builder.append('e');
                        case '0' -> builder.append('o');
                        case '1' -> builder.append('l');
                        case '7' -> builder.append('t');
                }
            }
        }
        return builder.toString();
    }
}
