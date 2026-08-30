package z1;

import android.view.ActionMode;
import android.view.View;
import b4.i3;
import f1.f1;
import f1.j1;
import yb.y;
import z2.u;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements b2.h {

    /* renamed from: a  reason: collision with root package name */
    public final View f14867a;

    /* renamed from: b  reason: collision with root package name */
    public final mc.l f14868b;

    /* renamed from: c  reason: collision with root package name */
    public final mc.a f14869c;

    /* renamed from: d  reason: collision with root package name */
    public final j1 f14870d = new j1();

    /* renamed from: e  reason: collision with root package name */
    public final u f14871e = new u(new a(this, 0));

    /* renamed from: f  reason: collision with root package name */
    public final a f14872f = new a(this, 1);

    /* renamed from: g  reason: collision with root package name */
    public final a f14873g = new a(this, 2);

    /* renamed from: h  reason: collision with root package name */
    public ActionMode f14874h;

    /* renamed from: i  reason: collision with root package name */
    public a0.i f14875i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f14876j;

    public f(View view, mc.l lVar, mc.a aVar) {
        this.f14867a = view;
        this.f14868b = lVar;
        this.f14869c = aVar;
    }

    @Override // b2.h
    public final Object a(b2.g gVar, ec.j jVar) {
        b2.c cVar = new b2.c(this, gVar, null, 5);
        f1 f1Var = f1.Default;
        j1 j1Var = this.f14870d;
        j1Var.getClass();
        Object g10 = x.g(new i3(f1Var, j1Var, cVar, (cc.c) null), jVar);
        if (g10 == dc.a.COROUTINE_SUSPENDED) {
            return g10;
        }
        return y.f14813a;
    }
}
