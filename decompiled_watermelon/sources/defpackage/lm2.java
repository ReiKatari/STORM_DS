package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lm2  reason: default package */
/* loaded from: classes.dex */
public final class lm2 extends EdgeEffect {
    public final float a;
    public float b;

    public lm2(Context context) {
        super(context);
        this.a = ct3.z(context).A * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.b = RecyclerView.A1;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.b = RecyclerView.A1;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.b = RecyclerView.A1;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.b = RecyclerView.A1;
        super.onPull(f);
    }
}
