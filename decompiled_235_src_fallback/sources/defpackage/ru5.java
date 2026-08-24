package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru5  reason: default package */
/* loaded from: classes.dex */
public final class ru5 extends defpackage.tu5 {
    public final me.magnum.melonds.domain.model.VideoFiltering a;

    public ru5(me.magnum.melonds.domain.model.VideoFiltering r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.ru5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ru5 r4 = (defpackage.ru5) r4
            me.magnum.melonds.domain.model.VideoFiltering r3 = r3.a
            me.magnum.melonds.domain.model.VideoFiltering r4 = r4.a
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            me.magnum.melonds.domain.model.VideoFiltering r0 = r0.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VideoFilteringUpdate(videoFiltering="
            r0.<init>(r1)
            me.magnum.melonds.domain.model.VideoFiltering r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
