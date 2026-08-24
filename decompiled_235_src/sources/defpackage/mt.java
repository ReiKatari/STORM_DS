package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.o;
import me.magnum.melonds.MelonDSApplication;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mt  reason: default package */
/* loaded from: classes.dex */
public final class mt implements jr2 {
    public final /* synthetic */ int A = 1;
    public final Object B = new Object();
    public volatile ir2 L;
    public final Object R;

    public mt(d51 d51Var) {
        this.R = d51Var;
    }

    public static final Context d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public qb1 a() {
        o oVar = (o) this.R;
        if (oVar.getHost() != null) {
            qo2.o(oVar.getHost() instanceof kr2, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", oVar.getHost().getClass());
            ob1 ob1Var = (ob1) ((yk2) q60.B(yk2.class, oVar.getHost()));
            return new qb1(ob1Var.a, ob1Var.b, ob1Var.c);
        }
        u34.x("Hilt Fragments must be attached before creating the component.");
        return null;
    }

    public tb1 b() {
        Context context = ((RuntimeLayoutView) this.R).getContext();
        while ((context instanceof ContextWrapper) && !jr2.class.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context == vy7.k0(context.getApplicationContext())) {
            qo2.o(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", RuntimeLayoutView.class);
            context = null;
        }
        if (context instanceof jr2) {
            return new tb1(((ob1) ((co7) q60.B(co7.class, (jr2) context))).a);
        }
        throw new IllegalStateException(RuntimeLayoutView.class + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    @Override // defpackage.jr2
    public final Object c() {
        switch (this.A) {
            case 0:
                if (((sb1) this.L) == null) {
                    synchronized (this.B) {
                        try {
                            if (((sb1) this.L) == null) {
                                this.L = new sb1(new rh((Context) ((MelonDSApplication) ((d51) this.R).B), (byte) 0));
                            }
                        } finally {
                        }
                    }
                }
                return (sb1) this.L;
            case 1:
                if (((qb1) this.L) == null) {
                    synchronized (this.B) {
                        try {
                            if (((qb1) this.L) == null) {
                                this.L = a();
                            }
                        } finally {
                        }
                    }
                }
                return (qb1) this.L;
            default:
                if (((tb1) this.L) == null) {
                    synchronized (this.B) {
                        try {
                            if (((tb1) this.L) == null) {
                                this.L = b();
                            }
                        } finally {
                        }
                    }
                }
                return (tb1) this.L;
        }
    }

    public mt(o oVar) {
        this.R = oVar;
    }

    public mt(RuntimeLayoutView runtimeLayoutView) {
        this.R = runtimeLayoutView;
    }
}
