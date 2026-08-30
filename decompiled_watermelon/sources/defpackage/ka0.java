package defpackage;

import android.hardware.camera2.CameraManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ka0  reason: default package */
/* loaded from: classes.dex */
public final class ka0 implements AutoCloseable {
    public final ct6 A;
    public final String B;
    public final CameraManager L;
    public final g11 R;
    public final aw X;
    public final ee6 Y;
    public final q45 Z;
    public final c46 c0;
    public final o45 d0;
    public final h90 e0;
    public final kd6 f0;

    public ka0(fw4 fw4Var, ct6 ct6Var, String str, c63 c63Var) {
        fw4Var.getClass();
        str.getClass();
        this.A = ct6Var;
        this.B = str;
        this.L = (CameraManager) fw4Var.get();
        g11 c = iq2.c(se.O(new e63(c63Var), se.O(ct6Var.h, new j31("CXCP-CameraStatusMonitor"))));
        this.R = c;
        this.X = w81.e(false);
        ee6 a = fe6.a(yf0.a);
        this.Y = a;
        this.Z = new q45(a);
        c46 b = d46.b(0, 0, null, 7);
        this.c0 = b;
        this.d0 = new o45(b);
        this.e0 = se.k(new y(this, (j11) null, 11));
        this.f0 = tq5.w(c, null, null, new a6(this, null, 5), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.X.a()) {
            this.f0.i(null);
            iq2.f(this.R, null);
        }
    }
}
