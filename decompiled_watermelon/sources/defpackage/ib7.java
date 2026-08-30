package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ib7  reason: default package */
/* loaded from: classes.dex */
public final class ib7 {
    public Interpolator c;
    public jb7 d;
    public boolean e;
    public long b = -1;
    public final xv6 f = new xv6(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (!this.e) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((hb7) obj).b();
        }
        this.e = false;
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hb7 hb7Var = (hb7) obj;
            long j = this.b;
            if (j >= 0) {
                hb7Var.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) hb7Var.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                hb7Var.d(this.f);
            }
            View view2 = (View) hb7Var.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
