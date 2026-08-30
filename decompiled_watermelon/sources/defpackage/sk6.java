package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sk6  reason: default package */
/* loaded from: classes.dex */
public final class sk6 implements od1, j11 {
    public final /* synthetic */ uk6 A;
    public final ih0 B;
    public ih0 L;
    public lp4 R = lp4.Main;
    public final mp1 X = mp1.A;
    public final /* synthetic */ uk6 Y;

    public sk6(uk6 uk6Var, ih0 ih0Var) {
        this.Y = uk6Var;
        this.A = uk6Var;
        this.B = ih0Var;
    }

    @Override // defpackage.od1
    public final float A0(int i) {
        return this.A.A0(i);
    }

    @Override // defpackage.od1
    public final long B(long j) {
        return this.A.B(j);
    }

    @Override // defpackage.od1
    public final float C(float f) {
        return this.A.b() * f;
    }

    @Override // defpackage.od1
    public final float D0(float f) {
        return f / this.A.b();
    }

    @Override // defpackage.od1
    public final float P(long j) {
        return this.A.P(j);
    }

    @Override // defpackage.od1
    public final int Y(float f) {
        return this.A.Y(f);
    }

    @Override // defpackage.j11
    public final e31 a() {
        return this.X;
    }

    @Override // defpackage.od1
    public final float b() {
        return this.A.b();
    }

    public final Object c(lp4 lp4Var, m00 m00Var) {
        ih0 ih0Var = new ih0(1, nk2.J(m00Var));
        ih0Var.x();
        this.R = lp4Var;
        this.L = ih0Var;
        Object v = ih0Var.v();
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        return v;
    }

    public final long e() {
        uk6 uk6Var = this.Y;
        long i0 = uk6Var.i0(l.P(uk6Var).v0.g());
        long j = uk6Var.t0;
        return (Float.floatToRawIntBits(Math.max((float) RecyclerView.A1, Float.intBitsToFloat((int) (i0 >> 32)) - ((int) (j >> 32))) / 2.0f) << 32) | (Float.floatToRawIntBits(Math.max((float) RecyclerView.A1, Float.intBitsToFloat((int) (i0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f) & 4294967295L);
    }

    public final fa7 f() {
        return l.P(this.Y).v0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, sk6] */
    /* JADX WARN: Type inference failed for: r10v1, types: [c63] */
    /* JADX WARN: Type inference failed for: r10v4, types: [c63] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [aj2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r11, defpackage.aj2 r13, defpackage.k11 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.qk6
            if (r0 == 0) goto L13
            r0 = r14
            qk6 r0 = (defpackage.qk6) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            qk6 r0 = new qk6
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            kd6 r10 = r0.R
            defpackage.me2.a0(r14)     // Catch: java.lang.Throwable -> L29
            goto L6c
        L29:
            r0 = move-exception
            r11 = r0
            goto L72
        L2c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            r10 = 0
            return r10
        L33:
            defpackage.me2.a0(r14)
            r4 = 0
            int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r14 > 0) goto L4d
            ih0 r14 = r10.L
            if (r14 == 0) goto L4d
            mp4 r2 = new mp4
            r2.<init>(r11)
            kc5 r4 = new kc5
            r4.<init>(r2)
            r14.k(r4)
        L4d:
            uk6 r14 = r10.Y
            o31 r14 = r14.F0()
            ba0 r4 = new ba0
            r9 = 2
            r8 = 0
            r7 = r10
            r5 = r11
            r4.<init>(r5, r7, r8, r9)
            r10 = 3
            kd6 r10 = defpackage.tq5.w(r14, r8, r8, r4, r10)
            r0.R = r10     // Catch: java.lang.Throwable -> L29
            r0.Z = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r14 = r13.j(r7, r0)     // Catch: java.lang.Throwable -> L29
            if (r14 != r1) goto L6c
            return r1
        L6c:
            eh0 r11 = defpackage.eh0.B
            r10.i(r11)
            return r14
        L72:
            eh0 r12 = defpackage.eh0.B
            r10.i(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk6.h(long, aj2, k11):java.lang.Object");
    }

    @Override // defpackage.od1
    public final long i0(long j) {
        return this.A.i0(j);
    }

    @Override // defpackage.j11
    public final void k(Object obj) {
        uk6 uk6Var = this.Y;
        synchronized (uk6Var.q0) {
            uk6Var.p0.k(this);
        }
        this.B.k(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(long r6, defpackage.aj2 r8, defpackage.k11 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.rk6
            if (r0 == 0) goto L13
            r0 = r9
            rk6 r0 = (defpackage.rk6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            rk6 r0 = new rk6
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.me2.a0(r9)     // Catch: defpackage.mp4 -> L3b
            return r9
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L2e:
            defpackage.me2.a0(r9)
            r0.Y = r4     // Catch: defpackage.mp4 -> L3b
            java.lang.Object r5 = r5.h(r6, r8, r0)     // Catch: defpackage.mp4 -> L3b
            if (r5 != r1) goto L3a
            return r1
        L3a:
            return r5
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk6.n(long, aj2, k11):java.lang.Object");
    }

    @Override // defpackage.od1
    public final float n0(long j) {
        return this.A.n0(j);
    }

    @Override // defpackage.od1
    public final float o() {
        return this.A.o();
    }

    @Override // defpackage.od1
    public final long v0(float f) {
        return this.A.v0(f);
    }

    @Override // defpackage.od1
    public final long z(float f) {
        return this.A.z(f);
    }
}
