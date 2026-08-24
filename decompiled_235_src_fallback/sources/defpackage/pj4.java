package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pj4  reason: default package */
/* loaded from: classes.dex */
public final class pj4 {
    public final defpackage.ui4 a;
    public final java.util.List b;
    public final java.util.Map c;
    public final java.lang.Long d;
    public final java.lang.Long e;

    public /* synthetic */ pj4(defpackage.ui4 r7) {
            r6 = this;
            yt1 r2 = defpackage.yt1.A
            zt1 r3 = defpackage.zt1.A
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public pj4(defpackage.ui4 r1, java.util.List r2, java.util.Map r3, java.lang.Long r4, java.lang.Long r5) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final int a() {
            r3 = this;
            r0 = 0
            java.util.List r3 = r3.b
            if (r3 == 0) goto Lc
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lc
            return r0
        Lc:
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            ek4 r1 = (defpackage.ek4) r1
            gk4 r1 = r1.k
            gk4 r2 = defpackage.gk4.HARDCORE
            if (r1 != r2) goto L10
            int r0 = r0 + 1
            if (r0 < 0) goto L27
            goto L10
        L27:
            defpackage.hf.p0()
            r3 = 0
            throw r3
        L2c:
            return r0
    }

    public final int b() {
            r3 = this;
            r0 = 0
            java.util.List r3 = r3.b
            if (r3 == 0) goto Lc
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lc
            return r0
        Lc:
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            ek4 r1 = (defpackage.ek4) r1
            gk4 r1 = r1.k
            gk4 r2 = defpackage.gk4.SOFTCORE
            if (r1 != r2) goto L10
            int r0 = r0 + 1
            if (r0 < 0) goto L27
            goto L10
        L27:
            defpackage.hf.p0()
            r3 = 0
            throw r3
        L2c:
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.pj4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pj4 r5 = (defpackage.pj4) r5
            ui4 r1 = r4.a
            ui4 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.List r1 = r4.b
            java.util.List r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.util.Map r1 = r4.c
            java.util.Map r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.Long r1 = r4.d
            java.lang.Long r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.Long r4 = r4.e
            java.lang.Long r5 = r5.e
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L3f
            return r2
        L3f:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            ui4 r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r4.b
            int r0 = defpackage.i61.b(r0, r2, r1)
            java.util.Map r2 = r4.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 0
            java.lang.Long r3 = r4.d
            if (r3 != 0) goto L1e
            r3 = r0
            goto L22
        L1e:
            int r3 = r3.hashCode()
        L22:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.Long r4 = r4.e
            if (r4 != 0) goto L29
            goto L2d
        L29:
            int r0 = r4.hashCode()
        L2d:
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OfflineLedgerStatus(integrity="
            r0.<init>(r1)
            ui4 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", pendingUnlocks="
            r0.append(r1)
            java.util.List r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", sessions="
            r0.append(r1)
            java.util.Map r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", ledgerExpiresAtEpochMs="
            r0.append(r1)
            java.lang.Long r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", ledgerExpiresInMs="
            r0.append(r1)
            java.lang.Long r2 = r2.e
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
