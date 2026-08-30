package xg;

import android.net.Uri;
import androidx.lifecycle.s0;
import androidx.lifecycle.y0;
import cd.e1;
import cd.q;
import cd.q1;
import cd.x0;
import kf.c0;
import me.magnum.melonds.MelonDSiNand;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends y0 {

    /* renamed from: b  reason: collision with root package name */
    public final kf.g f14607b;

    /* renamed from: c  reason: collision with root package name */
    public final cf.d f14608c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f14609d;

    /* renamed from: e  reason: collision with root package name */
    public final q1 f14610e;

    /* renamed from: f  reason: collision with root package name */
    public final q1 f14611f;

    /* renamed from: g  reason: collision with root package name */
    public final q1 f14612g;

    /* renamed from: h  reason: collision with root package name */
    public final cd.y0 f14613h;

    /* renamed from: i  reason: collision with root package name */
    public final e1 f14614i;

    /* renamed from: j  reason: collision with root package name */
    public final x0 f14615j;

    /* renamed from: k  reason: collision with root package name */
    public final e1 f14616k;

    /* renamed from: l  reason: collision with root package name */
    public final x0 f14617l;

    public h(kf.g gVar, cf.d dVar, c0 c0Var) {
        gVar.getClass();
        dVar.getClass();
        c0Var.getClass();
        this.f14607b = gVar;
        this.f14608c = dVar;
        this.f14609d = c0Var;
        q1 c4 = q.c(yg.d.f14821a);
        this.f14610e = c4;
        this.f14611f = c4;
        q1 c10 = q.c(Boolean.FALSE);
        this.f14612g = c10;
        this.f14613h = new cd.y0(c10);
        bd.a aVar = bd.a.DROP_OLDEST;
        e1 b10 = q.b(0, 1, aVar, 1);
        this.f14614i = b10;
        this.f14615j = new x0(b10);
        e1 b11 = q.b(0, 1, aVar, 1);
        this.f14616k = b11;
        this.f14617l = new x0(b11);
        f();
    }

    @Override // androidx.lifecycle.y0
    public final void d() {
        kf.g gVar = this.f14607b;
        if (gVar.f8221e.decrementAndGet() == 0) {
            gVar.f8222f.set(false);
            MelonDSiNand.f9465a.closeNand();
        }
    }

    public final void e(Uri uri) {
        uri.getClass();
        Boolean bool = Boolean.TRUE;
        q1 q1Var = this.f14612g;
        q1Var.getClass();
        q1Var.k(null, bool);
        x.v(s0.h(this), null, null, new f(this, uri, null, 1), 3);
    }

    public final void f() {
        oe.h hVar = this.f14609d.c().f10937b;
        if (hVar != oe.h.VALID) {
            yg.b bVar = new yg.b(hVar);
            q1 q1Var = this.f14610e;
            q1Var.getClass();
            q1Var.k(null, bVar);
            return;
        }
        x.v(s0.h(this), null, null, new g(this, null, 1), 3);
    }
}
