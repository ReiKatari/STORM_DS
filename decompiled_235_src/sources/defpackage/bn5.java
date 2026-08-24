package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bn5  reason: default package */
/* loaded from: classes.dex */
public final class bn5 extends vm5 {
    public final m16 a;
    public final tm0 b;
    public final tm0 c;
    public final tm0 d;
    public final tm0 e;
    public final tm0 f;
    public final tm0 g;
    public final um0 h;
    public final yc1 i;

    public bn5(m16 m16Var) {
        this.a = m16Var;
        new tm0(this);
        this.b = new tm0(8);
        this.c = new tm0(9);
        this.d = new tm0(10);
        this.e = new tm0(11);
        this.f = new tm0(12);
        this.g = new tm0(13);
        this.h = new um0(2);
        this.i = new yc1(new tm0(14), new um0(1));
    }

    @Override // defpackage.vm5
    public final le2 A() {
        dv4 dv4Var = new dv4(24);
        return yv7.a(this.a, false, new String[]{"ra_game_hash_library"}, dv4Var);
    }

    @Override // defpackage.vm5
    public final le2 B() {
        dv4 dv4Var = new dv4(28);
        return yv7.a(this.a, false, new String[]{"ra_game_hash_library", "ra_game"}, dv4Var);
    }

    @Override // defpackage.vm5
    public final Object C(ab5 ab5Var, ol olVar) {
        Object S = hv.S(olVar, this.a, false, true, new ym5(this, ab5Var, 1));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object D(ea5 ea5Var, sm5 sm5Var) {
        Object S = hv.S(sm5Var, this.a, false, true, new qk4(11, this, ea5Var));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object E(ea5 ea5Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, pk pkVar) {
        Object R = hv.R(this.a, new m22(this, ea5Var, arrayList, arrayList2, arrayList3, null, 1), pkVar);
        if (R == x61.COROUTINE_SUSPENDED) {
            return R;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object G(ArrayList arrayList, uk ukVar) {
        Object R = hv.R(this.a, new yc(this, arrayList, null, 7), ukVar);
        if (R == x61.COROUTINE_SUSPENDED) {
            return R;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object I(long j, ArrayList arrayList, qk qkVar) {
        Object R = hv.R(this.a, new an5(this, j, arrayList, null), qkVar);
        if (R == x61.COROUTINE_SUSPENDED) {
            return R;
        }
        return jg7.a;
    }

    public final void K(e36 e36Var, hz3 hz3Var) {
        if (hz3Var.d()) {
            return;
        }
        int i = 2;
        if (hz3Var.i() > 999) {
            ln2.U(hz3Var, new xm5(this, e36Var, 2));
            return;
        }
        StringBuilder s = lb1.s("SELECT `id`,`game_id`,`set_id`,`total_awards_casual`,`total_awards_hardcore`,`title`,`description`,`points`,`display_order`,`badge_url_unlocked`,`badge_url_locked`,`memory_address`,`type` FROM `ra_achievement` WHERE `set_id` IN (");
        gi2.k(s, hz3Var.i());
        s.append(")");
        j36 i0 = e36Var.i0(s.toString());
        int i2 = hz3Var.i();
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        for (int i6 = 0; i6 < i2; i6++) {
            i0.c(i5, hz3Var.e(i6));
            i5++;
        }
        try {
            int A = ej2.A(i0, "set_id");
            if (A == -1) {
                return;
            }
            while (i0.f0()) {
                List list = (List) hz3Var.b(i0.getLong(A));
                if (list != null) {
                    list.add(new p75(i0.getLong(i3), i0.getLong(i4), i0.getLong(i), (int) i0.getLong(3), (int) i0.getLong(4), i0.R(5), i0.R(6), (int) i0.getLong(7), (int) i0.getLong(8), i0.R(9), i0.R(10), i0.R(11), (int) i0.getLong(12)));
                    i3 = 0;
                    i = 2;
                    i4 = 1;
                }
            }
        } finally {
            i0.close();
        }
    }

    public final void L(e36 e36Var, hz3 hz3Var) {
        String R;
        boolean z;
        boolean z2;
        if (hz3Var.d()) {
            return;
        }
        if (hz3Var.i() > 999) {
            ln2.U(hz3Var, new xm5(this, e36Var, 0));
            return;
        }
        StringBuilder s = lb1.s("SELECT `id`,`game_id`,`title`,`type`,`icon_url` FROM `ra_achievement_set` WHERE `game_id` IN (");
        gi2.k(s, hz3Var.i());
        s.append(")");
        j36 i0 = e36Var.i0(s.toString());
        int i = hz3Var.i();
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i0.c(i2, hz3Var.e(i3));
            i2++;
        }
        try {
            int A = ej2.A(i0, "game_id");
            if (A == -1) {
                i0.close();
                return;
            }
            hz3 hz3Var2 = new hz3((Object) null);
            hz3 hz3Var3 = new hz3((Object) null);
            while (i0.f0()) {
                long j = i0.getLong(0);
                if (hz3Var2.c(j) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    hz3Var2.f(j, new ArrayList());
                }
                long j2 = i0.getLong(0);
                if (hz3Var3.c(j2) >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    hz3Var3.f(j2, new ArrayList());
                }
            }
            i0.reset();
            K(e36Var, hz3Var2);
            M(e36Var, hz3Var3);
            while (i0.f0()) {
                List list = (List) hz3Var.b(i0.getLong(A));
                if (list != null) {
                    long j3 = i0.getLong(0);
                    long j4 = i0.getLong(1);
                    if (i0.isNull(2)) {
                        R = null;
                    } else {
                        R = i0.R(2);
                    }
                    t75 t75Var = new t75(j3, j4, R, i0.R(3), i0.R(4));
                    Object b = hz3Var2.b(i0.getLong(0));
                    if (b != null) {
                        List list2 = (List) b;
                        Object b2 = hz3Var3.b(i0.getLong(0));
                        if (b2 != null) {
                            list.add(new v75(t75Var, list2, (List) b2));
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

    public final void M(e36 e36Var, hz3 hz3Var) {
        boolean z;
        boolean z2;
        if (hz3Var.d()) {
            return;
        }
        int i = 1;
        if (hz3Var.i() > 999) {
            ln2.U(hz3Var, new xm5(this, e36Var, 1));
            return;
        }
        StringBuilder s = lb1.s("SELECT `id`,`game_id`,`set_id`,`mem`,`format`,`lower_is_better`,`title`,`description`,`hidden` FROM `ra_leaderboard` WHERE `set_id` IN (");
        gi2.k(s, hz3Var.i());
        s.append(")");
        j36 i0 = e36Var.i0(s.toString());
        int i2 = hz3Var.i();
        int i3 = 0;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            i0.c(i4, hz3Var.e(i5));
            i4++;
        }
        try {
            int A = ej2.A(i0, "set_id");
            if (A == -1) {
                return;
            }
            while (i0.f0()) {
                List list = (List) hz3Var.b(i0.getLong(A));
                if (list != null) {
                    long j = i0.getLong(i3);
                    long j2 = i0.getLong(i);
                    long j3 = i0.getLong(2);
                    String R = i0.R(3);
                    String R2 = i0.R(4);
                    if (((int) i0.getLong(5)) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String R3 = i0.R(6);
                    String R4 = i0.R(7);
                    if (((int) i0.getLong(8)) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    list.add(new va5(j, j2, j3, R, R2, z, R3, R4, z2));
                    i3 = 0;
                    i = 1;
                }
            }
        } finally {
            i0.close();
        }
    }

    @Override // defpackage.vm5
    public final Object a(ab5 ab5Var, ll llVar) {
        Object S = hv.S(llVar, this.a, false, true, new ym5(this, ab5Var, 0));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object b(fb5 fb5Var, s41 s41Var) {
        Object S = hv.S(s41Var, this.a, false, true, new qk4(10, this, fb5Var));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object c(rm5 rm5Var) {
        Object S = hv.S(rm5Var, this.a, false, true, new dv4(26));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object d(s41 s41Var) {
        Object R = hv.R(this.a, new wc0(this, null, 3), s41Var);
        if (R == x61.COROUTINE_SUSPENDED) {
            return R;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object f(rm5 rm5Var) {
        Object S = hv.S(rm5Var, this.a, false, true, new dv4(27));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object g(rm5 rm5Var) {
        Object S = hv.S(rm5Var, this.a, false, true, new dv4(25));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object h(long j, sm5 sm5Var) {
        Object S = hv.S(sm5Var, this.a, false, true, new t4(17, j));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object i(tm5 tm5Var) {
        Object S = hv.S(tm5Var, this.a, false, true, new dv4(29));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object j(long j, sm5 sm5Var) {
        Object S = hv.S(sm5Var, this.a, false, true, new t4(11, j));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object k(long j, sm5 sm5Var) {
        Object S = hv.S(sm5Var, this.a, false, true, new t4(10, j));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object l(long j, um5 um5Var) {
        Object S = hv.S(um5Var, this.a, false, true, new t4(18, j));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object m(long j, rk rkVar) {
        return hv.S(rkVar, this.a, true, false, new t4(14, j));
    }

    @Override // defpackage.vm5
    public final Object n(long j, sk skVar) {
        return hv.S(skVar, this.a, true, false, new t4(15, j));
    }

    @Override // defpackage.vm5
    public final Object o(long j, s41 s41Var) {
        return hv.S(s41Var, this.a, true, false, new t4(16, j));
    }

    @Override // defpackage.vm5
    public final Object p(long j, wk wkVar) {
        return hv.S(wkVar, this.a, true, false, new t4(12, j));
    }

    @Override // defpackage.vm5
    public final Object q(String str, s41 s41Var) {
        return hv.S(s41Var, this.a, true, false, new c70(str, 14));
    }

    @Override // defpackage.vm5
    public final Object r(final long j, final boolean z, s41 s41Var) {
        return hv.S(s41Var, this.a, true, false, new qn2() { // from class: zm5
            @Override // defpackage.qn2
            public final Object g(Object obj) {
                boolean z2;
                boolean z3;
                long j2 = j;
                boolean z4 = z;
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                j36 i0 = e36Var.i0("SELECT * FROM ra_user_achievement WHERE game_id = ? AND is_hardcore = ? AND is_unlocked = 1");
                try {
                    i0.c(1, j2);
                    i0.c(2, z4 ? 1L : 0L);
                    int B = ej2.B(i0, "game_id");
                    int B2 = ej2.B(i0, "achievement_id");
                    int B3 = ej2.B(i0, "is_unlocked");
                    int B4 = ej2.B(i0, "is_hardcore");
                    ArrayList arrayList = new ArrayList();
                    while (i0.f0()) {
                        long j3 = i0.getLong(B);
                        long j4 = i0.getLong(B2);
                        if (((int) i0.getLong(B3)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (((int) i0.getLong(B4)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        arrayList.add(new fb5(j3, j4, z2, z3));
                    }
                    return arrayList;
                } finally {
                    i0.close();
                }
            }
        });
    }

    @Override // defpackage.vm5
    public final Object s(long j, s41 s41Var) {
        return hv.S(s41Var, this.a, true, true, new hp2(this, j, 2));
    }

    @Override // defpackage.vm5
    public final Object t(long j, s41 s41Var) {
        return hv.S(s41Var, this.a, true, false, new t4(13, j));
    }

    @Override // defpackage.vm5
    public final Object u(ol olVar) {
        return hv.S(olVar, this.a, true, false, new dv4(23));
    }

    @Override // defpackage.vm5
    public final Object v(List list, sm5 sm5Var) {
        Object S = hv.S(sm5Var, this.a, false, true, new wm5(this, list, 1));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object w(List list, tm5 tm5Var) {
        Object S = hv.S(tm5Var, this.a, false, true, new wm5(this, list, 4));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object x(List list, sm5 sm5Var) {
        Object S = hv.S(sm5Var, this.a, false, true, new wm5(this, list, 3));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object y(List list, sm5 sm5Var) {
        Object S = hv.S(sm5Var, this.a, false, true, new wm5(this, list, 0));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }

    @Override // defpackage.vm5
    public final Object z(List list, um5 um5Var) {
        Object S = hv.S(um5Var, this.a, false, true, new wm5(this, list, 2));
        if (S == x61.COROUTINE_SUSPENDED) {
            return S;
        }
        return jg7.a;
    }
}
