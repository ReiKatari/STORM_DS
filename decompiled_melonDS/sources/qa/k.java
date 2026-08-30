package qa;

import android.text.Editable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends ha.h {
    public final /* synthetic */ m A;

    public k(m mVar) {
        this.A = mVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.A.b().a();
    }

    @Override // ha.h, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i10, int i11) {
        this.A.b().b();
    }
}
