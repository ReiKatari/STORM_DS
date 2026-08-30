package l6;

import a0.j;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import c8.q;
import c8.z;
import java.util.ArrayList;
import k7.w;
import m9.o;
import na.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: p  reason: collision with root package name */
    public static final d f8938p = new d(1);

    /* renamed from: q  reason: collision with root package name */
    public static final d f8939q = new d(2);

    /* renamed from: r  reason: collision with root package name */
    public static final d f8940r = new d(3);

    /* renamed from: s  reason: collision with root package name */
    public static final d f8941s = new d(4);

    /* renamed from: t  reason: collision with root package name */
    public static final d f8942t = new d(5);

    /* renamed from: u  reason: collision with root package name */
    public static final d f8943u = new d(0);

    /* renamed from: a  reason: collision with root package name */
    public float f8944a;

    /* renamed from: b  reason: collision with root package name */
    public float f8945b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8946c;

    /* renamed from: d  reason: collision with root package name */
    public final y f8947d;

    /* renamed from: e  reason: collision with root package name */
    public final w f8948e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8949f;

    /* renamed from: g  reason: collision with root package name */
    public float f8950g;

    /* renamed from: h  reason: collision with root package name */
    public float f8951h;

    /* renamed from: i  reason: collision with root package name */
    public long f8952i;

    /* renamed from: j  reason: collision with root package name */
    public float f8953j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f8954k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f8955l;
    public g m;

    /* renamed from: n  reason: collision with root package name */
    public float f8956n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8957o;

    public f(y yVar, w wVar) {
        this.f8944a = 0.0f;
        this.f8945b = Float.MAX_VALUE;
        this.f8946c = false;
        this.f8949f = false;
        this.f8950g = Float.MAX_VALUE;
        this.f8951h = -3.4028235E38f;
        this.f8952i = 0L;
        this.f8954k = new ArrayList();
        this.f8955l = new ArrayList();
        this.f8947d = yVar;
        this.f8948e = wVar;
        if (wVar != f8940r && wVar != f8941s && wVar != f8942t) {
            if (wVar == f8943u) {
                this.f8953j = 0.00390625f;
            } else if (wVar != f8938p && wVar != f8939q) {
                this.f8953j = 1.0f;
            } else {
                this.f8953j = 0.002f;
            }
        } else {
            this.f8953j = 0.1f;
        }
        this.m = null;
        this.f8956n = Float.MAX_VALUE;
        this.f8957o = false;
    }

    public static c b() {
        ThreadLocal threadLocal = c.f8927i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new jb.c(8)));
        }
        return (c) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, l6.a] */
    public final void a(float f8) {
        if (this.f8949f) {
            this.f8956n = f8;
            return;
        }
        if (this.m == null) {
            this.m = new g(f8);
        }
        g gVar = this.m;
        double d4 = f8;
        gVar.f8966i = d4;
        double d10 = (float) d4;
        if (d10 <= this.f8950g) {
            if (d10 >= this.f8951h) {
                double abs = Math.abs(this.f8953j * 0.75f);
                gVar.f8961d = abs;
                gVar.f8962e = abs * 62.5d;
                jb.c cVar = b().f8932e;
                cVar.getClass();
                if (Thread.currentThread() == ((Looper) cVar.L).getThread()) {
                    boolean z10 = this.f8949f;
                    if (!z10 && !z10) {
                        this.f8949f = true;
                        if (!this.f8946c) {
                            this.f8945b = this.f8948e.u(this.f8947d);
                        }
                        float f10 = this.f8945b;
                        if (f10 <= this.f8950g && f10 >= this.f8951h) {
                            c b10 = b();
                            ArrayList arrayList = b10.f8929b;
                            if (arrayList.size() == 0) {
                                ((Choreographer) b10.f8932e.B).postFrameCallback(new b(b10.f8931d, 0));
                                if (Build.VERSION.SDK_INT >= 33) {
                                    b10.f8934g = b6.c.a();
                                    if (b10.f8935h == null) {
                                        b10.f8935h = new jb.c(b10);
                                    }
                                    final jb.c cVar2 = b10.f8935h;
                                    if (((a) cVar2.B) == null) {
                                        ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: l6.a
                                            public final void onChanged(float f11) {
                                                ((c) jb.c.this.L).f8934g = f11;
                                            }
                                        };
                                        cVar2.B = r12;
                                        b6.c.D(r12);
                                    }
                                }
                            }
                            if (!arrayList.contains(this)) {
                                arrayList.add(this);
                                return;
                            }
                            return;
                        }
                        j.h("Starting value need to be in between min value and max value");
                        return;
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            o.v("Final position of the spring cannot be less than the min value.");
            return;
        }
        o.v("Final position of the spring cannot be greater than the max value.");
    }

    public final void c(float f8) {
        ArrayList arrayList;
        this.f8948e.G(this.f8947d, f8);
        int i2 = 0;
        while (true) {
            arrayList = this.f8955l;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) != null) {
                q qVar = (q) arrayList.get(i2);
                float f10 = this.f8945b;
                z zVar = qVar.f2687h;
                long max = Math.max(-1L, Math.min(zVar.f2712r0 + 1, Math.round(f10)));
                zVar.H(max, qVar.f2680a);
                qVar.f2680a = max;
            }
            i2++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void d() {
        if (this.m.f8959b > 0.0d) {
            jb.c cVar = b().f8932e;
            cVar.getClass();
            if (Thread.currentThread() == ((Looper) cVar.L).getThread()) {
                if (this.f8949f) {
                    this.f8957o = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        o.v("Spring animations can only come to an end when there is damping");
    }

    public f(l1.e eVar) {
        this.f8944a = 0.0f;
        this.f8945b = Float.MAX_VALUE;
        this.f8946c = false;
        this.f8949f = false;
        this.f8950g = Float.MAX_VALUE;
        this.f8951h = -3.4028235E38f;
        this.f8952i = 0L;
        this.f8954k = new ArrayList();
        this.f8955l = new ArrayList();
        this.f8947d = null;
        this.f8948e = new e(eVar);
        this.f8953j = 1.0f;
        this.m = null;
        this.f8956n = Float.MAX_VALUE;
        this.f8957o = false;
    }
}
