package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pf2  reason: default package */
/* loaded from: classes.dex */
public final class pf2 extends c9 {
    public final /* synthetic */ AtomicReference a;

    public pf2(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.c9
    public final void a(Object obj) {
        c9 c9Var = (c9) this.a.get();
        if (c9Var != null) {
            c9Var.a(obj);
        } else {
            i.n("Operation cannot be started before fragment is in created state");
        }
    }
}
