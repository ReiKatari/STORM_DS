package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tc5  reason: default package */
/* loaded from: classes.dex */
public final class tc5 implements defpackage.xc5 {
    public final long a;
    public final defpackage.lc5 b;
    public final defpackage.mc5 c;

    public tc5(long r1, defpackage.lc5 r3, defpackage.mc5 r4) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.tc5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            tc5 r8 = (defpackage.tc5) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            lc5 r1 = r7.b
            lc5 r3 = r8.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            mc5 r7 = r7.c
            mc5 r8 = r8.c
            if (r7 == r8) goto L27
            return r2
        L27:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            lc5 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            mc5 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExitPrompt(requestId="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", pending="
            r0.append(r1)
            lc5 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", exitContext="
            r0.append(r1)
            mc5 r3 = r3.c
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
