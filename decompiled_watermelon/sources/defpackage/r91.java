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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r91  reason: default package */
/* loaded from: classes.dex */
public final class r91 extends dz6 {
    public static final o91 c = new o91();
    public final q91 a;
    public final ArrayList b;

    public r91(q91 q91Var, int i, int i2) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(q91Var);
        this.a = q91Var;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (b63.a >= 9) {
            StringBuilder sb = new StringBuilder();
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            str = "M/d/yy";
                        } else {
                            i.i(wh1.g(i, "Unknown DateFormat style: "));
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
                        i.i(wh1.g(i2, "Unknown DateFormat style: "));
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

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        Date b;
        DateFormat dateFormat;
        TimeZone timeZone;
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        String l0 = o83Var.l0();
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
                            b = bv2.b(l0, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder u = b31.u("Failed parsing '", l0, "' as Date; at path ");
                            u.append(o83Var.I());
                            throw new RuntimeException(u.toString(), e);
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

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            b93Var.F();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            format = dateFormat.format(date);
        }
        b93Var.Z(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
