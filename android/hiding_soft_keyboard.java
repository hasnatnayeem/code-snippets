public static void hideKeyboard(Activity activity) {
    View v = activity.getCurrentFocus();
    if (v instanceof EditText == false) { // If user touched outside an edittext then the soft keyboard should hide itself
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(activity.getWindow().getDecorView().getRootView().getWindowToken()  , 0);
    }
}
