package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vb7  reason: default package */
/* loaded from: classes.dex */
final class vb7 extends defpackage.e74 {
    public final defpackage.pq3 a;

    public vb7(defpackage.pq3 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            wb7 r0 = new wb7
            r0.<init>()
            pq3 r1 = r1.a
            r0.k0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.vb7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            vb7 r4 = (defpackage.vb7) r4
            pq3 r3 = r3.a
            pq3 r4 = r4.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r1) {
            r0 = this;
            wb7 r1 = (defpackage.wb7) r1
            pq3 r0 = r0.a
            r1.k0 = r0
            return
    }

    public final int hashCode() {
            r0 = this;
            pq3 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TraversablePrefetchStateModifierElement(prefetchState="
            r0.<init>(r1)
            pq3 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
