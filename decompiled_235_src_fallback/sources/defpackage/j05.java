package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j05  reason: default package */
/* loaded from: classes.dex */
public final class j05 {
    public final me.magnum.melonds.domain.model.Rect a;
    public final defpackage.nj3 b;
    public final float c;
    public final boolean d;

    public j05(me.magnum.melonds.domain.model.Rect r1, defpackage.nj3 r2, float r3, boolean r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public static defpackage.j05 a(defpackage.j05 r3, me.magnum.melonds.domain.model.Rect r4) {
            nj3 r0 = r3.b
            float r1 = r3.c
            boolean r2 = r3.d
            r3.getClass()
            r4.getClass()
            r0.getClass()
            j05 r3 = new j05
            r3.<init>(r4, r0, r1, r2)
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.j05
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            j05 r5 = (defpackage.j05) r5
            me.magnum.melonds.domain.model.Rect r1 = r4.a
            me.magnum.melonds.domain.model.Rect r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            nj3 r1 = r4.b
            nj3 r3 = r5.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            float r1 = r4.c
            float r3 = r5.c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L29
            return r2
        L29:
            boolean r4 = r4.d
            boolean r5 = r5.d
            if (r4 == r5) goto L30
            return r2
        L30:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            me.magnum.melonds.domain.model.Rect r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            nj3 r2 = r3.b
            int r2 = r2.hashCode()
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
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PositionedLayoutComponent(rect="
            r0.<init>(r1)
            me.magnum.melonds.domain.model.Rect r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", component="
            r0.append(r1)
            nj3 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", onTop="
            r0.append(r1)
            boolean r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
