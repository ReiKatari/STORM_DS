package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kn7  reason: default package */
/* loaded from: classes.dex */
public final class kn7 extends qu2 {
    public static final in7 c = in7.OFF;
    public final in7 a;
    public final da2 b;

    public kn7(in7 in7Var) {
        in7Var.getClass();
        this.a = in7Var;
        this.b = da2.VIDEO_STABILIZATION;
    }

    @Override // defpackage.qu2
    public final da2 a() {
        return this.b;
    }

    @Override // defpackage.qu2
    public final boolean b(cg0 cg0Var, qi1 qi1Var) {
        int i = jn7.a[this.a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return true;
                }
                i.d();
                return false;
            }
            return cg0Var.z();
        }
        return cg0Var.c();
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.a.name() + ')';
    }
}
