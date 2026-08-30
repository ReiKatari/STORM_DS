package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Path;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.view.DisplayCutout;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ip  reason: default package */
/* loaded from: classes.dex */
public abstract class ip {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static zw b(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new yw(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new ax(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return zw.a(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static EncoderProfiles c(int i, String str) {
        return CamcorderProfile.getAll(str, i);
    }

    public static Path d(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float e(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return RecyclerView.A1;
        }
    }

    public static int f(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.X;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case ig7.b /* 6 */:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case mj2.L /* 12 */:
            case 13:
            case 14:
            case ig7.e /* 15 */:
                return stopReason;
            default:
                return -512;
        }
    }

    public static float g(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return RecyclerView.A1;
        }
    }
}
