package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mg5  reason: default package */
/* loaded from: classes.dex */
public final class mg5 implements jy2 {
    public final boolean a;
    public final float b;
    public final long c;

    public mg5(float f, long j, boolean z) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.jy2
    public final vc1 a(l14 l14Var) {
        return new cd1(l14Var, this.a, this.b, new bd1(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mg5) {
            mg5 mg5Var = (mg5) obj;
            if (this.a != mg5Var.a || !ji1.b(this.b, mg5Var.b)) {
                return false;
            }
            return xq0.c(this.c, mg5Var.c);
        }
        return false;
    }

    @Override // defpackage.jy2
    public final int hashCode() {
        int a = ej6.a(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = xq0.i;
        return Long.hashCode(this.c) + a;
    }
}
