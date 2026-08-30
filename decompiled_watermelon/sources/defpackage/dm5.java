package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dm5  reason: default package */
/* loaded from: classes.dex */
public final class dm5 extends me2 {
    public final Uri d;
    public final Uri e;

    public dm5(Uri uri, Uri uri2) {
        this.d = uri;
        this.e = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm5)) {
            return false;
        }
        dm5 dm5Var = (dm5) obj;
        if (b53.x(this.d, dm5Var.d) && b53.x(this.e, dm5Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Uri uri = this.d;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i2 = hashCode * 31;
        Uri uri2 = this.e;
        if (uri2 != null) {
            i = uri2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "GbaRom(romPath=" + this.d + ", savePath=" + this.e + ")";
    }
}
