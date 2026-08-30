package hg;

import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.y0;
import cd.q;
import cd.q1;
import java.util.UUID;
import kf.r0;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends y0 {

    /* renamed from: b  reason: collision with root package name */
    public final r0 f6501b;

    /* renamed from: c  reason: collision with root package name */
    public final sd.i f6502c;

    /* renamed from: d  reason: collision with root package name */
    public final q1 f6503d;

    /* renamed from: e  reason: collision with root package name */
    public final cd.y0 f6504e;

    /* renamed from: f  reason: collision with root package name */
    public final q1 f6505f;

    /* renamed from: g  reason: collision with root package name */
    public final cd.y0 f6506g;

    public l(r0 r0Var, sd.i iVar, p0 p0Var) {
        UUID uuid;
        r0Var.getClass();
        iVar.getClass();
        p0Var.getClass();
        this.f6501b = r0Var;
        this.f6502c = iVar;
        q1 c4 = q.c(null);
        this.f6503d = c4;
        this.f6504e = new cd.y0(c4);
        q1 c10 = q.c(null);
        this.f6505f = c10;
        this.f6506g = new cd.y0(c10);
        String str = (String) p0Var.a("initial_background_id");
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        c10.j(uuid);
        x.v(s0.h(this), null, null, new a9.b(16, null, this), 3);
    }

    public final void e(oe.a aVar) {
        aVar.getClass();
        this.f6502c.a(aVar.f10907c, sd.f.READ);
        x.v(s0.h(this), null, null, new k(this, aVar, null, 0), 3);
    }
}
