package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ed4  reason: default package */
/* loaded from: classes.dex */
public final class ed4 extends tv4 {
    public boolean f0;

    @Override // defpackage.tv4, defpackage.b91
    public final yu0 c(h06 h06Var) {
        h06Var.getClass();
        ep2 c = h06Var.c();
        if (!b53.x(c, kh6.h) && !b53.x(c, kh6.k) && !(c instanceof zp4)) {
            ep2 c2 = h06Var.c();
            throw new IllegalArgumentException("Type " + c2 + " cannot be directly child of oneof element");
        }
        long h0 = h0();
        if (h0 == 19500 && b53.x(this.X, h06Var)) {
            return this;
        }
        if (!gk2.V(h0)) {
            return new tv4(this.L, hi2.d(this.R, h0), h06Var);
        }
        throw new IllegalArgumentException("An oneof element cannot be directly child of another oneof element");
    }

    @Override // defpackage.tv4, defpackage.yu0
    public final int v(h06 h06Var) {
        h06Var.getClass();
        if (this.f0) {
            return -1;
        }
        this.f0 = true;
        return 0;
    }
}
