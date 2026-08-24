package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xy6  reason: default package */
/* loaded from: classes.dex */
public final class xy6 implements qb6, qp1 {
    public final qb6 a;

    public xy6(qb6 qb6Var) {
        this.a = qb6Var;
    }

    @Override // defpackage.qp1
    public final qb6 a(int i) {
        if (i >= 50) {
            return cu1.a;
        }
        return new jt6(this.a, i, 50);
    }

    @Override // defpackage.qb6
    public final Iterator iterator() {
        return new op1(this);
    }

    @Override // defpackage.qp1
    public final qb6 take() {
        return this;
    }
}
