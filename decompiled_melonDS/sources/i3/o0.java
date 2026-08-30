package i3;

import a4.l2;
import y3.i1;
import y3.u0;
import y3.w0;
import y3.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 extends b3.o implements a4.a0, l2 {

    /* renamed from: i0  reason: collision with root package name */
    public float f6664i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f6665j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f6666k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f6667l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f6668m0;

    /* renamed from: n0  reason: collision with root package name */
    public long f6669n0;

    /* renamed from: o0  reason: collision with root package name */
    public n0 f6670o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public long f6671q0;

    /* renamed from: r0  reason: collision with root package name */
    public long f6672r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f6673s0;

    /* renamed from: t0  reason: collision with root package name */
    public a4.a f6674t0;

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    @Override // a4.a0
    public final w0 d(x0 x0Var, u0 u0Var, long j2) {
        i1 e6 = u0Var.e(j2);
        return x0Var.u0(e6.A, e6.B, zb.r.A, new a5.n(10, e6, this));
    }

    @Override // a4.l2
    public final boolean e() {
        return false;
    }

    @Override // a4.l2
    public final void f0(i4.x xVar) {
        if (!this.p0) {
            return;
        }
        i4.v.f(xVar, this.f6670o0);
    }

    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f6664i0 + ", scaleY=" + this.f6665j0 + ", alpha = " + this.f6666k0 + ", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=" + this.f6667l0 + ", cameraDistance=" + this.f6668m0 + ", transformOrigin=" + ((Object) q0.b(this.f6669n0)) + ", shape=" + this.f6670o0 + ", clip=" + this.p0 + ", renderEffect=null, ambientShadowColor=" + ((Object) s.i(this.f6671q0)) + ", spotShadowColor=" + ((Object) s.i(this.f6672r0)) + ", compositingStrategy=CompositingStrategy(value=0), blendMode=" + ((Object) z.D(this.f6673s0)) + ", colorFilter=null)";
    }
}
