package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import java.util.UUID;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qz implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ qz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
        this.Z = obj6;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        boolean z2;
        int i;
        String c;
        int i2 = this.A;
        boolean z3 = false;
        o27 o27Var = o27.a;
        sn1 sn1Var = su0.a;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        Object obj6 = this.X;
        Object obj7 = this.R;
        Object obj8 = this.L;
        Object obj9 = this.B;
        switch (i2) {
            case 0:
                g56 g56Var = (g56) obj9;
                vy vyVar = (vy) obj8;
                gn gnVar = (gn) obj7;
                Context context = (Context) obj6;
                k24 k24Var = (k24) obj5;
                ki2 ki2Var = (ki2) obj4;
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ih4) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    sk2Var.X(818336960);
                    UUID uuid = vyVar.a;
                    if (uuid != null) {
                        str = uuid.toString();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    g56Var.getClass();
                    f56 d = g56.d(str, sk2Var);
                    wy3 wy3Var = wy3.a;
                    zy3 f = g56.e(g56Var, wy3Var, d, gnVar).f(o76.c);
                    Object L = sk2Var.L();
                    if (L == sn1Var) {
                        L = new f4(k24Var, 6);
                        sk2Var.h0(L);
                    }
                    zy3 r = a53.r(f, null, null, false, null, (ki2) L, 28);
                    tw2 tw2Var = new tw2(context);
                    tw2Var.c = vyVar.c;
                    tw2Var.e = new fh(context, (byte) 0);
                    cg2.b(tw2Var.a(), null, r, null, RecyclerView.A1, sk2Var, 48, 4088);
                    sk2Var.p(false);
                    zy3 c2 = o76.c(wy3Var, 1.0f);
                    WeakHashMap weakHashMap = dg7.w;
                    zy3 x0 = l07.x0(c2, hm1.n(sk2Var).o);
                    boolean booleanValue = ((Boolean) k24Var.getValue()).booleanValue();
                    Object L2 = sk2Var.L();
                    if (L2 == sn1Var) {
                        L2 = new k4(14);
                        sk2Var.h0(L2);
                    }
                    z02 a = t02.i(1, (mi2) L2).a(t02.d(null, 3));
                    Object L3 = sk2Var.L();
                    if (L3 == sn1Var) {
                        L3 = new k4(15);
                        sk2Var.h0(L3);
                    }
                    ct3.m(booleanValue, x0, a, t02.k((mi2) L3).a(t02.e(null, 3)), null, ct3.H0(1706257270, new i5(1, ki2Var), sk2Var), sk2Var, 200064);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                l44 l44Var = (l44) obj9;
                tq5 tq5Var = (tq5) obj8;
                pn0 pn0Var = (pn0) obj7;
                o31 o31Var = (o31) obj6;
                Resources resources = (Resources) obj5;
                r96 r96Var = (r96) obj4;
                ih4 ih4Var = (ih4) obj;
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ih4Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((sk2) tu0Var2).f(ih4Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    Object L4 = sk2Var2.L();
                    if (L4 == sn1Var) {
                        L4 = new nl0(1);
                        sk2Var2.h0(L4);
                    }
                    mi2 mi2Var = (mi2) L4;
                    Object L5 = sk2Var2.L();
                    if (L5 == sn1Var) {
                        L5 = new nl0(2);
                        sk2Var2.h0(L5);
                    }
                    mi2 mi2Var2 = (mi2) L5;
                    Object L6 = sk2Var2.L();
                    if (L6 == sn1Var) {
                        L6 = new nl0(3);
                        sk2Var2.h0(L6);
                    }
                    mi2 mi2Var3 = (mi2) L6;
                    Object L7 = sk2Var2.L();
                    if (L7 == sn1Var) {
                        L7 = new nl0(4);
                        sk2Var2.h0(L7);
                    }
                    mi2 mi2Var4 = (mi2) L7;
                    boolean h = sk2Var2.h(pn0Var);
                    if ((intValue2 & 14) == 4) {
                        z3 = true;
                    }
                    boolean h2 = h | z3 | sk2Var2.h(o31Var) | sk2Var2.h(resources);
                    Object L8 = sk2Var2.L();
                    if (h2 || L8 == sn1Var) {
                        e5 e5Var = new e5(pn0Var, ih4Var, o31Var, resources, r96Var, 4);
                        sk2Var2.h0(e5Var);
                        L8 = e5Var;
                    }
                    io2.f(l44Var, tq5Var, null, null, null, mi2Var, mi2Var2, mi2Var3, mi2Var4, (mi2) L8, sk2Var2, 920125440, 1084);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            default:
                jj5 jj5Var = (jj5) obj9;
                String str2 = (String) obj8;
                x66 x66Var = (x66) obj7;
                Context context2 = (Context) obj6;
                String[] strArr = (String[]) obj5;
                mi2 mi2Var5 = (mi2) obj4;
                tu0 tu0Var3 = (tu0) obj2;
                ((Integer) obj3).getClass();
                ((wn) obj).getClass();
                String X = me2.X(tu0Var3, R.string.internal_resolution);
                Integer num = jj5Var.p;
                if (num == null || (c = strArr[io2.n(num.intValue() - 1, nu.s0(strArr))]) == null) {
                    c = nl2.c(context2, str2);
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                boolean f2 = sk2Var3.f(x66Var) | sk2Var3.h(context2) | sk2Var3.h(strArr) | sk2Var3.f(str2) | sk2Var3.h(jj5Var) | sk2Var3.f(mi2Var5);
                Object L9 = sk2Var3.L();
                if (f2 || L9 == sn1Var) {
                    ej5 ej5Var = new ej5(x66Var, context2, strArr, jj5Var, str2, mi2Var5);
                    sk2Var3.h0(ej5Var);
                    L9 = ej5Var;
                }
                wi5.a(X, c, false, true, (ki2) L9, sk2Var3, 3072, 4);
                return o27Var;
        }
    }
}
