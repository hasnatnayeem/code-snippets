public static String bitMapToString(Bitmap bitmap){
    ByteArrayOutputStream baos = new  ByteArrayOutputStream();
    bitmap.compress(Bitmap.CompressFormat.JPEG, 90, baos);
    byte [] b = baos.toByteArray();
    String temp = Base64.encodeToString(b, Base64.DEFAULT);
    return temp;
}
