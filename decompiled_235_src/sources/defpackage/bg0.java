package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bg0  reason: default package */
/* loaded from: classes.dex */
public final class bg0 implements cg0, hh7 {
    public final sg0 A;
    public final gr1 B;
    public final sh0 L;
    public final jh0 R;
    public final dr6 X;
    public final ex6 Y;

    public bg0(sg0 sg0Var, gr1 gr1Var, sh0 sh0Var, we0 we0Var, ae0 ae0Var, zg2 zg2Var, jh0 jh0Var, a42 a42Var, dr6 dr6Var, lb3 lb3Var, rr6 rr6Var) {
        String str;
        sg0Var.getClass();
        gr1Var.getClass();
        sh0Var.getClass();
        we0Var.getClass();
        ae0Var.getClass();
        zg2Var.getClass();
        jh0Var.getClass();
        a42Var.getClass();
        dr6Var.getClass();
        lb3Var.getClass();
        rr6Var.getClass();
        this.A = sg0Var;
        this.B = gr1Var;
        this.L = sh0Var;
        this.R = jh0Var;
        this.X = dr6Var;
        lg0 lg0Var = sg0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        qc0 qc0Var = (qc0) lg0Var;
        qc0Var.getClass();
        Object c = qc0Var.c(key);
        Integer num = c != null ? c : -1;
        if (num.intValue() == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (num.intValue() == 4) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        } else if (num.intValue() == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (num.intValue() == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (num.intValue() == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else {
            str = "Unknown value: " + num;
        }
        if (kj2.H()) {
            Log.i("CXCP", "Device Level: ".concat(str));
        }
        new ex6(new on2(this) { // from class: ag0
            public final /* synthetic */ bg0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                bg0 bg0Var = this.B;
                switch (i) {
                    case 0:
                        sg0 sg0Var2 = bg0Var.A;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (xf0 xf0Var : (Set) ((qc0) sg0Var2.b).d0.getValue()) {
                            String str2 = xf0Var.a;
                            gr1 gr1Var2 = new gr1(str2);
                            qc0 qc0Var2 = (qc0) sg0Var2.b;
                            qc0Var2.getClass();
                            if (((Set) qc0Var2.d0.getValue()).contains(new xf0(str2))) {
                                linkedHashSet.add(new mw4(new sg0(gr1Var2, qc0Var2.L.d(str2))));
                            } else {
                                String b = xf0.b(str2);
                                throw new IllegalStateException((((Object) b) + " is not a valid physical camera on " + qc0Var2).toString());
                            }
                        }
                        return linkedHashSet;
                    case 1:
                        kg0 kg0Var = lg0.g;
                        lg0 lg0Var2 = bg0Var.A.b;
                        kg0Var.getClass();
                        return Boolean.valueOf(kg0.c(lg0Var2));
                    default:
                        sg0 sg0Var3 = bg0Var.A;
                        sg0Var3.getClass();
                        Object obj = new Object();
                        String str3 = sg0Var3.a.B;
                        return obj;
                }
            }
        });
        new ex6(new on2(this) { // from class: ag0
            public final /* synthetic */ bg0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                bg0 bg0Var = this.B;
                switch (i) {
                    case 0:
                        sg0 sg0Var2 = bg0Var.A;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (xf0 xf0Var : (Set) ((qc0) sg0Var2.b).d0.getValue()) {
                            String str2 = xf0Var.a;
                            gr1 gr1Var2 = new gr1(str2);
                            qc0 qc0Var2 = (qc0) sg0Var2.b;
                            qc0Var2.getClass();
                            if (((Set) qc0Var2.d0.getValue()).contains(new xf0(str2))) {
                                linkedHashSet.add(new mw4(new sg0(gr1Var2, qc0Var2.L.d(str2))));
                            } else {
                                String b = xf0.b(str2);
                                throw new IllegalStateException((((Object) b) + " is not a valid physical camera on " + qc0Var2).toString());
                            }
                        }
                        return linkedHashSet;
                    case 1:
                        kg0 kg0Var = lg0.g;
                        lg0 lg0Var2 = bg0Var.A.b;
                        kg0Var.getClass();
                        return Boolean.valueOf(kg0.c(lg0Var2));
                    default:
                        sg0 sg0Var3 = bg0Var.A;
                        sg0Var3.getClass();
                        Object obj = new Object();
                        String str3 = sg0Var3.a.B;
                        return obj;
                }
            }
        });
        this.Y = new ex6(new on2(this) { // from class: ag0
            public final /* synthetic */ bg0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                bg0 bg0Var = this.B;
                switch (i) {
                    case 0:
                        sg0 sg0Var2 = bg0Var.A;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (xf0 xf0Var : (Set) ((qc0) sg0Var2.b).d0.getValue()) {
                            String str2 = xf0Var.a;
                            gr1 gr1Var2 = new gr1(str2);
                            qc0 qc0Var2 = (qc0) sg0Var2.b;
                            qc0Var2.getClass();
                            if (((Set) qc0Var2.d0.getValue()).contains(new xf0(str2))) {
                                linkedHashSet.add(new mw4(new sg0(gr1Var2, qc0Var2.L.d(str2))));
                            } else {
                                String b = xf0.b(str2);
                                throw new IllegalStateException((((Object) b) + " is not a valid physical camera on " + qc0Var2).toString());
                            }
                        }
                        return linkedHashSet;
                    case 1:
                        kg0 kg0Var = lg0.g;
                        lg0 lg0Var2 = bg0Var.A.b;
                        kg0Var.getClass();
                        return Boolean.valueOf(kg0.c(lg0Var2));
                    default:
                        sg0 sg0Var3 = bg0Var.A;
                        sg0Var3.getClass();
                        Object obj = new Object();
                        String str3 = sg0Var3.a.B;
                        return obj;
                }
            }
        });
    }

