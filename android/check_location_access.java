public static boolean isLocationEnabled(Context mContext) {
    LocationManager locationManager = (LocationManager) mContext.getSystemService(LOCATION_SERVICE);
    return locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
}

public static void checkLocationAccess(Context mContext) {
    if (!isLocationEnabled(mContext)) {
        showGpsSettingAlert(mContext, true);
    }
}

public static void showGpsSettingAlert(final Context mContext){
    AlertDialog.Builder alertDialog = new AlertDialog.Builder(mContext);
    
    alertDialog.setTitle("GPS"); // Setting Dialog Title
    alertDialog.setCancelable(true); // Dialog will be closed if touched outside, if set to false dialog cant be closed until cancel button is pressed

    alertDialog.setMessage("GPS is not enabled. Please got to setting to enable it.");

    alertDialog.setPositiveButton("Settings", new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog,int which) {
            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            mContext.startActivity(intent);
        }
    });

    alertDialog.setNegativeButton("বাতিল", new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int which) {
            dialog.cancel();
        }
    });

    alertDialog.show();
}
