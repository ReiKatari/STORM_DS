package c8;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.z1;
import java.util.ArrayList;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class n extends z1 {
    @Override // androidx.fragment.app.z1
    public final void a(View view, Object obj) {
        ((t) obj).b(view);
    }

    @Override // androidx.fragment.app.z1
    public final void b(Object obj, ArrayList arrayList) {
        t tVar = (t) obj;
        if (tVar != null) {
            int i2 = 0;
            if (tVar instanceof z) {
                z zVar = (z) tVar;
                int size = zVar.f2722y0.size();
                while (i2 < size) {
                    b(zVar.R(i2), arrayList);
                    i2++;
                }
            } else if (z1.k(tVar.X) && z1.k(tVar.Y)) {
                int size2 = arrayList.size();
                while (i2 < size2) {
                    tVar.b((View) arrayList.get(i2));
                    i2++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.z1
    public final void c(Object obj) {
        ((q) obj).g();
    }

    @Override // androidx.fragment.app.z1
    public final void d(Object obj, androidx.fragment.app.m mVar) {
        q qVar = (q) obj;
        qVar.f2686g = mVar;
        if (!qVar.f2681b) {
            qVar.f2683d = 2;
            return;
        }
        qVar.h();
        qVar.f2684e.a(0.0f);
    }

    @Override // androidx.fragment.app.z1
    public final void e(ViewGroup viewGroup, Object obj) {
        x.a(viewGroup, (t) obj);
    }

    @Override // androidx.fragment.app.z1
    public final boolean g(Object obj) {
        return obj instanceof t;
    }

    @Override // androidx.fragment.app.z1
    public final Object h(Object obj) {
        if (obj != null) {
            return ((t) obj).clone();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [c8.w, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    @Override // androidx.fragment.app.z1
    public final Object i(ViewGroup viewGroup, Object obj) {
        t tVar = (t) obj;
        ArrayList arrayList = x.f2719c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (tVar.w()) {
            arrayList.add(viewGroup);
            t clone = tVar.clone();
            z zVar = new z();
            zVar.Q(clone);
            x.c(viewGroup, zVar);
            viewGroup.setTag(R.id.transition_current_scene, null);
            ?? obj2 = new Object();
            obj2.A = zVar;
            obj2.B = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj2);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj2);
            viewGroup.invalidate();
            q qVar = new q(zVar);
            zVar.f2713s0 = qVar;
            zVar.a(qVar);
            return zVar.f2713s0;
        }
        a0.j.h("The Transition must support seeking.");
        return null;
    }

    @Override // androidx.fragment.app.z1
    public final boolean l() {
        return true;
    }

    @Override // androidx.fragment.app.z1
    public final boolean m(Object obj) {
        boolean w10 = ((t) obj).w();
        if (!w10) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return w10;
    }

    @Override // androidx.fragment.app.z1
    public final Object n(Object obj, Object obj2, Object obj3) {
        t tVar = (t) obj;
        t tVar2 = (t) obj2;
        t tVar3 = (t) obj3;
        if (tVar != null && tVar2 != null) {
            z zVar = new z();
            zVar.Q(tVar);
            zVar.Q(tVar2);
            zVar.f2723z0 = false;
            tVar = zVar;
        } else if (tVar == null) {
            if (tVar2 != null) {
                tVar = tVar2;
            } else {
                tVar = null;
            }
        }
        if (tVar3 != null) {
            z zVar2 = new z();
            if (tVar != null) {
                zVar2.Q(tVar);
            }
            zVar2.Q(tVar3);
            return zVar2;
        }
        return tVar;
    }

    @Override // androidx.fragment.app.z1
    public final Object o(Object obj, Object obj2) {
        z zVar = new z();
        if (obj != null) {
            zVar.Q((t) obj);
        }
        zVar.Q((t) obj2);
        return zVar;
    }

    @Override // androidx.fragment.app.z1
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((t) obj).a(new k(view, arrayList));
    }

    @Override // androidx.fragment.app.z1
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((t) obj).a(new l(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.z1
    public final void r(Object obj, float f8) {
        q qVar = (q) obj;
        boolean z10 = qVar.f2681b;
        if (z10) {
            z zVar = qVar.f2687h;
            long j2 = zVar.f2712r0;
            long j10 = f8 * ((float) j2);
            if (j10 == 0) {
                j10 = 1;
            }
            if (j10 == j2) {
                j10 = j2 - 1;
            }
            if (qVar.f2684e == null) {
                long j11 = qVar.f2680a;
                if (j10 != j11 && z10) {
                    if (!qVar.f2682c) {
                        if (j10 == 0 && j11 > 0) {
                            j10 = -1;
                        } else if (j10 == j2 && j11 < j2) {
                            j10 = j2 + 1;
                        }
                        if (j10 != j11) {
                            zVar.H(j10, j11);
                            qVar.f2680a = j10;
                        }
                    }
                    c0 c0Var = qVar.f2685f;
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    int i2 = (c0Var.f2624b + 1) % 20;
                    c0Var.f2624b = i2;
                    ((long[]) c0Var.f2625c)[i2] = currentAnimationTimeMillis;
                    ((float[]) c0Var.f2626d)[i2] = (float) j10;
                    return;
                }
                return;
            }
            a0.j.p("setCurrentPlayTimeMillis() called after animation has been started");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k0.d] */
    @Override // androidx.fragment.app.z1
    public final void s(View view, Object obj) {
        if (view != null) {
            z1.j(view, new Rect());
            ((t) obj).J(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k0.d] */
    @Override // androidx.fragment.app.z1
    public final void t(Object obj, Rect rect) {
        ((t) obj).J(new Object());
    }

    @Override // androidx.fragment.app.z1
    public final void u(androidx.fragment.app.j0 j0Var, Object obj, u5.a aVar, Runnable runnable) {
        v(obj, aVar, null, runnable);
    }

    @Override // androidx.fragment.app.z1
    public final void v(Object obj, u5.a aVar, androidx.fragment.app.x xVar, Runnable runnable) {
        t tVar = (t) obj;
        i iVar = new i(xVar, tVar, runnable);
        synchronized (aVar) {
            while (aVar.f13488c) {
                try {
                    try {
                        aVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (aVar.f13487b != iVar) {
                aVar.f13487b = iVar;
                if (aVar.f13486a) {
                    Runnable runnable2 = (Runnable) iVar.B;
                    t tVar2 = (t) iVar.R;
                    Runnable runnable3 = (Runnable) iVar.L;
                    if (runnable2 == null) {
                        tVar2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        tVar.a(new m(runnable));
    }

    @Override // androidx.fragment.app.z1
    public final void w(Object obj, View view, ArrayList arrayList) {
        z zVar = (z) obj;
        ArrayList arrayList2 = zVar.Y;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            z1.f(arrayList2, (View) arrayList.get(i2));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(zVar, arrayList);
    }

    @Override // androidx.fragment.app.z1
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        z zVar = (z) obj;
        if (zVar != null) {
            ArrayList arrayList3 = zVar.Y;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(zVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.z1
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        z zVar = new z();
        zVar.Q((t) obj);
        return zVar;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int size;
        t tVar = (t) obj;
        int i2 = 0;
        if (tVar instanceof z) {
            z zVar = (z) tVar;
            int size2 = zVar.f2722y0.size();
            while (i2 < size2) {
                z(zVar.R(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (z1.k(tVar.X)) {
            ArrayList arrayList3 = tVar.Y;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i2 < size) {
                    tVar.b((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    tVar.E((View) arrayList.get(size3));
                }
            }
        }
    }
}
