package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uu4  reason: default package */
/* loaded from: classes.dex */
public final class uu4 implements bj5 {
    public final Set A;
    public final ua4 B = new ua4(new br2[16]);

    public uu4(Set set) {
        this.A = set;
    }

    @Override // defpackage.bj5
    public final void c() {
        ua4 ua4Var = this.B;
        Object[] objArr = ua4Var.A;
        int i = ua4Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            bj5 bj5Var = ((br2) objArr[i2]).a;
            this.A.remove(bj5Var);
            bj5Var.c();
        }
    }

    @Override // defpackage.bj5
    public final void a() {
    }

    @Override // defpackage.bj5
    public final void b() {
    }
}
