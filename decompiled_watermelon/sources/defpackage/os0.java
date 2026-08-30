package defpackage;

import androidx.fragment.app.p;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: os0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class os0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ p B;

    public /* synthetic */ os0(p pVar, int i) {
        this.A = i;
        this.B = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        p pVar = this.B;
        switch (i) {
            case 0:
                ys0.p(pVar);
                return;
            default:
                pVar.invalidateOptionsMenu();
                return;
        }
    }
}
