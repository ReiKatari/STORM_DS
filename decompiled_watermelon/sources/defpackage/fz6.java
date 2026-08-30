package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fz6  reason: default package */
/* loaded from: classes.dex */
public class fz6 extends dz6 {
    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        return new AtomicBoolean(o83Var.Q());
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        b93Var.f0(((AtomicBoolean) obj).get());
    }
}
