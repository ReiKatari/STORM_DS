package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dw3  reason: default package */
/* loaded from: classes.dex */
public final class dw3 extends b1 {
    @Override // defpackage.b1
    public final void a(m44 m44Var) {
        b1 b1Var;
        b1 b1Var2;
        ArrayList arrayList = (ArrayList) m44Var.B;
        ArrayList arrayList2 = (ArrayList) m44Var.L;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            b1Var = null;
            if (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                b1Var2 = (b1) obj;
                if (m51.class.isAssignableFrom(b1Var2.getClass())) {
                    break;
                }
            } else {
                b1Var2 = null;
                break;
            }
        }
        if (b1Var2 == null) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i);
                i++;
                b1 b1Var3 = (b1) obj2;
                if (m51.class.isAssignableFrom(b1Var3.getClass())) {
                    b1Var = b1Var3;
                    break;
                }
            }
            if (b1Var != null) {
                m44Var.c(b1Var);
                b1Var2 = b1Var;
            } else {
                e41.r("Requested plugin is not added: ", m51.class.getName(), ", plugins: ", arrayList);
                return;
            }
        }
        ((m51) b1Var2).a.add(new Object());
    }
}
