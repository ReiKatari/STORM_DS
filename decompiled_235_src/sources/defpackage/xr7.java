package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.List;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xr7  reason: default package */
/* loaded from: classes.dex */
public final class xr7 implements om2, iy1 {
    public final EmulatorActivity a;
    public final o41 b;
    public final Object c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final tr7 f;
    public volatile boolean g;

    public xr7(EmulatorActivity emulatorActivity) {
        this.a = emulatorActivity;
        gu6 c = oi2.c();
        xe1 xe1Var = xk1.a;
        this.b = g04.i(jw2.y(c, e04.a.Y));
        this.c = new Object();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        tr7 tr7Var = new tr7(this);
        this.f = tr7Var;
        tr7Var.start();
    }

    @Override // defpackage.om2
    public final void a(Long l) {
        Handler c;
        long j;
        if (!this.g) {
            tr7 tr7Var = this.f;
            if (!tr7Var.B || (c = tr7Var.c()) == null) {
                return;
            }
            c.removeMessages(5);
            Message obtainMessage = c.obtainMessage(5);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            obtainMessage.setData(jw2.l(new vr4("frame-deadline", Long.valueOf(j))));
            try {
                c.sendMessage(obtainMessage);
            } catch (IllegalStateException unused) {
                if (tr7Var.A == c) {
                    c.removeCallbacksAndMessages(null);
                    tr7Var.A = null;
                }
                obtainMessage.recycle();
            }
        }
    }

    @Override // defpackage.om2
    public final void c(EmulatorSurfaceView emulatorSurfaceView) {
        if (!this.g) {
            synchronized (this.c) {
                ur7 ur7Var = (ur7) this.d.putIfAbsent(emulatorSurfaceView, new ur7());
            }
            emulatorSurfaceView.setSurfaceLifecycleListener(this);
            Surface currentSurface = emulatorSurfaceView.getCurrentSurface();
            if (currentSurface != null) {
                vr4 currentSurfaceSize = emulatorSurfaceView.getCurrentSurfaceSize();
                g(emulatorSurfaceView, currentSurface, ((Number) currentSurfaceSize.A).intValue(), ((Number) currentSurfaceSize.B).intValue());
                f(emulatorSurfaceView);
            }
        }
    }

    @Override // defpackage.om2
    public final void d(EmulatorSurfaceView emulatorSurfaceView) {
        int i;
        emulatorSurfaceView.getClass();
        emulatorSurfaceView.setSurfaceLifecycleListener(null);
        if (this.g) {
            return;
        }
        synchronized (this.c) {
            this.e.remove(emulatorSurfaceView);
            ur7 ur7Var = (ur7) this.d.remove(emulatorSurfaceView);
            if (ur7Var != null) {
                ur7Var.e = null;
                i = ur7Var.a;
            } else {
                i = 0;
            }
        }
        this.f.d(i);
    }

