package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ww6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ww6 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ kx6 B;

    public /* synthetic */ ww6(kx6 kx6Var, int i) {
        this.A = i;
        this.B = kx6Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        boolean z;
        int i = this.A;
        kx6 kx6Var = this.B;
        switch (i) {
            case 0:
                if (b53.x(kx6Var.d.getValue(), kx6Var.a.f()) && kx6Var.g.h() == Long.MIN_VALUE && !((Boolean) kx6Var.h.getValue()).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Long.valueOf(kx6Var.b());
        }
    }
}
