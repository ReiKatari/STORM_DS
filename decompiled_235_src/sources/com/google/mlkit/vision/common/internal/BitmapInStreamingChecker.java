package com.google.mlkit.vision.common.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.common.InputImage;
import java.util.LinkedList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BitmapInStreamingChecker {
    private static final GmsLogger zza = new GmsLogger("StreamingFormatChecker", "");
    private final LinkedList zzb = new LinkedList();
    private long zzc = -1;

    public void check(InputImage inputImage) {
        if (inputImage.getFormat() == -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzb.add(Long.valueOf(elapsedRealtime));
            if (this.zzb.size() > 5) {
                this.zzb.removeFirst();
            }
            if (this.zzb.size() == 5 && elapsedRealtime - ((Long) Preconditions.checkNotNull((Long) this.zzb.peekFirst())).longValue() < 5000) {
                long j = this.zzc;
                if (j == -1 || elapsedRealtime - j >= 5000) {
                    this.zzc = elapsedRealtime;
                    zza.w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
