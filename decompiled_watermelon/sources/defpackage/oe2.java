package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oe2  reason: default package */
/* loaded from: classes.dex */
public final class oe2 {
    public final List a;

    public oe2(ne2... ne2VarArr) {
        for (ne2 ne2Var : ne2VarArr) {
            String a = ne2Var.a();
            int i = 0;
            for (ne2 ne2Var2 : ne2VarArr) {
                if (b53.x(ne2Var2.a(), a)) {
                    i++;
                }
            }
            if (i != 1) {
                StringBuilder u = b31.u("'", a, "' must be unique. Actual [");
                ArrayList arrayList = new ArrayList();
                for (ne2 ne2Var3 : ne2VarArr) {
                    if (b53.x(ne2Var3.a(), a)) {
                        arrayList.add(ne2Var3);
                    }
                }
                u.append(arrayList);
                u.append(']');
                nz2.a(u.toString());
            }
        }
        this.a = nu.F0(ne2VarArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe2)) {
            return false;
        }
        if (b53.x(this.a, ((oe2) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
