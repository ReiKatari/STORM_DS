package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y16  reason: default package */
/* loaded from: classes.dex */
public final class y16 implements defpackage.ke6 {
    public final defpackage.g61 a;
    public final defpackage.g61 b;
    public final defpackage.g61 c;
    public final defpackage.g61 d;

    public y16(defpackage.g61 r1, defpackage.g61 r2, defpackage.g61 r3, defpackage.g61 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // defpackage.ke6
    public final defpackage.mp2 a(long r29, defpackage.kk3 r31, defpackage.qh1 r32) {
            r28 = this;
            r0 = r28
            r1 = r29
            r3 = r31
            r4 = r32
            g61 r5 = r0.a
            float r5 = r5.a(r1, r4)
            g61 r6 = r0.b
            float r6 = r6.a(r1, r4)
            g61 r7 = r0.c
            float r7 = r7.a(r1, r4)
            g61 r0 = r0.d
            float r0 = r0.a(r1, r4)
            float r4 = defpackage.xi6.d(r1)
            float r8 = r5 + r0
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 <= 0) goto L2e
            float r8 = r4 / r8
            float r5 = r5 * r8
            float r0 = r0 * r8
        L2e:
            float r8 = r6 + r7
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 <= 0) goto L37
            float r4 = r4 / r8
            float r6 = r6 * r4
            float r7 = r7 * r4
        L37:
            r4 = 0
            int r8 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r8 < 0) goto L49
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 < 0) goto L49
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 < 0) goto L49
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 < 0) goto L49
            goto L77
        L49:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Corner size in Px can't be negative(topStart = "
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r9 = ", topEnd = "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ", bottomEnd = "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r9 = ", bottomStart = "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r9 = ")!"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            defpackage.s53.a(r8)
        L77:
            float r8 = r5 + r6
            float r8 = r8 + r7
            float r8 = r8 + r0
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r8 = 0
            if (r4 != 0) goto L8b
            qo4 r0 = new qo4
            of5 r1 = defpackage.kj2.b(r8, r1)
            r0.<init>(r1)
            return r0
        L8b:
            ro4 r4 = new ro4
            of5 r1 = defpackage.kj2.b(r8, r1)
            kk3 r2 = defpackage.kk3.Ltr
            if (r3 != r2) goto L97
            r8 = r5
            goto L98
        L97:
            r8 = r6
        L98:
            int r9 = java.lang.Float.floatToRawIntBits(r8)
            long r9 = (long) r9
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r11 = (long) r8
            r8 = 32
            long r9 = r9 << r8
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r13
            long r20 = r9 | r11
            if (r3 != r2) goto Lb0
            r5 = r6
        Lb0:
            int r6 = java.lang.Float.floatToRawIntBits(r5)
            long r9 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            long r9 = r9 << r8
            long r5 = r5 & r13
            long r22 = r9 | r5
            if (r3 != r2) goto Lc2
            r5 = r7
            goto Lc3
        Lc2:
            r5 = r0
        Lc3:
            int r6 = java.lang.Float.floatToRawIntBits(r5)
            long r9 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            long r9 = r9 << r8
            long r5 = r5 & r13
            long r24 = r9 | r5
            if (r3 != r2) goto Ld4
            goto Ld5
        Ld4:
            r0 = r7
        Ld5:
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r2
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            long r2 = r2 << r8
            long r5 = r5 & r13
            long r26 = r2 | r5
            u16 r15 = new u16
            float r0 = r1.a
            float r2 = r1.b
            float r3 = r1.c
            float r1 = r1.d
            r16 = r0
            r19 = r1
            r17 = r2
            r18 = r3
            r15.<init>(r16, r17, r18, r19, r20, r22, r24, r26)
            r4.<init>(r15)
            return r4
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof defpackage.y16
            if (r0 != 0) goto L8
            goto L35
        L8:
            y16 r3 = (defpackage.y16) r3
            g61 r0 = r3.a
            g61 r1 = r2.a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L35
        L15:
            g61 r0 = r2.b
            g61 r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            g61 r0 = r2.c
            g61 r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            g61 r2 = r2.d
            g61 r3 = r3.d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            g61 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            g61 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            g61 r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            g61 r2 = r2.d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RoundedCornerShape(topStart = "
            r0.<init>(r1)
            g61 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", topEnd = "
            r0.append(r1)
            g61 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", bottomEnd = "
            r0.append(r1)
            g61 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", bottomStart = "
            r0.append(r1)
            g61 r2 = r2.d
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
