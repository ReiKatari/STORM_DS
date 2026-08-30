package bi;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f2282a;

    /* renamed from: b  reason: collision with root package name */
    public final oe.d0 f2283b;

    public g(Bitmap bitmap, oe.d0 d0Var) {
        d0Var.getClass();
        this.f2282a = bitmap;
        this.f2283b = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (nc.k.a(this.f2282a, gVar.f2282a) && this.f2283b == gVar.f2283b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Bitmap bitmap = this.f2282a;
        if (bitmap == null) {
            hashCode = 0;
        } else {
            hashCode = bitmap.hashCode();
        }
        return this.f2283b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "RomIcon(bitmap=" + this.f2282a + ", filtering=" + this.f2283b + ")";
    }
}
