package a7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f559a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f560b;

    /* renamed from: c  reason: collision with root package name */
    public final int f561c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f562d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f563e;

    /* renamed from: f  reason: collision with root package name */
    public final int f564f;

    /* renamed from: g  reason: collision with root package name */
    public final int f565g;

    public f0(boolean z10, boolean z11, int i2, boolean z12, boolean z13, int i10, int i11) {
        this.f559a = z10;
        this.f560b = z11;
        this.f561c = i2;
        this.f562d = z12;
        this.f563e = z13;
        this.f564f = i10;
        this.f565g = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof f0)) {
            f0 f0Var = (f0) obj;
            if (this.f559a == f0Var.f559a && this.f560b == f0Var.f560b && this.f561c == f0Var.f561c && this.f562d == f0Var.f562d && this.f563e == f0Var.f563e && this.f564f == f0Var.f564f && this.f565g == f0Var.f565g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f559a ? 1 : 0) * 31) + (this.f560b ? 1 : 0)) * 31) + this.f561c) * 923521) + (this.f562d ? 1 : 0)) * 31) + (this.f563e ? 1 : 0)) * 31) + this.f564f) * 31) + this.f565g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f0.class.getSimpleName());
        sb2.append("(");
        if (this.f559a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f560b) {
            sb2.append("restoreState ");
        }
        int i2 = this.f565g;
        int i10 = this.f564f;
        if (i10 != -1 || i2 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i2));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(-1));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(-1));
            sb2.append(")");
        }
        return sb2.toString();
    }
}
