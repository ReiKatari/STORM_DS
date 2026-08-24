package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp5  reason: default package */
/* loaded from: classes.dex */
public final class wp5 extends wf5 {
    public RecyclerView d;

    @Override // defpackage.wf5
    public final int a() {
        return 0;
    }

    @Override // defpackage.wf5
    public final void d(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override // defpackage.wf5
    public final void e(wg5 wg5Var, int i) {
        vp5 vp5Var = (vp5) wg5Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [wg5, vp5] */
    @Override // defpackage.wf5
    public final wg5 f(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rewind_save_state, viewGroup, false);
        int i2 = R.id.image_screenshot;
        if (((ImageView) gi2.B(inflate, R.id.image_screenshot)) != null) {
            i2 = R.id.text_timestamp;
            if (((TextView) gi2.B(inflate, R.id.text_timestamp)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                viewGroup.getContext().getClass();
                ?? wg5Var = new wg5(constraintLayout);
                constraintLayout.setOnClickListener(new b92(this, wg5Var));
                constraintLayout.setOnFocusChangeListener(new ir0(this, 2));
                return wg5Var;
            }
        }
        u34.x("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
