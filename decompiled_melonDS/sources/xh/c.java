package xh;

import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import cd.q;
import cd.q1;
import cd.y0;
import java.util.UUID;
import kf.b1;
import mh.m;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: e  reason: collision with root package name */
    public final q1 f14626e;

    /* renamed from: f  reason: collision with root package name */
    public final y0 f14627f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b1 b1Var, p0 p0Var) {
        super(b1Var);
        UUID uuid;
        b1Var.getClass();
        p0Var.getClass();
        String str = (String) p0Var.a("selected_layout_id");
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        q1 c4 = q.c(new vh.b(uuid, vh.a.INITIAL_SELECTION));
        this.f14626e = c4;
        this.f14627f = new y0(c4);
        x.v(s0.h(this), null, null, new m(b1Var, this, null, 16), 3);
    }

    @Override // xh.b
    public final void e() {
        vh.b bVar = new vh.b(null, vh.a.SELECTED_BY_FALLBACK);
        q1 q1Var = this.f14626e;
        q1Var.getClass();
        q1Var.k(null, bVar);
    }

    @Override // xh.b
    public final y0 f() {
        return this.f14627f;
    }

    @Override // xh.b
    public final void g(UUID uuid) {
        vh.b bVar = new vh.b(uuid, vh.a.SELECTED_BY_USER);
        q1 q1Var = this.f14626e;
        q1Var.getClass();
        q1Var.k(null, bVar);
    }
}
