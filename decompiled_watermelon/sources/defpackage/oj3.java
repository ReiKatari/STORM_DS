package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oj3  reason: default package */
/* loaded from: classes.dex */
public final class oj3 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ qj3 c;

    public oj3(qj3 qj3Var, int i) {
        this.c = qj3Var;
        this.a = i;
    }

    public final void a(int i) {
        qj3 qj3Var = this.c;
        xf1 xf1Var = qj3Var.c;
        if (xf1Var == null) {
            return;
        }
        this.b.add(new ys4(xf1Var, i, qj3Var.b, null));
    }
}
