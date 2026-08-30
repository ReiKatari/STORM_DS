package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tm5  reason: default package */
/* loaded from: classes.dex */
public final class tm5 {
    public final Bitmap a;
    public final um5 b;

    public tm5(Bitmap bitmap, um5 um5Var) {
        um5Var.getClass();
        this.a = bitmap;
        this.b = um5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm5)) {
            return false;
        }
        tm5 tm5Var = (tm5) obj;
        if (b53.x(this.a, tm5Var.a) && this.b == tm5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            hashCode = 0;
        } else {
            hashCode = bitmap.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "RomIcon(bitmap=" + this.a + ", filtering=" + this.b + ")";
    }
}
