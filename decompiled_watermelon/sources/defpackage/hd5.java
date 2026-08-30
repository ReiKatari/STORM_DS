package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hd5  reason: default package */
/* loaded from: classes.dex */
public final class hd5 extends bd5 {
    public final sq5 a;
    public final kk0 b;
    public final kk0 c;
    public final kk0 d;
    public final kk0 e;
    public final kk0 f;
    public final kk0 g;
    public final lk0 h;
    public final k91 i;

    public hd5(sq5 sq5Var) {
        this.a = sq5Var;
        new kk0(this);
        this.b = new kk0(8);
        this.c = new kk0(9);
        this.d = new kk0(10);
        this.e = new kk0(11);
        this.f = new kk0(12);
        this.g = new kk0(13);
        this.h = new lk0(2);
        this.i = new k91(new kk0(14), new lk0(1));
    }

    @Override // defpackage.bd5
    public final u92 A() {
        vu4 vu4Var = new vu4(12);
        return yg7.a(this.a, false, new String[]{"ra_game_hash_library"}, vu4Var);
    }

    @Override // defpackage.bd5
    public final u92 B() {
        vu4 vu4Var = new vu4(16);
        return yg7.a(this.a, false, new String[]{"ra_game_hash_library", "ra_game"}, vu4Var);
    }

