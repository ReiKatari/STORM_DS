package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kf4  reason: default package */
/* loaded from: classes.dex */
public final class kf4 extends io1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf4(q65 q65Var, int i) {
        super(q65Var);
        this.d = i;
    }

    @Override // defpackage.io1
    public final int d(View view) {
        int right;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((q65) obj).getClass();
                right = view.getRight() + ((r65) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) ((r65) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((q65) obj).getClass();
                right = view.getBottom() + ((r65) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ((r65) view.getLayoutParams())).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.io1
    public final int e(View view) {
        int A;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                r65 r65Var = (r65) view.getLayoutParams();
                ((q65) obj).getClass();
                A = q65.A(view) + ((ViewGroup.MarginLayoutParams) r65Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) r65Var).rightMargin;
                break;
            default:
                r65 r65Var2 = (r65) view.getLayoutParams();
                ((q65) obj).getClass();
                A = q65.z(view) + ((ViewGroup.MarginLayoutParams) r65Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) r65Var2).bottomMargin;
                break;
        }
        return A + i;
    }

    @Override // defpackage.io1
    public final int f(View view) {
        int z;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                r65 r65Var = (r65) view.getLayoutParams();
                ((q65) obj).getClass();
                z = q65.z(view) + ((ViewGroup.MarginLayoutParams) r65Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) r65Var).bottomMargin;
                break;
            default:
                r65 r65Var2 = (r65) view.getLayoutParams();
                ((q65) obj).getClass();
                z = q65.A(view) + ((ViewGroup.MarginLayoutParams) r65Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) r65Var2).rightMargin;
                break;
        }
        return z + i;
    }

    @Override // defpackage.io1
    public final int g(View view) {
        int left;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((q65) obj).getClass();
                left = view.getLeft() - ((r65) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) ((r65) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((q65) obj).getClass();
                left = view.getTop() - ((r65) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) ((r65) view.getLayoutParams())).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.io1
    public final int h() {
        switch (this.d) {
            case 0:
                return ((q65) this.b).n;
            default:
                return ((q65) this.b).o;
        }
    }

    @Override // defpackage.io1
    public final int i() {
        int i;
        int E;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                q65 q65Var = (q65) obj;
                i = q65Var.n;
                E = q65Var.E();
                break;
            default:
                q65 q65Var2 = (q65) obj;
                i = q65Var2.o;
                E = q65Var2.C();
                break;
        }
        return i - E;
    }

    @Override // defpackage.io1
    public final int j() {
        switch (this.d) {
            case 0:
                return ((q65) this.b).E();
            default:
                return ((q65) this.b).C();
        }
    }

    @Override // defpackage.io1
    public final int k() {
        switch (this.d) {
            case 0:
                return ((q65) this.b).l;
            default:
                return ((q65) this.b).m;
        }
    }

    @Override // defpackage.io1
    public final int l() {
        switch (this.d) {
            case 0:
                return ((q65) this.b).m;
            default:
                return ((q65) this.b).l;
        }
    }

    @Override // defpackage.io1
    public final int m() {
        switch (this.d) {
            case 0:
                return ((q65) this.b).D();
            default:
                return ((q65) this.b).F();
        }
    }

    @Override // defpackage.io1
    public final int n() {
        int D;
        int E;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                q65 q65Var = (q65) obj;
                D = q65Var.n - q65Var.D();
                E = q65Var.E();
                break;
            default:
                q65 q65Var2 = (q65) obj;
                D = q65Var2.o - q65Var2.F();
                E = q65Var2.C();
                break;
        }
        return D - E;
    }

    @Override // defpackage.io1
    public final int o(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((q65) obj2).J(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((q65) obj2).J(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.io1
    public final int p(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((q65) obj2).J(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((q65) obj2).J(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.io1
    public final void q(int i) {
        switch (this.d) {
            case 0:
                ((q65) this.b).O(i);
                return;
            default:
                ((q65) this.b).P(i);
                return;
        }
    }
}
