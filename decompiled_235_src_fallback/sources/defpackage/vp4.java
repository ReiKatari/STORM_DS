package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vp4  reason: default package */
/* loaded from: classes.dex */
public final class vp4 {
    public final long a;
    public final defpackage.pq4 b;

    public vp4() {
            r4 = this;
            r0 = 4284900966(0xff666666, double:2.117022363E-314)
            long r0 = defpackage.hv.c(r0)
            r2 = 3
            r3 = 0
            pq4 r2 = defpackage.ge7.i(r2, r3)
            r4.<init>()
            r4.a = r0
            r4.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L30
        L3:
            if (r5 == 0) goto La
            java.lang.Class r0 = r5.getClass()
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.Class<vp4> r1 = defpackage.vp4.class
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L14
            goto L2e
        L14:
            r5.getClass()
            vp4 r5 = (defpackage.vp4) r5
            long r0 = r4.a
            long r2 = r5.a
            boolean r0 = defpackage.kt0.d(r0, r2)
            if (r0 != 0) goto L24
            goto L2e
        L24:
            pq4 r4 = r4.b
            pq4 r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L30
        L2e:
            r4 = 0
            return r4
        L30:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r2 = this;
            int r0 = defpackage.kt0.i
            long r0 = r2.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            pq4 r2 = r2.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OverscrollConfiguration(glowColor="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r1 = defpackage.kt0.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", drawPadding="
            r0.append(r1)
            pq4 r3 = r3.b
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
