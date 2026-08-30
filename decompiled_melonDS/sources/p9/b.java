package p9;

import a0.j;
import android.graphics.drawable.Drawable;
import c9.l;
import m9.k;
import m9.o;
import m9.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final l f11518a;

    /* renamed from: b  reason: collision with root package name */
    public final k f11519b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11520c;

    public b(l lVar, k kVar, int i2) {
        this.f11518a = lVar;
        this.f11519b = kVar;
        this.f11520c = i2;
        if (i2 > 0) {
            return;
        }
        j.h("durationMillis must be > 0.");
        throw null;
    }

    @Override // p9.f
    public final void a() {
        boolean z10;
        this.f11518a.getClass();
        k kVar = this.f11519b;
        Drawable a10 = kVar.a();
        n9.f fVar = kVar.b().f9425x;
        boolean z11 = kVar instanceof q;
        if (z11 && ((q) kVar).f9449g) {
            z10 = false;
        } else {
            z10 = true;
        }
        new f9.a(a10, fVar, this.f11520c, z10);
        if (z11 || (kVar instanceof m9.e)) {
            return;
        }
        o.o();
    }
}
