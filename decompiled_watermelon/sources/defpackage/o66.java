package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o66  reason: default package */
/* loaded from: classes.dex */
public final class o66 extends yy3 implements mf3, gz5 {
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public long n0;
    public y26 o0;
    public boolean p0;
    public long q0;
    public long r0;
    public int s0;
    public yb t0;

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        yn4 c = mv3Var.c(j);
        return vv3Var.s0(c.A, c.B, qp1.A, new ej(7, c, this));
    }

    @Override // defpackage.gz5
    public final boolean l() {
        return false;
    }

    @Override // defpackage.gz5
    public final void p0(rz5 rz5Var) {
        if (!this.p0) {
            return;
        }
        pz5.e(rz5Var, this.o0);
    }

    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.j0 + ", scaleY=" + this.k0 + ", alpha = " + this.l0 + ", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=" + this.m0 + ", transformOrigin=" + ((Object) sw6.b(this.n0)) + ", shape=" + this.o0 + ", clip=" + this.p0 + ", renderEffect=null, ambientShadowColor=" + ((Object) xq0.i(this.q0)) + ", spotShadowColor=" + ((Object) xq0.i(this.r0)) + ", compositingStrategy=CompositingStrategy(value=0), blendMode=" + ((Object) iq2.D(this.s0)) + ", colorFilter=null)";
    }
}
