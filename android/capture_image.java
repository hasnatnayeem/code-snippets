@Override
public void onClick(View view) {
    Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    String path = Environment.getExternalStorageDirectory() + "/test.jpg";
    File file = new File(path);
    Uri outputFileUri = Uri.fromFile(file);
    intent.putExtra( MediaStore.EXTRA_OUTPUT, outputFileUri );
    startActivityForResult(intent, CAMERA_REQUEST);
}

protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
        //Bitmap mphoto = (Bitmap) data.getExtras().get("data");  //Used for saving the raw photo without file uri selection
        File imgFile = new  File(Environment.getExternalStorageDirectory() + "/test.jpg");
        Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());

        // To resize image
        Bitmap resized = Bitmap.createScaledBitmap(myBitmap,(int)(myBitmap.getWidth()*0.25), (int)(myBitmap.getHeight()*0.25), true);

        File dest = new File(Environment.getExternalStorageDirectory(), filename);
        try {
            FileOutputStream out = new FileOutputStream(dest);
            resized.compress(Bitmap.CompressFormat.JPEG, 90, out);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
