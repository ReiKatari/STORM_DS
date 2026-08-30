package kb;

import a0.l;
import android.app.Activity;
import android.app.Application;
import d.k;
import nc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements mb.b {
    public volatile rd.a A;
    public final Object B = new Object();
    public final Activity L;
    public final f R;
    public l X;

    public b(Activity activity) {
        this.L = activity;
        this.R = new f((k) activity);
    }

    public final void a() {
        l lVar = this.X;
        if (lVar != null) {
            lVar.B = null;
        }
    }

    public final rd.a b() {
        String str;
        Activity activity = this.L;
        if (!(activity.getApplication() instanceof mb.b)) {
            if (Application.class.equals(activity.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                str = "Found: " + activity.getApplication().getClass();
            }
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
        }
        rd.c cVar = (rd.c) ((a) aj.g.w(this.R, a.class));
        return new rd.a(cVar.f12647a, cVar.f12648b);
    }

    public final void c() {
        f fVar = this.R;
        l lVar = ((d) f.a(fVar.A, fVar.B).a(u.a(d.class))).f8132c;
        this.X = lVar;
        if (((w6.d) lVar.B) == null) {
            w6.c defaultViewModelCreationExtras = ((k) this.L).getDefaultViewModelCreationExtras();
            aj.g.l(lVar.A, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
            lVar.B = (w6.d) defaultViewModelCreationExtras;
        }
    }

    @Override // mb.b
    public final Object d() {
        if (this.A == null) {
            synchronized (this.B) {
                try {
                    if (this.A == null) {
                        this.A = b();
                    }
                } finally {
                }
            }
        }
        return this.A;
    }
}
