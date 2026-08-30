package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final w1 f3523a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3524b;

    /* renamed from: c  reason: collision with root package name */
    public final k f3525c;

    /* renamed from: d  reason: collision with root package name */
    public final n2.f1 f3526d;

    /* renamed from: e  reason: collision with root package name */
    public final n2.f1 f3527e;

    /* renamed from: f  reason: collision with root package name */
    public final m0 f3528f;

    /* renamed from: g  reason: collision with root package name */
    public final a1 f3529g;

    /* renamed from: h  reason: collision with root package name */
    public final p f3530h;

    /* renamed from: i  reason: collision with root package name */
    public final p f3531i;

    /* renamed from: j  reason: collision with root package name */
    public final p f3532j;

    /* renamed from: k  reason: collision with root package name */
    public final p f3533k;

    public c(Object obj, w1 w1Var, Object obj2) {
        p pVar;
        p pVar2;
        this.f3523a = w1Var;
        this.f3524b = obj2;
        k kVar = new k(w1Var, obj, null, 60);
        this.f3525c = kVar;
        this.f3526d = n2.s.w(Boolean.FALSE);
        this.f3527e = n2.s.w(obj);
        this.f3528f = new m0();
        this.f3529g = new a1(obj2);
        p pVar3 = kVar.L;
        boolean z10 = pVar3 instanceof l;
        if (z10) {
            pVar = d.f3540e;
        } else if (pVar3 instanceof m) {
            pVar = d.f3541f;
        } else if (pVar3 instanceof n) {
            pVar = d.f3542g;
        } else {
            pVar = d.f3543h;
        }
        this.f3530h = pVar;
        if (z10) {
            pVar2 = d.f3536a;
        } else if (pVar3 instanceof m) {
            pVar2 = d.f3537b;
        } else if (pVar3 instanceof n) {
            pVar2 = d.f3538c;
        } else {
            pVar2 = d.f3539d;
        }
        this.f3531i = pVar2;
        this.f3532j = pVar;
        this.f3533k = pVar2;
    }

    public static final Object a(c cVar, Object obj) {
        w1 w1Var = cVar.f3523a;
        p pVar = cVar.f3533k;
        p pVar2 = cVar.f3532j;
        if (!nc.k.a(pVar2, cVar.f3530h) || !nc.k.a(pVar, cVar.f3531i)) {
            p pVar3 = (p) w1Var.f3690a.k(obj);
            int b10 = pVar3.b();
            boolean z10 = false;
            for (int i2 = 0; i2 < b10; i2++) {
                if (pVar3.a(i2) < pVar2.a(i2) || pVar3.a(i2) > pVar.a(i2)) {
                    pVar3.e(i2, p7.j.f(pVar3.a(i2), pVar2.a(i2), pVar.a(i2)));
                    z10 = true;
                }
            }
            if (z10) {
                return w1Var.f3691b.k(pVar3);
            }
        }
        return obj;
    }

    public static final void b(c cVar) {
        k kVar = cVar.f3525c;
        kVar.L.d();
        kVar.R = Long.MIN_VALUE;
        cVar.f3526d.setValue(Boolean.FALSE);
    }

    public static Object d(c cVar, Object obj, j jVar, mc.l lVar, cc.c cVar2, int i2) {
        if ((i2 & 2) != 0) {
            jVar = cVar.f3529g;
        }
        j jVar2 = jVar;
        Object k10 = cVar.f3523a.f3691b.k(cVar.f3525c.L);
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        return cVar.c(obj, jVar2, k10, lVar, cVar2);
    }

    public final Object c(Object obj, j jVar, Object obj2, mc.l lVar, cc.c cVar) {
        Object e6 = e();
        w1 w1Var = this.f3523a;
        return m0.a(this.f3528f, new a(this, obj2, new h1(jVar, w1Var, e6, obj, (p) w1Var.f3690a.k(obj2)), this.f3525c.R, lVar, null), cVar);
    }

    public final Object e() {
        return this.f3525c.B.getValue();
    }

    public final Object f(cc.c cVar, Object obj) {
        Object a10 = m0.a(this.f3528f, new b(this, obj, null), cVar);
        if (a10 == dc.a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ c(Object obj, w1 w1Var, Object obj2, int i2) {
        this(obj, w1Var, (i2 & 4) != 0 ? null : obj2);
    }
}
