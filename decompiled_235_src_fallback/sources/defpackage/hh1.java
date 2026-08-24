package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hh1  reason: default package */
/* loaded from: classes.dex */
public final class hh1 implements defpackage.ds1 {
    public final int a;
    public final int b;

    public hh1(int r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            if (r2 < 0) goto Ld
            if (r3 < 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r2 = " and "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " respectively."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.q53.a(r1)
        L2e:
            return
    }

    @Override // defpackage.ds1
    public final void a(defpackage.gs1 r5) {
            r4 = this;
            int r0 = r5.L
            java.lang.Object r1 = r5.Y
            m42 r1 = (defpackage.m42) r1
            int r2 = r4.b
            int r3 = r0 + r2
            r0 = r0 ^ r3
            r2 = r2 ^ r3
            r0 = r0 & r2
            if (r0 >= 0) goto L13
            int r3 = r1.b()
        L13:
            int r0 = r5.L
            int r1 = r1.b()
            int r1 = java.lang.Math.min(r3, r1)
            r5.a(r0, r1)
            int r0 = r5.B
            int r4 = r4.a
            int r1 = r0 - r4
            r4 = r4 ^ r0
            r0 = r0 ^ r1
            r4 = r4 & r0
            r0 = 0
            if (r4 >= 0) goto L2d
            r1 = r0
        L2d:
            int r4 = java.lang.Math.max(r0, r1)
            int r0 = r5.B
            r5.a(r4, r0)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.hh1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hh1 r5 = (defpackage.hh1) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L13
            return r2
        L13:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.a
            int r0 = r0 * 31
            int r1 = r1.b
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DeleteSurroundingTextCommand(lengthBeforeCursor="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", lengthAfterCursor="
            r0.append(r1)
            int r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
