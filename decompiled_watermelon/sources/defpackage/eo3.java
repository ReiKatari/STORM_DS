package defpackage;

import android.view.View;
import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eo3  reason: default package */
/* loaded from: classes.dex */
public final class eo3 {
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
        int i = Preference.DEFAULT_ORDER;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((g75) this.k.get(i2)).a;
            r65 r65Var = (r65) view3.getLayoutParams();
            if (view3 != view && !r65Var.a.h() && (b = (r65Var.a.b() - this.d) * this.e) >= 0 && b < i) {
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
            this.d = ((r65) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(w65 w65Var) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((g75) this.k.get(i)).a;
                r65 r65Var = (r65) view.getLayoutParams();
                if (!r65Var.a.h() && this.d == r65Var.a.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View e = w65Var.e(this.d);
        this.d += this.e;
        return e;
    }
}
