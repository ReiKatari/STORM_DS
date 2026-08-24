package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kw5  reason: default package */
/* loaded from: classes.dex */
public final class kw5 {
    public final android.net.Uri a;
    public final java.lang.Long b;
    public final defpackage.jw5 c;

    public kw5(android.net.Uri r1, java.lang.Long r2, defpackage.jw5 r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
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
            boolean r1 = r5 instanceof defpackage.kw5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kw5 r5 = (defpackage.kw5) r5
            android.net.Uri r1 = r4.a
            android.net.Uri r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Long r1 = r4.b
            java.lang.Long r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            jw5 r4 = r4.c
            jw5 r5 = r5.c
            if (r4 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            android.net.Uri r0 = r2.a
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
            java.lang.String r1 = "RomDirectoryScanStatus(directoryUri="
            r0.<init>(r1)
            android.net.Uri r1 = r2.a
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
