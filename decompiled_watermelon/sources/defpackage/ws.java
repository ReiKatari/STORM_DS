package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.o;
import me.magnum.melonds.MelonDSApplication;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ws  reason: default package */
/* loaded from: classes.dex */
public final class ws implements dl2 {
    public final /* synthetic */ int A = 1;
    public final Object B = new Object();
    public volatile cl2 L;
    public final Object R;

    public ws(t71 t71Var) {
        this.R = t71Var;
    }

    public static final Context c(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public z71 a() {
        o oVar = (o) this.R;
        if (oVar.getHost() != null) {
            jk2.n(oVar.getHost() instanceof el2, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", oVar.getHost().getClass());
            x71 x71Var = (x71) ((zf2) dk7.v(zf2.class, oVar.getHost()));
            return new z71(x71Var.a, x71Var.b, x71Var.c);
        }
        c44.i("Hilt Fragments must be attached before creating the component.");
        return null;
    }

    public c81 b() {
        Context context = ((RuntimeLayoutView) this.R).getContext();
        while ((context instanceof ContextWrapper) && !dl2.class.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context == f34.F(context.getApplicationContext())) {
            jk2.n(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", RuntimeLayoutView.class);
            context = null;
        }
        if (context instanceof dl2) {
            return new c81(((x71) ((ca7) dk7.v(ca7.class, (dl2) context))).a);
        }
        throw new IllegalStateException(RuntimeLayoutView.class + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    @Override // defpackage.dl2
    public final Object d() {
        switch (this.A) {
            case 0:
                if (((b81) this.L) == null) {
                    synchronized (this.B) {
                        try {
                            if (((b81) this.L) == null) {
                                this.L = new b81(new fh((Context) ((MelonDSApplication) ((t71) this.R).B), (byte) 0));
                            }
                        } finally {
                        }
                    }
                }
                return (b81) this.L;
            case 1:
                if (((z71) this.L) == null) {
                    synchronized (this.B) {
                        try {
                            if (((z71) this.L) == null) {
                                this.L = a();
                            }
                        } finally {
                        }
                    }
                }
                return (z71) this.L;
            default:
                if (((c81) this.L) == null) {
                    synchronized (this.B) {
                        try {
                            if (((c81) this.L) == null) {
                                this.L = b();
                            }
                        } finally {
                        }
                    }
                }
                return (c81) this.L;
        }
    }

    public ws(o oVar) {
        this.R = oVar;
    }

    public ws(RuntimeLayoutView runtimeLayoutView) {
        this.R = runtimeLayoutView;
    }
}
