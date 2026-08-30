package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: an4  reason: default package */
/* loaded from: classes.dex */
public final class an4 extends r1 implements ox2 {
    public final /* synthetic */ int A;
    public final tm4 B;

    public /* synthetic */ an4(tm4 tm4Var, int i) {
        this.A = i;
        this.B = tm4Var;
    }

    @Override // defpackage.k0
    public final int b() {
        int i = this.A;
        tm4 tm4Var = this.B;
        switch (i) {
            case 0:
                tm4Var.getClass();
                return tm4Var.B;
            default:
                tm4Var.getClass();
                return tm4Var.B;
        }
    }

    @Override // defpackage.k0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.A;
        tm4 tm4Var = this.B;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = tm4Var.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !tm4Var.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return tm4Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                fy6 fy6Var = this.B.A;
                gy6[] gy6VarArr = new gy6[8];
                for (int i = 0; i < 8; i++) {
                    gy6VarArr[i] = new hy6(0);
                }
                return new um4(fy6Var, gy6VarArr);
            default:
                fy6 fy6Var2 = this.B.A;
                gy6[] gy6VarArr2 = new gy6[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    gy6VarArr2[i2] = new hy6(1);
                }
                return new um4(fy6Var2, gy6VarArr2);
        }
    }
}
