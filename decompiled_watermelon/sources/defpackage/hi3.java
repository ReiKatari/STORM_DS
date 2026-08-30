package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hi3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hi3 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    public /* synthetic */ hi3(int i, Collection collection) {
        this.A = 3;
        this.B = i;
        this.L = collection;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        mi2 mi2Var;
        int i = this.A;
        int i2 = 2;
        o27 o27Var = o27.a;
        Object obj2 = this.L;
        int i3 = this.B;
        switch (i) {
            case 0:
                oj3 oj3Var = (oj3) obj;
                sa1 sa1Var = ((ki3) obj2).a;
                ga6 z = io2.z();
                if (z != null) {
                    mi2Var = z.e();
                } else {
                    mi2Var = null;
                }
                io2.l0(z, io2.Y(z), mi2Var);
                sa1Var.getClass();
                int i4 = oj3Var.a;
                if (i4 != -1) {
                    i2 = i4;
                }
                for (int i5 = 0; i5 < i2; i5++) {
                    oj3Var.a(i3 + i5);
                }
                return o27Var;
            case 1:
                xn4.k((xn4) obj, (yn4) obj2, 0, -i3);
                return o27Var;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                xn4 xn4Var = (xn4) obj;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    yn4 yn4Var = (yn4) arrayList.get(i6);
                    xn4.m(xn4Var, yn4Var, 0, (i3 - yn4Var.B) / 2);
                }
                return o27Var;
            default:
                return Boolean.valueOf(((List) obj).addAll(i3, (Collection) obj2));
        }
    }

    public /* synthetic */ hi3(int i, int i2, Object obj) {
        this.A = i2;
        this.L = obj;
        this.B = i;
    }
}
