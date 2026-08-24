package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ei6  reason: default package */
/* loaded from: classes.dex */
public final class ei6 extends defpackage.z64 implements defpackage.jm3, defpackage.va6 {
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public long q0;
    public defpackage.ke6 r0;
    public boolean s0;
    public long t0;
    public long u0;
    public int v0;
    public defpackage.mc w0;

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r2) {
            r1 = this;
            boolean r0 = r1.s0
            if (r0 != 0) goto L5
            return
        L5:
            ke6 r1 = r1.r0
            defpackage.eb6.e(r2, r1)
            return
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r3, defpackage.x24 r4, long r5) {
            r2 = this;
            dx4 r4 = r4.y(r5)
            int r5 = r4.A
            int r6 = r4.B
            qj r0 = new qj
            r1 = 7
            r0.<init>(r1, r4, r2)
            zt1 r2 = defpackage.zt1.A
            f34 r2 = r3.K(r5, r6, r2, r0)
            return r2
    }

    @Override // defpackage.va6
    public final boolean j() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SimpleGraphicsLayerModifier(scaleX="
            r0.<init>(r1)
            float r1 = r3.k0
            r0.append(r1)
            java.lang.String r1 = ", scaleY="
            r0.append(r1)
            float r1 = r3.l0
            r0.append(r1)
            java.lang.String r1 = ", alpha = "
            r0.append(r1)
            float r1 = r3.m0
            r0.append(r1)
            java.lang.String r1 = ", translationX="
            r0.append(r1)
            float r1 = r3.n0
            r0.append(r1)
            java.lang.String r1 = ", translationY="
            r0.append(r1)
            float r1 = r3.o0
            r0.append(r1)
            java.lang.String r1 = ", shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance="
            r0.append(r1)
            float r1 = r3.p0
            r0.append(r1)
            java.lang.String r1 = ", transformOrigin="
            r0.append(r1)
            long r1 = r3.q0
            java.lang.String r1 = defpackage.i97.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", shape="
            r0.append(r1)
            ke6 r1 = r3.r0
            r0.append(r1)
            java.lang.String r1 = ", clip="
            r0.append(r1)
            boolean r1 = r3.s0
            r0.append(r1)
            java.lang.String r1 = ", renderEffect=null, ambientShadowColor="
            r0.append(r1)
            long r1 = r3.t0
            java.lang.String r1 = defpackage.kt0.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", spotShadowColor="
            r0.append(r1)
            long r1 = r3.u0
            java.lang.String r1 = defpackage.kt0.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", compositingStrategy=CompositingStrategy(value=0), blendMode="
            r0.append(r1)
            int r3 = r3.v0
            java.lang.String r3 = defpackage.u24.J(r3)
            r0.append(r3)
            java.lang.String r3 = ", colorFilter=null)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
