package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gv3  reason: default package */
/* loaded from: classes.dex */
public final class gv3 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int b;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((wg5) this.k.get(i2)).a;
            hg5 hg5Var = (hg5) view3.getLayoutParams();
            if (view3 != view && !hg5Var.a.h() && (b = (hg5Var.a.b() - this.d) * this.e) >= 0 && b < i) {
                view2 = view3;
                if (b == 0) {
                    break;
                }
                i = b;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((hg5) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(mg5 mg5Var) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((wg5) this.k.get(i)).a;
                hg5 hg5Var = (hg5) view.getLayoutParams();
                if (!hg5Var.a.h() && this.d == hg5Var.a.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View e = mg5Var.e(this.d);
        this.d += this.e;
        return e;
    }
}
