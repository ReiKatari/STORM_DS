package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zo5  reason: default package */
/* loaded from: classes.dex */
public final class zo5 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final java.lang.String g;

    public zo5(java.lang.String r1, java.lang.String r2, long r3, long r5, long r7, int r9, java.lang.String r10) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            r0.e = r7
            r0.f = r9
            r0.g = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L4e
        L3:
            boolean r0 = r5 instanceof defpackage.zo5
            if (r0 != 0) goto L8
            goto L4c
        L8:
            zo5 r5 = (defpackage.zo5) r5
            java.lang.String r0 = r4.a
            java.lang.String r1 = r5.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4c
        L15:
            java.lang.String r0 = r4.b
            java.lang.String r1 = r5.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L4c
        L20:
            long r0 = r4.c
            long r2 = r5.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L29
            goto L4c
        L29:
            long r0 = r4.d
            long r2 = r5.d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L32
            goto L4c
        L32:
            long r0 = r4.e
            long r2 = r5.e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3b
            goto L4c
        L3b:
            int r0 = r4.f
            int r1 = r5.f
            if (r0 == r1) goto L42
            goto L4c
        L42:
            java.lang.String r4 = r4.g
            java.lang.String r5 = r5.g
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L4e
        L4c:
            r4 = 0
            return r4
        L4e:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.String r3 = r5.b
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            long r3 = r5.c
            int r0 = defpackage.i61.c(r3, r0, r1)
            long r3 = r5.d
            int r0 = defpackage.i61.c(r3, r0, r1)
            long r3 = r5.e
            int r0 = defpackage.i61.c(r3, r0, r1)
            int r3 = r5.f
            int r0 = defpackage.lb1.a(r3, r0, r1)
            java.lang.String r5 = r5.g
            if (r5 != 0) goto L33
            goto L37
        L33:
            int r2 = r5.hashCode()
        L37:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", remoteLastModified="
            java.lang.String r1 = ", remoteContentLength="
            java.lang.String r2 = "ShaderLibraryManifest(sourceUrl="
            java.lang.String r3 = r5.a
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
            long r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", installedAtMillis="
            java.lang.String r2 = ", installedBytes="
            long r3 = r5.d
            defpackage.xg6.B(r0, r1, r3, r2)
            long r1 = r5.e
            r0.append(r1)
            java.lang.String r1 = ", fileCount="
            r0.append(r1)
            int r1 = r5.f
            r0.append(r1)
            java.lang.String r1 = ", rootSubdirectory="
            r0.append(r1)
            java.lang.String r5 = r5.g
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
