package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ei6  reason: default package */
/* loaded from: classes.dex */
public final class ei6 extends z64 implements jm3, va6 {
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public long q0;
    public ke6 r0;
    public boolean s0;
    public long t0;
    public long u0;
    public int v0;
    public mc w0;

    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
        if (!this.s0) {
            return;
        }
        eb6.e(gb6Var, this.r0);
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        dx4 y = x24Var.y(j);
        return g34Var.K(y.A, y.B, zt1.A, new qj(7, y, this));
    }

    @Override // defpackage.va6
    public final boolean j() {
        return false;
    }

    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.k0 + ", scaleY=" + this.l0 + ", alpha = " + this.m0 + ", translationX=" + this.n0 + ", translationY=" + this.o0 + ", shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=" + this.p0 + ", transformOrigin=" + ((Object) i97.b(this.q0)) + ", shape=" + this.r0 + ", clip=" + this.s0 + ", renderEffect=null, ambientShadowColor=" + ((Object) kt0.j(this.t0)) + ", spotShadowColor=" + ((Object) kt0.j(this.u0)) + ", compositingStrategy=CompositingStrategy(value=0), blendMode=" + ((Object) u24.J(this.v0)) + ", colorFilter=null)";
    }
}
