package m7;

import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final int f9333a;

    /* renamed from: b  reason: collision with root package name */
    public final mc.a f9334b;

    /* renamed from: c  reason: collision with root package name */
    public final ReentrantLock f9335c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public int f9336d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9337e;

    /* renamed from: f  reason: collision with root package name */
    public final g[] f9338f;

    /* renamed from: g  reason: collision with root package name */
    public final id.h f9339g;

    /* renamed from: h  reason: collision with root package name */
    public final zb.j f9340h;

    /* JADX WARN: Type inference failed for: r2v4, types: [id.h, id.g] */
    public u(int i2, mc.a aVar) {
        this.f9333a = i2;
        this.f9334b = aVar;
        this.f9338f = new g[i2];
        int i10 = id.i.f7036a;
        this.f9339g = new id.g(i2);
        this.f9340h = new zb.j(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[Catch: all -> 0x007a, TryCatch #2 {all -> 0x0078, blocks: (B:17:0x003e, B:27:0x0074, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:25:0x0054, B:26:0x006e, B:33:0x007c, B:34:0x0084), top: B:39:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #2 {all -> 0x0078, blocks: (B:17:0x003e, B:27:0x0074, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:25:0x0054, B:26:0x006e, B:33:0x007c, B:34:0x0084), top: B:39:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ec.c r7) {
        /*
            r6 = this;
            zb.j r0 = r6.f9340h
            boolean r1 = r7 instanceof m7.s
            if (r1 == 0) goto L15
            r1 = r7
            m7.s r1 = (m7.s) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            m7.s r1 = new m7.s
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.R
            dc.a r2 = dc.a.COROUTINE_SUSPENDED
            int r3 = r1.Y
            id.h r4 = r6.f9339g
            r5 = 1
            if (r3 == 0) goto L32
            if (r3 != r5) goto L2b
            p7.j.I(r7)
            goto L3e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r7 = 0
            return r7
        L32:
            p7.j.I(r7)
            r1.Y = r5
            java.lang.Object r7 = r4.a(r1)
            if (r7 != r2) goto L3e
            return r2
        L3e:
            java.util.concurrent.locks.ReentrantLock r7 = r6.f9335c     // Catch: java.lang.Throwable -> L78
            r7.lock()     // Catch: java.lang.Throwable -> L78
            boolean r1 = r6.f9337e     // Catch: java.lang.Throwable -> L7a
            if (r1 != 0) goto L7c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L6e
            int r1 = r6.f9336d     // Catch: java.lang.Throwable -> L7a
            int r2 = r6.f9333a     // Catch: java.lang.Throwable -> L7a
            if (r1 < r2) goto L54
            goto L6e
        L54:
            m7.g r1 = new m7.g     // Catch: java.lang.Throwable -> L7a
            mc.a r2 = r6.f9334b     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L7a
            t7.a r2 = (t7.a) r2     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            m7.g[] r2 = r6.f9338f     // Catch: java.lang.Throwable -> L7a
            int r3 = r6.f9336d     // Catch: java.lang.Throwable -> L7a
            int r5 = r3 + 1
            r6.f9336d = r5     // Catch: java.lang.Throwable -> L7a
            r2[r3] = r1     // Catch: java.lang.Throwable -> L7a
            r0.addLast(r1)     // Catch: java.lang.Throwable -> L7a
        L6e:
            java.lang.Object r0 = r0.removeLast()     // Catch: java.lang.Throwable -> L7a
            m7.g r0 = (m7.g) r0     // Catch: java.lang.Throwable -> L7a
            r7.unlock()     // Catch: java.lang.Throwable -> L78
            return r0
        L78:
            r7 = move-exception
            goto L89
        L7a:
            r0 = move-exception
            goto L85
        L7c:
            java.lang.String r0 = "Connection pool is closed"
            r1 = 21
            zb.k.L(r1, r0)     // Catch: java.lang.Throwable -> L7a
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L7a
        L85:
            r7.unlock()     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L89:
            r4.c()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.u.a(ec.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(2:10|11)|12|13|14|(1:(1:37)(2:34|(1:36)))(1:16)|17|18|19|20|(2:22|(1:24)(10:26|12|13|14|(0)(0)|17|18|19|20|(2:27|28)(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        r2 = r13;
        r13 = r14;
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:20:0x003e, B:22:0x0057, B:27:0x006c, B:28:0x0073), top: B:50:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:20:0x003e, B:22:0x0057, B:27:0x006c, B:28:0x0073), top: B:50:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:33:0x0080, B:35:0x0084, B:39:0x008c, B:43:0x0093), top: B:48:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Type inference failed for: r14v4, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [mc.a] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0065 -> B:26:0x0067). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007b -> B:48:0x0080). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r11, g1.g r13, ec.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof m7.t
            if (r0 == 0) goto L13
            r0 = r14
            m7.t r0 = (m7.t) r0
            int r1 = r0.f9332c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9332c0 = r1
            goto L18
        L13:
            m7.t r0 = new m7.t
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.Z
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f9332c0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            long r11 = r0.R
            nc.t r13 = r0.Y
            mc.a r2 = r0.X
            p7.j.I(r14)     // Catch: java.lang.Throwable -> L2e
            goto L67
        L2e:
            r14 = move-exception
            goto L7b
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r11)
            return r4
        L36:
            p7.j.I(r14)
        L39:
            nc.t r14 = new nc.t
            r14.<init>()
            h1.x2 r2 = new h1.x2     // Catch: java.lang.Throwable -> L79
            r5 = 10
            r2.<init>(r14, r10, r4, r5)     // Catch: java.lang.Throwable -> L79
            r0.X = r13     // Catch: java.lang.Throwable -> L79
            r0.Y = r14     // Catch: java.lang.Throwable -> L79
            r0.R = r11     // Catch: java.lang.Throwable -> L79
            r0.f9332c0 = r3     // Catch: java.lang.Throwable -> L79
            long r5 = zc.x.C(r11)     // Catch: java.lang.Throwable -> L79
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L6c
            zc.q1 r7 = new zc.q1     // Catch: java.lang.Throwable -> L79
            r7.<init>(r5, r0)     // Catch: java.lang.Throwable -> L79
            java.lang.Object r2 = zc.x.A(r7, r2)     // Catch: java.lang.Throwable -> L79
            dc.a r5 = dc.a.COROUTINE_SUSPENDED     // Catch: java.lang.Throwable -> L79
            if (r2 != r1) goto L65
            return r1
        L65:
            r2 = r13
            r13 = r14
        L67:
            r14 = r13
            r13 = r2
            r2 = r0
            r0 = r4
            goto L80
        L6c:
            zc.p1 r2 = new zc.p1     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = "Timed out immediately"
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L79
            throw r2     // Catch: java.lang.Throwable -> L79
        L74:
            r9 = r2
            r2 = r13
            r13 = r14
            r14 = r9
            goto L7b
        L79:
            r2 = move-exception
            goto L74
        L7b:
            r9 = r14
            r14 = r13
            r13 = r2
            r2 = r0
            r0 = r9
        L80:
            boolean r5 = r0 instanceof zc.p1     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto L8a
            r13.b()     // Catch: java.lang.Throwable -> L88
            goto L91
        L88:
            r11 = move-exception
            goto L94
        L8a:
            if (r0 != 0) goto L93
            java.lang.Object r14 = r14.A     // Catch: java.lang.Throwable -> L88
            if (r14 == 0) goto L91
            return r14
        L91:
            r0 = r2
            goto L39
        L93:
            throw r0     // Catch: java.lang.Throwable -> L88
        L94:
            java.lang.Object r12 = r14.A
            m7.g r12 = (m7.g) r12
            if (r12 == 0) goto L9d
            r10.e(r12)
        L9d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.u.b(long, g1.g, ec.c):java.lang.Object");
    }

    public final void c() {
        g[] gVarArr;
        ReentrantLock reentrantLock = this.f9335c;
        reentrantLock.lock();
        try {
            this.f9337e = true;
            for (g gVar : this.f9338f) {
                if (gVar != null) {
                    gVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb2) {
        g[] gVarArr;
        String str;
        zb.j jVar = this.f9340h;
        ReentrantLock reentrantLock = this.f9335c;
        reentrantLock.lock();
        try {
            ac.b g10 = p7.t.g();
            int i2 = jVar.L;
            for (int i10 = 0; i10 < i2; i10++) {
                g10.add(jVar.get(i10));
            }
            ac.b d4 = p7.t.d(g10);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f9333a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            id.h hVar = this.f9339g;
            hVar.getClass();
            sb3.append(Math.max(id.g.Z.get(hVar), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + d4.a() + ")[" + zb.l.Y(d4, null, null, null, null, 63) + ']');
            sb2.append(")");
            sb2.append('\n');
            int i11 = 0;
            for (g gVar : this.f9338f) {
                i11++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i11);
                sb4.append("] - ");
                if (gVar != null) {
                    str = gVar.A.toString();
                } else {
                    str = null;
                }
                sb4.append(str);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (gVar != null) {
                    gVar.m(sb2);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void e(g gVar) {
        gVar.getClass();
        ReentrantLock reentrantLock = this.f9335c;
        reentrantLock.lock();
        try {
            this.f9340h.addLast(gVar);
            reentrantLock.unlock();
            this.f9339g.c();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
