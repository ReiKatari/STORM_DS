package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zc7  reason: default package */
/* loaded from: classes.dex */
public final class zc7 extends HandlerThread {
    public volatile og1 A;
    public volatile boolean B;
    public boolean L;
    public final cd7 R;
    public final /* synthetic */ dd7 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v3, types: [cd7, java.lang.Object] */
    public zc7(dd7 dd7Var) {
        super("VulkanPresentThread");
        this.X = dd7Var;
        this.B = true;
        this.R = new Object();
    }

    public static final void a(zc7 zc7Var, EmulatorSurfaceView emulatorSurfaceView, Surface surface, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        VulkanPresentationConfig vulkanPresentationConfig;
        if (zc7Var.B && surface != null) {
            dd7 dd7Var = zc7Var.X;
            synchronized (dd7Var.c) {
                ad7 ad7Var = (ad7) dd7Var.d.get(emulatorSurfaceView);
                z = true;
                i3 = 0;
                if (ad7Var != null && ad7Var.a == 0 && ad7Var.e == surface) {
                    if (emulatorSurfaceView.getCurrentSurface() == surface) {
                        z2 = true;
                    }
                }
                z2 = false;
            }
            if (z2) {
                MelonEmulator melonEmulator = MelonEmulator.a;
                int attachVulkanSurface = melonEmulator.attachVulkanSurface(surface, i, i2);
                dd7 dd7Var2 = zc7Var.X;
                synchronized (dd7Var2.c) {
                    ad7 ad7Var2 = (ad7) dd7Var2.d.get(emulatorSurfaceView);
                    if (ad7Var2 != null && ad7Var2.e == surface && emulatorSurfaceView.getCurrentSurface() == surface) {
                        ad7Var2.e = null;
                        ad7Var2.a = attachVulkanSurface;
                        vulkanPresentationConfig = ad7Var2.b;
                        if (attachVulkanSurface == 0) {
                            z = false;
                        }
                    }
                    z = false;
                    vulkanPresentationConfig = null;
                    i3 = attachVulkanSurface;
                }
                if (i3 != 0) {
                    melonEmulator.detachVulkanSurface(i3);
                    return;
                }
                if (attachVulkanSurface != 0 && vulkanPresentationConfig != null) {
                    melonEmulator.configureVulkanSurface(attachVulkanSurface, vulkanPresentationConfig, null);
                }
                if (z) {
                    zc7Var.X.f(emulatorSurfaceView);
                }
            }
        }
    }

    public static final void b(zc7 zc7Var, EmulatorSurfaceView emulatorSurfaceView, int i, Bitmap bitmap) {
        int i2;
        int i3;
        bd7 bd7Var;
        if (!zc7Var.B) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        dd7 dd7Var = zc7Var.X;
        synchronized (dd7Var.c) {
            try {
                ad7 ad7Var = (ad7) dd7Var.d.get(emulatorSurfaceView);
                if (ad7Var != null) {
                    i2 = ad7Var.a;
                } else {
                    i2 = 0;
                }
                if (ad7Var != null) {
                    i3 = ad7Var.d;
                } else {
                    i3 = -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        dd7 dd7Var2 = zc7Var.X;
        synchronized (dd7Var2.c) {
            bd7Var = (bd7) dd7Var2.e.get(emulatorSurfaceView);
        }
        if (i2 != 0 && i3 == i && bd7Var != null && bd7Var.a == i) {
            dd7 dd7Var3 = zc7Var.X;
            synchronized (dd7Var3.c) {
                bd7 bd7Var2 = (bd7) dd7Var3.e.get(emulatorSurfaceView);
                if (bd7Var2 != null && bd7Var2.a == i) {
                    dd7Var3.e.remove(emulatorSurfaceView);
                }
            }
            VulkanPresentationConfig vulkanPresentationConfig = bd7Var.b;
            if (vulkanPresentationConfig == null) {
                if (bitmap != null) {
                    bitmap.recycle();
                    return;
                }
                return;
            }
            MelonEmulator.a.configureVulkanSurface(i2, vulkanPresentationConfig, bitmap);
            if (bitmap != null) {
                bitmap.recycle();
            }
        } else if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public final Handler c() {
        og1 og1Var = this.A;
        if (og1Var != null) {
            if (og1Var.getLooper().getThread().isAlive()) {
                return og1Var;
            }
            if (this.A == og1Var) {
                this.A = null;
            }
        }
        return null;
    }

    public final void d(int i) {
        Handler c;
        if (!this.B || i == 0 || (c = c()) == null) {
            return;
        }
        Message obtainMessage = c.obtainMessage(4, i, 0);
        try {
            c.sendMessage(obtainMessage);
        } catch (IllegalStateException unused) {
            if (this.A == c) {
                c.removeCallbacksAndMessages(null);
                this.A = null;
            }
            obtainMessage.recycle();
        }
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        this.A = new og1(this, getLooper(), 5);
    }
}
