package defpackage;

import android.content.SharedPreferences;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eo3  reason: default package */
/* loaded from: classes.dex */
public final class eo3 extends m20 {
    public final kd6 e;
    public final tp6 f;
    public final de5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo3(wa3 wa3Var, kd6 kd6Var) {
        super(wa3Var);
        wa3Var.getClass();
        kd6Var.getClass();
        this.e = kd6Var;
        tp6 a = up6.a(new ba6(((ng6) kd6Var).v(), aa6.INITIAL_SELECTION));
        this.f = a;
        this.g = new de5(a);
        hv.L(to7.a(this), null, null, new xd1(wa3Var, this, null, 23), 3);
    }

    @Override // defpackage.m20
    public final void e() {
        UUID uuid = fk3.h;
        h(fk3.h, aa6.SELECTED_BY_FALLBACK);
    }

    @Override // defpackage.m20
    public final de5 f() {
        return this.g;
    }

    @Override // defpackage.m20
    public final void g(UUID uuid) {
        if (uuid != null) {
            h(uuid, aa6.SELECTED_BY_USER);
        }
    }

    public final void h(UUID uuid, aa6 aa6Var) {
        ng6 ng6Var = (ng6) this.e;
        ng6Var.getClass();
        uuid.getClass();
        SharedPreferences.Editor edit = ng6Var.b.edit();
        edit.putString("input_layout_id", uuid.toString());
        edit.apply();
        ba6 ba6Var = new ba6(uuid, aa6Var);
        tp6 tp6Var = this.f;
        tp6Var.getClass();
        tp6Var.m(null, ba6Var);
    }
}
