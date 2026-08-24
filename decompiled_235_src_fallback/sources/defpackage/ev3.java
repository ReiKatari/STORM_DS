package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ev3  reason: default package */
/* loaded from: classes.dex */
public final class ev3 {
    public defpackage.ts1 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public ev3() {
            r0 = this;
            r0.<init>()
            r0.c()
            return
    }

    public final void a() {
            r2 = this;
            boolean r0 = r2.d
            ts1 r1 = r2.a
            if (r0 == 0) goto Lb
            int r0 = r1.i()
            goto Lf
        Lb:
            int r0 = r1.m()
        Lf:
            r2.c = r0
            return
    }

    public final void b(android.view.View r5, int r6) {
            r4 = this;
            ts1 r0 = r4.a
            int r1 = r0.a
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r1) goto Lb
            r1 = r2
            goto L12
        Lb:
            int r1 = r0.n()
            int r0 = r0.a
            int r1 = r1 - r0
        L12:
            if (r1 < 0) goto L3a
            boolean r0 = r4.d
            ts1 r1 = r4.a
            if (r0 == 0) goto L31
            int r5 = r1.d(r5)
            ts1 r0 = r4.a
            int r1 = r0.a
            if (r3 != r1) goto L25
            goto L2d
        L25:
            int r1 = r0.n()
            int r0 = r0.a
            int r2 = r1 - r0
        L2d:
            int r2 = r2 + r5
            r4.c = r2
            goto L37
        L31:
            int r5 = r1.g(r5)
            r4.c = r5
        L37:
            r4.b = r6
            return
        L3a:
            r4.b = r6
            boolean r6 = r4.d
            ts1 r0 = r4.a
            if (r6 == 0) goto L82
            int r6 = r0.i()
            int r6 = r6 - r1
            ts1 r0 = r4.a
            int r0 = r0.d(r5)
            int r6 = r6 - r0
            ts1 r0 = r4.a
            int r0 = r0.i()
            int r0 = r0 - r6
            r4.c = r0
            if (r6 <= 0) goto Lbf
            ts1 r0 = r4.a
            int r0 = r0.e(r5)
            int r1 = r4.c
            int r1 = r1 - r0
            ts1 r0 = r4.a
            int r0 = r0.m()
            ts1 r3 = r4.a
            int r5 = r3.g(r5)
            int r5 = r5 - r0
            int r5 = java.lang.Math.min(r5, r2)
            int r5 = r5 + r0
            int r1 = r1 - r5
            if (r1 >= 0) goto Lbf
            int r5 = r4.c
            int r0 = -r1
            int r6 = java.lang.Math.min(r6, r0)
            int r6 = r6 + r5
            r4.c = r6
            return
        L82:
            int r6 = r0.g(r5)
            ts1 r0 = r4.a
            int r0 = r0.m()
            int r0 = r6 - r0
            r4.c = r6
            if (r0 <= 0) goto Lbf
            ts1 r3 = r4.a
            int r3 = r3.e(r5)
            int r3 = r3 + r6
            ts1 r6 = r4.a
            int r6 = r6.i()
            int r6 = r6 - r1
            ts1 r1 = r4.a
            int r5 = r1.d(r5)
            int r6 = r6 - r5
            ts1 r5 = r4.a
            int r5 = r5.i()
            int r6 = java.lang.Math.min(r2, r6)
            int r5 = r5 - r6
            int r5 = r5 - r3
            if (r5 >= 0) goto Lbf
            int r6 = r4.c
            int r5 = -r5
            int r5 = java.lang.Math.min(r0, r5)
            int r6 = r6 - r5
            r4.c = r6
        Lbf:
            return
    }

    public final void c() {
            r1 = this;
            r0 = -1
            r1.b = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.c = r0
            r0 = 0
            r1.d = r0
            r1.e = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnchorInfo{mPosition="
            r0.<init>(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", mCoordinate="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", mLayoutFromEnd="
            r0.append(r1)
            boolean r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", mValid="
            r0.append(r1)
            boolean r2 = r2.e
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.String r2 = defpackage.xg6.r(r0, r2, r1)
            return r2
    }
}
