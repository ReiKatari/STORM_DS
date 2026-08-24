package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ec0  reason: default package */
/* loaded from: classes.dex */
public final class ec0 implements jk5 {
    public final Object A = new Object();
    public final Object B = new Object();
    public jd0 L = new jd0(0);
    public tu0 R;
    public tu0 X;

    @Override // defpackage.jk5
    public final void J(yk5 yk5Var, long j, th thVar) {
        synchronized (this.B) {
            tu0 tu0Var = this.R;
            if (tu0Var != null) {
                if (nb3.k(((sy6) yk5Var.a(uy6.a, sy6.b)).a.get("Camera2CameraControl.tag"), Integer.valueOf(tu0Var.hashCode()))) {
                    tu0Var.b0(null);
                    this.R = null;
                    tu0 tu0Var2 = this.X;
                    if (tu0Var2 != null) {
                        tu0Var2.b0(null);
                        this.X = null;
                    }
                }
            }
        }
    }

    public final tu0 a(li7 li7Var, boolean z) {
        kd0 a;
        tu0 tu0Var = new tu0();
        synchronized (this.A) {
            a = this.L.a();
        }
        synchronized (this.B) {
            try {
                if (li7Var != null) {
                    tu0 tu0Var2 = this.R;
                    if (z) {
                        if (tu0Var2 != null) {
                            tu0Var2.v0(new Exception("Camera2CameraControl was updated with new options."));
                        }
                    } else if (tu0Var2 != null) {
                        nc1.a0(tu0Var, tu0Var2);
                    }
                    this.R = tu0Var;
                    Map singletonMap = Collections.singletonMap("Camera2CameraControl.tag", Integer.valueOf(tu0Var.hashCode()));
                    singletonMap.getClass();
                    li7Var.d(a, singletonMap);
                } else {
                    tu0 tu0Var3 = this.X;
                    if (tu0Var3 != null) {
                        tu0Var3.v0(new Exception("Camera2CameraControl was updated with new options."));
                    }
                    this.X = tu0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tu0Var;
    }
}
