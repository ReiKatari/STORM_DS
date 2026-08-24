package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kb2  reason: default package */
/* loaded from: classes.dex */
public final class kb2 {
    public final android.net.Uri a;
    public final java.lang.String b;
    public final long c;
    public final java.util.Map d;

    public kb2(android.net.Uri r1, java.lang.String r2, long r3, java.util.Map r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            return
    }

    public final defpackage.lw5 a() {
            r13 = this;
            android.net.Uri r0 = r13.a
            java.lang.String r2 = r0.toString()
            r2.getClass()
            java.util.Map r0 = r13.d
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ht0.v0(r0, r1)
            r6.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            jb2 r1 = (defpackage.jb2) r1
            iw5 r7 = new iw5
            android.net.Uri r3 = r1.a
            java.lang.String r8 = r3.toString()
            r8.getClass()
            long r9 = r1.b
            long r11 = r1.c
            r7.<init>(r8, r9, r11)
            r6.add(r7)
            goto L20
        L42:
            lw5 r1 = new lw5
            java.lang.String r3 = r13.b
            long r4 = r13.c
            r1.<init>(r2, r3, r4, r6)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L35
        L3:
            boolean r0 = r5 instanceof defpackage.kb2
            if (r0 != 0) goto L8
            goto L33
        L8:
            kb2 r5 = (defpackage.kb2) r5
            android.net.Uri r0 = r4.a
            android.net.Uri r1 = r5.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L33
        L15:
            java.lang.String r0 = r4.b
            java.lang.String r1 = r5.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L33
        L20:
            long r0 = r4.c
            long r2 = r5.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L29
            goto L33
        L29:
            java.util.Map r4 = r4.d
            java.util.Map r5 = r5.d
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L35
        L33:
            r4 = 0
            return r4
        L35:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            android.net.Uri r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.util.Map r4 = r4.d
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DirectoryCacheState(directoryUri="
            r0.<init>(r1)
            android.net.Uri r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", hash="
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", lastScanned="
            r0.append(r1)
            long r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", files="
            r0.append(r1)
            java.util.Map r3 = r3.d
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
