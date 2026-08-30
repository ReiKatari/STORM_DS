package defpackage;

import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kh1  reason: default package */
/* loaded from: classes.dex */
public final class kh1 extends s0 {
    public final Iterator L;
    public final mi2 R;
    public final HashSet X;

    public kh1(Iterator it, mi2 mi2Var) {
        it.getClass();
        this.L = it;
        this.R = mi2Var;
        this.X = new HashSet();
    }

    @Override // defpackage.s0
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
        } while (!this.X.add(this.R.n(next)));
        this.B = next;
        this.A = 1;
    }
}
