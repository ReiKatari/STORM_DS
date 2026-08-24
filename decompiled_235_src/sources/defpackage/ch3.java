package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ch3  reason: default package */
/* loaded from: classes.dex */
public final class ch3 extends z64 implements bh3 {
    public qn2 k0;
    public qn2 l0;

    @Override // defpackage.bh3
    public final boolean B(KeyEvent keyEvent) {
        qn2 qn2Var = this.k0;
        if (qn2Var != null) {
            return ((Boolean) qn2Var.g(new wg3(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.bh3
    public final boolean k(KeyEvent keyEvent) {
        qn2 qn2Var = this.l0;
        if (qn2Var != null) {
            return ((Boolean) qn2Var.g(new wg3(keyEvent))).booleanValue();
        }
        return false;
    }
}
