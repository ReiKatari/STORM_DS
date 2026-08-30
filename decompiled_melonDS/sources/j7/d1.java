package j7;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public int f7528a;

    /* renamed from: b  reason: collision with root package name */
    public int f7529b;

    /* renamed from: c  reason: collision with root package name */
    public int f7530c;

    /* renamed from: d  reason: collision with root package name */
    public int f7531d;

    /* renamed from: e  reason: collision with root package name */
    public Interpolator f7532e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7533f;

    /* renamed from: g  reason: collision with root package name */
    public int f7534g;

    public final void a(RecyclerView recyclerView) {
        int i2 = this.f7531d;
        if (i2 >= 0) {
            this.f7531d = -1;
            recyclerView.R(i2);
            this.f7533f = false;
        } else if (this.f7533f) {
            Interpolator interpolator = this.f7532e;
            if (interpolator != null && this.f7530c < 1) {
                a0.j.p("If you provide an interpolator, you must set a positive duration");
                return;
            }
            int i10 = this.f7530c;
            if (i10 >= 1) {
                recyclerView.X0.c(this.f7528a, this.f7529b, i10, interpolator);
                int i11 = this.f7534g + 1;
                this.f7534g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f7533f = false;
                return;
            }
            a0.j.p("Scroll duration must be a positive number");
        } else {
            this.f7534g = 0;
        }
    }
}
