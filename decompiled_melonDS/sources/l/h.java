package l;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements q7.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8420a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8421b;

    public h(q7.d dVar) {
        this.f8420a = 1;
        this.f8421b = new LinkedHashSet();
        dVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // q7.c
    public final Bundle a() {
        switch (this.f8420a) {
            case 0:
                Bundle bundle = new Bundle();
                ((i) this.f8421b).v().getClass();
                return bundle;
            default:
                Bundle b10 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                p7.n.q(b10, "classes_to_restore", zb.l.p0((LinkedHashSet) this.f8421b));
                return b10;
        }
    }

    public h(i iVar) {
        this.f8420a = 0;
        this.f8421b = iVar;
    }
}
