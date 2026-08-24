package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z00  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z00 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;

    public /* synthetic */ z00(rs4 rs4Var, List list, ah5 ah5Var, ah5 ah5Var2, w61 w61Var, qj6 qj6Var, on2 on2Var) {
        this.A = 3;
        this.L = rs4Var;
        this.B = list;
        this.R = ah5Var;
        this.X = ah5Var2;
        this.Y = w61Var;
        this.Z = qj6Var;
        this.d0 = on2Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        float f;
        Object obj2;
        float f2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        int i2 = 1;
        Object obj3 = this.d0;
        Object obj4 = this.X;
        Object obj5 = this.R;
        Object obj6 = this.Z;
        Object obj7 = this.Y;
        Object obj8 = this.L;
        Object obj9 = this.B;
        switch (i) {
            case 0:
                List list = (List) obj9;
                oo3 oo3Var = (oo3) obj;
                oo3Var.getClass();
                oo3Var.h0(list.size(), null, new j5(3, list), new zv0(-1117249557, true, new c10(list, (UUID) obj8, (qn2) obj5, (sg6) obj6, (sn) obj3, (qn2) obj4, (qn2) obj7)));
                return jg7Var;
            case 1:
                List list2 = (List) obj9;
                er3 er3Var = (er3) obj;
                er3Var.getClass();
                er3Var.h0(list2.size(), new r5(15, new v83(10), list2), new j5(13, list2), new zv0(802480018, true, new c10(list2, (UUID) obj8, (qn2) obj5, (qn2) obj4, (qn2) obj7, (na4) obj6, (qn2) obj3)));
                return jg7Var;
            case 2:
                x94 x94Var = (x94) obj9;
                uw0 uw0Var = (uw0) obj8;
                qn2 qn2Var = (qn2) obj5;
                qn2 qn2Var2 = (qn2) obj4;
                qn2 qn2Var3 = (qn2) obj7;
                qa4 qa4Var = (qa4) obj3;
                yn ynVar = (yn) obj;
                if (((List) ((pp6) obj6).getValue()).contains(ynVar.a())) {
                    String str = ((sb4) ynVar.a()).Y;
                    int b = x94Var.b(str);
                    if (b >= 0) {
                        f = x94Var.c[b];
                    } else {
                        x94Var.d(str, RecyclerView.B1);
                        f = 0.0f;
                    }
                    if (!nb3.k(((sb4) ynVar.c()).Y, ((sb4) ynVar.a()).Y)) {
                        if (!((Boolean) uw0Var.c.getValue()).booleanValue() && !((Boolean) qa4Var.getValue()).booleanValue()) {
                            f += 1.0f;
                        } else {
                            f -= 1.0f;
                        }
                    }
                    x94Var.d(((sb4) ynVar.c()).Y, f);
                    return new b41((o52) qn2Var.g(ynVar), (z72) qn2Var2.g(ynVar), f, (gj6) qn2Var3.g(ynVar));
                }
                return f04.U(o52.b, z72.b);
            case 3:
                List list3 = (List) obj9;
                w61 w61Var = (w61) obj7;
                qj6 qj6Var = (qj6) obj6;
                on2 on2Var = (on2) obj3;
                float floatValue = ((Float) obj).floatValue();
                float h = ((rs4) obj8).h();
                float f3 = ((ah5) obj5).A;
                float f4 = ((ah5) obj4).A;
                if (list3.isEmpty()) {
                    obj2 = null;
                } else {
                    obj2 = list3.get(0);
                    float abs = Math.abs(oi2.L(f3, f4, ((Number) obj2).floatValue()) - h);
                    int size = list3.size() - 1;
                    if (1 <= size) {
                        while (true) {
                            Object obj10 = list3.get(i2);
                            float abs2 = Math.abs(oi2.L(f3, f4, ((Number) obj10).floatValue()) - h);
                            if (Float.compare(abs, abs2) > 0) {
                                obj2 = obj10;
                                abs = abs2;
                            }
                            if (i2 != size) {
                                i2++;
                            }
                        }
                    }
                }
                Float f5 = (Float) obj2;
                if (f5 != null) {
                    f2 = oi2.L(f3, f4, f5.floatValue());
                } else {
                    f2 = h;
                }
                if (h == f2) {
                    if (!((Boolean) qj6Var.B.getValue()).booleanValue() && on2Var != null) {
                        on2Var.c();
                    }
                } else {
                    hv.L(w61Var, null, null, new ek6(qj6Var, h, f2, floatValue, on2Var, null), 3);
                }
                return jg7Var;
            default:
                List list4 = (List) obj9;
                sr7 sr7Var = (sr7) obj8;
                er3 er3Var2 = (er3) obj;
                er3Var2.getClass();
                er3.g0(er3Var2, null, null, new zv0(872362272, true, new l4(18, sr7Var, (on2) obj7)), 3);
                er3Var2.h0(list4.size(), new r5(27, new rk7(4), list4), new j5(24, list4), new zv0(802480018, true, new xc4(list4, sr7Var, (String) obj6, (qn2) obj5, (qn2) obj4, 1)));
                er3.g0(er3Var2, null, null, new zv0(-1496507369, true, new h5(3, (on2) obj3)), 3);
                return jg7Var;
        }
    }

    public /* synthetic */ z00(Object obj, Object obj2, qn2 qn2Var, qn2 qn2Var2, qn2 qn2Var3, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = qn2Var;
        this.X = qn2Var2;
        this.Y = qn2Var3;
        this.Z = obj3;
        this.d0 = obj4;
    }

    public /* synthetic */ z00(List list, sr7 sr7Var, on2 on2Var, String str, qn2 qn2Var, qn2 qn2Var2, on2 on2Var2) {
        this.A = 4;
        this.B = list;
        this.L = sr7Var;
        this.Y = on2Var;
        this.Z = str;
        this.R = qn2Var;
        this.X = qn2Var2;
        this.d0 = on2Var2;
    }

    public /* synthetic */ z00(List list, UUID uuid, qn2 qn2Var, sg6 sg6Var, sn snVar, qn2 qn2Var2, qn2 qn2Var3) {
        this.A = 0;
        this.B = list;
        this.L = uuid;
        this.R = qn2Var;
        this.Z = sg6Var;
        this.d0 = snVar;
        this.X = qn2Var2;
        this.Y = qn2Var3;
    }
}
