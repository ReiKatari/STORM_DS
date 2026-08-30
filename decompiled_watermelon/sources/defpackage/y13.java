package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y13  reason: default package */
/* loaded from: classes.dex */
public final class y13 extends yv4 {
    public final View L;
    public int R;
    public int X;
    public final int[] Y;

    public y13(View view) {
        super(0);
        this.Y = new int[2];
        this.L = view;
    }

    @Override // defpackage.yv4
    public final void i0(ze7 ze7Var) {
        this.L.setTranslationY(RecyclerView.A1);
    }

    @Override // defpackage.yv4
    public final void j0(ze7 ze7Var) {
        View view = this.L;
        int[] iArr = this.Y;
        view.getLocationOnScreen(iArr);
        this.R = iArr[1];
    }

    @Override // defpackage.yv4
    public final vf7 k0(vf7 vf7Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ze7 ze7Var = (ze7) it.next();
            if ((ze7Var.a.d() & 8) != 0) {
                int i = this.X;
                this.L.setTranslationY(jo.c(ze7Var.a.c(), i, 0));
                break;
            }
        }
        return vf7Var;
    }

    @Override // defpackage.yv4
    public final wv6 l0(ze7 ze7Var, wv6 wv6Var) {
        View view = this.L;
        int[] iArr = this.Y;
        view.getLocationOnScreen(iArr);
        int i = this.R - iArr[1];
        this.X = i;
        view.setTranslationY(i);
        return wv6Var;
    }
}
