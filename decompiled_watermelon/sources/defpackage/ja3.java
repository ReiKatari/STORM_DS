package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ja3  reason: default package */
/* loaded from: classes.dex */
public final class ja3 extends yy3 implements ia3 {
    public mi2 j0;
    public mi2 k0;

    @Override // defpackage.ia3
    public final boolean c0(KeyEvent keyEvent) {
        mi2 mi2Var = this.j0;
        if (mi2Var != null) {
            return ((Boolean) mi2Var.n(new da3(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.ia3
    public final boolean n(KeyEvent keyEvent) {
        mi2 mi2Var = this.k0;
        if (mi2Var != null) {
            return ((Boolean) mi2Var.n(new da3(keyEvent))).booleanValue();
        }
        return false;
    }
}
