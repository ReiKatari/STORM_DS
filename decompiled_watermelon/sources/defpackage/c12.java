package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c12  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c12 implements ki2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ c12(int i, String str, d12 d12Var) {
        this.B = i;
        this.L = str;
        this.R = d12Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        Object obj = this.R;
        int i2 = this.B;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                String str = (String) obj2;
                d12 d12Var = (d12) obj;
                h06[] h06VarArr = new h06[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    h06VarArr[i3] = oo2.u(str + '.' + d12Var.e[i3], kh6.k, new h06[0]);
                }
                return h06VarArr;
            default:
                pt2 pt2Var = (pt2) obj2;
                l12 l12Var = (l12) obj;
                try {
                    l12Var.getClass();
                    pt2Var.r0.C(i2, l12Var);
                } catch (IOException e) {
                    l12 l12Var2 = l12.PROTOCOL_ERROR;
                    pt2Var.d(l12Var2, l12Var2, e);
                }
                return o27.a;
        }
    }

    public /* synthetic */ c12(pt2 pt2Var, int i, l12 l12Var) {
        this.L = pt2Var;
        this.B = i;
        this.R = l12Var;
    }
}
