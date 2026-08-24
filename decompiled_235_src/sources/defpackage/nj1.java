package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nj1  reason: default package */
/* loaded from: classes.dex */
public final class nj1 {
    public final Context a;
    public final oj1 b;
    public VelocityTracker c;
    public float d;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public final int[] h = {Integer.MAX_VALUE, 0};

    public nj1(Context context, oj1 oj1Var) {
        this.a = context;
        this.b = oj1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r14 >= 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
        if (r5 >= 0) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MotionEvent motionEvent, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        float f;
        float f2;
        int i8;
        float f3;
        long j;
        int i9;
        float f4;
        float f5;
        float sqrt;
        float f6;
        float[] fArr;
        float f7;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i10 = this.f;
        int[] iArr = this.h;
        if (i10 == source && this.g == deviceId && this.e == i) {
            z = false;
            i2 = 1;
            i3 = 0;
        } else {
            Context context = this.a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i2 = 1;
            int i11 = Build.VERSION.SDK_INT;
            i3 = 0;
            if (i11 >= 34) {
                Method method = go7.a;
                i4 = c2.h(viewConfiguration, deviceId2, i, source2);
            } else {
                Method method2 = go7.a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i, source2) != null) {
                    Resources resources = context.getResources();
                    if (source2 == 4194304 && i == 26) {
                        i5 = resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
                    } else {
                        i5 = -1;
                    }
                    Objects.requireNonNull(viewConfiguration);
                    if (i5 != -1) {
                        if (i5 != 0) {
                            i4 = resources.getDimensionPixelSize(i5);
                        }
                    } else {
                        i4 = viewConfiguration.getScaledMinimumFlingVelocity();
                    }
                }
                i4 = Integer.MAX_VALUE;
            }
            iArr[0] = i4;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i11 >= 34) {
                i6 = c2.g(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 != null && device2.getMotionRange(i, source3) != null) {
                    Resources resources2 = context.getResources();
                    if (source3 == 4194304 && i == 26) {
                        i7 = resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                    } else {
                        i7 = -1;
                    }
                    Objects.requireNonNull(viewConfiguration);
                    if (i7 != -1) {
                        if (i7 != 0) {
                            i6 = resources2.getDimensionPixelSize(i7);
                        }
                    } else {
                        i6 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                }
                i6 = Integer.MIN_VALUE;
            }
            iArr[1] = i6;
            this.f = source;
            this.g = deviceId;
            this.e = i;
            z = true;
        }
        int i12 = iArr[i3];
        VelocityTracker velocityTracker = this.c;
        if (i12 == Integer.MAX_VALUE) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.c = null;
                return;
            }
            return;
        }
        if (velocityTracker == null) {
            this.c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.c;
        Map map = sl7.a;
        velocityTracker2.addMovement(motionEvent);
        int i13 = Build.VERSION.SDK_INT;
        float f8 = RecyclerView.B1;
        int i14 = 20;
        if (i13 < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = sl7.a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new tl7());
            }
            tl7 tl7Var = (tl7) map2.get(velocityTracker2);
            long[] jArr = tl7Var.b;
            long eventTime = motionEvent.getEventTime();
            if (tl7Var.d != 0 && eventTime - jArr[tl7Var.e] > 40) {
                tl7Var.d = i3;
                tl7Var.c = RecyclerView.B1;
            }
            int i15 = (tl7Var.e + 1) % 20;
            tl7Var.e = i15;
            int i16 = tl7Var.d;
            if (i16 != 20) {
                tl7Var.d = i16 + 1;
            }
            tl7Var.a[i15] = motionEvent.getAxisValue(26);
            jArr[tl7Var.e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        tl7 tl7Var2 = (tl7) sl7.a.get(velocityTracker2);
        if (tl7Var2 != null) {
            float[] fArr2 = tl7Var2.a;
            long[] jArr2 = tl7Var2.b;
            int i17 = tl7Var2.d;
            if (i17 >= 2) {
                int i18 = tl7Var2.e;
                int i19 = ((i18 + 20) - (i17 - 1)) % 20;
                long j2 = jArr2[i18];
                while (true) {
                    j = jArr2[i19];
                    int i20 = ((j2 - j) > 100L ? 1 : ((j2 - j) == 100L ? 0 : -1));
                    i9 = tl7Var2.d;
                    if (i20 <= 0) {
                        break;
                    }
                    tl7Var2.d = i9 - 1;
                    i19 = (i19 + 1) % 20;
                }
                if (i9 >= 2) {
                    if (i9 == 2) {
                        int i21 = (i19 + 1) % 20;
                        long j3 = jArr2[i21];
                        if (j != j3) {
                            sqrt = fArr2[i21] / ((float) (j3 - j));
                            f4 = Float.MAX_VALUE;
                            f = 0.0f;
                        }
                    } else {
                        f4 = Float.MAX_VALUE;
                        float f9 = 0.0f;
                        int i22 = 0;
                        int i23 = 0;
                        while (true) {
                            f5 = 1.0f;
                            if (i22 >= tl7Var2.d - 1) {
                                break;
                            }
                            int i24 = i22 + i19;
                            long j4 = jArr2[i24 % 20];
                            int i25 = (i24 + 1) % i14;
                            if (jArr2[i25] == j4) {
                                f6 = f8;
                                fArr = fArr2;
                            } else {
                                i23++;
                                if (f9 < f8) {
                                    f5 = -1.0f;
                                }
                                f6 = f8;
                                fArr = fArr2;
                                float sqrt2 = f5 * ((float) Math.sqrt(Math.abs(f9) * 2.0f));
                                float f10 = fArr[i25] / ((float) (jArr2[i25] - j4));
                                f9 += Math.abs(f10) * (f10 - sqrt2);
                                if (i23 == i2) {
                                    f9 *= 0.5f;
                                }
                            }
                            i22++;
                            f8 = f6;
                            fArr2 = fArr;
                            i14 = 20;
                            i2 = 1;
                        }
                        f = f8;
                        if (f9 < f) {
                            f5 = -1.0f;
                        }
                        sqrt = f5 * ((float) Math.sqrt(Math.abs(f9) * 2.0f));
                    }
                    f7 = sqrt * 1000.0f;
                    tl7Var2.c = f7;
                    if (f7 >= (-Math.abs(f4))) {
                        tl7Var2.c = -Math.abs(f4);
                    } else if (tl7Var2.c > Math.abs(f4)) {
                        tl7Var2.c = Math.abs(f4);
                    }
                }
            }
            f4 = Float.MAX_VALUE;
            sqrt = 0.0f;
            f = 0.0f;
            f7 = sqrt * 1000.0f;
            tl7Var2.c = f7;
            if (f7 >= (-Math.abs(f4))) {
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f2 = c2.c(velocityTracker2, i);
        } else if (i == 0) {
            f2 = velocityTracker2.getXVelocity();
        } else if (i == 1) {
            f2 = velocityTracker2.getYVelocity();
        } else {
            tl7 tl7Var3 = (tl7) sl7.a.get(velocityTracker2);
            if (tl7Var3 != null && i == 26) {
                f2 = tl7Var3.c;
            } else {
                f2 = f;
            }
        }
        oj1 oj1Var = this.b;
        float g = oj1Var.g() * f2;
        float signum = Math.signum(g);
        if (z || (signum != Math.signum(this.d) && signum != f)) {
            oj1Var.k();
        }
        if (Math.abs(g) < iArr[0]) {
            return;
        }
        float max = Math.max(-i8, Math.min(g, iArr[1]));
        if (oj1Var.c(max)) {
            f3 = max;
        } else {
            f3 = f;
        }
        this.d = f3;
    }
}
