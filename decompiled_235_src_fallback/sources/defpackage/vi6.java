package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vi6  reason: default package */
/* loaded from: classes.dex */
public final class vi6 {
    public final defpackage.kt0 a;
    public final defpackage.kt0 b;
    public final defpackage.kt0 c;
    public final defpackage.kt0 d;
    public final defpackage.kt0 e;
    public final java.lang.String f;

    public vi6(defpackage.kt0 r1, defpackage.kt0 r2, defpackage.kt0 r3, defpackage.kt0 r4, defpackage.kt0 r5, java.lang.String r6) {
            r0 = this;
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
            boolean r0 = r3 instanceof defpackage.vi6
            if (r0 != 0) goto L8
            goto L4b
        L8:
            vi6 r3 = (defpackage.vi6) r3
            kt0 r0 = r2.a
            kt0 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            kt0 r0 = r2.b
            kt0 r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            kt0 r0 = r2.c
            kt0 r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            kt0 r0 = r2.d
            kt0 r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            kt0 r0 = r2.e
            kt0 r1 = r3.e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L4b
        L41:
            java.lang.String r2 = r2.f
            java.lang.String r3 = r3.f
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
            r4 = this;
            kt0 r0 = r4.a
            long r0 = r0.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            kt0 r2 = r4.b
            long r2 = r2.a
            int r0 = defpackage.i61.c(r2, r0, r1)
            kt0 r2 = r4.c
            long r2 = r2.a
            int r0 = defpackage.i61.c(r2, r0, r1)
            kt0 r2 = r4.d
            long r2 = r2.a
            int r0 = defpackage.i61.c(r2, r0, r1)
            kt0 r2 = r4.e
            long r2 = r2.a
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.lang.String r4 = r4.f
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SixTuple(first="
            r0.<init>(r1)
            kt0 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", second="
            r0.append(r1)
            kt0 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", third="
            r0.append(r1)
            kt0 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", fourth="
            r0.append(r1)
            kt0 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", fifth="
            r0.append(r1)
            kt0 r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", sixth="
            r0.append(r1)
            java.lang.String r2 = r2.f
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
