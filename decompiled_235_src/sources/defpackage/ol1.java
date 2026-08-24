package defpackage;

import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ol1  reason: default package */
/* loaded from: classes.dex */
public final class ol1 extends t0 {
    public final Iterator L;
    public final qn2 R;
    public final HashSet X;

    public ol1(Iterator it, qn2 qn2Var) {
        it.getClass();
        this.L = it;
        this.R = qn2Var;
        this.X = new HashSet();
    }

    @Override // defpackage.t0
    public final void a() {
        Object next;
        do {
            Iterator it = this.L;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.A = 2;
                return;
            }
        } while (!this.X.add(this.R.g(next)));
        this.B = next;
        this.A = 1;
    }
}
