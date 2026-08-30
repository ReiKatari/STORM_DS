package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sg3  reason: default package */
/* loaded from: classes.dex */
public final class sg3 extends s00 {
    public final ee6 e;
    public final q45 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg3(k43 k43Var, pt5 pt5Var) {
        super(k43Var);
        UUID uuid;
        k43Var.getClass();
        pt5Var.getClass();
        String str = (String) pt5Var.a("selected_layout_id");
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        ee6 a = fe6.a(new oy5(uuid, ny5.INITIAL_SELECTION));
        this.e = a;
        this.f = new q45(a);
        tq5.w(ua7.a(this), null, null, new ba1(k43Var, this, null, 21), 3);
    }

    @Override // defpackage.s00
    public final void e() {
        oy5 oy5Var = new oy5(null, ny5.SELECTED_BY_FALLBACK);
        ee6 ee6Var = this.e;
        ee6Var.getClass();
        ee6Var.l(null, oy5Var);
    }

    @Override // defpackage.s00
    public final q45 f() {
        return this.f;
    }

    @Override // defpackage.s00
    public final void g(UUID uuid) {
        oy5 oy5Var = new oy5(uuid, ny5.SELECTED_BY_USER);
        ee6 ee6Var = this.e;
        ee6Var.getClass();
        ee6Var.l(null, oy5Var);
    }
}
