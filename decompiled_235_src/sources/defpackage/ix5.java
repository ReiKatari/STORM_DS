package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ix5  reason: default package */
/* loaded from: classes.dex */
public final class ix5 {
    public final Bitmap a;
    public final jx5 b;

    public ix5(Bitmap bitmap, jx5 jx5Var) {
        jx5Var.getClass();
        this.a = bitmap;
        this.b = jx5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix5)) {
            return false;
        }
        ix5 ix5Var = (ix5) obj;
        if (nb3.k(this.a, ix5Var.a) && this.b == ix5Var.b) {
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
