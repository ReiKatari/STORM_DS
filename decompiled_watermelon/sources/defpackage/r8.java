package defpackage;

import android.os.Trace;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Set;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r8  reason: default package */
/* loaded from: classes.dex */
public final class r8 {
    public Object a;
    public Object b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public r8(w71 w71Var, ka kaVar) {
        this.b = w71Var;
        this.a = kaVar;
        this.c = ai1.a(new p71(1, 1, w71Var, this));
        this.d = ai1.a(new p71(2, 1, w71Var, this));
        this.e = new p71(4, 1, w71Var, this);
        this.f = new p71(5, 1, w71Var, this);
        this.g = new p71(6, 1, w71Var, this);
        this.h = new p71(7, 1, w71Var, this);
        this.i = new p71(8, 1, w71Var, this);
        this.j = ai1.a(new p71(3, 1, w71Var, this));
        this.k = ai1.a(new p71(0, 1, w71Var, this));
    }

    public static final boolean f(wk2 wk2Var, o24 o24Var) {
        Object[] objArr = o24Var.A;
        int i = o24Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            l95 l95Var = ((wk2) objArr[i2]).a;
            if (l95Var instanceof rl4) {
                o24 o24Var2 = ((rl4) l95Var).B;
                if (o24Var2.k(wk2Var) || f(wk2Var, o24Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a() {
        this.a = null;
        this.b = null;
        o24 o24Var = (o24) this.c;
        o24Var.h();
        ((e24) this.d).b();
        this.e = o24Var;
        ((o24) this.f).h();
        ((o24) this.g).h();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public void b() {
        Set set = (Set) this.a;
        if (set != null && !set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((l95) it.next()).b();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public void c() {
        o24 o24Var = (o24) this.c;
        o24 o24Var2 = (o24) this.f;
        Set set = (Set) this.a;
        if (set != null) {
            this.k = null;
            if (o24Var2.L != 0) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    e24 e24Var = (e24) this.h;
                    int i = o24Var2.L;
                    while (true) {
                        i--;
                        if (-1 >= i) {
                            break;
                        }
                        Object obj = o24Var2.A[i];
                        if (obj instanceof wk2) {
                            l95 l95Var = ((wk2) obj).a;
                            set.remove(l95Var);
                            l95Var.c();
                        }
                        if (obj instanceof au0) {
                            if (e24Var != null && e24Var.c(obj)) {
                                ((au0) obj).a();
                            } else {
                                ((au0) obj).b();
                            }
                        }
                    }
                } finally {
                    Trace.endSection();
                }
            }
            if (o24Var.L != 0) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    Set set2 = (Set) this.a;
                    if (set2 != null) {
                        Object[] objArr = o24Var.A;
                        int i2 = o24Var.L;
                        for (int i3 = 0; i3 < i2; i3++) {
                            l95 l95Var2 = ((wk2) objArr[i3]).a;
                            set2.remove(l95Var2);
                            l95Var2.a();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public void d() {
        o24 o24Var = (o24) this.g;
        if (o24Var.L != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = o24Var.A;
                int i = o24Var.L;
                for (int i2 = 0; i2 < i; i2++) {
                    ((ki2) objArr[i2]).c();
                }
                o24Var.h();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void e(wk2 wk2Var) {
        o24 o24Var = (o24) this.c;
        if (((e24) this.d).c(wk2Var)) {
            ((e24) this.d).l(wk2Var);
            if (!((o24) this.e).k(wk2Var) && !o24Var.k(wk2Var)) {
                f(wk2Var, o24Var);
            }
            Set set = (Set) this.a;
            if (set != null) {
                set.add(wk2Var.a);
                return;
            }
            return;
        }
        e24 e24Var = (e24) this.k;
        if (e24Var != null && e24Var.c(wk2Var)) {
            return;
        }
        ((o24) this.f).b(wk2Var);
    }

    public void g(Set set, gv0 gv0Var) {
        a();
        this.a = set;
        this.b = gv0Var;
    }

    public r8(MotionLayout motionLayout, ComposeView composeView, ComposeView composeView2, RelativeLayout relativeLayout, RecyclerView recyclerView, ProgressBar progressBar, EmulatorSurfaceView emulatorSurfaceView, TextView textView, TextView textView2, TextView textView3, RuntimeLayoutView runtimeLayoutView) {
        this.a = motionLayout;
        this.b = composeView;
        this.c = composeView2;
        this.d = relativeLayout;
        this.e = recyclerView;
        this.f = progressBar;
        this.g = emulatorSurfaceView;
        this.h = textView;
        this.i = textView2;
        this.j = textView3;
        this.k = runtimeLayoutView;
    }

    public r8() {
        o24 o24Var = new o24(new wk2[16]);
        this.c = o24Var;
        e24 e24Var = xu5.a;
        this.d = new e24();
        this.e = o24Var;
        this.f = new o24(new Object[16]);
        this.g = new o24(new ki2[16]);
    }
}
