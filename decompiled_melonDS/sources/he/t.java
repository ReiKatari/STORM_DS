package he;

import f2.u0;
import g2.l5;
import g2.p2;
import g2.z1;
import java.util.ArrayList;
import java.util.List;
import kf.w;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends n {

    /* renamed from: a  reason: collision with root package name */
    public final k7.t f6483a;

    /* renamed from: b  reason: collision with root package name */
    public final c f6484b;

    /* renamed from: c  reason: collision with root package name */
    public final c f6485c;

    /* renamed from: d  reason: collision with root package name */
    public final c f6486d;

    /* renamed from: e  reason: collision with root package name */
    public final c f6487e;

    /* renamed from: f  reason: collision with root package name */
    public final c f6488f;

    /* renamed from: g  reason: collision with root package name */
    public final jb.c f6489g;

    public t(k7.t tVar) {
        this.f6483a = tVar;
        new c(this);
        this.f6484b = new c(6);
        this.f6485c = new c(7);
        this.f6486d = new c(8);
        this.f6487e = new c(9);
        this.f6488f = new c(11);
        this.f6489g = new jb.c(3, new c(12), new d(1));
    }

    @Override // he.n
    public final Object A(ArrayList arrayList, kf.m mVar) {
        Object L = q8.r.L(this.f6483a, new b2.c(this, arrayList, null, 3), mVar);
        if (L == dc.a.COROUTINE_SUSPENDED) {
            return L;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object C(long j2, ArrayList arrayList, kf.j jVar) {
        Object L = q8.r.L(this.f6483a, new s(this, j2, arrayList, null), jVar);
        if (L == dc.a.COROUTINE_SUSPENDED) {
            return L;
        }
        return y.f14813a;
    }

    public final void E(t7.a aVar, a1.q qVar) {
        if (qVar.e()) {
            return;
        }
        if (qVar.j() > 999) {
            p7.k.x(qVar, new p(this, aVar, 2));
            return;
        }
        StringBuilder t5 = w.d.t("SELECT `id`,`game_id`,`set_id`,`total_awards_casual`,`total_awards_hardcore`,`title`,`description`,`points`,`display_order`,`badge_url_unlocked`,`badge_url_locked`,`memory_address`,`type` FROM `ra_achievement` WHERE `set_id` IN (");
        p7.o.b(t5, qVar.j());
        t5.append(")");
        t7.c T = aVar.T(t5.toString());
        int j2 = qVar.j();
        int i2 = 0;
        int i10 = 1;
        int i11 = 1;
        for (int i12 = 0; i12 < j2; i12++) {
            T.g(i11, qVar.f(i12));
            i11++;
        }
        try {
            int s10 = p7.m.s(T, "set_id");
            if (s10 == -1) {
                return;
            }
            while (T.N()) {
                List list = (List) qVar.b(T.getLong(s10));
                if (list != null) {
                    list.add(new je.a(T.getLong(i2), T.getLong(i10), T.getLong(2), (int) T.getLong(3), (int) T.getLong(4), T.n(5), T.n(6), (int) T.getLong(7), (int) T.getLong(8), T.n(9), T.n(10), T.n(11), (int) T.getLong(12)));
                    i2 = 0;
                    i10 = 1;
                }
            }
        } finally {
            T.close();
        }
    }

    public final void F(t7.a aVar, a1.q qVar) {
        String n10;
        boolean z10;
        boolean z11;
        if (qVar.e()) {
            return;
        }
        if (qVar.j() > 999) {
            p7.k.x(qVar, new p(this, aVar, 0));
            return;
        }
        StringBuilder t5 = w.d.t("SELECT `id`,`game_id`,`title`,`type`,`icon_url` FROM `ra_achievement_set` WHERE `game_id` IN (");
        p7.o.b(t5, qVar.j());
        t5.append(")");
        t7.c T = aVar.T(t5.toString());
        int j2 = qVar.j();
        int i2 = 1;
        for (int i10 = 0; i10 < j2; i10++) {
            T.g(i2, qVar.f(i10));
            i2++;
        }
        try {
            int s10 = p7.m.s(T, "game_id");
            if (s10 == -1) {
                T.close();
                return;
            }
            a1.q qVar2 = new a1.q((Object) null);
            a1.q qVar3 = new a1.q((Object) null);
            while (T.N()) {
                long j10 = T.getLong(0);
                if (qVar2.c(j10) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    qVar2.g(j10, new ArrayList());
                }
                long j11 = T.getLong(0);
                if (qVar3.c(j11) >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    qVar3.g(j11, new ArrayList());
                }
            }
            T.reset();
            E(aVar, qVar2);
            G(aVar, qVar3);
            while (T.N()) {
                List list = (List) qVar.b(T.getLong(s10));
                if (list != null) {
                    long j12 = T.getLong(0);
                    long j13 = T.getLong(1);
                    if (T.isNull(2)) {
                        n10 = null;
                    } else {
                        n10 = T.n(2);
                    }
                    je.b bVar = new je.b(j12, j13, n10, T.n(3), T.n(4));
                    Object b10 = qVar2.b(T.getLong(0));
                    if (b10 != null) {
                        List list2 = (List) b10;
                        Object b11 = qVar3.b(T.getLong(0));
                        if (b11 != null) {
                            list.add(new je.c(bVar, list2, (List) b11));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            T.close();
        } catch (Throwable th2) {
            T.close();
            throw th2;
        }
    }

    public final void G(t7.a aVar, a1.q qVar) {
        boolean z10;
        boolean z11;
        if (qVar.e()) {
            return;
        }
        if (qVar.j() > 999) {
            p7.k.x(qVar, new p(this, aVar, 1));
            return;
        }
        StringBuilder t5 = w.d.t("SELECT `id`,`game_id`,`set_id`,`mem`,`format`,`lower_is_better`,`title`,`description`,`hidden` FROM `ra_leaderboard` WHERE `set_id` IN (");
        p7.o.b(t5, qVar.j());
        t5.append(")");
        t7.c T = aVar.T(t5.toString());
        int j2 = qVar.j();
        int i2 = 0;
        int i10 = 1;
        for (int i11 = 0; i11 < j2; i11++) {
            T.g(i10, qVar.f(i11));
            i10++;
        }
        try {
            int s10 = p7.m.s(T, "set_id");
            if (s10 == -1) {
                return;
            }
            while (T.N()) {
                List list = (List) qVar.b(T.getLong(s10));
                if (list != null) {
                    long j10 = T.getLong(i2);
                    long j11 = T.getLong(1);
                    long j12 = T.getLong(2);
                    String n10 = T.n(3);
                    String n11 = T.n(4);
                    if (((int) T.getLong(5)) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String n12 = T.n(6);
                    String n13 = T.n(7);
                    if (((int) T.getLong(8)) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    list.add(new je.h(j10, j11, j12, n10, n11, z10, n12, n13, z11));
                    i2 = 0;
                }
            }
        } finally {
            T.close();
        }
    }

    @Override // he.n
    public final Object a(je.j jVar, w wVar) {
        Object M = q8.r.M(wVar, this.f6483a, false, true, new g(3, this, jVar));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object b(j jVar) {
        Object M = q8.r.M(jVar, this.f6483a, false, true, new l5(10));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object c(kf.t tVar) {
        Object L = q8.r.L(this.f6483a, new u0(1, null, this), tVar);
        if (L == dc.a.COROUTINE_SUSPENDED) {
            return L;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object e(j jVar) {
        Object M = q8.r.M(jVar, this.f6483a, false, true, new l5(11));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object f(j jVar) {
        Object M = q8.r.M(jVar, this.f6483a, false, true, new l5(9));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object g(long j2, k kVar) {
        Object M = q8.r.M(kVar, this.f6483a, false, true, new cd.k(7, j2));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object h(l lVar) {
        Object M = q8.r.M(lVar, this.f6483a, false, true, new l5(12));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object i(long j2, k kVar) {
        Object M = q8.r.M(kVar, this.f6483a, false, true, new cd.k(5, j2));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object j(long j2, k kVar) {
        Object M = q8.r.M(kVar, this.f6483a, false, true, new cd.k(11, j2));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object k(long j2, m mVar) {
        Object M = q8.r.M(mVar, this.f6483a, false, true, new cd.k(9, j2));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object l(long j2, kf.k kVar) {
        return q8.r.M(kVar, this.f6483a, true, false, new cd.k(10, j2));
    }

    @Override // he.n
    public final Object m(long j2, kf.l lVar) {
        return q8.r.M(lVar, this.f6483a, true, false, new cd.k(4, j2));
    }

    @Override // he.n
    public final Object n(long j2, kf.o oVar) {
        return q8.r.M(oVar, this.f6483a, true, false, new cd.k(6, j2));
    }

    @Override // he.n
    public final Object o(String str, kf.m mVar) {
        return q8.r.M(mVar, this.f6483a, true, false, new z1(str, 3));
    }

    @Override // he.n
    public final Object p(final long j2, final boolean z10, kf.j jVar) {
        return q8.r.M(jVar, this.f6483a, true, false, new mc.l() { // from class: he.q
            @Override // mc.l
            public final Object k(Object obj) {
                boolean z11;
                boolean z12;
                long j10 = j2;
                boolean z13 = z10;
                t7.a aVar = (t7.a) obj;
                aVar.getClass();
                t7.c T = aVar.T("SELECT * FROM ra_user_achievement WHERE game_id = ? AND is_hardcore = ? AND is_unlocked = 1");
                try {
                    T.g(1, j10);
                    T.g(2, z13 ? 1L : 0L);
                    int t5 = p7.m.t(T, "game_id");
                    int t10 = p7.m.t(T, "achievement_id");
                    int t11 = p7.m.t(T, "is_unlocked");
                    int t12 = p7.m.t(T, "is_hardcore");
                    ArrayList arrayList = new ArrayList();
                    while (T.N()) {
                        long j11 = T.getLong(t5);
                        long j12 = T.getLong(t10);
                        if (((int) T.getLong(t11)) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (((int) T.getLong(t12)) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new je.j(j11, j12, z11, z12));
                    }
                    return arrayList;
                } finally {
                    T.close();
                }
            }
        });
    }

    @Override // he.n
    public final Object q(long j2, kf.i iVar) {
        return q8.r.M(iVar, this.f6483a, true, true, new p2(j2, this, 2));
    }

    @Override // he.n
    public final Object r(long j2, kf.p pVar) {
        return q8.r.M(pVar, this.f6483a, true, false, new cd.k(8, j2));
    }

    @Override // he.n
    public final Object s(List list, k kVar) {
        Object M = q8.r.M(kVar, this.f6483a, false, true, new o(this, list, 1));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object t(List list, l lVar) {
        Object M = q8.r.M(lVar, this.f6483a, false, true, new o(this, list, 4));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object u(List list, k kVar) {
        Object M = q8.r.M(kVar, this.f6483a, false, true, new o(this, list, 3));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object v(List list, k kVar) {
        Object M = q8.r.M(kVar, this.f6483a, false, true, new o(this, list, 0));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object w(List list, m mVar) {
        Object M = q8.r.M(mVar, this.f6483a, false, true, new o(this, list, 2));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object x(je.d dVar, k kVar) {
        Object M = q8.r.M(kVar, this.f6483a, false, true, new g(4, this, dVar));
        if (M == dc.a.COROUTINE_SUSPENDED) {
            return M;
        }
        return y.f14813a;
    }

    @Override // he.n
    public final Object y(je.d dVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, kf.i iVar) {
        Object L = q8.r.L(this.f6483a, new r(this, dVar, arrayList, arrayList2, arrayList3, null), iVar);
        if (L == dc.a.COROUTINE_SUSPENDED) {
            return L;
        }
        return y.f14813a;
    }
}
