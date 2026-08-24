package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cl1  reason: default package */
/* loaded from: classes.dex */
public final class cl1 {
    public final defpackage.bl1 a;

    static {
            cl1 r0 = new cl1
            java.lang.String r1 = ""
            r2 = 0
            r0.<init>(r1, r2, r2)
            return
    }

    public cl1(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            bl1 r0 = new bl1
            r0.<init>(r2, r3, r4)
            r1.a = r0
            return
    }

    public static defpackage.cl1 a(int r6, int r7, boolean r8, int r9, int r10, int r11, int r12) {
            java.lang.String r0 = " Z"
            java.lang.String r1 = ","
            if (r8 == 0) goto L2e
            int r8 = r6 / 2
            int r9 = r7 / 2
            java.lang.String r10 = "M0,"
            java.lang.String r11 = " A"
            java.lang.StringBuilder r10 = defpackage.i61.q(r9, r8, r10, r11, r1)
            java.lang.String r12 = " 0 1,1 "
            defpackage.lb1.x(r10, r9, r12, r6, r1)
            defpackage.lb1.x(r10, r9, r11, r8, r1)
            r10.append(r9)
            java.lang.String r8 = " 0 1,1 0,"
            r10.append(r8)
            r10.append(r9)
            r10.append(r0)
            java.lang.String r8 = r10.toString()
            goto Lf3
        L2e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "M "
            r8.<init>(r2)
            int r2 = r6 / 2
            int r3 = r7 / 2
            int r2 = java.lang.Math.min(r2, r3)
            int r9 = java.lang.Math.min(r2, r9)
            int r10 = java.lang.Math.min(r2, r10)
            int r11 = java.lang.Math.min(r2, r11)
            int r12 = java.lang.Math.min(r2, r12)
            r8.append(r9)
            java.lang.String r2 = ",0 L "
            r8.append(r2)
            int r2 = r6 - r10
            r8.append(r2)
            java.lang.String r2 = ",0"
            r8.append(r2)
            java.lang.String r3 = " 0 0,1 "
            java.lang.String r4 = " A "
            if (r10 <= 0) goto L7d
            r8.append(r4)
            r8.append(r10)
            r8.append(r1)
            r8.append(r10)
            r8.append(r3)
            r8.append(r6)
            r8.append(r1)
            r8.append(r10)
        L7d:
            java.lang.String r10 = " L "
            r8.append(r10)
            r8.append(r6)
            r8.append(r1)
            int r5 = r7 - r11
            r8.append(r5)
            if (r11 <= 0) goto La9
            r8.append(r4)
            r8.append(r11)
            r8.append(r1)
            r8.append(r11)
            r8.append(r3)
            int r11 = r6 - r11
            r8.append(r11)
            r8.append(r1)
            r8.append(r7)
        La9:
            r8.append(r10)
            r8.append(r12)
            r8.append(r1)
            r8.append(r7)
            if (r12 <= 0) goto Lcd
            r8.append(r4)
            r8.append(r12)
            r8.append(r1)
            r8.append(r12)
            java.lang.String r10 = " 0 0,1 0,"
            r8.append(r10)
            int r10 = r7 - r12
            r8.append(r10)
        Lcd:
            if (r9 <= 0) goto Lec
            java.lang.String r10 = " L 0,"
            r8.append(r10)
            r8.append(r9)
            r8.append(r4)
            r8.append(r9)
            r8.append(r1)
            r8.append(r9)
            r8.append(r3)
            r8.append(r9)
            r8.append(r2)
        Lec:
            r8.append(r0)
            java.lang.String r8 = r8.toString()
        Lf3:
            cl1 r9 = new cl1
            r9.<init>(r8, r6, r7)
            return r9
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.cl1
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            cl1 r2 = (defpackage.cl1) r2
            bl1 r1 = r1.a
            bl1 r2 = r2.a
            boolean r1 = r1.equals(r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            bl1 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            bl1 r0 = r0.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
