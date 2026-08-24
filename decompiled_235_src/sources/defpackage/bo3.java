package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bo3  reason: default package */
/* loaded from: classes.dex */
public final class bo3 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ fk3 B;
    public final /* synthetic */ qn2 L;

    public bo3(fk3 fk3Var, qn2 qn2Var) {
        this.A = 1;
        this.B = fk3Var;
        this.L = qn2Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        fk3 fk3Var = this.B;
        qn2 qn2Var = this.L;
        switch (i) {
            case 0:
                qn2Var.g(fk3Var.a);
                return jg7Var;
            case 1:
                UUID uuid = fk3Var.a;
                if (uuid != null) {
                    qn2Var.g(uuid);
                }
                return jg7Var;
            default:
                qn2Var.g(fk3Var);
                return jg7Var;
        }
    }

    public /* synthetic */ bo3(qn2 qn2Var, fk3 fk3Var, int i) {
        this.A = i;
        this.L = qn2Var;
        this.B = fk3Var;
    }
}
