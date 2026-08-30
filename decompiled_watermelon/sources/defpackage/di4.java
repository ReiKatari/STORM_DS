package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: di4  reason: default package */
/* loaded from: classes.dex */
public final class di4 extends go3 {
    public final /* synthetic */ ei4 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di4(ei4 ei4Var, Context context) {
        super(context);
        this.q = ei4Var;
    }

    @Override // defpackage.go3
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.go3
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.go3
    public final void h(View view, a75 a75Var) {
        ei4 ei4Var = this.q;
        int[] a = ei4Var.a(ei4Var.a.getLayoutManager(), view);
        int i = a[0];
        int i2 = a[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (ceil > 0) {
            a75Var.a = i;
            a75Var.b = i2;
            a75Var.c = ceil;
            a75Var.e = this.j;
            a75Var.f = true;
        }
    }
}
