package defpackage;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.i;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: we1  reason: default package */
/* loaded from: classes.dex */
public final class we1 extends ag2 {
    public final /* synthetic */ ag2 A;
    public final /* synthetic */ i B;

    public we1(i iVar, ag2 ag2Var) {
        this.B = iVar;
        this.A = ag2Var;
    }

    @Override // defpackage.ag2
    public final View d(int i) {
        ag2 ag2Var = this.A;
        if (ag2Var.e()) {
            return ag2Var.d(i);
        }
        Dialog dialog = this.B.g0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.ag2
    public final boolean e() {
        if (!this.A.e() && !this.B.k0) {
            return false;
        }
        return true;
    }
}
