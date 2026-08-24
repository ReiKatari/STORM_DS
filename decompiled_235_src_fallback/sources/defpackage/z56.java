package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z56  reason: default package */
/* loaded from: classes.dex */
public final class z56 {
    public final long a;
    public final defpackage.sc7 b;

    public z56(long r1, defpackage.sc7 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2b
        L3:
            boolean r0 = r5 instanceof defpackage.z56
            if (r0 != 0) goto L8
            goto L29
        L8:
            z56 r5 = (defpackage.z56) r5
            r0 = 1064011039(0x3f6b851f, float:0.92)
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 == 0) goto L14
            goto L29
        L14:
            long r0 = r4.a
            long r2 = r5.a
            boolean r0 = defpackage.i97.a(r0, r2)
            if (r0 != 0) goto L1f
            goto L29
        L1f:
            sc7 r4 = r4.b
            sc7 r5 = r5.b
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L2b
        L29:
            r4 = 0
            return r4
        L2b:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            r0 = 1064011039(0x3f6b851f, float:0.92)
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = defpackage.i97.c
            long r2 = r4.a
            int r0 = defpackage.i61.c(r2, r0, r1)
            sc7 r4 = r4.b
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Scale(scale=0.92, transformOrigin="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r1 = defpackage.i97.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", animationSpec="
            r0.append(r1)
            sc7 r3 = r3.b
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
