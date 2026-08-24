package defpackage;

import android.content.Context;
import android.view.View;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs1  reason: default package */
/* loaded from: classes.dex */
public final class hs1 extends ak3 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public hs1(nj3 nj3Var) {
        nj3Var.getClass();
        this.b = nj3Var;
    }

    @Override // defpackage.ak3
    public final View a(Context context) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                View a = ((ak3) obj).a(context);
                a.setBackground(context.getDrawable(R.drawable.background_uiview_selector));
                return a;
            default:
                return new w64(context, (nj3) obj);
        }
    }

    @Override // defpackage.ak3
    public final float b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ak3) obj).b();
            default:
                int i2 = hi6.a[((nj3) obj).ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        return 1.0f;
                    }
                    return 1.25f;
                }
                return 1.8f;
        }
    }

    public hs1(ak3 ak3Var) {
        this.b = ak3Var;
    }
}
