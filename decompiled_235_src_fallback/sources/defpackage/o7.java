package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o7  reason: default package */
/* loaded from: classes.dex */
public final class o7 implements defpackage.go2 {
    public final /* synthetic */ java.util.List A;
    public final /* synthetic */ long B;
    public final /* synthetic */ defpackage.qn2 L;

    public o7(java.util.List r1, long r2, defpackage.qn2 r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r4
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
            r10 = this;
            lp3 r11 = (defpackage.lp3) r11
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            px0 r13 = (defpackage.px0) r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r0 = r14 & 6
            r1 = 2
            if (r0 != 0) goto L23
            r0 = r13
            xq2 r0 = (defpackage.xq2) r0
            boolean r11 = r0.f(r11)
            if (r11 == 0) goto L20
            r11 = 4
            goto L21
        L20:
            r11 = r1
        L21:
            r11 = r11 | r14
            goto L24
        L23:
            r11 = r14
        L24:
            r14 = r14 & 48
            if (r14 != 0) goto L37
            r14 = r13
            xq2 r14 = (defpackage.xq2) r14
            boolean r14 = r14.d(r12)
            if (r14 == 0) goto L34
            r14 = 32
            goto L36
        L34:
            r14 = 16
        L36:
            r11 = r11 | r14
        L37:
            r14 = r11 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            r2 = 0
            r3 = 1
            if (r14 == r0) goto L41
            r14 = r3
            goto L42
        L41:
            r14 = r2
        L42:
            r11 = r11 & r3
            r8 = r13
            xq2 r8 = (defpackage.xq2) r8
            boolean r11 = r8.S(r11, r14)
            if (r11 == 0) goto L8f
            java.util.List r11 = r10.A
            java.lang.Object r11 = r11.get(r12)
            r5 = r11
            c6 r5 = (defpackage.c6) r5
            r11 = -1392517167(0xffffffffacffdfd1, float:-7.2723845E-12)
            r8.b0(r11)
            long r11 = r5.a
            long r13 = r10.B
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L65
            r6 = r3
            goto L66
        L65:
            r6 = r2
        L66:
            qn2 r10 = r10.L
            boolean r11 = r8.f(r10)
            boolean r12 = r8.h(r5)
            r11 = r11 | r12
            java.lang.Object r12 = r8.P()
            if (r11 != 0) goto L7b
            vs0 r11 = defpackage.ox0.a
            if (r12 != r11) goto L83
        L7b:
            i5 r12 = new i5
            r12.<init>(r1, r10, r5)
            r8.l0(r12)
        L83:
            r7 = r12
            on2 r7 = (defpackage.on2) r7
            r9 = 0
            r4 = 0
            defpackage.ge7.h(r4, r5, r6, r7, r8, r9)
            r8.p(r2)
            goto L92
        L8f:
            r8.V()
        L92:
            jg7 r10 = defpackage.jg7.a
            return r10
    }
}
