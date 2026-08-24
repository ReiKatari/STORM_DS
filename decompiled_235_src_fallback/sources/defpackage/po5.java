package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: po5  reason: default package */
/* loaded from: classes.dex */
public final class po5 {
    public final java.lang.String a;
    public final defpackage.hp5 b;
    public final int c;
    public final long d;
    public final java.util.Map e;
    public final boolean f;

    public po5(java.lang.String r1, defpackage.hp5 r2, int r3, long r4, java.util.Map r6, boolean r7) {
            r0 = this;
            r2.getClass()
            r6.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r6
            r0.f = r7
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.po5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            po5 r8 = (defpackage.po5) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            hp5 r1 = r7.b
            hp5 r3 = r8.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r7.c
            int r3 = r8.c
            if (r1 == r3) goto L25
            return r2
        L25:
            long r3 = r7.d
            long r5 = r8.d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2e
            return r2
        L2e:
            java.util.Map r1 = r7.e
            java.util.Map r3 = r8.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L39
            return r2
        L39:
            boolean r7 = r7.f
            boolean r8 = r8.f
            if (r7 == r8) goto L40
            return r2
        L40:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            hp5 r2 = r4.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r4.c
            int r0 = defpackage.lb1.a(r0, r2, r1)
            long r2 = r4.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.util.Map r2 = r4.e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r4 = r4.f
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r2
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RetroArchShaderConfiguration(presetPath="
            r0.<init>(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", sourceResolution="
            r0.append(r1)
            hp5 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", passCount="
            r0.append(r1)
            int r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", sourceBytes="
            r0.append(r1)
            long r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", parameterOverrides="
            r0.append(r1)
            java.util.Map r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", clearHistory="
            r0.append(r1)
            boolean r3 = r3.f
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
