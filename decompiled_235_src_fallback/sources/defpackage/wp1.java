package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp1  reason: default package */
/* loaded from: classes.dex */
public final class wp1 implements defpackage.f05 {
    public final long a;
    public final defpackage.qh1 b;
    public final defpackage.eo2 c;

    public wp1(long r1, defpackage.qh1 r3, defpackage.eo2 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            return
    }

    @Override // defpackage.f05
    public final long a(defpackage.m93 r17, long r18, defpackage.kk3 r20, long r21) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r20
            r3 = 1111490560(0x42400000, float:48.0)
            qh1 r4 = r0.b
            int r3 = r4.r0(r3)
            long r5 = r0.a
            r7 = 32
            long r8 = r5 >> r7
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            int r8 = r4.r0(r8)
            kk3 r9 = defpackage.kk3.Ltr
            if (r2 != r9) goto L23
            r10 = 1
            goto L24
        L23:
            r10 = -1
        L24:
            int r8 = r8 * r10
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r10
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r4 = r4.r0(r5)
            int r5 = r1.a
            int r6 = r1.c
            int r5 = r5 + r8
            long r12 = r21 >> r7
            int r12 = (int) r12
            int r13 = r6 - r12
            int r13 = r13 + r8
            long r14 = r18 >> r7
            int r8 = (int) r14
            int r14 = r8 - r12
            r15 = 0
            if (r2 != r9) goto L63
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            int r6 = r1.a
            if (r6 < 0) goto L54
            goto L55
        L54:
            r14 = r15
        L55:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            java.lang.Integer[] r2 = new java.lang.Integer[]{r2, r5, r6}
            ev r5 = new ev
            r5.<init>(r2, r15)
            goto L7b
        L63:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            if (r6 > r8) goto L6e
            r14 = r15
        L6e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            java.lang.Integer[] r2 = new java.lang.Integer[]{r2, r5, r6}
            ev r5 = new ev
            r5.<init>(r2, r15)
        L7b:
            java.util.Iterator r2 = r5.iterator()
        L7f:
            boolean r5 = r2.hasNext()
            r6 = 0
            if (r5 == 0) goto L97
            java.lang.Object r5 = r2.next()
            r9 = r5
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 < 0) goto L7f
            int r9 = r9 + r12
            if (r9 > r8) goto L7f
            goto L98
        L97:
            r5 = r6
        L98:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto La0
            int r13 = r5.intValue()
        La0:
            int r2 = r1.d
            int r2 = r2 + r4
            int r2 = java.lang.Math.max(r2, r3)
            int r5 = r1.b
            long r8 = r21 & r10
            int r8 = (int) r8
            int r9 = r5 - r8
            int r9 = r9 + r4
            int r14 = r8 / 2
            int r5 = r5 - r14
            int r5 = r5 + r4
            long r14 = r18 & r10
            int r4 = (int) r14
            int r14 = r4 - r8
            int r14 = r14 - r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Integer[] r2 = new java.lang.Integer[]{r2, r15, r5, r14}
            w0 r5 = new w0
            r5.<init>(r2)
        Ld2:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto Leb
            java.lang.Object r2 = r5.next()
            r14 = r2
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            if (r14 < r3) goto Ld2
            int r14 = r14 + r8
            int r15 = r4 - r3
            if (r14 > r15) goto Ld2
            r6 = r2
        Leb:
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto Lf3
            int r9 = r6.intValue()
        Lf3:
            m93 r2 = new m93
            int r12 = r12 + r13
            int r8 = r8 + r9
            r2.<init>(r13, r9, r12, r8)
            eo2 r0 = r0.c
            r0.o(r1, r2)
            long r0 = (long) r13
            long r0 = r0 << r7
            long r2 = (long) r9
            long r2 = r2 & r10
            long r0 = r0 | r2
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.wp1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wp1 r8 = (defpackage.wp1) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2b
            qh1 r1 = r7.b
            qh1 r3 = r8.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1f
            return r2
        L1f:
            eo2 r7 = r7.c
            eo2 r8 = r8.c
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L2a
            return r2
        L2a:
            return r0
        L2b:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            qh1 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            eo2 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DropdownMenuPositionProvider(contentOffset="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r1 = defpackage.rm1.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", density="
            r0.append(r1)
            qh1 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", onPositionCalculated="
            r0.append(r1)
            eo2 r3 = r3.c
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
