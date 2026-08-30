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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a13  reason: default package */
/* loaded from: classes.dex */
public final class a13 {
    public static final int[] k = {0, 15, 11, 12, 17, 18};
    public static final int[] l = {1, 16, 13, 14, 23, 22};
    public final m11 a;
    public final qu2 b;
    public final qu2 c;
    public final LinkedHashMap d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, y03] */
    public a13(m11 m11Var, qu2 qu2Var, qu2 qu2Var2) {
        b03 b03Var;
        m11Var.getClass();
        qu2Var.getClass();
        qu2Var2.getClass();
        this.a = m11Var;
        this.b = qu2Var;
        this.c = qu2Var2;
        ArrayList arrayList = m11Var.b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f03 f03Var = (f03) obj;
            tq0.D0(arrayList2, l07.c0(f03Var.b, f03Var.c));
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            e03 e03Var = (e03) obj2;
            if (e03Var instanceof b03) {
                b03Var = (b03) e03Var;
            } else {
                b03Var = null;
            }
            x03 x03Var = b03Var != null ? new x03(b03Var.a, b03Var.b, b03Var.c) : null;
            if (x03Var != null) {
                arrayList3.add(x03Var);
            }
        }
        int j0 = zt3.j0(uq0.y0(arrayList3, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0 < 16 ? 16 : j0);
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            x03 x03Var2 = (x03) obj3;
            ?? obj4 = new Object();
            obj4.a = RecyclerView.A1;
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
        u86 u86Var = this.a.a;
        boolean z2 = u86Var.b;
        int i = u86Var.d;
        int i2 = u86Var.c;
        if (z2) {
            num = u86Var.a;
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
        float l2 = io2.l(u86Var.g, RecyclerView.A1, 1.0f);
        float l3 = io2.l(b(motionEvent, i2, k), -1.0f, 1.0f);
        float l4 = io2.l(b(motionEvent, i, l), -1.0f, 1.0f);
        if (u86Var.e) {
            l3 = -l3;
        }
        if (u86Var.f) {
            l4 = -l4;
        }
        if (Math.abs(l3) < l2) {
            l3 = 0.0f;
        }
        if (Math.abs(l4) < l2) {
            l4 = 0.0f;
        }
        MelonEmulator.a.setSlot2AnalogInput(l3, l4);
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f = uptimeMillis;
        if ((Math.abs(l3) > RecyclerView.A1 || Math.abs(l4) > RecyclerView.A1) && uptimeMillis - this.e >= 1500) {
            this.e = uptimeMillis;
            int deviceId = motionEvent.getDeviceId();
            int source = motionEvent.getSource();
            iq2.g(16);
            String num2 = Integer.toString(source, 16);
            num2.getClass();
            Locale locale = Locale.US;
            String format = String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(l3)}, 1));
            String format2 = String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(l4)}, 1));
            String format3 = String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(l2)}, 1));
            StringBuilder sb = new StringBuilder("slot2AnalogInput deviceId=");
            sb.append(deviceId);
            sb.append(" source=0x");
            sb.append(num2);
            sb.append(" axisX=");
            b31.A(sb, i2, " axisY=", i, " x=");
            b31.B(sb, format, " y=", format2, " deadzone=");
            sb.append(format3);
            Log.w("InputProcessor", sb.toString());
        }
        return true;
    }

    public final void c(yz2 yz2Var, boolean z, boolean z2) {
        float f;
        if (z2) {
            int i = z03.b[yz2Var.ordinal()];
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
                if ((Math.abs(f) > RecyclerView.A1 || Math.abs(f2) > RecyclerView.A1) && uptimeMillis - this.e >= 1500) {
                    this.e = uptimeMillis;
                    Locale locale = Locale.US;
                    wh1.y("slot2AnalogInput source=digital-fallback x=", String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), " y=", String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1)), "InputProcessor");
                }
            }
        }
    }
}
