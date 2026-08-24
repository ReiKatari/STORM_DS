package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sw5  reason: default package */
/* loaded from: classes.dex */
public final class sw5 extends hi2 {
    public final Uri o;
    public final Uri p;

    public sw5(Uri uri, Uri uri2) {
        this.o = uri;
        this.p = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw5)) {
            return false;
        }
        sw5 sw5Var = (sw5) obj;
        if (nb3.k(this.o, sw5Var.o) && nb3.k(this.p, sw5Var.p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Uri uri = this.o;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i2 = hashCode * 31;
        Uri uri2 = this.p;
        if (uri2 != null) {
            i = uri2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "GbaRom(romPath=" + this.o + ", savePath=" + this.p + ")";
    }
}
