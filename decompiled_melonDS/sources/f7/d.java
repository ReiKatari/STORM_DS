package f7;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public d0.d f4931a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4932b;

    /* renamed from: c  reason: collision with root package name */
    public b9.e f4933c;

    public abstract void a();

    public abstract void b();

    public abstract void c(b bVar);

    public abstract void d(b bVar);

    public final void e() {
        b9.e eVar = this.f4933c;
        if (eVar != null && ((LinkedHashSet) eVar.R).remove(this)) {
            g gVar = (g) eVar.L;
            gVar.getClass();
            if (equals(gVar.f4943f)) {
                if (gVar.f4944g == -1) {
                    a();
                }
                gVar.f4943f = null;
                gVar.f4944g = 0;
                gVar.f4945h = null;
            }
            gVar.f4941d.remove(this);
            gVar.f4942e.remove(this);
            this.f4933c = null;
            gVar.b();
        }
    }

    public final void f(boolean z10) {
        g gVar;
        if (this.f4932b != z10) {
            this.f4932b = z10;
            b9.e eVar = this.f4933c;
            if (eVar != null && (gVar = (g) eVar.L) != null) {
                gVar.b();
            }
        }
    }
}
