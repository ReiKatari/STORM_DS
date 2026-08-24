package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rn0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rn0 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ xn0 B;
    public final /* synthetic */ on2 L;
    public final /* synthetic */ on2 R;

    public /* synthetic */ rn0(xn0 xn0Var, on2 on2Var, on2 on2Var2, int i) {
        this.A = i;
        this.B = xn0Var;
        this.L = on2Var;
        this.R = on2Var2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        on2 on2Var = this.R;
        on2 on2Var2 = this.L;
        xn0 xn0Var = this.B;
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
                    lc2 lc2Var = dj6.c;
                    long j = ((ut0) xq2Var.j(vt0.a)).j();
                    WeakHashMap weakHashMap = dv7.w;
                    v56.b(th7.d(xq2Var).l, lc2Var, null, n16.I(790802855, new rn0(xn0Var, on2Var2, on2Var, 1), xq2Var), null, null, null, 0, false, null, RecyclerView.B1, 0L, 0L, 0L, j, 0L, n16.I(-913206642, new on0(xn0Var, on2Var, 1), xq2Var), xq2Var, 3120, 100663296, 196596);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z)) {
                    long j2 = ((ut0) xq2Var2.j(vt0.a)).j();
                    WeakHashMap weakHashMap2 = dv7.w;
                    gq.b(n16.I(-2035792789, new nn0(xn0Var, 1), xq2Var2), new qu3(th7.d(xq2Var2).l, 15 | 16), null, n16.I(585222318, new j10(on2Var2, 2, (byte) 0), xq2Var2), n16.I(1389562135, new h5(2, on2Var), xq2Var2), j2, 0L, RecyclerView.B1, xq2Var2, 12610566, 68);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
