public void askPermissions() {
    String[] permissions = {
            "android.permission.WRITE_EXTERNAL_STORAGE",
            "android.permission.INTERNET",
            "android.permission.ACCESS_FINE_LOCATION",
    };
    int requestCode = 200;
    ActivityCompat.requestPermissions(
            SplashActivity.this,
            permissions,
            requestCode
    );
}
