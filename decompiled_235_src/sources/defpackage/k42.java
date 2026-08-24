package defpackage;

import android.text.Editable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k42  reason: default package */
/* loaded from: classes.dex */
public final class k42 extends c57 {
    public final /* synthetic */ n42 A;

    public k42(n42 n42Var) {
        this.A = n42Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.A.b().a();
    }

    @Override // defpackage.c57, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A.b().b();
    }
}
