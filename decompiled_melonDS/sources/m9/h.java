package m9;

import ah.m1;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import androidx.lifecycle.x;
import j0.o1;
import java.util.LinkedHashMap;
import java.util.List;
import zb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9386a;

    /* renamed from: b  reason: collision with root package name */
    public c f9387b;

    /* renamed from: c  reason: collision with root package name */
    public Object f9388c;

    /* renamed from: d  reason: collision with root package name */
    public o9.a f9389d;

    /* renamed from: e  reason: collision with root package name */
    public i f9390e;

    /* renamed from: f  reason: collision with root package name */
    public n9.d f9391f;

    /* renamed from: g  reason: collision with root package name */
    public final List f9392g;

    /* renamed from: h  reason: collision with root package name */
    public p9.e f9393h;

    /* renamed from: i  reason: collision with root package name */
    public final o1 f9394i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap f9395j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9396k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f9397l;
    public final m1 m;

    /* renamed from: n  reason: collision with root package name */
    public n9.h f9398n;

    /* renamed from: o  reason: collision with root package name */
    public n9.f f9399o;

    /* renamed from: p  reason: collision with root package name */
    public androidx.lifecycle.r f9400p;

    /* renamed from: q  reason: collision with root package name */
    public n9.h f9401q;

    /* renamed from: r  reason: collision with root package name */
    public n9.f f9402r;

    public h(j jVar, Context context) {
        this.f9386a = context;
        this.f9387b = jVar.A;
        this.f9388c = jVar.f9404b;
        this.f9389d = jVar.f9405c;
        this.f9390e = jVar.f9406d;
        d dVar = jVar.f9427z;
        this.f9391f = dVar.f9380d;
        this.f9392g = jVar.f9409g;
        this.f9393h = dVar.f9379c;
        this.f9394i = jVar.f9411i.c();
        this.f9395j = v.J(jVar.f9412j.f9451a);
        this.f9396k = jVar.f9413k;
        this.f9397l = jVar.f9415n;
        this.m = new m1(jVar.f9426y);
        this.f9398n = dVar.f9377a;
        this.f9399o = dVar.f9378b;
        if (jVar.f9403a == context) {
            this.f9400p = jVar.f9423v;
            this.f9401q = jVar.f9424w;
            this.f9402r = jVar.f9425x;
            return;
        }
        this.f9400p = null;
        this.f9401q = null;
        this.f9402r = null;
    }

    public final j a() {
        pi.q qVar;
        r rVar;
        n9.h hVar;
        p pVar;
        n9.i iVar;
        Object obj = this.f9388c;
        if (obj == null) {
            obj = l.f9428a;
        }
        Object obj2 = obj;
        o9.a aVar = this.f9389d;
        i iVar2 = this.f9390e;
        c cVar = this.f9387b;
        Bitmap.Config config = cVar.f9369g;
        n9.d dVar = this.f9391f;
        if (dVar == null) {
            dVar = cVar.f9368f;
        }
        n9.d dVar2 = dVar;
        p9.e eVar = this.f9393h;
        if (eVar == null) {
            eVar = cVar.f9367e;
        }
        p9.e eVar2 = eVar;
        o1 o1Var = this.f9394i;
        if (o1Var != null) {
            qVar = o1Var.f();
        } else {
            qVar = null;
        }
        if (qVar == null) {
            qVar = q9.g.f12395c;
        } else {
            Bitmap.Config[] configArr = q9.g.f12393a;
        }
        pi.q qVar2 = qVar;
        LinkedHashMap linkedHashMap = this.f9395j;
        if (linkedHashMap != null) {
            rVar = new r(p7.a.B(linkedHashMap));
        } else {
            rVar = null;
        }
        if (rVar == null) {
            rVar = r.f9450b;
        }
        r rVar2 = rVar;
        c cVar2 = this.f9387b;
        boolean z10 = cVar2.f9370h;
        boolean z11 = cVar2.f9371i;
        b bVar = cVar2.m;
        b bVar2 = cVar2.f9375n;
        b bVar3 = cVar2.f9376o;
        zc.q qVar3 = cVar2.f9363a;
        zc.q qVar4 = cVar2.f9364b;
        zc.q qVar5 = cVar2.f9365c;
        zc.q qVar6 = cVar2.f9366d;
        androidx.lifecycle.r rVar3 = this.f9400p;
        Context context = this.f9386a;
        if (rVar3 == null) {
            Context context2 = context;
            while (true) {
                if (context2 instanceof x) {
                    rVar3 = ((x) context2).getLifecycle();
                    break;
                } else if (!(context2 instanceof ContextWrapper)) {
                    rVar3 = null;
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rVar3 == null) {
                rVar3 = g.f9384b;
            }
        }
        androidx.lifecycle.r rVar4 = rVar3;
        n9.h hVar2 = this.f9398n;
        if (hVar2 == null) {
            n9.h hVar3 = this.f9401q;
            if (hVar3 == null) {
                hVar3 = new n9.c(context);
            }
            hVar = hVar3;
        } else {
            hVar = hVar2;
        }
        n9.f fVar = this.f9399o;
        if (fVar == null && (fVar = this.f9402r) == null) {
            if (hVar2 instanceof n9.i) {
                iVar = (n9.i) hVar2;
            } else {
                iVar = null;
            }
            if (iVar == null) {
                fVar = n9.f.FIT;
            } else {
                throw null;
            }
        }
        n9.f fVar2 = fVar;
        m1 m1Var = this.m;
        if (m1Var != null) {
            pVar = new p(p7.a.B(m1Var.f798b));
        } else {
            pVar = null;
        }
        if (pVar == null) {
            pVar = p.B;
        }
        return new j(context, obj2, aVar, iVar2, config, dVar2, this.f9392g, eVar2, qVar2, rVar2, this.f9396k, z10, z11, this.f9397l, bVar, bVar2, bVar3, qVar3, qVar4, qVar5, qVar6, rVar4, hVar, fVar2, pVar, new d(this.f9398n, this.f9399o, this.f9393h, this.f9391f), this.f9387b);
    }

    public final void b(boolean z10) {
        int i2;
        p9.e eVar;
        if (z10) {
            i2 = 100;
        } else {
            i2 = 0;
        }
        if (i2 > 0) {
            eVar = new p9.a(i2);
        } else {
            eVar = p9.e.f11523a;
        }
        this.f9393h = eVar;
    }

    public h(Context context) {
        this.f9386a = context;
        this.f9387b = q9.e.f12391a;
        this.f9388c = null;
        this.f9389d = null;
        this.f9390e = null;
        this.f9391f = null;
        this.f9392g = zb.q.A;
        this.f9393h = null;
        this.f9394i = null;
        this.f9395j = null;
        this.f9396k = true;
        this.f9397l = true;
        this.m = null;
        this.f9398n = null;
        this.f9399o = null;
        this.f9400p = null;
        this.f9401q = null;
        this.f9402r = null;
    }
}
