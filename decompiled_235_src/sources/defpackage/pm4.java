package defpackage;

import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import me.magnum.melonds.MelonDSAndroidInterface;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
import me.magnum.melonds.ui.emulator.render.GlContext;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pm4  reason: default package */
/* loaded from: classes.dex */
public final class pm4 implements om2 {
    public final GlContext a;
    public final nm4 b;
    public final e25 c;
    public final Object d;
    public final ArrayList e;
    public final ArrayList f;
    public volatile boolean g;

    /* JADX WARN: Type inference failed for: r1v0, types: [e25, java.lang.Object] */
    public pm4() {
        nm4 nm4Var = new nm4(this);
        this.b = nm4Var;
        ?? obj = new Object();
        obj.a = false;
        obj.b = 0;
        this.c = obj;
        this.d = new Object();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.a = new GlContext(Long.valueOf(MelonDSAndroidInterface.a.getEmulatorGlContext()));
        nm4Var.start();
    }

    @Override // defpackage.om2
    public final void a(Long l) {
        Message obtainMessage;
        long j;
        if (!this.g) {
            nm4 nm4Var = this.b;
            if (nm4Var.B) {
                sk1 sk1Var = nm4Var.A;
                if (sk1Var != null) {
                    sk1Var.removeMessages(1);
                }
                sk1 sk1Var2 = nm4Var.A;
                if (sk1Var2 != null && (obtainMessage = sk1Var2.obtainMessage(1)) != null) {
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    obtainMessage.setData(jw2.l(new vr4("frame-deadline", Long.valueOf(j))));
                    sk1 sk1Var3 = nm4Var.A;
                    if (sk1Var3 != null) {
                        sk1Var3.sendMessage(obtainMessage);
                    }
                }
            }
        }
    }

    @Override // defpackage.om2
    public final long b(int i, int i2) {
        nm4 nm4Var;
        sk1 sk1Var;
        if (!this.g && (sk1Var = (nm4Var = this.b).A) != null && nm4Var.B) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            om4 om4Var = new om4(countDownLatch);
            if (sk1Var.sendMessageAtFrontOfQueue(Message.obtain(sk1Var, 4, i, i2, om4Var))) {
                if (!countDownLatch.await(10L, TimeUnit.MINUTES)) {
                    Log.w("OpenGlFrameRenderCoordinator", "Shader prewarm timed out; the first frames may stutter while it finishes");
                    return 0L;
                }
                return om4Var.b;
            }
        }
        return 0L;
    }

    @Override // defpackage.om2
    public final void c(EmulatorSurfaceView emulatorSurfaceView) {
        if (this.g) {
            return;
        }
        synchronized (this.d) {
            this.e.add(emulatorSurfaceView);
        }
    }

    @Override // defpackage.om2
    public final void d(EmulatorSurfaceView emulatorSurfaceView) {
        emulatorSurfaceView.getClass();
        if (this.g) {
            return;
        }
        synchronized (this.d) {
            this.e.remove(emulatorSurfaceView);
            this.f.add(emulatorSurfaceView);
            nm4 nm4Var = this.b;
            if (nm4Var.B) {
                sk1 sk1Var = nm4Var.A;
                if (sk1Var != null) {
                    sk1Var.removeMessages(2);
                }
                sk1 sk1Var2 = nm4Var.A;
                if (sk1Var2 != null) {
                    sk1Var2.sendEmptyMessage(2);
                }
            }
        }
    }

    @Override // defpackage.om2
    public final void e(EmulatorSurfaceView emulatorSurfaceView, VulkanPresentationConfig vulkanPresentationConfig, t26 t26Var) {
        emulatorSurfaceView.getClass();
        t26Var.getClass();
    }

    @Override // defpackage.om2
    public final void stop() {
        if (this.g) {
            return;
        }
        this.g = true;
        nm4 nm4Var = this.b;
        nm4Var.B = false;
        sk1 sk1Var = nm4Var.A;
        if (sk1Var != null) {
            sk1Var.sendMessageAtFrontOfQueue(Message.obtain(sk1Var, 3));
        }
        this.b.quitSafely();
        this.b.join();
    }
}