    @Override // defpackage.bd5
    public final Object C(q15 q15Var, cl clVar) {
        Object Z = mh7.Z(clVar, this.a, false, true, new ed5(this, q15Var, 1));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object D(u05 u05Var, yc5 yc5Var) {
        Object Z = mh7.Z(yc5Var, this.a, false, true, new zr4(6, this, u05Var));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object E(u05 u05Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, dk dkVar) {
        Object Y = mh7.Y(this.a, new by1(this, u05Var, arrayList, arrayList2, arrayList3, null, 1), dkVar);
        if (Y == p31.COROUTINE_SUSPENDED) {
            return Y;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object G(ArrayList arrayList, ik ikVar) {
        Object Y = mh7.Y(this.a, new kc(this, arrayList, null, 7), ikVar);
        if (Y == p31.COROUTINE_SUSPENDED) {
            return Y;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object I(long j, ArrayList arrayList, ek ekVar) {
        Object Y = mh7.Y(this.a, new gd5(this, j, arrayList, null), ekVar);
        if (Y == p31.COROUTINE_SUSPENDED) {
            return Y;
        }
        return o27.a;
    }

    public final void K(ls5 ls5Var, cs3 cs3Var) {
        if (cs3Var.e()) {
            return;
        }
        int i = 2;
        if (cs3Var.j() > 999) {
            hk2.N(cs3Var, new dd5(this, ls5Var, 2));
            return;
        }
        StringBuilder r = wh1.r("SELECT `id`,`game_id`,`set_id`,`total_awards_casual`,`total_awards_hardcore`,`title`,`description`,`points`,`display_order`,`badge_url_unlocked`,`badge_url_locked`,`memory_address`,`type` FROM `ra_achievement` WHERE `set_id` IN (");
        ve2.k(r, cs3Var.j());
        r.append(")");
        ns5 i0 = ls5Var.i0(r.toString());
        int j = cs3Var.j();
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        for (int i5 = 0; i5 < j; i5++) {
            i0.g(i4, cs3Var.f(i5));
            i4++;
        }
        try {
            int q = hi2.q(i0, "set_id");
            if (q == -1) {
                return;
            }
            while (i0.a0()) {
                List list = (List) cs3Var.b(i0.getLong(q));
                if (list != null) {
                    list.add(new ey4(i0.getLong(i2), i0.getLong(i3), i0.getLong(i), (int) i0.getLong(3), (int) i0.getLong(4), i0.q(5), i0.q(6), (int) i0.getLong(7), (int) i0.getLong(8), i0.q(9), i0.q(10), i0.q(11), (int) i0.getLong(12)));
                    i2 = 0;
                    i = 2;
                    i3 = 1;
                }
            }
        } finally {
            i0.close();
        }
    }

    public final void L(ls5 ls5Var, cs3 cs3Var) {
        String q;
        boolean z;
        boolean z2;
        if (cs3Var.e()) {
            return;
        }
        if (cs3Var.j() > 999) {
            hk2.N(cs3Var, new dd5(this, ls5Var, 0));
            return;
        }
        StringBuilder r = wh1.r("SELECT `id`,`game_id`,`title`,`type`,`icon_url` FROM `ra_achievement_set` WHERE `game_id` IN (");
        ve2.k(r, cs3Var.j());
        r.append(")");
        ns5 i0 = ls5Var.i0(r.toString());
        int j = cs3Var.j();
        int i = 1;
        for (int i2 = 0; i2 < j; i2++) {
            i0.g(i, cs3Var.f(i2));
            i++;
        }
        try {
            int q2 = hi2.q(i0, "game_id");
            if (q2 == -1) {
                i0.close();
                return;
            }
            cs3 cs3Var2 = new cs3((Object) null);
            cs3 cs3Var3 = new cs3((Object) null);
            while (i0.a0()) {
                long j2 = i0.getLong(0);
                if (cs3Var2.c(j2) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    cs3Var2.g(j2, new ArrayList());
                }
                long j3 = i0.getLong(0);
                if (cs3Var3.c(j3) >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    cs3Var3.g(j3, new ArrayList());
                }
            }
            i0.reset();
            K(ls5Var, cs3Var2);
            M(ls5Var, cs3Var3);
            while (i0.a0()) {
                List list = (List) cs3Var.b(i0.getLong(q2));
                if (list != null) {
                    long j4 = i0.getLong(0);
                    long j5 = i0.getLong(1);
                    if (i0.isNull(2)) {
                        q = null;
                    } else {
                        q = i0.q(2);
                    }
                    iy4 iy4Var = new iy4(j4, j5, q, i0.q(3), i0.q(4));
                    Object b = cs3Var2.b(i0.getLong(0));
                    if (b != null) {
                        List list2 = (List) b;
                        Object b2 = cs3Var3.b(i0.getLong(0));
                        if (b2 != null) {
                            list.add(new ky4(iy4Var, list2, (List) b2));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            i0.close();
        } catch (Throwable th) {
            i0.close();
            throw th;
        }
    }

    public final void M(ls5 ls5Var, cs3 cs3Var) {
        boolean z;
        boolean z2;
        if (cs3Var.e()) {
            return;
        }
        int i = 1;
        if (cs3Var.j() > 999) {
            hk2.N(cs3Var, new dd5(this, ls5Var, 1));
            return;
        }
        StringBuilder r = wh1.r("SELECT `id`,`game_id`,`set_id`,`mem`,`format`,`lower_is_better`,`title`,`description`,`hidden` FROM `ra_leaderboard` WHERE `set_id` IN (");
        ve2.k(r, cs3Var.j());
        r.append(")");
        ns5 i0 = ls5Var.i0(r.toString());
        int j = cs3Var.j();
        int i2 = 0;
        int i3 = 1;
        for (int i4 = 0; i4 < j; i4++) {
            i0.g(i3, cs3Var.f(i4));
            i3++;
        }
        try {
            int q = hi2.q(i0, "set_id");
            if (q == -1) {
                return;
            }
            while (i0.a0()) {
                List list = (List) cs3Var.b(i0.getLong(q));
                if (list != null) {
                    long j2 = i0.getLong(i2);
                    long j3 = i0.getLong(i);
                    long j4 = i0.getLong(2);
                    String q2 = i0.q(3);
                    String q3 = i0.q(4);
                    if (((int) i0.getLong(5)) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String q4 = i0.q(6);
                    String q5 = i0.q(7);
                    if (((int) i0.getLong(8)) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    list.add(new l15(j2, j3, j4, q2, q3, z, q4, q5, z2));
                    i2 = 0;
                    i = 1;
                }
            }
        } finally {
            i0.close();
        }
    }

    @Override // defpackage.bd5
    public final Object a(q15 q15Var, zk zkVar) {
        Object Z = mh7.Z(zkVar, this.a, false, true, new ed5(this, q15Var, 0));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object b(v15 v15Var, k11 k11Var) {
        Object Z = mh7.Z(k11Var, this.a, false, true, new zr4(5, this, v15Var));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object c(xc5 xc5Var) {
        Object Z = mh7.Z(xc5Var, this.a, false, true, new vu4(14));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object d(k11 k11Var) {
        Object Y = mh7.Y(this.a, new oa0(this, null, 2), k11Var);
        if (Y == p31.COROUTINE_SUSPENDED) {
            return Y;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object f(xc5 xc5Var) {
        Object Z = mh7.Z(xc5Var, this.a, false, true, new vu4(15));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object g(xc5 xc5Var) {
        Object Z = mh7.Z(xc5Var, this.a, false, true, new vu4(13));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object h(long j, yc5 yc5Var) {
        Object Z = mh7.Z(yc5Var, this.a, false, true, new u4(15, j));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object i(zc5 zc5Var) {
        Object Z = mh7.Z(zc5Var, this.a, false, true, new vu4(17));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object j(long j, yc5 yc5Var) {
        Object Z = mh7.Z(yc5Var, this.a, false, true, new u4(9, j));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object k(long j, yc5 yc5Var) {
        Object Z = mh7.Z(yc5Var, this.a, false, true, new u4(8, j));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object l(long j, ad5 ad5Var) {
        Object Z = mh7.Z(ad5Var, this.a, false, true, new u4(16, j));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object m(long j, fk fkVar) {
        return mh7.Z(fkVar, this.a, true, false, new u4(12, j));
    }

    @Override // defpackage.bd5
    public final Object n(long j, gk gkVar) {
        return mh7.Z(gkVar, this.a, true, false, new u4(13, j));
    }

    @Override // defpackage.bd5
    public final Object o(long j, k11 k11Var) {
        return mh7.Z(k11Var, this.a, true, false, new u4(14, j));
    }

    @Override // defpackage.bd5
    public final Object p(long j, kk kkVar) {
        return mh7.Z(kkVar, this.a, true, false, new u4(10, j));
    }

    @Override // defpackage.bd5
    public final Object q(String str, k11 k11Var) {
        return mh7.Z(k11Var, this.a, true, false, new ok0(str, 9));
    }

    @Override // defpackage.bd5
    public final Object r(final long j, final boolean z, k11 k11Var) {
        return mh7.Z(k11Var, this.a, true, false, new mi2() { // from class: fd5
            @Override // defpackage.mi2
            public final Object n(Object obj) {
                boolean z2;
                boolean z3;
                long j2 = j;
                boolean z4 = z;
                ls5 ls5Var = (ls5) obj;
                ls5Var.getClass();
                ns5 i0 = ls5Var.i0("SELECT * FROM ra_user_achievement WHERE game_id = ? AND is_hardcore = ? AND is_unlocked = 1");
                try {
                    i0.g(1, j2);
                    i0.g(2, z4 ? 1L : 0L);
                    int r = hi2.r(i0, "game_id");
                    int r2 = hi2.r(i0, "achievement_id");
                    int r3 = hi2.r(i0, "is_unlocked");
                    int r4 = hi2.r(i0, "is_hardcore");
                    ArrayList arrayList = new ArrayList();
                    while (i0.a0()) {
                        long j3 = i0.getLong(r);
                        long j4 = i0.getLong(r2);
                        if (((int) i0.getLong(r3)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (((int) i0.getLong(r4)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        arrayList.add(new v15(j3, j4, z2, z3));
                    }
                    return arrayList;
                } finally {
                    i0.close();
                }
            }
        });
    }

    @Override // defpackage.bd5
    public final Object s(long j, k11 k11Var) {
        return mh7.Z(k11Var, this.a, true, true, new dk2(2, j, this));
    }

    @Override // defpackage.bd5
    public final Object t(long j, k11 k11Var) {
        return mh7.Z(k11Var, this.a, true, false, new u4(11, j));
    }

    @Override // defpackage.bd5
    public final Object u(cl clVar) {
        return mh7.Z(clVar, this.a, true, false, new vu4(11));
    }

    @Override // defpackage.bd5
    public final Object v(List list, yc5 yc5Var) {
        Object Z = mh7.Z(yc5Var, this.a, false, true, new cd5(this, list, 1));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object w(List list, zc5 zc5Var) {
        Object Z = mh7.Z(zc5Var, this.a, false, true, new cd5(this, list, 4));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object x(List list, yc5 yc5Var) {
        Object Z = mh7.Z(yc5Var, this.a, false, true, new cd5(this, list, 3));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object y(List list, yc5 yc5Var) {
        Object Z = mh7.Z(yc5Var, this.a, false, true, new cd5(this, list, 0));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    @Override // defpackage.bd5
    public final Object z(List list, ad5 ad5Var) {
        Object Z = mh7.Z(ad5Var, this.a, false, true, new cd5(this, list, 2));
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }
}
