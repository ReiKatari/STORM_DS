package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ew6  reason: default package */
/* loaded from: classes.dex */
public final class ew6 implements i47 {
    public final zd6 a;
    public n47 b;
    public final boolean c;
    public dw6 d;
    public final m14 e;
    public final boolean f;
    public final int g;
    public final m14 h;
    public gs0 i;
    public gs0 j;

    /* JADX WARN: Type inference failed for: r5v2, types: [m14, pq3] */
    /* JADX WARN: Type inference failed for: r6v2, types: [m14, pq3] */
    public ew6(je0 je0Var, zd6 zd6Var, n57 n57Var) {
        CameraCharacteristics.Key key;
        CameraCharacteristics.Key key2;
        CameraCharacteristics.Key key3;
        je0Var.getClass();
        zd6Var.getClass();
        n57Var.getClass();
        this.a = zd6Var;
        this.c = l07.Y(je0Var);
        boolean z = false;
        this.e = new pq3(0);
        be0 be0Var = ce0.g;
        ce0 ce0Var = je0Var.b;
        be0Var.getClass();
        ce0Var.getClass();
        int i = Build.VERSION.SDK_INT;
        int i2 = 1;
        if (i >= 35) {
            key3 = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
            key3.getClass();
            Integer num = (Integer) ((ia0) ce0Var).c(key3);
            if (num != null && num.intValue() > 1) {
                z = true;
            }
        }
        this.f = z;
        if (i >= 35) {
            key2 = CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL;
            key2.getClass();
            Integer num2 = (Integer) ((ia0) ce0Var).c(key2);
            if (num2 != null) {
                i2 = num2.intValue();
            }
        }
        this.g = i2;
        if (i >= 35) {
            key = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
            key.getClass();
            Integer num3 = (Integer) ((ia0) ce0Var).c(key);
        }
        this.h = new pq3(Integer.valueOf(i2));
    }

    public final gs0 a(int i, boolean z, boolean z2) {
        boolean z3;
        int i2;
        ic1 i3;
        zd6 zd6Var = this.a;
        if (ve2.D("CXCP")) {
            StringBuilder sb = new StringBuilder("TorchControl#setTorchAsync: torch mode = ");
            sb.append((Object) ("TorchMode(value=" + i + ')'));
            Log.d("CXCP", sb.toString());
        }
        gs0 gs0Var = new gs0();
        if (!z2 && !this.c) {
            gs0Var.v0(new IllegalStateException("No flash unit"));
            return gs0Var;
        }
        n47 n47Var = this.b;
        if (n47Var != null) {
            c(i);
            gs0 gs0Var2 = this.i;
            Integer num = null;
            if (z) {
                if (gs0Var2 != null) {
                    b31.z("There is a new enableTorch being set", gs0Var2);
                }
                this.i = null;
            } else if (gs0Var2 != null) {
                l.K(gs0Var, gs0Var2);
            }
            this.i = gs0Var;
            boolean z4 = false;
            if (i == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                num = 1;
            }
            synchronized (zd6Var.d) {
                zd6Var.k = num;
            }
            zd6Var.f();
            List list = ja.b;
            ja u = dk7.u(zd6Var.e());
            if (u != null) {
                i2 = u.a;
            } else {
                if (ve2.I()) {
                    Log.w("CXCP", "TorchControl#setTorchAsync: Failed to convert ae mode of value " + zd6Var.e() + " with AeMode.fromIntOrNull, fallback to AeMode.ON");
                }
                i2 = 1;
            }
            if (i == 0) {
                z4 = true;
            }
            if (!z4) {
                if (i == 1) {
                    Integer num2 = (Integer) this.h.c();
                    if (num2 != null) {
                        d(num2.intValue());
                    }
                } else {
                    d(this.g);
                }
                i3 = n47Var.c();
            } else {
                i3 = n47Var.i(i2);
            }
            d96 d96Var = new d96(23);
            i3.getClass();
            ((p63) i3).R(new cz(i3, gs0Var, d96Var, 6));
            return gs0Var;
        }
        b31.z("Camera is not active.", gs0Var);
        return gs0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r3.intValue() == 1) goto L7;
     */
    @Override // defpackage.i47
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.n47 r3) {
        /*
            r2 = this;
            r2.b = r3
            dw6 r3 = r2.d
            if (r3 == 0) goto L1e
            m14 r3 = r2.e
            java.lang.Object r3 = r3.c()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r0 = 0
            if (r3 != 0) goto L12
            goto L1a
        L12:
            int r3 = r3.intValue()
            r1 = 1
            if (r3 != r1) goto L1a
            goto L1b
        L1a:
            r1 = r0
        L1b:
            r2.a(r1, r0, r0)
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew6.b(n47):void");
    }

    public final void c(int i) {
        this.d = new dw6(i);
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        boolean M = nk2.M();
        m14 m14Var = this.e;
        if (M) {
            m14Var.f(Integer.valueOf(i2));
        } else {
            m14Var.g(Integer.valueOf(i2));
        }
    }

    public final void d(int i) {
        CaptureRequest.Key key;
        ic1 d;
        gs0 gs0Var = new gs0();
        if (Build.VERSION.SDK_INT >= 35 && this.f) {
            gs0 gs0Var2 = this.j;
            if (gs0Var2 != null) {
                if (gs0Var2 != null) {
                    b31.z("There is a new torch strength being set", gs0Var2);
                }
                this.j = null;
            }
            this.j = gs0Var;
            gs0Var.R(new n95(24, this));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            key = CaptureRequest.FLASH_STRENGTH_LEVEL;
            linkedHashMap.put(key, Integer.valueOf(i));
            n47 n47Var = this.b;
            if (n47Var != null && (d = n47.d(n47Var, linkedHashMap)) != null) {
                l.K(d, gs0Var);
                return;
            } else {
                b31.z("Camera is not active.", gs0Var);
                return;
            }
        }
        gs0Var.v0(new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
    }

    @Override // defpackage.i47
    public final void reset() {
        gs0 gs0Var = this.i;
        if (gs0Var != null) {
            b31.z("There is a new enableTorch being set", gs0Var);
        }
        this.i = null;
        gs0 gs0Var2 = this.j;
        if (gs0Var2 != null) {
            b31.z("There is a new torch strength being set", gs0Var2);
        }
        this.j = null;
        if (this.d != null) {
            c(0);
            a(0, true, false);
            this.d = null;
        }
    }
}
