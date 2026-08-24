package defpackage;

import android.hardware.camera2.CameraManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sc0  reason: default package */
/* loaded from: classes.dex */
public final class sc0 implements AutoCloseable {
    public final t57 A;
    public final String B;
    public final CameraManager L;
    public final o41 R;
    public final sw X;
    public final tp6 Y;
    public final de5 Z;
    public final of6 d0;
    public final be5 e0;
    public final pb0 f0;
    public final ap6 g0;

    public sc0(n55 n55Var, t57 t57Var, String str, rc3 rc3Var) {
        n55Var.getClass();
        str.getClass();
        this.A = t57Var;
        this.B = str;
        this.L = (CameraManager) n55Var.get();
        o41 i = g04.i(jw2.y(new tc3(rc3Var), jw2.y(t57Var.h, new r61("CXCP-CameraStatusMonitor"))));
        this.R = i;
        this.X = g04.s(false);
        tp6 a = up6.a(hi0.a);
        this.Y = a;
        this.Z = new de5(a);
        of6 b = pf6.b(0, 0, null, 7);
        this.d0 = b;
        this.e0 = new be5(b);
        this.f0 = f04.p(new z(this, (r41) null, 11));
        this.g0 = hv.L(i, null, null, new a6(this, null, 5), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.X.a()) {
            this.g0.h(null);
            g04.x(this.R, null);
        }
    }
}
