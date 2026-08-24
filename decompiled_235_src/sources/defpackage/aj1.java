package defpackage;

import android.view.View;
import androidx.fragment.app.i;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aj1  reason: default package */
/* loaded from: classes.dex */
public final class aj1 extends zk2 {
    public final /* synthetic */ zk2 A;
    public final /* synthetic */ i B;

    public aj1(i iVar, zk2 zk2Var) {
        this.B = iVar;
        this.A = zk2Var;
    }

    @Override // defpackage.zk2
    public final View c(int i) {
        zk2 zk2Var = this.A;
        if (zk2Var.j()) {
            return zk2Var.c(i);
        }
        return this.B.onFindViewById(i);
    }

    @Override // defpackage.zk2
    public final boolean j() {
        if (!this.A.j() && !this.B.onHasView()) {
            return false;
        }
        return true;
    }
}
