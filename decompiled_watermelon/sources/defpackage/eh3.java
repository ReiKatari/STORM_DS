package defpackage;

import android.content.SharedPreferences;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eh3  reason: default package */
/* loaded from: classes.dex */
public final class eh3 extends s00 {
    public final w16 e;
    public final ee6 f;
    public final q45 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh3(k43 k43Var, w16 w16Var) {
        super(k43Var);
        k43Var.getClass();
        w16Var.getClass();
        this.e = w16Var;
        ee6 a = fe6.a(new oy5(((b56) w16Var).v(), ny5.INITIAL_SELECTION));
        this.f = a;
        this.g = new q45(a);
        tq5.w(ua7.a(this), null, null, new ba1(k43Var, this, null, 22), 3);
    }

    @Override // defpackage.s00
    public final void e() {
        UUID uuid = nd3.h;
        h(nd3.h, ny5.SELECTED_BY_FALLBACK);
    }

    @Override // defpackage.s00
    public final q45 f() {
        return this.g;
    }

    @Override // defpackage.s00
    public final void g(UUID uuid) {
        if (uuid != null) {
            h(uuid, ny5.SELECTED_BY_USER);
        }
    }

    public final void h(UUID uuid, ny5 ny5Var) {
        b56 b56Var = (b56) this.e;
        b56Var.getClass();
        uuid.getClass();
        SharedPreferences.Editor edit = b56Var.b.edit();
        edit.putString("input_layout_id", uuid.toString());
        edit.apply();
        oy5 oy5Var = new oy5(uuid, ny5Var);
        ee6 ee6Var = this.f;
        ee6Var.getClass();
        ee6Var.l(null, oy5Var);
    }
}
