package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dd  reason: default package */
/* loaded from: classes.dex */
public final class dd {
    public final defpackage.qn2 a;
    public final defpackage.on2 b;
    public final defpackage.to c;
    public final defpackage.qn2 d;
    public final defpackage.ya3 e;
    public final defpackage.u63 f;
    public final defpackage.vs4 g;
    public final defpackage.ii1 h;
    public final defpackage.ii1 i;
    public final defpackage.rs4 j;
    public final defpackage.rs4 k;
    public final defpackage.vs4 l;
    public final defpackage.vs4 m;
    public final defpackage.bd n;

    public dd(java.lang.Object r1, defpackage.qn2 r2, defpackage.on2 r3, defpackage.to r4, defpackage.qn2 r5) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.c = r4
            r0.d = r5
            ya3 r2 = new ya3
            r2.<init>()
            r0.e = r2
            u63 r2 = new u63
            r2.<init>(r0)
            r0.f = r2
            vs4 r1 = defpackage.np2.Y(r1)
            r0.g = r1
            wc r1 = new wc
            r2 = 0
            r1.<init>(r0, r2)
            ii1 r1 = defpackage.np2.I(r1)
            r0.h = r1
            wc r1 = new wc
            r2 = 1
            r1.<init>(r0, r2)
            ii1 r1 = defpackage.np2.I(r1)
            r0.i = r1
            rs4 r1 = new rs4
            r2 = 2143289344(0x7fc00000, float:NaN)
            r1.<init>(r2)
            r0.j = r1
            xd5 r1 = defpackage.xd5.s0
            wc r2 = new wc
            r3 = 2
            r2.<init>(r0, r3)
            defpackage.np2.J(r2, r1)
            rs4 r1 = new rs4
            r2 = 0
            r1.<init>(r2)
            r0.k = r1
            r1 = 0
            vs4 r1 = defpackage.np2.Y(r1)
            r0.l = r1
            s04 r1 = new s04
            zt1 r2 = defpackage.zt1.A
            r1.<init>(r2)
            vs4 r1 = defpackage.np2.Y(r1)
            r0.m = r1
            bd r1 = new bd
            r1.<init>(r0)
            r0.n = r1
            return
    }

    public final java.lang.Object a(defpackage.xa4 r15, defpackage.c12 r16, defpackage.s41 r17) {
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.xc
            if (r1 == 0) goto L15
            r1 = r0
            xc r1 = (defpackage.xc) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            xc r1 = new xc
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            qn2 r4 = r14.d
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1
            rs4 r7 = r14.j
            if (r3 == 0) goto L39
            if (r3 != r6) goto L32
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L2f
            goto L5a
        L2f:
            r0 = move-exception
            r15 = r0
            goto L8f
        L32:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r14)
            r14 = 0
            return r14
        L39:
            defpackage.oi2.Y(r0)
            ya3 r10 = r14.e     // Catch: java.lang.Throwable -> L2f
            yc r11 = new yc     // Catch: java.lang.Throwable -> L2f
            r0 = 0
            r12 = 0
            r3 = r16
            r11.<init>(r14, r3, r12, r0)     // Catch: java.lang.Throwable -> L2f
            r1.Y = r6     // Catch: java.lang.Throwable -> L2f
            r10.getClass()     // Catch: java.lang.Throwable -> L2f
            ja1 r8 = new ja1     // Catch: java.lang.Throwable -> L2f
            r13 = 6
            r9 = r15
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r15 = defpackage.g04.C(r8, r1)     // Catch: java.lang.Throwable -> L2f
            if (r15 != r2) goto L5a
            return r2
        L5a:
            s04 r15 = r14.d()
            float r0 = r7.h()
            java.lang.Object r15 = r15.a(r0)
            if (r15 == 0) goto L8c
            float r0 = r7.h()
            s04 r1 = r14.d()
            float r1 = r1.c(r15)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L8c
            java.lang.Object r0 = r4.g(r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8c
            r14.f(r15)
        L8c:
            jg7 r14 = defpackage.jg7.a
            return r14
        L8f:
            s04 r0 = r14.d()
            float r1 = r7.h()
            java.lang.Object r0 = r0.a(r1)
            if (r0 == 0) goto Lc1
            float r1 = r7.h()
            s04 r2 = r14.d()
            float r2 = r2.c(r0)
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto Lc1
            java.lang.Object r1 = r4.g(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lc1
            r14.f(r0)
        Lc1:
            throw r15
    }

    public final java.lang.Object b(java.lang.Object r19, defpackage.xa4 r20, defpackage.sc r21, defpackage.s41 r22) {
            r18 = this;
            r1 = r18
            r0 = r22
            boolean r2 = r0 instanceof defpackage.zc
            if (r2 == 0) goto L18
            r2 = r0
            zc r2 = (defpackage.zc) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.Y = r3
        L16:
            r6 = r2
            goto L1e
        L18:
            zc r2 = new zc
            r2.<init>(r1, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r6.R
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r6.Y
            vs4 r8 = r1.l
            qn2 r9 = r1.d
            r10 = 1056964608(0x3f000000, float:0.5)
            r11 = 1
            r16 = 0
            rs4 r12 = r1.j
            if (r2 == 0) goto L47
            if (r2 != r11) goto L40
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L3a
            r2 = r12
            r4 = r16
            goto L7d
        L3a:
            r0 = move-exception
            r2 = r12
        L3c:
            r4 = r16
            goto Lb9
        L40:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L47:
            defpackage.oi2.Y(r0)
            s04 r0 = r1.d()
            java.util.Map r0 = r0.a
            r2 = r19
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto Lef
            ya3 r14 = r1.e     // Catch: java.lang.Throwable -> L3a
            ad r15 = new ad     // Catch: java.lang.Throwable -> L3a
            r5 = 0
            r3 = r21
            r0 = r15
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb7
            r6.Y = r11     // Catch: java.lang.Throwable -> L3a
            r14.getClass()     // Catch: java.lang.Throwable -> L3a
            r2 = r12
            ja1 r12 = new ja1     // Catch: java.lang.Throwable -> Lb5
            r17 = 6
            r13 = r20
            r12.<init>(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lb5
            r4 = r16
            java.lang.Object r0 = defpackage.g04.C(r12, r6)     // Catch: java.lang.Throwable -> Lb3
            if (r0 != r7) goto L7d
            return r7
        L7d:
            r8.setValue(r4)
            s04 r0 = r1.d()
            float r3 = r2.h()
            java.lang.Object r0 = r0.a(r3)
            if (r0 == 0) goto Lf2
            float r2 = r2.h()
            s04 r3 = r1.d()
            float r3 = r3.c(r0)
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 > 0) goto Lf2
            java.lang.Object r2 = r9.g(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lf2
            r1.f(r0)
            goto Lf2
        Lb3:
            r0 = move-exception
            goto Lb9
        Lb5:
            r0 = move-exception
            goto L3c
        Lb7:
            r0 = move-exception
            r2 = r12
        Lb9:
            r8.setValue(r4)
            s04 r3 = r1.d()
            float r4 = r2.h()
            java.lang.Object r3 = r3.a(r4)
            if (r3 == 0) goto Lee
            float r2 = r2.h()
            s04 r4 = r1.d()
            float r4 = r4.c(r3)
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 > 0) goto Lee
            java.lang.Object r2 = r9.g(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lee
            r1.f(r3)
        Lee:
            throw r0
        Lef:
            r18.f(r19)
        Lf2:
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    public final java.lang.Object c(float r6, float r7, java.lang.Object r8) {
            r5 = this;
            s04 r0 = r5.d()
            float r1 = r0.c(r8)
            on2 r2 = r5.b
            java.lang.Object r2 = r2.c()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L1a
            goto La8
        L1a:
            boolean r4 = java.lang.Float.isNaN(r1)
            if (r4 == 0) goto L22
            goto La8
        L22:
            qn2 r5 = r5.a
            if (r3 >= 0) goto L60
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r2 = 1
            if (r7 < 0) goto L33
            java.lang.Object r5 = r0.b(r6, r2)
            r5.getClass()
            return r5
        L33:
            java.lang.Object r7 = r0.b(r6, r2)
            r7.getClass()
            float r0 = r0.c(r7)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r5 = r5.g(r0)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r5 = java.lang.Math.abs(r5)
            float r5 = r5 + r1
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 >= 0) goto L5f
            goto La8
        L5f:
            return r7
        L60:
            float r2 = -r2
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r2 = 0
            if (r7 > 0) goto L6e
            java.lang.Object r5 = r0.b(r6, r2)
            r5.getClass()
            return r5
        L6e:
            java.lang.Object r7 = r0.b(r6, r2)
            r7.getClass()
            float r0 = r0.c(r7)
            float r0 = r1 - r0
            float r0 = java.lang.Math.abs(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r5 = r5.g(r0)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r5 = java.lang.Math.abs(r5)
            float r1 = r1 - r5
            float r5 = java.lang.Math.abs(r1)
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto La4
            float r6 = java.lang.Math.abs(r6)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 >= 0) goto La9
            goto La8
        La4:
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto La9
        La8:
            return r8
        La9:
            return r7
    }

    public final defpackage.s04 d() {
            r0 = this;
            vs4 r0 = r0.m
            java.lang.Object r0 = r0.getValue()
            s04 r0 = (defpackage.s04) r0
            return r0
    }

    public final float e() {
            r1 = this;
            rs4 r1 = r1.j
            float r0 = r1.h()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L11
            float r1 = r1.h()
            return r1
        L11:
            java.lang.String r1 = "The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    public final void f(java.lang.Object r1) {
            r0 = this;
            vs4 r0 = r0.g
            r0.setValue(r1)
            return
    }
}
