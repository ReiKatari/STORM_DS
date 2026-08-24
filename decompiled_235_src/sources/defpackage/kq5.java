package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kq5  reason: default package */
/* loaded from: classes.dex */
public final class kq5 implements n43 {
    public final boolean a;
    public final float b;
    public final long c;

    public kq5(float f, long j, boolean z) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.n43
    public final xg1 a(r94 r94Var) {
        return new eh1(r94Var, this.a, this.b, new dh1(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kq5) {
            kq5 kq5Var = (kq5) obj;
            if (this.a != kq5Var.a || !om1.b(this.b, kq5Var.b)) {
                return false;
            }
            return kt0.d(this.c, kq5Var.c);
        }
        return false;
    }

    @Override // defpackage.n43
    public final int hashCode() {
        int a = xg6.a(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = kt0.i;
        return Long.hashCode(this.c) + a;
    }
}
