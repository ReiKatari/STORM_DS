package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rl4  reason: default package */
/* loaded from: classes.dex */
public final class rl4 implements l95 {
    public final Set A;
    public final o24 B = new o24(new wk2[16]);

    public rl4(Set set) {
        this.A = set;
    }

    @Override // defpackage.l95
    public final void a() {
        o24 o24Var = this.B;
        Object[] objArr = o24Var.A;
        int i = o24Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            l95 l95Var = ((wk2) objArr[i2]).a;
            this.A.remove(l95Var);
            l95Var.a();
        }
    }

    @Override // defpackage.l95
    public final void b() {
    }

    @Override // defpackage.l95
    public final void c() {
    }
}
