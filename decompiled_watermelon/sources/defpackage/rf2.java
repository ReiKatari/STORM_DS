package defpackage;

import androidx.fragment.app.o;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rf2  reason: default package */
/* loaded from: classes.dex */
public final class rf2 extends tf2 {
    public final /* synthetic */ ij2 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ a9 c;
    public final /* synthetic */ z8 d;
    public final /* synthetic */ o e;

    public rf2(o oVar, ij2 ij2Var, AtomicReference atomicReference, a9 a9Var, z8 z8Var) {
        this.e = oVar;
        this.a = ij2Var;
        this.b = atomicReference;
        this.c = a9Var;
        this.d = z8Var;
    }

    @Override // defpackage.tf2
    public final void a() {
        o oVar = this.e;
        this.b.set(((i9) this.a.apply(null)).d(oVar.generateActivityResultKey(), oVar, this.c, this.d));
    }
}
