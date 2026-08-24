package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b8  reason: default package */
/* loaded from: classes.dex */
public final class b8 extends ik2 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ View g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.g0 = actionMenuItemView;
    }

    @Override // defpackage.ik2
    public final lh6 b() {
        d8 d8Var;
        int i = this.f0;
        View view = this.g0;
        switch (i) {
            case 0:
                c8 c8Var = ((ActionMenuItemView) view).l0;
                if (c8Var == null || (d8Var = ((e8) c8Var).a.p0) == null) {
                    return null;
                }
                return d8Var.a();
            default:
                d8 d8Var2 = ((f8) view).R.o0;
                if (d8Var2 == null) {
                    return null;
                }
                return d8Var2.a();
        }
    }

    @Override // defpackage.ik2
    public final boolean c() {
        lh6 b;
        int i = this.f0;
        View view = this.g0;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                h44 h44Var = actionMenuItemView.j0;
                if (h44Var != null && h44Var.a(actionMenuItemView.g0) && (b = b()) != null && b.a()) {
                    return true;
                }
                return false;
            default:
                ((f8) view).R.l();
                return true;
        }
    }

    @Override // defpackage.ik2
    public boolean d() {
        switch (this.f0) {
            case 1:
                g8 g8Var = ((f8) this.g0).R;
                if (g8Var.q0 != null) {
                    return false;
                }
                g8Var.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(f8 f8Var, f8 f8Var2) {
        super(f8Var2);
        this.g0 = f8Var;
    }
}
