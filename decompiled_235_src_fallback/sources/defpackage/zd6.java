package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd6  reason: default package */
/* loaded from: classes.dex */
public final class zd6 {
    public final long a;
    public final java.lang.String b;
    public final boolean c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;

    public zd6(long r1, java.lang.String r3, boolean r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r0 = this;
            r3.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.g = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L52
        L3:
            boolean r0 = r5 instanceof defpackage.zd6
            if (r0 != 0) goto L8
            goto L50
        L8:
            zd6 r5 = (defpackage.zd6) r5
            long r0 = r4.a
            long r2 = r5.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L50
        L13:
            java.lang.String r0 = r4.b
            java.lang.String r1 = r5.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L1e
            goto L50
        L1e:
            boolean r0 = r4.c
            boolean r1 = r5.c
            if (r0 == r1) goto L25
            goto L50
        L25:
            java.lang.String r0 = r4.d
            java.lang.String r1 = r5.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L30
            goto L50
        L30:
            java.lang.String r0 = r4.e
            java.lang.String r1 = r5.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L3b
            goto L50
        L3b:
            java.lang.String r0 = r4.f
            java.lang.String r1 = r5.f
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L46
            goto L50
        L46:
            java.lang.String r4 = r4.g
            java.lang.String r5 = r5.g
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L52
        L50:
            r4 = 0
            return r4
        L52:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r2 = r3.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r2 = r3.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.e
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.f
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r3 = r3.g
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Entry(timestampMillis="
            r0.<init>(r1)
            long r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", backend="
            r0.append(r1)
            java.lang.String r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", succeeded="
            r0.append(r1)
            boolean r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", presetPath="
            r0.append(r1)
            java.lang.String r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", sourceSize="
            java.lang.String r2 = ", outputSize="
            java.lang.String r3 = r5.e
            java.lang.String r4 = r5.f
            defpackage.i61.B(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", reason="
            r0.append(r1)
            java.lang.String r5 = r5.g
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
