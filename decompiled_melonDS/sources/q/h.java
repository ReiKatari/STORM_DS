package q;

import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements Runnable {
    public final f A;
    public final /* synthetic */ j B;

    public h(j jVar, f fVar) {
        this.B = jVar;
        this.A = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.j jVar;
        j jVar2 = this.B;
        p.l lVar = jVar2.L;
        if (lVar != null && (jVar = lVar.f11114e) != null) {
            jVar.c(lVar);
        }
        View view = (View) jVar2.f11913b0;
        if (view != null && view.getWindowToken() != null) {
            f fVar = this.A;
            if (!fVar.b()) {
                if (fVar.f11168e != null) {
                    fVar.d(0, 0, false, false);
                }
            }
            jVar2.f11924m0 = fVar;
        }
        jVar2.f11926o0 = null;
    }
}
