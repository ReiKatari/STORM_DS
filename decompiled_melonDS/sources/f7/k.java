package f7;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import cd.q1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f4957a;

    public k(j jVar) {
        this.f4957a = jVar;
    }

    public final void onBackCancelled() {
        j jVar = this.f4957a;
        b9.e eVar = jVar.f4936a;
        if (eVar != null) {
            if (!jVar.f4937b) {
                eVar.p(jVar, null);
            }
            g gVar = (g) eVar.L;
            gVar.getClass();
            if (jVar.equals(gVar.f4945h) && -1 == gVar.f4944g) {
                d dVar = gVar.f4943f;
                if (dVar == null) {
                    dVar = gVar.c(-1);
                }
                gVar.f4943f = null;
                gVar.f4944g = 0;
                gVar.f4945h = null;
                if (dVar != null) {
                    dVar.a();
                }
                q1 q1Var = gVar.f4938a;
                q1Var.getClass();
                q1Var.k(null, h.f4951e);
            }
            jVar.f4937b = false;
            return;
        }
        a0.j.p("This input is not added to any dispatcher.");
    }

    public final void onBackInvoked() {
        this.f4957a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        b f8 = k0.d.f(backEvent);
        j jVar = this.f4957a;
        b9.e eVar = jVar.f4936a;
        if (eVar != null) {
            if (jVar.f4937b) {
                g gVar = (g) eVar.L;
                gVar.getClass();
                if (jVar.equals(gVar.f4945h) && -1 == gVar.f4944g) {
                    d dVar = gVar.f4943f;
                    if (dVar == null) {
                        dVar = gVar.c(-1);
                    }
                    if (dVar != null) {
                        dVar.c(f8);
                    }
                    q1 q1Var = gVar.f4938a;
                    i iVar = new i(f8);
                    q1Var.getClass();
                    q1Var.k(null, iVar);
                    return;
                }
                return;
            }
            return;
        }
        a0.j.p("This input is not added to any dispatcher.");
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        b f8 = k0.d.f(backEvent);
        j jVar = this.f4957a;
        b9.e eVar = jVar.f4936a;
        if (eVar != null) {
            if (!jVar.f4937b) {
                eVar.p(jVar, f8);
                jVar.f4937b = true;
                return;
            }
            return;
        }
        a0.j.p("This input is not added to any dispatcher.");
    }
}
