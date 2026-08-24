package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx0  reason: default package */
/* loaded from: classes.dex */
public final class qx0 {
    public final defpackage.xq2 a;
    public defpackage.rl0 b;
    public boolean c;
    public final defpackage.r93 d;
    public boolean e;
    public int f;
    public int g;
    public final java.util.ArrayList h;
    public int i;
    public int j;
    public int k;
    public int l;

    public qx0(defpackage.xq2 r1, defpackage.rl0 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r93 r1 = new r93
            r1.<init>()
            r0.d = r1
            r1 = 1
            r0.e = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.h = r1
            r1 = -1
            r0.i = r1
            r0.j = r1
            r0.k = r1
            return
    }

    public final void a() {
            r2 = this;
            r2.c()
            java.util.ArrayList r0 = r2.h
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L15
            int r2 = r0.size()
            int r2 = r2 + (-1)
            r0.remove(r2)
            return
        L15:
            int r0 = r2.g
            int r0 = r0 + 1
            r2.g = r0
            return
    }

    public final void b() {
            r6 = this;
            int r0 = r6.g
            r1 = 0
            if (r0 <= 0) goto L21
            rl0 r2 = r6.b
            co4 r2 = r2.m
            yn4 r3 = defpackage.yn4.d
            r2.h0(r3)
            int[] r3 = r2.e
            int r4 = r2.f
            ao4[] r5 = r2.c
            int r2 = r2.d
            int r2 = r2 + (-1)
            r2 = r5[r2]
            int r2 = r2.b
            int r4 = r4 - r2
            r3[r4] = r0
            r6.g = r1
        L21:
            java.util.ArrayList r0 = r6.h
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L50
            rl0 r6 = r6.b
            int r2 = r0.size()
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = r1
        L32:
            if (r4 >= r2) goto L3d
            java.lang.Object r5 = r0.get(r4)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L32
        L3d:
            r6.getClass()
            if (r2 != 0) goto L43
            goto L4d
        L43:
            co4 r6 = r6.m
            zm4 r2 = defpackage.zm4.d
            r6.h0(r2)
            defpackage.bl2.P(r6, r1, r3)
        L4d:
            r0.clear()
        L50:
            return
    }

    public final void c() {
            r8 = this;
            int r0 = r8.l
            if (r0 <= 0) goto L5d
            int r1 = r8.i
            r2 = -1
            if (r1 < 0) goto L2d
            r8.b()
            rl0 r3 = r8.b
            co4 r3 = r3.m
            on4 r4 = defpackage.on4.d
            r3.h0(r4)
            int r4 = r3.f
            ao4[] r5 = r3.c
            int r6 = r3.d
            int r6 = r6 + (-1)
            r5 = r5[r6]
            int r5 = r5.b
            int r4 = r4 - r5
            int[] r3 = r3.e
            r3[r4] = r1
            int r4 = r4 + 1
            r3[r4] = r0
            r8.i = r2
            goto L5a
        L2d:
            int r1 = r8.k
            int r3 = r8.j
            r8.b()
            rl0 r4 = r8.b
            co4 r4 = r4.m
            kn4 r5 = defpackage.kn4.d
            r4.h0(r5)
            int r5 = r4.f
            ao4[] r6 = r4.c
            int r7 = r4.d
            int r7 = r7 + (-1)
            r6 = r6[r7]
            int r6 = r6.b
            int r5 = r5 - r6
            int[] r4 = r4.e
            int r6 = r5 + 1
            r4[r6] = r1
            r4[r5] = r3
            int r5 = r5 + 2
            r4[r5] = r0
            r8.j = r2
            r8.k = r2
        L5a:
            r0 = 0
            r8.l = r0
        L5d:
            return
    }

    public final void d(boolean r6) {
            r5 = this;
            xq2 r0 = r5.a
            lk6 r0 = r0.G
            if (r6 == 0) goto L9
            int r6 = r0.i
            goto Lb
        L9:
            int r6 = r0.g
        Lb:
            int r0 = r5.f
            int r0 = r6 - r0
            if (r0 < 0) goto L12
            goto L17
        L12:
            java.lang.String r1 = "Tried to seek backward"
            defpackage.tx0.a(r1)
        L17:
            if (r0 <= 0) goto L35
            rl0 r1 = r5.b
            co4 r1 = r1.m
            sm4 r2 = defpackage.sm4.d
            r1.h0(r2)
            int[] r2 = r1.e
            int r3 = r1.f
            ao4[] r4 = r1.c
            int r1 = r1.d
            int r1 = r1 + (-1)
            r1 = r4[r1]
            int r1 = r1.b
            int r3 = r3 - r1
            r2[r3] = r0
            r5.f = r6
        L35:
            return
    }

    public final void e(int r3, int r4) {
            r2 = this;
            if (r4 <= 0) goto L2b
            if (r3 < 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 != 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid remove index "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            defpackage.tx0.a(r0)
        L1a:
            int r0 = r2.i
            if (r0 != r3) goto L24
            int r3 = r2.l
            int r3 = r3 + r4
            r2.l = r3
            return
        L24:
            r2.c()
            r2.i = r3
            r2.l = r4
        L2b:
            return
    }
}
