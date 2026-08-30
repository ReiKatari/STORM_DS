package ui;

import b4.w0;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final w0 f13553a = new w0(4);

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f13554b;

    /* renamed from: c  reason: collision with root package name */
    public static final DateFormat[] f13555c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f13554b = strArr;
        f13555c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f13553a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f13554b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    DateFormat[] dateFormatArr = f13555c;
                    DateFormat dateFormat = dateFormatArr[i2];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(f13554b[i2], Locale.US);
                        dateFormat.setTimeZone(qi.g.f12552a);
                        dateFormatArr[i2] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
