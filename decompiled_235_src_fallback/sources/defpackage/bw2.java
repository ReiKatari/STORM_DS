package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bw2  reason: default package */
/* loaded from: classes.dex */
public final class bw2 {
    public final defpackage.o75 a;
    public final defpackage.hb5 b;

    public bw2(defpackage.o75 r1, defpackage.hb5 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.bw2
            if (r0 != 0) goto L8
            goto L1f
        L8:
            bw2 r3 = (defpackage.bw2) r3
            o75 r0 = r2.a
            o75 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            hb5 r2 = r2.b
            hb5 r3 = r3.b
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            o75 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            hb5 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "QueuedAchievement(achievement="
            r0.<init>(r1)
            o75 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", authentication="
            r0.append(r1)
            hb5 r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
