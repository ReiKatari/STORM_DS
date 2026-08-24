package defpackage;

import androidx.fragment.app.o;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pk2  reason: default package */
/* loaded from: classes.dex */
public final class pk2 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ o B;

    public /* synthetic */ pk2(o oVar, int i) {
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
