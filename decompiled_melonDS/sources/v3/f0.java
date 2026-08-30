package v3;

import b4.z2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 implements x4.c, cc.c {
    public final /* synthetic */ h0 A;
    public final zc.h B;
    public zc.h L;
    public l R = l.Main;
    public final cc.h X = cc.h.A;
    public final /* synthetic */ h0 Y;

    public f0(h0 h0Var, zc.h hVar) {
        this.Y = h0Var;
        this.A = h0Var;
        this.B = hVar;
    }

    @Override // x4.c
    public final int G(long j2) {
        return this.A.G(j2);
    }

    @Override // x4.c
    public final float I(long j2) {
        return this.A.I(j2);
    }

    @Override // x4.c
    public final int O(float f8) {
        return this.A.O(f8);
    }

    @Override // x4.c
    public final long W(long j2) {
        return this.A.W(j2);
    }

    public final Object a(l lVar, ec.a aVar) {
        zc.h hVar = new zc.h(1, pc.a.A(aVar));
        hVar.v();
        this.R = lVar;
        this.L = hVar;
        Object u4 = hVar.u();
        dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
        return u4;
    }

    @Override // x4.c
    public final float b() {
        return this.A.b();
    }

    @Override // x4.c
    public final float c0(long j2) {
        return this.A.c0(j2);
    }

    public final long d() {
        h0 h0Var = this.Y;
        long W = h0Var.W(a4.l.t(h0Var).f297v0.g());
        long j2 = h0Var.f13667s0;
        return (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (W >> 32)) - ((int) (j2 >> 32))) / 2.0f) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (W & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f) & 4294967295L);
    }

    @Override // cc.c
    public final cc.g g() {
        return this.X;
    }

    @Override // cc.c
    public final void h(Object obj) {
        h0 h0Var = this.Y;
        synchronized (h0Var.p0) {
            h0Var.f13664o0.j(this);
        }
        this.B.h(obj);
    }

    @Override // x4.c
    public final float j() {
        return this.A.j();
    }

    public final z2 k() {
        return a4.l.t(this.Y).f297v0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [zc.y0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [zc.y0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [mc.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(long r7, mc.p r9, ec.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof v3.d0
            if (r0 == 0) goto L13
            r0 = r10
            v3.d0 r0 = (v3.d0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            v3.d0 r0 = new v3.d0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            zc.l1 r7 = r0.R
            p7.j.I(r10)     // Catch: java.lang.Throwable -> L29
            goto L68
        L29:
            r8 = move-exception
            goto L6e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r7 = 0
            return r7
        L32:
            p7.j.I(r10)
            r4 = 0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L4c
            zc.h r10 = r6.L
            if (r10 == 0) goto L4c
            v3.m r2 = new v3.m
            r2.<init>(r7)
            yb.k r4 = new yb.k
            r4.<init>(r2)
            r10.h(r4)
        L4c:
            v3.h0 r10 = r6.Y
            zc.u r10 = r10.C0()
            ah.y0 r2 = new ah.y0
            r4 = 0
            r2.<init>(r7, r6, r4)
            r7 = 3
            zc.l1 r7 = zc.x.v(r10, r4, r4, r2, r7)
            r0.R = r7     // Catch: java.lang.Throwable -> L29
            r0.Z = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r9.j(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r10 != r1) goto L68
            return r1
        L68:
            v3.b r8 = v3.b.B
            r7.i(r8)
            return r10
        L6e:
            v3.b r9 = v3.b.B
            r7.i(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.f0.l(long, mc.p, ec.c):java.lang.Object");
    }

    @Override // x4.c
    public final long m0(float f8) {
        return this.A.m0(f8);
    }

    @Override // x4.c
    public final long r(float f8) {
        return this.A.r(f8);
    }

    @Override // x4.c
    public final long t(long j2) {
        return this.A.t(j2);
    }

    @Override // x4.c
    public final float t0(int i2) {
        return this.A.t0(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(long r5, mc.p r7, ec.a r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof v3.e0
            if (r0 == 0) goto L13
            r0 = r8
            v3.e0 r0 = (v3.e0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            v3.e0 r0 = new v3.e0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r8)     // Catch: v3.m -> L3b
            return r8
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L2e:
            p7.j.I(r8)
            r0.Y = r3     // Catch: v3.m -> L3b
            java.lang.Object r5 = r4.l(r5, r7, r0)     // Catch: v3.m -> L3b
            if (r5 != r1) goto L3a
            return r1
        L3a:
            return r5
        L3b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.f0.u(long, mc.p, ec.a):java.lang.Object");
    }

    @Override // x4.c
    public final float v(float f8) {
        return this.A.b() * f8;
    }

    @Override // x4.c
    public final float x0(float f8) {
        return f8 / this.A.b();
    }
}
