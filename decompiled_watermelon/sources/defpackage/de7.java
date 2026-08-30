package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: de7  reason: default package */
/* loaded from: classes.dex */
public abstract class de7 {
    public static final ce7 a(tu0 tu0Var, int i) {
        boolean z;
        vg7 c;
        boolean z2;
        boolean z3;
        an1 an1Var;
        boolean z4;
        be1 be1Var;
        boolean z5 = true;
        if ((i & 1) != 0) {
            z = false;
        } else {
            z = true;
        }
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.X(280825064);
        od1 od1Var = (od1) sk2Var.j(ov0.h);
        yk3 yk3Var = (yk3) ((me7) sk2Var.j(ov0.u));
        if (yk3Var.b == null) {
            ki2 ki2Var = yk3Var.a;
            if (ki2Var == null || (be1Var = (be1) ki2Var.c()) == null) {
                be1Var = be1.c;
            }
            yk3Var.b = me2.G(be1Var);
            yk3Var.a = null;
        }
        tj4 tj4Var = yk3Var.b;
        tj4Var.getClass();
        long B = od1Var.B(hk2.U(((be1) tj4Var.getValue()).a));
        sk2Var.p(false);
        if (z) {
            int i2 = vg7.c;
            c = wg7.c(B, pi1.b, li1.a);
        } else {
            int i3 = vg7.c;
            c = wg7.c(B, pi1.a, li1.a);
        }
        Context context = (Context) sk2Var.j(ue.b);
        boolean f = sk2Var.f(context);
        Object L = sk2Var.L();
        if (f || L == su0.a) {
            pe7.b0.getClass();
            h90 k = se.k(new zw5(oe7.a(context), context, null, 13));
            bb1 bb1Var = tg1.a;
            L = new a7(se.x(k, bt3.a), 3);
            sk2Var.h0(L);
        }
        an1 an1Var2 = an1.Y;
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (kq2 kq2Var : (List) me2.l((u92) L, pp1.A, null, sk2Var, 48, 2).getValue()) {
            an1 a = kq2Var.a();
            t40 t40Var = kq2Var.a;
            an1 an1Var3 = kq2Var.c;
            if (a == an1.c0 && an1Var3 == an1.e0) {
                z6 = z5;
            }
            Rect c2 = t40Var.c();
            y55 y55Var = new y55(c2.left, c2.top, c2.right, c2.bottom);
            if (an1Var3 != an1.d0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (kq2Var.a() != an1.Z) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean b = kq2Var.b();
            if (t40Var.b() != 0 && t40Var.a() != 0) {
                an1Var = an1Var2;
            } else {
                an1Var = an1.X;
            }
            if (an1Var != an1Var2) {
                z4 = false;
            } else {
                z4 = true;
            }
            arrayList.add(new tr2(y55Var, z2, z3, b, z4));
            z5 = true;
        }
        return new ce7(c, new ir4(arrayList, z6));
    }

    public static boolean b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = Build.MODEL;
            str.getClass();
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (gh6.n0(upperCase, (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }
}
