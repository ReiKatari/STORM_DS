package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs3  reason: default package */
/* loaded from: classes.dex */
public final class bs3 {
    public final defpackage.ls3 a;
    public final defpackage.as3 b;
    public final long c;

    public bs3(defpackage.ls3 r1, defpackage.as3 r2, long r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static defpackage.bs3 a(defpackage.bs3 r1, defpackage.as3 r2, long r3) {
            ls3 r1 = r1.a
            r2.getClass()
            bs3 r0 = new bs3
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L26
        L3:
            boolean r0 = r3 instanceof defpackage.bs3
            if (r0 != 0) goto L8
            goto L24
        L8:
            bs3 r3 = (defpackage.bs3) r3
            ls3 r0 = r2.a
            ls3 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L24
        L15:
            as3 r0 = r2.b
            as3 r1 = r3.b
            if (r0 == r1) goto L1c
            goto L24
        L1c:
            long r0 = r2.c
            long r2 = r3.c
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L26
        L24:
            r2 = 0
            return r2
        L26:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            ls3 r0 = r4.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            as3 r1 = r4.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.c
            int r4 = java.lang.Long.hashCode(r2)
            int r4 = r4 + r1
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "State(key="
            r0.<init>(r1)
            ls3 r1 = r4.a
            r0.append(r1)
            java.lang.String r1 = ", phase="
            r0.append(r1)
            as3 r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = ", lastSequence="
            r0.append(r1)
            java.lang.String r1 = ")"
            long r2 = r4.c
            java.lang.String r4 = defpackage.lb1.p(r0, r2, r1)
            return r4
    }
}
