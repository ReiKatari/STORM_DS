package wi;

import fj.e0;
import fj.f0;
import fj.g0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import pi.d0;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements ui.e {

    /* renamed from: g  reason: collision with root package name */
    public static final List f14276g = qi.g.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* renamed from: h  reason: collision with root package name */
    public static final List f14277h = qi.g.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a  reason: collision with root package name */
    public final ti.o f14278a;

    /* renamed from: b  reason: collision with root package name */
    public final ui.g f14279b;

    /* renamed from: c  reason: collision with root package name */
    public final p f14280c;

    /* renamed from: d  reason: collision with root package name */
    public volatile x f14281d;

    /* renamed from: e  reason: collision with root package name */
    public final pi.z f14282e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f14283f;

    public q(pi.x xVar, ti.o oVar, ui.g gVar, p pVar) {
        xVar.getClass();
        pVar.getClass();
        this.f14278a = oVar;
        this.f14279b = gVar;
        this.f14280c = pVar;
        List list = xVar.f11844s;
        pi.z zVar = pi.z.H2_PRIOR_KNOWLEDGE;
        this.f14282e = list.contains(zVar) ? zVar : pi.z.HTTP_2;
    }

    @Override // ui.e
    public final long a(d0 d0Var) {
        if (!ui.f.a(d0Var)) {
            return 0L;
        }
        return qi.g.d(d0Var);
    }

    @Override // ui.e
    public final e0 b(x0 x0Var, long j2) {
        x0Var.getClass();
        x xVar = this.f14281d;
        xVar.getClass();
        return xVar.f14286c0;
    }

    @Override // ui.e
    public final g0 c(d0 d0Var) {
        x xVar = this.f14281d;
        xVar.getClass();
        return xVar.f14285b0;
    }

    @Override // ui.e
    public final void cancel() {
        this.f14283f = true;
        x xVar = this.f14281d;
        if (xVar != null) {
            xVar.e(c.CANCEL);
        }
    }

    @Override // ui.e
    public final void d() {
        x xVar = this.f14281d;
        xVar.getClass();
        xVar.f14286c0.close();
    }

    @Override // ui.e
    public final boolean e() {
        boolean z10;
        x xVar = this.f14281d;
        if (xVar != null) {
            synchronized (xVar) {
                v vVar = xVar.f14285b0;
                if (vVar.B) {
                    if (vVar.R.z()) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // ui.e
    public final void f() {
        this.f14280c.flush();
    }

    @Override // ui.e
    public final f0 g() {
        x xVar = this.f14281d;
        xVar.getClass();
        return xVar;
    }

    @Override // ui.e
    public final ui.d h() {
        return this.f14278a;
    }

    @Override // ui.e
    public final void i(x0 x0Var) {
        boolean z10;
        int i2;
        x xVar;
        x0Var.getClass();
        if (this.f14281d != null) {
            return;
        }
        boolean z11 = false;
        if (((pi.b0) x0Var.f14092e) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        pi.q qVar = (pi.q) x0Var.f14091d;
        ArrayList arrayList = new ArrayList(qVar.size() + 4);
        arrayList.add(new e(e.f14229f, (String) x0Var.f14090c));
        fj.h hVar = e.f14230g;
        pi.r rVar = (pi.r) x0Var.f14089b;
        rVar.getClass();
        String b10 = rVar.b();
        String d4 = rVar.d();
        if (d4 != null) {
            b10 = b10 + '?' + d4;
        }
        arrayList.add(new e(hVar, b10));
        String a10 = qVar.a("Host");
        if (a10 != null) {
            arrayList.add(new e(e.f14232i, a10));
        }
        arrayList.add(new e(e.f14231h, rVar.f11781a));
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String b11 = qVar.b(i10);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = b11.toLowerCase(locale);
            lowerCase.getClass();
            if (!f14276g.contains(lowerCase) || (lowerCase.equals("te") && qVar.d(i10).equals("trailers"))) {
                arrayList.add(new e(lowerCase, qVar.d(i10)));
            }
        }
        p pVar = this.f14280c;
        pVar.getClass();
        boolean z12 = !z10;
        synchronized (pVar.f14273q0) {
            synchronized (pVar) {
                if (pVar.X > 1073741823) {
                    pVar.t(c.REFUSED_STREAM);
                }
                if (!pVar.Y) {
                    i2 = pVar.X;
                    pVar.X = i2 + 2;
                    xVar = new x(i2, pVar, z12, false, null);
                    z11 = (!z10 || pVar.f14271n0 >= pVar.f14272o0 || xVar.R >= xVar.X) ? true : true;
                    if (xVar.h()) {
                        pVar.B.put(Integer.valueOf(i2), xVar);
                    }
                } else {
                    throw new IOException();
                }
            }
            pVar.f14273q0.v(z12, i2, arrayList);
        }
        if (z11) {
            pVar.f14273q0.flush();
        }
        this.f14281d = xVar;
        boolean z13 = this.f14283f;
        x xVar2 = this.f14281d;
        if (!z13) {
            xVar2.getClass();
            xVar2.f14287d0.g(this.f14279b.f13562g);
            x xVar3 = this.f14281d;
            xVar3.getClass();
            xVar3.f14288e0.g(this.f14279b.f13563h);
            return;
        }
        xVar2.getClass();
        xVar2.e(c.CANCEL);
        fj.j.h("Canceled");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (r3 == false) goto L18;
     */
    @Override // ui.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final pi.c0 j(boolean r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.q.j(boolean):pi.c0");
    }
}
