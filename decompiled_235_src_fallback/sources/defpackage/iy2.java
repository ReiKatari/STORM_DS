package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iy2  reason: default package */
/* loaded from: classes.dex */
public final class iy2 implements defpackage.hm3 {
    public final defpackage.i27 a;
    public final int b;
    public final defpackage.p97 c;
    public final defpackage.on2 d;

    public iy2(defpackage.i27 r1, int r2, defpackage.p97 r3, defpackage.on2 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // defpackage.hm3
    public final defpackage.f34 c(defpackage.g34 r10, defpackage.x24 r11, long r12) {
            r9 = this;
            int r0 = defpackage.q21.g(r12)
            int r0 = r11.u(r0)
            int r1 = defpackage.q21.h(r12)
            if (r0 >= r1) goto L10
            r2 = r12
            goto L1d
        L10:
            r7 = 0
            r8 = 13
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r2 = r12
            long r12 = defpackage.q21.a(r2, r4, r5, r6, r7, r8)
        L1d:
            dx4 r11 = r11.y(r12)
            int r12 = r11.A
            int r13 = defpackage.q21.h(r2)
            int r4 = java.lang.Math.min(r12, r13)
            int r12 = r11.B
            gi1 r0 = new gi1
            r5 = 1
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            zt1 r9 = defpackage.zt1.A
            f34 r9 = r2.K(r4, r12, r9, r0)
            return r9
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L3
            goto L2f
        L3:
            boolean r0 = r4 instanceof defpackage.iy2
            r1 = 0
            if (r0 != 0) goto L9
            goto L2e
        L9:
            iy2 r4 = (defpackage.iy2) r4
            i27 r0 = r3.a
            i27 r2 = r4.a
            if (r0 == r2) goto L12
            return r1
        L12:
            int r0 = r3.b
            int r2 = r4.b
            if (r0 == r2) goto L19
            goto L2e
        L19:
            p97 r0 = r3.c
            p97 r2 = r4.c
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L24
            goto L2e
        L24:
            on2 r3 = r3.d
            on2 r4 = r4.d
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L2f
        L2e:
            return r1
        L2f:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            i27 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            p97 r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            on2 r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HorizontalScrollLayoutModifier(scrollerPosition="
            r0.<init>(r1)
            i27 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", cursorOffset="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", transformedText="
            r0.append(r1)
            p97 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", textLayoutResultProvider="
            r0.append(r1)
            on2 r2 = r2.d
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
