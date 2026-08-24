package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qv1  reason: default package */
/* loaded from: classes.dex */
public final class qv1 {
    public final me.magnum.melonds.domain.model.Rect a;
    public final me.magnum.melonds.domain.model.Rect b;
    public final float c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final me.magnum.melonds.domain.model.Rect g;
    public final me.magnum.melonds.domain.model.Rect h;
    public final float i;
    public final boolean j;

    public qv1(me.magnum.melonds.domain.model.Rect r1, me.magnum.melonds.domain.model.Rect r2, float r3, float r4, boolean r5, boolean r6, me.magnum.melonds.domain.model.Rect r7, me.magnum.melonds.domain.model.Rect r8, float r9, boolean r10) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.qv1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qv1 r5 = (defpackage.qv1) r5
            me.magnum.melonds.domain.model.Rect r1 = r4.a
            me.magnum.melonds.domain.model.Rect r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            me.magnum.melonds.domain.model.Rect r1 = r4.b
            me.magnum.melonds.domain.model.Rect r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            float r1 = r4.c
            float r3 = r5.c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            float r1 = r4.d
            float r3 = r5.d
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L38
            return r2
        L38:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L3f
            return r2
        L3f:
            boolean r1 = r4.f
            boolean r3 = r5.f
            if (r1 == r3) goto L46
            return r2
        L46:
            me.magnum.melonds.domain.model.Rect r1 = r4.g
            me.magnum.melonds.domain.model.Rect r3 = r5.g
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            me.magnum.melonds.domain.model.Rect r1 = r4.h
            me.magnum.melonds.domain.model.Rect r3 = r5.h
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            float r1 = r4.i
            float r3 = r5.i
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L67
            return r2
        L67:
            boolean r4 = r4.j
            boolean r5 = r5.j
            if (r4 == r5) goto L6e
            return r2
        L6e:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            me.magnum.melonds.domain.model.Rect r1 = r4.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            me.magnum.melonds.domain.model.Rect r3 = r4.b
            if (r3 != 0) goto L14
            r3 = r0
            goto L18
        L14:
            int r3 = r3.hashCode()
        L18:
            int r1 = r1 + r3
            int r1 = r1 * r2
            float r3 = r4.c
            int r1 = defpackage.xg6.a(r3, r1, r2)
            float r3 = r4.d
            int r1 = defpackage.xg6.a(r3, r1, r2)
            boolean r3 = r4.e
            int r1 = defpackage.xg6.e(r1, r3, r2)
            boolean r3 = r4.f
            int r1 = defpackage.xg6.e(r1, r3, r2)
            me.magnum.melonds.domain.model.Rect r3 = r4.g
            if (r3 != 0) goto L38
            r3 = r0
            goto L3c
        L38:
            int r3 = r3.hashCode()
        L3c:
            int r1 = r1 + r3
            int r1 = r1 * r2
            me.magnum.melonds.domain.model.Rect r3 = r4.h
            if (r3 != 0) goto L43
            goto L47
        L43:
            int r0 = r3.hashCode()
        L47:
            int r1 = r1 + r0
            int r1 = r1 * r2
            float r0 = r4.i
            int r0 = defpackage.xg6.a(r0, r1, r2)
            boolean r4 = r4.j
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScreenPresentationAreas(topScreenRect="
            r0.<init>(r1)
            me.magnum.melonds.domain.model.Rect r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", bottomScreenRect="
            r0.append(r1)
            me.magnum.melonds.domain.model.Rect r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", topAlpha="
            r0.append(r1)
            float r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", bottomAlpha="
            r0.append(r1)
            float r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", topOnTop="
            r0.append(r1)
            boolean r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", bottomOnTop="
            r0.append(r1)
            boolean r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", hybridTopScreenRect="
            r0.append(r1)
            me.magnum.melonds.domain.model.Rect r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", hybridBottomScreenRect="
            r0.append(r1)
            me.magnum.melonds.domain.model.Rect r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", hybridAlpha="
            r0.append(r1)
            float r1 = r2.i
            r0.append(r1)
            java.lang.String r1 = ", hybridOnTop="
            r0.append(r1)
            boolean r2 = r2.j
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
