package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yf5  reason: default package */
/* loaded from: classes.dex */
public final class yf5 extends g65 {
    public RecyclerView d;

    @Override // defpackage.g65
    public final int a() {
        return 0;
    }

    @Override // defpackage.g65
    public final void d(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override // defpackage.g65
    public final void e(g75 g75Var, int i) {
        xf5 xf5Var = (xf5) g75Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [g75, xf5] */
    @Override // defpackage.g65
    public final g75 f(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rewind_save_state, viewGroup, false);
        int i2 = R.id.image_screenshot;
        if (((ImageView) ep2.r(inflate, R.id.image_screenshot)) != null) {
            i2 = R.id.text_timestamp;
            if (((TextView) ep2.r(inflate, R.id.text_timestamp)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                viewGroup.getContext().getClass();
                ?? g75Var = new g75(constraintLayout);
                constraintLayout.setOnClickListener(new j42(this, g75Var));
                constraintLayout.setOnFocusChangeListener(new yo0(2, this));
                return g75Var;
            }
        }
        c44.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
