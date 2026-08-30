package j7;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends e0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(u0 u0Var, int i2) {
        super(u0Var);
        this.f7527d = i2;
    }

    @Override // j7.e0
    public final int d(View view) {
        int right;
        int i2;
        switch (this.f7527d) {
            case 0:
                ((u0) this.f7542b).getClass();
                right = view.getRight() + ((v0) view.getLayoutParams()).f7723b.right;
                i2 = ((ViewGroup.MarginLayoutParams) ((v0) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((u0) this.f7542b).getClass();
                right = view.getBottom() + ((v0) view.getLayoutParams()).f7723b.bottom;
                i2 = ((ViewGroup.MarginLayoutParams) ((v0) view.getLayoutParams())).bottomMargin;
                break;
        }
        return right + i2;
    }

    @Override // j7.e0
    public final int e(View view) {
        int A;
        int i2;
        switch (this.f7527d) {
            case 0:
                v0 v0Var = (v0) view.getLayoutParams();
                ((u0) this.f7542b).getClass();
                A = u0.A(view) + ((ViewGroup.MarginLayoutParams) v0Var).leftMargin;
                i2 = ((ViewGroup.MarginLayoutParams) v0Var).rightMargin;
                break;
            default:
                v0 v0Var2 = (v0) view.getLayoutParams();
                ((u0) this.f7542b).getClass();
                A = u0.z(view) + ((ViewGroup.MarginLayoutParams) v0Var2).topMargin;
                i2 = ((ViewGroup.MarginLayoutParams) v0Var2).bottomMargin;
                break;
        }
        return A + i2;
    }

    @Override // j7.e0
    public final int f(View view) {
        int z10;
        int i2;
        switch (this.f7527d) {
            case 0:
                v0 v0Var = (v0) view.getLayoutParams();
                ((u0) this.f7542b).getClass();
                z10 = u0.z(view) + ((ViewGroup.MarginLayoutParams) v0Var).topMargin;
                i2 = ((ViewGroup.MarginLayoutParams) v0Var).bottomMargin;
                break;
            default:
                v0 v0Var2 = (v0) view.getLayoutParams();
                ((u0) this.f7542b).getClass();
                z10 = u0.A(view) + ((ViewGroup.MarginLayoutParams) v0Var2).leftMargin;
                i2 = ((ViewGroup.MarginLayoutParams) v0Var2).rightMargin;
                break;
        }
        return z10 + i2;
    }

    @Override // j7.e0
    public final int g(View view) {
        int left;
        int i2;
        switch (this.f7527d) {
            case 0:
                ((u0) this.f7542b).getClass();
                left = view.getLeft() - ((v0) view.getLayoutParams()).f7723b.left;
                i2 = ((ViewGroup.MarginLayoutParams) ((v0) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((u0) this.f7542b).getClass();
                left = view.getTop() - ((v0) view.getLayoutParams()).f7723b.top;
                i2 = ((ViewGroup.MarginLayoutParams) ((v0) view.getLayoutParams())).topMargin;
                break;
        }
        return left - i2;
    }

    @Override // j7.e0
    public final int h() {
        switch (this.f7527d) {
            case 0:
                return ((u0) this.f7542b).f7720n;
            default:
                return ((u0) this.f7542b).f7721o;
        }
    }

    @Override // j7.e0
    public final int i() {
        int i2;
        int E;
        switch (this.f7527d) {
            case 0:
                u0 u0Var = (u0) this.f7542b;
                i2 = u0Var.f7720n;
                E = u0Var.E();
                break;
            default:
                u0 u0Var2 = (u0) this.f7542b;
                i2 = u0Var2.f7721o;
                E = u0Var2.C();
                break;
        }
        return i2 - E;
    }

    @Override // j7.e0
    public final int j() {
        switch (this.f7527d) {
            case 0:
                return ((u0) this.f7542b).E();
            default:
                return ((u0) this.f7542b).C();
        }
    }

    @Override // j7.e0
    public final int k() {
        switch (this.f7527d) {
            case 0:
                return ((u0) this.f7542b).f7719l;
            default:
                return ((u0) this.f7542b).m;
        }
    }

    @Override // j7.e0
    public final int l() {
        switch (this.f7527d) {
            case 0:
                return ((u0) this.f7542b).m;
            default:
                return ((u0) this.f7542b).f7719l;
        }
    }

    @Override // j7.e0
    public final int m() {
        switch (this.f7527d) {
            case 0:
                return ((u0) this.f7542b).D();
            default:
                return ((u0) this.f7542b).F();
        }
    }

    @Override // j7.e0
    public final int n() {
        int D;
        int E;
        switch (this.f7527d) {
            case 0:
                u0 u0Var = (u0) this.f7542b;
                D = u0Var.f7720n - u0Var.D();
                E = u0Var.E();
                break;
            default:
                u0 u0Var2 = (u0) this.f7542b;
                D = u0Var2.f7721o - u0Var2.F();
                E = u0Var2.C();
                break;
        }
        return D - E;
    }

    @Override // j7.e0
    public final int o(View view) {
        switch (this.f7527d) {
            case 0:
                Rect rect = (Rect) this.f7543c;
                ((u0) this.f7542b).J(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f7543c;
                ((u0) this.f7542b).J(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // j7.e0
    public final int p(View view) {
        switch (this.f7527d) {
            case 0:
                Rect rect = (Rect) this.f7543c;
                ((u0) this.f7542b).J(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f7543c;
                ((u0) this.f7542b).J(view, rect2);
                return rect2.top;
        }
    }

    @Override // j7.e0
    public final void q(int i2) {
        switch (this.f7527d) {
            case 0:
                ((u0) this.f7542b).O(i2);
                return;
            default:
                ((u0) this.f7542b).P(i2);
                return;
        }
    }
}
