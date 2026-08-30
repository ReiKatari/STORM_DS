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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: od4  reason: default package */
/* loaded from: classes.dex */
public final class od4 implements oh2 {
    public final GlContext a;
    public final md4 b;
    public final ct4 c;
    public final Object d;
    public final ArrayList e;
    public final ArrayList f;
    public volatile boolean g;

    /* JADX WARN: Type inference failed for: r1v0, types: [ct4, java.lang.Object] */
    public od4() {
        md4 md4Var = new md4(this);
        this.b = md4Var;
        ?? obj = new Object();
        obj.a = false;
        obj.b = 0;
        this.c = obj;
        this.d = new Object();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.a = new GlContext(Long.valueOf(MelonDSAndroidInterface.a.getEmulatorGlContext()));
        md4Var.start();
    }

    @Override // defpackage.oh2
    public final void a(Long l) {
        Message obtainMessage;
        long j;
        if (!this.g) {
            md4 md4Var = this.b;
            if (md4Var.B) {
                og1 og1Var = md4Var.A;
                if (og1Var != null) {
                    og1Var.removeMessages(1);
                }
                og1 og1Var2 = md4Var.A;
                if (og1Var2 != null && (obtainMessage = og1Var2.obtainMessage(1)) != null) {
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    obtainMessage.setData(dk7.k(new ti4("frame-deadline", Long.valueOf(j))));
                    og1 og1Var3 = md4Var.A;
                    if (og1Var3 != null) {
                        og1Var3.sendMessage(obtainMessage);
                    }
                }
            }
        }
    }

    @Override // defpackage.oh2
    public final void b(EmulatorSurfaceView emulatorSurfaceView) {
        emulatorSurfaceView.getClass();
        if (this.g) {
            return;
        }
        synchronized (this.d) {
            this.e.remove(emulatorSurfaceView);
            this.f.add(emulatorSurfaceView);
            md4 md4Var = this.b;
            if (md4Var.B) {
                og1 og1Var = md4Var.A;
                if (og1Var != null) {
                    og1Var.removeMessages(2);
                }
                og1 og1Var2 = md4Var.A;
                if (og1Var2 != null) {
                    og1Var2.sendEmptyMessage(2);
                }
            }
        }
    }

    @Override // defpackage.oh2
    public final long c(int i, int i2) {
        md4 md4Var;
        og1 og1Var;
        if (!this.g && (og1Var = (md4Var = this.b).A) != null && md4Var.B) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            nd4 nd4Var = new nd4(countDownLatch);
            if (og1Var.sendMessageAtFrontOfQueue(Message.obtain(og1Var, 4, i, i2, nd4Var))) {
                if (!countDownLatch.await(10L, TimeUnit.MINUTES)) {
                    Log.w("OpenGlFrameRenderCoordinator", "Shader prewarm timed out; the first frames may stutter while it finishes");
                    return 0L;
                }
                return nd4Var.b;
            }
        }
        return 0L;
    }

    @Override // defpackage.oh2
    public final void d(EmulatorSurfaceView emulatorSurfaceView, VulkanPresentationConfig vulkanPresentationConfig, bs5 bs5Var) {
        emulatorSurfaceView.getClass();
        bs5Var.getClass();
    }

    @Override // defpackage.oh2
    public final void e(EmulatorSurfaceView emulatorSurfaceView) {
        if (this.g) {
            return;
        }
        synchronized (this.d) {
            this.e.add(emulatorSurfaceView);
        }
    }

    @Override // defpackage.oh2
    public final void stop() {
        if (this.g) {
            return;
        }
        this.g = true;
        md4 md4Var = this.b;
        md4Var.B = false;
        og1 og1Var = md4Var.A;
        if (og1Var != null) {
            og1Var.sendMessageAtFrontOfQueue(Message.obtain(og1Var, 3));
        }
        this.b.quitSafely();
        this.b.join();
    }
}
