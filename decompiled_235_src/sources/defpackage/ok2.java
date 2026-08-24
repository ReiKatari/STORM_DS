package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ok2  reason: default package */
/* loaded from: classes.dex */
public final class ok2 extends d9 {
    public final /* synthetic */ AtomicReference a;

    public ok2(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.d9
    public final void a(Object obj) {
        d9 d9Var = (d9) this.a.get();
        if (d9Var != null) {
            d9Var.a(obj);
        } else {
            i.m("Operation cannot be started before fragment is in created state");
        }
    }
}
