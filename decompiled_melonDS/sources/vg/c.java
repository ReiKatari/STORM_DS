package vg;

import androidx.lifecycle.s0;
import androidx.lifecycle.y0;
import cd.e1;
import cd.x0;
import kf.c0;
import me.magnum.melonds.domain.model.ConsoleType;
import mh.m;
import p7.o;
import p7.t;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends y0 {

    /* renamed from: b  reason: collision with root package name */
    public final b9.e f13831b;

    /* renamed from: c  reason: collision with root package name */
    public final e1 f13832c;

    /* renamed from: d  reason: collision with root package name */
    public final x0 f13833d;

    /* renamed from: e  reason: collision with root package name */
    public o f13834e;

    public c(b9.e eVar) {
        this.f13831b = eVar;
        e1 b10 = aj.g.b();
        this.f13832c = b10;
        this.f13833d = new x0(b10);
    }

    public final void e() {
        o oVar = this.f13834e;
        if (oVar != null) {
            if (oVar instanceof b) {
                ze.a aVar = ((b) oVar).f13830c;
                aVar.getClass();
                this.f13834e = new b(aVar);
                x.v(s0.h(this), null, null, new m(this, aVar, null, 15), 3);
            } else if (oVar instanceof a) {
                f(((a) oVar).f13829c);
            } else {
                m9.o.o();
            }
        }
    }

    public final void f(ConsoleType consoleType) {
        t bVar;
        consoleType.getClass();
        this.f13834e = new a(consoleType);
        b9.e eVar = this.f13831b;
        eVar.getClass();
        oe.i b10 = ((c0) eVar.B).b(consoleType);
        if (b10.f10937b != oe.h.VALID) {
            bVar = new te.a(b10);
        } else {
            bVar = new te.b(consoleType);
        }
        this.f13832c.p(new wg.a(bVar));
    }
}
