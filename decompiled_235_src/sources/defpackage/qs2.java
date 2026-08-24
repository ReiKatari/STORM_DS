package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qs2  reason: default package */
/* loaded from: classes.dex */
public final class qs2 extends EdgeEffect {
    public final float a;
    public float b;

    public qs2(Context context) {
        super(context);
        this.a = ak7.s(context).A * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.b = RecyclerView.B1;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.b = RecyclerView.B1;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.b = RecyclerView.B1;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.b = RecyclerView.B1;
        super.onPull(f);
    }
}
