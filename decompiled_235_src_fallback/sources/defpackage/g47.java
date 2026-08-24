package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g47  reason: default package */
/* loaded from: classes.dex */
public final class g47 {
    public final defpackage.nn6 a;
    public final defpackage.nn6 b;
    public final defpackage.nn6 c;
    public final defpackage.nn6 d;

    public g47(defpackage.nn6 r1, defpackage.nn6 r2, defpackage.nn6 r3, defpackage.nn6 r4) {
            r0 = this;
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
            r1 = 0
            if (r5 == 0) goto L3b
            boolean r2 = r5 instanceof defpackage.g47
            if (r2 != 0) goto Lc
            goto L3b
        Lc:
            g47 r5 = (defpackage.g47) r5
            nn6 r2 = r5.a
            nn6 r3 = r4.a
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 != 0) goto L19
            return r1
        L19:
            nn6 r2 = r4.b
            nn6 r3 = r5.b
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L24
            return r1
        L24:
            nn6 r2 = r4.c
            nn6 r3 = r5.c
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L2f
            return r1
        L2f:
            nn6 r4 = r4.d
            nn6 r5 = r5.d
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L3a
            return r1
        L3a:
            return r0
        L3b:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            nn6 r1 = r3.a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 31
            nn6 r2 = r3.b
            if (r2 == 0) goto L16
            int r2 = r2.hashCode()
            goto L17
        L16:
            r2 = r0
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            nn6 r2 = r3.c
            if (r2 == 0) goto L23
            int r2 = r2.hashCode()
            goto L24
        L23:
            r2 = r0
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            nn6 r3 = r3.d
            if (r3 == 0) goto L2f
            int r0 = r3.hashCode()
        L2f:
            int r1 = r1 + r0
            return r1
    }
}
