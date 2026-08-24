package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qd2  reason: default package */
/* loaded from: classes.dex */
public final class qd2 implements qb6 {
    public final /* synthetic */ int a;
    public final Object b;
    public final qn2 c;

    public qd2(qb6 qb6Var, qn2 qn2Var) {
        this.a = 0;
        tb6 tb6Var = tb6.d0;
        this.b = qb6Var;
        this.c = qn2Var;
    }

    @Override // defpackage.qb6
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new oc2(this);
            case 1:
                return new oc2(this, (byte) 0);
            case 2:
                return new r97(this);
            default:
                return new rr2(this);
        }
    }

    public /* synthetic */ qd2(Object obj, qn2 qn2Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = qn2Var;
    }
}
