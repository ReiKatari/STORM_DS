package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v04  reason: default package */
/* loaded from: classes.dex */
public final class v04 implements java.util.Map.Entry, defpackage.zf3 {
    public final java.lang.Object A;
    public final java.lang.Object B;

    public v04(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.v04
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            v04 r5 = (defpackage.v04) r5
            java.lang.Object r1 = r4.A
            java.lang.Object r3 = r5.A
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Object r4 = r4.B
            java.lang.Object r5 = r5.B
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r0 = this;
            java.lang.Object r0 = r0.A
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r0 = this;
            java.lang.Object r0 = r0.B
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r2 = this;
            r0 = 0
            java.lang.Object r1 = r2.A
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.Object r2 = r2.B
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r0 = r2.hashCode()
        L16:
            int r1 = r1 + r0
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MapEntry(key="
            r0.<init>(r1)
            java.lang.Object r1 = r2.A
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            java.lang.Object r2 = r2.B
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
