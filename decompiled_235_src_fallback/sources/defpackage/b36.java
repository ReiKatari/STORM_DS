package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b36  reason: default package */
/* loaded from: classes.dex */
public final class b36 {
    public final me.magnum.melonds.domain.model.VideoRenderer a;
    public final me.magnum.melonds.domain.model.VideoFiltering b;
    public final int c;
    public final defpackage.po5 d;

    public b36(me.magnum.melonds.domain.model.VideoRenderer r1, me.magnum.melonds.domain.model.VideoFiltering r2, int r3, defpackage.po5 r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.b36
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            b36 r5 = (defpackage.b36) r5
            me.magnum.melonds.domain.model.VideoRenderer r1 = r4.a
            me.magnum.melonds.domain.model.VideoRenderer r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            me.magnum.melonds.domain.model.VideoFiltering r1 = r4.b
            me.magnum.melonds.domain.model.VideoFiltering r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L21
            return r2
        L21:
            po5 r4 = r4.d
            po5 r5 = r5.d
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L2c
            return r2
        L2c:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            me.magnum.melonds.domain.model.VideoRenderer r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            me.magnum.melonds.domain.model.VideoFiltering r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r3.c
            int r0 = defpackage.lb1.a(r0, r2, r1)
            po5 r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RuntimeRendererConfiguration(renderer="
            r0.<init>(r1)
            me.magnum.melonds.domain.model.VideoRenderer r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", videoFiltering="
            r0.append(r1)
            me.magnum.melonds.domain.model.VideoFiltering r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", resolutionScaling="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", retroArchShader="
            r0.append(r1)
            po5 r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
