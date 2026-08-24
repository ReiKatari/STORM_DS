package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jm2  reason: default package */
/* loaded from: classes.dex */
public class jm2 extends dm2 {
    @Override // defpackage.dm2
    public final void a(View view, Object obj) {
        ((ea7) obj).b(view);
    }

    @Override // defpackage.dm2
    public final void b(Object obj, ArrayList arrayList) {
        ea7 ea7Var = (ea7) obj;
        if (ea7Var != null) {
            int i = 0;
            if (ea7Var instanceof qa7) {
                qa7 qa7Var = (qa7) ea7Var;
                int size = qa7Var.A0.size();
                while (i < size) {
                    b(qa7Var.R(i), arrayList);
                    i++;
                }
            } else if (dm2.k(ea7Var.X) && dm2.k(ea7Var.Y)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    ea7Var.b((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // defpackage.dm2
    public final void c(Object obj) {
        ((z97) obj).g();
    }

    @Override // defpackage.dm2
    public final void d(Object obj, mf mfVar) {
        z97 z97Var = (z97) obj;
        z97Var.g = mfVar;
        if (!z97Var.b) {
            z97Var.d = 2;
            return;
        }
        z97Var.h();
        z97Var.e.a(RecyclerView.B1);
    }

    @Override // defpackage.dm2
    public final void e(ViewGroup viewGroup, Object obj) {
        oa7.a(viewGroup, (ea7) obj);
    }

    @Override // defpackage.dm2
    public final boolean g(Object obj) {
        return obj instanceof ea7;
    }

    @Override // defpackage.dm2
    public final Object h(Object obj) {
        if (obj != null) {
            return ((ea7) obj).clone();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [na7, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    @Override // defpackage.dm2
    public final Object i(ViewGroup viewGroup, Object obj) {
        ea7 ea7Var = (ea7) obj;
        ArrayList arrayList = oa7.c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (ea7Var.v()) {
                arrayList.add(viewGroup);
                ea7 clone = ea7Var.clone();
                qa7 qa7Var = new qa7();
                qa7Var.Q(clone);
                oa7.c(viewGroup, qa7Var);
                viewGroup.setTag(R.id.transition_current_scene, null);
                ?? obj2 = new Object();
                obj2.A = qa7Var;
                obj2.B = viewGroup;
                viewGroup.addOnAttachStateChangeListener(obj2);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(obj2);
                viewGroup.invalidate();
                z97 z97Var = new z97(qa7Var);
                qa7Var.u0 = z97Var;
                qa7Var.a(z97Var);
                return qa7Var.u0;
            }
            i.h("The Transition must support seeking.");
        }
        return null;
    }

    @Override // defpackage.dm2
    public final boolean l() {
        return true;
    }

    @Override // defpackage.dm2
    public final boolean m(Object obj) {
        boolean v = ((ea7) obj).v();
        if (!v) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return v;
    }

    @Override // defpackage.dm2
    public final Object n(Object obj, Object obj2, Object obj3) {
        ea7 ea7Var = (ea7) obj;
        ea7 ea7Var2 = (ea7) obj2;
        ea7 ea7Var3 = (ea7) obj3;
        if (ea7Var != null && ea7Var2 != null) {
            qa7 qa7Var = new qa7();
            qa7Var.Q(ea7Var);
            qa7Var.Q(ea7Var2);
            qa7Var.B0 = false;
            ea7Var = qa7Var;
        } else if (ea7Var == null) {
            if (ea7Var2 != null) {
                ea7Var = ea7Var2;
            } else {
                ea7Var = null;
            }
        }
        if (ea7Var3 != null) {
            qa7 qa7Var2 = new qa7();
            if (ea7Var != null) {
                qa7Var2.Q(ea7Var);
            }
            qa7Var2.Q(ea7Var3);
            return qa7Var2;
        }
        return ea7Var;
    }

    @Override // defpackage.dm2
    public final Object o(Object obj, Object obj2) {
        qa7 qa7Var = new qa7();
        if (obj != null) {
            qa7Var.Q((ea7) obj);
        }
        qa7Var.Q((ea7) obj2);
        return qa7Var;
    }

    @Override // defpackage.dm2
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((ea7) obj).a(new gm2(view, arrayList));
    }

    @Override // defpackage.dm2
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((ea7) obj).a(new hm2(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.dm2
    public final void r(Object obj, float f) {
        z97 z97Var = (z97) obj;
        boolean z = z97Var.b;
        if (z) {
            qa7 qa7Var = z97Var.h;
            long j = qa7Var.t0;
            long j2 = f * ((float) j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (z97Var.e == null) {
                long j3 = z97Var.a;
                if (j2 != j3 && z) {
                    if (!z97Var.c) {
                        if (j2 == 0 && j3 > 0) {
                            j2 = -1;
                        } else if (j2 == j && j3 < j) {
                            j2 = j + 1;
                        }
                        if (j2 != j3) {
                            qa7Var.H(j2, j3);
                            z97Var.a = j2;
                        }
                    }
                    ei eiVar = z97Var.f;
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    int i = (eiVar.B + 1) % 20;
                    eiVar.B = i;
                    ((long[]) eiVar.L)[i] = currentAnimationTimeMillis;
                    ((float[]) eiVar.R)[i] = (float) j2;
                    return;
                }
                return;
            }
            i.m("setCurrentPlayTimeMillis() called after animation has been started");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [yh2, java.lang.Object] */
    @Override // defpackage.dm2
    public final void s(View view, Object obj) {
        if (view != null) {
            dm2.j(view, new Rect());
            ((ea7) obj).J(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [yh2, java.lang.Object] */
    @Override // defpackage.dm2
    public final void t(Object obj, Rect rect) {
        ((ea7) obj).J(new Object());
    }

    @Override // defpackage.dm2
    public final void u(o oVar, Object obj, uj0 uj0Var, Runnable runnable) {
        v(obj, uj0Var, null, runnable);
    }

    @Override // defpackage.dm2
    public final void v(Object obj, uj0 uj0Var, n0 n0Var, Runnable runnable) {
        ea7 ea7Var = (ea7) obj;
        em2 em2Var = new em2(n0Var, ea7Var, runnable);
        synchronized (uj0Var) {
            while (uj0Var.c) {
                try {
                    try {
                        uj0Var.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (uj0Var.b != em2Var) {
                uj0Var.b = em2Var;
                if (uj0Var.a) {
                    Runnable runnable2 = (Runnable) em2Var.B;
                    ea7 ea7Var2 = (ea7) em2Var.R;
                    Runnable runnable3 = (Runnable) em2Var.L;
                    if (runnable2 == null) {
                        ea7Var2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        ea7Var.a(new im2(runnable));
    }

    @Override // defpackage.dm2
    public final void w(Object obj, View view, ArrayList arrayList) {
        qa7 qa7Var = (qa7) obj;
        ArrayList arrayList2 = qa7Var.Y;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dm2.f(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(qa7Var, arrayList);
    }

    @Override // defpackage.dm2
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        qa7 qa7Var = (qa7) obj;
        if (qa7Var != null) {
            ArrayList arrayList3 = qa7Var.Y;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(qa7Var, arrayList, arrayList2);
        }
    }

    @Override // defpackage.dm2
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        qa7 qa7Var = new qa7();
        qa7Var.Q((ea7) obj);
        return qa7Var;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int size;
        ea7 ea7Var = (ea7) obj;
        int i = 0;
        if (ea7Var instanceof qa7) {
            qa7 qa7Var = (qa7) ea7Var;
            int size2 = qa7Var.A0.size();
            while (i < size2) {
                z(qa7Var.R(i), arrayList, arrayList2);
                i++;
            }
        } else if (dm2.k(ea7Var.X)) {
            ArrayList arrayList3 = ea7Var.Y;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    ea7Var.b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    ea7Var.E((View) arrayList.get(size3));
                }
            }
        }
    }
}
