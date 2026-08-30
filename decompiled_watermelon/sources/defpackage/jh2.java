package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jh2  reason: default package */
/* loaded from: classes.dex */
public class jh2 extends dh2 {
    @Override // defpackage.dh2
    public final void a(View view, Object obj) {
        ((ix6) obj).b(view);
    }

    @Override // defpackage.dh2
    public final void b(Object obj, ArrayList arrayList) {
        ix6 ix6Var = (ix6) obj;
        if (ix6Var != null) {
            int i = 0;
            if (ix6Var instanceof tx6) {
                tx6 tx6Var = (tx6) ix6Var;
                int size = tx6Var.z0.size();
                while (i < size) {
                    b(tx6Var.R(i), arrayList);
                    i++;
                }
            } else if (dh2.k(ix6Var.X) && dh2.k(ix6Var.Y)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    ix6Var.b((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // defpackage.dh2
    public final void c(Object obj) {
        ((dx6) obj).g();
    }

    @Override // defpackage.dh2
    public final void d(Object obj, we weVar) {
        dx6 dx6Var = (dx6) obj;
        dx6Var.g = weVar;
        if (!dx6Var.b) {
            dx6Var.d = 2;
            return;
        }
        dx6Var.h();
        dx6Var.e.a(RecyclerView.A1);
    }

    @Override // defpackage.dh2
    public final void e(ViewGroup viewGroup, Object obj) {
        rx6.a(viewGroup, (ix6) obj);
    }

    @Override // defpackage.dh2
    public final boolean g(Object obj) {
        return obj instanceof ix6;
    }

    @Override // defpackage.dh2
    public final Object h(Object obj) {
        if (obj != null) {
            return ((ix6) obj).clone();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, qx6] */
    @Override // defpackage.dh2
    public final Object i(ViewGroup viewGroup, Object obj) {
        ix6 ix6Var = (ix6) obj;
        ArrayList arrayList = rx6.c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (ix6Var.w()) {
                arrayList.add(viewGroup);
                ix6 clone = ix6Var.clone();
                tx6 tx6Var = new tx6();
                tx6Var.Q(clone);
                rx6.c(viewGroup, tx6Var);
                viewGroup.setTag(R.id.transition_current_scene, null);
                ?? obj2 = new Object();
                obj2.A = tx6Var;
                obj2.B = viewGroup;
                viewGroup.addOnAttachStateChangeListener(obj2);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(obj2);
                viewGroup.invalidate();
                dx6 dx6Var = new dx6(tx6Var);
                tx6Var.t0 = dx6Var;
                tx6Var.a(dx6Var);
                return tx6Var.t0;
            }
            i.i("The Transition must support seeking.");
        }
        return null;
    }

    @Override // defpackage.dh2
    public final boolean l() {
        return true;
    }

    @Override // defpackage.dh2
    public final boolean m(Object obj) {
        boolean w = ((ix6) obj).w();
        if (!w) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return w;
    }

    @Override // defpackage.dh2
    public final Object n(Object obj, Object obj2, Object obj3) {
        ix6 ix6Var = (ix6) obj;
        ix6 ix6Var2 = (ix6) obj2;
        ix6 ix6Var3 = (ix6) obj3;
        if (ix6Var != null && ix6Var2 != null) {
            tx6 tx6Var = new tx6();
            tx6Var.Q(ix6Var);
            tx6Var.Q(ix6Var2);
            tx6Var.A0 = false;
            ix6Var = tx6Var;
        } else if (ix6Var == null) {
            if (ix6Var2 != null) {
                ix6Var = ix6Var2;
            } else {
                ix6Var = null;
            }
        }
        if (ix6Var3 != null) {
            tx6 tx6Var2 = new tx6();
            if (ix6Var != null) {
                tx6Var2.Q(ix6Var);
            }
            tx6Var2.Q(ix6Var3);
            return tx6Var2;
        }
        return ix6Var;
    }

    @Override // defpackage.dh2
    public final Object o(Object obj, Object obj2) {
        tx6 tx6Var = new tx6();
        if (obj != null) {
            tx6Var.Q((ix6) obj);
        }
        tx6Var.Q((ix6) obj2);
        return tx6Var;
    }

    @Override // defpackage.dh2
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((ix6) obj).a(new gh2(view, arrayList));
    }

    @Override // defpackage.dh2
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((ix6) obj).a(new hh2(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.dh2
    public final void r(Object obj, float f) {
        dx6 dx6Var = (dx6) obj;
        boolean z = dx6Var.b;
        if (z) {
            tx6 tx6Var = dx6Var.h;
            long j = tx6Var.s0;
            long j2 = f * ((float) j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (dx6Var.e == null) {
                long j3 = dx6Var.a;
                if (j2 != j3 && z) {
                    if (!dx6Var.c) {
                        if (j2 == 0 && j3 > 0) {
                            j2 = -1;
                        } else if (j2 == j && j3 < j) {
                            j2 = j + 1;
                        }
                        if (j2 != j3) {
                            tx6Var.H(j2, j3);
                            dx6Var.a = j2;
                        }
                    }
                    sh shVar = dx6Var.f;
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    int i = (shVar.b + 1) % 20;
                    shVar.b = i;
                    ((long[]) shVar.c)[i] = currentAnimationTimeMillis;
                    ((float[]) shVar.d)[i] = (float) j2;
                    return;
                }
                return;
            }
            i.n("setCurrentPlayTimeMillis() called after animation has been started");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, me2] */
    @Override // defpackage.dh2
    public final void s(View view, Object obj) {
        if (view != null) {
            dh2.j(view, new Rect());
            ((ix6) obj).J(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, me2] */
    @Override // defpackage.dh2
    public final void t(Object obj, Rect rect) {
        ((ix6) obj).J(new Object());
    }

    @Override // defpackage.dh2
    public final void u(o oVar, Object obj, lh0 lh0Var, Runnable runnable) {
        v(obj, lh0Var, null, runnable);
    }

    @Override // defpackage.dh2
    public final void v(Object obj, lh0 lh0Var, m0 m0Var, Runnable runnable) {
        ix6 ix6Var = (ix6) obj;
        eh2 eh2Var = new eh2(m0Var, ix6Var, runnable);
        synchronized (lh0Var) {
            while (lh0Var.c) {
                try {
                    try {
                        lh0Var.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (lh0Var.b != eh2Var) {
                lh0Var.b = eh2Var;
                if (lh0Var.a) {
                    Runnable runnable2 = (Runnable) eh2Var.B;
                    ix6 ix6Var2 = (ix6) eh2Var.R;
                    Runnable runnable3 = (Runnable) eh2Var.L;
                    if (runnable2 == null) {
                        ix6Var2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        ix6Var.a(new ih2(runnable));
    }

    @Override // defpackage.dh2
    public final void w(Object obj, View view, ArrayList arrayList) {
        tx6 tx6Var = (tx6) obj;
        ArrayList arrayList2 = tx6Var.Y;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dh2.f(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(tx6Var, arrayList);
    }

    @Override // defpackage.dh2
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        tx6 tx6Var = (tx6) obj;
        if (tx6Var != null) {
            ArrayList arrayList3 = tx6Var.Y;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(tx6Var, arrayList, arrayList2);
        }
    }

    @Override // defpackage.dh2
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        tx6 tx6Var = new tx6();
        tx6Var.Q((ix6) obj);
        return tx6Var;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int size;
        ix6 ix6Var = (ix6) obj;
        int i = 0;
        if (ix6Var instanceof tx6) {
            tx6 tx6Var = (tx6) ix6Var;
            int size2 = tx6Var.z0.size();
            while (i < size2) {
                z(tx6Var.R(i), arrayList, arrayList2);
                i++;
            }
        } else if (dh2.k(ix6Var.X)) {
            ArrayList arrayList3 = ix6Var.Y;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    ix6Var.b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    ix6Var.E((View) arrayList.get(size3));
                }
            }
        }
    }
}
