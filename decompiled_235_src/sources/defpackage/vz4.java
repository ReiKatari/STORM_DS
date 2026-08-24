package defpackage;

import android.view.ViewStructure;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vz4  reason: default package */
/* loaded from: classes.dex */
public final class vz4 extends aj3 implements go2 {
    public final /* synthetic */ int B = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz4(zv0 zv0Var) {
        super(4);
        this.L = zv0Var;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4 = this.B;
        jg7 jg7Var = jg7.a;
        Object obj5 = this.L;
        switch (i4) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                ((ViewStructure) obj5).setDimens(intValue, intValue2, 0, 0, ((Number) obj3).intValue() - intValue, ((Number) obj4).intValue() - intValue2);
                return jg7Var;
            default:
                sg6 sg6Var = (sg6) obj;
                a74 a74Var = (a74) obj2;
                px0 px0Var = (px0) obj3;
                int intValue3 = ((Number) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    if (((xq2) px0Var).f(sg6Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i = i3 | intValue3;
                } else {
                    i = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    if (((xq2) px0Var).f(a74Var)) {
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
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(i & 1, z)) {
                    zv0 zv0Var = (zv0) obj5;
                    e34 d = h70.d(d90.L, false);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, a74Var);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, ix0.f, d);
                    yh2.K(xq2Var, ix0.e, l);
                    yh2.x(xq2Var, Integer.valueOf(hashCode), ix0.g);
                    yh2.F(xq2Var, ix0.h);
                    yh2.K(xq2Var, ix0.d, E);
                    zv0Var.e(sg6Var, xq2Var, Integer.valueOf(i & 14));
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz4(ViewStructure viewStructure) {
        super(4);
        this.L = viewStructure;
    }
}
