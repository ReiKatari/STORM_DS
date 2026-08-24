package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zy1  reason: default package */
/* loaded from: classes.dex */
public final class zy1 extends defpackage.az1 {
    public final defpackage.pq5 a;
    public final me.magnum.melonds.domain.model.VideoRenderer b;
    public final defpackage.z33 c;

    public zy1(defpackage.pq5 r1, me.magnum.melonds.domain.model.VideoRenderer r2, defpackage.z33 r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.zy1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            zy1 r5 = (defpackage.zy1) r5
            pq5 r1 = r4.a
            pq5 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            me.magnum.melonds.domain.model.VideoRenderer r1 = r4.b
            me.magnum.melonds.domain.model.VideoRenderer r3 = r5.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            z33 r4 = r4.c
            z33 r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            pq5 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            me.magnum.melonds.domain.model.VideoRenderer r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            z33 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ShowRomSettings(rom="
            r0.<init>(r1)
            pq5 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", renderer="
            r0.append(r1)
            me.magnum.melonds.domain.model.VideoRenderer r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", menuState="
            r0.append(r1)
            z33 r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
