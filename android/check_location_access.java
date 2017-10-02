public static boolean isLocationEnabled(Context mContext) {
    LocationManager locationManager = (LocationManager) mContext.getSystemService(LOCATION_SERVICE);
    return locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
}
