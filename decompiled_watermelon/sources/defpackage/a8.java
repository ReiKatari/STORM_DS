package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a8  reason: default package */
/* loaded from: classes.dex */
public final class a8 extends jf2 {
    public final /* synthetic */ int e0 = 0;
    public final /* synthetic */ View f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f0 = actionMenuItemView;
    }

    @Override // defpackage.jf2
    public final y56 b() {
        c8 c8Var;
        int i = this.e0;
        View view = this.f0;
        switch (i) {
            case 0:
                b8 b8Var = ((ActionMenuItemView) view).k0;
                if (b8Var == null || (c8Var = ((d8) b8Var).a.o0) == null) {
                    return null;
                }
                return c8Var.a();
            default:
                c8 c8Var2 = ((e8) view).R.n0;
                if (c8Var2 == null) {
                    return null;
                }
                return c8Var2.a();
        }
    }

    @Override // defpackage.jf2
    public final boolean c() {
        y56 b;
        int i = this.e0;
        View view = this.f0;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                tw3 tw3Var = actionMenuItemView.i0;
                if (tw3Var != null && tw3Var.a(actionMenuItemView.f0) && (b = b()) != null && b.a()) {
                    return true;
                }
                return false;
            default:
                ((e8) view).R.l();
                return true;
        }
    }

    @Override // defpackage.jf2
    public boolean d() {
        switch (this.e0) {
            case 1:
                f8 f8Var = ((e8) this.f0).R;
                if (f8Var.p0 != null) {
                    return false;
                }
                f8Var.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(e8 e8Var, e8 e8Var2) {
        super(e8Var2);
        this.f0 = e8Var;
    }
}
