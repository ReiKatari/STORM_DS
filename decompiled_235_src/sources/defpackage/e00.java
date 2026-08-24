package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e00  reason: default package */
/* loaded from: classes.dex */
public final class e00 {
    public final eb a;
    public final il4 b;

    /* JADX WARN: Multi-variable type inference failed */
    public e00(eb ebVar, il4 il4Var) {
        this.a = ebVar;
        this.b = il4Var;
        if ((ebVar == null ? il4Var : ebVar) != null) {
            return;
        }
        i.h("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(d2 d2Var) {
        eb ebVar = this.a;
        if (ebVar != null) {
            eb.e(ebVar, (c00) d2Var.b);
            return;
        }
        il4 il4Var = this.b;
        if (il4Var != null) {
            il4Var.b((d00) d2Var.a);
        } else {
            i.m("Unreachable");
        }
    }

    public final void b(d2 d2Var) {
        if (this.a != null) {
            ((c00) d2Var.b).e();
        } else if (this.b != null) {
            ((d00) d2Var.a).e();
        } else {
            i.m("Unreachable");
        }
    }
}
