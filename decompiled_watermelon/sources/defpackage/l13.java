package defpackage;

import android.content.Context;
import me.magnum.melonds.ui.inputsetup.b;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l13  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class l13 implements bj2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ mi2 B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;
    public final /* synthetic */ Object d0;

    public /* synthetic */ l13(jj5 jj5Var, String str, String[] strArr, x66 x66Var, Context context, mi2 mi2Var, gt3 gt3Var, rg5 rg5Var) {
        this.L = jj5Var;
        this.R = str;
        this.X = strArr;
        this.Y = x66Var;
        this.Z = context;
        this.B = mi2Var;
        this.c0 = gt3Var;
        this.d0 = rg5Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        ym5 ym5Var;
        ki2 ej5Var;
        boolean z4;
        int i;
        int i2 = this.A;
        o27 o27Var = o27.a;
        Object obj4 = this.d0;
        Object obj5 = this.c0;
        Object obj6 = this.Z;
        Object obj7 = this.Y;
        Object obj8 = this.X;
        Object obj9 = this.R;
        Object obj10 = this.L;
        switch (i2) {
            case 0:
                u86 u86Var = (u86) obj10;
                b.a aVar = (b.a) obj9;
                ki2 ki2Var = (ki2) obj8;
                ki2 ki2Var2 = (ki2) obj7;
                mi2 mi2Var = (mi2) obj6;
                mi2 mi2Var2 = (mi2) obj5;
                mi2 mi2Var3 = (mi2) obj4;
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ni3) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    q13.d(u86Var, aVar, ki2Var, ki2Var2, this.B, mi2Var, mi2Var2, mi2Var3, sk2Var, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                jj5 jj5Var = (jj5) obj10;
                String str2 = (String) obj9;
                String[] strArr = (String[]) obj8;
                x66 x66Var = (x66) obj7;
                Context context = (Context) obj6;
                gt3 gt3Var = (gt3) obj5;
                rg5 rg5Var = (rg5) obj4;
                mr0 mr0Var = (mr0) obj;
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                mr0Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((sk2) tu0Var2).f(mr0Var)) {
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
                    String X = me2.X(sk2Var2, R.string.label_rom_config_input_mode);
                    ym5 ym5Var2 = jj5Var.k;
                    if (ym5Var2 == ym5.GLOBAL) {
                        str = nl2.c(context, str2);
                    } else {
                        str = strArr[ym5Var2.ordinal()];
                    }
                    ym5 ym5Var3 = ym5.CUSTOM;
                    if (ym5Var2 == ym5Var3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    mi2 mi2Var4 = this.B;
                    boolean f = sk2Var2.f(x66Var) | sk2Var2.h(context) | sk2Var2.f(str2) | sk2Var2.h(strArr) | sk2Var2.h(jj5Var) | sk2Var2.f(mi2Var4);
                    Object L = sk2Var2.L();
                    if (f || L == su0.a) {
                        ym5Var = ym5Var2;
                        ej5Var = new ej5(x66Var, context, jj5Var, str2, strArr, mi2Var4, 1);
                        sk2Var2.h0(ej5Var);
                    } else {
                        ej5Var = L;
                        ym5Var = ym5Var2;
                    }
                    wi5.a(X, str, false, z3, ej5Var, sk2Var2, 0, 4);
                    if (ym5Var == ym5Var3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ct3.g(mr0Var, z4, null, null, null, null, ct3.H0(-262935005, new m4(gt3Var, context, rg5Var, 7), sk2Var2), sk2Var2, (intValue2 & 14) | 1572864);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }

    public /* synthetic */ l13(u86 u86Var, b.a aVar, ki2 ki2Var, ki2 ki2Var2, mi2 mi2Var, mi2 mi2Var2, mi2 mi2Var3, mi2 mi2Var4) {
        this.L = u86Var;
        this.R = aVar;
        this.X = ki2Var;
        this.Y = ki2Var2;
        this.B = mi2Var;
        this.Z = mi2Var2;
        this.c0 = mi2Var3;
        this.d0 = mi2Var4;
    }
}
