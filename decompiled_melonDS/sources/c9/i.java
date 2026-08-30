package c9;

import ah.l0;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements o9.a, n9.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f2732a;

    public /* synthetic */ i(k kVar) {
        this.f2732a = kVar;
    }

    @Override // o9.a
    public void a(Drawable drawable) {
        n3.b bVar;
        k kVar = this.f2732a;
        if (drawable != null) {
            bVar = kVar.j(drawable);
        } else {
            bVar = null;
        }
        kVar.k(new e(bVar));
    }

    @Override // n9.h
    public Object e(b9.f fVar) {
        return cd.q.q(new l0(this.f2732a.Y, 3), fVar);
    }
}
