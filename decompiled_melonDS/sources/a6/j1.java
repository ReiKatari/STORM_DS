package a6;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j1 implements Runnable {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public j1(l.i0 i0Var, p.e eVar, p.n nVar, p.l lVar) {
        this.X = i0Var;
        this.B = eVar;
        this.L = nVar;
        this.R = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                l1.i((View) this.B, (p1) this.L, (a0.g) this.R);
                ((ValueAnimator) this.X).start();
                return;
            default:
                p.f fVar = (p.f) ((l.i0) this.X).B;
                p.n nVar = (p.n) this.L;
                p.e eVar = (p.e) this.B;
                if (eVar != null) {
                    fVar.f11108t0 = true;
                    eVar.f11089b.c(false);
                    fVar.f11108t0 = false;
                }
                if (nVar.isEnabled() && nVar.hasSubMenu()) {
                    ((p.l) this.R).q(nVar, null, 4);
                    return;
                }
                return;
        }
    }

    public j1(View view, p1 p1Var, a0.g gVar, ValueAnimator valueAnimator) {
        this.B = view;
        this.L = p1Var;
        this.R = gVar;
        this.X = valueAnimator;
    }
}
