package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class a {
    protected final zbtp zba;
    private final s08 zbb;
    private final d08 zbc;
    private long zbd;
    private final long zbe;
    private final long zbf;
    private final long zbg;
    private final long zbh;

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, d08] */
    public a(z08 z08Var) {
        zbtp zbb = zbtp.zbb();
        zbb = zbb == null ? zbtp.zba() : zbb;
        if (z08Var.f()) {
            this.zbc = new Object();
        } else if (z08Var.e()) {
            this.zbc = new NativePipelineImpl(this, this, this, zbb);
        } else {
            NativePipelineImpl nativePipelineImpl = new NativePipelineImpl(this, this, this, zbb);
            System.loadLibrary("mlkit_google_ocr_pipeline");
            this.zbc = nativePipelineImpl;
        }
        if (z08Var.zbi()) {
            this.zbb = new s08(z08Var.a());
        } else {
            this.zbb = new s08(10);
        }
        this.zba = zbb;
        long initializeFrameManager = this.zbc.initializeFrameManager();
        this.zbe = initializeFrameManager;
        long initializeFrameBufferReleaseCallback = this.zbc.initializeFrameBufferReleaseCallback(initializeFrameManager);
        this.zbf = initializeFrameBufferReleaseCallback;
        long initializeResultsCallback = this.zbc.initializeResultsCallback();
        this.zbg = initializeResultsCallback;
        long initializeIsolationCallback = this.zbc.initializeIsolationCallback();
        this.zbh = initializeIsolationCallback;
        this.zbd = this.zbc.initialize(z08Var.zbl(), initializeFrameBufferReleaseCallback, initializeResultsCallback, initializeIsolationCallback, 0L, 0L);
    }

    public final void zba(long j) {
        s08 s08Var = this.zbb;
        synchronized (s08Var) {
            s08Var.b.remove(Long.valueOf(j));
        }
    }

    public final int zbb(String str) {
        Log.w("VKP", "openFileDescriptor called but is not available for this pipeline. Ignoring call.");
        return -1;
    }

    public final void zbc(int i) {
        Log.w("VKP", "closeFileDescriptor called but is not available for this pipeline. Ignoring call.");
    }

    public final void zbd(j18 j18Var) {
        zbcq.zba.zbb(this, "Pipeline received results: ".concat(String.valueOf(j18Var)), new Object[0]);
    }

    public final zbki zbe(r08 r08Var) {
        if (this.zbd != 0) {
            s08 s08Var = this.zbb;
            long j = r08Var.b;
            synchronized (s08Var) {
                if (s08Var.b.size() == s08Var.a) {
                    zbcq zbcqVar = zbcq.zba;
                    zbcqVar.zbc(s08Var, "Buffer is full. Drop frame " + j, new Object[0]);
                } else {
                    s08Var.b.put(Long.valueOf(j), r08Var);
                    byte[] process = this.zbc.process(this.zbd, this.zbe, r08Var.b, r08Var.a, r08Var.c.zbb(), r08Var.c.zba(), 1, r08Var.d - 1);
                    if (process != null) {
                        try {
                            return zbki.zbe(j18.b(process, this.zba));
                        } catch (zbuq e) {
                            throw new IllegalStateException("Could not parse results", e);
                        }
                    }
                }
            }
            return zbki.zbd();
        }
        i.m("Pipeline has been closed or was not initialized");
        return null;
    }

    public final synchronized void zbf() {
        long j = this.zbd;
        if (j != 0) {
            this.zbc.stop(j);
            this.zbc.close(this.zbd, this.zbe, this.zbf, this.zbg, this.zbh);
            this.zbd = 0L;
            this.zbc.zba();
        }
    }

    public final void zbg() {
        long j = this.zbd;
        if (j != 0) {
            try {
                this.zbc.start(j);
                this.zbc.waitUntilIdle(this.zbd);
                return;
            } catch (PipelineException e) {
                this.zbc.stop(this.zbd);
                throw e;
            }
        }
        throw new PipelineException(k18.FAILED_PRECONDITION.ordinal(), "Pipeline has been closed or was not initialized");
    }

    public final void zbh() {
        long j = this.zbd;
        if (j != 0) {
            if (this.zbc.stop(j)) {
                return;
            }
            i.m("Pipeline did not stop successfully.");
            return;
        }
        i.m("Pipeline has been closed or was not initialized");
    }

    public final zbki zbi(long j, Bitmap bitmap, int i) {
        if (this.zbd != 0) {
            if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                byte[] processBitmap = this.zbc.processBitmap(this.zbd, j, bitmap, bitmap.getWidth(), bitmap.getHeight(), 0, i - 1);
                if (processBitmap == null) {
                    return zbki.zbd();
                }
                try {
                    return zbki.zbe(j18.b(processBitmap, this.zba));
                } catch (zbuq e) {
                    throw new IllegalStateException("Could not parse results", e);
                }
            }
            i.h("Unsupported bitmap config ".concat(String.valueOf(bitmap.getConfig())));
            return null;
        }
        i.m("Pipeline has been closed or was not initialized");
        return null;
    }

    public final zbki zbj(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.zbd != 0) {
            if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
                byte[] processYuvFrame = this.zbc.processYuvFrame(this.zbd, j, byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5, i6 - 1);
                if (processYuvFrame == null) {
                    return zbki.zbd();
                }
                try {
                    return zbki.zbe(j18.b(processYuvFrame, this.zba));
                } catch (zbuq e) {
                    throw new IllegalStateException("Could not parse results", e);
                }
            }
            i.m("Byte buffers are not direct.");
            return null;
        }
        i.m("Pipeline has been closed or was not initialized");
        return null;
    }
}
