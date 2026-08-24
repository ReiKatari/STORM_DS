package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jj1  reason: default package */
/* loaded from: classes.dex */
public final class jj1 {
    public final boolean a;
    public final boolean b;
    public final defpackage.y86 c;
    public final boolean d;
    public final boolean e;
    public final java.lang.String f;
    public final int g;

    public jj1(int r3, boolean r4, boolean r5) {
            r2 = this;
            r0 = r3 & 1
            r1 = 1
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r3 & 2
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r3 = r3 & 4
            if (r3 == 0) goto L11
            r3 = r1
            goto L12
        L11:
            r3 = 0
        L12:
            y86 r0 = defpackage.y86.Inherit
            r2.<init>()
            r2.a = r4
            r2.b = r5
            r2.c = r0
            r2.d = r3
            r2.e = r1
            java.lang.String r3 = ""
            r2.f = r3
            r3 = 2
            r2.g = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof defpackage.jj1
            if (r0 != 0) goto L8
            goto L33
        L8:
            jj1 r3 = (defpackage.jj1) r3
            boolean r0 = r3.a
            boolean r1 = r2.a
            if (r1 == r0) goto L11
            goto L33
        L11:
            boolean r0 = r2.b
            boolean r1 = r3.b
            if (r0 == r1) goto L18
            goto L33
        L18:
            y86 r0 = r2.c
            y86 r1 = r3.c
            if (r0 == r1) goto L1f
            goto L33
        L1f:
            boolean r0 = r2.d
            boolean r1 = r3.d
            if (r0 == r1) goto L26
            goto L33
        L26:
            boolean r0 = r2.e
            boolean r1 = r3.e
            if (r0 == r1) goto L2d
            goto L33
        L2d:
            int r2 = r2.g
            int r3 = r3.g
            if (r2 == r3) goto L35
        L33:
            r2 = 0
            return r2
        L35:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            y86 r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.d
            int r0 = defpackage.xg6.e(r2, r0, r1)
            boolean r2 = r3.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            int r3 = r3.g
            int r0 = r0 + r3
            int r0 = r0 * r1
            return r0
    }
}
