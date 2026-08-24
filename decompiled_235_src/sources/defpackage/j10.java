package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j10 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ on2 B;

    public /* synthetic */ j10(int i, on2 on2Var) {
        this.A = 1;
        this.B = on2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        on2 on2Var = this.B;
        jg7 jg7Var = jg7.a;
        boolean z2 = false;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z2)) {
                    ej2.b(this.B, null, false, lb4.c, xq2Var, 24576, 14);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                vy7.e(on2Var, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 2:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    ej2.b(this.B, null, false, n16.b, xq2Var2, 24576, 14);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 3:
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z)) {
                    nq6 nq6Var = vt0.a;
                    long h = ((ut0) xq2Var3.j(nq6Var)).h();
                    jy2 jy2Var = u24.m;
                    x64 x64Var = x64.a;
                    a74 j0 = nc1.j0(vy7.L(x64Var, h, jy2Var), nc1.q);
                    e34 d = h70.d(d90.L, false);
                    int hashCode = Long.hashCode(xq2Var3.T);
                    xv4 l = xq2Var3.l();
                    a74 E = l.E(xq2Var3, j0);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var3.f0();
                    if (xq2Var3.S) {
                        xq2Var3.k(iy0Var);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, ix0.f, d);
                    yh2.K(xq2Var3, ix0.e, l);
                    yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var3, ix0.h);
                    yh2.K(xq2Var3, ix0.d, E);
                    a74 c = dj6.c(x64Var, 1.0f);
                    long a = ((ut0) xq2Var3.j(nq6Var)).a();
                    long c2 = ((ut0) xq2Var3.j(nq6Var)).c();
                    WeakHashMap weakHashMap = dv7.w;
                    gq.b(hv.c, new x62(th7.d(xq2Var3).l, new hd2(Integer.MAX_VALUE)), c, n16.I(459088347, new j10(on2Var, 4, (byte) 0), xq2Var3), null, a, c2, RecyclerView.B1, xq2Var3, 3462, 144);
                    xq2Var3.p(true);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 4:
                px0 px0Var4 = (px0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue4 & 1, z2)) {
                    ej2.b(this.B, null, false, hv.d, xq2Var4, 24576, 14);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 5:
                px0 px0Var5 = (px0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue5 & 1, z2)) {
                    q60.b(yh2.O(xq2Var5, R.string.cancel), false, this.B, xq2Var5, 0, 2);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            default:
                px0 px0Var6 = (px0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var6 = (xq2) px0Var6;
                if (xq2Var6.S(intValue6 & 1, z2)) {
                    ej2.b(this.B, null, false, mb3.g, xq2Var6, 24576, 14);
                } else {
                    xq2Var6.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ j10(on2 on2Var, int i, byte b) {
        this.A = i;
        this.B = on2Var;
    }
}
