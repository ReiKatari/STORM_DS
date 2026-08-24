package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t26  reason: default package */
/* loaded from: classes.dex */
public final class t26 {
    public static final defpackage.t26 c = null;
    public final defpackage.n00 a;
    public final me.magnum.melonds.domain.model.layout.BackgroundMode b;

    static {
            t26 r0 = new t26
            r1 = 0
            me.magnum.melonds.domain.model.layout.BackgroundMode r2 = me.magnum.melonds.domain.model.layout.BackgroundMode.STRETCH
            r0.<init>(r1, r2)
            defpackage.t26.c = r0
            return
    }

    public t26(defpackage.n00 r1, me.magnum.melonds.domain.model.layout.BackgroundMode r2) {
            r0 = this;
            r2.getClass()
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
            boolean r1 = r5 instanceof defpackage.t26
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t26 r5 = (defpackage.t26) r5
            n00 r1 = r4.a
            n00 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            me.magnum.melonds.domain.model.layout.BackgroundMode r4 = r4.b
            me.magnum.melonds.domain.model.layout.BackgroundMode r5 = r5.b
            if (r4 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            n00 r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            me.magnum.melonds.domain.model.layout.BackgroundMode r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RuntimeBackground(background="
            r0.<init>(r1)
            n00 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", mode="
            r0.append(r1)
            me.magnum.melonds.domain.model.layout.BackgroundMode r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
