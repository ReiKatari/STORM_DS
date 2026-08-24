package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pp1  reason: default package */
/* loaded from: classes.dex */
public final class pp1 implements qb6, qp1 {
    public final qb6 a;
    public final int b;

    public pp1(qb6 qb6Var, int i) {
        qb6Var.getClass();
        this.a = qb6Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        i.f(xg6.o("count must be non-negative, but was ", i, '.'));
        throw null;
    }

    @Override // defpackage.qp1
    public final qb6 a(int i) {
        int i2 = this.b + i;
        if (i2 < 0) {
            return new pp1(this, i);
        }
        return new pp1(this.a, i2);
    }

    @Override // defpackage.qb6
    public final Iterator iterator() {
        return new op1(this);
    }

    @Override // defpackage.qp1
    public final qb6 take() {
        int i = this.b;
        int i2 = i + 50;
        if (i2 < 0) {
            return new xy6(this);
        }
        return new jt6(this.a, i, i2);
    }
}
