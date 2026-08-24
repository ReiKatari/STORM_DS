package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
import java.util.function.Consumer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dx0  reason: default package */
/* loaded from: classes.dex */
public final class dx0 implements ScrollCaptureCallback {
    public final xa6 a;
    public final m93 b;
    public final s35 c;
    public final te d;
    public final o41 e;
    public final fy2 f;

    public dx0(xa6 xa6Var, m93 m93Var, o41 o41Var, s35 s35Var, te teVar) {
        this.a = xa6Var;
        this.b = m93Var;
        this.c = s35Var;
        this.d = teVar;
        this.e = new o41(o41Var.B.N(ak1.B));
        this.f = new fy2(m93Var.a(), new qc(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(dx0 dx0Var, ScrollCaptureSession scrollCaptureSession, m93 m93Var, s41 s41Var) {
        cx0 cx0Var;
        x61 x61Var;
        int i;
        int i2;
        int i3;
        ne neVar;
        l61 l61Var;
        ScrollCaptureSession scrollCaptureSession2;
        m93 m93Var2;
        int i4;
        int i5;
        int q;
        int q2;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (s41Var instanceof cx0) {
            cx0Var = (cx0) s41Var;
            int i6 = cx0Var.f0;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cx0Var.f0 = i6 - Integer.MIN_VALUE;
                Object obj = cx0Var.d0;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = cx0Var.f0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            i5 = cx0Var.Z;
                            i4 = cx0Var.Y;
                            m93Var2 = cx0Var.X;
                            scrollCaptureSession2 = sd0.n(cx0Var.R);
                            oi2.Y(obj);
                            fy2 fy2Var = dx0Var.f;
                            q = gi2.q(i4 - u24.E(fy2Var.b), 0, fy2Var.a);
                            fy2 fy2Var2 = dx0Var.f;
                            q2 = gi2.q(i5 - u24.E(fy2Var2.b), 0, fy2Var2.a);
                            int i7 = m93Var2.a;
                            int i8 = m93Var2.c;
                            if (q == q2) {
                                surface = scrollCaptureSession2.getSurface();
                                Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                                try {
                                    lockHardwareCanvas.save();
                                    lockHardwareCanvas.translate(-i7, -q);
                                    m93 m93Var3 = dx0Var.b;
                                    lockHardwareCanvas.translate(-m93Var3.a, -m93Var3.b);
                                    dx0Var.d.getRootView().draw(lockHardwareCanvas);
                                    surface3 = scrollCaptureSession2.getSurface();
                                    surface3.unlockCanvasAndPost(lockHardwareCanvas);
                                    int E = u24.E(dx0Var.f.b);
                                    return new m93(i7, q + E, i8, q2 + E);
                                } catch (Throwable th) {
                                    surface2 = scrollCaptureSession2.getSurface();
                                    surface2.unlockCanvasAndPost(lockHardwareCanvas);
                                    throw th;
                                }
                            }
                            return m93.e;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i9 = cx0Var.Z;
                    int i10 = cx0Var.Y;
                    m93 m93Var4 = cx0Var.X;
                    ScrollCaptureSession n = sd0.n(cx0Var.R);
                    oi2.Y(obj);
                    i2 = i10;
                    m93Var = m93Var4;
                    i3 = i9;
                    scrollCaptureSession = n;
                } else {
                    oi2.Y(obj);
                    i2 = m93Var.b;
                    i3 = m93Var.d;
                    fy2 fy2Var3 = dx0Var.f;
                    cx0Var.R = scrollCaptureSession;
                    cx0Var.X = m93Var;
                    cx0Var.Y = i2;
                    cx0Var.Z = i3;
                    cx0Var.f0 = 1;
                    int i11 = fy2Var3.a;
                    if (i2 <= i3) {
                        int i12 = i3 - i2;
                        if (i12 <= i11) {
                            float f = fy2Var3.b;
                            int i13 = (i2 > f ? 1 : (i2 == f ? 0 : -1));
                            Object obj2 = jg7.a;
                            if (i13 < 0 || i3 > i11 + f) {
                                Object b = fy2Var3.b((((i12 / 2) + i2) - (i11 / 2)) - f, cx0Var);
                                if (b != x61Var) {
                                    b = obj2;
                                }
                                if (b == x61Var) {
                                    obj2 = b;
                                }
                            }
                        } else {
                            i.f(lb1.j("Expected range (", i12, i11, ") to be ≤ viewportSize="));
                            return null;
                        }
                    } else {
                        i.f(lb1.j("Expected min=", i2, i3, " ≤ max="));
                        return null;
                    }
                }
                neVar = ne.o0;
                cx0Var.R = scrollCaptureSession;
                cx0Var.X = m93Var;
                cx0Var.Y = i2;
                cx0Var.Z = i3;
                cx0Var.f0 = 2;
                l61Var = cx0Var.B;
                l61Var.getClass();
                if (ii2.x(l61Var).a(neVar, cx0Var) != x61Var) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    m93Var2 = m93Var;
                    i4 = i2;
                    i5 = i3;
                    fy2 fy2Var4 = dx0Var.f;
                    q = gi2.q(i4 - u24.E(fy2Var4.b), 0, fy2Var4.a);
                    fy2 fy2Var22 = dx0Var.f;
                    q2 = gi2.q(i5 - u24.E(fy2Var22.b), 0, fy2Var22.a);
                    int i72 = m93Var2.a;
                    int i82 = m93Var2.c;
                    if (q == q2) {
                    }
                }
                return x61Var;
            }
        }
        cx0Var = new cx0(dx0Var, s41Var);
        Object obj3 = cx0Var.d0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = cx0Var.f0;
        if (i == 0) {
        }
        neVar = ne.o0;
        cx0Var.R = scrollCaptureSession;
        cx0Var.X = m93Var;
        cx0Var.Y = i2;
        cx0Var.Z = i3;
        cx0Var.f0 = 2;
        l61Var = cx0Var.B;
        l61Var.getClass();
        if (ii2.x(l61Var).a(neVar, cx0Var) != x61Var) {
        }
        return x61Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        hv.L(this.e, kg4.B, null, new z(this, runnable, null, 23), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        ap6 L = hv.L(this.e, null, null, new l5(this, scrollCaptureSession, rect, consumer, null, 5), 3);
        L.a0(new mc(cancellationSignal, 9));
        cancellationSignal.setOnCancelListener(new ex0(L, 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(ej2.Z(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = RecyclerView.B1;
        ((vs4) this.c.A).setValue(Boolean.TRUE);
        runnable.run();
    }
}
