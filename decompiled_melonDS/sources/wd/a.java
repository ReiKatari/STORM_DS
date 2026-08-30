package wd;

import a7.v;
import android.content.Context;
import j0.o1;
import kf.s0;
import pi.d0;
import pi.s;
import ui.g;
import w.x0;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14210a;

    /* renamed from: b  reason: collision with root package name */
    public final n f14211b = new n(new s0(19, this));

    public a(Context context) {
        this.f14210a = context;
    }

    @Override // pi.s
    public final d0 a(g gVar) {
        v m = gVar.f13560e.m();
        String str = (String) this.f14211b.getValue();
        str.getClass();
        ((o1) m.L).b("User-Agent", str);
        return gVar.b(new x0(m));
    }
}
