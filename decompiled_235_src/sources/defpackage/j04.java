package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j04  reason: default package */
/* loaded from: classes.dex */
public final class j04 extends d9 {
    public final e9 a;

    public j04(e9 e9Var) {
        this.a = e9Var;
    }

    @Override // defpackage.d9
    public final void a(Object obj) {
        i9 i9Var = this.a.a;
        if (i9Var != null) {
            i9Var.a(obj);
        } else {
            i.m("Launcher has not been initialized");
        }
    }
}
