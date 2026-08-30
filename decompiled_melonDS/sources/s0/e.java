package s0;

import aj.g;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import b4.l;
import d0.a0;
import d0.n1;
import d0.r1;
import d0.z;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import r0.m;
import r0.n;
import t0.i;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements n, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final c f12794a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f12795b;

    /* renamed from: c  reason: collision with root package name */
    public final l0.d f12796c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f12797d;

    /* renamed from: e  reason: collision with root package name */
    public int f12798e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12799f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f12800g;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashMap f12801h;

    /* renamed from: i  reason: collision with root package name */
    public SurfaceTexture f12802i;

    /* renamed from: j  reason: collision with root package name */
    public SurfaceTexture f12803j;

    public e(a0 a0Var, z zVar, z zVar2) {
        Map map = Collections.EMPTY_MAP;
        this.f12798e = 0;
        this.f12799f = false;
        this.f12800g = new AtomicBoolean(false);
        this.f12801h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f12795b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f12797d = handler;
        this.f12796c = new l0.d(handler);
        this.f12794a = new c(zVar, zVar2);
        try {
            f(a0Var);
        } catch (RuntimeException e6) {
            a();
            throw e6;
        }
    }

    @Override // r0.n
    public final void a() {
        if (this.f12800g.getAndSet(true)) {
            return;
        }
        e(new r0.b(4, this), new l(2));
    }

    @Override // r0.n
    public final void b(m mVar) {
        if (this.f12800g.get()) {
            mVar.close();
            return;
        }
        ad.c cVar = new ad.c(27, this, mVar);
        Objects.requireNonNull(mVar);
        e(cVar, new r0.b(0, mVar));
    }

    @Override // r0.n
    public final void c(r1 r1Var) {
        if (this.f12800g.get()) {
            r1Var.b();
        } else {
            e(new ad.c(26, this, r1Var), new n1(r1Var, 1));
        }
    }

    public final void d() {
        if (this.f12799f && this.f12798e == 0) {
            LinkedHashMap linkedHashMap = this.f12801h;
            for (m mVar : linkedHashMap.keySet()) {
                mVar.close();
            }
            linkedHashMap.clear();
            c cVar = this.f12794a;
            if (((AtomicBoolean) cVar.L).getAndSet(false)) {
                i.c((Thread) cVar.X);
                cVar.m();
            }
            cVar.f12787h0 = -1;
            cVar.f12788i0 = -1;
            this.f12795b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.f12796c.execute(new a0.i(this, runnable2, runnable, 14));
        } catch (RejectedExecutionException e6) {
            g.z0("DualSurfaceProcessor", "Unable to executor runnable", e6);
            runnable2.run();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, b5.n] */
    public final void f(a0 a0Var) {
        Map map = Collections.EMPTY_MAP;
        ?? obj = new Object();
        obj.f2053c = new Object();
        b5.l lVar = new b5.l(obj);
        obj.f2052b = lVar;
        obj.f2051a = w.d.class;
        try {
            e(new a0.i(this, a0Var, (b5.i) obj), new l(2));
            obj.f2051a = "Init GlRenderer";
        } catch (Exception e6) {
            lVar.b(e6);
        }
        try {
            lVar.get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
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
        if (!this.f12800g.get() && (surfaceTexture2 = this.f12802i) != null && this.f12803j != null) {
            surfaceTexture2.updateTexImage();
            this.f12803j.updateTexImage();
            for (Map.Entry entry : this.f12801h.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                m mVar = (m) entry.getKey();
                if (mVar.L == 34) {
                    try {
                        this.f12794a.q(surfaceTexture.getTimestamp(), surface, mVar, this.f12802i, this.f12803j);
                    } catch (RuntimeException e6) {
                        g.t("DualSurfaceProcessor", "Failed to render with OpenGL.", e6);
                    }
                }
            }
        }
    }
}
