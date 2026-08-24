package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gr4  reason: default package */
/* loaded from: classes.dex */
public final class gr4 extends iv3 {
    public final /* synthetic */ hr4 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr4(hr4 hr4Var, Context context) {
        super(context);
        this.q = hr4Var;
    }

    @Override // defpackage.iv3
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.iv3
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.iv3
    public final void h(View view, qg5 qg5Var) {
        hr4 hr4Var = this.q;
        int[] a = hr4Var.a(hr4Var.a.getLayoutManager(), view);
        int i = a[0];
        int i2 = a[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (ceil > 0) {
            qg5Var.a = i;
            qg5Var.b = i2;
            qg5Var.c = ceil;
            qg5Var.e = this.j;
            qg5Var.f = true;
        }
    }
}
