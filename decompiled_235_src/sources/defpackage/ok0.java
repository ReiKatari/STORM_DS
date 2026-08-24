package defpackage;

import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ok0  reason: default package */
/* loaded from: classes.dex */
public final class ok0 implements kk0 {
    public static final boolean c;
    public final n55 a;
    public final ex6 b;

    static {
        boolean z;
        if (si1.a().b(TorchIsClosedAfterImageCapturingQuirk.class) != null) {
            z = true;
        } else {
            z = false;
        }
        c = z;
    }

    public ok0(sg0 sg0Var, n55 n55Var, kj7 kj7Var, r87 r87Var) {
        sg0Var.getClass();
        n55Var.getClass();
        kj7Var.getClass();
        r87Var.getClass();
        this.a = n55Var;
        new ex6(new lk0(sg0Var, 1));
        this.b = new ex6(new a5(this, 14));
    }

    @Override // defpackage.kk0
    public final void a(int i) {
        ((nk0) this.b.getValue()).getClass();
    }
}
