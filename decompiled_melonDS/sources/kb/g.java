package kb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.j0;
import m9.o;
import me.magnum.melonds.MelonDSApplication;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
import rd.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements mb.b {
    public final /* synthetic */ int A = 1;
    public final Object B = new Object();
    public volatile mb.a L;
    public final Object R;

    public g(k kVar) {
        this.R = kVar;
    }

    public static final Context c(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public rd.d a() {
        j0 j0Var = (j0) this.R;
        if (j0Var.getHost() != null) {
            aj.g.l(j0Var.getHost() instanceof mb.c, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", j0Var.getHost().getClass());
            rd.a aVar = (rd.a) ((h) aj.g.w(j0Var.getHost(), h.class));
            return new rd.d(aVar.f12641a, aVar.f12642b, aVar.f12643c);
        }
        o.i("Hilt Fragments must be attached before creating the component.");
        return null;
    }

    public rd.h b() {
        Context context = ((RuntimeLayoutView) this.R).getContext();
        while ((context instanceof ContextWrapper) && !mb.b.class.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context == aj.g.y(context.getApplicationContext())) {
            aj.g.l(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", RuntimeLayoutView.class);
            context = null;
        }
        if (context instanceof mb.b) {
            return new rd.h(((rd.a) ((j) aj.g.w((mb.b) context, j.class))).f12641a);
        }
        throw new IllegalStateException(RuntimeLayoutView.class + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    @Override // mb.b
    public final Object d() {
        switch (this.A) {
            case 0:
                if (((rd.g) this.L) == null) {
                    synchronized (this.B) {
                        try {
                            if (((rd.g) this.L) == null) {
                                this.L = new rd.g(new d7.c((MelonDSApplication) ((k) this.R).B, false));
                            }
                        } finally {
                        }
                    }
                }
                return (rd.g) this.L;
            case DSiCameraSource.FrontCamera /* 1 */:
                if (((rd.d) this.L) == null) {
                    synchronized (this.B) {
                        try {
                            if (((rd.d) this.L) == null) {
                                this.L = a();
                            }
                        } finally {
                        }
                    }
                }
                return (rd.d) this.L;
            default:
                if (((rd.h) this.L) == null) {
                    synchronized (this.B) {
                        try {
                            if (((rd.h) this.L) == null) {
                                this.L = b();
                            }
                        } finally {
                        }
                    }
                }
                return (rd.h) this.L;
        }
    }

    public g(j0 j0Var) {
        this.R = j0Var;
    }

    public g(RuntimeLayoutView runtimeLayoutView) {
        this.R = runtimeLayoutView;
    }
}
