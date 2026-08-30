package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends h0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t.a f1264a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1265b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i.a f1266c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h.b f1267d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j0 f1268e;

    public e0(j0 j0Var, t.a aVar, AtomicReference atomicReference, i.a aVar2, h.b bVar) {
        this.f1268e = j0Var;
        this.f1264a = aVar;
        this.f1265b = atomicReference;
        this.f1266c = aVar2;
        this.f1267d = bVar;
    }

    @Override // androidx.fragment.app.h0
    public final void a() {
        j0 j0Var = this.f1268e;
        this.f1265b.set(((h.h) this.f1264a.apply(null)).c(j0Var.generateActivityResultKey(), j0Var, this.f1266c, this.f1267d));
    }
}
