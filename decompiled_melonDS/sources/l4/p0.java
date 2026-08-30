package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final j0 f8871a;

    /* renamed from: b  reason: collision with root package name */
    public final j0 f8872b;

    /* renamed from: c  reason: collision with root package name */
    public final j0 f8873c;

    /* renamed from: d  reason: collision with root package name */
    public final j0 f8874d;

    public p0(j0 j0Var, j0 j0Var2, j0 j0Var3, j0 j0Var4) {
        this.f8871a = j0Var;
        this.f8872b = j0Var2;
        this.f8873c = j0Var3;
        this.f8874d = j0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (nc.k.a(this.f8871a, p0Var.f8871a) && nc.k.a(this.f8872b, p0Var.f8872b) && nc.k.a(this.f8873c, p0Var.f8873c) && nc.k.a(this.f8874d, p0Var.f8874d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i10;
        int i11;
        int i12 = 0;
        j0 j0Var = this.f8871a;
        if (j0Var != null) {
            i2 = j0Var.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = i2 * 31;
        j0 j0Var2 = this.f8872b;
        if (j0Var2 != null) {
            i10 = j0Var2.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        j0 j0Var3 = this.f8873c;
        if (j0Var3 != null) {
            i11 = j0Var3.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        j0 j0Var4 = this.f8874d;
        if (j0Var4 != null) {
            i12 = j0Var4.hashCode();
        }
        return i15 + i12;
    }
}
