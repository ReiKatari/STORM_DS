package y2;

import android.os.Bundle;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import java.util.Map;
import kf.s0;
import p1.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements f, q7.f {
    public final /* synthetic */ g A;
    public z B;
    public q7.e L;

    public i(g gVar) {
        Bundle bundle;
        this.A = gVar;
        Object d4 = gVar.d("androidx.savedstate.SavedStateRegistry");
        if (d4 instanceof Bundle) {
            bundle = (Bundle) d4;
        } else {
            bundle = null;
        }
        if (bundle != null && this.L == null) {
            q7.e eVar = new q7.e(new s7.a(this, new s0(7, this)));
            this.L = eVar;
            eVar.b(bundle);
        }
        gVar.f("androidx.savedstate.SavedStateRegistry", new s0(23, this));
    }

    @Override // y2.f
    public final boolean b(Object obj) {
        return this.A.b(obj);
    }

    @Override // y2.f
    public final Map c() {
        return this.A.c();
    }

    @Override // y2.f
    public final Object d(String str) {
        return this.A.d(str);
    }

    @Override // y2.f
    public final c1 f(String str, mc.a aVar) {
        return this.A.f(str, aVar);
    }

    @Override // androidx.lifecycle.x
    public final r getLifecycle() {
        z zVar = this.B;
        if (zVar == null) {
            z zVar2 = new z(this, false);
            this.B = zVar2;
            return zVar2;
        }
        return zVar;
    }

    @Override // q7.f
    public final q7.d getSavedStateRegistry() {
        q7.e eVar = this.L;
        if (eVar == null) {
            q7.e eVar2 = new q7.e(new s7.a(this, new s0(7, this)));
            this.L = eVar2;
            eVar2.b(null);
            eVar = eVar2;
        }
        return eVar.f12313b;
    }
}
