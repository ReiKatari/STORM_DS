package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o74  reason: default package */
/* loaded from: classes.dex */
public final class o74 implements defpackage.n74 {
    public final android.content.Context A;
    public defpackage.o41 B;
    public final defpackage.rs4 L;
    public defpackage.ap6 R;

    public o74(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.A = r2
            rs4 r2 = new rs4
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r0)
            r1.L = r2
            return
    }

    @Override // defpackage.l61
    public final defpackage.l61 D(defpackage.k61 r1) {
            r0 = this;
            l61 r0 = defpackage.jw2.w(r0, r1)
            return r0
    }

    @Override // defpackage.n74
    public final float F() {
            r12 = this;
            ap6 r0 = r12.R
            if (r0 != 0) goto L9f
            android.content.Context r6 = r12.A
            ja4 r8 = defpackage.uv7.a
            monitor-enter(r8)
            java.lang.Object r0 = r8.g(r6)     // Catch: java.lang.Throwable -> L6e
            r9 = 0
            if (r0 != 0) goto L71
            android.content.ContentResolver r2 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = "animator_duration_scale"
            android.net.Uri r3 = android.provider.Settings.Global.getUriFor(r0)     // Catch: java.lang.Throwable -> L6e
            r0 = -1
            r1 = 6
            v80 r5 = defpackage.nb3.c(r0, r9, r9, r1)     // Catch: java.lang.Throwable -> L6e
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L6e
            android.os.Handler r0 = defpackage.uj2.u(r0)     // Catch: java.lang.Throwable -> L6e
            x71 r4 = new x71     // Catch: java.lang.Throwable -> L6e
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L6e
            ja1 r1 = new ja1     // Catch: java.lang.Throwable -> L6e
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6e
            g21 r0 = new g21     // Catch: java.lang.Throwable -> L6e
            r2 = 7
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6e
            o41 r1 = new o41     // Catch: java.lang.Throwable -> L6e
            gu6 r2 = defpackage.oi2.c()     // Catch: java.lang.Throwable -> L6e
            xe1 r3 = defpackage.xk1.a     // Catch: java.lang.Throwable -> L6e
            jv2 r3 = defpackage.e04.a     // Catch: java.lang.Throwable -> L6e
            l61 r2 = defpackage.jw2.y(r2, r3)     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L6e
            mp6 r2 = new mp6     // Catch: java.lang.Throwable -> L6e
            r3 = 0
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.<init>(r3, r10)     // Catch: java.lang.Throwable -> L6e
            android.content.ContentResolver r3 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "animator_duration_scale"
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = android.provider.Settings.Global.getFloat(r3, r4, r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> L6e
            de5 r0 = defpackage.f04.R(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L6e
            r8.m(r6, r0)     // Catch: java.lang.Throwable -> L6e
            goto L71
        L6e:
            r0 = move-exception
            r12 = r0
            goto L9d
        L71:
            rp6 r0 = (defpackage.rp6) r0     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r8)
            java.lang.Object r1 = r0.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            rs4 r2 = r12.L
            r2.i(r1)
            o41 r1 = r12.B
            if (r1 == 0) goto L96
            xd1 r2 = new xd1
            r3 = 27
            r2.<init>(r0, r12, r9, r3)
            r0 = 3
            ap6 r0 = defpackage.hv.L(r1, r9, r9, r2, r0)
            r12.R = r0
            goto L9f
        L96:
            java.lang.String r12 = "MotionDurationScale scale factor requested before recomposer loop start"
            defpackage.i.m(r12)
            r12 = 0
            return r12
        L9d:
            monitor-exit(r8)
            throw r12
        L9f:
            rs4 r12 = r12.L
            float r12 = r12.h()
            return r12
    }

    @Override // defpackage.l61
    public final defpackage.l61 N(defpackage.l61 r1) {
            r0 = this;
            l61 r0 = defpackage.jw2.y(r0, r1)
            return r0
    }

    @Override // defpackage.l61
    public final defpackage.j61 Z(defpackage.k61 r1) {
            r0 = this;
            j61 r0 = defpackage.jw2.p(r0, r1)
            return r0
    }

    @Override // defpackage.l61
    public final java.lang.Object x(defpackage.eo2 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r0 = r1.o(r2, r0)
            return r0
    }
}
