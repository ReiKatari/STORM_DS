package defpackage;

import android.view.View;
import android.widget.Magnifier;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rx4  reason: default package */
/* loaded from: classes.dex */
public final class rx4 implements px4 {
    public static final rx4 b = new rx4(0);
    public static final rx4 c = new rx4(1);
    public final /* synthetic */ int a;

    public /* synthetic */ rx4(int i) {
        this.a = i;
    }

    @Override // defpackage.px4
    public final boolean a() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.px4
    public final ox4 b(View view, qh1 qh1Var) {
        switch (this.a) {
            case 0:
                return new qx4(new Magnifier(view));
            default:
                return new qx4(new Magnifier(view));
        }
    }
}
