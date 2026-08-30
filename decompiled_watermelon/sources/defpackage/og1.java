package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: og1  reason: default package */
/* loaded from: classes.dex */
public final class og1 extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og1(Looper looper, Object obj, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    private final void a(Message message) {
        CountDownLatch countDownLatch;
        String str;
        message.getClass();
        int i = message.what;
        long j = 0;
        if (i != 1) {
            int i2 = 0;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        md4 md4Var = (md4) this.b;
                        int i3 = message.arg1;
                        int i4 = message.arg2;
                        Object obj = message.obj;
                        obj.getClass();
                        nd4 nd4Var = (nd4) obj;
                        try {
                            if (md4Var.B && md4Var.Y.a.d()) {
                                long nanoTime = System.nanoTime();
                                Boolean valueOf = Boolean.valueOf(MelonEmulator.a.prewarmOpenGlRetroArchFilter(i3, i4));
                                Boolean bool = Boolean.FALSE;
                                if (valueOf instanceof kc5) {
                                    valueOf = bool;
                                }
                                boolean booleanValue = valueOf.booleanValue();
                                long nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
                                if (booleanValue) {
                                    j = nanoTime2;
                                }
                                nd4Var.b = j;
                                if (booleanValue) {
                                    str = "ready";
                                } else {
                                    str = "failed";
                                }
                                Log.i("OpenGlFrameRenderCoordinator", "Shader prewarm " + str + " in " + nanoTime2 + "ms (atlas " + i3 + "x" + i4 + ")");
                                countDownLatch = nd4Var.a;
                                countDownLatch.countDown();
                                return;
                            }
                            countDownLatch = nd4Var.a;
                            countDownLatch.countDown();
                            return;
                        } finally {
                            nd4Var.a.countDown();
                        }
                    }
                    return;
                }
                md4 md4Var2 = (md4) this.b;
                if (!md4Var2.L) {
                    md4Var2.L = true;
                    md4Var2.B = false;
                    od4 od4Var = md4Var2.Y;
                    synchronized (od4Var.d) {
                        try {
                            ArrayList arrayList = od4Var.e;
                            int size = arrayList.size();
                            int i5 = 0;
                            while (i5 < size) {
                                Object obj2 = arrayList.get(i5);
                                i5++;
                                ((EmulatorSurfaceView) obj2).b(od4Var.a);
                            }
                            ArrayList arrayList2 = od4Var.f;
                            int size2 = arrayList2.size();
                            while (i2 < size2) {
                                Object obj3 = arrayList2.get(i2);
                                i2++;
                                ((EmulatorSurfaceView) obj3).b(od4Var.a);
                            }
                            od4Var.e.clear();
                            od4Var.f.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (md4Var2.Y.a.d()) {
                        try {
                            MelonEmulator.a.releaseOpenGlRetroArchFilter();
                        } catch (Throwable unused) {
                        }
                    }
                    EGLDisplay eGLDisplay = md4Var2.Y.a.a;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    md4Var2.Y.a.b();
                    return;
                }
                return;
            }
            od4 od4Var2 = ((md4) this.b).Y;
            synchronized (od4Var2.d) {
                try {
                    ArrayList arrayList3 = od4Var2.f;
                    int size3 = arrayList3.size();
                    while (i2 < size3) {
                        Object obj4 = arrayList3.get(i2);
                        i2++;
                        ((EmulatorSurfaceView) obj4).b(od4Var2.a);
                    }
                    od4Var2.f.clear();
                } finally {
                }
            }
            return;
        }
        md4 md4Var3 = (md4) this.b;
        long j2 = message.getData().getLong("frame-deadline");
        if (!md4Var3.B) {
            return;
        }
        od4 od4Var3 = md4Var3.Y;
        synchronized (od4Var3.d) {
            if (j2 > 0) {
                try {
                    j = j2 - (((float) md4Var3.R.A) * 2.0f);
                } finally {
                }
            }
            od4Var3.a.d();
            MelonEmulator.a.presentFrame(j, md4Var3.X);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
        if (r4 < 0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og1.handleMessage(android.os.Message):void");
    }

    public /* synthetic */ og1() {
        this.a = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og1(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }
}
