package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pv1  reason: default package */
/* loaded from: classes.dex */
public final class pv1 {
    public final java.util.List a;
    public final boolean b;
    public final defpackage.qn2 c;

    public pv1(java.util.List r1, boolean r2, defpackage.qn2 r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static defpackage.pv1 a(defpackage.pv1 r2, java.util.List r3) {
            boolean r0 = r2.b
            qn2 r2 = r2.c
            r3.getClass()
            pv1 r1 = new pv1
            r1.<init>(r3, r0, r2)
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof defpackage.pv1
            if (r0 != 0) goto L8
            goto L26
        L8:
            pv1 r3 = (defpackage.pv1) r3
            java.util.List r0 = r2.a
            java.util.List r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            boolean r0 = r2.b
            boolean r1 = r3.b
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            qn2 r2 = r2.c
            qn2 r3 = r3.c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            qn2 r3 = r3.c
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SaveStatesOverlayData(slots="
            r0.<init>(r1)
            java.util.List r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", isSaving="
            r0.append(r1)
            boolean r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", onSlotPicked="
            r0.append(r1)
            qn2 r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
