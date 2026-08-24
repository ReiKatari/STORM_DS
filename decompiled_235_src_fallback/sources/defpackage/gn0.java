package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gn0  reason: default package */
/* loaded from: classes.dex */
public final class gn0 extends defpackage.jn0 {
    public final me.magnum.melonds.domain.model.Cheat b;

    public gn0(me.magnum.melonds.domain.model.Cheat r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.b = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.gn0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gn0 r4 = (defpackage.gn0) r4
            me.magnum.melonds.domain.model.Cheat r3 = r3.b
            me.magnum.melonds.domain.model.Cheat r4 = r4.b
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            me.magnum.melonds.domain.model.Cheat r0 = r0.b
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EditCheat(cheat="
            r0.<init>(r1)
            me.magnum.melonds.domain.model.Cheat r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
