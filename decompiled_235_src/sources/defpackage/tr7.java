package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tr7  reason: default package */
/* loaded from: classes.dex */
public final class tr7 extends HandlerThread {
    public volatile sk1 A;
    public volatile boolean B;
    public boolean L;
    public final wr7 R;
    public final /* synthetic */ xr7 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, wr7] */
    public tr7(xr7 xr7Var) {
        super("VulkanPresentThread");
        this.X = xr7Var;
        this.B = true;
        this.R = new Object();
    }

    public static final void a(tr7 tr7Var, EmulatorSurfaceView emulatorSurfaceView, Surface surface, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        VulkanPresentationConfig vulkanPresentationConfig;
        if (tr7Var.B && surface != null) {
            xr7 xr7Var = tr7Var.X;
            synchronized (xr7Var.c) {
                ur7 ur7Var = (ur7) xr7Var.d.get(emulatorSurfaceView);
                z = true;
                i3 = 0;
                if (ur7Var != null && ur7Var.a == 0 && ur7Var.e == surface) {
                    if (emulatorSurfaceView.getCurrentSurface() == surface) {
                        z2 = true;
                    }
                }
                z2 = false;
            }
            if (z2) {
                MelonEmulator melonEmulator = MelonEmulator.a;
                int attachVulkanSurface = melonEmulator.attachVulkanSurface(surface, i, i2);
                xr7 xr7Var2 = tr7Var.X;
                synchronized (xr7Var2.c) {
                    ur7 ur7Var2 = (ur7) xr7Var2.d.get(emulatorSurfaceView);
                    if (ur7Var2 != null && ur7Var2.e == surface && emulatorSurfaceView.getCurrentSurface() == surface) {
                        ur7Var2.e = null;
                        ur7Var2.a = attachVulkanSurface;
                        vulkanPresentationConfig = ur7Var2.b;
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
                    tr7Var.X.f(emulatorSurfaceView);
                }
            }
        }
    }

    public static final void b(tr7 tr7Var, EmulatorSurfaceView emulatorSurfaceView, int i, Bitmap bitmap) {
        int i2;
        int i3;
        vr7 vr7Var;
        if (!tr7Var.B) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        xr7 xr7Var = tr7Var.X;
        synchronized (xr7Var.c) {
            try {
                ur7 ur7Var = (ur7) xr7Var.d.get(emulatorSurfaceView);
                if (ur7Var != null) {
                    i2 = ur7Var.a;
                } else {
                    i2 = 0;
                }
                if (ur7Var != null) {
                    i3 = ur7Var.d;
                } else {
                    i3 = -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xr7 xr7Var2 = tr7Var.X;
        synchronized (xr7Var2.c) {
            vr7Var = (vr7) xr7Var2.e.get(emulatorSurfaceView);
        }
        if (i2 != 0 && i3 == i && vr7Var != null && vr7Var.a == i) {
            xr7 xr7Var3 = tr7Var.X;
            synchronized (xr7Var3.c) {
                vr7 vr7Var2 = (vr7) xr7Var3.e.get(emulatorSurfaceView);
                if (vr7Var2 != null && vr7Var2.a == i) {
                    xr7Var3.e.remove(emulatorSurfaceView);
                }
            }
            VulkanPresentationConfig vulkanPresentationConfig = vr7Var.b;
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
        sk1 sk1Var = this.A;
        if (sk1Var != null) {
            if (sk1Var.getLooper().getThread().isAlive()) {
                return sk1Var;
            }
            if (this.A == sk1Var) {
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
        this.A = new sk1(this, getLooper(), 5);
    }
}
