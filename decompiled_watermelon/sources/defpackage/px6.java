package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: px6  reason: default package */
/* loaded from: classes.dex */
public final class px6 extends ox6 {
    public final /* synthetic */ eu a;
    public final /* synthetic */ qx6 b;

    public px6(qx6 qx6Var, eu euVar) {
        this.b = qx6Var;
        this.a = euVar;
    }

    @Override // defpackage.ox6, defpackage.hx6
    public final void a(ix6 ix6Var) {
        ((ArrayList) this.a.get(this.b.B)).remove(ix6Var);
        ix6Var.D(this);
    }
}
