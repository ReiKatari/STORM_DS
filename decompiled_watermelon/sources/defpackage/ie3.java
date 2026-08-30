package defpackage;

import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ie3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ie3 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ b B;

    public /* synthetic */ ie3(b bVar, int i) {
        this.A = i;
        this.B = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        b bVar = this.B;
        switch (i) {
            case 0:
                qa7 qa7Var = bVar.L;
                qa7Var.k.animate().y(qa7Var.a.getBottom()).setDuration(100L).withEndAction(new ie3(bVar, 3)).start();
                return;
            case 1:
                bVar.L.i.setVisibility(0);
                return;
            case 2:
                bVar.L.i.setVisibility(8);
                return;
            case 3:
                bVar.L.k.setVisibility(4);
                return;
            case 4:
                qa7 qa7Var2 = bVar.L;
                qa7Var2.k.animate().y(qa7Var2.a.getBottom() - qa7Var2.k.getHeight()).setDuration(100L).withEndAction(null).start();
                return;
            default:
                if (!bVar.w()) {
                    bVar.u0 = null;
                    return;
                }
                return;
        }
    }
}
