package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.common.MlKitException;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q14  reason: default package */
/* loaded from: classes.dex */
public abstract class q14 {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, RecyclerView.B1, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public b00 f;

    public q14(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = kj2.W(context, R.attr.motionDurationMedium2, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        this.d = kj2.W(context, R.attr.motionDurationShort3, 150);
        this.e = kj2.W(context, R.attr.motionDurationShort2, 100);
    }
}
