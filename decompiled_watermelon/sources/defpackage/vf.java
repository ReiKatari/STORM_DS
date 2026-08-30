package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vf  reason: default package */
/* loaded from: classes.dex */
public final class vf extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ ArrayList L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vf(int i, ArrayList arrayList) {
        super(1);
        this.B = i;
        this.L = arrayList;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.B;
        o27 o27Var = o27.a;
        ArrayList arrayList = this.L;
        switch (i) {
            case 0:
                xn4 xn4Var = (xn4) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    xn4.m(xn4Var, (yn4) arrayList.get(i2), 0, 0);
                }
                return o27Var;
            case 1:
                xn4 xn4Var2 = (xn4) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        xn4.m(xn4Var2, (yn4) arrayList.get(i3), 0, 0);
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                return o27Var;
            case 2:
                xn4 xn4Var3 = (xn4) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    xn4.k(xn4Var3, (yn4) arrayList.get(i4), 0, 0);
                }
                return o27Var;
            default:
                xn4 xn4Var4 = (xn4) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    xn4.n(xn4Var4, (yn4) arrayList.get(i5), 0, 0);
                }
                return o27Var;
        }
    }
}
