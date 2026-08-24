package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mc6  reason: default package */
/* loaded from: classes.dex */
public final class mc6 implements nc6 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final nc6 b;

    public mc6(nc6 nc6Var) {
        this.b = nc6Var;
    }

    @Override // defpackage.nc6
    public final void a(rc6 rc6Var, oc6 oc6Var) {
        if (!this.a.get()) {
            this.b.a(rc6Var, oc6Var);
        }
    }

    public final void b() {
        this.a.set(true);
    }
}
