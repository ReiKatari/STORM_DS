package xa;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends ua.u {

    /* renamed from: c  reason: collision with root package name */
    public static final e f14493c = new e();

    /* renamed from: a  reason: collision with root package name */
    public final g f14494a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f14495b;

    public h(g gVar) {
        ArrayList arrayList = new ArrayList();
        this.f14495b = arrayList;
        Objects.requireNonNull(gVar);
        this.f14494a = gVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (wa.j.f14182a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        Date b10;
        DateFormat dateFormat;
        TimeZone timeZone;
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        String b02 = aVar.b0();
        synchronized (this.f14495b) {
            try {
                ArrayList arrayList = this.f14495b;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        dateFormat = (DateFormat) obj;
                        timeZone = dateFormat.getTimeZone();
                        b10 = dateFormat.parse(b02);
                        dateFormat.setTimeZone(timeZone);
                    } else {
                        try {
                            b10 = ya.a.b(b02, new ParsePosition(0));
                            break;
                        } catch (ParseException e6) {
                            StringBuilder u4 = w.d.u("Failed parsing '", b02, "' as Date; at path ");
                            u4.append(aVar.B(true));
                            throw new RuntimeException(u4.toString(), e6);
                        }
                    }
                }
            } catch (ParseException unused) {
                dateFormat.setTimeZone(timeZone);
            } finally {
            }
        }
        return this.f14494a.a(b10);
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            cVar.F();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f14495b.get(0);
        synchronized (this.f14495b) {
            format = dateFormat.format(date);
        }
        cVar.Y(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f14495b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
