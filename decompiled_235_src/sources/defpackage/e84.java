package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e84  reason: default package */
/* loaded from: classes.dex */
public final class e84 implements SensorEventListener {
    public boolean A;
    public boolean d;
    public boolean e;
    public final SensorManager h;
    public final Sensor i;
    public final Sensor j;
    public boolean k;
    public final float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public final int s;
    public final float[] t;
    public float u;
    public float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public c84 a = c84.TOUCH_AIM;
    public float b = 1.25f;
    public float c = 1.25f;
    public final float f = 0.015f;
    public final float g = 1.4f;

    public e84(Context context) {
        SensorManager sensorManager;
        Sensor sensor;
        Object systemService = context.getSystemService("sensor");
        if (systemService instanceof SensorManager) {
            sensorManager = (SensorManager) systemService;
        } else {
            sensorManager = null;
        }
        this.h = sensorManager;
        if (sensorManager != null) {
            sensor = sensorManager.getDefaultSensor(1);
        } else {
            sensor = null;
        }
        this.i = sensor;
        this.j = sensorManager != null ? sensorManager.getDefaultSensor(4) : null;
        this.l = 0.65f;
        this.s = 80;
        this.t = new float[]{RecyclerView.B1, RecyclerView.B1, RecyclerView.B1};
        this.u = 128.0f;
        this.v = 96.0f;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        if (sensorEvent != null) {
            int type = sensorEvent.sensor.getType();
            boolean z4 = false;
            if (type != 1) {
                if (type == 4) {
                    float[] fArr = sensorEvent.values;
                    fArr.getClass();
                    float f = fArr[0];
                    float f2 = fArr[1];
                    float f3 = fArr[2];
                    int i = this.r;
                    float f4 = this.o;
                    if (i > 15) {
                        this.o = i61.a(f, f4, 0.02f, f4);
                        float f5 = this.p;
                        this.p = i61.a(f2, f5, 0.02f, f5);
                        float f6 = this.q;
                        this.q = i61.a(f3, f6, 0.02f, f6);
                        int i2 = this.s;
                        if (i > i2) {
                            this.r = i2;
                            return;
                        }
                        return;
                    }
                    float f7 = f - f4;
                    float f8 = f2 - this.p;
                    float f9 = f3 - this.q;
                    float abs = Math.abs(f7);
                    float f10 = this.f;
                    if (abs < f10) {
                        f7 = 0.0f;
                    }
                    if (Math.abs(f8) < f10) {
                        f8 = 0.0f;
                    }
                    Math.abs(f9);
                    float f11 = this.l;
                    float f12 = 1.0f - f11;
                    float f13 = (this.m * f12) + (f7 * f11);
                    this.m = f13;
                    this.n = (f12 * this.n) + (f11 * f8);
                    float signum = Math.signum(f13);
                    double abs2 = Math.abs(this.m);
                    double d = this.g;
                    float pow = signum * ((float) Math.pow(abs2, d)) * this.b * 12.0f;
                    float signum2 = Math.signum(this.n) * ((float) Math.pow(Math.abs(this.n), d)) * this.c * 12.0f;
                    if (this.d) {
                        signum2 = -signum2;
                    }
                    if (this.e) {
                        pow = -pow;
                    }
                    int i3 = d84.a[this.a.ordinal()];
                    MelonEmulator melonEmulator = MelonEmulator.a;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    i.d();
                                    return;
                                }
                                return;
                            }
                            melonEmulator.setSlot2AnalogInput(gi2.p(signum2 / 10.0f, -1.0f, 1.0f), gi2.p(pow / 10.0f, -1.0f, 1.0f));
                            return;
                        }
                        if (signum2 < -1.2f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (signum2 > 1.2f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (pow < -1.2f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (pow > 1.2f) {
                            z4 = true;
                        }
                        if (z != this.x) {
                            this.x = z;
                            b63 b63Var = b63.LEFT;
                            if (z) {
                                melonEmulator.d(b63Var);
                            } else {
                                melonEmulator.e(b63Var);
                            }
                        }
                        if (z2 != this.y) {
                            this.y = z2;
                            b63 b63Var2 = b63.RIGHT;
                            if (z2) {
                                melonEmulator.d(b63Var2);
                            } else {
                                melonEmulator.e(b63Var2);
                            }
                        }
                        if (z3 != this.z) {
                            this.z = z3;
                            b63 b63Var3 = b63.UP;
                            if (z3) {
                                melonEmulator.d(b63Var3);
                            } else {
                                melonEmulator.e(b63Var3);
                            }
                        }
                        if (z4 != this.A) {
                            this.A = z4;
                            b63 b63Var4 = b63.DOWN;
                            if (z4) {
                                melonEmulator.d(b63Var4);
                                return;
                            } else {
                                melonEmulator.e(b63Var4);
                                return;
                            }
                        }
                        return;
                    }
                    this.u = gi2.p(this.u - signum2, RecyclerView.B1, 255.0f);
                    this.v = gi2.p(this.v - pow, RecyclerView.B1, 191.0f);
                    if (Math.abs(signum2) <= 0.02f && Math.abs(pow) <= 0.02f) {
                        return;
                    }
                    melonEmulator.onScreenTouch((int) this.u, (int) this.v);
                    this.w = true;
                    return;
                }
                return;
            }
            float[] fArr2 = sensorEvent.values;
            fArr2.getClass();
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            float f16 = fArr2[2];
            float[] fArr3 = this.t;
            if (Math.abs(f16 - fArr3[2]) + Math.abs(f15 - fArr3[1]) + Math.abs(f14 - fArr3[0]) < 0.08f) {
                this.r++;
            } else {
                this.r = 0;
            }
            fArr3[0] = f14;
            fArr3[1] = f15;
            fArr3[2] = f16;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
