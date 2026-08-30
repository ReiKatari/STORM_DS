package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pc6  reason: default package */
/* loaded from: classes.dex */
public final class pc6 {
    public static final qm1 p = new qm1(1);
    public static final qm1 q = new qm1(2);
    public static final qm1 r = new qm1(3);
    public static final qm1 s = new qm1(4);
    public static final qm1 t = new qm1(5);
    public static final qm1 u = new qm1(0);
    public float a;
    public float b;
    public boolean c;
    public final l36 d;
    public final mh7 e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public qc6 m;
    public float n;
    public boolean o;

    public pc6(l36 l36Var, mh7 mh7Var) {
        this.a = RecyclerView.A1;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = l36Var;
        this.e = mh7Var;
        if (mh7Var != r && mh7Var != s && mh7Var != t) {
            if (mh7Var == u) {
                this.j = 0.00390625f;
            } else if (mh7Var != p && mh7Var != q) {
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

    public static co b() {
        ThreadLocal threadLocal = co.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new co(new q03(7)));
        }
        return (co) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, ao] */
    public final void a(float f) {
        float durationScale;
        if (this.f) {
            this.n = f;
            return;
        }
        if (this.m == null) {
            this.m = new qc6(f);
        }
        qc6 qc6Var = this.m;
        double d = f;
        qc6Var.i = d;
        double d2 = (float) d;
        if (d2 <= this.g) {
            if (d2 >= this.h) {
                double abs = Math.abs(this.j * 0.75f);
                qc6Var.d = abs;
                qc6Var.e = abs * 62.5d;
                q03 q03Var = b().e;
                q03Var.getClass();
                if (Thread.currentThread() == ((Looper) q03Var.L).getThread()) {
                    boolean z = this.f;
                    if (!z && !z) {
                        this.f = true;
                        if (!this.c) {
                            this.b = this.e.P(this.d);
                        }
                        float f2 = this.b;
                        if (f2 <= this.g && f2 >= this.h) {
                            co b = b();
                            ArrayList arrayList = b.b;
                            if (arrayList.size() == 0) {
                                ((Choreographer) b.e.B).postFrameCallback(new bo(0, b.d));
                                if (Build.VERSION.SDK_INT >= 33) {
                                    durationScale = ValueAnimator.getDurationScale();
                                    b.g = durationScale;
                                    if (b.h == null) {
                                        b.h = new q03(6, b);
                                    }
                                    final q03 q03Var2 = b.h;
                                    if (((ao) q03Var2.B) == null) {
                                        ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: ao
                                            public final void onChanged(float f3) {
                                                ((co) q03.this.L).g = f3;
                                            }
                                        };
                                        q03Var2.B = r1;
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
                        i.i("Starting value need to be in between min value and max value");
                        return;
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            vd6.i("Final position of the spring cannot be less than the min value.");
            return;
        }
        vd6.i("Final position of the spring cannot be greater than the max value.");
    }

    public final void c(float f) {
        ArrayList arrayList;
        this.e.e0(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                dx6 dx6Var = (dx6) arrayList.get(i);
                float f2 = this.b;
                tx6 tx6Var = dx6Var.h;
                long max = Math.max(-1L, Math.min(tx6Var.s0 + 1, Math.round(f2)));
                tx6Var.H(max, dx6Var.a);
                dx6Var.a = max;
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
            q03 q03Var = b().e;
            q03Var.getClass();
            if (Thread.currentThread() == ((Looper) q03Var.L).getThread()) {
                if (this.f) {
                    this.o = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        vd6.i("Spring animations can only come to an end when there is damping");
    }

    public pc6(n92 n92Var) {
        this.a = RecyclerView.A1;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new rm1(n92Var);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }
}
