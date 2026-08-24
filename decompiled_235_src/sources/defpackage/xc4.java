package defpackage;

import java.util.List;
import java.util.ListIterator;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xc4  reason: default package */
/* loaded from: classes.dex */
public final class xc4 implements go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ xc4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        long j;
        int i2;
        int i3;
        int i4 = this.A;
        jg7 jg7Var = jg7.a;
        Object obj5 = this.Y;
        sb4 sb4Var = null;
        Object obj6 = this.R;
        Object obj7 = this.L;
        Object obj8 = this.B;
        Object obj9 = this.X;
        switch (i4) {
            case 0:
                sn snVar = (sn) obj;
                sb4 sb4Var2 = (sb4) obj2;
                px0 px0Var = (px0) obj3;
                ((Number) obj4).intValue();
                boolean k = nb3.k(((n96) obj8).c.getValue(), (sb4) obj7);
                if (!((Boolean) ((qa4) obj9).getValue()).booleanValue() && !k) {
                    List list = (List) ((pp6) obj5).getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Object previous = listIterator.previous();
                            if (nb3.k(sb4Var2, (sb4) previous)) {
                                sb4Var = previous;
                            }
                        }
                    }
                    sb4Var2 = sb4Var;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (sb4Var2 == null) {
                    xq2Var.b0(105930796);
                } else {
                    xq2Var.b0(-1520603531);
                    kn2.f(sb4Var2, (o46) obj6, n16.I(-1263531443, new dj1(sb4Var2, snVar), xq2Var), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                }
                xq2Var.p(false);
                return jg7Var;
            default:
                lp3 lp3Var = (lp3) obj;
                int intValue = ((Number) obj2).intValue();
                px0 px0Var2 = (px0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                qn2 qn2Var = (qn2) obj9;
                if ((intValue2 & 6) == 0) {
                    if (((xq2) px0Var2).f(lp3Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i = i3 | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (((xq2) px0Var2).d(intValue)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    i |= i2;
                }
                boolean z2 = true;
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(i & 1, z)) {
                    zq7 zq7Var = (zq7) ((List) obj8).get(intValue);
                    xq2Var2.b0(1307584831);
                    if (((sr7) obj7) != sr7.CUSTOM || !nb3.k((String) obj6, zq7Var.a)) {
                        z2 = false;
                    }
                    a74 c = dj6.c(x64.a, 1.0f);
                    boolean f = xq2Var2.f(qn2Var) | xq2Var2.f(zq7Var);
                    Object P = xq2Var2.P();
                    if (f || P == ox0.a) {
                        P = new lr7(qn2Var, zq7Var, 0);
                        xq2Var2.l0(P);
                    }
                    a74 u = mb3.u(c, false, null, (on2) P, 15);
                    y16 b = z16.b(12.0f);
                    if (z2) {
                        xq2Var2.b0(319284742);
                        xq2Var2.p(false);
                        j = kt0.c(0.15f, hv.c(4278556265L));
                    } else {
                        xq2Var2.b0(319286714);
                        j = ((ut0) xq2Var2.j(vt0.a)).j();
                        xq2Var2.p(false);
                    }
                    hf.b(u, b, j, 2.0f, n16.I(-565872080, new mr7(z2, qn2Var, zq7Var, (qn2) obj5), xq2Var2), xq2Var2, 1769472, 24);
                    xq2Var2.p(false);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
