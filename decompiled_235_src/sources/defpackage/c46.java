package defpackage;

import android.net.Uri;
import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c46  reason: default package */
/* loaded from: classes.dex */
public final class c46 {
    public final int a;
    public final boolean b;
    public final Date c;
    public final Uri d;
    public final String e;

    public /* synthetic */ c46(int i, boolean z, Date date, String str, int i2) {
        this(i, z, date, (Uri) null, (i2 & 16) != 0 ? null : str);
    }

    public static c46 a(c46 c46Var, Uri uri) {
        return new c46(c46Var.a, c46Var.b, c46Var.c, uri, c46Var.e);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c46) {
                c46 c46Var = (c46) obj;
                if (this.a != c46Var.a || this.b != c46Var.b || !nb3.k(this.c, c46Var.c) || !nb3.k(this.d, c46Var.d) || !nb3.k(this.e, c46Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int e = xg6.e(Integer.hashCode(this.a) * 31, this.b, 31);
        int i = 0;
        Date date = this.c;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        Uri uri = this.d;
        if (uri == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return (i3 + i) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveStateSlot(slot=");
        sb.append(this.a);
        sb.append(", exists=");
        sb.append(this.b);
        sb.append(", lastUsedDate=");
        sb.append(this.c);
        sb.append(", screenshot=");
        sb.append(this.d);
        sb.append(", customName=");
        return i61.n(sb, this.e, ", bookmarkTag=null)");
    }

    public c46(int i, boolean z, Date date, Uri uri, String str) {
        this.a = i;
        this.b = z;
        this.c = date;
        this.d = uri;
        this.e = str;
    }
}
