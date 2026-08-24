package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z66  reason: default package */
/* loaded from: classes.dex */
public final class z66 {
    public final java.util.UUID a;
    public final me.magnum.melonds.domain.model.layout.BackgroundMode b;
    public final java.util.List c;

    public z66(java.util.List r3) {
            r2 = this;
            r0 = 0
            me.magnum.melonds.domain.model.layout.BackgroundMode r1 = me.magnum.melonds.domain.model.layout.BackgroundMode.FIT_CENTER
            r2.<init>(r0, r1, r3)
            return
    }

    public z66(java.util.UUID r1, me.magnum.melonds.domain.model.layout.BackgroundMode r2, java.util.List r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static defpackage.z66 a(defpackage.z66 r1, java.util.UUID r2, me.magnum.melonds.domain.model.layout.BackgroundMode r3, java.util.List r4, int r5) {
            r0 = r5 & 1
            if (r0 == 0) goto L6
            java.util.UUID r2 = r1.a
        L6:
            r0 = r5 & 2
            if (r0 == 0) goto Lc
            me.magnum.melonds.domain.model.layout.BackgroundMode r3 = r1.b
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L12
            java.util.List r4 = r1.c
        L12:
            r1.getClass()
            r3.getClass()
            z66 r1 = new z66
            r1.<init>(r2, r3, r4)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.z66
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            z66 r5 = (defpackage.z66) r5
            java.util.UUID r1 = r4.a
            java.util.UUID r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            me.magnum.melonds.domain.model.layout.BackgroundMode r1 = r4.b
            me.magnum.melonds.domain.model.layout.BackgroundMode r3 = r5.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.util.List r4 = r4.c
            java.util.List r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.util.UUID r1 = r3.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            me.magnum.melonds.domain.model.layout.BackgroundMode r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.util.List r3 = r3.c
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r0 = r3.hashCode()
        L1f:
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScreenLayout(backgroundId="
            r0.<init>(r1)
            java.util.UUID r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", backgroundMode="
            r0.append(r1)
            me.magnum.melonds.domain.model.layout.BackgroundMode r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", components="
            r0.append(r1)
            java.util.List r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
