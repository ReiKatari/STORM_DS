package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s47  reason: default package */
/* loaded from: classes.dex */
public final class s47 {
    public static final defpackage.s47 d = null;
    public final defpackage.nn6 a;
    public final defpackage.ds4 b;
    public final defpackage.hy4 c;

    static {
            s47 r0 = new s47
            r11 = 0
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r0.<init>(r1, r3, r5, r6, r8, r10, r11, r13)
            defpackage.s47.d = r0
            return
    }

    public s47(long r26, long r28, defpackage.oj2 r30, long r31, long r33, int r35, long r36, int r38) {
            r25 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto La
            long r1 = defpackage.kt0.h
            r4 = r1
            goto Lc
        La:
            r4 = r26
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L14
            long r1 = defpackage.x47.c
            r6 = r1
            goto L16
        L14:
            r6 = r28
        L16:
            r1 = r0 & 4
            r22 = 0
            if (r1 == 0) goto L1f
            r8 = r22
            goto L21
        L1f:
            r8 = r30
        L21:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L29
            long r1 = defpackage.x47.c
            r13 = r1
            goto L2b
        L29:
            r13 = r31
        L2b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L34
            long r1 = defpackage.kt0.h
            r18 = r1
            goto L36
        L34:
            r18 = r33
        L36:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L3e
            r1 = 0
            goto L40
        L3e:
            r1 = r35
        L40:
            r2 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r2
            if (r0 == 0) goto L4a
            long r2 = defpackage.x47.c
            r23 = r2
            goto L4c
        L4a:
            r23 = r36
        L4c:
            nn6 r3 = new nn6
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22)
            ds4 r0 = new ds4
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r26 = r0
            r27 = r1
            r28 = r2
            r31 = r4
            r33 = r5
            r34 = r6
            r35 = r7
            r36 = r8
            r32 = r22
            r29 = r23
            r26.<init>(r27, r28, r29, r31, r32, r33, r34, r35, r36)
            r1 = 0
            r2 = r25
            r2.<init>(r3, r0, r1)
            return
    }

    public s47(defpackage.nn6 r4, defpackage.ds4 r5) {
            r3 = this;
            cy4 r0 = r4.o
            ux4 r1 = r5.e
            if (r0 != 0) goto La
            if (r1 != 0) goto La
            r0 = 0
            goto L10
        La:
            hy4 r2 = new hy4
            r2.<init>(r0, r1)
            r0 = r2
        L10:
            r3.<init>(r4, r5, r0)
            return
    }

    public s47(defpackage.nn6 r1, defpackage.ds4 r2, defpackage.hy4 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static defpackage.s47 a(defpackage.s47 r30, long r31, long r33, defpackage.oj2 r35, defpackage.li2 r36, long r37, long r39, defpackage.xu3 r41, int r42) {
            r0 = r30
            r1 = r42
            hy4 r2 = defpackage.nw7.X
            r3 = r1 & 1
            if (r3 == 0) goto L13
            nn6 r3 = r0.a
            e37 r3 = r3.a
            long r3 = r3.b()
            goto L15
        L13:
            r3 = r31
        L15:
            r5 = r1 & 2
            if (r5 == 0) goto L1f
            nn6 r5 = r0.a
            long r5 = r5.b
            r9 = r5
            goto L21
        L1f:
            r9 = r33
        L21:
            r5 = r1 & 4
            if (r5 == 0) goto L2b
            nn6 r5 = r0.a
            oj2 r5 = r5.c
            r11 = r5
            goto L2d
        L2b:
            r11 = r35
        L2d:
            nn6 r5 = r0.a
            ij2 r12 = r5.d
            jj2 r13 = r5.e
            r6 = r1 & 32
            if (r6 == 0) goto L3b
            li2 r6 = r5.f
            r14 = r6
            goto L3d
        L3b:
            r14 = r36
        L3d:
            java.lang.String r15 = r5.g
            r6 = r1 & 128(0x80, float:1.8E-43)
            if (r6 == 0) goto L48
            long r6 = r5.h
            r16 = r6
            goto L4a
        L48:
            r16 = r37
        L4a:
            x20 r6 = r5.i
            f37 r7 = r5.j
            gy3 r8 = r5.k
            r18 = r2
            long r1 = r5.l
            r21 = r1
            b17 r1 = r5.m
            ge6 r2 = r5.n
            r23 = r1
            oo1 r1 = r5.p
            r19 = 32768(0x8000, float:4.5918E-41)
            r19 = r42 & r19
            r26 = r1
            if (r19 == 0) goto L6e
            ds4 r1 = r0.b
            int r1 = r1.a
        L6b:
            r31 = r1
            goto L70
        L6e:
            r1 = 3
            goto L6b
        L70:
            ds4 r1 = r0.b
            r24 = r2
            int r2 = r1.b
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r42 & r19
            if (r19 == 0) goto L85
            r19 = r6
            r20 = r7
            long r6 = r1.c
            r27 = r6
            goto L8b
        L85:
            r19 = r6
            r20 = r7
            r27 = r39
        L8b:
            g37 r6 = r1.d
            r7 = 524288(0x80000, float:7.34684E-40)
            r7 = r42 & r7
            if (r7 == 0) goto L96
            hy4 r0 = r0.c
            goto L98
        L96:
            r0 = r18
        L98:
            r7 = 1048576(0x100000, float:1.469368E-39)
            r7 = r42 & r7
            if (r7 == 0) goto La3
            xu3 r7 = r1.f
            r29 = r7
            goto La5
        La3:
            r29 = r41
        La5:
            int r7 = r1.g
            r32 = r2
            int r2 = r1.h
            i47 r1 = r1.i
            r40 = r1
            s47 r1 = new s47
            r18 = r7
            nn6 r7 = new nn6
            r39 = r2
            e37 r2 = r5.a
            r35 = r6
            r30 = r7
            long r6 = r2.b()
            boolean r2 = defpackage.kt0.d(r3, r6)
            if (r2 == 0) goto Lca
            e37 r2 = r5.a
            goto Ld8
        Lca:
            r5 = 16
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 == 0) goto Ld6
            st0 r2 = new st0
            r2.<init>(r3)
            goto Ld8
        Ld6:
            d37 r2 = defpackage.d37.a
        Ld8:
            r3 = 0
            if (r0 == 0) goto Lec
            cy4 r4 = r0.a
            r25 = r4
        Ldf:
            r7 = r8
            r8 = r2
            r2 = r18
            r18 = r19
            r19 = r20
            r20 = r7
            r7 = r30
            goto Lef
        Lec:
            r25 = r3
            goto Ldf
        Lef:
            r7.<init>(r8, r9, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26)
            ds4 r4 = new ds4
            if (r0 == 0) goto Lf8
            ux4 r3 = r0.b
        Lf8:
            r38 = r2
            r36 = r3
            r30 = r4
            r33 = r27
            r37 = r29
            r30.<init>(r31, r32, r33, r35, r36, r37, r38, r39, r40)
            r2 = r30
            r1.<init>(r7, r2, r0)
            return r1
    }

    public static defpackage.s47 e(defpackage.s47 r29, long r30, long r32, defpackage.oj2 r34, defpackage.li2 r35, long r36, int r38, long r39, int r41) {
            r0 = r29
            r1 = r41
            r2 = r1 & 1
            if (r2 == 0) goto Lc
            long r2 = defpackage.kt0.h
            r5 = r2
            goto Le
        Lc:
            r5 = r30
        Le:
            r2 = r1 & 2
            if (r2 == 0) goto L16
            long r2 = defpackage.x47.c
            r9 = r2
            goto L18
        L16:
            r9 = r32
        L18:
            r2 = r1 & 4
            r25 = 0
            if (r2 == 0) goto L21
            r11 = r25
            goto L23
        L21:
            r11 = r34
        L23:
            r2 = r1 & 32
            if (r2 == 0) goto L2a
            r14 = r25
            goto L2c
        L2a:
            r14 = r35
        L2c:
            r2 = r1 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L35
            long r2 = defpackage.x47.c
            r16 = r2
            goto L37
        L35:
            r16 = r36
        L37:
            long r21 = defpackage.kt0.h
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r1
            if (r2 == 0) goto L41
            r2 = 0
            goto L43
        L41:
            r2 = r38
        L43:
            r3 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r3
            if (r1 == 0) goto L4d
            long r3 = defpackage.x47.c
            r27 = r3
            goto L4f
        L4d:
            r27 = r39
        L4f:
            nn6 r4 = r0.a
            r7 = 0
            r8 = 2143289344(0x7fc00000, float:NaN)
            r12 = 0
            r13 = 0
            r15 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            nn6 r1 = defpackage.on6.a(r4, r5, r7, r8, r9, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26)
            ds4 r3 = r0.b
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r31 = r2
            r30 = r3
            r32 = r4
            r35 = r5
            r37 = r6
            r38 = r7
            r39 = r8
            r40 = r9
            r36 = r25
            r33 = r27
            ds4 r2 = defpackage.es4.a(r30, r31, r32, r33, r35, r36, r37, r38, r39, r40)
            nn6 r3 = r0.a
            if (r3 != r1) goto L90
            ds4 r3 = r0.b
            if (r3 != r2) goto L90
            return r0
        L90:
            s47 r0 = new s47
            r0.<init>(r1, r2)
            return r0
    }

    public final long b() {
            r2 = this;
            nn6 r2 = r2.a
            e37 r2 = r2.a
            long r0 = r2.b()
            return r0
    }

    public final boolean c(defpackage.s47 r3) {
            r2 = this;
            if (r2 == r3) goto L19
            ds4 r0 = r2.b
            ds4 r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L17
            nn6 r2 = r2.a
            nn6 r3 = r3.a
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L17
            goto L19
        L17:
            r2 = 0
            return r2
        L19:
            r2 = 1
            return r2
    }

    public final defpackage.s47 d(defpackage.s47 r4) {
            r3 = this;
            if (r4 == 0) goto L21
            s47 r0 = defpackage.s47.d
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb
            goto L21
        Lb:
            s47 r0 = new s47
            nn6 r1 = r3.a
            nn6 r2 = r4.a
            nn6 r1 = r1.c(r2)
            ds4 r3 = r3.b
            ds4 r4 = r4.b
            ds4 r3 = r3.a(r4)
            r0.<init>(r1, r3)
            return r0
        L21:
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.s47
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s47 r5 = (defpackage.s47) r5
            nn6 r1 = r5.a
            nn6 r3 = r4.a
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            ds4 r1 = r4.b
            ds4 r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            hy4 r4 = r4.c
            hy4 r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            nn6 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ds4 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            hy4 r2 = r2.c
            if (r2 == 0) goto L1a
            int r2 = r2.hashCode()
            goto L1b
        L1a:
            r2 = 0
        L1b:
            int r1 = r1 + r2
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextStyle(color="
            r0.<init>(r1)
            long r1 = r4.b()
            java.lang.String r1 = defpackage.kt0.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", brush="
            r0.append(r1)
            nn6 r1 = r4.a
            e37 r2 = r1.a
            f80 r2 = r2.c()
            r0.append(r2)
            java.lang.String r2 = ", alpha="
            r0.append(r2)
            e37 r2 = r1.a
            float r2 = r2.a()
            r0.append(r2)
            java.lang.String r2 = ", fontSize="
            r0.append(r2)
            long r2 = r1.b
            java.lang.String r2 = defpackage.x47.d(r2)
            r0.append(r2)
            java.lang.String r2 = ", fontWeight="
            r0.append(r2)
            oj2 r2 = r1.c
            r0.append(r2)
            java.lang.String r2 = ", fontStyle="
            r0.append(r2)
            ij2 r2 = r1.d
            r0.append(r2)
            java.lang.String r2 = ", fontSynthesis="
            r0.append(r2)
            jj2 r2 = r1.e
            r0.append(r2)
            java.lang.String r2 = ", fontFamily="
            r0.append(r2)
            li2 r2 = r1.f
            r0.append(r2)
            java.lang.String r2 = ", fontFeatureSettings="
            r0.append(r2)
            java.lang.String r2 = r1.g
            r0.append(r2)
            java.lang.String r2 = ", letterSpacing="
            r0.append(r2)
            long r2 = r1.h
            java.lang.String r2 = defpackage.x47.d(r2)
            r0.append(r2)
            java.lang.String r2 = ", baselineShift="
            r0.append(r2)
            x20 r2 = r1.i
            r0.append(r2)
            java.lang.String r2 = ", textGeometricTransform="
            r0.append(r2)
            f37 r2 = r1.j
            r0.append(r2)
            java.lang.String r2 = ", localeList="
            r0.append(r2)
            gy3 r2 = r1.k
            r0.append(r2)
            java.lang.String r2 = ", background="
            r0.append(r2)
            long r2 = r1.l
            java.lang.String r2 = defpackage.kt0.j(r2)
            r0.append(r2)
            java.lang.String r2 = ", textDecoration="
            r0.append(r2)
            b17 r2 = r1.m
            r0.append(r2)
            java.lang.String r2 = ", shadow="
            r0.append(r2)
            ge6 r2 = r1.n
            r0.append(r2)
            java.lang.String r2 = ", drawStyle="
            r0.append(r2)
            oo1 r1 = r1.p
            r0.append(r1)
            java.lang.String r1 = ", textAlign="
            r0.append(r1)
            ds4 r1 = r4.b
            int r2 = r1.a
            java.lang.String r2 = defpackage.wz6.a(r2)
            r0.append(r2)
            java.lang.String r2 = ", textDirection="
            r0.append(r2)
            int r2 = r1.b
            java.lang.String r2 = defpackage.e17.a(r2)
            r0.append(r2)
            java.lang.String r2 = ", lineHeight="
            r0.append(r2)
            long r2 = r1.c
            java.lang.String r2 = defpackage.x47.d(r2)
            r0.append(r2)
            java.lang.String r2 = ", textIndent="
            r0.append(r2)
            g37 r2 = r1.d
            r0.append(r2)
            java.lang.String r2 = ", platformStyle="
            r0.append(r2)
            hy4 r4 = r4.c
            r0.append(r4)
            java.lang.String r4 = ", lineHeightStyle="
            r0.append(r4)
            xu3 r4 = r1.f
            r0.append(r4)
            java.lang.String r4 = ", lineBreak="
            r0.append(r4)
            int r4 = r1.g
            java.lang.String r4 = defpackage.su3.a(r4)
            r0.append(r4)
            java.lang.String r4 = ", hyphens="
            r0.append(r4)
            int r4 = r1.h
            java.lang.String r4 = defpackage.q03.a(r4)
            r0.append(r4)
            java.lang.String r4 = ", textMotion="
            r0.append(r4)
            i47 r4 = r1.i
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
