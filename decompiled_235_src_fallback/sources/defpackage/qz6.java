package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qz6  reason: default package */
/* loaded from: classes.dex */
public final class qz6 {
    public static final java.util.logging.Logger k = null;
    public static final defpackage.qz6 l = null;
    public final defpackage.s35 a;
    public final java.util.logging.Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final java.util.ArrayList h;
    public final java.util.ArrayList i;
    public final defpackage.g15 j;

    static {
            java.lang.Class<qz6> r0 = defpackage.qz6.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            r0.getClass()
            defpackage.qz6.k = r0
            qz6 r0 = new qz6
            s35 r1 = new s35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = defpackage.az7.b
            java.lang.String r4 = " TaskRunner"
            java.lang.String r2 = defpackage.i61.n(r2, r3, r4)
            zy7 r10 = new zy7
            r3 = 1
            r10.<init>(r2, r3)
            r1.<init>()
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.SynchronousQueue r9 = new java.util.concurrent.SynchronousQueue
            r9.<init>()
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 60
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            r3.<init>(r4, r5, r6, r8, r9, r10)
            r1.A = r3
            r0.<init>(r1)
            defpackage.qz6.l = r0
            return
    }

    public qz6(defpackage.s35 r2) {
            r1 = this;
            java.util.logging.Logger r0 = defpackage.qz6.k
            r0.getClass()
            r1.<init>()
            r1.a = r2
            r1.b = r0
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.c = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.h = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.i = r2
            g15 r2 = new g15
            r0 = 22
            r2.<init>(r1, r0)
            r1.j = r2
            return
    }

    public static final void a(defpackage.qz6 r4, defpackage.lz6 r5, long r6, boolean r8) {
            java.util.TimeZone r0 = defpackage.az7.a
            pz6 r0 = r5.c
            r0.getClass()
            lz6 r1 = r0.d
            if (r1 != r5) goto L3b
            boolean r1 = r0.f
            r2 = 0
            r0.f = r2
            r2 = 0
            r0.d = r2
            java.util.ArrayList r2 = r4.h
            r2.remove(r0)
            r2 = -1
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L28
            if (r1 != 0) goto L28
            boolean r1 = r0.c
            if (r1 != 0) goto L28
            r1 = 1
            r0.e(r5, r6, r1)
        L28:
            java.util.ArrayList r5 = r0.e
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L3a
            java.util.ArrayList r5 = r4.i
            r5.add(r0)
            if (r8 != 0) goto L3a
            r4.e()
        L3a:
            return
        L3b:
            java.lang.String r4 = "Check failed."
            defpackage.i.m(r4)
            return
    }

