package defpackage;

import java.util.concurrent.FutureTask;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uw4  reason: default package */
/* loaded from: classes.dex */
public final class uw4 extends FutureTask implements Comparable {
    public final v40 A;

    public uw4(v40 v40Var) {
        super(v40Var, null);
        this.A = v40Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int ordinal;
        int ordinal2;
        v40 v40Var = this.A;
        rw4 rw4Var = v40Var.n0;
        v40 v40Var2 = ((uw4) obj).A;
        rw4 rw4Var2 = v40Var2.n0;
        if (rw4Var == rw4Var2) {
            ordinal = v40Var.A;
            ordinal2 = v40Var2.A;
        } else {
            ordinal = rw4Var2.ordinal();
            ordinal2 = rw4Var.ordinal();
        }
        return ordinal - ordinal2;
    }
}
