package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fw1  reason: default package */
/* loaded from: classes.dex */
public final class fw1 extends defpackage.lw1 {
    public final me.magnum.melonds.domain.model.VideoRenderer a;

    public fw1(me.magnum.melonds.domain.model.VideoRenderer r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L12
        L3:
            boolean r0 = r2 instanceof defpackage.fw1
            if (r0 != 0) goto L8
            goto L10
        L8:
            fw1 r2 = (defpackage.fw1) r2
            me.magnum.melonds.domain.model.VideoRenderer r1 = r1.a
            me.magnum.melonds.domain.model.VideoRenderer r2 = r2.a
            if (r1 == r2) goto L12
        L10:
            r1 = 0
            return r1
        L12:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            me.magnum.melonds.domain.model.VideoRenderer r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RendererInitFailed(renderer="
            r0.<init>(r1)
            me.magnum.melonds.domain.model.VideoRenderer r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
