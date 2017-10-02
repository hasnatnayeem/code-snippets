public static void exportDatabase () {
    File original_file = new File("/data/data/com.example.project/databases/project.db");
    // Changing destination database's extention to sqlite for future convenience
    File destination_file = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/project.sqlite"); 

    try
    {
        FileChannel src = new FileInputStream(original_file).getChannel();
        FileChannel dst = new FileOutputStream(destination_file).getChannel();
        dst.transferFrom(src, 0, src.size());
        src.close();
        dst.close();
    }
    catch (Exception e) {
        e.printStackTrace();
    }
}

