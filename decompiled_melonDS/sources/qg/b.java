package qg;

import androidx.lifecycle.y0;
import cc.c;
import cd.e1;
import cd.q;
import cd.q1;
import cd.x0;
import cf.d;
import java.util.ArrayList;
import kf.s0;
import yb.n;
import zc.l1;
import zc.x;
import zh.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b extends y0 {

    /* renamed from: b  reason: collision with root package name */
    public final cf.b f12531b;

    /* renamed from: c  reason: collision with root package name */
    public final d f12532c;

    /* renamed from: d  reason: collision with root package name */
    public final q1 f12533d;

    /* renamed from: e  reason: collision with root package name */
    public final n f12534e;

    /* renamed from: f  reason: collision with root package name */
    public final e1 f12535f;

    /* renamed from: g  reason: collision with root package name */
    public final x0 f12536g;

    /* renamed from: h  reason: collision with root package name */
    public l1 f12537h;

    public b(cf.b bVar, d dVar) {
        bVar.getClass();
        dVar.getClass();
        this.f12531b = bVar;
        this.f12532c = dVar;
        this.f12533d = q.c(u.f15139a);
        this.f12534e = new n(new s0(10, this));
        e1 b10 = q.b(0, 1, bd.a.DROP_OLDEST, 1);
        this.f12535f = b10;
        this.f12536g = new x0(b10);
    }

    public abstract Object e(ArrayList arrayList, c cVar);

    public abstract ze.a f();

    public final void g() {
        l1 l1Var = this.f12537h;
        if (l1Var != null) {
            l1Var.i(null);
        }
        this.f12537h = x.v(androidx.lifecycle.s0.h(this), null, null, new a(this, null), 3);
    }
}
