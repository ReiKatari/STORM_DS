package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eg5  reason: default package */
/* loaded from: classes.dex */
public final class eg5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gg5 b;

    public /* synthetic */ eg5(gg5 gg5Var, int i) {
        this.a = i;
        this.b = gg5Var;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.a) {
            case 0:
                right = view.getRight() + ((hg5) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) ((hg5) view.getLayoutParams())).rightMargin;
                break;
            default:
                right = view.getBottom() + ((hg5) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ((hg5) view.getLayoutParams())).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.a) {
            case 0:
                left = view.getLeft() - ((hg5) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) ((hg5) view.getLayoutParams())).leftMargin;
                break;
            default:
                left = view.getTop() - ((hg5) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) ((hg5) view.getLayoutParams())).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int E;
        int i2 = this.a;
        gg5 gg5Var = this.b;
        switch (i2) {
            case 0:
                i = gg5Var.n;
                E = gg5Var.E();
                break;
            default:
                i = gg5Var.o;
                E = gg5Var.C();
                break;
        }
        return i - E;
    }

    public final int d() {
        int i = this.a;
        gg5 gg5Var = this.b;
        switch (i) {
            case 0:
                return gg5Var.D();
            default:
                return gg5Var.F();
        }
    }
}
