package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qr7  reason: default package */
/* loaded from: classes.dex */
public final class qr7 extends defpackage.ym {
    public final defpackage.kd6 b;
    public final defpackage.jm4 c;
    public final defpackage.u63 d;
    public final defpackage.tp6 e;
    public final defpackage.de5 f;

    public qr7(android.app.Application r13, defpackage.kd6 r14, defpackage.jm4 r15) {
            r12 = this;
            r14.getClass()
            r15.getClass()
            r12.<init>()
            r12.b = r14
            r12.c = r15
            u63 r15 = new u63
            r15.<init>(r13, r14)
            r12.d = r15
            pr7 r0 = new pr7
            na r3 = defpackage.na.NON_ADRENO
            sr7 r4 = defpackage.sr7.SYSTEM
            zt1 r9 = defpackage.zt1.A
            r1 = 0
            java.lang.String r2 = ""
            r5 = 0
            yt1 r6 = defpackage.yt1.A
            r8 = 0
            r10 = 0
            r11 = 0
            r7 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            tp6 r13 = defpackage.up6.a(r0)
            r12.e = r13
            de5 r14 = new de5
            r14.<init>(r13)
            r12.f = r14
            r12.f()
            return
    }

    public final void e(defpackage.hm4 r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r1.getClass()
            tp6 r2 = r0.e
            java.lang.Object r3 = r2.getValue()
            pr7 r3 = (defpackage.pr7) r3
            java.lang.String r3 = r3.j
            if (r3 == 0) goto L14
            return
        L14:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            pr7 r4 = (defpackage.pr7) r4
            java.lang.String r14 = r1.a
            java.lang.String r5 = r1.b
            java.lang.String r6 = "Скачивание "
            java.lang.String r7 = "..."
            java.lang.String r15 = defpackage.lb1.A(r6, r5, r7)
            r16 = 511(0x1ff, float:7.16E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            pr7 r4 = defpackage.pr7.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r3 = r2.j(r3, r4)
            if (r3 == 0) goto L14
            as0 r2 = defpackage.to7.a(r0)
            bf4 r3 = new bf4
            r4 = 27
            r5 = 0
            r3.<init>(r0, r1, r5, r4)
            r0 = 3
            defpackage.hv.L(r2, r5, r5, r3, r0)
            return
    }

    public final void f() {
            r15 = this;
            u63 r0 = r15.d
            java.lang.Object r0 = r0.B
            android.content.Context r0 = (android.content.Context) r0
            boolean r2 = defpackage.q60.N(r0)
            na r4 = defpackage.q60.H()
            java.lang.String r0 = defpackage.q60.V()
            boolean r1 = defpackage.qs6.v0(r0)
            if (r1 != 0) goto L22
            java.lang.CharSequence r0 = defpackage.qs6.T0(r0)
            java.lang.String r0 = r0.toString()
        L20:
            r3 = r0
            goto L65
        L22:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L3a
            java.lang.String r0 = defpackage.ma.q()
            if (r0 == 0) goto L34
            boolean r1 = defpackage.qs6.v0(r0)
            if (r1 == 0) goto L35
        L34:
            r0 = 0
        L35:
            if (r0 != 0) goto L3c
            java.lang.String r0 = android.os.Build.HARDWARE
            goto L3c
        L3a:
            java.lang.String r0 = android.os.Build.HARDWARE
        L3c:
            java.lang.String r1 = android.os.Build.HARDWARE
            r1.getClass()
            java.lang.String r3 = "qcom"
            r5 = 1
            boolean r1 = defpackage.qs6.j0(r1, r3, r5)
            java.lang.String r3 = ")"
            if (r1 != 0) goto L5e
            boolean r1 = defpackage.q60.M()
            if (r1 == 0) goto L53
            goto L5e
        L53:
            java.lang.String r1 = android.os.Build.BOARD
            java.lang.String r5 = "GPU: "
            java.lang.String r6 = " ("
            java.lang.String r0 = defpackage.lb1.n(r5, r0, r6, r1, r3)
            goto L20
        L5e:
            java.lang.String r1 = "Qualcomm Adreno ("
            java.lang.String r0 = defpackage.lb1.A(r1, r0, r3)
            goto L20
        L65:
            kd6 r0 = r15.b
            ng6 r0 = (defpackage.ng6) r0
            sr7 r5 = r0.A()
            java.lang.String r6 = r0.x()
            java.util.List r7 = r0.n()
            jm4 r0 = r15.c
            java.util.List r8 = r0.a(r4)
            hm4 r9 = r0.b(r4)
        L7f:
            tp6 r0 = r15.e
            java.lang.Object r14 = r0.getValue()
            r1 = r14
            pr7 r1 = (defpackage.pr7) r1
            r12 = 0
            r13 = 1792(0x700, float:2.511E-42)
            r10 = 0
            r11 = 0
            pr7 r1 = defpackage.pr7.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r0.j(r14, r1)
            if (r0 == 0) goto L7f
            return
    }

    public final void g(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            kd6 r0 = r1.b
            ng6 r0 = (defpackage.ng6) r0
            r0.O(r2)
            sr7 r2 = defpackage.sr7.CUSTOM
            r0.P(r2)
            r1.f()
            return
    }
}
