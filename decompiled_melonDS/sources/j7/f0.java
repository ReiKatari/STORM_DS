package j7;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 extends c0 {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ g0 f7549q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, Context context) {
        super(context);
        this.f7549q = g0Var;
    }

    @Override // j7.c0
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // j7.c0
    public final int e(int i2) {
        return Math.min(100, super.e(i2));
    }

    @Override // j7.c0
    public final void h(View view, d1 d1Var) {
        g0 g0Var = this.f7549q;
        int[] a10 = g0Var.a(g0Var.f7569a.getLayoutManager(), view);
        int i2 = a10[0];
        int i10 = a10[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i2), Math.abs(i10))) / 0.3356d);
        if (ceil > 0) {
            d1Var.f7528a = i2;
            d1Var.f7529b = i10;
            d1Var.f7530c = ceil;
            d1Var.f7532e = this.f7516j;
            d1Var.f7533f = true;
        }
    }
}
