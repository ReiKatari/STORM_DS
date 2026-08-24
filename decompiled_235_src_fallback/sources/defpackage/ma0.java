package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ma0  reason: default package */
/* loaded from: classes.dex */
public final class ma0 {
    public static final defpackage.ma0 n = null;
    public static final defpackage.ma0 o = null;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public java.lang.String m;

    static {
            ma0 r0 = new ma0
            r12 = 0
            r13 = 0
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = -1
            r9 = -1
            r10 = 0
            r11 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            defpackage.ma0.n = r0
            jd1 r0 = defpackage.oq1.B
            uq1 r0 = defpackage.uq1.SECONDS
            r1 = 2147483647(0x7fffffff, float:NaN)
            long r2 = defpackage.n16.L(r1, r0)
            long r2 = defpackage.oq1.k(r2, r0)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L48
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L32
        L30:
            r10 = r1
            goto L34
        L32:
            int r1 = (int) r2
            goto L30
        L34:
            ma0 r2 = new ma0
            r14 = 0
            r15 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = -1
            r12 = 1
            r13 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            defpackage.ma0.o = r2
            return
        L48:
            java.lang.String r0 = "maxStale < 0: "
            java.lang.String r0 = defpackage.lb1.h(r2, r0)
            defpackage.i.f(r0)
            return
    }

    public ma0(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, java.lang.String r13) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r11
            r0.l = r12
            r0.m = r13
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.m
            if (r0 != 0) goto Lb0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r5.a
            if (r1 == 0) goto L12
            java.lang.String r1 = "no-cache, "
            r0.append(r1)
        L12:
            boolean r1 = r5.b
            if (r1 == 0) goto L1b
            java.lang.String r1 = "no-store, "
            r0.append(r1)
        L1b:
            java.lang.String r1 = ", "
            r2 = -1
            int r3 = r5.c
            if (r3 == r2) goto L2d
            java.lang.String r4 = "max-age="
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
        L2d:
            int r3 = r5.d
            if (r3 == r2) goto L3c
            java.lang.String r4 = "s-maxage="
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
        L3c:
            boolean r3 = r5.e
            if (r3 == 0) goto L45
            java.lang.String r3 = "private, "
            r0.append(r3)
        L45:
            boolean r3 = r5.f
            if (r3 == 0) goto L4e
            java.lang.String r3 = "public, "
            r0.append(r3)
        L4e:
            boolean r3 = r5.g
            if (r3 == 0) goto L57
            java.lang.String r3 = "must-revalidate, "
            r0.append(r3)
        L57:
            int r3 = r5.h
            if (r3 == r2) goto L66
            java.lang.String r4 = "max-stale="
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
        L66:
            int r3 = r5.i
            if (r3 == r2) goto L75
            java.lang.String r2 = "min-fresh="
            r0.append(r2)
            r0.append(r3)
            r0.append(r1)
        L75:
            boolean r1 = r5.j
            if (r1 == 0) goto L7e
            java.lang.String r1 = "only-if-cached, "
            r0.append(r1)
        L7e:
            boolean r1 = r5.k
            if (r1 == 0) goto L87
            java.lang.String r1 = "no-transform, "
            r0.append(r1)
        L87:
            boolean r1 = r5.l
            if (r1 == 0) goto L90
            java.lang.String r1 = "immutable, "
            r0.append(r1)
        L90:
            int r1 = r0.length()
            if (r1 != 0) goto L99
            java.lang.String r5 = ""
            return r5
        L99:
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            java.lang.StringBuilder r1 = r0.delete(r1, r2)
            r1.getClass()
            java.lang.String r0 = r0.toString()
            r5.m = r0
        Lb0:
            return r0
    }
}
