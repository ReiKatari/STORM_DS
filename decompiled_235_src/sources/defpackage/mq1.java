package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mq1  reason: default package */
/* loaded from: classes.dex */
public final class mq1 implements xv6, SurfaceTexture.OnFrameAvailableListener {
    public final iq1 a;
    public final HandlerThread b;
    public final ov2 c;
    public final Handler d;
    public int e;
    public boolean f;
    public final AtomicBoolean g;
    public final LinkedHashMap h;
    public SurfaceTexture i;
    public SurfaceTexture j;

    public mq1(yq1 yq1Var, u63 u63Var, u63 u63Var2) {
        Map map = Collections.EMPTY_MAP;
        this.e = 0;
        this.f = false;
        this.g = new AtomicBoolean(false);
        this.h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new ov2(handler);
        this.a = new iq1(u63Var, u63Var2);
        try {
            e(yq1Var);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    @Override // defpackage.xv6
    public final void a(bw6 bw6Var) {
        if (this.g.get()) {
            bw6Var.b();
        } else {
            d(new mf(19, this, bw6Var), new of1(bw6Var, 0));
        }
    }

    @Override // defpackage.xv6
    public final void b(wv6 wv6Var) {
        if (this.g.get()) {
            wv6Var.close();
            return;
        }
        mf mfVar = new mf(20, this, wv6Var);
        Objects.requireNonNull(wv6Var);
        d(mfVar, new n0(wv6Var, 17));
    }

    public final void c() {
        if (this.f && this.e == 0) {
            LinkedHashMap linkedHashMap = this.h;
            for (wv6 wv6Var : linkedHashMap.keySet()) {
                wv6Var.close();
            }
            linkedHashMap.clear();
            iq1 iq1Var = this.a;
            if (((AtomicBoolean) iq1Var.L).getAndSet(false)) {
                bp2.c((Thread) iq1Var.X);
                iq1Var.n();
            }
            iq1Var.j0 = -1;
            iq1Var.k0 = -1;
            this.b.quit();
        }
    }

    public final void d(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new v(this, runnable2, runnable, 15));
        } catch (RejectedExecutionException e) {
            kj2.g0("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [hl5, java.lang.Object] */
    public final void e(yq1 yq1Var) {
        Map map = Collections.EMPTY_MAP;
        ?? obj = new Object();
        obj.c = new Object();
        tb0 tb0Var = new tb0(obj);
        obj.b = tb0Var;
        obj.a = i61.class;
        try {
            d(new v(this, yq1Var, (qb0) obj), new ge(4));
            obj.a = "Init GlRenderer";
        } catch (Exception e) {
            tb0Var.b(e);
        }
        try {
            tb0Var.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (!this.g.get() && (surfaceTexture2 = this.i) != null && this.j != null) {
            surfaceTexture2.updateTexImage();
            this.j.updateTexImage();
            for (Map.Entry entry : this.h.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                wv6 wv6Var = (wv6) entry.getKey();
                if (wv6Var.L == 34) {
                    try {
                        this.a.v(surfaceTexture.getTimestamp(), surface, wv6Var, this.i, this.j);
                    } catch (RuntimeException e) {
                        kj2.w("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                    }
                }
            }
        }
    }

    @Override // defpackage.xv6
    public final void release() {
        if (this.g.getAndSet(true)) {
            return;
        }
        d(new n0(this, 20), new ge(4));
    }
}
