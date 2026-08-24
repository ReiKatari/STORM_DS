package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mo4  reason: default package */
/* loaded from: classes.dex */
public final class mo4 extends ts1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo4(gg5 gg5Var, int i) {
        super(gg5Var);
        this.d = i;
    }

    @Override // defpackage.ts1
    public final int d(View view) {
        int right;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((gg5) obj).getClass();
                right = view.getRight() + ((hg5) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) ((hg5) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((gg5) obj).getClass();
                right = view.getBottom() + ((hg5) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ((hg5) view.getLayoutParams())).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.ts1
    public final int e(View view) {
        int A;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                hg5 hg5Var = (hg5) view.getLayoutParams();
                ((gg5) obj).getClass();
                A = gg5.A(view) + ((ViewGroup.MarginLayoutParams) hg5Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) hg5Var).rightMargin;
                break;
            default:
                hg5 hg5Var2 = (hg5) view.getLayoutParams();
                ((gg5) obj).getClass();
                A = gg5.z(view) + ((ViewGroup.MarginLayoutParams) hg5Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) hg5Var2).bottomMargin;
                break;
        }
        return A + i;
    }

    @Override // defpackage.ts1
    public final int f(View view) {
        int z;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                hg5 hg5Var = (hg5) view.getLayoutParams();
                ((gg5) obj).getClass();
                z = gg5.z(view) + ((ViewGroup.MarginLayoutParams) hg5Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) hg5Var).bottomMargin;
                break;
            default:
                hg5 hg5Var2 = (hg5) view.getLayoutParams();
                ((gg5) obj).getClass();
                z = gg5.A(view) + ((ViewGroup.MarginLayoutParams) hg5Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) hg5Var2).rightMargin;
                break;
        }
        return z + i;
    }

    @Override // defpackage.ts1
    public final int g(View view) {
        int left;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((gg5) obj).getClass();
                left = view.getLeft() - ((hg5) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) ((hg5) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((gg5) obj).getClass();
                left = view.getTop() - ((hg5) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) ((hg5) view.getLayoutParams())).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.ts1
    public final int h() {
        switch (this.d) {
            case 0:
                return ((gg5) this.b).n;
            default:
                return ((gg5) this.b).o;
        }
    }

    @Override // defpackage.ts1
    public final int i() {
        int i;
        int E;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                gg5 gg5Var = (gg5) obj;
                i = gg5Var.n;
                E = gg5Var.E();
                break;
            default:
                gg5 gg5Var2 = (gg5) obj;
                i = gg5Var2.o;
                E = gg5Var2.C();
                break;
        }
        return i - E;
    }

    @Override // defpackage.ts1
    public final int j() {
        switch (this.d) {
            case 0:
                return ((gg5) this.b).E();
            default:
                return ((gg5) this.b).C();
        }
    }

    @Override // defpackage.ts1
    public final int k() {
        switch (this.d) {
            case 0:
                return ((gg5) this.b).l;
            default:
                return ((gg5) this.b).m;
        }
    }

    @Override // defpackage.ts1
    public final int l() {
        switch (this.d) {
            case 0:
                return ((gg5) this.b).m;
            default:
                return ((gg5) this.b).l;
        }
    }

    @Override // defpackage.ts1
    public final int m() {
        switch (this.d) {
            case 0:
                return ((gg5) this.b).D();
            default:
                return ((gg5) this.b).F();
        }
    }

    @Override // defpackage.ts1
    public final int n() {
        int D;
        int E;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                gg5 gg5Var = (gg5) obj;
                D = gg5Var.n - gg5Var.D();
                E = gg5Var.E();
                break;
            default:
                gg5 gg5Var2 = (gg5) obj;
                D = gg5Var2.o - gg5Var2.F();
                E = gg5Var2.C();
                break;
        }
        return D - E;
    }

    @Override // defpackage.ts1
    public final int o(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((gg5) obj2).J(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((gg5) obj2).J(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.ts1
    public final int p(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((gg5) obj2).J(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((gg5) obj2).J(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.ts1
    public final void q(int i) {
        switch (this.d) {
            case 0:
                ((gg5) this.b).O(i);
                return;
            default:
                ((gg5) this.b).P(i);
                return;
        }
    }
}
