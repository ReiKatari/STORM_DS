package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mj2  reason: default package */
/* loaded from: classes.dex */
public final class mj2 {
    public final List a;

    public mj2(lj2... lj2VarArr) {
        for (lj2 lj2Var : lj2VarArr) {
            String a = lj2Var.a();
            int i = 0;
            for (lj2 lj2Var2 : lj2VarArr) {
                if (nb3.k(lj2Var2.a(), a)) {
                    i++;
                }
            }
            if (i != 1) {
                StringBuilder t = i61.t("'", a, "' must be unique. Actual [");
                ArrayList arrayList = new ArrayList();
                for (lj2 lj2Var3 : lj2VarArr) {
                    if (nb3.k(lj2Var3.a(), a)) {
                        arrayList.add(lj2Var3);
                    }
                }
                t.append(arrayList);
                t.append(']');
                q53.a(t.toString());
            }
        }
        this.a = fv.T0(lj2VarArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj2)) {
            return false;
        }
        if (nb3.k(this.a, ((mj2) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
