package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xh3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xh3 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ k24 B;
    public final /* synthetic */ ArrayList L;
    public final /* synthetic */ List R;

    public /* synthetic */ xh3(k24 k24Var, ArrayList arrayList, List list, boolean z, int i) {
        this.A = i;
        this.B = k24Var;
        this.L = arrayList;
        this.R = list;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        List list = this.R;
        ArrayList arrayList = this.L;
        k24 k24Var = this.B;
        o27 o27Var = o27.a;
        xn4 xn4Var = (xn4) obj;
        switch (i) {
            case 0:
                xn4Var.A = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((zh3) arrayList.get(i2)).j(xn4Var);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((zh3) list.get(i3)).j(xn4Var);
                }
                xn4Var.A = false;
                k24Var.getValue();
                return o27Var;
            default:
                xn4Var.A = true;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((kk3) arrayList.get(i4)).j(xn4Var);
                }
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((kk3) list.get(i5)).j(xn4Var);
                }
                xn4Var.A = false;
                k24Var.getValue();
                return o27Var;
        }
    }
}
