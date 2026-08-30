package defpackage;

import java.io.IOException;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lt2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lt2 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pt2 B;
    public final /* synthetic */ int L;

    public /* synthetic */ lt2(pt2 pt2Var, int i, List list, boolean z) {
        this.A = 2;
        this.B = pt2Var;
        this.L = i;
    }

    @Override // defpackage.ki2
    public final Object c() {
        switch (this.A) {
            case 0:
                pt2 pt2Var = this.B;
                int i = this.L;
                pt2Var.f0.getClass();
                try {
                    pt2Var.r0.C(i, l12.CANCEL);
                    synchronized (pt2Var) {
                        pt2Var.t0.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return o27.a;
            case 1:
                pt2 pt2Var2 = this.B;
                int i2 = this.L;
                pt2Var2.f0.getClass();
                synchronized (pt2Var2) {
                    pt2Var2.t0.remove(Integer.valueOf(i2));
                }
                return o27.a;
            default:
                pt2 pt2Var3 = this.B;
                int i3 = this.L;
                pt2Var3.f0.getClass();
                try {
                    pt2Var3.r0.C(i3, l12.CANCEL);
                    synchronized (pt2Var3) {
                        pt2Var3.t0.remove(Integer.valueOf(i3));
                    }
                } catch (IOException unused2) {
                }
                return o27.a;
        }
    }

    public /* synthetic */ lt2(pt2 pt2Var, int i, Object obj, int i2) {
        this.A = i2;
        this.B = pt2Var;
        this.L = i;
    }
}
