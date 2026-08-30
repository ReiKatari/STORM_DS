package defpackage;

import android.content.Context;
import android.view.View;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c8  reason: default package */
/* loaded from: classes.dex */
public final class c8 extends gx3 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ f8 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(f8 f8Var, Context context, rh6 rh6Var, View view) {
        super(context, rh6Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = f8Var;
        if ((rh6Var.A.x & 32) != 32) {
            View view2 = f8Var.d0;
            this.e = view2 == null ? (View) f8Var.c0 : view2;
        }
        bq0 bq0Var = f8Var.r0;
        this.h = bq0Var;
        ex3 ex3Var = this.i;
        if (ex3Var != null) {
            ex3Var.d(bq0Var);
        }
    }

    @Override // defpackage.gx3
    public final void c() {
        int i = this.l;
        f8 f8Var = this.m;
        switch (i) {
            case 0:
                f8Var.o0 = null;
                super.c();
                return;
            default:
                uw3 uw3Var = f8Var.L;
                if (uw3Var != null) {
                    uw3Var.c(true);
                }
                f8Var.n0 = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(f8 f8Var, Context context, uw3 uw3Var, View view) {
        super(context, uw3Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = f8Var;
        this.f = 8388613;
        bq0 bq0Var = f8Var.r0;
        this.h = bq0Var;
        ex3 ex3Var = this.i;
        if (ex3Var != null) {
            ex3Var.d(bq0Var);
        }
    }
}
