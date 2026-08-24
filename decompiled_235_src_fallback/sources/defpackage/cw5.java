package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cw5  reason: default package */
/* loaded from: classes.dex */
public final class cw5 {
    public final me.magnum.melonds.domain.model.VideoRenderer a;
    public final boolean b;
    public final int c;
    public final me.magnum.melonds.domain.model.VideoFiltering d;

    public cw5(me.magnum.melonds.domain.model.VideoRenderer r1, boolean r2, int r3, me.magnum.melonds.domain.model.VideoFiltering r4) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.cw5
            if (r1 != 0) goto L9
            goto L26
        L9:
            cw5 r4 = (defpackage.cw5) r4
            me.magnum.melonds.domain.model.VideoRenderer r1 = r3.a
            me.magnum.melonds.domain.model.VideoRenderer r2 = r4.a
            if (r1 == r2) goto L12
            goto L26
        L12:
            boolean r1 = r3.b
            boolean r2 = r4.b
            if (r1 == r2) goto L19
            goto L26
        L19:
            int r1 = r3.c
            int r2 = r4.c
            if (r1 == r2) goto L20
            goto L26
        L20:
            me.magnum.melonds.domain.model.VideoFiltering r3 = r3.d
            me.magnum.melonds.domain.model.VideoFiltering r4 = r4.d
            if (r3 == r4) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            me.magnum.melonds.domain.model.VideoRenderer r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            me.magnum.melonds.domain.model.VideoFiltering r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * 29791
            r0 = 0
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GlobalVideoConfig(renderer="
            r0.<init>(r1)
            me.magnum.melonds.domain.model.VideoRenderer r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", threadedRendering="
            r0.append(r1)
            boolean r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", internalResolutionScaling="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", filtering="
            r0.append(r1)
            me.magnum.melonds.domain.model.VideoFiltering r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = ", retroArchShaderPresetPath=null, retroArchShaderParameters=null, hasValidRetroArchShaderRoot=false)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
