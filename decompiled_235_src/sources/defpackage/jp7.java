package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jp7  reason: default package */
/* loaded from: classes.dex */
public final class jp7 {
    public Interpolator c;
    public kp7 d;
    public boolean e;
    public long b = -1;
    public final k87 f = new k87(this);
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
            ((ip7) obj).b();
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
            ip7 ip7Var = (ip7) obj;
            long j = this.b;
            if (j >= 0) {
                ip7Var.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) ip7Var.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                ip7Var.d(this.f);
            }
            View view2 = (View) ip7Var.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
