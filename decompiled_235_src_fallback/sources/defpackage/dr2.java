package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dr2  reason: default package */
/* loaded from: classes.dex */
public final class dr2 implements java.lang.Runnable {
    public static final java.lang.ThreadLocal X = null;
    public static final defpackage.zh2 Y = null;
    public final java.util.ArrayList A;
    public long B;
    public long L;
    public final java.util.ArrayList R;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.dr2.X = r0
            zh2 r0 = new zh2
            r1 = 17
            r0.<init>(r1)
            defpackage.dr2.Y = r0
            return
    }

    public dr2() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.A = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.R = r0
            return
    }

    public static defpackage.wg5 c(androidx.recyclerview.widget.RecyclerView r5, int r6, long r7) {
            dk0 r0 = r5.e0
            int r0 = r0.t()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L23
            dk0 r3 = r5.e0
            android.view.View r3 = r3.s(r2)
            wg5 r3 = androidx.recyclerview.widget.RecyclerView.N(r3)
            int r4 = r3.c
            if (r4 != r6) goto L20
            boolean r3 = r3.f()
            if (r3 != 0) goto L20
            r5 = 0
            return r5
        L20:
            int r2 = r2 + 1
            goto L8
        L23:
            mg5 r0 = r5.L
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L3c
            boolean r2 = defpackage.v87.a()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L3c
            java.lang.String r2 = "RV Prefetch forced - needed next frame"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r6 = move-exception
            goto L61
        L3c:
            r5.U()     // Catch: java.lang.Throwable -> L3a
            wg5 r6 = r0.o(r6, r7)     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L5a
            boolean r7 = r6.e()     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L57
            boolean r7 = r6.f()     // Catch: java.lang.Throwable -> L3a
            if (r7 != 0) goto L57
            android.view.View r7 = r6.a     // Catch: java.lang.Throwable -> L3a
            r0.l(r7)     // Catch: java.lang.Throwable -> L3a
            goto L5a
        L57:
            r0.a(r6, r1)     // Catch: java.lang.Throwable -> L3a
        L5a:
            r5.V(r1)
            android.os.Trace.endSection()
            return r6
        L61:
            r5.V(r1)
            android.os.Trace.endSection()
            throw r6
    }

    public final void a(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
            r4 = this;
            boolean r0 = r5.r0
            if (r0 == 0) goto L28
            boolean r0 = androidx.recyclerview.widget.RecyclerView.y1
            if (r0 == 0) goto L17
            java.util.ArrayList r0 = r4.A
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L11
            goto L17
        L11:
            java.lang.String r4 = "attempting to post unregistered view!"
            defpackage.i.m(r4)
            return
        L17:
            long r0 = r4.B
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            long r0 = r5.getNanoTime()
            r4.B = r0
            r5.post(r4)
        L28:
            ls0 r4 = r5.c1
            r4.b = r6
            r4.c = r7
            return
    }

    public final void b(long r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.ArrayList r3 = r0.A
            int r4 = r3.size()
            r5 = 0
            r6 = r5
            r7 = r6
        Ld:
            if (r6 >= r4) goto L26
            java.lang.Object r8 = r3.get(r6)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            int r9 = r8.getWindowVisibility()
            ls0 r10 = r8.c1
            if (r9 != 0) goto L23
            r10.c(r8, r5)
            int r8 = r10.d
            int r7 = r7 + r8
        L23:
            int r6 = r6 + 1
            goto Ld
        L26:
            java.util.ArrayList r0 = r0.R
            r0.ensureCapacity(r7)
            r6 = r5
            r7 = r6
        L2d:
            r8 = 1
            if (r6 >= r4) goto L89
            java.lang.Object r9 = r3.get(r6)
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            int r10 = r9.getWindowVisibility()
            if (r10 == 0) goto L3d
            goto L85
        L3d:
            ls0 r10 = r9.c1
            int r11 = r10.b
            int r11 = java.lang.Math.abs(r11)
            int r12 = r10.c
            int r12 = java.lang.Math.abs(r12)
            int r12 = r12 + r11
            r11 = r5
        L4d:
            int r13 = r10.d
            int r13 = r13 * 2
            if (r11 >= r13) goto L85
            int r13 = r0.size()
            if (r7 < r13) goto L62
            cr2 r13 = new cr2
            r13.<init>()
            r0.add(r13)
            goto L68
        L62:
            java.lang.Object r13 = r0.get(r7)
            cr2 r13 = (defpackage.cr2) r13
        L68:
            java.lang.Object r14 = r10.e
            int[] r14 = (int[]) r14
            int r15 = r11 + 1
            r15 = r14[r15]
            if (r15 > r12) goto L73
            r5 = r8
        L73:
            r13.a = r5
            r13.b = r12
            r13.c = r15
            r13.d = r9
            r5 = r14[r11]
            r13.e = r5
            int r7 = r7 + 1
            int r11 = r11 + 2
            r5 = 0
            goto L4d
        L85:
            int r6 = r6 + 1
            r5 = 0
            goto L2d
        L89:
            zh2 r3 = defpackage.dr2.Y
            java.util.Collections.sort(r0, r3)
            r3 = 0
        L8f:
            int r4 = r0.size()
            if (r3 >= r4) goto L14f
            java.lang.Object r4 = r0.get(r3)
            cr2 r4 = (defpackage.cr2) r4
            androidx.recyclerview.widget.RecyclerView r5 = r4.d
            if (r5 != 0) goto La1
            goto L14f
        La1:
            boolean r6 = r4.a
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r6 == 0) goto Lac
            r6 = r9
            goto Lad
        Lac:
            r6 = r1
        Lad:
            int r11 = r4.e
            wg5 r5 = c(r5, r11, r6)
            if (r5 == 0) goto L139
            java.lang.ref.WeakReference r6 = r5.b
            if (r6 == 0) goto L139
            boolean r6 = r5.e()
            if (r6 == 0) goto L139
            boolean r6 = r5.f()
            if (r6 != 0) goto L139
            java.lang.ref.WeakReference r5 = r5.b
            java.lang.Object r5 = r5.get()
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 != 0) goto Ld0
            goto L139
        Ld0:
            boolean r6 = r5.C0
            if (r6 == 0) goto Lfb
            dk0 r6 = r5.e0
            int r6 = r6.t()
            if (r6 == 0) goto Lfb
            mg5 r6 = r5.L
            cg5 r7 = r5.L0
            if (r7 == 0) goto Le5
            r7.e()
        Le5:
            gg5 r7 = r5.m0
            if (r7 == 0) goto Lf1
            r7.j0(r6)
            gg5 r7 = r5.m0
            r7.k0(r6)
        Lf1:
            java.lang.Object r7 = r6.c
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r7.clear()
            r6.j()
        Lfb:
            ls0 r6 = r5.c1
            r6.c(r5, r8)
            int r7 = r6.d
            if (r7 == 0) goto L139
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 != 0) goto L10b
            java.lang.String r7 = "RV Nested Prefetch"
            goto L10d
        L10b:
            java.lang.String r7 = "RV Nested Prefetch forced - needed next frame"
        L10d:
            android.os.Trace.beginSection(r7)     // Catch: java.lang.Throwable -> L13b
            sg5 r7 = r5.d1     // Catch: java.lang.Throwable -> L13b
            wf5 r9 = r5.l0     // Catch: java.lang.Throwable -> L13b
            r7.d = r8     // Catch: java.lang.Throwable -> L13b
            int r9 = r9.a()     // Catch: java.lang.Throwable -> L13b
            r7.e = r9     // Catch: java.lang.Throwable -> L13b
            r9 = 0
            r7.g = r9     // Catch: java.lang.Throwable -> L13b
            r7.h = r9     // Catch: java.lang.Throwable -> L13b
            r7.i = r9     // Catch: java.lang.Throwable -> L13b
            r9 = 0
        L124:
            int r7 = r6.d     // Catch: java.lang.Throwable -> L13b
            int r7 = r7 * 2
            if (r9 >= r7) goto L136
            java.lang.Object r7 = r6.e     // Catch: java.lang.Throwable -> L13b
            int[] r7 = (int[]) r7     // Catch: java.lang.Throwable -> L13b
            r7 = r7[r9]     // Catch: java.lang.Throwable -> L13b
            c(r5, r7, r1)     // Catch: java.lang.Throwable -> L13b
            int r9 = r9 + 2
            goto L124
        L136:
            android.os.Trace.endSection()
        L139:
            r9 = 0
            goto L140
        L13b:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L140:
            r4.a = r9
            r4.b = r9
            r4.c = r9
            r5 = 0
            r4.d = r5
            r4.e = r9
            int r3 = r3 + 1
            goto L8f
        L14f:
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            java.util.ArrayList r0 = r9.A
            r1 = 0
            java.lang.String r3 = "RV Prefetch"
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L32
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L15
        Lf:
            r9.B = r1
            android.os.Trace.endSection()
            return
        L15:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r5 = r1
        L1b:
            if (r4 >= r3) goto L37
            java.lang.Object r7 = r0.get(r4)     // Catch: java.lang.Throwable -> L32
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7     // Catch: java.lang.Throwable -> L32
            int r8 = r7.getWindowVisibility()     // Catch: java.lang.Throwable -> L32
            if (r8 != 0) goto L34
            long r7 = r7.getDrawingTime()     // Catch: java.lang.Throwable -> L32
            long r5 = java.lang.Math.max(r7, r5)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r0 = move-exception
            goto L49
        L34:
            int r4 = r4 + 1
            goto L1b
        L37:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
            goto Lf
        L3c:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L32
            long r3 = r0.toNanos(r5)     // Catch: java.lang.Throwable -> L32
            long r5 = r9.L     // Catch: java.lang.Throwable -> L32
            long r3 = r3 + r5
            r9.b(r3)     // Catch: java.lang.Throwable -> L32
            goto Lf
        L49:
            r9.B = r1
            android.os.Trace.endSection()
            throw r0
    }
}
