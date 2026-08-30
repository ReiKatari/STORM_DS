package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vl5  reason: default package */
/* loaded from: classes.dex */
public final class vl5 {
    public final Uri a;
    public final Long b;
    public final ul5 c;

    public vl5(Uri uri, Long l, ul5 ul5Var) {
        uri.getClass();
        ul5Var.getClass();
        this.a = uri;
        this.b = l;
        this.c = ul5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl5)) {
            return false;
        }
        vl5 vl5Var = (vl5) obj;
        if (b53.x(this.a, vl5Var.a) && b53.x(this.b, vl5Var.b) && this.c == vl5Var.c) {
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
