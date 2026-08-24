package defpackage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nd1  reason: default package */
/* loaded from: classes.dex */
public final class nd1 extends yc7 {
    public static final kd1 c = new kd1();
    public final md1 a;
    public final ArrayList b;

    public nd1(md1 md1Var, int i, int i2) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(md1Var);
        this.a = md1Var;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (qc3.a >= 9) {
            StringBuilder sb = new StringBuilder();
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            str = "M/d/yy";
                        } else {
                            i.h(lb1.g(i, "Unknown DateFormat style: "));
                            throw null;
                        }
                    } else {
                        str = "MMM d, yyyy";
                    }
                } else {
                    str = "MMMM d, yyyy";
                }
            } else {
                str = "EEEE, MMMM d, yyyy";
            }
            sb.append(str);
            sb.append(" ");
            if (i2 != 0 && i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        str2 = "h:mm a";
                    } else {
                        i.h(lb1.g(i2, "Unknown DateFormat style: "));
                        throw null;
                    }
                } else {
                    str2 = "h:mm:ss a";
                }
            } else {
                str2 = "h:mm:ss a z";
            }
            sb.append(str2);
            arrayList.add(new SimpleDateFormat(sb.toString(), locale));
        }
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        Date b;
        DateFormat dateFormat;
        TimeZone timeZone;
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        String l0 = hf3Var.l0();
        synchronized (this.b) {
            try {
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        dateFormat = (DateFormat) obj;
                        timeZone = dateFormat.getTimeZone();
                        b = dateFormat.parse(l0);
                        dateFormat.setTimeZone(timeZone);
                    } else {
                        try {
                            b = e13.b(l0, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder t = i61.t("Failed parsing '", l0, "' as Date; at path ");
                            t.append(hf3Var.D());
                            throw new RuntimeException(t.toString(), e);
                        }
                    }
                }
            } catch (ParseException unused) {
                dateFormat.setTimeZone(timeZone);
            } finally {
            }
        }
        return this.a.a(b);
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            vf3Var.A();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            format = dateFormat.format(date);
        }
        vf3Var.c0(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
