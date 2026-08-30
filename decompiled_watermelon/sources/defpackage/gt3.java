package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gt3  reason: default package */
/* loaded from: classes.dex */
public final class gt3 extends c9 {
    public final d9 a;

    public gt3(d9 d9Var) {
        this.a = d9Var;
    }

    @Override // defpackage.c9
    public final void a(Object obj) {
        h9 h9Var = this.a.a;
        if (h9Var != null) {
            h9Var.a(obj);
        } else {
            i.n("Launcher has not been initialized");
        }
    }
}
