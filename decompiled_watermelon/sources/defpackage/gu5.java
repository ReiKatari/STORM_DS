package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.ui.settings.fragments.SoftInputBehaviourPreferencesFragmentKt;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gu5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gu5 implements aj2 {
    public final /* synthetic */ int A;

    public /* synthetic */ gu5(int i) {
        this.A = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i;
        int i2 = this.A;
        vn1 vn1Var = u06.a;
        Integer num = null;
        o27 o27Var = o27.a;
        boolean z = true;
        switch (i2) {
            case 0:
                it5 it5Var = (it5) obj;
                xb6 xb6Var = (xb6) obj2;
                xq0 xq0Var = new xq0(xb6Var.a.b());
                iu5 iu5Var = ku5.r;
                Object a = ku5.a(xq0Var, iu5Var, it5Var);
                is6 is6Var = new is6(xb6Var.b);
                iu5 iu5Var2 = ku5.x;
                Object a2 = ku5.a(is6Var, iu5Var2, it5Var);
                pe2 pe2Var = xb6Var.c;
                pe2 pe2Var2 = pe2.B;
                Object a3 = ku5.a(pe2Var, ku5.n, it5Var);
                Object a4 = ku5.a(xb6Var.d, ku5.v, it5Var);
                Object a5 = ku5.a(xb6Var.e, ku5.w, it5Var);
                String str = xb6Var.g;
                Object a6 = ku5.a(new is6(xb6Var.h), iu5Var2, it5Var);
                Object a7 = ku5.a(xb6Var.i, ku5.o, it5Var);
                Object a8 = ku5.a(xb6Var.j, ku5.l, it5Var);
                fr3 fr3Var = xb6Var.k;
                fr3 fr3Var2 = fr3.L;
                Object a9 = ku5.a(fr3Var, ku5.A, it5Var);
                Object a10 = ku5.a(new xq0(xb6Var.l), iu5Var, it5Var);
                Object a11 = ku5.a(xb6Var.m, ku5.k, it5Var);
                u26 u26Var = xb6Var.n;
                u26 u26Var2 = u26.d;
                return l07.n(a, a2, a3, a4, a5, -1, str, a6, a7, a8, a9, a10, a11, ku5.a(u26Var, ku5.q, it5Var));
            case 1:
                it5 it5Var2 = (it5) obj;
                rr6 rr6Var = (rr6) obj2;
                xb6 xb6Var2 = rr6Var.a;
                ci3 ci3Var = ku5.i;
                return l07.n(ku5.a(xb6Var2, ci3Var, it5Var2), ku5.a(rr6Var.b, ci3Var, it5Var2), ku5.a(rr6Var.c, ci3Var, it5Var2), ku5.a(rr6Var.d, ci3Var, it5Var2));
            case 2:
                qo4 qo4Var = (qo4) obj2;
                Boolean valueOf = Boolean.valueOf(qo4Var.a);
                ci3 ci3Var2 = ku5.a;
                return l07.n(valueOf, ku5.a(new ap1(qo4Var.b), l.p, (it5) obj));
            case 3:
                it5 it5Var3 = (it5) obj;
                return Integer.valueOf(((ap1) obj2).a);
            case 4:
                it5 it5Var4 = (it5) obj;
                return Integer.valueOf(((qn3) obj2).a);
            case 5:
                tr6 tr6Var = (tr6) obj2;
                return l07.n(ku5.a(new sr6(tr6Var.a), l.s, (it5) obj), Boolean.valueOf(tr6Var.b));
            case ig7.b /* 6 */:
                it5 it5Var5 = (it5) obj;
                return Integer.valueOf(((sr6) obj2).a);
            case 7:
                it5 it5Var6 = (it5) obj;
                return Integer.valueOf(((fw5) obj2).a.h());
            case 8:
                qo0 qo0Var = (qo0) obj;
                List list = (List) obj2;
                qo0Var.getClass();
                list.getClass();
                ArrayList S = me2.S(vn1Var, list, true);
                S.getClass();
                return me2.I(qo0Var, S, new c5(3, list));
            case 9:
                qo0 qo0Var2 = (qo0) obj;
                List list2 = (List) obj2;
                qo0Var2.getClass();
                list2.getClass();
                ArrayList S2 = me2.S(vn1Var, list2, true);
                S2.getClass();
                m93 I = me2.I(qo0Var2, S2, new c5(4, list2));
                if (I == null) {
                    return null;
                }
                return l07.R(I);
            case 10:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                Log.i(str2, str3);
                return o27Var;
            case 11:
                ((Integer) obj2).getClass();
                SoftInputBehaviourPreferencesFragmentKt.b((tu0) obj, ep2.I(1));
                return o27Var;
            case mj2.L /* 12 */:
                return Integer.valueOf(((mv3) obj).e0(((Integer) obj2).intValue()));
            case 13:
                return Integer.valueOf(((mv3) obj).g0(((Integer) obj2).intValue()));
            case 14:
                return Integer.valueOf(((mv3) obj).f(((Integer) obj2).intValue()));
            case ig7.e /* 15 */:
                return Integer.valueOf(((mv3) obj).T(((Integer) obj2).intValue()));
            case 16:
                it5 it5Var7 = (it5) obj;
                up6 up6Var = (up6) obj2;
                Float valueOf2 = Float.valueOf(up6Var.a.h());
                if (((jf4) up6Var.f.getValue()) != jf4.Vertical) {
                    z = false;
                }
                return l07.c0(valueOf2, Boolean.valueOf(z));
            case 17:
                it5 it5Var8 = (it5) obj;
                oq6 oq6Var = (oq6) obj2;
                return l07.n(ku5.a(oq6Var.a, ku5.a, it5Var8), ku5.a(new vr6(oq6Var.b), ku5.p, it5Var8));
            case 18:
                c31 c31Var = (c31) obj2;
                if (!(c31Var instanceof us6)) {
                    return obj;
                }
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                }
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                if (i == 0) {
                    return c31Var;
                }
                return Integer.valueOf(i + 1);
            case 19:
                us6 us6Var = (us6) obj;
                c31 c31Var2 = (c31) obj2;
                if (us6Var != null) {
                    return us6Var;
                }
                if (!(c31Var2 instanceof us6)) {
                    return null;
                }
                return (us6) c31Var2;
            case 20:
                zs6 zs6Var = (zs6) obj;
                c31 c31Var3 = (c31) obj2;
                if (c31Var3 instanceof us6) {
                    us6 us6Var2 = (us6) c31Var3;
                    e31 e31Var = zs6Var.a;
                    Object b = us6Var2.b();
                    Object[] objArr = zs6Var.b;
                    int i3 = zs6Var.d;
                    objArr[i3] = b;
                    us6[] us6VarArr = zs6Var.c;
                    zs6Var.d = i3 + 1;
                    us6VarArr[i3] = us6Var2;
                }
                return zs6Var;
            case 21:
                o27 o27Var2 = (o27) obj2;
                ((vf3) obj).c0 = true;
                return o27Var;
            case 22:
                ((Integer) obj2).getClass();
                jv3.h((tu0) obj, ep2.I(1));
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                oo2.m((tu0) obj, ep2.I(1));
                return o27Var;
        }
    }

    public /* synthetic */ gu5(int i, int i2) {
        this.A = i2;
    }
}
