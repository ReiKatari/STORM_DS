package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qn3  reason: default package */
/* loaded from: classes.dex */
public final class qn3 extends m20 {
    public final tp6 e;
    public final de5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn3(wa3 wa3Var, v46 v46Var) {
        super(wa3Var);
        UUID uuid;
        wa3Var.getClass();
        v46Var.getClass();
        String str = (String) v46Var.a("selected_layout_id");
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        tp6 a = up6.a(new ba6(uuid, aa6.INITIAL_SELECTION));
        this.e = a;
        this.f = new de5(a);
        hv.L(to7.a(this), null, null, new xd1(wa3Var, this, null, 22), 3);
    }

    @Override // defpackage.m20
    public final void e() {
        ba6 ba6Var = new ba6(null, aa6.SELECTED_BY_FALLBACK);
        tp6 tp6Var = this.e;
        tp6Var.getClass();
        tp6Var.m(null, ba6Var);
    }

    @Override // defpackage.m20
    public final de5 f() {
        return this.f;
    }

    @Override // defpackage.m20
    public final void g(UUID uuid) {
        ba6 ba6Var = new ba6(uuid, aa6.SELECTED_BY_USER);
        tp6 tp6Var = this.e;
        tp6Var.getClass();
        tp6Var.m(null, ba6Var);
    }
}
