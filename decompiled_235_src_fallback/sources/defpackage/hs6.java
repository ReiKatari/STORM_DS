package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs6  reason: default package */
/* loaded from: classes.dex */
public final class hs6 extends defpackage.vy7 {
    public final defpackage.g60 h0;
    public final defpackage.id3 i0;
    public final defpackage.by7 j0;
    public final defpackage.hs6[] k0;
    public final defpackage.jd1 l0;
    public final defpackage.td3 m0;
    public boolean n0;
    public java.lang.String o0;
    public java.lang.String p0;

    public hs6(defpackage.g60 r1, defpackage.id3 r2, defpackage.by7 r3, defpackage.hs6[] r4) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.h0 = r1
            r0.i0 = r2
            r0.j0 = r3
            r0.k0 = r4
            jd1 r1 = r2.b
            r0.l0 = r1
            td3 r1 = r2.a
            r0.m0 = r1
            int r1 = r3.ordinal()
            if (r4 == 0) goto L24
            r2 = r4[r1]
            if (r2 != 0) goto L22
            if (r2 == r0) goto L24
        L22:
            r4[r1] = r0
        L24:
            return
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void E(char r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.d0(r1)
            return
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void K(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = r1.g(r2)
            r0.d0(r1)
            return
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void T(int r2) {
            r1 = this;
            boolean r0 = r1.n0
            if (r0 == 0) goto Lc
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.d0(r2)
            return
        Lc:
            g60 r1 = r1.h0
            r1.i(r2)
            return
    }

    @Override // defpackage.vy7, defpackage.vx0
    public final void V(defpackage.wb6 r2, int r3, defpackage.gg3 r4, java.lang.Object r5) {
            r1 = this;
            r2.getClass()
            r4.getClass()
            if (r5 != 0) goto L10
            td3 r0 = r1.m0
            boolean r0 = r0.b
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            return
        L10:
            super.V(r2, r3, r4, r5)
            return
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void X(long r2) {
            r1 = this;
            boolean r0 = r1.n0
            if (r0 == 0) goto Lc
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.d0(r2)
            return
        Lc:
            g60 r1 = r1.h0
            r1.j(r2)
            return
    }

    @Override // defpackage.vy7
    public final void Z(defpackage.wb6 r8, int r9) {
            r7 = this;
            r8.getClass()
            int[] r0 = defpackage.gs6.a
            by7 r1 = r7.j0
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 44
            g60 r2 = r7.h0
            r3 = 1
            if (r0 == r3) goto L67
            r4 = 0
            r5 = 58
            r6 = 2
            if (r0 == r6) goto L49
            r6 = 3
            if (r0 == r6) goto L3a
            boolean r0 = r2.A
            if (r0 != 0) goto L24
            r2.h(r1)
        L24:
            r2.f()
            id3 r0 = r7.i0
            defpackage.te3.d(r0, r8)
            java.lang.String r8 = r8.g(r9)
            r7.d0(r8)
            r2.h(r5)
            r2.m()
            return
        L3a:
            if (r9 != 0) goto L3e
            r7.n0 = r3
        L3e:
            if (r9 != r3) goto L48
            r2.h(r1)
            r2.m()
            r7.n0 = r4
        L48:
            return
        L49:
            boolean r8 = r2.A
            if (r8 != 0) goto L61
            int r9 = r9 % r6
            if (r9 != 0) goto L57
            r2.h(r1)
            r2.f()
            goto L5e
        L57:
            r2.h(r5)
            r2.m()
            r3 = r4
        L5e:
            r7.n0 = r3
            return
        L61:
            r7.n0 = r3
            r2.f()
            return
        L67:
            boolean r7 = r2.A
            if (r7 != 0) goto L6e
            r2.h(r1)
        L6e:
            r2.f()
            return
    }

    @Override // defpackage.vy7, defpackage.vx0
    public final void a(defpackage.wb6 r2) {
            r1 = this;
            r2.getClass()
            by7 r2 = r1.j0
            char r0 = r2.end
            if (r0 == 0) goto L16
            g60 r1 = r1.h0
            r1.getClass()
            r0 = 0
            r1.A = r0
            char r2 = r2.end
            r1.h(r2)
        L16:
            return
    }

    @Override // defpackage.x32
    public final defpackage.jd1 b() {
            r0 = this;
            jd1 r0 = r0.l0
            return r0
    }

    @Override // defpackage.vy7, defpackage.x32
    public final defpackage.vx0 c(defpackage.wb6 r6) {
            r5 = this;
            r6.getClass()
            id3 r0 = r5.i0
            by7 r1 = defpackage.js7.c(r0, r6)
            char r2 = r1.begin
            g60 r3 = r5.h0
            if (r2 == 0) goto L15
            r3.h(r2)
            r2 = 1
            r3.A = r2
        L15:
            java.lang.String r2 = r5.o0
            if (r2 == 0) goto L34
            java.lang.String r4 = r5.p0
            if (r4 != 0) goto L21
            java.lang.String r4 = r6.a()
        L21:
            r3.f()
            r3.l(r2)
            r6 = 58
            r3.h(r6)
            r5.d0(r4)
            r6 = 0
            r5.o0 = r6
            r5.p0 = r6
        L34:
            by7 r6 = r5.j0
            if (r6 != r1) goto L39
            return r5
        L39:
            hs6[] r5 = r5.k0
            if (r5 == 0) goto L46
            int r6 = r1.ordinal()
            r6 = r5[r6]
            if (r6 == 0) goto L46
            return r6
        L46:
            hs6 r6 = new hs6
            r6.<init>(r3, r0, r1, r5)
            return r6
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void d0(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            g60 r0 = r0.h0
            r0.l(r1)
            return
    }

    @Override // defpackage.x32
    public final void f() {
            r1 = this;
            g60 r1 = r1.h0
            r1.getClass()
            java.lang.Object r1 = r1.B
            ja3 r1 = (defpackage.ja3) r1
            java.lang.String r0 = "null"
            r1.f(r0)
            return
    }

    @Override // defpackage.vx0
    public final boolean i(defpackage.wb6 r1) {
            r0 = this;
            r1.getClass()
            r0 = 0
            return r0
    }

    @Override // defpackage.x32
    public final void j(defpackage.gg3 r7, java.lang.Object r8) {
            r6 = this;
            r7.getClass()
            id3 r0 = r6.i0
            td3 r1 = r0.a
            boolean r2 = r7 instanceof defpackage.fz4
            zq0 r3 = r1.f
            r4 = 0
            if (r2 == 0) goto L13
            zq0 r5 = defpackage.zq0.NONE
            if (r3 == r5) goto L49
            goto L3c
        L13:
            int[] r5 = defpackage.ez4.a
            int r3 = r3.ordinal()
            r3 = r5[r3]
            r5 = 1
            if (r3 == r5) goto L49
            r5 = 2
            if (r3 == r5) goto L49
            r5 = 3
            if (r3 != r5) goto L45
            wb6 r3 = r7.e()
            np2 r3 = r3.e()
            bt6 r5 = defpackage.bt6.e
            boolean r5 = defpackage.nb3.k(r3, r5)
            if (r5 != 0) goto L3c
            bt6 r5 = defpackage.bt6.h
            boolean r3 = defpackage.nb3.k(r3, r5)
            if (r3 == 0) goto L49
        L3c:
            wb6 r3 = r7.e()
            java.lang.String r3 = defpackage.uj2.r(r0, r3)
            goto L4a
        L45:
            defpackage.i.d()
            return
        L49:
            r3 = r4
        L4a:
            if (r2 == 0) goto L60
            fz4 r7 = (defpackage.fz4) r7
            if (r8 != 0) goto L5c
            wb6 r6 = r7.e()
            java.lang.String r7 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r8 = "Value for serializer "
            defpackage.u34.A(r6, r7, r8)
            return
        L5c:
            defpackage.xk2.h(r7, r6, r8)
            throw r4
        L60:
            if (r3 == 0) goto Leb
            wb6 r2 = r7.e()
            r2.getClass()
            defpackage.te3.d(r0, r2)
            java.util.Set r0 = defpackage.q60.k(r2)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto Lb5
            wb6 r6 = r7.e()
            java.lang.String r6 = r6.a()
            wb6 r7 = r7.e()
            java.lang.String r7 = r7.a()
            zq0 r8 = r1.f
            zq0 r0 = defpackage.zq0.ALL_JSON_OBJECTS
            if (r8 != r0) goto L95
            boolean r8 = defpackage.nb3.k(r6, r7)
            if (r8 == 0) goto L95
            java.lang.String r6 = "in ALL_JSON_OBJECTS class discriminator mode"
            goto L9d
        L95:
            java.lang.String r8 = "as base class '"
            r0 = 39
            java.lang.String r6 = defpackage.i61.k(r0, r8, r6)
        L9d:
            java.lang.String r8 = "' cannot be serialized "
            java.lang.String r0 = " because it has property name that conflicts with JSON class discriminator '"
            java.lang.String r1 = "Class '"
            java.lang.StringBuilder r6 = defpackage.i61.u(r1, r7, r8, r6, r0)
            java.lang.String r7 = "'."
            java.lang.String r6 = defpackage.i61.n(r6, r3, r7)
            le3 r7 = new le3
            java.lang.String r8 = "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation."
            r7.<init>(r6, r8)
            throw r7
        Lb5:
            wb6 r0 = r7.e()
            np2 r0 = r0.e()
            r0.getClass()
            boolean r1 = r0 instanceof defpackage.bc6
            if (r1 != 0) goto Le5
            boolean r1 = r0 instanceof defpackage.v25
            if (r1 != 0) goto Ldf
            boolean r0 = r0 instanceof defpackage.dz4
            if (r0 != 0) goto Ld9
            wb6 r0 = r7.e()
            java.lang.String r0 = r0.a()
            r6.o0 = r3
            r6.p0 = r0
            goto Leb
        Ld9:
            java.lang.String r6 = "Actual serializer for polymorphic cannot be polymorphic itself"
            defpackage.i.m(r6)
            return
        Ldf:
            java.lang.String r6 = "Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead"
            defpackage.i.m(r6)
            return
        Le5:
            java.lang.String r6 = "Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead"
            defpackage.i.m(r6)
            return
        Leb:
            r7.d(r6, r8)
            return
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void l(double r5) {
            r4 = this;
            boolean r0 = r4.n0
            if (r0 == 0) goto Lc
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r4.d0(r0)
            goto L19
        Lc:
            g60 r4 = r4.h0
            java.lang.Object r4 = r4.B
            ja3 r4 = (defpackage.ja3) r4
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r4.f(r0)
        L19:
            double r0 = java.lang.Math.abs(r5)
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L27
            return
        L27:
            java.lang.Double r4 = java.lang.Double.valueOf(r5)
            le3 r5 = new le3
            r6 = 0
            java.lang.String r4 = defpackage.hi2.I(r4, r6)
            r0 = 2
            r5.<init>(r4, r0, r6)
            throw r5
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void m(short r2) {
            r1 = this;
            boolean r0 = r1.n0
            if (r0 == 0) goto Lc
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.d0(r2)
            return
        Lc:
            g60 r1 = r1.h0
            r1.k(r2)
            return
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void o(byte r2) {
            r1 = this;
            boolean r0 = r1.n0
            if (r0 == 0) goto Lc
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.d0(r2)
            return
        Lc:
            g60 r1 = r1.h0
            r1.g(r2)
            return
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void r(boolean r2) {
            r1 = this;
            boolean r0 = r1.n0
            if (r0 == 0) goto Lc
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.d0(r2)
            return
        Lc:
            g60 r1 = r1.h0
            java.lang.Object r1 = r1.B
            ja3 r1 = (defpackage.ja3) r1
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.f(r2)
            return
    }

    @Override // defpackage.vy7, defpackage.x32
    public final defpackage.x32 s(defpackage.wb6 r6) {
            r5 = this;
            r6.getClass()
            boolean r0 = defpackage.is6.a(r6)
            r1 = 0
            by7 r2 = r5.j0
            id3 r3 = r5.i0
            g60 r4 = r5.h0
            if (r0 == 0) goto L26
            boolean r6 = r4 instanceof defpackage.sx0
            if (r6 == 0) goto L15
            goto L20
        L15:
            java.lang.Object r6 = r4.B
            ja3 r6 = (defpackage.ja3) r6
            boolean r5 = r5.n0
            sx0 r4 = new sx0
            r4.<init>(r6, r5)
        L20:
            hs6 r5 = new hs6
            r5.<init>(r4, r3, r2, r1)
            return r5
        L26:
            boolean r0 = r6.h()
            if (r0 == 0) goto L4a
            l53 r0 = defpackage.fe3.a
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4a
            boolean r6 = r4 instanceof defpackage.rx0
            if (r6 == 0) goto L39
            goto L44
        L39:
            java.lang.Object r6 = r4.B
            ja3 r6 = (defpackage.ja3) r6
            boolean r5 = r5.n0
            rx0 r4 = new rx0
            r4.<init>(r6, r5)
        L44:
            hs6 r5 = new hs6
            r5.<init>(r4, r3, r2, r1)
            return r5
        L4a:
            java.lang.String r0 = r5.o0
            if (r0 == 0) goto L54
            java.lang.String r6 = r6.a()
            r5.p0 = r6
        L54:
            return r5
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void x(float r3) {
            r2 = this;
            boolean r0 = r2.n0
            if (r0 == 0) goto Lc
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.d0(r0)
            goto L19
        Lc:
            g60 r2 = r2.h0
            java.lang.Object r2 = r2.B
            ja3 r2 = (defpackage.ja3) r2
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.f(r0)
        L19:
            float r2 = java.lang.Math.abs(r3)
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L25
            return
        L25:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            le3 r3 = new le3
            r0 = 0
            java.lang.String r2 = defpackage.hi2.I(r2, r0)
            r1 = 2
            r3.<init>(r2, r1, r0)
            throw r3
    }
}
