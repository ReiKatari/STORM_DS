package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iz implements mi2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;

    public /* synthetic */ iz(r14 r14Var, yt0 yt0Var, mi2 mi2Var, mi2 mi2Var2, mi2 mi2Var3, ae6 ae6Var, k24 k24Var) {
        this.X = r14Var;
        this.Y = yt0Var;
        this.B = mi2Var;
        this.L = mi2Var2;
        this.R = mi2Var3;
        this.Z = ae6Var;
        this.c0 = k24Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        float f;
        Object obj2;
        float f2;
        int i = this.A;
        o27 o27Var = o27.a;
        int i2 = 1;
        Object obj3 = this.c0;
        Object obj4 = this.Z;
        Object obj5 = this.R;
        Object obj6 = this.L;
        Object obj7 = this.B;
        Object obj8 = this.X;
        Object obj9 = this.Y;
        switch (i) {
            case 0:
                List list = (List) obj8;
                ph3 ph3Var = (ph3) obj;
                ph3Var.getClass();
                ph3Var.b0(list.size(), null, new k5(3, list), new et0(-1117249557, true, new lz(list, (UUID) obj9, (mi2) obj7, (g56) obj4, (gn) obj3, (mi2) obj6, (mi2) obj5)));
                return o27Var;
            case 1:
                r14 r14Var = (r14) obj8;
                yt0 yt0Var = (yt0) obj9;
                mi2 mi2Var = (mi2) obj7;
                mi2 mi2Var2 = (mi2) obj6;
                mi2 mi2Var3 = (mi2) obj5;
                k24 k24Var = (k24) obj3;
                mn mnVar = (mn) obj;
                if (((List) ((ae6) obj4).getValue()).contains(mnVar.a())) {
                    String str = ((l34) mnVar.a()).Y;
                    int b = r14Var.b(str);
                    if (b >= 0) {
                        f = r14Var.c[b];
                    } else {
                        r14Var.d(str, RecyclerView.A1);
                        f = 0.0f;
                    }
                    if (!b53.x(((l34) mnVar.c()).Y, ((l34) mnVar.a()).Y)) {
                        if (!((Boolean) yt0Var.c.getValue()).booleanValue() && !((Boolean) k24Var.getValue()).booleanValue()) {
                            f += 1.0f;
                        } else {
                            f -= 1.0f;
                        }
                    }
                    r14Var.d(((l34) mnVar.c()).Y, f);
                    return new u01((z02) mi2Var.n(mnVar), (h32) mi2Var2.n(mnVar), f, (r76) mi2Var3.n(mnVar));
                }
                return b53.m0(z02.b, h32.b);
            case 2:
                List list2 = (List) obj8;
                ek3 ek3Var = (ek3) obj;
                ek3Var.getClass();
                ek3Var.b0(list2.size(), new s5(19, new vu4(28), list2), new k5(14, list2), new et0(802480018, true, new lz(list2, (mi2) obj7, (Map) obj9, (Map) obj4, (mi2) obj6, (mi2) obj5, (mi2) obj3)));
                return o27Var;
            default:
                List list3 = (List) obj8;
                o31 o31Var = (o31) obj5;
                b86 b86Var = (b86) obj4;
                ki2 ki2Var = (ki2) obj3;
                float floatValue = ((Float) obj).floatValue();
                float h = ((pj4) obj9).h();
                float f3 = ((k75) obj7).A;
                float f4 = ((k75) obj6).A;
                if (list3.isEmpty()) {
                    obj2 = null;
                } else {
                    obj2 = list3.get(0);
                    float abs = Math.abs(ep2.y(f3, f4, ((Number) obj2).floatValue()) - h);
                    int size = list3.size() - 1;
                    if (1 <= size) {
                        while (true) {
                            Object obj10 = list3.get(i2);
                            float abs2 = Math.abs(ep2.y(f3, f4, ((Number) obj10).floatValue()) - h);
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
                    f2 = ep2.y(f3, f4, f5.floatValue());
                } else {
                    f2 = h;
                }
                if (h == f2) {
                    if (!((Boolean) b86Var.B.getValue()).booleanValue() && ki2Var != null) {
                        ki2Var.c();
                    }
                } else {
                    tq5.w(o31Var, null, null, new o86(b86Var, h, f2, floatValue, ki2Var, null), 3);
                }
                return o27Var;
        }
    }

    public /* synthetic */ iz(pj4 pj4Var, List list, k75 k75Var, k75 k75Var2, o31 o31Var, b86 b86Var, ki2 ki2Var) {
        this.Y = pj4Var;
        this.X = list;
        this.B = k75Var;
        this.L = k75Var2;
        this.R = o31Var;
        this.Z = b86Var;
        this.c0 = ki2Var;
    }

    public /* synthetic */ iz(List list, mi2 mi2Var, Map map, Map map2, mi2 mi2Var2, mi2 mi2Var3, mi2 mi2Var4) {
        this.X = list;
        this.B = mi2Var;
        this.Y = map;
        this.Z = map2;
        this.L = mi2Var2;
        this.R = mi2Var3;
        this.c0 = mi2Var4;
    }

    public /* synthetic */ iz(List list, UUID uuid, mi2 mi2Var, g56 g56Var, gn gnVar, mi2 mi2Var2, mi2 mi2Var3) {
        this.X = list;
        this.Y = uuid;
        this.B = mi2Var;
        this.Z = g56Var;
        this.c0 = gnVar;
        this.L = mi2Var2;
        this.R = mi2Var3;
    }
}
