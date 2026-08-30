package xf;

import android.content.Context;
import be.c;
import java.util.Locale;
import kf.d1;
import vc.h;
import yb.j;
import zb.v;
import zd.d;
import zd.e;
import zd.f;
import zd.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14600a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14601b;

    public a(Context context, c cVar, d1 d1Var) {
        this.f14600a = context;
        e eVar = new e(context, cVar);
        this.f14601b = v.F(new j("nds", eVar), new j("dsi", eVar), new j("ids", eVar), new j("zip", new d(context, cVar, d1Var)), new j("7z", new g(context, cVar, d1Var)));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map, java.lang.Object] */
    public final f a(k6.a aVar) {
        int l02;
        String f8 = aVar.f();
        if (f8 == null || (l02 = h.l0('.', 0, 6, f8)) < 0) {
            return null;
        }
        String lowerCase = f8.substring(l02 + 1).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return (f) this.f14601b.get(lowerCase);
    }
}
