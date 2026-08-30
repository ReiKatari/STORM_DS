package t3;

import android.view.KeyEvent;
import b3.o;
import mc.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends o implements e {

    /* renamed from: i0  reason: collision with root package name */
    public l f13110i0;

    /* renamed from: j0  reason: collision with root package name */
    public l f13111j0;

    @Override // t3.e
    public final boolean Q(KeyEvent keyEvent) {
        l lVar = this.f13110i0;
        if (lVar != null) {
            return ((Boolean) lVar.k(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // t3.e
    public final boolean h(KeyEvent keyEvent) {
        l lVar = this.f13111j0;
        if (lVar != null) {
            return ((Boolean) lVar.k(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
