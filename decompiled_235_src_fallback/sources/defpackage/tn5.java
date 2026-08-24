package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tn5  reason: default package */
/* loaded from: classes.dex */
public final class tn5 extends defpackage.vn5 {
    public final defpackage.o75 a;
    public final boolean b;
    public final defpackage.hb5 c;
    public final boolean d;

    public tn5(defpackage.o75 r1, boolean r2, defpackage.hb5 r3, boolean r4) {
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
            boolean r0 = r3 instanceof defpackage.tn5
            if (r0 != 0) goto L8
            goto L2d
        L8:
            tn5 r3 = (defpackage.tn5) r3
            o75 r0 = r2.a
            o75 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2d
        L15:
            boolean r0 = r2.b
            boolean r1 = r3.b
            if (r0 == r1) goto L1c
            goto L2d
        L1c:
            hb5 r0 = r2.c
            hb5 r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L2d
        L27:
            boolean r2 = r2.d
            boolean r3 = r3.d
            if (r2 == r3) goto L2f
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
            boolean r2 = r3.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            hb5 r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r3 = r3.d
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AchievementSubmission(achievement="
            r0.<init>(r1)
            o75 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", forHardcoreMode="
            r0.append(r1)
            boolean r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", authentication="
            r0.append(r1)
            hb5 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", firstTry="
            r0.append(r1)
            boolean r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
