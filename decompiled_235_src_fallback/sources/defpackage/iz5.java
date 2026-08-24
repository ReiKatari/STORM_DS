package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iz5  reason: default package */
/* loaded from: classes.dex */
public final class iz5 {
    public final java.lang.String a;
    public final java.lang.Long b;
    public final defpackage.jw5 c;

    public iz5(java.lang.String r1, java.lang.Long r2, defpackage.jw5 r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof defpackage.iz5
            if (r0 != 0) goto L8
            goto L26
        L8:
            iz5 r3 = (defpackage.iz5) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            java.lang.Long r0 = r2.b
            java.lang.Long r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            jw5 r2 = r2.c
            jw5 r3 = r3.c
            if (r2 == r3) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Long r1 = r2.b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            jw5 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DirectoryCacheStatusUi(directoryName="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", lastScanTimestamp="
            r0.append(r1)
            java.lang.Long r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", result="
            r0.append(r1)
            jw5 r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
