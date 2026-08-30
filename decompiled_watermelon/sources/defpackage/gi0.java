package defpackage;

import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gi0  reason: default package */
/* loaded from: classes.dex */
public final class gi0 implements ci0 {
    public static final boolean c;
    public final fw4 a;
    public final il6 b;

    static {
        boolean z;
        if (oe1.a().b(TorchIsClosedAfterImageCapturingQuirk.class) != null) {
            z = true;
        } else {
            z = false;
        }
        c = z;
    }

    public gi0(je0 je0Var, fw4 fw4Var, n57 n57Var, ew6 ew6Var) {
        je0Var.getClass();
        fw4Var.getClass();
        n57Var.getClass();
        ew6Var.getClass();
        this.a = fw4Var;
        new il6(new di0(je0Var, 1));
        this.b = new il6(new b5(14, this));
    }

    @Override // defpackage.ci0
    public final void a(int i) {
        ((fi0) this.b.getValue()).getClass();
    }
}
