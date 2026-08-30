package xh;

import android.content.SharedPreferences;
import androidx.lifecycle.s0;
import cd.q;
import cd.q1;
import cd.y0;
import java.util.UUID;
import kf.b1;
import kf.d2;
import mh.m;
import ve.f;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: e  reason: collision with root package name */
    public final cf.d f14628e;

    /* renamed from: f  reason: collision with root package name */
    public final q1 f14629f;

    /* renamed from: g  reason: collision with root package name */
    public final y0 f14630g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b1 b1Var, cf.d dVar) {
        super(b1Var);
        UUID uuid;
        b1Var.getClass();
        dVar.getClass();
        this.f14628e = dVar;
        String string = ((d2) dVar).f8181b.getString("input_layout_id", null);
        q1 c4 = q.c(new vh.b((string == null || (uuid = UUID.fromString(string)) == null) ? f.f13797h : uuid, vh.a.INITIAL_SELECTION));
        this.f14629f = c4;
        this.f14630g = new y0(c4);
        x.v(s0.h(this), null, null, new m(b1Var, this, null, 17), 3);
    }

    @Override // xh.b
    public final void e() {
        UUID uuid = f.f13797h;
        h(f.f13797h, vh.a.SELECTED_BY_FALLBACK);
    }

    @Override // xh.b
    public final y0 f() {
        return this.f14630g;
    }

    @Override // xh.b
    public final void g(UUID uuid) {
        if (uuid != null) {
            h(uuid, vh.a.SELECTED_BY_USER);
        }
    }

    public final void h(UUID uuid, vh.a aVar) {
        d2 d2Var = (d2) this.f14628e;
        d2Var.getClass();
        uuid.getClass();
        SharedPreferences.Editor edit = d2Var.f8181b.edit();
        edit.putString("input_layout_id", uuid.toString());
        edit.apply();
        vh.b bVar = new vh.b(uuid, aVar);
        q1 q1Var = this.f14629f;
        q1Var.getClass();
        q1Var.k(null, bVar);
    }
}
