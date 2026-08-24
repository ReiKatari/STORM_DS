package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wz3  reason: default package */
/* loaded from: classes.dex */
public final class wz3 implements defpackage.gi7 {
    public final defpackage.op6 a;
    public final defpackage.kj7 b;
    public defpackage.li7 c;
    public final boolean d;
    public boolean e;
    public final defpackage.s94 f;
    public final java.util.concurrent.atomic.AtomicInteger g;
    public defpackage.tu0 h;
    public defpackage.jg1 i;

    public wz3(defpackage.lg0 r3, defpackage.op6 r4, defpackage.kj7 r5, defpackage.ou0 r6) {
            r2 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r2.<init>()
            r2.a = r4
            r2.b = r5
            r4 = 0
            if (r3 == 0) goto L32
            kg0 r0 = defpackage.lg0.g
            r0.getClass()
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES
            r0.getClass()
            qc0 r3 = (defpackage.qc0) r3
            java.lang.Object r3 = r3.c(r0)
            int[] r3 = (int[]) r3
            if (r3 != 0) goto L29
            r3 = r4
            goto L2e
        L29:
            r0 = 6
            boolean r3 = defpackage.fv.m0(r3, r0)
        L2e:
            r0 = 1
            if (r3 != r0) goto L32
            r4 = r0
        L32:
            r2.d = r4
            s94 r3 = new s94
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r3.<init>(r1)
            r2.f = r3
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>(r0)
            r2.g = r3
            if (r4 == 0) goto L53
            vz3 r3 = new vz3
            r3.<init>(r2)
            s37 r2 = r5.e
            r6.a(r3, r2)
        L53:
            return
    }

    public final void a(java.util.List r5) {
            r4 = this;
            boolean r0 = r4.d
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L14
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            tu0 r5 = defpackage.u24.b(r5)
            r4.i = r5
            return
        L14:
            kj7 r0 = r4.b
            o41 r0 = r0.f
            m5 r1 = new m5
            r2 = 21
            r3 = 0
            r1.<init>(r4, r5, r3, r2)
            r5 = 3
            kg1 r5 = defpackage.hv.i(r0, r3, r3, r1, r5)
            r4.i = r5
            return
    }

    @Override // defpackage.gi7
    public final void b(defpackage.li7 r2) {
            r1 = this;
            r1.c = r2
            boolean r0 = r1.e
            if (r0 == 0) goto L13
            r0 = 0
            if (r2 == 0) goto Le
            r2 = 1
            r1.d(r2, r0)
            return
        Le:
            s94 r2 = r1.f
            r1.c(r2, r0)
        L13:
            return
    }

    public final void c(defpackage.s94 r1, int r2) {
            r0 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r0.g
            int r0 = r0.getAndSet(r2)
            if (r0 == r2) goto L1d
            boolean r0 = defpackage.nj2.x()
            if (r0 == 0) goto L16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.f(r0)
            return
        L16:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.g(r0)
        L1d:
            return
    }

    public final defpackage.tu0 d(boolean r9, boolean r10) {
            r8 = this;
            java.lang.String r0 = "CXCP"
            boolean r1 = defpackage.kj2.F(r0)
            if (r1 == 0) goto L19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "LowLightBoostControl#setLowLightBoostAsync: lowLightBoost = "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L19:
            tu0 r5 = new tu0
            r5.<init>()
            boolean r0 = r8.d
            if (r0 != 0) goto L2d
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Low Light Boost is not supported!"
            r8.<init>(r9)
            r5.v0(r8)
            return r5
        L2d:
            kj7 r0 = r8.b
            o41 r0 = r0.f
            t81 r2 = new t81
            r3 = 0
            r4 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r8 = 3
            r9 = 0
            defpackage.hv.L(r0, r9, r9, r2, r8)
            return r5
    }

    @Override // defpackage.gi7
    public final void reset() {
            r2 = this;
            tu0 r0 = r2.h
            if (r0 == 0) goto L9
            java.lang.String r1 = "There is a new enableLowLightBoost being set"
            defpackage.i61.A(r1, r0)
        L9:
            r0 = 0
            r2.h = r0
            r0 = 0
            r1 = 1
            r2.d(r0, r1)
            return
    }
}
