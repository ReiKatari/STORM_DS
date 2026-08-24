package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jz5  reason: default package */
/* loaded from: classes.dex */
public final class jz5 {
    public final defpackage.lz5 a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.util.LinkedHashSet f;

    public jz5(defpackage.lz5 r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.util.LinkedHashSet r6) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4d
        L3:
            boolean r0 = r3 instanceof defpackage.jz5
            if (r0 != 0) goto L8
            goto L4b
        L8:
            jz5 r3 = (defpackage.jz5) r3
            lz5 r0 = r2.a
            lz5 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            java.lang.String r0 = r2.c
            java.lang.String r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            java.lang.String r0 = r2.d
            java.lang.String r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            java.lang.String r0 = r2.e
            java.lang.String r1 = r3.e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L4b
        L41:
            java.util.LinkedHashSet r2 = r2.f
            java.util.LinkedHashSet r3 = r3.f
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4d
        L4b:
            r2 = 0
            return r2
        L4d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            lz5 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.c
            if (r2 != 0) goto L15
            r2 = 0
            goto L19
        L15:
            int r2 = r2.hashCode()
        L19:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.e
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.util.LinkedHashSet r3 = r3.f
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DirectoryNode(root="
            r0.<init>(r1)
            lz5 r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", docId="
            r0.append(r1)
            java.lang.String r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", parentDocId="
            r0.append(r1)
            java.lang.String r1 = ", displayName="
            java.lang.String r2 = ", relativePath="
            java.lang.String r3 = r5.c
            java.lang.String r4 = r5.d
            defpackage.i61.B(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.e
            r0.append(r1)
            java.lang.String r1 = ", childDirectories="
            r0.append(r1)
            java.util.LinkedHashSet r5 = r5.f
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
