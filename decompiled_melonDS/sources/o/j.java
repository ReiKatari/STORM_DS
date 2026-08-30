package o;

import a6.f1;
import a6.g1;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f10491c;

    /* renamed from: d  reason: collision with root package name */
    public g1 f10492d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10493e;

    /* renamed from: b  reason: collision with root package name */
    public long f10490b = -1;

    /* renamed from: f  reason: collision with root package name */
    public final i f10494f = new i(this);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f10489a = new ArrayList();

    public final void a() {
        if (!this.f10493e) {
            return;
        }
        ArrayList arrayList = this.f10489a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((f1) obj).b();
        }
        this.f10493e = false;
    }

    public final void b() {
        View view;
        if (this.f10493e) {
            return;
        }
        ArrayList arrayList = this.f10489a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            f1 f1Var = (f1) obj;
            long j2 = this.f10490b;
            if (j2 >= 0) {
                f1Var.c(j2);
            }
            Interpolator interpolator = this.f10491c;
            if (interpolator != null && (view = (View) f1Var.f454a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f10492d != null) {
                f1Var.d(this.f10494f);
            }
            View view2 = (View) f1Var.f454a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f10493e = true;
    }
}
