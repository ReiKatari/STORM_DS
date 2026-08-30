package defpackage;

import androidx.fragment.app.o;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qf2  reason: default package */
/* loaded from: classes.dex */
public final class qf2 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ o B;

    public /* synthetic */ qf2(o oVar, int i) {
        this.A = i;
        this.B = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        o oVar = this.B;
        switch (i) {
            case 0:
                oVar.startPostponedEnterTransition();
                return;
            default:
                oVar.callStartTransitionListener(false);
                return;
        }
    }
}
