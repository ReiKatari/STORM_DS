package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv3  reason: default package */
/* loaded from: classes.dex */
public final class bv3 extends defpackage.xd6 {
    public final java.util.List c;
    public final java.util.List d;
    public final long e;
    public final long f;
    public final int g;

    public bv3(java.util.List r1, java.util.ArrayList r2, long r3, long r5, int r7) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.d = r2
            r0.e = r3
            r0.f = r5
            r0.g = r7
            return
    }

    @Override // defpackage.xd6
    public final android.graphics.Shader b(long r30) {
            r29 = this;
            r0 = r29
            long r1 = r0.e
            r3 = 32
            long r4 = r1 >> r3
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            r6 = 2139095040(0x7f800000, float:Infinity)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L16
            long r4 = r30 >> r3
            int r4 = (int) r4
        L16:
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r7
            int r1 = (int) r1
            float r2 = java.lang.Float.intBitsToFloat(r1)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L2c
            long r1 = r30 & r7
            int r1 = (int) r1
        L2c:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r9 = r0.f
            long r11 = r9 >> r3
            int r2 = (int) r11
            float r5 = java.lang.Float.intBitsToFloat(r2)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L40
            long r11 = r30 >> r3
            int r2 = (int) r11
        L40:
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r9 = r9 & r7
            int r5 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r5)
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 != 0) goto L51
            long r5 = r30 & r7
            int r5 = (int) r5
        L51:
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r9 = (long) r4
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r11 = (long) r1
            long r9 = r9 << r3
            long r11 = r11 & r7
            long r9 = r9 | r11
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            long r1 = r1 << r3
            long r4 = r4 & r7
            long r1 = r1 | r4
            java.util.List r4 = r0.c
            java.util.List r5 = r0.d
            defpackage.nb3.f0(r4, r5)
            int r6 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            r12 = 0
            r13 = 1
            r14 = 0
            if (r6 < r11) goto L86
            r16 = r14
        L81:
            r18 = r3
            r19 = r7
            goto Laf
        L86:
            int r6 = r4.size()
            int r6 = r6 - r13
            r15 = r13
            r16 = r14
        L8e:
            if (r15 >= r6) goto L81
            java.lang.Object r17 = r4.get(r15)
            r18 = r3
            r3 = r17
            kt0 r3 = (defpackage.kt0) r3
            r19 = r7
            long r7 = r3.a
            float r3 = defpackage.kt0.e(r7)
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 != 0) goto La8
            int r16 = r16 + 1
        La8:
            int r15 = r15 + 1
            r3 = r18
            r7 = r19
            goto L8e
        Laf:
            android.graphics.LinearGradient r21 = new android.graphics.LinearGradient
            long r6 = r9 >> r18
            int r3 = (int) r6
            float r22 = java.lang.Float.intBitsToFloat(r3)
            long r6 = r9 & r19
            int r3 = (int) r6
            float r23 = java.lang.Float.intBitsToFloat(r3)
            long r6 = r1 >> r18
            int r3 = (int) r6
            float r24 = java.lang.Float.intBitsToFloat(r3)
            long r1 = r1 & r19
            int r1 = (int) r1
            float r25 = java.lang.Float.intBitsToFloat(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r11) goto Lef
            int r1 = r4.size()
            int[] r2 = new int[r1]
            r3 = r14
        Ld8:
            if (r3 >= r1) goto Leb
            java.lang.Object r6 = r4.get(r3)
            kt0 r6 = (defpackage.kt0) r6
            long r6 = r6.a
            int r6 = defpackage.hv.b0(r6)
            r2[r3] = r6
            int r3 = r3 + 1
            goto Ld8
        Leb:
            r26 = r2
            goto L17e
        Lef:
            int r1 = r4.size()
            int r1 = r1 + r16
            int[] r2 = new int[r1]
            int r1 = r4.size()
            int r1 = r1 - r13
            int r3 = r4.size()
            r6 = r14
            r7 = r6
        L102:
            if (r6 >= r3) goto Leb
            java.lang.Object r8 = r4.get(r6)
            kt0 r8 = (defpackage.kt0) r8
            long r8 = r8.a
            float r10 = defpackage.kt0.e(r8)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L172
            if (r6 != 0) goto L12c
            int r8 = r7 + 1
            java.lang.Object r9 = r4.get(r13)
            kt0 r9 = (defpackage.kt0) r9
            long r9 = r9.a
            long r9 = defpackage.kt0.c(r12, r9)
            int r9 = defpackage.hv.b0(r9)
            r2[r7] = r9
        L12a:
            r7 = r8
            goto L17b
        L12c:
            if (r6 != r1) goto L145
            int r8 = r7 + 1
            int r9 = r6 + (-1)
            java.lang.Object r9 = r4.get(r9)
            kt0 r9 = (defpackage.kt0) r9
            long r9 = r9.a
            long r9 = defpackage.kt0.c(r12, r9)
            int r9 = defpackage.hv.b0(r9)
            r2[r7] = r9
            goto L12a
        L145:
            int r8 = r6 + (-1)
            java.lang.Object r8 = r4.get(r8)
            kt0 r8 = (defpackage.kt0) r8
            long r8 = r8.a
            int r10 = r7 + 1
            long r8 = defpackage.kt0.c(r12, r8)
            int r8 = defpackage.hv.b0(r8)
            r2[r7] = r8
            int r8 = r6 + 1
            java.lang.Object r8 = r4.get(r8)
            kt0 r8 = (defpackage.kt0) r8
            long r8 = r8.a
            int r7 = r7 + 2
            long r8 = defpackage.kt0.c(r12, r8)
            int r8 = defpackage.hv.b0(r8)
            r2[r10] = r8
            goto L17b
        L172:
            int r10 = r7 + 1
            int r8 = defpackage.hv.b0(r8)
            r2[r7] = r8
            r7 = r10
        L17b:
            int r6 = r6 + 1
            goto L102
        L17e:
            if (r16 != 0) goto L18c
            if (r5 == 0) goto L18a
            float[] r1 = defpackage.gt0.i1(r5)
        L186:
            r27 = r1
            goto L1f6
        L18a:
            r1 = 0
            goto L186
        L18c:
            int r1 = r4.size()
            int r1 = r1 + r16
            float[] r1 = new float[r1]
            if (r5 == 0) goto L1a1
            java.lang.Object r2 = r5.get(r14)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            goto L1a2
        L1a1:
            r2 = r12
        L1a2:
            r1[r14] = r2
            int r2 = r4.size()
            int r2 = r2 - r13
            r3 = r13
            r6 = r3
        L1ab:
            if (r3 >= r2) goto L1df
            java.lang.Object r7 = r4.get(r3)
            kt0 r7 = (defpackage.kt0) r7
            long r7 = r7.a
            if (r5 == 0) goto L1c2
            java.lang.Object r9 = r5.get(r3)
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            goto L1ca
        L1c2:
            float r9 = (float) r3
            int r10 = r4.size()
            int r10 = r10 - r13
            float r10 = (float) r10
            float r9 = r9 / r10
        L1ca:
            int r10 = r6 + 1
            r1[r6] = r9
            float r7 = defpackage.kt0.e(r7)
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 != 0) goto L1db
            int r6 = r6 + 2
            r1[r10] = r9
            goto L1dc
        L1db:
            r6 = r10
        L1dc:
            int r3 = r3 + 1
            goto L1ab
        L1df:
            if (r5 == 0) goto L1f1
            int r2 = r4.size()
            int r2 = r2 - r13
            java.lang.Object r2 = r5.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            goto L1f3
        L1f1:
            r2 = 1065353216(0x3f800000, float:1.0)
        L1f3:
            r1[r6] = r2
            goto L186
        L1f6:
            int r0 = r0.g
            android.graphics.Shader$TileMode r28 = defpackage.u24.G(r0)
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            return r21
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3c
        L3:
            boolean r0 = r5 instanceof defpackage.bv3
            if (r0 != 0) goto L8
            goto L3e
        L8:
            bv3 r5 = (defpackage.bv3) r5
            java.util.List r0 = r5.c
            java.util.List r1 = r4.c
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L3e
        L15:
            java.util.List r0 = r4.d
            java.util.List r1 = r5.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L3e
        L20:
            long r0 = r4.e
            long r2 = r5.e
            boolean r0 = defpackage.jk4.c(r0, r2)
            if (r0 != 0) goto L2b
            goto L3e
        L2b:
            long r0 = r4.f
            long r2 = r5.f
            boolean r0 = defpackage.jk4.c(r0, r2)
            if (r0 != 0) goto L36
            goto L3e
        L36:
            int r4 = r4.g
            int r5 = r5.g
            if (r4 != r5) goto L3e
        L3c:
            r4 = 1
            return r4
        L3e:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.util.List r0 = r4.c
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r4.d
            if (r2 == 0) goto L12
            int r2 = r2.hashCode()
            goto L13
        L12:
            r2 = 0
        L13:
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r2 = r4.e
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.f
            int r0 = defpackage.i61.c(r2, r0, r1)
            int r4 = r4.g
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r18 = this;
            r0 = r18
            long r1 = r0.e
            r3 = 9187343241974906880(0x7f8000007f800000, double:1.404448428688076E306)
            long r5 = r1 & r3
            long r5 = r5 ^ r3
            r7 = 4294967297(0x100000001, double:2.1219957915E-314)
            long r5 = r5 - r7
            r9 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r5 = r5 & r9
            r11 = 0
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            java.lang.String r6 = ""
            java.lang.String r13 = ", "
            if (r5 != 0) goto L38
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r14 = "start="
            r5.<init>(r14)
            java.lang.String r1 = defpackage.jk4.h(r1)
            r5.append(r1)
            r5.append(r13)
            java.lang.String r1 = r5.toString()
            goto L39
        L38:
            r1 = r6
        L39:
            long r14 = r0.f
            long r16 = r14 & r3
            long r2 = r16 ^ r3
            long r2 = r2 - r7
            long r2 = r2 & r9
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L5a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "end="
            r2.<init>(r3)
            java.lang.String r3 = defpackage.jk4.h(r14)
            r2.append(r3)
            r2.append(r13)
            java.lang.String r6 = r2.toString()
        L5a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "LinearGradient(colors="
            r2.<init>(r3)
            java.util.List r3 = r0.c
            r2.append(r3)
            java.lang.String r3 = ", stops="
            r2.append(r3)
            java.util.List r3 = r0.d
            r2.append(r3)
            r2.append(r13)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = "tileMode="
            r2.append(r1)
            int r0 = r0.g
            java.lang.String r0 = defpackage.uj2.d0(r0)
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
