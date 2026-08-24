package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kw5  reason: default package */
/* loaded from: classes.dex */
public final class kw5 {
    public final Uri a;
    public final Long b;
    public final jw5 c;

    public kw5(Uri uri, Long l, jw5 jw5Var) {
        uri.getClass();
        jw5Var.getClass();
        this.a = uri;
        this.b = l;
        this.c = jw5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw5)) {
            return false;
        }
        kw5 kw5Var = (kw5) obj;
        if (nb3.k(this.a, kw5Var.a) && nb3.k(this.b, kw5Var.b) && this.c == kw5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Long l = this.b;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "RomDirectoryScanStatus(directoryUri=" + this.a + ", lastScanTimestamp=" + this.b + ", result=" + this.c + ")";
    }
}
