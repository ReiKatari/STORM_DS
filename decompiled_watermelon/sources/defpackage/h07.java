package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h07  reason: default package */
/* loaded from: classes.dex */
public class h07 extends dz6 {
    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        try {
            return new AtomicInteger(o83Var.T());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        b93Var.R(((AtomicInteger) obj).get());
    }
}
