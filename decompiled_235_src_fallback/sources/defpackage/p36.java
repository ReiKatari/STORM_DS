package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p36  reason: default package */
/* loaded from: classes.dex */
public final class p36 implements java.util.Map.Entry {
    public final java.lang.Object A;
    public final java.lang.Object B;
    public defpackage.p36 L;
    public defpackage.p36 R;

    public p36(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L1e
        L3:
            boolean r0 = r3 instanceof defpackage.p36
            if (r0 != 0) goto L8
            goto L20
        L8:
            p36 r3 = (defpackage.p36) r3
            java.lang.Object r0 = r2.A
            java.lang.Object r1 = r3.A
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            java.lang.Object r2 = r2.B
            java.lang.Object r3 = r3.B
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L20
        L1e:
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
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
            r1 = this;
            java.lang.Object r0 = r1.A
            int r0 = r0.hashCode()
            java.lang.Object r1 = r1.B
            int r1 = r1.hashCode()
            r1 = r1 ^ r0
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "An entry modification is not supported"
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.A
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r2 = r2.B
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
