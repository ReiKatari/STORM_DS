package defpackage;

import android.widget.RelativeLayout;
import android.widget.ScrollView;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cl3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cl3 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ b B;

    public /* synthetic */ cl3(b bVar, int i) {
        this.A = i;
        this.B = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        b bVar = this.B;
        switch (i) {
            case 0:
                nb1 nb1Var = bVar.L;
                ((ScrollView) nb1Var.k).animate().y(((RelativeLayout) nb1Var.a).getBottom()).setDuration(100L).withEndAction(new cl3(bVar, 1)).start();
                return;
            case 1:
                ((ScrollView) bVar.L.k).setVisibility(4);
                return;
            case 2:
                nb1 nb1Var2 = bVar.L;
                ((ScrollView) nb1Var2.k).animate().y(((RelativeLayout) nb1Var2.a).getBottom() - ((ScrollView) nb1Var2.k).getHeight()).setDuration(100L).withEndAction(null).start();
                return;
            default:
                if (!bVar.v()) {
                    bVar.v0 = null;
                    return;
                }
                return;
        }
    }
}
