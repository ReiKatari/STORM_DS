package defpackage;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: op  reason: default package */
/* loaded from: classes.dex */
public final class op {
    public final /* synthetic */ int a;
    public final Object b;

    public op(Vibrator vibrator, int i) {
        this.a = i;
        vibrator.getClass();
        switch (i) {
            case 1:
                this.b = vibrator;
                return;
            default:
                this.b = vibrator;
                return;
        }
    }

    public final void a() {
        VibrationEffect createWaveform;
        VibrationEffect createRepeatingEffect;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
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
            case 1:
                ((Vibrator) obj).vibrate(new long[]{0, 100}, 1);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ((op) obj2).a();
                }
                return;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Vibrator) obj).cancel();
                return;
            case 1:
                ((Vibrator) obj).cancel();
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ((op) obj2).b();
                }
                return;
        }
    }

    public final boolean c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((Vibrator) obj).hasVibrator();
            case 1:
                return ((Vibrator) obj).hasVibrator();
            default:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return false;
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (((op) obj2).c()) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final boolean d() {
        boolean hasAmplitudeControl;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                hasAmplitudeControl = ((Vibrator) obj).hasAmplitudeControl();
                return hasAmplitudeControl;
            case 1:
                return false;
            default:
                ArrayList arrayList = (ArrayList) obj;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (!((op) obj2).d()) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    public final void e(int i, int i2) {
        VibrationEffect createOneShot;
        VibrationEffect createPredefined;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                Vibrator vibrator = (Vibrator) obj;
                if (Build.VERSION.SDK_INT < 29) {
                    createOneShot = VibrationEffect.createOneShot(i, gi2.q(i2, 1, 255));
                    vibrator.vibrate(createOneShot);
                    return;
                }
                if (i <= 35) {
                    createPredefined = VibrationEffect.createPredefined(0);
                } else {
                    createPredefined = i <= 70 ? VibrationEffect.createPredefined(2) : VibrationEffect.createOneShot(i, gi2.q(i2, 1, 255));
                }
                vibrator.vibrate(createPredefined);
                return;
            case 1:
                ((Vibrator) obj).vibrate(i);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    ((op) obj2).e(i, i2);
                }
                return;
        }
    }

    public op(ArrayList arrayList) {
        this.a = 2;
        this.b = arrayList;
    }
}
