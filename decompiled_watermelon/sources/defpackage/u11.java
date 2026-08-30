package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u11  reason: default package */
/* loaded from: classes.dex */
public final class u11 {
    public static final Pattern k = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern m = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public u11(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u11) {
            u11 u11Var = (u11) obj;
            if (u11Var.a.equals(this.a) && u11Var.b.equals(this.b) && u11Var.c == this.c && u11Var.d.equals(this.d) && u11Var.e.equals(this.e) && u11Var.f == this.f && u11Var.g == this.g && u11Var.h == this.h && u11Var.i == this.i && b53.x(u11Var.j, this.j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int c = ej6.c(ej6.c(ej6.c(ej6.c(ej6.b(ej6.b(b31.c(this.c, ej6.b(ej6.b(527, 31, this.a), 31, this.b), 31), 31, this.d), 31, this.e), this.f, 31), this.g, 31), this.h, 31), this.i, 31);
        String str = this.j;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return c + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j = this.c;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) l81.a.get()).format(new Date(j));
                format.getClass();
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String str = this.j;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        return sb.toString();
    }
}
