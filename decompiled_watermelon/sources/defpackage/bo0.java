package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bo0  reason: default package */
/* loaded from: classes.dex */
public final class bo0 extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public bo0(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        do0 do0Var = this.a.c0;
        if (do0Var != null) {
            do0Var.getOutline(outline);
        } else {
            outline.setAlpha(RecyclerView.A1);
        }
    }
}
