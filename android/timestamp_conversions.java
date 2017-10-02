// Used for converting long timestamp to integer. That means trimming the microsecond part
public static String trimTimestamp(long timestamp) {
    String timeStamp = timestamp + "";
    return timeStamp.substring(0, 10);
}


public static String timestampToDate(long timestamp) {

    DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    Date netDate = (new Date(timestamp));
    return sdf.format(netDate);
}

public static String timestampToDateAndTime(long timestamp) {

    DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
    Date netDate = (new Date(timestamp));
    return sdf.format(netDate);
}
