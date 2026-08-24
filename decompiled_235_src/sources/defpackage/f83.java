package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f83  reason: default package */
/* loaded from: classes.dex */
public final class f83 extends f55 {
    public final View L;
    public int R;
    public int X;
    public final int[] Y;

    public f83(View view) {
        super(0);
        this.Y = new int[2];
        this.L = view;
    }

    @Override // defpackage.f55
    public final void i0(au7 au7Var) {
        this.L.setTranslationY(RecyclerView.B1);
    }

    @Override // defpackage.f55
    public final void j0(au7 au7Var) {
        View view = this.L;
        int[] iArr = this.Y;
        view.getLocationOnScreen(iArr);
        this.R = iArr[1];
    }

    @Override // defpackage.f55
    public final vu7 k0(vu7 vu7Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            au7 au7Var = (au7) it.next();
            if ((au7Var.a.d() & 8) != 0) {
                int i = this.X;
                this.L.setTranslationY(vo.c(au7Var.a.c(), i, 0));
                break;
            }
        }
        return vu7Var;
    }

    @Override // defpackage.f55
    public final rr6 l0(au7 au7Var, rr6 rr6Var) {
        View view = this.L;
        int[] iArr = this.Y;
        view.getLocationOnScreen(iArr);
        int i = this.R - iArr[1];
        this.X = i;
        view.setTranslationY(i);
        return rr6Var;
    }
}
