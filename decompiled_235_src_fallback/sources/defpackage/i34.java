package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i34  reason: default package */
/* loaded from: classes.dex */
public final class i34 {
    public final int a;
    public final java.util.List b;
    public final long c;
    public final java.lang.Object d;
    public final defpackage.d40 e;
    public final defpackage.kk3 f;
    public final boolean g;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public i34(int r1, int r2, java.util.List r3, long r4, java.lang.Object r6, defpackage.lo4 r7, defpackage.d40 r8, defpackage.kk3 r9) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r6
            r0.e = r8
            r0.f = r9
            lo4 r1 = defpackage.lo4.Vertical
            r2 = 0
            if (r7 != r1) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = r2
        L17:
            r0.g = r1
            int r1 = r3.size()
            r4 = r2
        L1e:
            if (r2 >= r1) goto L36
            java.lang.Object r5 = r3.get(r2)
            dx4 r5 = (defpackage.dx4) r5
            boolean r6 = r0.g
            if (r6 != 0) goto L2d
            int r5 = r5.B
            goto L2f
        L2d:
            int r5 = r5.A
        L2f:
            int r4 = java.lang.Math.max(r4, r5)
            int r2 = r2 + 1
            goto L1e
        L36:
            r0.h = r4
            java.util.List r1 = r0.b
            int r1 = r1.size()
            int r1 = r1 * 2
            int[] r1 = new int[r1]
            r0.i = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.k = r1
            return
    }

    public final void a(int r7) {
            r6 = this;
            int r0 = r6.j
            int r0 = r0 + r7
            r6.j = r0
            int[] r0 = r6.i
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L22
            boolean r3 = r6.g
            if (r3 == 0) goto L14
            int r4 = r2 % 2
            r5 = 1
            if (r4 == r5) goto L1a
        L14:
            if (r3 != 0) goto L1f
            int r3 = r2 % 2
            if (r3 != 0) goto L1f
        L1a:
            r3 = r0[r2]
            int r3 = r3 + r7
            r0[r2] = r3
        L1f:
            int r2 = r2 + 1
            goto L9
        L22:
            return
    }

    public final void b(int r12, int r13, int r14) {
            r11 = this;
            r11.j = r12
            boolean r0 = r11.g
            if (r0 == 0) goto L8
            r1 = r14
            goto L9
        L8:
            r1 = r13
        L9:
            r11.k = r1
            java.util.List r1 = r11.b
            int r2 = r1.size()
            r3 = 0
        L12:
            if (r3 >= r2) goto L62
            java.lang.Object r4 = r1.get(r3)
            dx4 r4 = (defpackage.dx4) r4
            int r5 = r3 * 2
            int[] r6 = r11.i
            if (r0 == 0) goto L45
            int r7 = r4.A
            int r7 = r13 - r7
            float r7 = (float) r7
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            kk3 r8 = defpackage.kk3.Ltr
            kk3 r9 = r11.f
            r10 = 0
            if (r9 != r8) goto L30
            goto L33
        L30:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r10 = r10 * r8
        L33:
            r8 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 + r10
            float r8 = r8 * r7
            int r7 = java.lang.Math.round(r8)
            r6[r5] = r7
            int r5 = r5 + 1
            r6[r5] = r12
            int r4 = r4.B
        L43:
            int r12 = r12 + r4
            goto L58
        L45:
            r6[r5] = r12
            int r5 = r5 + 1
            d40 r7 = r11.e
            if (r7 == 0) goto L5b
            int r8 = r4.B
            int r7 = r7.a(r8, r14)
            r6[r5] = r7
            int r4 = r4.A
            goto L43
        L58:
            int r3 = r3 + 1
            goto L12
        L5b:
            java.lang.String r11 = "null verticalAlignment"
            ug r11 = defpackage.lb1.c(r11)
            throw r11
        L62:
            return
    }
}
