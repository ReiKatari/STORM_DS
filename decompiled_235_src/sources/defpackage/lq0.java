package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lq0  reason: default package */
/* loaded from: classes.dex */
public final class lq0 extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public lq0(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        nq0 nq0Var = this.a.d0;
        if (nq0Var != null) {
            nq0Var.getOutline(outline);
        } else {
            outline.setAlpha(RecyclerView.B1);
        }
    }
}
