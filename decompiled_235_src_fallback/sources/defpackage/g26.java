package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g26  reason: default package */
/* loaded from: classes.dex */
public final class g26 {
    public final defpackage.h26 a;
    public final defpackage.h26 b;
    public final java.lang.Throwable c;

    public /* synthetic */ g26(defpackage.h26 r2, java.lang.Throwable r3, int r4) {
            r1 = this;
            r4 = r4 & 4
            r0 = 0
            if (r4 == 0) goto L6
            r3 = r0
        L6:
            r1.<init>(r2, r0, r3)
            return
    }

    public g26(defpackage.h26 r1, defpackage.jz0 r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.g26
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g26 r5 = (defpackage.g26) r5
            h26 r1 = r4.a
            h26 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            h26 r1 = r4.b
            h26 r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Throwable r4 = r4.c
            java.lang.Throwable r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            h26 r0 = r3.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            h26 r2 = r3.b
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Throwable r3 = r3.c
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r3.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConnectResult(plan="
            r0.<init>(r1)
            h26 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", nextPlan="
            r0.append(r1)
            h26 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", throwable="
            r0.append(r1)
            java.lang.Throwable r2 = r2.c
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
