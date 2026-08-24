package defpackage;

import androidx.compose.ui.platform.ComposeView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o0  reason: default package */
/* loaded from: classes.dex */
public final class o0 extends aj3 implements eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p0 p0Var, int i, int i2) {
        super(2);
        this.B = i2;
        this.L = p0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.B;
        x64 x64Var = x64.a;
        boolean z4 = false;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.L;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    ((p0) obj3).a(xq2Var, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    Object P = xq2Var2.P();
                    if (P == ox0.a) {
                        P = ne.Z;
                        xq2Var2.l0(P);
                    }
                    nw7.K(ua6.a(x64Var, false, (qn2) P), (eo2) ((qa4) obj3).getValue(), xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                z42 z42Var = (z42) obj;
                z42 z42Var2 = (z42) obj2;
                z42 z42Var3 = z42.PostExit;
                if (z42Var == z42Var3 && z42Var2 == z42Var3 && !((z72) obj3).a.e) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 3:
                ((Number) obj2).intValue();
                ((ComposeView) obj3).a((px0) obj, ii2.a0(1));
                return jg7Var;
            case 4:
                a74 a74Var = (a74) obj;
                a74 a74Var2 = (y64) obj2;
                px0 px0Var3 = (px0) obj3;
                if (a74Var2 instanceof nx0) {
                    fo2 fo2Var = ((nx0) a74Var2).a;
                    ge7.p(3, fo2Var);
                    a74Var2 = l.D(px0Var3, (a74) fo2Var.e(x64Var, px0Var3, 0));
                }
                return a74Var.d(a74Var2);
            case 5:
                ((Number) obj2).intValue();
                ((gj1) obj3).a((px0) obj, ii2.a0(1));
                return jg7Var;
            case 6:
                px0 px0Var4 = (px0) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var4;
                if (xq2Var3.S(intValue3 & 1, z3)) {
                    List list = (List) obj3;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        eo2 eo2Var = (eo2) list.get(i2);
                        int hashCode = Long.hashCode(xq2Var3.T);
                        jx0.i.getClass();
                        jf jfVar = ix0.c;
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(jfVar);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode));
                        eo2Var.o(xq2Var3, 0);
                        xq2Var3.p(true);
                    }
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            default:
                ((Number) obj2).intValue();
                ((c05) obj3).a((px0) obj, ii2.a0(1));
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj, int i) {
        super(2);
        this.B = i;
        this.L = obj;
    }
}
