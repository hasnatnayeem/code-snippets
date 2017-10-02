public  static final String  toBanglaDigit(String number){
    if(number==null)
        return new String("");
    StringBuilder builder = new StringBuilder();
    try{
        for(int i =0;i<number.length();i++){
            if(Character.isDigit(number.charAt(i))){
                if(((int)(number.charAt(i))-48)<=9){
                    builder.append(banglaDigits[(int)(number.charAt(i))-48]);
                }else{
                    builder.append(number.charAt(i));
                }
            }else{
                builder.append(number.charAt(i));
            }
        }
    }catch(Exception e){
        return new String("");
    }
    return builder.toString();
}


