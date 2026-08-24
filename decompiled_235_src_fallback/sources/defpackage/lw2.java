package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lw2  reason: default package */
/* loaded from: classes.dex */
public final class lw2 {
    public final defpackage.w60 a;
    public final defpackage.gr1 b;
    public final defpackage.gr1 c;

    public lw2(defpackage.w60 r1, defpackage.gr1 r2, defpackage.gr1 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            int r0 = r1.b()
            r2 = 0
            if (r0 != 0) goto L1d
            int r0 = r1.a()
            if (r0 == 0) goto L17
            goto L1d
        L17:
            java.lang.String r0 = "Bounds must be non zero"
            defpackage.i.h(r0)
            throw r2
        L1d:
            int r0 = r1.a
            if (r0 == 0) goto L2c
            int r0 = r1.b
            if (r0 != 0) goto L26
            goto L2c
        L26:
            java.lang.String r0 = "Bounding rectangle must start at the top or left window edge for folding features"
            defpackage.i.h(r0)
            throw r2
        L2c:
            return
    }

    public final defpackage.gr1 a() {
            r1 = this;
            w60 r1 = r1.a
            int r0 = r1.b()
            int r1 = r1.a()
            if (r0 <= r1) goto Lf
            gr1 r1 = defpackage.gr1.d0
            return r1
        Lf:
            gr1 r1 = defpackage.gr1.Z
            return r1
    }

    public final boolean b() {
            r3 = this;
            gr1 r0 = defpackage.gr1.h0
            r1 = 1
            gr1 r2 = r3.b
            if (r2 == r0) goto L14
            gr1 r0 = defpackage.gr1.g0
            if (r2 == r0) goto Lc
            goto L12
        Lc:
            gr1 r3 = r3.c
            gr1 r0 = defpackage.gr1.f0
            if (r3 == r0) goto L14
        L12:
            r3 = 0
            return r3
        L14:
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r5 == 0) goto Lb
            java.lang.Class r1 = r5.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<lw2> r2 = defpackage.lw2.class
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 != 0) goto L16
            goto L25
        L16:
            r5.getClass()
            lw2 r5 = (defpackage.lw2) r5
            w60 r1 = r4.a
            w60 r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
        L25:
            return r2
        L26:
            gr1 r1 = r4.b
            gr1 r3 = r5.b
            if (r1 == r3) goto L2d
            return r2
        L2d:
            gr1 r4 = r4.c
            gr1 r5 = r5.c
            if (r4 == r5) goto L34
            return r2
        L34:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            w60 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            gr1 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            gr1 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<lw2> r1 = defpackage.lw2.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " { "
            r0.append(r1)
            w60 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            gr1 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            gr1 r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = " }"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
