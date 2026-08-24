package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o95  reason: default package */
/* loaded from: classes.dex */
public final class o95 extends defpackage.ca5 {
    public final defpackage.o75 a;
    public final int b;
    public final int c;
    public final java.lang.String d;

    public o95(defpackage.o75 r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2f
        L3:
            boolean r0 = r3 instanceof defpackage.o95
            if (r0 != 0) goto L8
            goto L2d
        L8:
            o95 r3 = (defpackage.o95) r3
            o75 r0 = r2.a
            o75 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2d
        L15:
            int r0 = r2.b
            int r1 = r3.b
            if (r0 == r1) goto L1c
            goto L2d
        L1c:
            int r0 = r2.c
            int r1 = r3.c
            if (r0 == r1) goto L23
            goto L2d
        L23:
            java.lang.String r2 = r2.d
            java.lang.String r3 = r3.d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2f
        L2d:
            r2 = 0
            return r2
        L2f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            o75 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.lang.String r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AchievementProgressUpdated(achievement="
            r0.<init>(r1)
            o75 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", current="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", target="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            java.lang.String r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
