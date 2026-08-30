package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wm  reason: default package */
/* loaded from: classes.dex */
public abstract class wm {
    public static final sc6 a = ct3.P0(RecyclerView.A1, RecyclerView.A1, null, 7);

    static {
        y55 y55Var = tc7.a;
        ct3.P0(RecyclerView.A1, RecyclerView.A1, new ji1(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final ae6 a(float f, xy6 xy6Var, tu0 tu0Var, int i, int i2) {
        String str;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        } else {
            str = "switch_knob";
        }
        return c(new ji1(f), dt3.i0, xy6Var, null, str, tu0Var, 384 | ((i << 6) & 57344), 8);
    }

    public static final ae6 b(float f, ho hoVar, String str, tu0 tu0Var, int i, int i2) {
        sc6 sc6Var;
        int i3 = i2 & 2;
        sc6 sc6Var2 = a;
        if (i3 != 0) {
            hoVar = sc6Var2;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (hoVar == sc6Var2) {
            sk2 sk2Var = (sk2) tu0Var;
            sk2Var.X(1144115775);
            boolean c = sk2Var.c(0.01f);
            Object L = sk2Var.L();
            if (c || L == su0.a) {
                L = ct3.P0(RecyclerView.A1, RecyclerView.A1, Float.valueOf(0.01f), 3);
                sk2Var.h0(L);
            }
            sk2Var.p(false);
            sc6Var = (sc6) L;
        } else {
            sk2 sk2Var2 = (sk2) tu0Var;
            sk2Var2.X(1144225701);
            sk2Var2.p(false);
            sc6Var = hoVar;
        }
        return c(Float.valueOf(f), dt3.g0, sc6Var, null, str2, tu0Var, (i << 3) & 57344, 0);
    }

    public static final ae6 c(Object obj, bz6 bz6Var, ho hoVar, Float f, String str, tu0 tu0Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        Object obj2 = su0.a;
        if (L == obj2) {
            L = me2.G(null);
            sk2Var.h0(L);
        }
        k24 k24Var = (k24) L;
        Object L2 = sk2Var.L();
        if (L2 == obj2) {
            L2 = new um(obj, bz6Var, f);
            sk2Var.h0(L2);
        }
        um umVar = (um) L2;
        Object L3 = me2.L(null, sk2Var);
        if (f != null && (hoVar instanceof sc6)) {
            sc6 sc6Var = (sc6) hoVar;
            if (!b53.x(sc6Var.c, f)) {
                hoVar = new sc6(sc6Var.a, sc6Var.b, f);
            }
        }
        Object L4 = me2.L(hoVar, sk2Var);
        Object L5 = sk2Var.L();
        if (L5 == obj2) {
            L5 = n40.f(-1, null, null, 6);
            sk2Var.h0(L5);
        }
        Object obj3 = (lj0) L5;
        boolean h = sk2Var.h(obj3) | sk2Var.h(obj);
        Object L6 = sk2Var.L();
        if (h || L6 == obj2) {
            L6 = new p6(7, obj3, obj);
            sk2Var.h0(L6);
        }
        l.j((ki2) L6, sk2Var);
        boolean h2 = sk2Var.h(obj3) | sk2Var.h(umVar) | sk2Var.f(L4) | sk2Var.f(L3);
        Object L7 = sk2Var.L();
        if (h2 || L7 == obj2) {
            Object vmVar = new vm(obj3, umVar, L4, L3, null, 0);
            sk2Var.h0(vmVar);
            L7 = vmVar;
        }
        l.g(sk2Var, (aj2) L7, obj3);
        ae6 ae6Var = (ae6) k24Var.getValue();
        if (ae6Var == null) {
            return umVar.c;
        }
        return ae6Var;
    }
}
