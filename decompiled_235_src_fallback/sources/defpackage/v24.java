package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v24  reason: default package */
/* loaded from: classes.dex */
public final class v24 {
    public final float[] a;

    public /* synthetic */ v24(float[] r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static float[] a() {
            r0 = 16
            float[] r0 = new float[r0]
            r0 = {x0008: FILL_ARRAY_DATA  , data: [1065353216, 0, 0, 0, 0, 1065353216, 0, 0, 0, 0, 1065353216, 0, 0, 0, 0, 1065353216} // fill-array
            return r0
    }

    public static final long b(long r12, float[] r14) {
            int r0 = r14.length
            r1 = 16
            if (r0 >= r1) goto L6
            return r12
        L6:
            r0 = 0
            r0 = r14[r0]
            r1 = 1
            r1 = r14[r1]
            r2 = 3
            r2 = r14[r2]
            r3 = 4
            r3 = r14[r3]
            r4 = 5
            r4 = r14[r4]
            r5 = 7
            r5 = r14[r5]
            r6 = 12
            r6 = r14[r6]
            r7 = 13
            r7 = r14[r7]
            r8 = 15
            r14 = r14[r8]
            r8 = 32
            long r9 = r12 >> r8
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r10
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r2 = r2 * r9
            float r5 = r5 * r12
            float r5 = r5 + r2
            float r5 = r5 + r14
            r13 = 1065353216(0x3f800000, float:1.0)
            float r13 = r13 / r5
            int r14 = java.lang.Float.floatToRawIntBits(r13)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r14 = r14 & r2
            r2 = 2139095040(0x7f800000, float:Infinity)
            if (r14 >= r2) goto L4c
            goto L4d
        L4c:
            r13 = 0
        L4d:
            float r0 = r0 * r9
            float r3 = r3 * r12
            float r3 = r3 + r0
            float r3 = r3 + r6
            float r3 = r3 * r13
            float r1 = r1 * r9
            float r4 = r4 * r12
            float r4 = r4 + r1
            float r4 = r4 + r7
            float r4 = r4 * r13
            int r12 = java.lang.Float.floatToRawIntBits(r3)
            long r12 = (long) r12
            int r14 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r14
            long r12 = r12 << r8
            long r0 = r0 & r10
            long r12 = r12 | r0
            return r12
    }

    public static final void c(float[] r24, defpackage.ia4 r25) {
            r0 = r24
            r1 = r25
            int r2 = r0.length
            r3 = 16
            if (r2 >= r3) goto La
            return
        La:
            r2 = 0
            r2 = r0[r2]
            r3 = 1
            r3 = r0[r3]
            r4 = 3
            r4 = r0[r4]
            r5 = 4
            r5 = r0[r5]
            r6 = 5
            r6 = r0[r6]
            r7 = 7
            r7 = r0[r7]
            r8 = 12
            r8 = r0[r8]
            r9 = 13
            r9 = r0[r9]
            r10 = 15
            r0 = r0[r10]
            float r10 = r1.a
            float r11 = r1.b
            float r12 = r1.c
            float r13 = r1.d
            float r14 = r4 * r10
            float r15 = r7 * r11
            float r16 = r14 + r15
            float r16 = r16 + r0
            r17 = 1065353216(0x3f800000, float:1.0)
            float r16 = r17 / r16
            int r18 = java.lang.Float.floatToRawIntBits(r16)
            r19 = 2147483647(0x7fffffff, float:NaN)
            r24 = r0
            r0 = r18 & r19
            r18 = 0
            r20 = r2
            r2 = 2139095040(0x7f800000, float:Infinity)
            if (r0 >= r2) goto L50
            goto L52
        L50:
            r16 = r18
        L52:
            float r0 = r20 * r10
            float r21 = r5 * r11
            float r22 = r0 + r21
            float r22 = r22 + r8
            float r2 = r22 * r16
            float r10 = r10 * r3
            float r11 = r11 * r6
            float r22 = r10 + r11
            float r22 = r22 + r9
            r23 = r0
            float r0 = r22 * r16
            float r7 = r7 * r13
            float r14 = r14 + r7
            float r14 = r14 + r24
            float r14 = r17 / r14
            int r16 = java.lang.Float.floatToRawIntBits(r14)
            r22 = r3
            r3 = r16 & r19
            r16 = r4
            r4 = 2139095040(0x7f800000, float:Infinity)
            if (r3 >= r4) goto L7b
            goto L7d
        L7b:
            r14 = r18
        L7d:
            float r5 = r5 * r13
            float r3 = r23 + r5
            float r3 = r3 + r8
            float r3 = r3 * r14
            float r6 = r6 * r13
            float r10 = r10 + r6
            float r10 = r10 + r9
            float r10 = r10 * r14
            float r4 = r16 * r12
            float r15 = r15 + r4
            float r15 = r15 + r24
            float r13 = r17 / r15
            int r14 = java.lang.Float.floatToRawIntBits(r13)
            r14 = r14 & r19
            r15 = 2139095040(0x7f800000, float:Infinity)
            if (r14 >= r15) goto L98
            goto L9a
        L98:
            r13 = r18
        L9a:
            float r14 = r20 * r12
            float r21 = r14 + r21
            float r21 = r21 + r8
            float r15 = r21 * r13
            float r12 = r12 * r22
            float r11 = r11 + r12
            float r11 = r11 + r9
            float r11 = r11 * r13
            float r4 = r4 + r7
            float r4 = r4 + r24
            float r17 = r17 / r4
            int r4 = java.lang.Float.floatToRawIntBits(r17)
            r4 = r4 & r19
            r7 = 2139095040(0x7f800000, float:Infinity)
            if (r4 >= r7) goto Lb8
            r18 = r17
        Lb8:
            float r14 = r14 + r5
            float r14 = r14 + r8
            float r14 = r14 * r18
            float r12 = r12 + r6
            float r12 = r12 + r9
            float r12 = r12 * r18
            float r4 = java.lang.Math.min(r15, r14)
            float r4 = java.lang.Math.min(r3, r4)
            float r4 = java.lang.Math.min(r2, r4)
            r1.a = r4
            float r4 = java.lang.Math.min(r11, r12)
            float r4 = java.lang.Math.min(r10, r4)
            float r4 = java.lang.Math.min(r0, r4)
            r1.b = r4
            float r4 = java.lang.Math.max(r15, r14)
            float r3 = java.lang.Math.max(r3, r4)
            float r2 = java.lang.Math.max(r2, r3)
            r1.c = r2
            float r2 = java.lang.Math.max(r11, r12)
            float r2 = java.lang.Math.max(r10, r2)
            float r0 = java.lang.Math.max(r0, r2)
            r1.d = r0
            return
    }

    public static final void d(float[] r3) {
            int r0 = r3.length
            r1 = 16
            if (r0 >= r1) goto L6
            return
        L6:
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r3[r0] = r1
            r0 = 1
            r2 = 0
            r3[r0] = r2
            r0 = 2
            r3[r0] = r2
            r0 = 3
            r3[r0] = r2
            r0 = 4
            r3[r0] = r2
            r0 = 5
            r3[r0] = r1
            r0 = 6
            r3[r0] = r2
            r0 = 7
            r3[r0] = r2
            r0 = 8
            r3[r0] = r2
            r0 = 9
            r3[r0] = r2
            r0 = 10
            r3[r0] = r1
            r0 = 11
            r3[r0] = r2
            r0 = 12
            r3[r0] = r2
            r0 = 13
            r3[r0] = r2
            r0 = 14
            r3[r0] = r2
            r0 = 15
            r3[r0] = r1
            return
    }

    public static final void e(float[] r49, float[] r50) {
            r0 = r49
            r1 = r50
            int r2 = r0.length
            r3 = 16
            if (r2 >= r3) goto La
            goto Ld
        La:
            int r2 = r1.length
            if (r2 >= r3) goto Le
        Ld:
            return
        Le:
            r2 = 0
            r3 = r0[r2]
            r4 = r1[r2]
            float r5 = r3 * r4
            r6 = 1
            r7 = r0[r6]
            r8 = 4
            r9 = r1[r8]
            float r10 = r7 * r9
            float r10 = r10 + r5
            r5 = 2
            r11 = r0[r5]
            r12 = 8
            r13 = r1[r12]
            float r14 = r11 * r13
            float r14 = r14 + r10
            r10 = 3
            r15 = r0[r10]
            r16 = 12
            r17 = r1[r16]
            float r18 = r15 * r17
            float r18 = r18 + r14
            r14 = r1[r6]
            float r19 = r3 * r14
            r20 = 5
            r21 = r1[r20]
            float r22 = r7 * r21
            float r22 = r22 + r19
            r19 = 9
            r23 = r1[r19]
            float r24 = r11 * r23
            float r24 = r24 + r22
            r22 = 13
            r25 = r1[r22]
            float r26 = r15 * r25
            float r26 = r26 + r24
            r24 = r1[r5]
            float r27 = r3 * r24
            r28 = 6
            r29 = r1[r28]
            float r30 = r7 * r29
            float r30 = r30 + r27
            r27 = 10
            r31 = r1[r27]
            float r32 = r11 * r31
            float r32 = r32 + r30
            r30 = 14
            r33 = r1[r30]
            float r34 = r15 * r33
            float r34 = r34 + r32
            r32 = r1[r10]
            float r3 = r3 * r32
            r35 = 7
            r36 = r1[r35]
            float r7 = r7 * r36
            float r7 = r7 + r3
            r3 = 11
            r37 = r1[r3]
            float r11 = r11 * r37
            float r11 = r11 + r7
            r7 = 15
            r1 = r1[r7]
            float r15 = r15 * r1
            float r15 = r15 + r11
            r11 = r0[r8]
            float r38 = r11 * r4
            r39 = r0[r20]
            float r40 = r39 * r9
            float r40 = r40 + r38
            r38 = r0[r28]
            float r41 = r38 * r13
            float r41 = r41 + r40
            r40 = r0[r35]
            float r42 = r40 * r17
            float r42 = r42 + r41
            float r41 = r11 * r14
            float r43 = r39 * r21
            float r43 = r43 + r41
            float r41 = r38 * r23
            float r41 = r41 + r43
            float r43 = r40 * r25
            float r43 = r43 + r41
            float r41 = r11 * r24
            float r44 = r39 * r29
            float r44 = r44 + r41
            float r41 = r38 * r31
            float r41 = r41 + r44
            float r44 = r40 * r33
            float r44 = r44 + r41
            float r11 = r11 * r32
            float r39 = r39 * r36
            float r39 = r39 + r11
            float r38 = r38 * r37
            float r38 = r38 + r39
            float r40 = r40 * r1
            float r40 = r40 + r38
            r11 = r0[r12]
            float r38 = r11 * r4
            r39 = r0[r19]
            float r41 = r39 * r9
            float r41 = r41 + r38
            r38 = r0[r27]
            float r45 = r38 * r13
            float r45 = r45 + r41
            r41 = r0[r3]
            float r46 = r41 * r17
            float r46 = r46 + r45
            float r45 = r11 * r14
            float r47 = r39 * r21
            float r47 = r47 + r45
            float r45 = r38 * r23
            float r45 = r45 + r47
            float r47 = r41 * r25
            float r47 = r47 + r45
            float r45 = r11 * r24
            float r48 = r39 * r29
            float r48 = r48 + r45
            float r45 = r38 * r31
            float r45 = r45 + r48
            float r48 = r41 * r33
            float r48 = r48 + r45
            float r11 = r11 * r32
            float r39 = r39 * r36
            float r39 = r39 + r11
            float r38 = r38 * r37
            float r38 = r38 + r39
            float r41 = r41 * r1
            float r41 = r41 + r38
            r11 = r0[r16]
            float r4 = r4 * r11
            r38 = r0[r22]
            float r9 = r9 * r38
            float r9 = r9 + r4
            r4 = r0[r30]
            float r13 = r13 * r4
            float r13 = r13 + r9
            r9 = r0[r7]
            float r17 = r17 * r9
            float r17 = r17 + r13
            float r14 = r14 * r11
            float r21 = r21 * r38
            float r21 = r21 + r14
            float r23 = r23 * r4
            float r23 = r23 + r21
            float r25 = r25 * r9
            float r25 = r25 + r23
            float r24 = r24 * r11
            float r29 = r29 * r38
            float r29 = r29 + r24
            float r31 = r31 * r4
            float r31 = r31 + r29
            float r33 = r33 * r9
            float r33 = r33 + r31
            float r11 = r11 * r32
            float r38 = r38 * r36
            float r38 = r38 + r11
            float r4 = r4 * r37
            float r4 = r4 + r38
            float r9 = r9 * r1
            float r9 = r9 + r4
            r0[r2] = r18
            r0[r6] = r26
            r0[r5] = r34
            r0[r10] = r15
            r0[r8] = r42
            r0[r20] = r43
            r0[r28] = r44
            r0[r35] = r40
            r0[r12] = r46
            r0[r19] = r47
            r0[r27] = r48
            r0[r3] = r41
            r0[r16] = r17
            r0[r22] = r25
            r0[r30] = r33
            r0[r7] = r9
            return
    }

    public static final void f(float[] r8, float r9, float r10) {
            int r0 = r8.length
            r1 = 16
            if (r0 >= r1) goto L6
            return
        L6:
            r0 = 0
            r0 = r8[r0]
            float r0 = r0 * r9
            r1 = 4
            r1 = r8[r1]
            float r1 = r1 * r10
            float r1 = r1 + r0
            r0 = 8
            r0 = r8[r0]
            r2 = 0
            float r0 = r0 * r2
            float r0 = r0 + r1
            r1 = 12
            r3 = r8[r1]
            float r0 = r0 + r3
            r3 = 1
            r3 = r8[r3]
            float r3 = r3 * r9
            r4 = 5
            r4 = r8[r4]
            float r4 = r4 * r10
            float r4 = r4 + r3
            r3 = 9
            r3 = r8[r3]
            float r3 = r3 * r2
            float r3 = r3 + r4
            r4 = 13
            r5 = r8[r4]
            float r3 = r3 + r5
            r5 = 2
            r5 = r8[r5]
            float r5 = r5 * r9
            r6 = 6
            r6 = r8[r6]
            float r6 = r6 * r10
            float r6 = r6 + r5
            r5 = 10
            r5 = r8[r5]
            float r5 = r5 * r2
            float r5 = r5 + r6
            r6 = 14
            r7 = r8[r6]
            float r5 = r5 + r7
            r7 = 3
            r7 = r8[r7]
            float r7 = r7 * r9
            r9 = 7
            r9 = r8[r9]
            float r9 = r9 * r10
            float r9 = r9 + r7
            r10 = 11
            r10 = r8[r10]
            float r10 = r10 * r2
            float r10 = r10 + r9
            r9 = 15
            r2 = r8[r9]
            float r10 = r10 + r2
            r8[r1] = r0
            r8[r4] = r3
            r8[r6] = r5
            r8[r9] = r10
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.v24
            if (r0 != 0) goto L5
            goto L11
        L5:
            v24 r2 = (defpackage.v24) r2
            float[] r2 = r2.a
            float[] r1 = r1.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            float[] r0 = r0.a
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n            |"
            r0.<init>(r1)
            r1 = 0
            float[] r4 = r4.a
            r1 = r4[r1]
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            r2 = 1
            r2 = r4[r2]
            r0.append(r2)
            r0.append(r1)
            r2 = 2
            r2 = r4[r2]
            r0.append(r2)
            r0.append(r1)
            r2 = 3
            r2 = r4[r2]
            r0.append(r2)
            java.lang.String r2 = "|\n            |"
            r0.append(r2)
            r3 = 4
            r3 = r4[r3]
            r0.append(r3)
            r0.append(r1)
            r3 = 5
            r3 = r4[r3]
            r0.append(r3)
            r0.append(r1)
            r3 = 6
            r3 = r4[r3]
            r0.append(r3)
            r0.append(r1)
            r3 = 7
            r3 = r4[r3]
            r0.append(r3)
            r0.append(r2)
            r3 = 8
            r3 = r4[r3]
            r0.append(r3)
            r0.append(r1)
            r3 = 9
            r3 = r4[r3]
            r0.append(r3)
            r0.append(r1)
            r3 = 10
            r3 = r4[r3]
            r0.append(r3)
            r0.append(r1)
            r3 = 11
            r3 = r4[r3]
            r0.append(r3)
            r0.append(r2)
            r2 = 12
            r2 = r4[r2]
            r0.append(r2)
            r0.append(r1)
            r2 = 13
            r2 = r4[r2]
            r0.append(r2)
            r0.append(r1)
            r2 = 14
            r2 = r4[r2]
            r0.append(r2)
            r0.append(r1)
            r1 = 15
            r4 = r4[r1]
            r0.append(r4)
            java.lang.String r4 = "|\n        "
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = defpackage.rs6.R(r4)
            return r4
    }
}
