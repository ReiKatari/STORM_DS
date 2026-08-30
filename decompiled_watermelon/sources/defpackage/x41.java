package defpackage;

import com.google.android.material.internal.CheckableImageButton;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x41  reason: default package */
/* loaded from: classes.dex */
public final class x41 extends zz1 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x41(yz1 yz1Var, int i) {
        super(yz1Var);
        this.e = i;
    }

    @Override // defpackage.zz1
    public void q() {
        switch (this.e) {
            case 0:
                yz1 yz1Var = this.b;
                yz1Var.m0 = null;
                CheckableImageButton checkableImageButton = yz1Var.e0;
                checkableImageButton.setOnLongClickListener(null);
                ep2.G(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
