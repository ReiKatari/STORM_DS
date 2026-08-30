package defpackage;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a75  reason: default package */
/* loaded from: classes.dex */
public final class a75 {
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;
    public int g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.R(i);
            this.f = false;
        } else if (this.f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.c < 1) {
                i.n("If you provide an interpolator, you must set a positive duration");
                return;
            }
            int i2 = this.c;
            if (i2 >= 1) {
                recyclerView.Z0.c(this.a, this.b, i2, interpolator);
                int i3 = this.g + 1;
                this.g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f = false;
                return;
            }
            i.n("Scroll duration must be a positive number");
        } else {
            this.g = 0;
        }
    }
}
