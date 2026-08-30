package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.List;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dd7  reason: default package */
/* loaded from: classes.dex */
public final class dd7 implements oh2, xt1 {
    public final EmulatorActivity a;
    public final g11 b;
    public final Object c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final zc7 f;
    public volatile boolean g;

    public dd7(EmulatorActivity emulatorActivity) {
        this.a = emulatorActivity;
        mi6 c = hi2.c();
        bb1 bb1Var = tg1.a;
        this.b = iq2.c(se.O(c, bt3.a.Y));
        this.c = new Object();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        zc7 zc7Var = new zc7(this);
        this.f = zc7Var;
        zc7Var.start();
    }

    @Override // defpackage.oh2
    public final void a(Long l) {
        Handler c;
        long j;
        if (!this.g) {
            zc7 zc7Var = this.f;
            if (!zc7Var.B || (c = zc7Var.c()) == null) {
                return;
            }
            c.removeMessages(5);
            Message obtainMessage = c.obtainMessage(5);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            obtainMessage.setData(dk7.k(new ti4("frame-deadline", Long.valueOf(j))));
            try {
                c.sendMessage(obtainMessage);
            } catch (IllegalStateException unused) {
                if (zc7Var.A == c) {
                    c.removeCallbacksAndMessages(null);
                    zc7Var.A = null;
                }
                obtainMessage.recycle();
            }
        }
    }

    @Override // defpackage.oh2
    public final void b(EmulatorSurfaceView emulatorSurfaceView) {
        int i;
        emulatorSurfaceView.getClass();
        emulatorSurfaceView.setSurfaceLifecycleListener(null);
        if (this.g) {
            return;
        }
        synchronized (this.c) {
            this.e.remove(emulatorSurfaceView);
            ad7 ad7Var = (ad7) this.d.remove(emulatorSurfaceView);
            if (ad7Var != null) {
                ad7Var.e = null;
                i = ad7Var.a;
            } else {
                i = 0;
            }
        }
        this.f.d(i);
    }

    @Override // defpackage.oh2
    public final void d(EmulatorSurfaceView emulatorSurfaceView, VulkanPresentationConfig vulkanPresentationConfig, bs5 bs5Var) {
        int i;
        int i2;
        Integer valueOf;
        Surface currentSurface;
        Integer valueOf2;
        Integer valueOf3;
        emulatorSurfaceView.getClass();
        bs5Var.getClass();
        if (this.g) {
            return;
        }
        synchronized (this.c) {
            try {
                LinkedHashMap linkedHashMap = this.d;
                Object obj = linkedHashMap.get(emulatorSurfaceView);
                if (obj == null) {
                    obj = new ad7();
                    linkedHashMap.put(emulatorSurfaceView, obj);
                }
                ad7 ad7Var = (ad7) obj;
                ad7Var.b = vulkanPresentationConfig;
                ad7Var.c = bs5Var;
                i = ad7Var.d + 1;
                ad7Var.d = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.c) {
            try {
                ad7 ad7Var2 = (ad7) this.d.get(emulatorSurfaceView);
                ti4 currentSurfaceSize = emulatorSurfaceView.getCurrentSurfaceSize();
                int intValue = ((Number) currentSurfaceSize.A).intValue();
                int intValue2 = ((Number) currentSurfaceSize.B).intValue();
                if (ad7Var2 != null) {
                    i2 = ad7Var2.a;
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
        tq5.w(this.b, null, null, new nr1(this, emulatorSurfaceView, i, vulkanPresentationConfig, bs5Var, (j11) null), 3);
    }

    @Override // defpackage.oh2
    public final void e(EmulatorSurfaceView emulatorSurfaceView) {
        if (!this.g) {
            synchronized (this.c) {
                ad7 ad7Var = (ad7) this.d.putIfAbsent(emulatorSurfaceView, new ad7());
            }
            emulatorSurfaceView.setSurfaceLifecycleListener(this);
            Surface currentSurface = emulatorSurfaceView.getCurrentSurface();
            if (currentSurface != null) {
                ti4 currentSurfaceSize = emulatorSurfaceView.getCurrentSurfaceSize();
                g(emulatorSurfaceView, currentSurface, ((Number) currentSurfaceSize.A).intValue(), ((Number) currentSurfaceSize.B).intValue());
                f(emulatorSurfaceView);
            }
        }
    }

    public final void f(EmulatorSurfaceView emulatorSurfaceView) {
        ad7 ad7Var;
        if (!this.g) {
            synchronized (this.c) {
                ad7 ad7Var2 = (ad7) this.d.get(emulatorSurfaceView);
                if (ad7Var2 != null) {
                    int i = ad7Var2.a;
                    VulkanPresentationConfig vulkanPresentationConfig = ad7Var2.b;
                    bs5 bs5Var = ad7Var2.c;
                    int i2 = ad7Var2.d;
                    Surface surface = ad7Var2.e;
                    bs5Var.getClass();
                    ad7Var = new ad7(i, vulkanPresentationConfig, bs5Var, i2, surface);
                } else {
                    ad7Var = null;
                }
            }
            if (ad7Var == null) {
                return;
            }
            d(emulatorSurfaceView, ad7Var.b, ad7Var.c);
        }
    }

    public final void g(EmulatorSurfaceView emulatorSurfaceView, Surface surface, int i, int i2) {
        boolean z;
        Handler c;
        if (!this.g) {
            synchronized (this.c) {
                ad7 ad7Var = (ad7) this.d.get(emulatorSurfaceView);
                z = false;
                if (ad7Var != null && ad7Var.a == 0 && ad7Var.e == null) {
                    ad7Var.e = surface;
                    z = true;
                }
            }
            if (z) {
                zc7 zc7Var = this.f;
                zc7Var.getClass();
                emulatorSurfaceView.getClass();
                surface.getClass();
                if (zc7Var.B && (c = zc7Var.c()) != null) {
                    Message obtainMessage = c.obtainMessage(1, emulatorSurfaceView);
                    obtainMessage.setData(dk7.k(new ti4("surface", surface), new ti4("width", Integer.valueOf(i)), new ti4("height", Integer.valueOf(i2))));
                    try {
                        c.sendMessage(obtainMessage);
                    } catch (IllegalStateException unused) {
                        if (zc7Var.A == c) {
                            c.removeCallbacksAndMessages(null);
                            zc7Var.A = null;
                        }
                        obtainMessage.recycle();
                    }
                }
            }
        }
    }

    @Override // defpackage.oh2
    public final void stop() {
        List<EmulatorSurfaceView> n1;
        if (this.g) {
            return;
        }
        this.g = true;
        synchronized (this.c) {
            n1 = tq0.n1(this.d.keySet());
        }
        for (EmulatorSurfaceView emulatorSurfaceView : n1) {
            emulatorSurfaceView.setSurfaceLifecycleListener(null);
        }
        iq2.f(this.b, null);
        zc7 zc7Var = this.f;
        zc7Var.B = false;
        Handler c = zc7Var.c();
        if (c != null) {
            try {
                c.sendMessageAtFrontOfQueue(Message.obtain(c, 6));
            } catch (IllegalStateException unused) {
                if (zc7Var.A == c) {
                    c.removeCallbacksAndMessages(null);
                    zc7Var.A = null;
                }
            }
        }
        this.f.quitSafely();
        this.f.join();
    }
}
