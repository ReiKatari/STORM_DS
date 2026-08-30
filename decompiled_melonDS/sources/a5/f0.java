package a5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f390a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f391b;

    /* renamed from: c  reason: collision with root package name */
    public final s0 f392c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f393d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f394e;

    /* renamed from: f  reason: collision with root package name */
    public final String f395f;

    public f0(int i2) {
        boolean z10;
        boolean z11;
        if ((i2 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i2 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = (i2 & 4) != 0;
        s0 s0Var = s0.Inherit;
        this.f390a = z10;
        this.f391b = z11;
        this.f392c = s0Var;
        this.f393d = z12;
        this.f394e = true;
        this.f395f = "";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (this.f390a != f0Var.f390a || this.f391b != f0Var.f391b || this.f392c != f0Var.f392c || this.f393d != f0Var.f393d || this.f394e != f0Var.f394e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f394e) + w.d.e((this.f392c.hashCode() + w.d.e(Boolean.hashCode(this.f390a) * 31, this.f391b, 31)) * 31, this.f393d, 31);
    }
}
