package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sd0  reason: default package */
/* loaded from: classes.dex */
public final class sd0 implements td0, m37 {
    public final je0 A;
    public final an1 B;
    public final jf0 L;
    public final af0 R;
    public final nf6 X;
    public final il6 Y;

    public sd0(je0 je0Var, an1 an1Var, jf0 jf0Var, nc0 nc0Var, rb0 rb0Var, ic2 ic2Var, af0 af0Var, nz1 nz1Var, nf6 nf6Var, z43 z43Var, ci3 ci3Var) {
        String str;
        je0Var.getClass();
        an1Var.getClass();
        jf0Var.getClass();
        nc0Var.getClass();
        rb0Var.getClass();
        ic2Var.getClass();
        af0Var.getClass();
        nz1Var.getClass();
        nf6Var.getClass();
        z43Var.getClass();
        ci3Var.getClass();
        this.A = je0Var;
        this.B = an1Var;
        this.L = jf0Var;
        this.R = af0Var;
        this.X = nf6Var;
        ce0 ce0Var = je0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        ia0 ia0Var = (ia0) ce0Var;
        ia0Var.getClass();
        Object c = ia0Var.c(key);
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
        if (ve2.F()) {
            Log.i("CXCP", "Device Level: ".concat(str));
        }
        new il6(new ki2(this) { // from class: rd0
            public final /* synthetic */ sd0 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                sd0 sd0Var = this.B;
                switch (i) {
                    case 0:
                        je0 je0Var2 = sd0Var.A;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (od0 od0Var : (Set) ((ia0) je0Var2.b).c0.getValue()) {
                            String str2 = od0Var.a;
                            an1 an1Var2 = new an1(str2);
                            ia0 ia0Var2 = (ia0) je0Var2.b;
                            ia0Var2.getClass();
                            if (((Set) ia0Var2.c0.getValue()).contains(new od0(str2))) {
                                linkedHashSet.add(new hn4(new je0(an1Var2, ia0Var2.L.d(str2))));
                            } else {
                                String b = od0.b(str2);
                                throw new IllegalStateException((((Object) b) + " is not a valid physical camera on " + ia0Var2).toString());
                            }
                        }
                        return linkedHashSet;
                    case 1:
                        be0 be0Var = ce0.g;
                        ce0 ce0Var2 = sd0Var.A.b;
                        be0Var.getClass();
                        return Boolean.valueOf(be0.c(ce0Var2));
                    default:
                        je0 je0Var3 = sd0Var.A;
                        je0Var3.getClass();
                        Object obj = new Object();
                        String str3 = je0Var3.a.B;
                        return obj;
                }
            }
        });
        new il6(new ki2(this) { // from class: rd0
            public final /* synthetic */ sd0 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                sd0 sd0Var = this.B;
                switch (i) {
                    case 0:
                        je0 je0Var2 = sd0Var.A;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (od0 od0Var : (Set) ((ia0) je0Var2.b).c0.getValue()) {
                            String str2 = od0Var.a;
                            an1 an1Var2 = new an1(str2);
                            ia0 ia0Var2 = (ia0) je0Var2.b;
                            ia0Var2.getClass();
                            if (((Set) ia0Var2.c0.getValue()).contains(new od0(str2))) {
                                linkedHashSet.add(new hn4(new je0(an1Var2, ia0Var2.L.d(str2))));
                            } else {
                                String b = od0.b(str2);
                                throw new IllegalStateException((((Object) b) + " is not a valid physical camera on " + ia0Var2).toString());
                            }
                        }
                        return linkedHashSet;
                    case 1:
                        be0 be0Var = ce0.g;
                        ce0 ce0Var2 = sd0Var.A.b;
                        be0Var.getClass();
                        return Boolean.valueOf(be0.c(ce0Var2));
                    default:
                        je0 je0Var3 = sd0Var.A;
                        je0Var3.getClass();
                        Object obj = new Object();
                        String str3 = je0Var3.a.B;
                        return obj;
                }
            }
        });
        this.Y = new il6(new ki2(this) { // from class: rd0
            public final /* synthetic */ sd0 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                sd0 sd0Var = this.B;
                switch (i) {
                    case 0:
                        je0 je0Var2 = sd0Var.A;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (od0 od0Var : (Set) ((ia0) je0Var2.b).c0.getValue()) {
                            String str2 = od0Var.a;
                            an1 an1Var2 = new an1(str2);
                            ia0 ia0Var2 = (ia0) je0Var2.b;
                            ia0Var2.getClass();
                            if (((Set) ia0Var2.c0.getValue()).contains(new od0(str2))) {
                                linkedHashSet.add(new hn4(new je0(an1Var2, ia0Var2.L.d(str2))));
                            } else {
                                String b = od0.b(str2);
                                throw new IllegalStateException((((Object) b) + " is not a valid physical camera on " + ia0Var2).toString());
                            }
                        }
                        return linkedHashSet;
                    case 1:
                        be0 be0Var = ce0.g;
                        ce0 ce0Var2 = sd0Var.A.b;
                        be0Var.getClass();
                        return Boolean.valueOf(be0.c(ce0Var2));
                    default:
                        je0 je0Var3 = sd0Var.A;
                        je0Var3.getClass();
                        Object obj = new Object();
                        String str3 = je0Var3.a.B;
                        return obj;
                }
            }
        });
    }

    @Override // defpackage.td0
    public final Set a() {
        return ((vm1) dt3.i0(this.A.b).B).a();
    }

    @Override // defpackage.qd0
    public final int b() {
        return g(0);
    }

    @Override // defpackage.qd0
    public final int c() {
        ce0 ce0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object c = ((ia0) ce0Var).c(key);
        c.getClass();
        int intValue = ((Number) c).intValue();
        if (intValue != 0) {
            int i = 1;
            if (intValue != 1) {
                i = 2;
                if (intValue != 2) {
                    if (ve2.I()) {
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

    @Override // defpackage.td0
    public final boolean e() {
        ce0 ce0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
        key.getClass();
        int[] iArr = (int[]) ((ia0) ce0Var).c(key);
        if (iArr != null && nu.Y(iArr, 1)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.td0
    public final String f() {
        return this.B.B;
    }

    @Override // defpackage.qd0
    public final int g(int i) {
        ce0 ce0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        key.getClass();
        Object c = ((ia0) ce0Var).c(key);
        c.getClass();
        int intValue = ((Number) c).intValue();
        int I = pu.I(i);
        boolean z = true;
        if (1 != c()) {
            z = false;
        }
        return pu.u(I, z, intValue);
    }

    @Override // defpackage.td0
    public final Object h() {
        Object p = ((ia0) this.A.b).p(q75.a(CameraCharacteristics.class));
        p.getClass();
        return (CameraCharacteristics) p;
    }

    @Override // defpackage.td0
    public final ox4 l() {
        return this.R.a();
    }

    @Override // defpackage.td0
    public final List m(int i) {
        Size[] a = this.X.a(i);
        if (a != null) {
            return nu.F0(a);
        }
        return pp1.A;
    }

    @Override // defpackage.td0
    public final Rect n() {
        ce0 ce0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Rect rect = (Rect) ((ia0) ce0Var).c(key);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        if (qo0Var.equals(q75.a(ga0.class))) {
            ga0 ga0Var = (ga0) this.Y.getValue();
            ga0Var.getClass();
            return ga0Var;
        }
        boolean equals = qo0Var.equals(q75.a(je0.class));
        je0 je0Var = this.A;
        if (equals) {
            je0Var.getClass();
            return je0Var;
        } else if (qo0Var.equals(q75.a(ce0.class))) {
            ce0 ce0Var = je0Var.b;
            ce0Var.getClass();
            return ce0Var;
        } else {
            return ((ia0) je0Var.b).p(qo0Var);
        }
    }

    @Override // defpackage.qd0
    public final pq3 q() {
        return this.L.c;
    }

    @Override // defpackage.td0
    public final Set r() {
        int length;
        ce0 ce0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((ia0) ce0Var).c(key);
        up1 up1Var = up1.A;
        if (iArr != null && (length = iArr.length) != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(zt3.j0(iArr.length));
                for (int i : iArr) {
                    linkedHashSet.add(Integer.valueOf(i));
                }
                return linkedHashSet;
            }
            return hi2.X(Integer.valueOf(iArr[0]));
        }
        return up1Var;
    }

    @Override // defpackage.td0
    public final Set t() {
        Integer[] s = this.X.c.s();
        if (s != null) {
            return nu.H0(s);
        }
        return up1.A;
    }

    public final String toString() {
        return "CameraInfoAdapter<" + this.B + ".cameraId>";
    }

    @Override // defpackage.td0
    public final boolean u() {
        be0 be0Var = ce0.g;
        ce0 ce0Var = this.A.b;
        be0Var.getClass();
        return be0.b(ce0Var);
    }
}
