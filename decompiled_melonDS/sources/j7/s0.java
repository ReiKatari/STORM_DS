package j7;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7668a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u0 f7669b;

    public /* synthetic */ s0(u0 u0Var, int i2) {
        this.f7668a = i2;
        this.f7669b = u0Var;
    }

    public final int a(View view) {
        int right;
        int i2;
        switch (this.f7668a) {
            case 0:
                right = view.getRight() + ((v0) view.getLayoutParams()).f7723b.right;
                i2 = ((ViewGroup.MarginLayoutParams) ((v0) view.getLayoutParams())).rightMargin;
                break;
            default:
                right = view.getBottom() + ((v0) view.getLayoutParams()).f7723b.bottom;
                i2 = ((ViewGroup.MarginLayoutParams) ((v0) view.getLayoutParams())).bottomMargin;
                break;
        }
        return right + i2;
    }

    public final int b(View view) {
        int left;
        int i2;
        switch (this.f7668a) {
            case 0:
                left = view.getLeft() - ((v0) view.getLayoutParams()).f7723b.left;
                i2 = ((ViewGroup.MarginLayoutParams) ((v0) view.getLayoutParams())).leftMargin;
                break;
            default:
                left = view.getTop() - ((v0) view.getLayoutParams()).f7723b.top;
                i2 = ((ViewGroup.MarginLayoutParams) ((v0) view.getLayoutParams())).topMargin;
                break;
        }
        return left - i2;
    }

    public final int c() {
        int i2;
        int E;
        switch (this.f7668a) {
            case 0:
                u0 u0Var = this.f7669b;
                i2 = u0Var.f7720n;
                E = u0Var.E();
                break;
            default:
                u0 u0Var2 = this.f7669b;
                i2 = u0Var2.f7721o;
                E = u0Var2.C();
                break;
        }
        return i2 - E;
    }

    public final int d() {
        switch (this.f7668a) {
            case 0:
                return this.f7669b.D();
            default:
                return this.f7669b.F();
        }
    }
}
