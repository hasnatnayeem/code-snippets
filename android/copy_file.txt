File original_file = new File("file_path");

File destination_file = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/file_name.txt");

try
{
        FileChannel src = new FileInputStream(original_file).getChannel();
        FileChannel dst = new FileOutputStream(destination_file).getChannel();
        dst.transferFrom(src, 0, src.size());
        src.close();
        dst.close();
}
catch (Exception e) {
    
}