    public final defpackage.lz6 b() {
            r18 = this;
            r1 = r18
            java.util.TimeZone r0 = defpackage.az7.a
        L4:
            java.util.ArrayList r0 = r1.i
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Lf
            r15 = 0
            goto L8f
        Lf:
            long r4 = java.lang.System.nanoTime()
            int r2 = r0.size()
            r6 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = r6
            r9 = 0
        L1f:
            r11 = 0
            r13 = 1
            if (r10 >= r2) goto L50
            java.lang.Object r14 = r0.get(r10)
            int r10 = r10 + 1
            pz6 r14 = (defpackage.pz6) r14
            java.util.ArrayList r14 = r14.e
            java.lang.Object r14 = r14.get(r6)
            lz6 r14 = (defpackage.lz6) r14
            r16 = r4
            r15 = 0
            long r3 = r14.d
            long r3 = r3 - r16
            long r3 = java.lang.Math.max(r11, r3)
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 <= 0) goto L4a
            long r7 = java.lang.Math.min(r3, r7)
        L47:
            r4 = r16
            goto L1f
        L4a:
            if (r9 == 0) goto L4e
            r2 = r13
            goto L54
        L4e:
            r9 = r14
            goto L47
        L50:
            r16 = r4
            r15 = 0
            r2 = r6
        L54:
            java.util.ArrayList r3 = r1.h
            if (r9 == 0) goto L80
            java.util.TimeZone r4 = defpackage.az7.a
            r4 = -1
            r9.d = r4
            pz6 r4 = r9.c
            r4.getClass()
            java.util.ArrayList r5 = r4.e
            r5.remove(r9)
            r0.remove(r4)
            r4.d = r9
            r3.add(r4)
            if (r2 != 0) goto L7c
            boolean r2 = r1.d
            if (r2 != 0) goto L7f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7f
        L7c:
            r1.e()
        L7f:
            return r9
        L80:
            boolean r2 = r1.d
            if (r2 == 0) goto L90
            long r2 = r1.e
            long r2 = r2 - r16
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L8f
            r1.notify()
        L8f:
            return r15
        L90:
            r1.d = r13
            long r4 = r16 + r7
            r1.e = r4
            java.util.TimeZone r2 = defpackage.az7.a     // Catch: java.lang.Throwable -> Lae java.lang.InterruptedException -> Lb4
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 <= 0) goto Lb0
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r7 / r4
            long r4 = r4 * r9
            long r7 = r7 - r4
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 > 0) goto La9
            if (r2 <= 0) goto Lb0
        La9:
            int r2 = (int) r7     // Catch: java.lang.Throwable -> Lae java.lang.InterruptedException -> Lb4
            r1.wait(r9, r2)     // Catch: java.lang.Throwable -> Lae java.lang.InterruptedException -> Lb4
            goto Lb0
        Lae:
            r0 = move-exception
            goto Le8
        Lb0:
            r1.d = r6
            goto L4
        Lb4:
            java.util.TimeZone r2 = defpackage.az7.a     // Catch: java.lang.Throwable -> Lae
            int r2 = r3.size()     // Catch: java.lang.Throwable -> Lae
            int r2 = r2 - r13
        Lbb:
            r4 = -1
            if (r4 >= r2) goto Lca
            java.lang.Object r4 = r3.get(r2)     // Catch: java.lang.Throwable -> Lae
            pz6 r4 = (defpackage.pz6) r4     // Catch: java.lang.Throwable -> Lae
            r4.a()     // Catch: java.lang.Throwable -> Lae
            int r2 = r2 + (-1)
            goto Lbb
        Lca:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> Lae
            int r2 = r2 - r13
        Lcf:
            if (r4 >= r2) goto Lb0
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Throwable -> Lae
            pz6 r3 = (defpackage.pz6) r3     // Catch: java.lang.Throwable -> Lae
            r3.a()     // Catch: java.lang.Throwable -> Lae
            java.util.ArrayList r3 = r3.e     // Catch: java.lang.Throwable -> Lae
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lae
            if (r3 == 0) goto Le5
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lae
        Le5:
            int r2 = r2 + (-1)
            goto Lcf
        Le8:
            r1.d = r6
            throw r0
    }

    public final void c(defpackage.pz6 r3) {
            r2 = this;
            r3.getClass()
            java.util.TimeZone r0 = defpackage.az7.a
            lz6 r0 = r3.d
            if (r0 != 0) goto L25
            java.util.ArrayList r0 = r3.e
            boolean r0 = r0.isEmpty()
            java.util.ArrayList r1 = r2.i
            if (r0 != 0) goto L22
            byte[] r0 = defpackage.yy7.a
            r1.getClass()
            boolean r0 = r1.contains(r3)
            if (r0 != 0) goto L25
            r1.add(r3)
            goto L25
        L22:
            r1.remove(r3)
        L25:
            boolean r3 = r2.d
            if (r3 == 0) goto L2d
            r2.notify()
            return
        L2d:
            r2.e()
            return
    }

    public final defpackage.pz6 d() {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.c     // Catch: java.lang.Throwable -> L14
            int r1 = r0 + 1
            r3.c = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            pz6 r1 = new pz6
            java.lang.String r2 = "Q"
            java.lang.String r0 = defpackage.lb1.g(r0, r2)
            r1.<init>(r3, r0)
            return r1
        L14:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final void e() {
            r2 = this;
            java.util.TimeZone r0 = defpackage.az7.a
            int r0 = r2.f
            int r1 = r2.g
            if (r0 <= r1) goto L9
            return
        L9:
            int r0 = r0 + 1
            r2.f = r0
            g15 r0 = r2.j
            r0.getClass()
            s35 r2 = r2.a
            java.lang.Object r2 = r2.A
            java.util.concurrent.ThreadPoolExecutor r2 = (java.util.concurrent.ThreadPoolExecutor) r2
            r2.execute(r0)
            return
    }
}
