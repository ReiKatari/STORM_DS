package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lv7  reason: default package */
/* loaded from: classes.dex */
public final class lv7 {
    public final defpackage.w60 a;
    public final float b;

    public lv7(android.graphics.Rect r2, float r3) {
            r1 = this;
            w60 r0 = new w60
            r0.<init>(r2)
            r1.<init>()
            r1.a = r0
            r1.b = r3
            return
    }

    public lv7(defpackage.w60 r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r5 == 0) goto Lb
            java.lang.Class r1 = r5.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<lv7> r2 = defpackage.lv7.class
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            r5.getClass()
            lv7 r5 = (defpackage.lv7) r5
            w60 r1 = r4.a
            w60 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            float r4 = r4.b
            float r5 = r5.b
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L2f
            return r0
        L2f:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            w60 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            float r1 = r1.b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WindowMetrics(_bounds="
            r0.<init>(r1)
            w60 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", density="
            r0.append(r1)
            float r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}
