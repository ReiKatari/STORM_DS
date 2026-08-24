package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ac4  reason: default package */
/* loaded from: classes.dex */
public final class ac4 extends defpackage.qo7 {
    public final java.util.LinkedHashMap b;

    public ac4() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.b = r0
            return
    }

    @Override // defpackage.qo7
    public final void d() {
            r2 = this;
            java.util.LinkedHashMap r2 = r2.b
            java.util.Collection r0 = r2.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            ap7 r1 = (defpackage.ap7) r1
            r1.a()
            goto La
        L1a:
            r2.clear()
            return
    }

    public final java.lang.String toString() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NavControllerViewModel{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r7)
            r2 = 16
            defpackage.g04.y(r2)
            long r3 = (long) r1
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            java.lang.String r1 = defpackage.jx2.R(r2, r3)
            r0.append(r1)
            java.lang.String r1 = "} ViewModelStores ("
            r0.append(r1)
            java.util.LinkedHashMap r7 = r7.b
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L2d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L2d
            java.lang.String r1 = ", "
            r0.append(r1)
            goto L2d
        L48:
            r7 = 41
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }
}
