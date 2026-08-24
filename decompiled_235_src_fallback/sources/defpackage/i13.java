package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i13  reason: default package */
/* loaded from: classes.dex */
public abstract class i13 {
    public static final defpackage.a74 a = null;

    static {
            x64 r0 = defpackage.x64.a
            r1 = 1103101952(0x41c00000, float:24.0)
            a74 r0 = defpackage.dj6.i(r0, r1)
            defpackage.i13.a = r0
            return
    }

    public static final void a(defpackage.e33 r8, java.lang.String r9, defpackage.a74 r10, long r11, defpackage.px0 r13, int r14, int r15) {
            r0 = r15 & 4
            if (r0 == 0) goto L6
            x64 r10 = defpackage.x64.a
        L6:
            r2 = r10
            r10 = 8
            r15 = r15 & r10
            if (r15 == 0) goto L29
            py0 r11 = defpackage.j31.a
            r12 = r13
            xq2 r12 = (defpackage.xq2) r12
            java.lang.Object r11 = r12.j(r11)
            kt0 r11 = (defpackage.kt0) r11
            long r0 = r11.a
            py0 r11 = defpackage.g31.a
            java.lang.Object r11 = r12.j(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            long r11 = defpackage.kt0.c(r11, r0)
        L29:
            r3 = r11
            gl7 r0 = defpackage.kn2.Z(r8, r13)
            r8 = r14 & 112(0x70, float:1.57E-43)
            r8 = r8 | r10
            r10 = r14 & 896(0x380, float:1.256E-42)
            r8 = r8 | r10
            r10 = r14 & 7168(0x1c00, float:1.0045E-41)
            r6 = r8 | r10
            r7 = 0
            r1 = r9
            r5 = r13
            b(r0, r1, r2, r3, r5, r6, r7)
            return
    }

    public static final void b(defpackage.sr4 r16, java.lang.String r17, defpackage.a74 r18, long r19, defpackage.px0 r21, int r22, int r23) {
            r2 = r17
            r6 = r22
            r0 = r21
            xq2 r0 = (defpackage.xq2) r0
            r1 = -1142959010(0xffffffffbbdfd45e, float:-0.006830736)
            r0.d0(r1)
            r1 = r6 & 6
            r8 = r16
            if (r1 != 0) goto L1f
            boolean r1 = r0.h(r8)
            if (r1 == 0) goto L1c
            r1 = 4
            goto L1d
        L1c:
            r1 = 2
        L1d:
            r1 = r1 | r6
            goto L20
        L1f:
            r1 = r6
        L20:
            r3 = r6 & 48
            r4 = 32
            if (r3 != 0) goto L31
            boolean r3 = r0.f(r2)
            if (r3 == 0) goto L2e
            r3 = r4
            goto L30
        L2e:
            r3 = 16
        L30:
            r1 = r1 | r3
        L31:
            r3 = r23 & 4
            if (r3 == 0) goto L3a
            r1 = r1 | 384(0x180, float:5.38E-43)
        L37:
            r5 = r18
            goto L4c
        L3a:
            r5 = r6 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L37
            r5 = r18
            boolean r7 = r0.f(r5)
            if (r7 == 0) goto L49
            r7 = 256(0x100, float:3.59E-43)
            goto L4b
        L49:
            r7 = 128(0x80, float:1.8E-43)
        L4b:
            r1 = r1 | r7
        L4c:
            r7 = r6 & 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            if (r7 != 0) goto L64
            r7 = r23 & 8
            r10 = r19
            if (r7 != 0) goto L60
            boolean r7 = r0.e(r10)
            if (r7 == 0) goto L60
            r7 = r9
            goto L62
        L60:
            r7 = 1024(0x400, float:1.435E-42)
        L62:
            r1 = r1 | r7
            goto L66
        L64:
            r10 = r19
        L66:
            r7 = r1 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r7 == r12) goto L6e
            r7 = 1
            goto L6f
        L6e:
            r7 = 0
        L6f:
            r12 = r1 & 1
            boolean r7 = r0.S(r12, r7)
            if (r7 == 0) goto L171
            r0.X()
            r7 = r6 & 1
            x64 r12 = defpackage.x64.a
            if (r7 == 0) goto L91
            boolean r7 = r0.B()
            if (r7 == 0) goto L87
            goto L91
        L87:
            r0.V()
            r3 = r23 & 8
            if (r3 == 0) goto Lb3
        L8e:
            r1 = r1 & (-7169(0xffffffffffffe3ff, float:NaN))
            goto Lb3
        L91:
            if (r3 == 0) goto L94
            r5 = r12
        L94:
            r3 = r23 & 8
            if (r3 == 0) goto Lb3
            py0 r3 = defpackage.j31.a
            java.lang.Object r3 = r0.j(r3)
            kt0 r3 = (defpackage.kt0) r3
            long r10 = r3.a
            py0 r3 = defpackage.g31.a
            java.lang.Object r3 = r0.j(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            long r10 = defpackage.kt0.c(r3, r10)
            goto L8e
        Lb3:
            r0.q()
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 ^ 3072(0xc00, float:4.305E-42)
            if (r3 <= r9) goto Lc2
            boolean r3 = r0.e(r10)
            if (r3 != 0) goto Lc6
        Lc2:
            r3 = r1 & 3072(0xc00, float:4.305E-42)
            if (r3 != r9) goto Lc8
        Lc6:
            r3 = 1
            goto Lc9
        Lc8:
            r3 = 0
        Lc9:
            java.lang.Object r7 = r0.P()
            vs0 r9 = defpackage.ox0.a
            if (r3 != 0) goto Ld3
            if (r7 != r9) goto Le6
        Ld3:
            long r13 = defpackage.kt0.h
            boolean r7 = defpackage.kt0.d(r10, r13)
            if (r7 == 0) goto Ldd
            r7 = 0
            goto Le3
        Ldd:
            z40 r7 = new z40
            r13 = 5
            r7.<init>(r13, r10)
        Le3:
            r0.l0(r7)
        Le6:
            z40 r7 = (defpackage.z40) r7
            if (r2 == 0) goto L114
            r13 = 609219782(0x244ff4c6, float:4.50933E-17)
            r0.b0(r13)
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r4) goto Lf6
            r13 = 1
            goto Lf7
        Lf6:
            r13 = 0
        Lf7:
            java.lang.Object r1 = r0.P()
            if (r13 != 0) goto Lff
            if (r1 != r9) goto L109
        Lff:
            c70 r1 = new c70
            r9 = 11
            r1.<init>(r2, r9)
            r0.l0(r1)
        L109:
            qn2 r1 = (defpackage.qn2) r1
            r3 = 0
            a74 r1 = defpackage.ua6.a(r12, r3, r1)
            r0.p(r3)
            goto L11f
        L114:
            r3 = 0
            r1 = 609378564(0x24526104, float:4.5618667E-17)
            r0.b0(r1)
            r0.p(r3)
            r1 = r12
        L11f:
            long r13 = r8.h()
            r21 = r4
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r3 = defpackage.xi6.b(r13, r3)
            if (r3 != 0) goto L152
            long r3 = r8.h()
            long r13 = r3 >> r21
            int r9 = (int) r13
            float r9 = java.lang.Float.intBitsToFloat(r9)
            boolean r9 = java.lang.Float.isInfinite(r9)
            if (r9 == 0) goto L154
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r13
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            boolean r3 = java.lang.Float.isInfinite(r3)
            if (r3 == 0) goto L154
        L152:
            a74 r12 = defpackage.i13.a
        L154:
            a74 r3 = r5.d(r12)
            r9 = r10
            r11 = 0
            r13 = 22
            r14 = r9
            r9 = 0
            w31 r10 = defpackage.y31.b
            r12 = r7
            r7 = r3
            a74 r3 = defpackage.ak7.u0(r7, r8, r9, r10, r11, r12, r13)
            a74 r1 = r3.d(r1)
            r3 = 0
            defpackage.h70.a(r1, r0, r3)
            r3 = r5
            r4 = r14
            goto L176
        L171:
            r0.V()
            r3 = r5
            r4 = r10
        L176:
            cf5 r8 = r0.t()
            if (r8 == 0) goto L187
            h13 r0 = new h13
            r1 = r16
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.d = r0
        L187:
            return
    }
}
