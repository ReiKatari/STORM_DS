package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pc2  reason: default package */
/* loaded from: classes.dex */
public final class pc2 implements qb6 {
    public final qb6 a;
    public final boolean b;
    public final qn2 c;

    public pc2(qb6 qb6Var, boolean z, qn2 qn2Var) {
        this.a = qb6Var;
        this.b = z;
        this.c = qn2Var;
    }

    @Override // defpackage.qb6
    public final Iterator iterator() {
        return new oc2(this);
    }
}
