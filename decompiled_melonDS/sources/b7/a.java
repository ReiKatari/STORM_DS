package b7;

import androidx.lifecycle.p0;
import androidx.lifecycle.y0;
import java.lang.ref.WeakReference;
import java.util.UUID;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends y0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f2081b;

    /* renamed from: c  reason: collision with root package name */
    public a0.b f2082c;

    public a(p0 p0Var) {
        String str = (String) p0Var.a("SaveableStateHolder_BackStackEntryKey");
        if (str == null) {
            str = UUID.randomUUID().toString();
            p0Var.c(str, "SaveableStateHolder_BackStackEntryKey");
        }
        this.f2081b = str;
    }

    @Override // androidx.lifecycle.y0
    public final void d() {
        a0.b bVar = this.f2082c;
        if (bVar != null) {
            y2.d dVar = (y2.d) ((WeakReference) bVar.B).get();
            if (dVar != null) {
                dVar.e(this.f2081b);
            }
            a0.b bVar2 = this.f2082c;
            if (bVar2 != null) {
                ((WeakReference) bVar2.B).clear();
                return;
            } else {
                nc.k.f("saveableStateHolderRef");
                throw null;
            }
        }
        nc.k.f("saveableStateHolderRef");
        throw null;
    }
}
