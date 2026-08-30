package a6;

import android.app.job.JobParameters;
import android.graphics.Path;
import android.view.DisplayCutout;
import androidx.work.impl.background.systemjob.SystemJobService;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m {
    public static Path a(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static int b(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.X;
        switch (stopReason) {
            case 0:
            case DSiCameraSource.FrontCamera /* 1 */:
            case 2:
            case 3:
            case 4:
            case l1.c.f8511g /* 5 */:
            case l1.c.f8509e /* 6 */:
            case 7:
            case 8:
            case l1.c.f8508d /* 9 */:
            case l1.c.f8510f /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case l1.c.f8512h /* 15 */:
                return stopReason;
            default:
                return -512;
        }
    }
}
