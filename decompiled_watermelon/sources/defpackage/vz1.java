package defpackage;

import android.text.Editable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vz1  reason: default package */
/* loaded from: classes.dex */
public final class vz1 extends ns6 {
    public final /* synthetic */ yz1 A;

    public vz1(yz1 yz1Var) {
        this.A = yz1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.A.b().a();
    }

    @Override // defpackage.ns6, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A.b().b();
    }
}
