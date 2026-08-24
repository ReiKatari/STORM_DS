package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ln1  reason: default package */
/* loaded from: classes.dex */
public final class ln1 extends defpackage.dm5 implements defpackage.eo2 {
    public defpackage.oy4 L;
    public int R;
    public int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ defpackage.zg5 Z;
    public final /* synthetic */ defpackage.dh5 d0;
    public final /* synthetic */ defpackage.dh5 e0;

    public ln1(defpackage.zg5 r1, defpackage.dh5 r2, defpackage.dh5 r3, defpackage.r41 r4) {
            r0 = this;
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            mw6 r1 = (defpackage.mw6) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            ln1 r0 = (defpackage.ln1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            ln1 r0 = new ln1
            dh5 r1 = r3.d0
            dh5 r2 = r3.e0
            zg5 r3 = r3.Z
            r0.<init>(r3, r1, r2, r4)
            r0.Y = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 0
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L31
            if (r2 == r6) goto L25
            if (r2 != r4) goto L1f
            int r2 = r0.R
            oy4 r7 = r0.L
            java.lang.Object r8 = r0.Y
            mw6 r8 = (defpackage.mw6) r8
            defpackage.oi2.Y(r17)
            r5 = r6
            r6 = r17
            goto Lb2
        L1f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r3
        L25:
            int r2 = r0.R
            java.lang.Object r7 = r0.Y
            mw6 r7 = (defpackage.mw6) r7
            defpackage.oi2.Y(r17)
            r8 = r17
            goto L4d
        L31:
            defpackage.oi2.Y(r17)
            java.lang.Object r2 = r0.Y
            mw6 r2 = (defpackage.mw6) r2
            r7 = r2
            r2 = 0
        L3a:
            if (r2 != 0) goto L131
            py4 r8 = defpackage.py4.Main
            r0.Y = r7
            r0.L = r3
            r0.R = r2
            r0.X = r6
            java.lang.Object r8 = r7.c(r8, r0)
            if (r8 != r1) goto L4d
            goto Lae
        L4d:
            oy4 r8 = (defpackage.oy4) r8
            java.util.List r9 = r8.a
            int r10 = r9.size()
            r11 = 0
        L56:
            if (r11 >= r10) goto L68
            java.lang.Object r12 = r9.get(r11)
            vy4 r12 = (defpackage.vy4) r12
            boolean r12 = defpackage.ej2.p(r12)
            if (r12 != 0) goto L65
            goto L69
        L65:
            int r11 = r11 + 1
            goto L56
        L68:
            r2 = r6
        L69:
            java.util.List r9 = r8.a
            int r10 = r9.size()
            r11 = 0
        L70:
            if (r11 >= r10) goto L92
            java.lang.Object r12 = r9.get(r11)
            vy4 r12 = (defpackage.vy4) r12
            boolean r13 = r12.c()
            if (r13 != 0) goto L91
            ow6 r13 = r7.Y
            long r13 = r13.u0
            long r5 = r7.d()
            boolean r5 = defpackage.ej2.K(r12, r13, r5)
            if (r5 == 0) goto L8d
            goto L91
        L8d:
            int r11 = r11 + 1
            r6 = 1
            goto L70
        L91:
            r2 = 1
        L92:
            int r5 = r8.c
            if (r5 != r4) goto L9d
            zg5 r2 = r0.Z
            r5 = 1
            r2.A = r5
            r2 = r5
            goto L9e
        L9d:
            r5 = 1
        L9e:
            py4 r6 = defpackage.py4.Final
            r0.Y = r7
            r0.L = r8
            r0.R = r2
            r0.X = r4
            java.lang.Object r6 = r7.c(r6, r0)
            if (r6 != r1) goto Laf
        Lae:
            return r1
        Laf:
            r15 = r8
            r8 = r7
            r7 = r15
        Lb2:
            oy4 r6 = (defpackage.oy4) r6
            java.util.List r6 = r6.a
            int r9 = r6.size()
            r10 = 0
        Lbb:
            if (r10 >= r9) goto Lce
            java.lang.Object r11 = r6.get(r10)
            vy4 r11 = (defpackage.vy4) r11
            boolean r11 = r11.c()
            if (r11 == 0) goto Lcb
            r2 = r5
            goto Lce
        Lcb:
            int r10 = r10 + 1
            goto Lbb
        Lce:
            dh5 r6 = r0.d0
            java.lang.Object r9 = r6.A
            vy4 r9 = (defpackage.vy4) r9
            long r9 = r9.a
            boolean r9 = defpackage.sn1.f(r7, r9)
            java.util.List r7 = r7.a
            dh5 r10 = r0.e0
            if (r9 == 0) goto L105
            int r9 = r7.size()
            r11 = 0
        Le5:
            if (r11 >= r9) goto Lf6
            java.lang.Object r12 = r7.get(r11)
            r13 = r12
            vy4 r13 = (defpackage.vy4) r13
            boolean r13 = r13.d
            if (r13 == 0) goto Lf3
            goto Lf7
        Lf3:
            int r11 = r11 + 1
            goto Le5
        Lf6:
            r12 = r3
        Lf7:
            vy4 r12 = (defpackage.vy4) r12
            if (r12 == 0) goto L100
            r6.A = r12
            r10.A = r12
            goto L12b
        L100:
            r2 = r5
            r6 = r2
            r7 = r8
            goto L3a
        L105:
            int r9 = r7.size()
            r11 = 0
        L10a:
            if (r11 >= r9) goto L128
            java.lang.Object r12 = r7.get(r11)
            r13 = r12
            vy4 r13 = (defpackage.vy4) r13
            long r13 = r13.a
            java.lang.Object r3 = r6.A
            vy4 r3 = (defpackage.vy4) r3
            long r4 = r3.a
            boolean r3 = defpackage.nj2.o(r13, r4)
            if (r3 == 0) goto L122
            goto L129
        L122:
            int r11 = r11 + 1
            r3 = 0
            r4 = 2
            r5 = 1
            goto L10a
        L128:
            r12 = 0
        L129:
            r10.A = r12
        L12b:
            r7 = r8
            r3 = 0
            r4 = 2
            r6 = 1
            goto L3a
        L131:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
