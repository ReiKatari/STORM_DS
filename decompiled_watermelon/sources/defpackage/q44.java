package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q44  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class q44 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ae6 B;

    public /* synthetic */ q44(ae6 ae6Var, int i) {
        this.A = i;
        this.B = ae6Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        ae6 ae6Var = this.B;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) ae6Var.getValue()) {
                    if (b53.x(((l34) obj).B.A, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                return new mb4(((mb4) ae6Var.getValue()).a);
            default:
                lo loVar = bz5.a;
                return new mb4(((mb4) ae6Var.getValue()).a);
        }
    }
}
