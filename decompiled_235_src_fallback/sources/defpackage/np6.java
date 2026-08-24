package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: np6  reason: default package */
/* loaded from: classes.dex */
public final class np6 {
    public final defpackage.oa a;
    public final defpackage.qb b;
    public final defpackage.xz c;
    public final defpackage.pd2 d;
    public final java.util.List e;
    public final java.util.List f;
    public final java.util.List g;
    public final java.lang.Boolean h;
    public final java.lang.Boolean i;
    public final java.lang.Boolean j;

    public np6(defpackage.oa r1, defpackage.qb r2, defpackage.xz r3, defpackage.pd2 r4, java.util.List r5, java.util.List r6, java.util.List r7, java.lang.Boolean r8, java.lang.Boolean r9, java.lang.Boolean r10) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.np6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            np6 r5 = (defpackage.np6) r5
            oa r1 = r4.a
            oa r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            qb r1 = r4.b
            qb r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            xz r1 = r4.c
            xz r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            pd2 r1 = r4.d
            pd2 r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.util.List r1 = r4.e
            java.util.List r3 = r5.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.util.List r1 = r4.f
            java.util.List r3 = r5.f
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.util.List r1 = r4.g
            java.util.List r3 = r5.g
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.Boolean r1 = r4.h
            java.lang.Boolean r3 = r5.h
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.lang.Boolean r1 = r4.i
            java.lang.Boolean r3 = r5.i
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.lang.Boolean r4 = r4.j
            java.lang.Boolean r5 = r5.j
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L7a
            return r2
        L7a:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            oa r1 = r3.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Ld
        L7:
            int r1 = r1.a
            int r1 = java.lang.Integer.hashCode(r1)
        Ld:
            int r1 = r1 * 31
            qb r2 = r3.b
            if (r2 != 0) goto L15
            r2 = r0
            goto L1b
        L15:
            int r2 = r2.a
            int r2 = java.lang.Integer.hashCode(r2)
        L1b:
            int r1 = r1 + r2
            int r1 = r1 * 31
            xz r2 = r3.c
            if (r2 != 0) goto L24
            r2 = r0
            goto L2a
        L24:
            int r2 = r2.a
            int r2 = java.lang.Integer.hashCode(r2)
        L2a:
            int r1 = r1 + r2
            int r1 = r1 * 31
            pd2 r2 = r3.d
            if (r2 != 0) goto L33
            r2 = r0
            goto L39
        L33:
            int r2 = r2.a
            int r2 = java.lang.Integer.hashCode(r2)
        L39:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.util.List r2 = r3.e
            if (r2 != 0) goto L42
            r2 = r0
            goto L46
        L42:
            int r2 = r2.hashCode()
        L46:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.util.List r2 = r3.f
            if (r2 != 0) goto L4f
            r2 = r0
            goto L53
        L4f:
            int r2 = r2.hashCode()
        L53:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.util.List r2 = r3.g
            if (r2 != 0) goto L5c
            r2 = r0
            goto L60
        L5c:
            int r2 = r2.hashCode()
        L60:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Boolean r2 = r3.h
            if (r2 != 0) goto L69
            r2 = r0
            goto L6d
        L69:
            int r2 = r2.hashCode()
        L6d:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Boolean r2 = r3.i
            if (r2 != 0) goto L76
            r2 = r0
            goto L7a
        L76:
            int r2 = r2.hashCode()
        L7a:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Boolean r3 = r3.j
            if (r3 != 0) goto L82
            goto L86
        L82:
            int r0 = r3.hashCode()
        L86:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "State3A(aeMode="
            r0.<init>(r1)
            oa r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", afMode="
            r0.append(r1)
            qb r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", awbMode="
            r0.append(r1)
            xz r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", flashMode="
            r0.append(r1)
            pd2 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", aeRegions="
            r0.append(r1)
            java.util.List r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", afRegions="
            r0.append(r1)
            java.util.List r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", awbRegions="
            r0.append(r1)
            java.util.List r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", aeLock="
            r0.append(r1)
            java.lang.Boolean r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", afLock="
            r0.append(r1)
            java.lang.Boolean r1 = r2.i
            r0.append(r1)
            java.lang.String r1 = ", awbLock="
            r0.append(r1)
            java.lang.Boolean r2 = r2.j
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
