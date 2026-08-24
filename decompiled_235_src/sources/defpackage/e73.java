package defpackage;

import android.os.SystemClock;
import android.util.Log;
import android.view.InputDevice;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e73  reason: default package */
/* loaded from: classes.dex */
public final class e73 {
    public static final int[] k = {0, 15, 11, 12, 17, 18};
    public static final int[] l = {1, 16, 13, 14, 23, 22};
    public final u41 a;
    public final s03 b;
    public final s03 c;
    public final LinkedHashMap d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, c73] */
    public e73(u41 u41Var, s03 s03Var, s03 s03Var2) {
        e63 e63Var;
        u41Var.getClass();
        s03Var.getClass();
        s03Var2.getClass();
        this.a = u41Var;
        this.b = s03Var;
        this.c = s03Var2;
        ArrayList arrayList = u41Var.b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i63 i63Var = (i63) obj;
            gt0.A0(arrayList2, hf.c0(i63Var.b, i63Var.c));
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            h63 h63Var = (h63) obj2;
            if (h63Var instanceof e63) {
                e63Var = (e63) h63Var;
            } else {
                e63Var = null;
            }
            b73 b73Var = e63Var != null ? new b73(e63Var.a, e63Var.b, e63Var.c) : null;
            if (b73Var != null) {
                arrayList3.add(b73Var);
            }
        }
        int k0 = c14.k0(ht0.v0(arrayList3, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(k0 < 16 ? 16 : k0);
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            b73 b73Var2 = (b73) obj3;
            ?? obj4 = new Object();
            obj4.a = RecyclerView.B1;
            obj4.b = false;
            linkedHashMap.put(obj3, obj4);
        }
        this.d = linkedHashMap;
    }

    public static float b(MotionEvent motionEvent, int i, int[] iArr) {
        float axisValue = motionEvent.getAxisValue(i);
        InputDevice device = motionEvent.getDevice();
        if ((device == null || (device.getMotionRange(i, motionEvent.getSource()) == null && device.getMotionRange(i, 16) == null && device.getMotionRange(i, 16777232) == null && device.getMotionRange(i, 1025) == null && device.getMotionRange(i) == null)) && Math.abs(axisValue) <= 1.0E-4f) {
            float abs = Math.abs(axisValue);
            for (int i2 : iArr) {
                if (i2 != i) {
                    float axisValue2 = motionEvent.getAxisValue(i2);
                    float abs2 = Math.abs(axisValue2);
                    if (abs2 > abs) {
                        axisValue = axisValue2;
                        abs = abs2;
                    }
                }
            }
        }
        return axisValue;
    }

    public final boolean a(MotionEvent motionEvent) {
        Integer num;
        boolean z;
        kk6 kk6Var = this.a.a;
        boolean z2 = kk6Var.b;
        int i = kk6Var.d;
        int i2 = kk6Var.c;
        if (z2) {
            num = kk6Var.a;
        } else {
            num = null;
        }
        if (num != null && InputDevice.getDevice(num.intValue()) == null) {
            z = false;
        } else {
            z = true;
        }
        if (num != null) {
            if (num.intValue() != motionEvent.getDeviceId() && z) {
                return false;
            }
        }
        float p = gi2.p(kk6Var.g, RecyclerView.B1, 1.0f);
        float p2 = gi2.p(b(motionEvent, i2, k), -1.0f, 1.0f);
        float p3 = gi2.p(b(motionEvent, i, l), -1.0f, 1.0f);
        if (kk6Var.e) {
            p2 = -p2;
        }
        if (kk6Var.f) {
            p3 = -p3;
        }
        if (Math.abs(p2) < p) {
            p2 = 0.0f;
        }
        if (Math.abs(p3) < p) {
            p3 = 0.0f;
        }
        MelonEmulator.a.setSlot2AnalogInput(p2, p3);
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f = uptimeMillis;
        if ((Math.abs(p2) > RecyclerView.B1 || Math.abs(p3) > RecyclerView.B1) && uptimeMillis - this.e >= 1500) {
            this.e = uptimeMillis;
            int deviceId = motionEvent.getDeviceId();
            int source = motionEvent.getSource();
            g04.y(16);
            String num2 = Integer.toString(source, 16);
            num2.getClass();
            Locale locale = Locale.US;
            String format = String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(p2)}, 1));
            String format2 = String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(p3)}, 1));
            String format3 = String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(p)}, 1));
            StringBuilder sb = new StringBuilder("slot2AnalogInput deviceId=");
            sb.append(deviceId);
            sb.append(" source=0x");
            sb.append(num2);
            sb.append(" axisX=");
            lb1.x(sb, i2, " axisY=", i, " x=");
            i61.B(sb, format, " y=", format2, " deadzone=");
            sb.append(format3);
            Log.w("InputProcessor", sb.toString());
        }
        return true;
    }

    public final void c(b63 b63Var, boolean z, boolean z2) {
        float f;
        if (z2) {
            int i = d73.b[b63Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.j = z;
                        } else {
                            return;
                        }
                    } else {
                        this.i = z;
                    }
                } else {
                    this.h = z;
                }
            } else {
                this.g = z;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f > 150) {
                boolean z3 = this.g;
                float f2 = 1.0f;
                if (z3 == this.h) {
                    f = 0.0f;
                } else if (z3) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                boolean z4 = this.i;
                if (z4 == this.j) {
                    f2 = 0.0f;
                } else if (z4) {
                    f2 = -1.0f;
                }
                MelonEmulator.a.setSlot2AnalogInput(f, f2);
                if ((Math.abs(f) > RecyclerView.B1 || Math.abs(f2) > RecyclerView.B1) && uptimeMillis - this.e >= 1500) {
                    this.e = uptimeMillis;
                    Locale locale = Locale.US;
                    lb1.w("slot2AnalogInput source=digital-fallback x=", String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), " y=", String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1)), "InputProcessor");
                }
            }
        }
    }
}
