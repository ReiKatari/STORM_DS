package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r87  reason: default package */
/* loaded from: classes.dex */
public final class r87 implements gi7 {
    public final op6 a;
    public li7 b;
    public final boolean c;
    public q87 d;
    public final s94 e;
    public final boolean f;
    public final int g;
    public final s94 h;
    public tu0 i;
    public tu0 j;

    /* JADX WARN: Type inference failed for: r5v2, types: [qx3, s94] */
    /* JADX WARN: Type inference failed for: r6v2, types: [qx3, s94] */
    public r87(sg0 sg0Var, op6 op6Var, kj7 kj7Var) {
        CameraCharacteristics.Key key;
        CameraCharacteristics.Key key2;
        CameraCharacteristics.Key key3;
        sg0Var.getClass();
        op6Var.getClass();
        kj7Var.getClass();
        this.a = op6Var;
        this.c = nc1.V(sg0Var);
        boolean z = false;
        this.e = new qx3(0);
        kg0 kg0Var = lg0.g;
        lg0 lg0Var = sg0Var.b;
        kg0Var.getClass();
        lg0Var.getClass();
        int i = Build.VERSION.SDK_INT;
        int i2 = 1;
        if (i >= 35) {
            key3 = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
            key3.getClass();
            Integer num = (Integer) ((qc0) lg0Var).c(key3);
            if (num != null && num.intValue() > 1) {
                z = true;
            }
        }
        this.f = z;
        if (i >= 35) {
            key2 = CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL;
            key2.getClass();
            Integer num2 = (Integer) ((qc0) lg0Var).c(key2);
            if (num2 != null) {
                i2 = num2.intValue();
            }
        }
        this.g = i2;
        if (i >= 35) {
            key = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
            key.getClass();
            Integer num3 = (Integer) ((qc0) lg0Var).c(key);
        }
        this.h = new qx3(Integer.valueOf(i2));
    }

    public final tu0 a(int i, boolean z, boolean z2) {
        boolean z3;
        int i2;
        jg1 e;
        op6 op6Var = this.a;
        if (kj2.F("CXCP")) {
            StringBuilder sb = new StringBuilder("TorchControl#setTorchAsync: torch mode = ");
            sb.append((Object) ("TorchMode(value=" + i + ')'));
            Log.d("CXCP", sb.toString());
        }
        tu0 tu0Var = new tu0();
        if (!z2 && !this.c) {
            tu0Var.v0(new IllegalStateException("No flash unit"));
            return tu0Var;
        }
        li7 li7Var = this.b;
        if (li7Var != null) {
            c(i);
            tu0 tu0Var2 = this.i;
            Integer num = null;
            if (z) {
                if (tu0Var2 != null) {
                    i61.A("There is a new enableTorch being set", tu0Var2);
                }
                this.i = null;
            } else if (tu0Var2 != null) {
                nc1.a0(tu0Var, tu0Var2);
            }
            this.i = tu0Var;
            boolean z4 = false;
            if (i == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                num = 1;
            }
            synchronized (op6Var.d) {
                op6Var.k = num;
            }
            op6Var.f();
            List list = oa.b;
            oa N = nc1.N(op6Var.e());
            if (N != null) {
                i2 = N.a;
            } else {
                if (kj2.L()) {
                    Log.w("CXCP", "TorchControl#setTorchAsync: Failed to convert ae mode of value " + op6Var.e() + " with AeMode.fromIntOrNull, fallback to AeMode.ON");
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
                e = li7Var.a();
            } else {
                e = li7Var.e(i2);
            }
            h37 h37Var = new h37(5);
            e.getClass();
            ((ed3) e).a0(new t00(e, tu0Var, h37Var, 6));
            return tu0Var;
        }
        i61.A("Camera is not active.", tu0Var);
        return tu0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r3.intValue() == 1) goto L7;
     */
    @Override // defpackage.gi7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(li7 li7Var) {
        int i;
        this.b = li7Var;
        if (this.d != null) {
            Integer num = (Integer) this.e.c();
            if (num != null) {
                i = 1;
            }
            i = 0;
            a(i, false, false);
        }
    }

    public final void c(int i) {
        this.d = new q87(i);
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        boolean x = nj2.x();
        s94 s94Var = this.e;
        if (x) {
            s94Var.f(Integer.valueOf(i2));
        } else {
            s94Var.g(Integer.valueOf(i2));
        }
    }

    public final void d(int i) {
        CaptureRequest.Key key;
        jg1 b;
        tu0 tu0Var = new tu0();
        if (Build.VERSION.SDK_INT >= 35 && this.f) {
            tu0 tu0Var2 = this.j;
            if (tu0Var2 != null) {
                if (tu0Var2 != null) {
                    i61.A("There is a new torch strength being set", tu0Var2);
                }
                this.j = null;
            }
            this.j = tu0Var;
            tu0Var.a0(new ro5(this, 22));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            key = CaptureRequest.FLASH_STRENGTH_LEVEL;
            linkedHashMap.put(key, Integer.valueOf(i));
            li7 li7Var = this.b;
            if (li7Var != null && (b = li7.b(li7Var, linkedHashMap)) != null) {
                nc1.a0(b, tu0Var);
                return;
            } else {
                i61.A("Camera is not active.", tu0Var);
                return;
            }
        }
        tu0Var.v0(new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
    }

    @Override // defpackage.gi7
    public final void reset() {
        tu0 tu0Var = this.i;
        if (tu0Var != null) {
            i61.A("There is a new enableTorch being set", tu0Var);
        }
        this.i = null;
        tu0 tu0Var2 = this.j;
        if (tu0Var2 != null) {
            i61.A("There is a new torch strength being set", tu0Var2);
        }
        this.j = null;
        if (this.d != null) {
            c(0);
            a(0, true, false);
            this.d = null;
        }
    }
}