    @Override // defpackage.cg0
    public final Set a() {
        return ((br1) ak7.T(this.A.b).B).a();
    }

    @Override // defpackage.zf0
    public final int b() {
        return p(0);
    }

    @Override // defpackage.cg0
    public final boolean c() {
        lg0 lg0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
        key.getClass();
        int[] iArr = (int[]) ((qc0) lg0Var).c(key);
        if (iArr != null && fv.m0(iArr, 1)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cg0
    public final String d() {
        return this.B.B;
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        if (ar0Var.equals(gh5.a(oc0.class))) {
            oc0 oc0Var = (oc0) this.Y.getValue();
            oc0Var.getClass();
            return oc0Var;
        }
        boolean equals = ar0Var.equals(gh5.a(sg0.class));
        sg0 sg0Var = this.A;
        if (equals) {
            sg0Var.getClass();
            return sg0Var;
        } else if (ar0Var.equals(gh5.a(lg0.class))) {
            lg0 lg0Var = sg0Var.b;
            lg0Var.getClass();
            return lg0Var;
        } else {
            return ((qc0) sg0Var.b).e(ar0Var);
        }
    }

    @Override // defpackage.cg0
    public final Rect j() {
        lg0 lg0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Rect rect = (Rect) ((qc0) lg0Var).c(key);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // defpackage.zf0
    public final qx3 l() {
        return this.L.c;
    }

    @Override // defpackage.zf0
    public final int m() {
        lg0 lg0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object c = ((qc0) lg0Var).c(key);
        c.getClass();
        int intValue = ((Number) c).intValue();
        if (intValue != 0) {
            int i = 1;
            if (intValue != 1) {
                i = 2;
                if (intValue != 2) {
                    if (kj2.L()) {
                        Log.w("CXCP", "Unrecognized lens facing: " + intValue + '!');
                        return -1;
                    }
                    return -1;
                }
            }
            return i;
        }
        return 0;
    }

    @Override // defpackage.zf0
    public final int p(int i) {
        lg0 lg0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        key.getClass();
        Object c = ((qc0) lg0Var).c(key);
        c.getClass();
        int intValue = ((Number) c).intValue();
        int Z = nb3.Z(i);
        boolean z = true;
        if (1 != m()) {
            z = false;
        }
        return nb3.z(Z, z, intValue);
    }

    @Override // defpackage.cg0
    public final Object q() {
        Object e = ((qc0) this.A.b).e(gh5.a(CameraCharacteristics.class));
        e.getClass();
        return (CameraCharacteristics) e;
    }

    @Override // defpackage.cg0
    public final y65 s() {
        return this.R.a();
    }

    @Override // defpackage.cg0
    public final List t(int i) {
        Size[] a = this.X.a(i);
        if (a != null) {
            return fv.T0(a);
        }
        return yt1.A;
    }

    public final String toString() {
        return "CameraInfoAdapter<" + this.B + ".cameraId>";
    }

    @Override // defpackage.cg0
    public final Set w() {
        int length;
        lg0 lg0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((qc0) lg0Var).c(key);
        du1 du1Var = du1.A;
        if (iArr != null && (length = iArr.length) != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(c14.k0(iArr.length));
                for (int i : iArr) {
                    linkedHashSet.add(Integer.valueOf(i));
                }
                return linkedHashSet;
            }
            return ii2.R(Integer.valueOf(iArr[0]));
        }
        return du1Var;
    }

    @Override // defpackage.cg0
    public final Set y() {
        Integer[] w = this.X.c.w();
        if (w != null) {
            return fv.V0(w);
        }
        return du1.A;
    }

    @Override // defpackage.cg0
    public final boolean z() {
        kg0 kg0Var = lg0.g;
        lg0 lg0Var = this.A.b;
        kg0Var.getClass();
        return kg0.b(lg0Var);
    }
}
