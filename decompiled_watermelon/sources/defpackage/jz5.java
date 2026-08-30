package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jz5  reason: default package */
/* loaded from: classes.dex */
public final class jz5 {
    public final ez5 a;
    public final k14 b;

    public jz5(iz5 iz5Var, y23 y23Var) {
        this.a = iz5Var.d;
        List j = iz5.j(4, iz5Var);
        this.b = new k14(j.size());
        int size = j.size();
        for (int i = 0; i < size; i++) {
            iz5 iz5Var2 = (iz5) j.get(i);
            if (y23Var.a(iz5Var2.f)) {
                this.b.a(iz5Var2.f);
            }
        }
    }
}
