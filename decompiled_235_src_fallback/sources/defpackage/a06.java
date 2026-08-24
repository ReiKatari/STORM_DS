package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a06  reason: default package */
/* loaded from: classes.dex */
public final class a06 {
    public final int a;
    public final int b;
    public final defpackage.zz5 c;

    public a06(int r1, int r2, defpackage.zz5 r3) {
            r0 = this;
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
            boolean r1 = r5 instanceof defpackage.a06
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a06 r5 = (defpackage.a06) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            zz5 r4 = r4.c
            zz5 r5 = r5.c
            if (r4 == r5) goto L21
            return r2
        L21:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            zz5 r3 = r3.c
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", size="
            java.lang.String r1 = ", type="
            int r2 = r5.a
            int r3 = r5.b
            java.lang.String r4 = "RequiredRomSection(offset="
            java.lang.StringBuilder r0 = defpackage.i61.q(r2, r3, r4, r0, r1)
            zz5 r5 = r5.c
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
