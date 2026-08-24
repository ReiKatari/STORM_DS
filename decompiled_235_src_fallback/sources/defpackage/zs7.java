package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zs7  reason: default package */
/* loaded from: classes.dex */
public final class zs7 {
    public static int f;
    public java.util.ArrayList a;
    public int b;
    public int c;
    public java.util.ArrayList d;
    public int e;

    public final void a(java.util.ArrayList r6) {
            r5 = this;
            java.util.ArrayList r0 = r5.a
            int r0 = r0.size()
            int r1 = r5.e
            r2 = -1
            if (r1 == r2) goto L28
            if (r0 <= 0) goto L28
            r1 = 0
        Le:
            int r2 = r6.size()
            if (r1 >= r2) goto L28
            java.lang.Object r2 = r6.get(r1)
            zs7 r2 = (defpackage.zs7) r2
            int r3 = r5.e
            int r4 = r2.b
            if (r3 != r4) goto L25
            int r3 = r5.c
            r5.c(r3, r2)
        L25:
            int r1 = r1 + 1
            goto Le
        L28:
            if (r0 != 0) goto L2d
            r6.remove(r5)
        L2d:
            return
    }

    public final int b(defpackage.jv3 r9, int r10) {
            r8 = this;
            java.util.ArrayList r0 = r8.a
            int r1 = r0.size()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.Object r1 = r0.get(r2)
            l21 r1 = (defpackage.l21) r1
            l21 r1 = r1.U
            m21 r1 = (defpackage.m21) r1
            r9.t()
            r1.b(r9, r2)
            r3 = r2
        L1b:
            int r4 = r0.size()
            if (r3 >= r4) goto L2d
            java.lang.Object r4 = r0.get(r3)
            l21 r4 = (defpackage.l21) r4
            r4.b(r9, r2)
            int r3 = r3 + 1
            goto L1b
        L2d:
            if (r10 != 0) goto L36
            int r3 = r1.C0
            if (r3 <= 0) goto L36
            defpackage.nc1.C(r1, r9, r0, r2)
        L36:
            r3 = 1
            if (r10 != r3) goto L40
            int r4 = r1.D0
            if (r4 <= 0) goto L40
            defpackage.nc1.C(r1, r9, r0, r3)
        L40:
            r9.p()     // Catch: java.lang.Exception -> L44
            goto L82
        L44:
            r3 = move-exception
            java.io.PrintStream r4 = java.lang.System.err
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r3.toString()
            r5.append(r6)
            java.lang.String r6 = "\n"
            r5.append(r6)
            java.lang.StackTraceElement[] r3 = r3.getStackTrace()
            java.lang.String r3 = java.util.Arrays.toString(r3)
            java.lang.String r6 = "["
            java.lang.String r7 = "   at "
            java.lang.String r3 = r3.replace(r6, r7)
            java.lang.String r6 = ","
            java.lang.String r7 = "\n   at"
            java.lang.String r3 = r3.replace(r6, r7)
            java.lang.String r6 = "]"
            java.lang.String r7 = ""
            java.lang.String r3 = r3.replace(r6, r7)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.println(r3)
        L82:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r8.d = r3
        L89:
            int r3 = r0.size()
            if (r2 >= r3) goto Lc0
            java.lang.Object r3 = r0.get(r2)
            l21 r3 = (defpackage.l21) r3
            xo7 r4 = new xo7
            r4.<init>()
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r3)
            h11 r5 = r3.I
            defpackage.jv3.n(r5)
            h11 r5 = r3.J
            defpackage.jv3.n(r5)
            h11 r5 = r3.K
            defpackage.jv3.n(r5)
            h11 r5 = r3.L
            defpackage.jv3.n(r5)
            h11 r3 = r3.M
            defpackage.jv3.n(r3)
            java.util.ArrayList r3 = r8.d
            r3.add(r4)
            int r2 = r2 + 1
            goto L89
        Lc0:
            if (r10 != 0) goto Ld3
            h11 r8 = r1.I
            int r8 = defpackage.jv3.n(r8)
            h11 r10 = r1.K
            int r10 = defpackage.jv3.n(r10)
            r9.t()
        Ld1:
            int r10 = r10 - r8
            goto Le3
        Ld3:
            h11 r8 = r1.J
            int r8 = defpackage.jv3.n(r8)
            h11 r10 = r1.L
            int r10 = defpackage.jv3.n(r10)
            r9.t()
            goto Ld1
        Le3:
            return r10
    }

    public final void c(int r8, defpackage.zs7 r9) {
            r7 = this;
            int r0 = r9.b
            java.util.ArrayList r1 = r7.a
            int r2 = r1.size()
            r3 = 0
        L9:
            if (r3 >= r2) goto L27
            java.lang.Object r4 = r1.get(r3)
            int r3 = r3 + 1
            l21 r4 = (defpackage.l21) r4
            java.util.ArrayList r5 = r9.a
            boolean r6 = r5.contains(r4)
            if (r6 == 0) goto L1c
            goto L1f
        L1c:
            r5.add(r4)
        L1f:
            if (r8 != 0) goto L24
            r4.r0 = r0
            goto L9
        L24:
            r4.s0 = r0
            goto L9
        L27:
            r7.e = r0
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.c
            if (r1 != 0) goto Lc
            java.lang.String r1 = "Horizontal"
            goto L1a
        Lc:
            r2 = 1
            if (r1 != r2) goto L12
            java.lang.String r1 = "Vertical"
            goto L1a
        L12:
            r2 = 2
            if (r1 != r2) goto L18
            java.lang.String r1 = "Both"
            goto L1a
        L18:
            java.lang.String r1 = "Unknown"
        L1a:
            r0.append(r1)
            java.lang.String r1 = " ["
            r0.append(r1)
            int r1 = r5.b
            java.lang.String r2 = "] <"
            java.lang.String r0 = defpackage.lb1.o(r0, r1, r2)
            java.util.ArrayList r5 = r5.a
            int r1 = r5.size()
            r2 = 0
        L31:
            if (r2 >= r1) goto L4b
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            l21 r3 = (defpackage.l21) r3
            java.lang.String r4 = " "
            java.lang.StringBuilder r0 = defpackage.i61.r(r0, r4)
            java.lang.String r3 = r3.j0
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto L31
        L4b:
            java.lang.String r5 = " >"
            java.lang.String r5 = r0.concat(r5)
            return r5
    }
}
