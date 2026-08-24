package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b91  reason: default package */
/* loaded from: classes.dex */
public final class b91 {
    public final me.magnum.melonds.domain.model.Rect a;
    public final float[] b;
    public final float c;
    public final boolean d;

    public b91(me.magnum.melonds.domain.model.Rect r1, float[] r2, float r3, boolean r4) {
            r0 = this;
            r1.getClass()
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
            goto L33
        L3:
            boolean r0 = r3 instanceof defpackage.b91
            if (r0 != 0) goto L8
            goto L31
        L8:
            b91 r3 = (defpackage.b91) r3
            me.magnum.melonds.domain.model.Rect r0 = r2.a
            me.magnum.melonds.domain.model.Rect r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            float[] r0 = r2.b
            float[] r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            float r0 = r2.c
            float r1 = r3.c
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L2b
            goto L31
        L2b:
            boolean r2 = r2.d
            boolean r3 = r3.d
            if (r2 == r3) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            me.magnum.melonds.domain.model.Rect r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            float[] r2 = r3.b
            int r2 = java.util.Arrays.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            float r0 = r3.c
            int r0 = defpackage.xg6.a(r0, r2, r1)
            boolean r3 = r3.d
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            float[] r0 = r3.b
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ScreenDrawTarget(rect="
            r1.<init>(r2)
            me.magnum.melonds.domain.model.Rect r2 = r3.a
            r1.append(r2)
            java.lang.String r2 = ", uvs="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", alpha="
            r1.append(r0)
            float r0 = r3.c
            r1.append(r0)
            java.lang.String r0 = ", onTop="
            r1.append(r0)
            boolean r3 = r3.d
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
