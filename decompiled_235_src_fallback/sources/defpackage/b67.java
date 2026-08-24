package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b67  reason: default package */
/* loaded from: classes.dex */
public class b67 {
    public static final defpackage.a67 d = null;
    public boolean a;
    public long b;
    public long c;

    static {
            a67 r0 = new a67
            r0.<init>()
            defpackage.b67.d = r0
            return
    }

    public defpackage.b67 a() {
            r1 = this;
            r0 = 0
            r1.a = r0
            return r1
    }

    public defpackage.b67 b() {
            r2 = this;
            r0 = 0
            r2.c = r0
            return r2
    }

    public long c() {
            r2 = this;
            boolean r0 = r2.a
            if (r0 == 0) goto L7
            long r0 = r2.b
            return r0
        L7:
            java.lang.String r2 = "No deadline"
            defpackage.i.m(r2)
            r0 = 0
            return r0
    }

    public defpackage.b67 d(long r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.b = r2
            return r1
    }

    public boolean e() {
            r0 = this;
            boolean r0 = r0.a
            return r0
    }

    public void f() {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L25
            boolean r0 = r4.a
            if (r0 == 0) goto L24
            long r0 = r4.b
            long r2 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            goto L24
        L1c:
            java.io.InterruptedIOException r4 = new java.io.InterruptedIOException
            java.lang.String r0 = "deadline reached"
            r4.<init>(r0)
            throw r4
        L24:
            return
        L25:
            java.io.InterruptedIOException r4 = new java.io.InterruptedIOException
            java.lang.String r0 = "interrupted"
            r4.<init>(r0)
            throw r4
    }

    public defpackage.b67 g(long r3, java.util.concurrent.TimeUnit r5) {
            r2 = this;
            r5.getClass()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            long r3 = r5.toNanos(r3)
            r2.c = r3
            return r2
        L10:
            java.lang.String r2 = "timeout < 0: "
            java.lang.String r2 = defpackage.lb1.h(r3, r2)
            defpackage.i.f(r2)
            r2 = 0
            return r2
    }

    public long h() {
            r2 = this;
            long r0 = r2.c
            return r0
    }
}
