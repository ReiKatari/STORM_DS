package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g05  reason: default package */
/* loaded from: classes.dex */
public final class g05 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public g05(boolean r1, defpackage.y86 r2, boolean r3, int r4) {
            r0 = this;
            py0 r4 = defpackage.ak.a
            if (r1 != 0) goto L8
            r1 = 262152(0x40008, float:3.67353E-40)
            goto La
        L8:
            r1 = 262144(0x40000, float:3.67342E-40)
        La:
            y86 r4 = defpackage.y86.SecureOn
            if (r2 != r4) goto L10
            r1 = r1 | 8192(0x2000, float:1.148E-41)
        L10:
            if (r3 != 0) goto L14
            r1 = r1 | 512(0x200, float:7.17E-43)
        L14:
            y86 r3 = defpackage.y86.Inherit
            r4 = 1
            if (r2 != r3) goto L1b
            r2 = r4
            goto L1c
        L1b:
            r2 = 0
        L1c:
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r4
            r0.e = r4
            r1 = 1002(0x3ea, float:1.404E-42)
            r0.f = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof defpackage.g05
            if (r0 != 0) goto L8
            goto L33
        L8:
            g05 r3 = (defpackage.g05) r3
            int r0 = r3.a
            int r1 = r2.a
            if (r1 == r0) goto L11
            goto L33
        L11:
            boolean r0 = r2.b
            boolean r1 = r3.b
            if (r0 == r1) goto L18
            goto L33
        L18:
            boolean r0 = r2.c
            boolean r1 = r3.c
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
            int r2 = r2.f
            int r3 = r3.f
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
            int r0 = r3.a
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.d
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            r2 = 0
            int r0 = defpackage.xg6.e(r0, r2, r1)
            int r3 = r3.f
            int r0 = r0 + r3
            int r0 = r0 * r1
            return r0
    }
}