    @Override // defpackage.om2
    public final void e(EmulatorSurfaceView emulatorSurfaceView, VulkanPresentationConfig vulkanPresentationConfig, t26 t26Var) {
        int i;
        int i2;
        Integer valueOf;
        Surface currentSurface;
        Integer valueOf2;
        Integer valueOf3;
        emulatorSurfaceView.getClass();
        t26Var.getClass();
        if (this.g) {
            return;
        }
        synchronized (this.c) {
            try {
                LinkedHashMap linkedHashMap = this.d;
                Object obj = linkedHashMap.get(emulatorSurfaceView);
                if (obj == null) {
                    obj = new ur7();
                    linkedHashMap.put(emulatorSurfaceView, obj);
                }
                ur7 ur7Var = (ur7) obj;
                ur7Var.b = vulkanPresentationConfig;
                ur7Var.c = t26Var;
                i = ur7Var.d + 1;
                ur7Var.d = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.c) {
            try {
                ur7 ur7Var2 = (ur7) this.d.get(emulatorSurfaceView);
                vr4 currentSurfaceSize = emulatorSurfaceView.getCurrentSurfaceSize();
                int intValue = ((Number) currentSurfaceSize.A).intValue();
                int intValue2 = ((Number) currentSurfaceSize.B).intValue();
                if (ur7Var2 != null) {
                    i2 = ur7Var2.a;
                } else {
                    i2 = 0;
                }
                valueOf = Integer.valueOf(i2);
                currentSurface = emulatorSurfaceView.getCurrentSurface();
                valueOf2 = Integer.valueOf(intValue);
                valueOf3 = Integer.valueOf(intValue2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int intValue3 = valueOf.intValue();
        int intValue4 = valueOf2.intValue();
        int intValue5 = valueOf3.intValue();
        if (intValue3 == 0 && currentSurface != null) {
            g(emulatorSurfaceView, currentSurface, intValue4, intValue5);
        }
        hv.L(this.b, null, null, new zv1(this, emulatorSurfaceView, i, vulkanPresentationConfig, t26Var, (r41) null), 3);
    }

    public final void f(EmulatorSurfaceView emulatorSurfaceView) {
        ur7 ur7Var;
        if (!this.g) {
            synchronized (this.c) {
                ur7 ur7Var2 = (ur7) this.d.get(emulatorSurfaceView);
                if (ur7Var2 != null) {
                    int i = ur7Var2.a;
                    VulkanPresentationConfig vulkanPresentationConfig = ur7Var2.b;
                    t26 t26Var = ur7Var2.c;
                    int i2 = ur7Var2.d;
                    Surface surface = ur7Var2.e;
                    t26Var.getClass();
                    ur7Var = new ur7(i, vulkanPresentationConfig, t26Var, i2, surface);
                } else {
                    ur7Var = null;
                }
            }
            if (ur7Var == null) {
                return;
            }
            e(emulatorSurfaceView, ur7Var.b, ur7Var.c);
        }
    }

    public final void g(EmulatorSurfaceView emulatorSurfaceView, Surface surface, int i, int i2) {
        boolean z;
        Handler c;
        if (!this.g) {
            synchronized (this.c) {
                ur7 ur7Var = (ur7) this.d.get(emulatorSurfaceView);
                z = false;
                if (ur7Var != null && ur7Var.a == 0 && ur7Var.e == null) {
                    ur7Var.e = surface;
                    z = true;
                }
            }
            if (z) {
                tr7 tr7Var = this.f;
                tr7Var.getClass();
                emulatorSurfaceView.getClass();
                surface.getClass();
                if (tr7Var.B && (c = tr7Var.c()) != null) {
                    Message obtainMessage = c.obtainMessage(1, emulatorSurfaceView);
                    obtainMessage.setData(jw2.l(new vr4("surface", surface), new vr4("width", Integer.valueOf(i)), new vr4("height", Integer.valueOf(i2))));
                    try {
                        c.sendMessage(obtainMessage);
                    } catch (IllegalStateException unused) {
                        if (tr7Var.A == c) {
                            c.removeCallbacksAndMessages(null);
                            tr7Var.A = null;
                        }
                        obtainMessage.recycle();
                    }
                }
            }
        }
    }

    @Override // defpackage.om2
    public final void stop() {
        List<EmulatorSurfaceView> k1;
        if (this.g) {
            return;
        }
        this.g = true;
        synchronized (this.c) {
            k1 = gt0.k1(this.d.keySet());
        }
        for (EmulatorSurfaceView emulatorSurfaceView : k1) {
            emulatorSurfaceView.setSurfaceLifecycleListener(null);
        }
        g04.x(this.b, null);
        tr7 tr7Var = this.f;
        tr7Var.B = false;
        Handler c = tr7Var.c();
        if (c != null) {
            try {
                c.sendMessageAtFrontOfQueue(Message.obtain(c, 6));
            } catch (IllegalStateException unused) {
                if (tr7Var.A == c) {
                    c.removeCallbacksAndMessages(null);
                    tr7Var.A = null;
                }
            }
        }
        this.f.quitSafely();
        this.f.join();
    }
}
