package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv5  reason: default package */
/* loaded from: classes.dex */
public final class wv5 extends defpackage.zv5 {
    public final java.lang.String a;
    public final defpackage.xv5 b;
    public final java.lang.String c;

    public wv5(java.lang.String r1, defpackage.xv5 r2, java.lang.String r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof defpackage.wv5
            if (r0 != 0) goto L8
            goto L26
        L8:
            wv5 r3 = (defpackage.wv5) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            xv5 r0 = r2.b
            xv5 r1 = r3.b
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            java.lang.String r2 = r2.c
            java.lang.String r3 = r3.c
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            xv5 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r2 = r2.c
            if (r2 != 0) goto L17
            r2 = 0
            goto L1b
        L17:
            int r2 = r2.hashCode()
        L1b:
            int r1 = r1 + r2
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OfflineAchievementNotSynced(title="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", reason="
            r0.append(r1)
            xv5 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", reasonDetail="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.c
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}
