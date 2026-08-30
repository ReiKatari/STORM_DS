package ce;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2868a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2869b;

    public b(Vibrator vibrator, int i2) {
        this.f2868a = i2;
        vibrator.getClass();
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f2869b = vibrator;
                return;
            default:
                this.f2869b = vibrator;
                return;
        }
    }

    public final void a() {
        VibrationEffect createWaveform;
        VibrationEffect createRepeatingEffect;
        int i2 = this.f2868a;
        Object obj = this.f2869b;
        switch (i2) {
            case 0:
                Vibrator vibrator = (Vibrator) obj;
                long[] jArr = {0, 100};
                if (Build.VERSION.SDK_INT >= 36) {
                    createWaveform = VibrationEffect.createWaveform(jArr, -1);
                    createRepeatingEffect = VibrationEffect.createRepeatingEffect(createWaveform);
                    createRepeatingEffect.getClass();
                    vibrator.vibrate(createRepeatingEffect);
                    return;
                }
                vibrator.vibrate(jArr, 1);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Vibrator) obj).vibrate(new long[]{0, 100}, 1);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    ((b) obj2).a();
                }
                return;
        }
    }

    public final void b() {
        switch (this.f2868a) {
            case 0:
                ((Vibrator) this.f2869b).cancel();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Vibrator) this.f2869b).cancel();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f2869b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((b) obj).b();
                }
                return;
        }
    }

    public final boolean c() {
        switch (this.f2868a) {
            case 0:
                return ((Vibrator) this.f2869b).hasVibrator();
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((Vibrator) this.f2869b).hasVibrator();
            default:
                ArrayList arrayList = (ArrayList) this.f2869b;
                if (arrayList.isEmpty()) {
                    return false;
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (((b) obj).c()) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final boolean d() {
        boolean hasAmplitudeControl;
        switch (this.f2868a) {
            case 0:
                hasAmplitudeControl = ((Vibrator) this.f2869b).hasAmplitudeControl();
                return hasAmplitudeControl;
            case DSiCameraSource.FrontCamera /* 1 */:
                return false;
            default:
                ArrayList arrayList = (ArrayList) this.f2869b;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (!((b) obj).d()) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    public final void e(int i2, int i10) {
        VibrationEffect createOneShot;
        switch (this.f2868a) {
            case 0:
                createOneShot = VibrationEffect.createOneShot(i2, i10);
                ((Vibrator) this.f2869b).vibrate(createOneShot);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Vibrator) this.f2869b).vibrate(i2);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f2869b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((b) obj).e(i2, i10);
                }
                return;
        }
    }

    public b(ArrayList arrayList) {
        this.f2868a = 2;
        this.f2869b = arrayList;
    }
}
