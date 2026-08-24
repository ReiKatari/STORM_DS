package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zn0  reason: default package */
/* loaded from: classes.dex */
public final class zn0 {
    public final defpackage.yn0 a;
    public final float b;
    public final java.lang.String c;

    public zn0(defpackage.yn0 r1, float r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
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
            boolean r1 = r5 instanceof defpackage.zn0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            zn0 r5 = (defpackage.zn0) r5
            yn0 r1 = r4.a
            yn0 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            float r1 = r4.b
            float r3 = r5.b
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L1e
            return r2
        L1e:
            java.lang.String r4 = r4.c
            java.lang.String r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            yn0 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.b
            int r0 = defpackage.xg6.a(r2, r0, r1)
            java.lang.String r3 = r3.c
            if (r3 != 0) goto L15
            r3 = 0
            goto L19
        L15:
            int r3 = r3.hashCode()
        L19:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CheatImportProgress(status="
            r0.<init>(r1)
            yn0 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            float r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", ongoingItemName="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.c
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}
