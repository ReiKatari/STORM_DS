package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bp3  reason: default package */
/* loaded from: classes.dex */
public final class bp3 extends a1 {
    @Override // defpackage.a1
    public final void a(n85 n85Var) {
        a1 a1Var;
        a1 a1Var2;
        ArrayList arrayList = (ArrayList) n85Var.B;
        ArrayList arrayList2 = (ArrayList) n85Var.L;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            a1Var = null;
            if (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                a1Var2 = (a1) obj;
                if (e21.class.isAssignableFrom(a1Var2.getClass())) {
                    break;
                }
            } else {
                a1Var2 = null;
                break;
            }
        }
        if (a1Var2 == null) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i);
                i++;
                a1 a1Var3 = (a1) obj2;
                if (e21.class.isAssignableFrom(a1Var3.getClass())) {
                    a1Var = a1Var3;
                    break;
                }
            }
            if (a1Var != null) {
                n85Var.a(a1Var);
                a1Var2 = a1Var;
            } else {
                f81.r("Requested plugin is not added: ", e21.class.getName(), ", plugins: ", arrayList);
                return;
            }
        }
        ((e21) a1Var2).a.add(new Object());
    }
}
