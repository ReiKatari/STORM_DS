package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq6  reason: default package */
/* loaded from: classes.dex */
public final class yq6 extends t74 {
    public zq6 a;
    public jo6 b;
    public xq6 c;

    @Override // defpackage.t74
    public final float a() {
        return this.c.b();
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        zq6 zq6Var = this.a;
        this.c = zq6Var;
        zq6Var.l = f;
        if (f > f2) {
            z = true;
        } else {
            z = false;
        }
        zq6Var.k = z;
        if (z) {
            zq6Var.d(-f3, f - f2, f5, f6, f4);
        } else {
            zq6Var.d(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}
