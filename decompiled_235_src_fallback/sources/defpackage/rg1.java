package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rg1  reason: default package */
/* loaded from: classes.dex */
public final class rg1 {
    public final defpackage.fj6 a;
    public final defpackage.y56 b;
    public final defpackage.x97 c;
    public final defpackage.n05 d;
    public final java.lang.Boolean e;
    public final defpackage.ra0 f;
    public final defpackage.ra0 g;

    public rg1(defpackage.fj6 r1, defpackage.y56 r2, defpackage.x97 r3, defpackage.n05 r4, java.lang.Boolean r5, defpackage.ra0 r6, defpackage.ra0 r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.rg1
            if (r1 == 0) goto L41
            rg1 r4 = (defpackage.rg1) r4
            fj6 r1 = r3.a
            fj6 r2 = r4.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L41
            y56 r1 = r3.b
            y56 r2 = r4.b
            if (r1 != r2) goto L41
            x97 r1 = r3.c
            x97 r2 = r4.c
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L41
            n05 r1 = r3.d
            n05 r2 = r4.d
            if (r1 != r2) goto L41
            java.lang.Boolean r1 = r3.e
            java.lang.Boolean r2 = r4.e
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L41
            ra0 r1 = r3.f
            ra0 r2 = r4.f
            if (r1 != r2) goto L41
            ra0 r3 = r3.g
            ra0 r4 = r4.g
            if (r3 != r4) goto L41
            return r0
        L41:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            fj6 r1 = r3.a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 31
            y56 r2 = r3.b
            if (r2 == 0) goto L16
            int r2 = r2.hashCode()
            goto L17
        L16:
            r2 = r0
        L17:
            int r1 = r1 + r2
            r2 = 28629151(0x1b4d89f, float:6.6432393E-38)
            int r1 = r1 * r2
            x97 r2 = r3.c
            if (r2 == 0) goto L25
            int r2 = r2.hashCode()
            goto L26
        L25:
            r2 = r0
        L26:
            int r1 = r1 + r2
            int r1 = r1 * 31
            n05 r2 = r3.d
            if (r2 == 0) goto L32
            int r2 = r2.hashCode()
            goto L33
        L32:
            r2 = r0
        L33:
            int r1 = r1 + r2
            int r1 = r1 * 961
            java.lang.Boolean r2 = r3.e
            if (r2 == 0) goto L3f
            int r2 = r2.hashCode()
            goto L40
        L3f:
            r2 = r0
        L40:
            int r1 = r1 + r2
            int r1 = r1 * 961
            ra0 r2 = r3.f
            if (r2 == 0) goto L4c
            int r2 = r2.hashCode()
            goto L4d
        L4c:
            r2 = r0
        L4d:
            int r1 = r1 + r2
            int r1 = r1 * 31
            ra0 r3 = r3.g
            if (r3 == 0) goto L58
            int r0 = r3.hashCode()
        L58:
            int r1 = r1 + r0
            int r1 = r1 * 31
            return r1
    }
}
