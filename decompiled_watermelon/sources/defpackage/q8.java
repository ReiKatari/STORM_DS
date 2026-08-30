package defpackage;

import android.app.Activity;
import android.app.Application;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q8  reason: default package */
/* loaded from: classes.dex */
public final class q8 implements dl2 {
    public volatile x71 A;
    public final Object B = new Object();
    public final Activity L;
    public final p9 R;
    public i40 X;

    public q8(Activity activity) {
        this.L = activity;
        this.R = new p9((ys0) activity);
    }

    public final void a() {
        i40 i40Var = this.X;
        if (i40Var != null) {
            i40Var.B = null;
        }
    }

    public final x71 b() {
        String str;
        Activity activity = this.L;
        if (!(activity.getApplication() instanceof dl2)) {
            if (Application.class.equals(activity.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                str = "Found: " + activity.getApplication().getClass();
            }
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
        }
        y71 y71Var = (y71) ((p8) dk7.v(p8.class, this.R));
        return new x71(y71Var.a, y71Var.b);
    }

    public final void c() {
        p9 p9Var = this.R;
        i40 i40Var = ((n9) p9.a(p9Var.A, p9Var.B).X(q75.a(n9.class))).c;
        this.X = i40Var;
        if (((g14) i40Var.B) == null) {
            z31 defaultViewModelCreationExtras = ((ys0) this.L).getDefaultViewModelCreationExtras();
            jk2.n(i40Var.A, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
            i40Var.B = (g14) defaultViewModelCreationExtras;
        }
    }

    @Override // defpackage.dl2
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
