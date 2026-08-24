package defpackage;

import android.content.Context;
import android.view.View;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d8  reason: default package */
/* loaded from: classes.dex */
public final class d8 extends v44 {
    public final /* synthetic */ int l = 1;
    public final /* synthetic */ g8 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(g8 g8Var, Context context, it6 it6Var, View view) {
        super(context, it6Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = g8Var;
        if ((it6Var.A.x & 32) != 32) {
            View view2 = g8Var.e0;
            this.e = view2 == null ? (View) g8Var.d0 : view2;
        }
        os0 os0Var = g8Var.s0;
        this.h = os0Var;
        t44 t44Var = this.i;
        if (t44Var != null) {
            t44Var.g(os0Var);
        }
    }

    @Override // defpackage.v44
    public final void c() {
        int i = this.l;
        g8 g8Var = this.m;
        switch (i) {
            case 0:
                g8Var.p0 = null;
                super.c();
                return;
            default:
                i44 i44Var = g8Var.L;
                if (i44Var != null) {
                    i44Var.c(true);
                }
                g8Var.o0 = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(g8 g8Var, Context context, i44 i44Var, View view) {
        super(context, i44Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = g8Var;
        this.f = 8388613;
        os0 os0Var = g8Var.s0;
        this.h = os0Var;
        t44 t44Var = this.i;
        if (t44Var != null) {
            t44Var.g(os0Var);
        }
    }
}
