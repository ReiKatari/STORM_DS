package defpackage;

import com.google.android.material.internal.CheckableImageButton;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h81  reason: default package */
/* loaded from: classes.dex */
public final class h81 extends o42 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h81(n42 n42Var, int i) {
        super(n42Var);
        this.e = i;
    }

    @Override // defpackage.o42
    public void q() {
        switch (this.e) {
            case 0:
                n42 n42Var = this.b;
                n42Var.n0 = null;
                CheckableImageButton checkableImageButton = n42Var.f0;
                checkableImageButton.setOnLongClickListener(null);
                kj2.Y(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
