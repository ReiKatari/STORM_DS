package f;

import a0.j;
import a7.n;
import b9.e;
import d.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final e f4512a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f4513b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(e eVar, a0 a0Var) {
        this.f4512a = eVar;
        this.f4513b = a0Var;
        if ((eVar == null ? a0Var : eVar) != null) {
            return;
        }
        j.h("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(b4.b bVar) {
        e eVar = this.f4512a;
        if (eVar != null) {
            e.b(eVar, (a) bVar.f1791b);
            return;
        }
        a0 a0Var = this.f4513b;
        if (a0Var != null) {
            a0Var.b((n) bVar.f1790a);
        } else {
            j.p("Unreachable");
        }
    }

    public final void b(b4.b bVar) {
        if (this.f4512a != null) {
            ((a) bVar.f1791b).e();
        } else if (this.f4513b != null) {
            ((n) bVar.f1790a).e();
        } else {
            j.p("Unreachable");
        }
    }
}
