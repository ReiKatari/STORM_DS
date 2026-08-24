package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jt6  reason: default package */
/* loaded from: classes.dex */
public final class jt6 implements qb6, qp1 {
    public final qb6 a;
    public final int b;
    public final int c;

    public jt6(qb6 qb6Var, int i, int i2) {
        qb6Var.getClass();
        this.a = qb6Var;
        this.b = i;
        this.c = i2;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i2 >= i) {
                    return;
                }
                i.f(lb1.j("endIndex should be not less than startIndex, but was ", i2, i, " < "));
                throw null;
            }
            i.f(lb1.g(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        i.f(lb1.g(i, "startIndex should be non-negative, but is "));
        throw null;
    }

    @Override // defpackage.qp1
    public final qb6 a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i >= i2 - i3) {
            return cu1.a;
        }
        return new jt6(this.a, i3 + i, i2);
    }

    @Override // defpackage.qb6
    public final Iterator iterator() {
        return new rr2(this);
    }

    @Override // defpackage.qp1
    public final qb6 take() {
        int i = this.c;
        int i2 = this.b;
        if (50 >= i - i2) {
            return this;
        }
        return new jt6(this.a, i2, i2 + 50);
    }
}
