package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y06  reason: default package */
/* loaded from: classes.dex */
public final class y06 implements z06 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final z06 b;

    public y06(z06 z06Var) {
        this.b = z06Var;
    }

    @Override // defpackage.z06
    public final void a(d16 d16Var, a16 a16Var) {
        if (!this.a.get()) {
            this.b.a(d16Var, a16Var);
        }
    }

    public final void b() {
        this.a.set(true);
    }
}
