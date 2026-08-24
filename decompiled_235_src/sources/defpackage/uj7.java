package defpackage;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uj7  reason: default package */
/* loaded from: classes.dex */
public abstract class uj7 {
    public static final AtomicReference a = new AtomicReference();

    public static Calendar a(Calendar calendar) {
        Calendar c = c(calendar);
        Calendar c2 = c(null);
        c2.set(c.get(1), c.get(2), c.get(5));
        return c2;
    }

    public static Calendar b() {
        z57 z57Var = (z57) a.get();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
