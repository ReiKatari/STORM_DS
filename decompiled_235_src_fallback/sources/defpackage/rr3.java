package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rr3  reason: default package */
/* loaded from: classes.dex */
public final class rr3 implements defpackage.q46, defpackage.o46 {
    public final defpackage.r46 A;
    public final defpackage.o46 B;
    public final defpackage.ka4 L;

    public rr3(defpackage.q46 r3, java.util.Map r4, defpackage.o46 r5) {
            r2 = this;
            bg2 r0 = new bg2
            r1 = 9
            r0.<init>(r3, r1)
            nq6 r3 = defpackage.s46.a
            r46 r3 = new r46
            r3.<init>(r4, r0)
            r2.<init>()
            r2.A = r3
            r2.B = r5
            ka4 r3 = defpackage.c66.a
            ka4 r3 = new ka4
            r3.<init>()
            r2.L = r3
            return
    }

    @Override // defpackage.q46
    public final defpackage.m44 a(java.lang.String r1, defpackage.on2 r2) {
            r0 = this;
            r46 r0 = r0.A
            m44 r0 = r0.a(r1, r2)
            return r0
    }

    @Override // defpackage.o46
    public final void b(java.lang.Object r7, defpackage.zv0 r8, defpackage.px0 r9, int r10) {
            r6 = this;
            xq2 r9 = (defpackage.xq2) r9
            r0 = -858296452(0xffffffffccd76f7c, float:-1.1295024E8)
            r9.d0(r0)
            r0 = r10 & 6
            if (r0 != 0) goto L17
            boolean r0 = r9.h(r7)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r0 | r10
            goto L18
        L17:
            r0 = r10
        L18:
            r1 = r10 & 48
            if (r1 != 0) goto L28
            boolean r1 = r9.h(r8)
            if (r1 == 0) goto L25
            r1 = 32
            goto L27
        L25:
            r1 = 16
        L27:
            r0 = r0 | r1
        L28:
            r1 = r10 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L38
            boolean r1 = r9.h(r6)
            if (r1 == 0) goto L35
            r1 = 256(0x100, float:3.59E-43)
            goto L37
        L35:
            r1 = 128(0x80, float:1.8E-43)
        L37:
            r0 = r0 | r1
        L38:
            r1 = r0 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 == r2) goto L40
            r1 = 1
            goto L41
        L40:
            r1 = 0
        L41:
            r2 = r0 & 1
            boolean r1 = r9.S(r2, r1)
            if (r1 == 0) goto L73
            r0 = r0 & 126(0x7e, float:1.77E-43)
            o46 r1 = r6.B
            r1.b(r7, r8, r9, r0)
            boolean r0 = r9.h(r6)
            boolean r1 = r9.h(r7)
            r0 = r0 | r1
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L63
            vs0 r0 = defpackage.ox0.a
            if (r1 != r0) goto L6d
        L63:
            bi2 r1 = new bi2
            r0 = 17
            r1.<init>(r0, r6, r7)
            r9.l0(r1)
        L6d:
            qn2 r1 = (defpackage.qn2) r1
            defpackage.mb3.d(r7, r1, r9)
            goto L76
        L73:
            r9.V()
        L76:
            cf5 r9 = r9.t()
            if (r9 == 0) goto L89
            rl r0 = new rl
            r5 = 13
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r9.d = r0
        L89:
            return
    }

    @Override // defpackage.q46
    public final boolean c(java.lang.Object r1) {
            r0 = this;
            r46 r0 = r0.A
            boolean r0 = r0.c(r1)
            return r0
    }

    @Override // defpackage.q46
    public final java.util.Map d() {
            r14 = this;
            ka4 r0 = r14.L
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            o46 r11 = r14.B
            r11.f(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            r46 r14 = r14.A
            java.util.Map r14 = r14.d()
            return r14
    }

    @Override // defpackage.q46
    public final java.lang.Object e(java.lang.String r1) {
            r0 = this;
            r46 r0 = r0.A
            java.lang.Object r0 = r0.e(r1)
            return r0
    }

    @Override // defpackage.o46
    public final void f(java.lang.Object r1) {
            r0 = this;
            o46 r0 = r0.B
            r0.f(r1)
            return
    }
}
