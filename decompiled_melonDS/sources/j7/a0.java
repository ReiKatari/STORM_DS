package j7;

import android.view.View;
import androidx.preference.Preference;
import c1.h2;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7490a;

    /* renamed from: b  reason: collision with root package name */
    public int f7491b;

    /* renamed from: c  reason: collision with root package name */
    public int f7492c;

    /* renamed from: d  reason: collision with root package name */
    public int f7493d;

    /* renamed from: e  reason: collision with root package name */
    public int f7494e;

    /* renamed from: f  reason: collision with root package name */
    public int f7495f;

    /* renamed from: g  reason: collision with root package name */
    public int f7496g;

    /* renamed from: h  reason: collision with root package name */
    public int f7497h;

    /* renamed from: i  reason: collision with root package name */
    public int f7498i;

    /* renamed from: j  reason: collision with root package name */
    public int f7499j;

    /* renamed from: k  reason: collision with root package name */
    public List f7500k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7501l;

    public final void a(View view) {
        int b10;
        int size = this.f7500k.size();
        View view2 = null;
        int i2 = Preference.DEFAULT_ORDER;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((j1) this.f7500k.get(i10)).f7594a;
            v0 v0Var = (v0) view3.getLayoutParams();
            if (view3 != view && !v0Var.f7722a.h() && (b10 = (v0Var.f7722a.b() - this.f7493d) * this.f7494e) >= 0 && b10 < i2) {
                view2 = view3;
                if (b10 == 0) {
                    break;
                }
                i2 = b10;
            }
        }
        if (view2 == null) {
            this.f7493d = -1;
        } else {
            this.f7493d = ((v0) view2.getLayoutParams()).f7722a.b();
        }
    }

    public final View b(h2 h2Var) {
        List list = this.f7500k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = ((j1) this.f7500k.get(i2)).f7594a;
                v0 v0Var = (v0) view.getLayoutParams();
                if (!v0Var.f7722a.h() && this.f7493d == v0Var.f7722a.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View e6 = h2Var.e(this.f7493d);
        this.f7493d += this.f7494e;
        return e6;
    }
}
