package ti;

import a7.v;
import d0.i1;
import h1.b1;
import j0.o1;
import java.net.Proxy;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import pi.f0;
import pi.g0;
import pi.h0;
import pi.z;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final si.c f13248a;

    /* renamed from: b  reason: collision with root package name */
    public final p f13249b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13250c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13251d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13252e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13253f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13254g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13255h;

    /* renamed from: i  reason: collision with root package name */
    public final pi.a f13256i;

    /* renamed from: j  reason: collision with root package name */
    public final rd.k f13257j;

    /* renamed from: k  reason: collision with root package name */
    public final n f13258k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f13259l;
    public b1 m;

    /* renamed from: n  reason: collision with root package name */
    public i1 f13260n;

    /* renamed from: o  reason: collision with root package name */
    public h0 f13261o;

    /* renamed from: p  reason: collision with root package name */
    public final zb.j f13262p;

    public q(si.c cVar, p pVar, int i2, int i10, int i11, int i12, boolean z10, boolean z11, pi.a aVar, rd.k kVar, n nVar, x0 x0Var) {
        cVar.getClass();
        pVar.getClass();
        kVar.getClass();
        this.f13248a = cVar;
        this.f13249b = pVar;
        this.f13250c = i2;
        this.f13251d = i10;
        this.f13252e = i11;
        this.f13253f = i12;
        this.f13254g = z10;
        this.f13255h = z11;
        this.f13256i = aVar;
        this.f13257j = kVar;
        this.f13258k = nVar;
        this.f13259l = !nc.k.a((String) x0Var.f14090c, "GET");
        this.f13262p = new zb.j();
    }

    public final boolean a(o oVar) {
        i1 i1Var;
        h0 h0Var;
        if (this.f13262p.isEmpty() && this.f13261o == null) {
            if (oVar != null) {
                synchronized (oVar) {
                    h0Var = null;
                    if (oVar.f13239l == 0 && oVar.f13237j && qi.g.a(oVar.f13230c.f11725a.f11665h, this.f13256i.f11665h)) {
                        h0Var = oVar.f13230c;
                    }
                }
                if (h0Var != null) {
                    this.f13261o = h0Var;
                    return true;
                }
            }
            b1 b1Var = this.m;
            if ((b1Var == null || b1Var.f5858a >= b1Var.f5859b.size()) && (i1Var = this.f13260n) != null) {
                return i1Var.l();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Type inference failed for: r0v11, types: [h1.b1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ti.t b() {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.q.b():ti.t");
    }

    public final c c(h0 h0Var, ArrayList arrayList) {
        h0Var.getClass();
        pi.a aVar = h0Var.f11725a;
        if (aVar.f11660c == null) {
            if (aVar.f11667j.contains(pi.m.f11756f)) {
                String str = h0Var.f11725a.f11665h.f11784d;
                zi.f fVar = zi.f.f15151a;
                if (!zi.f.f15151a.h(str)) {
                    throw new UnknownServiceException(kc.a.g("CLEARTEXT communication to ", str, " not permitted by network security policy"));
                }
            } else {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
        } else if (aVar.f11666i.contains(z.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        x0 x0Var = null;
        if (h0Var.f11726b.type() == Proxy.Type.HTTP) {
            pi.a aVar2 = h0Var.f11725a;
            if (aVar2.f11660c != null || aVar2.f11666i.contains(z.H2_PRIOR_KNOWLEDGE)) {
                v vVar = new v(7);
                pi.r rVar = h0Var.f11725a.f11665h;
                rVar.getClass();
                vVar.A = rVar;
                vVar.u("CONNECT", null);
                pi.a aVar3 = h0Var.f11725a;
                vVar.s("Host", qi.g.h(aVar3.f11665h, true));
                vVar.s("Proxy-Connection", "Keep-Alive");
                vVar.s("User-Agent", "okhttp/5.3.2");
                x0Var = new x0(vVar);
                f0 f0Var = g0.B;
                o1 o1Var = new o1(3, false);
                z.HTTP_1_1.getClass();
                p7.t.r("Proxy-Authenticate");
                p7.t.s("OkHttp-Preemptive", "Proxy-Authenticate");
                o1Var.s("Proxy-Authenticate");
                p7.t.e(o1Var, "Proxy-Authenticate", "OkHttp-Preemptive");
                o1Var.f();
                f0Var.getClass();
                aVar3.f11663f.getClass();
            }
        }
        return new c(this.f13248a, this.f13249b, this.f13250c, this.f13251d, this.f13252e, this.f13253f, this.f13254g, this.f13258k, this, h0Var, arrayList, x0Var, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r9 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ti.r d(ti.c r11, java.util.List r12) {
        /*
            r10 = this;
            ti.p r0 = r10.f13249b
            boolean r1 = r10.f13259l
            pi.a r2 = r10.f13256i
            ti.n r3 = r10.f13258k
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.d()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f13247d
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L21:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L69
            java.lang.Object r7 = r0.next()
            ti.o r7 = (ti.o) r7
            r7.getClass()
            monitor-enter(r7)
            if (r6 == 0) goto L41
            wi.p r9 = r7.f13236i     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L3a
            r9 = r5
            goto L3b
        L3a:
            r9 = r4
        L3b:
            if (r9 != 0) goto L41
        L3d:
            r9 = r4
            goto L4c
        L3f:
            r11 = move-exception
            goto L67
        L41:
            boolean r9 = r7.d(r2, r12)     // Catch: java.lang.Throwable -> L3f
            if (r9 != 0) goto L48
            goto L3d
        L48:
            r3.b(r7)     // Catch: java.lang.Throwable -> L3f
            r9 = r5
        L4c:
            monitor-exit(r7)
            if (r9 == 0) goto L21
            boolean r9 = r7.f(r1)
            if (r9 == 0) goto L56
            goto L6a
        L56:
            monitor-enter(r7)
            r7.f13237j = r5     // Catch: java.lang.Throwable -> L64
            java.net.Socket r8 = r3.l()     // Catch: java.lang.Throwable -> L64
            monitor-exit(r7)
            if (r8 == 0) goto L21
            qi.g.b(r8)
            goto L21
        L64:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L67:
            monitor-exit(r7)
            throw r11
        L69:
            r7 = r8
        L6a:
            if (r7 != 0) goto L6d
            return r8
        L6d:
            if (r11 == 0) goto L7a
            pi.h0 r12 = r11.f13199j
            r10.f13261o = r12
            java.net.Socket r11 = r11.f13205q
            if (r11 == 0) goto L7a
            qi.g.b(r11)
        L7a:
            ti.r r11 = new ti.r
            r11.<init>(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.q.d(ti.c, java.util.List):ti.r");
    }
}
