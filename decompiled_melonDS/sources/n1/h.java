package n1;

import a4.f0;
import android.content.res.Resources;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import g2.e7;
import g2.f7;
import g2.g7;
import hh.o0;
import l1.r1;
import l4.r0;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.t2;
import p1.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements mc.r {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ h(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z10;
        int i2;
        String H;
        String str;
        switch (this.A) {
            case 0:
                v2.c cVar = (v2.c) this.B;
                c cVar2 = (c) obj;
                ((Integer) obj2).getClass();
                n2.m mVar = (n2.m) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    if (((n2.r) mVar).f(cVar2)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue |= i2;
                }
                if ((intValue & 131) != 130) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    cVar.i(cVar2, rVar, Integer.valueOf(intValue & 14));
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                mh.c cVar3 = (mh.c) this.B;
                nh.a aVar = (nh.a) obj2;
                n2.m mVar2 = (n2.m) obj3;
                ((Integer) obj4).getClass();
                ((c1.p) obj).getClass();
                aVar.getClass();
                int i10 = nh.d.f10446a[aVar.ordinal()];
                b3.m mVar3 = b3.m.f1770a;
                if (i10 != 1) {
                    if (i10 == 2) {
                        n2.r rVar2 = (n2.r) mVar2;
                        rVar2.X(1961838521);
                        e7.b(cVar3.f9675c, l1.c.x(mVar3, 4, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar2.j(g7.f5161b)).f5150i, rVar2, 48, 0, 65532);
                        rVar2.p(false);
                    } else {
                        throw w.d.i((n2.r) mVar2, -490928301, false);
                    }
                } else {
                    n2.r rVar3 = (n2.r) mVar2;
                    rVar3.X(1961155932);
                    b3.p x9 = l1.c.x(mVar3, 4, 0.0f, 0.0f, 0.0f, 14);
                    l1.w a10 = l1.u.a(l1.i.f8573c, b3.c.f1758g0, rVar3, 0);
                    int hashCode = Long.hashCode(rVar3.T);
                    v2.g l10 = rVar3.l();
                    b3.p c4 = b3.a.c(x9, rVar3);
                    a4.h.f220a.getClass();
                    f0 f0Var = a4.g.f212b;
                    rVar3.b0();
                    if (rVar3.S) {
                        rVar3.k(f0Var);
                    } else {
                        rVar3.k0();
                    }
                    n2.s.C(a10, a4.g.f215e, rVar3);
                    n2.s.C(l10, a4.g.f214d, rVar3);
                    n2.s.u(rVar3, Integer.valueOf(hashCode), a4.g.f216f);
                    n2.s.y(rVar3, a4.g.f217g);
                    n2.s.C(c4, a4.g.f213c, rVar3);
                    String I = l0.f.I(rVar3, R.string.leaderboard_attempt_started);
                    t2 t2Var = g7.f5161b;
                    e7.b(I, null, 0L, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, r0.a(((f7) rVar3.j(t2Var)).f5153l, 0L, 0L, p4.j.Y, null, 0L, 0L, null, 16777211), rVar3, 0, 3072, 57342);
                    e7.b(cVar3.f9673a.f11045g, null, 0L, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, ((f7) rVar3.j(t2Var)).f5153l, rVar3, 0, 3072, 57342);
                    rVar3.p(true);
                    rVar3.p(false);
                }
                return yb.y.f14813a;
            case 2:
                oi.b bVar = (oi.b) this.B;
                oh.e eVar = (oh.e) obj2;
                n2.m mVar4 = (n2.m) obj3;
                ((Integer) obj4).getClass();
                ((c1.p) obj).getClass();
                eVar.getClass();
                int i11 = oh.b.f11010a[eVar.ordinal()];
                if (i11 != 1) {
                    b3.m mVar5 = b3.m.f1770a;
                    if (i11 != 2) {
                        if (i11 == 3) {
                            n2.r rVar4 = (n2.r) mVar4;
                            rVar4.X(2085032150);
                            e7.b(bVar.f11018g, l1.c.x(mVar5, 8, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar4.j(g7.f5161b)).f5151j, rVar4, 48, 0, 65532);
                            rVar4.p(false);
                        } else {
                            throw w.d.i((n2.r) mVar4, -1595338480, false);
                        }
                    } else {
                        n2.r rVar5 = (n2.r) mVar4;
                        rVar5.X(2084275905);
                        b3.p x10 = l1.c.x(mVar5, 8, 0.0f, 0.0f, 0.0f, 14);
                        l1.w a11 = l1.u.a(l1.i.f8573c, b3.c.f1758g0, rVar5, 0);
                        int hashCode2 = Long.hashCode(rVar5.T);
                        v2.g l11 = rVar5.l();
                        b3.p c10 = b3.a.c(x10, rVar5);
                        a4.h.f220a.getClass();
                        f0 f0Var2 = a4.g.f212b;
                        rVar5.b0();
                        if (rVar5.S) {
                            rVar5.k(f0Var2);
                        } else {
                            rVar5.k0();
                        }
                        n2.s.C(a11, a4.g.f215e, rVar5);
                        n2.s.C(l11, a4.g.f214d, rVar5);
                        n2.s.u(rVar5, Integer.valueOf(hashCode2), a4.g.f216f);
                        n2.s.y(rVar5, a4.g.f217g);
                        n2.s.C(c10, a4.g.f213c, rVar5);
                        String I2 = l0.f.I(rVar5, R.string.achievement_unlocked);
                        t2 t2Var2 = g7.f5161b;
                        e7.b(I2, null, 0L, 0L, p4.j.Y, 0L, null, 0L, 0, false, 1, 0, null, ((f7) rVar5.j(t2Var2)).f5151j, rVar5, 196608, 3072, 57310);
                        e7.b(vc.h.C0(vc.h.r0(bVar.f11017f, "[m]")).toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, ((f7) rVar5.j(t2Var2)).f5151j, rVar5, 0, 3072, 57342);
                        rVar5.p(true);
                        rVar5.p(false);
                    }
                } else {
                    n2.r rVar6 = (n2.r) mVar4;
                    rVar6.X(2084134607);
                    l1.p.a(r1.f8614b, rVar6, 6);
                    rVar6.p(false);
                }
                return yb.y.f14813a;
            case 3:
                o0 o0Var = (o0) this.B;
                oh.d dVar = (oh.d) obj2;
                n2.m mVar6 = (n2.m) obj3;
                ((Integer) obj4).getClass();
                ((c1.p) obj).getClass();
                dVar.getClass();
                int i12 = oh.c.f11011a[dVar.ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        n2.r rVar7 = (n2.r) mVar6;
                        rVar7.X(-1073592757);
                        Resources resources = (Resources) rVar7.j(b4.r0.f1938c);
                        boolean z11 = o0Var.f6556e;
                        String str2 = o0Var.f6554c;
                        wc.b bVar2 = o0Var.f6555d;
                        String str3 = o0Var.f6552a;
                        if (z11) {
                            rVar7.X(-1073521922);
                            H = l0.f.H(R.string.game_mastered, new Object[]{str3}, rVar7);
                            rVar7.p(false);
                        } else {
                            rVar7.X(-1073398883);
                            H = l0.f.H(R.string.game_completed, new Object[]{str3}, rVar7);
                            rVar7.p(false);
                        }
                        boolean f8 = rVar7.f(bVar2);
                        Object L = rVar7.L();
                        n2.e eVar2 = n2.l.f9953a;
                        if (f8 || L == eVar2) {
                            if (bVar2 != null) {
                                long j2 = bVar2.A;
                                long j10 = wc.b.j(j2, wc.e.HOURS);
                                int e6 = wc.b.e(j2);
                                wc.b.g(j2);
                                wc.b.f(j2);
                                if (j10 > 0) {
                                    str = resources.getString(R.string.info_play_time_hours_minutes, Long.valueOf(j10), Integer.valueOf(e6));
                                } else {
                                    str = resources.getString(R.string.info_play_time_minutes, Integer.valueOf(e6));
                                }
                            } else {
                                str = null;
                            }
                            L = str;
                            rVar7.h0(L);
                        }
                        String str4 = (String) L;
                        boolean f10 = rVar7.f(o0Var);
                        Object L2 = rVar7.L();
                        if (f10 || L2 == eVar2) {
                            StringBuilder sb2 = new StringBuilder();
                            if (str2 != null) {
                                sb2.append(str2);
                            }
                            if (str2 != null && str4 != null) {
                                sb2.append(" • ");
                            }
                            if (str4 != null) {
                                sb2.append(str4);
                            }
                            L2 = sb2.toString();
                            rVar7.h0(L2);
                        }
                        String str5 = (String) L2;
                        b3.p x11 = l1.c.x(b3.m.f1770a, 8, 0.0f, 0.0f, 0.0f, 14);
                        l1.w a12 = l1.u.a(l1.i.f8573c, b3.c.f1758g0, rVar7, 0);
                        int hashCode3 = Long.hashCode(rVar7.T);
                        v2.g l12 = rVar7.l();
                        b3.p c11 = b3.a.c(x11, rVar7);
                        a4.h.f220a.getClass();
                        f0 f0Var3 = a4.g.f212b;
                        rVar7.b0();
                        if (rVar7.S) {
                            rVar7.k(f0Var3);
                        } else {
                            rVar7.k0();
                        }
                        n2.s.C(a12, a4.g.f215e, rVar7);
                        n2.s.C(l12, a4.g.f214d, rVar7);
                        n2.s.u(rVar7, Integer.valueOf(hashCode3), a4.g.f216f);
                        n2.s.y(rVar7, a4.g.f217g);
                        n2.s.C(c11, a4.g.f213c, rVar7);
                        t2 t2Var3 = g7.f5161b;
                        String str6 = H;
                        e7.b(str6, null, 0L, 0L, p4.j.Y, 0L, null, 0L, 0, false, 1, 0, null, ((f7) rVar7.j(t2Var3)).f5151j, rVar7, 196608, 3072, 57310);
                        if (str5.length() > 0) {
                            rVar7.X(2034755377);
                            e7.b(str5, null, 0L, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, ((f7) rVar7.j(t2Var3)).f5151j, rVar7, 0, 3072, 57342);
                            rVar7.p(false);
                        } else {
                            rVar7.X(2034994635);
                            rVar7.p(false);
                        }
                        rVar7.p(true);
                        rVar7.p(false);
                    } else {
                        throw w.d.i((n2.r) mVar6, -588827287, false);
                    }
                } else {
                    n2.r rVar8 = (n2.r) mVar6;
                    rVar8.X(-1073791033);
                    l1.p.a(r1.f8614b, rVar8, 6);
                    rVar8.p(false);
                }
                return yb.y.f14813a;
            case 4:
                me.magnum.melonds.ui.layouteditor.b.b((me.magnum.melonds.ui.layouteditor.b) this.B, (String) obj, (ve.d) obj2, ((Boolean) obj3).booleanValue(), ((Integer) obj4).intValue());
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                t4.c cVar4 = (t4.c) this.B;
                p4.r b10 = ((p4.e) cVar4.X).b((p4.p) obj, (p4.j) obj2, ((p4.h) obj3).f11311a, ((p4.i) obj4).f11312a);
                if (!(b10 instanceof p4.r)) {
                    c1 c1Var = new c1(b10, cVar4.f13115d0);
                    cVar4.f13115d0 = c1Var;
                    Object obj5 = c1Var.B;
                    obj5.getClass();
                    return (Typeface) obj5;
                }
                Object obj6 = b10.A;
                obj6.getClass();
                return (Typeface) obj6;
            default:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((u7.e) this.B).a(new v7.i(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
