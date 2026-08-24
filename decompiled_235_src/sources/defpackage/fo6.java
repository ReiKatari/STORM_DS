package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fo6  reason: default package */
/* loaded from: classes.dex */
public final class fo6 {
    public static final wq1 p = new wq1(1);
    public static final wq1 q = new wq1(2);
    public static final wq1 r = new wq1(3);
    public static final wq1 s = new wq1(4);
    public static final wq1 t = new wq1(5);
    public static final wq1 u = new wq1(0);
    public float a;
    public float b;
    public boolean c;
    public final xe6 d;
    public final jw2 e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public go6 m;
    public float n;
    public boolean o;

    public fo6(xe6 xe6Var, jw2 jw2Var) {
        this.a = RecyclerView.B1;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = xe6Var;
        this.e = jw2Var;
        if (jw2Var != r && jw2Var != s && jw2Var != t) {
            if (jw2Var == u) {
                this.j = 0.00390625f;
            } else if (jw2Var != p && jw2Var != q) {
                this.j = 1.0f;
            } else {
                this.j = 0.002f;
            }
        } else {
            this.j = 0.1f;
        }
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static po b() {
        ThreadLocal threadLocal = po.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new po(new u63(7)));
        }
        return (po) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [no, java.lang.Object] */
    public final void a(float f) {
        float durationScale;
        if (this.f) {
            this.n = f;
            return;
        }
        if (this.m == null) {
            this.m = new go6(f);
        }
        go6 go6Var = this.m;
        double d = f;
        go6Var.i = d;
        double d2 = (float) d;
        if (d2 <= this.g) {
            if (d2 >= this.h) {
                double abs = Math.abs(this.j * 0.75f);
                go6Var.d = abs;
                go6Var.e = abs * 62.5d;
                u63 u63Var = b().e;
                u63Var.getClass();
                if (Thread.currentThread() == ((Looper) u63Var.L).getThread()) {
                    boolean z = this.f;
                    if (!z && !z) {
                        this.f = true;
                        if (!this.c) {
                            this.b = this.e.t(this.d);
                        }
                        float f2 = this.b;
                        if (f2 <= this.g && f2 >= this.h) {
                            po b = b();
                            ArrayList arrayList = b.b;
                            if (arrayList.size() == 0) {
                                ((Choreographer) b.e.B).postFrameCallback(new oo(b.d, 0));
                                if (Build.VERSION.SDK_INT >= 33) {
                                    durationScale = ValueAnimator.getDurationScale();
                                    b.g = durationScale;
                                    if (b.h == null) {
                                        b.h = new u63(b, 6);
                                    }
                                    final u63 u63Var2 = b.h;
                                    if (((no) u63Var2.B) == null) {
                                        ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: no
                                            public final void onChanged(float f3) {
                                                ((po) u63.this.L).g = f3;
                                            }
                                        };
                                        u63Var2.B = r1;
                                        ValueAnimator.registerDurationScaleChangeListener(r1);
                                    }
                                }
                            }
                            if (!arrayList.contains(this)) {
                                arrayList.add(this);
                                return;
                            }
                            return;
                        }
                        i.h("Starting value need to be in between min value and max value");
                        return;
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            fa6.h("Final position of the spring cannot be less than the min value.");
            return;
        }
        fa6.h("Final position of the spring cannot be greater than the max value.");
    }

    public final void c(float f) {
        ArrayList arrayList;
        this.e.F(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                z97 z97Var = (z97) arrayList.get(i);
                float f2 = this.b;
                qa7 qa7Var = z97Var.h;
                long max = Math.max(-1L, Math.min(qa7Var.t0 + 1, Math.round(f2)));
                qa7Var.H(max, z97Var.a);
                z97Var.a = max;
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void d() {
        if (this.m.b > 0.0d) {
            u63 u63Var = b().e;
            u63Var.getClass();
            if (Thread.currentThread() == ((Looper) u63Var.L).getThread()) {
                if (this.f) {
                    this.o = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        fa6.h("Spring animations can only come to an end when there is damping");
    }

    public fo6(fe2 fe2Var) {
        this.a = RecyclerView.B1;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new xq1(fe2Var);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }
}
