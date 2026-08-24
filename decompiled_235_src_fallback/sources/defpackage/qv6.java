package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qv6  reason: default package */
/* loaded from: classes.dex */
public final class qv6 {
    public final int a;
    public final android.graphics.Matrix b;
    public final boolean c;
    public final android.graphics.Rect d;
    public final boolean e;
    public final int f;
    public final defpackage.yy g;
    public int h;
    public int i;
    public boolean j;
    public defpackage.bw6 k;
    public defpackage.pv6 l;
    public final java.util.HashSet m;
    public boolean n;
    public final java.util.ArrayList o;

    public qv6(int r3, int r4, defpackage.yy r5, android.graphics.Matrix r6, boolean r7, android.graphics.Rect r8, int r9, int r10, boolean r11) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.j = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.m = r1
            r2.n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.o = r0
            r2.f = r3
            r2.a = r4
            r2.g = r5
            r2.b = r6
            r2.c = r7
            r2.d = r8
            r2.i = r9
            r2.h = r10
            r2.e = r11
            pv6 r3 = new pv6
            android.util.Size r5 = r5.a
            r3.<init>(r4, r5)
            r2.l = r3
            return
    }

    public final void a() {
            r1 = this;
            boolean r1 = r1.n
            r1 = r1 ^ 1
            java.lang.String r0 = "Edge is already closed."
            defpackage.np2.A(r0, r1)
            return
    }

    public final void b() {
            r1 = this;
            defpackage.nj2.h()
            pv6 r0 = r1.l
            r0.a()
            r0 = 1
            r1.n = r0
            java.util.ArrayList r0 = r1.o
            r0.clear()
            java.util.HashSet r1 = r1.m
            r1.clear()
            return
    }

    public final defpackage.bw6 c(boolean r6) {
            r5 = this;
            defpackage.nj2.h()
            r5.a()
            bw6 r0 = new bw6
            yy r1 = r5.g
            android.util.Size r2 = r1.a
            yq1 r1 = r1.c
            kv6 r3 = new kv6
            r4 = 0
            r3.<init>(r5, r4)
            r0.<init>(r2, r6, r1, r3)
            o33 r6 = r0.j     // Catch: java.lang.RuntimeException -> L3c defpackage.hg1 -> L48
            pv6 r1 = r5.l     // Catch: java.lang.RuntimeException -> L3c defpackage.hg1 -> L48
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.RuntimeException -> L3c defpackage.hg1 -> L48
            lv6 r2 = new lv6     // Catch: java.lang.RuntimeException -> L3c defpackage.hg1 -> L48
            r2.<init>(r1, r4)     // Catch: java.lang.RuntimeException -> L3c defpackage.hg1 -> L48
            boolean r2 = r1.g(r6, r2)     // Catch: java.lang.RuntimeException -> L3c defpackage.hg1 -> L48
            if (r2 == 0) goto L3e
            tb0 r1 = r1.e     // Catch: java.lang.RuntimeException -> L3c defpackage.hg1 -> L48
            gx3 r1 = defpackage.l.F(r1)     // Catch: java.lang.RuntimeException -> L3c defpackage.hg1 -> L48
            mv6 r2 = new mv6     // Catch: java.lang.RuntimeException -> L3c defpackage.hg1 -> L48
            r2.<init>(r6, r4)     // Catch: java.lang.RuntimeException -> L3c defpackage.hg1 -> L48
            uj1 r6 = defpackage.u24.j()     // Catch: java.lang.RuntimeException -> L3c defpackage.hg1 -> L48
            r1.a(r6, r2)     // Catch: java.lang.RuntimeException -> L3c defpackage.hg1 -> L48
            goto L3e
        L3c:
            r5 = move-exception
            goto L44
        L3e:
            r5.k = r0
            r5.e()
            return r0
        L44:
            r0.b()
            throw r5
        L48:
            r5 = move-exception
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r0 = "Surface is somehow already closed"
            r6.<init>(r0, r5)
            throw r6
    }

    public final void d() {
            r3 = this;
            defpackage.nj2.h()
            r3.a()
            pv6 r0 = r3.l
            r0.getClass()
            defpackage.nj2.h()
            ig1 r1 = r0.p
            if (r1 != 0) goto L1e
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1e
            goto L49
        L1b:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r3
        L1e:
            r0 = 0
            r3.j = r0
            pv6 r0 = r3.l
            r0.a()
            pv6 r0 = new pv6
            yy r1 = r3.g
            android.util.Size r1 = r1.a
            int r2 = r3.a
            r0.<init>(r2, r1)
            r3.l = r0
            java.util.HashSet r3 = r3.m
            java.util.Iterator r3 = r3.iterator()
        L39:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r3.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L39
        L49:
            return
    }

    public final void e() {
            r7 = this;
            defpackage.nj2.h()
            android.graphics.Rect r1 = r7.d
            int r2 = r7.i
            int r3 = r7.h
            boolean r4 = r7.c
            android.graphics.Matrix r5 = r7.b
            boolean r6 = r7.e
            cz r0 = new cz
            r0.<init>(r1, r2, r3, r4, r5, r6)
            bw6 r1 = r7.k
            r2 = 0
            if (r1 == 0) goto L34
            java.lang.Object r3 = r1.a
            monitor-enter(r3)
            r1.k = r0     // Catch: java.lang.Throwable -> L30
            pk0 r4 = r1.l     // Catch: java.lang.Throwable -> L30
            ov2 r1 = r1.m     // Catch: java.lang.Throwable -> L30
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L34
            if (r1 == 0) goto L34
            yv6 r3 = new yv6
            r3.<init>(r4, r0, r2)
            r1.execute(r3)
            goto L34
        L30:
            r0 = move-exception
            r7 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
            throw r7
        L34:
            java.util.ArrayList r7 = r7.o
            int r1 = r7.size()
        L3a:
            if (r2 >= r1) goto L48
            java.lang.Object r3 = r7.get(r2)
            int r2 = r2 + 1
            b31 r3 = (defpackage.b31) r3
            r3.accept(r0)
            goto L3a
        L48:
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SurfaceEdge{targets="
            r0.<init>(r1)
            int r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", format="
            r0.append(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", resolution="
            r0.append(r1)
            yy r1 = r3.g
            android.util.Size r1 = r1.a
            r0.append(r1)
            java.lang.String r1 = ", cropRect="
            r0.append(r1)
            android.graphics.Rect r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", rotationDegrees="
            r0.append(r1)
            int r1 = r3.i
            r0.append(r1)
            java.lang.String r1 = ", mirroring="
            r0.append(r1)
            boolean r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", sensorToBufferTransform= "
            r0.append(r1)
            android.graphics.Matrix r1 = r3.b
            r0.append(r1)
            java.lang.String r2 = ", rotationInTransform= "
            r0.append(r2)
            int r2 = defpackage.k97.b(r1)
            r0.append(r2)
            java.lang.String r2 = ", isMirrorInTransform= "
            r0.append(r2)
            boolean r1 = defpackage.k97.e(r1)
            r0.append(r1)
            java.lang.String r1 = ", isClosed="
            r0.append(r1)
            boolean r3 = r3.n
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.String r3 = defpackage.xg6.r(r0, r3, r1)
            return r3
    }
}
