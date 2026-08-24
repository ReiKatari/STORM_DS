package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n04  reason: default package */
/* loaded from: classes.dex */
public final class n04 implements java.util.Map.Entry, defpackage.bg3 {
    public final defpackage.p04 A;
    public final int B;
    public final int L;

    public n04(defpackage.p04 r1, int r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            int r1 = r1.d0
            r0.L = r1
            return
    }

    public final void a() {
            r1 = this;
            p04 r0 = r1.A
            int r0 = r0.d0
            int r1 = r1.L
            if (r0 != r1) goto L9
            return
        L9:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            java.lang.String r0 = "The backing map has been modified after this entry was obtained."
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L24
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r1 = r2.getKey()
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L24
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r2 = r2.getValue()
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 == 0) goto L24
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            r1.a()
            p04 r0 = r1.A
            java.lang.Object[] r0 = r0.A
            int r1 = r1.B
            r1 = r0[r1]
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            r1.a()
            p04 r0 = r1.A
            java.lang.Object[] r0 = r0.B
            r0.getClass()
            int r1 = r1.B
            r1 = r0[r1]
            return r1
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.getKey()
            r1 = 0
            if (r0 == 0) goto Lc
            int r0 = r0.hashCode()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L17
            int r1 = r2.hashCode()
        L17:
            r2 = r0 ^ r1
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r3) {
            r2 = this;
            r2.a()
            p04 r0 = r2.A
            r0.c()
            java.lang.Object[] r1 = r0.B
            if (r1 == 0) goto Ld
            goto L16
        Ld:
            java.lang.Object[] r1 = r0.A
            int r1 = r1.length
            if (r1 < 0) goto L1d
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.B = r1
        L16:
            int r2 = r2.B
            r0 = r1[r2]
            r1[r2] = r3
            return r0
        L1d:
            java.lang.String r2 = "capacity must be non-negative."
            defpackage.i.h(r2)
            r2 = 0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.getKey()
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
