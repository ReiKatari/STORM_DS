package defpackage;

import java.util.List;
import java.util.ListIterator;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l61  reason: default package */
/* loaded from: classes.dex */
public final class l61 implements cj2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public l61(by5 by5Var, l34 l34Var, kt5 kt5Var, k24 k24Var, ae6 ae6Var) {
        this.B = by5Var;
        this.L = l34Var;
        this.R = kt5Var;
        this.X = k24Var;
        this.Y = ae6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [sk2, tu0] */
    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        ?? r4;
        int i4 = this.A;
        o27 o27Var = o27.a;
        Object obj5 = this.R;
        Object obj6 = this.Y;
        Object obj7 = this.X;
        Object obj8 = this.L;
        Object obj9 = this.B;
        switch (i4) {
            case 0:
                ni3 ni3Var = (ni3) obj;
                int intValue = ((Number) obj2).intValue();
                tu0 tu0Var = (tu0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                mi2 mi2Var = (mi2) obj5;
                aj2 aj2Var = (aj2) obj6;
                aj2 aj2Var2 = (aj2) obj7;
                mi2 mi2Var2 = (mi2) obj8;
                if ((intValue2 & 6) == 0) {
                    if (((sk2) tu0Var).f(ni3Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i = i3 | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (((sk2) tu0Var).d(intValue)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    i |= i2;
                }
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                ?? r9 = (sk2) tu0Var;
                if (r9.O(i & 1, z)) {
                    DSiWareTitle dSiWareTitle = (DSiWareTitle) ((List) obj9).get(intValue);
                    r9.X(-532459994);
                    zy3 c = o76.c(wy3.a, 1.0f);
                    boolean f = r9.f(mi2Var2) | r9.h(dSiWareTitle);
                    Object L = r9.L();
                    Object obj10 = su0.a;
                    if (f || L == obj10) {
                        L = new j61(0, mi2Var2, dSiWareTitle);
                        r9.h0(L);
                    }
                    ki2 ki2Var = (ki2) L;
                    boolean f2 = r9.f(aj2Var2) | r9.h(dSiWareTitle);
                    Object L2 = r9.L();
                    if (f2 || L2 == obj10) {
                        L2 = new k61(aj2Var2, dSiWareTitle, 0);
                        r9.h0(L2);
                    }
                    mi2 mi2Var3 = (mi2) L2;
                    boolean f3 = r9.f(aj2Var) | r9.h(dSiWareTitle);
                    Object L3 = r9.L();
                    if (f3 || L3 == obj10) {
                        L3 = new k61(aj2Var, dSiWareTitle, 1);
                        r9.h0(L3);
                    }
                    mi2 mi2Var4 = (mi2) L3;
                    boolean f4 = r9.f(mi2Var) | r9.h(dSiWareTitle);
                    Object L4 = r9.L();
                    if (f4 || L4 == obj10) {
                        L4 = new j61(1, mi2Var, dSiWareTitle);
                        r9.h0(L4);
                    }
                    a53.e(c, dSiWareTitle, ki2Var, mi2Var3, mi2Var4, (ki2) L4, r9, 6);
                    r9.p(false);
                } else {
                    r9.R();
                }
                return o27Var;
            default:
                gn gnVar = (gn) obj;
                l34 l34Var = (l34) obj2;
                tu0 tu0Var2 = (tu0) obj3;
                ((Number) obj4).intValue();
                boolean x = b53.x(((by5) obj9).c.getValue(), (l34) obj8);
                if (!((Boolean) ((k24) obj7).getValue()).booleanValue() && !x) {
                    List list = (List) ((ae6) obj6).getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            r4 = listIterator.previous();
                            if (b53.x(l34Var, (l34) r4)) {
                            }
                        } else {
                            r4 = 0;
                        }
                    }
                    l34Var = r4;
                }
                sk2 sk2Var = (sk2) tu0Var2;
                if (l34Var == null) {
                    sk2Var.X(105930796);
                } else {
                    sk2Var.X(-1520603531);
                    mj2.a(l34Var, (jt5) obj5, ct3.H0(-1263531443, new ze1(l34Var, gnVar), sk2Var), sk2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                }
                sk2Var.p(false);
                return o27Var;
        }
    }

    public l61(List list, mi2 mi2Var, aj2 aj2Var, aj2 aj2Var2, mi2 mi2Var2) {
        this.B = list;
        this.L = mi2Var;
        this.X = aj2Var;
        this.Y = aj2Var2;
        this.R = mi2Var2;
    }
}
