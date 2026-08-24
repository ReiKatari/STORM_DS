package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c51  reason: default package */
/* loaded from: classes.dex */
public final class c51 {
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

    public c51(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
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
        if (obj instanceof c51) {
            c51 c51Var = (c51) obj;
            if (c51Var.a.equals(this.a) && c51Var.b.equals(this.b) && c51Var.c == this.c && c51Var.d.equals(this.d) && c51Var.e.equals(this.e) && c51Var.f == this.f && c51Var.g == this.g && c51Var.h == this.h && c51Var.i == this.i && nb3.k(c51Var.j, this.j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int e = xg6.e(xg6.e(xg6.e(xg6.e(xg6.d(xg6.d(i61.c(this.c, xg6.d(xg6.d(527, 31, this.a), 31, this.b), 31), 31, this.d), 31, this.e), this.f, 31), this.g, 31), this.h, 31), this.i, 31);
        String str = this.j;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return e + i;
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
                String format = ((DateFormat) cc1.a.get()).format(new Date(j));
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
