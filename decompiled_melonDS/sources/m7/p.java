package m7;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p implements k7.c0, d0 {

    /* renamed from: a  reason: collision with root package name */
    public final nc.i f9327a;

    /* renamed from: b  reason: collision with root package name */
    public final t7.a f9328b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicInteger f9329c;

    /* renamed from: d  reason: collision with root package name */
    public k7.b0 f9330d;

    public p(mc.p pVar, t7.a aVar) {
        aVar.getClass();
        this.f9327a = (nc.i) pVar;
        this.f9328b = aVar;
        this.f9329c = new AtomicInteger(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r8 == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Type inference failed for: r6v3, types: [nc.i, mc.p] */
    @Override // k7.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, mc.l r7, ec.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof m7.n
            if (r0 == 0) goto L13
            r0 = r8
            m7.n r0 = (m7.n) r0
            int r1 = r0.f9326b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9326b0 = r1
            goto L18
        L13:
            m7.n r0 = new m7.n
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f9326b0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            p7.j.I(r8)
            return r8
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L31:
            mc.l r7 = r0.X
            java.lang.String r6 = r0.R
            p7.j.I(r8)
            goto L49
        L39:
            p7.j.I(r8)
            r0.R = r6
            r0.X = r7
            r0.f9326b0 = r4
            java.lang.Boolean r8 = r5.c(r0)
            if (r8 != r1) goto L49
            goto L65
        L49:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 == 0) goto L67
            m7.o r8 = new m7.o
            r8.<init>(r5, r6, r7, r2)
            r0.R = r2
            r0.X = r2
            r0.f9326b0 = r3
            nc.i r6 = r5.f9327a
            java.lang.Object r6 = r6.j(r8, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            return r6
        L67:
            t7.a r8 = r5.f9328b
            t7.c r6 = r8.T(r6)
            java.lang.Object r7 = r7.k(r6)     // Catch: java.lang.Throwable -> L75
            q8.r.q(r6, r2)
            return r7
        L75:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L77
        L77:
            r8 = move-exception
            q8.r.q(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.p.a(java.lang.String, mc.l, ec.c):java.lang.Object");
    }

    @Override // m7.d0
    public final t7.a b() {
        return this.f9328b;
    }

    @Override // k7.c0
    public final Boolean c(cc.c cVar) {
        boolean z10;
        if (this.f9330d == null && !this.f9328b.x()) {
            z10 = false;
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [nc.i, mc.p] */
    @Override // k7.c0
    public final Object d(k7.b0 b0Var, mc.p pVar, ec.j jVar) {
        Object j2 = this.f9327a.j(new g2.j(this, b0Var, pVar, (cc.c) null), jVar);
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(k7.b0 r9, mc.p r10, ec.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof m7.m
            if (r0 == 0) goto L13
            r0 = r11
            m7.m r0 = (m7.m) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            m7.m r0 = new m7.m
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            java.lang.String r3 = "ROLLBACK TRANSACTION"
            r4 = 0
            java.util.concurrent.atomic.AtomicInteger r5 = r8.f9329c
            r6 = 1
            t7.a r7 = r8.f9328b
            if (r2 == 0) goto L39
            if (r2 != r6) goto L32
            int r6 = r0.R
            p7.j.I(r11)     // Catch: java.lang.Throwable -> L30
            goto L7a
        L30:
            r9 = move-exception
            goto L8e
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r9)
        L37:
            r9 = 0
            return r9
        L39:
            p7.j.I(r11)
            int[] r11 = m7.l.f9325a
            int r2 = r9.ordinal()
            r11 = r11[r2]
            if (r11 == r6) goto L5c
            r2 = 2
            if (r11 == r2) goto L56
            r2 = 3
            if (r11 != r2) goto L52
            java.lang.String r11 = "BEGIN EXCLUSIVE TRANSACTION"
            zb.k.r(r7, r11)
            goto L61
        L52:
            m9.o.o()
            goto L37
        L56:
            java.lang.String r11 = "BEGIN IMMEDIATE TRANSACTION"
            zb.k.r(r7, r11)
            goto L61
        L5c:
            java.lang.String r11 = "BEGIN DEFERRED TRANSACTION"
            zb.k.r(r7, r11)
        L61:
            int r11 = r5.incrementAndGet()
            if (r11 <= 0) goto L69
            r8.f9330d = r9
        L69:
            m7.k r9 = new m7.k     // Catch: java.lang.Throwable -> L30
            r11 = 0
            r9.<init>(r11, r8)     // Catch: java.lang.Throwable -> L30
            r0.R = r6     // Catch: java.lang.Throwable -> L30
            r0.Z = r6     // Catch: java.lang.Throwable -> L30
            java.lang.Object r11 = r10.j(r9, r0)     // Catch: java.lang.Throwable -> L30
            if (r11 != r1) goto L7a
            return r1
        L7a:
            int r9 = r5.decrementAndGet()
            if (r9 != 0) goto L82
            r8.f9330d = r4
        L82:
            if (r6 == 0) goto L8a
            java.lang.String r9 = "END TRANSACTION"
            zb.k.r(r7, r9)
            return r11
        L8a:
            zb.k.r(r7, r3)
            return r11
        L8e:
            throw r9     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            int r11 = r5.decrementAndGet()     // Catch: android.database.SQLException -> L99
            if (r11 != 0) goto L9b
            r8.f9330d = r4     // Catch: android.database.SQLException -> L99
            goto L9b
        L99:
            r11 = move-exception
            goto L9f
        L9b:
            zb.k.r(r7, r3)     // Catch: android.database.SQLException -> L99
            goto La2
        L9f:
            p7.t.a(r9, r11)
        La2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.p.e(k7.b0, mc.p, ec.c):java.lang.Object");
    }
}
