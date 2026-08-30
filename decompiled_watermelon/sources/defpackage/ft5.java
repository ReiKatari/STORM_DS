package defpackage;

import android.net.Uri;
import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ft5  reason: default package */
/* loaded from: classes.dex */
public final class ft5 {
    public final int a;
    public final boolean b;
    public final Date c;
    public final Uri d;

    public ft5(int i, boolean z, Date date, Uri uri) {
        this.a = i;
        this.b = z;
        this.c = date;
        this.d = uri;
    }

    public static ft5 a(ft5 ft5Var, Uri uri) {
        return new ft5(ft5Var.a, ft5Var.b, ft5Var.c, uri);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft5)) {
            return false;
        }
        ft5 ft5Var = (ft5) obj;
        if (this.a == ft5Var.a && this.b == ft5Var.b && b53.x(this.c, ft5Var.c) && b53.x(this.d, ft5Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = ej6.c(Integer.hashCode(this.a) * 31, this.b, 31);
        int i = 0;
        Date date = this.c;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (c + hashCode) * 31;
        Uri uri = this.d;
        if (uri != null) {
            i = uri.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "SaveStateSlot(slot=" + this.a + ", exists=" + this.b + ", lastUsedDate=" + this.c + ", screenshot=" + this.d + ")";
    }
}
