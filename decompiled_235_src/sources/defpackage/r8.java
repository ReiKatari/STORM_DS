package defpackage;

import android.app.Activity;
import android.app.Application;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r8  reason: default package */
/* loaded from: classes.dex */
public final class r8 implements jr2 {
    public volatile ob1 A;
    public final Object B = new Object();
    public final Activity L;
    public final q9 R;
    public g60 X;

    public r8(Activity activity) {
        this.L = activity;
        this.R = new q9((mv0) activity);
    }

    public final void a() {
        g60 g60Var = this.X;
        if (g60Var != null) {
            g60Var.B = null;
        }
    }

    public final ob1 b() {
        String str;
        Activity activity = this.L;
        if (!(activity.getApplication() instanceof jr2)) {
            if (Application.class.equals(activity.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                str = "Found: " + activity.getApplication().getClass();
            }
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
        }
        pb1 pb1Var = (pb1) ((q8) q60.B(q8.class, this.R));
        return new ob1(pb1Var.a, pb1Var.b);
    }

    @Override // defpackage.jr2
    public final Object c() {
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

    public final void d() {
        q9 q9Var = this.R;
        g60 g60Var = ((o9) q9.a(q9Var.A, q9Var.B).Z(gh5.a(o9.class))).c;
        this.X = g60Var;
        if (((m94) g60Var.B) == null) {
            j71 defaultViewModelCreationExtras = ((mv0) this.L).getDefaultViewModelCreationExtras();
            qo2.o(g60Var.A, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
            g60Var.B = (m94) defaultViewModelCreationExtras;
        }
    }
}
