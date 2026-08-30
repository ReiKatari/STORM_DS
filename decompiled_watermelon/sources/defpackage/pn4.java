package defpackage;

import java.util.concurrent.FutureTask;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pn4  reason: default package */
/* loaded from: classes.dex */
public final class pn4 extends FutureTask implements Comparable {
    public final x20 A;

    public pn4(x20 x20Var) {
        super(x20Var, null);
        this.A = x20Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int ordinal;
        int ordinal2;
        x20 x20Var = this.A;
        mn4 mn4Var = x20Var.m0;
        x20 x20Var2 = ((pn4) obj).A;
        mn4 mn4Var2 = x20Var2.m0;
        if (mn4Var == mn4Var2) {
            ordinal = x20Var.A;
            ordinal2 = x20Var2.A;
        } else {
            ordinal = mn4Var2.ordinal();
            ordinal2 = mn4Var.ordinal();
        }
        return ordinal - ordinal2;
    }
}
