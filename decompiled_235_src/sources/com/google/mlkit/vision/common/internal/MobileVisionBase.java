package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.vision.common.InputImage;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, gu3 {
    public static final /* synthetic */ int zza = 0;
    private static final GmsLogger zzb = new GmsLogger("MobileVisionBase", "");
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private final MLTask zzd;
    private final CancellationTokenSource zze;
    private final Executor zzf;
    private final Task zzg;

    public MobileVisionBase(MLTask<DetectionResultT, InputImage> mLTask, Executor executor) {
        this.zzd = mLTask;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.zze = cancellationTokenSource;
        this.zzf = executor;
        mLTask.pin();
        this.zzg = mLTask.callAfterLoad(executor, new Callable() { // from class: com.google.mlkit.vision.common.internal.zzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = MobileVisionBase.zza;
                return null;
            }
        }, cancellationTokenSource.getToken()).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.vision.common.internal.zzc
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                MobileVisionBase.zzb.e("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @ql4(st3.ON_DESTROY)
    public synchronized void close() {
        if (!this.zzc.getAndSet(true)) {
            this.zze.cancel();
            this.zzd.unpin(this.zzf);
        }
    }

    public synchronized Task<Void> closeWithTask() {
        if (!this.zzc.getAndSet(true)) {
            this.zze.cancel();
            return this.zzd.unpinWithTask(this.zzf);
        }
        return Tasks.forResult(null);
    }

    public synchronized Task<Void> getInitTaskBase() {
        return this.zzg;
    }

    public Task<DetectionResultT> process(Bitmap bitmap, int i) {
        return processBase(InputImage.fromBitmap(bitmap, i));
    }

    public synchronized Task<DetectionResultT> processBase(final InputImage inputImage) {
        Preconditions.checkNotNull(inputImage, "InputImage can not be null");
        if (this.zzc.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        } else if (inputImage.getWidth() >= 32 && inputImage.getHeight() >= 32) {
            return this.zzd.callAfterLoad(this.zzf, new Callable() { // from class: com.google.mlkit.vision.common.internal.zza
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return MobileVisionBase.this.zza(inputImage);
                }
            }, this.zze.getToken());
        } else {
            return Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
    }

    public final /* synthetic */ Object zza(InputImage inputImage) {
        zzlx zze = zzlx.zze("detectorTaskWithResource#run");
        zze.zzb();
        try {
            Object run = this.zzd.run(inputImage);
            zze.close();
            return run;
        } catch (Throwable th) {
            try {
                zze.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public final /* synthetic */ Object zzb(p64 p64Var) {
        InputImage convertMlImagetoInputImage = CommonConvertUtils.convertMlImagetoInputImage(p64Var);
        if (convertMlImagetoInputImage != null) {
            return this.zzd.run(convertMlImagetoInputImage);
        }
        throw new MlKitException("Current type of MlImage is not supported.", 13);
    }

    public Task<DetectionResultT> process(Image image, int i) {
        return processBase(InputImage.fromMediaImage(image, i));
    }

    public Task<DetectionResultT> process(Image image, int i, Matrix matrix) {
        return processBase(InputImage.fromMediaImage(image, i, matrix));
    }

    public Task<DetectionResultT> process(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return processBase(InputImage.fromByteBuffer(byteBuffer, i, i2, i3, i4));
    }

    public synchronized Task<DetectionResultT> processBase(p64 p64Var) {
        Preconditions.checkNotNull(p64Var, "MlImage can not be null");
        if (this.zzc.get()) {
        } else {
            throw null;
        }
        return Tasks.forException(new MlKitException("This detector is already closed!", 14));
    }
}
