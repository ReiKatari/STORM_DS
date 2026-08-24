package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xy5  reason: default package */
/* loaded from: classes.dex */
public final class xy5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xy5(r41 r41Var, Object obj, Object obj2, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((xy5) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((xy5) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                ((xy5) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            case 3:
                ((xy5) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            case 4:
                ((xy5) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            default:
                ((xy5) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.Z;
        switch (i) {
            case 0:
                return new xy5((a) this.Y, (Uri) obj2, r41Var, 0);
            case 1:
                xy5 xy5Var = new xy5((eo2) obj2, r41Var);
                xy5Var.Y = obj;
                return xy5Var;
            case 2:
                return new xy5((gf6) this.Y, (if6) obj2, r41Var, 2);
            case 3:
                return new xy5(r41Var, (Set) this.Y, (op6) obj2, 3);
            case 4:
                return new xy5(r41Var, (op6) this.Y, (ch5) obj2, 4);
            default:
                return new xy5((tc6) this.Y, (hg1) obj2, r41Var, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (r5 != 3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        rc6 rc6Var;
        int i;
        op6 op6Var;
        ek0 ek0Var;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        Integer num;
        int i4;
        List k1;
        int i5 = 0;
        Integer num2 = null;
        switch (this.X) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                l06 l06Var = ((a) this.Y).Y;
                if (l06Var != null) {
                    return Boolean.valueOf(l06Var.c((Uri) this.Z));
                }
                nb3.a0("romSaveFileManager");
                throw null;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                j61 Z = ((w61) this.Y).A().Z(d90.r0);
                Z.getClass();
                n61 n61Var = (n61) Z;
                tu0 tu0Var = new tu0();
                hv.K(ms2.A, n61Var, a71.UNDISPATCHED, new vy5(tu0Var, (eo2) this.Z, (r41) null, 2));
                while (!tu0Var.W()) {
                    try {
                        return hv.V(n61Var, new bc0(tu0Var, null, 1));
                    } catch (InterruptedException unused) {
                    }
                }
                return tu0Var.J();
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                gf6 gf6Var = (gf6) this.Y;
                if (gf6Var.b().isEmpty()) {
                    gf6Var.b.d0.remove(gf6Var.a);
                }
                return jg7.a;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (!((Set) this.Y).isEmpty()) {
                    tc6 tc6Var = new tc6((Set) this.Y, true);
                    if (((pc6) tc6Var.e.getValue()).c()) {
                        rc6Var = (rc6) tc6Var.f.getValue();
                    } else {
                        rc6Var = null;
                    }
                    if (rc6Var != null && (ek0Var = rc6Var.g) != null) {
                        int i6 = ek0Var.c;
                        Integer valueOf = Integer.valueOf(i6);
                        if (i6 != -1) {
                            num2 = valueOf;
                        }
                        if (num2 != null) {
                            i = num2.intValue();
                            synchronized (((op6) this.Z).d) {
                                op6Var = (op6) this.Z;
                                if (op6Var.i != i) {
                                    op6Var.i = i;
                                    i5 = 1;
                                }
                            }
                            if (i5 != 0) {
                                op6Var.f();
                            }
                        }
                    }
                    i = 1;
                    synchronized (((op6) this.Z).d) {
                    }
                }
                return jg7.a;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                op6 op6Var2 = (op6) this.Y;
                long j = ((ch5) this.Z).A;
                li7 li7Var = op6Var2.e;
                if (li7Var == null) {
                    op6Var2.c(new Exception("Camera is not active."));
                } else {
                    synchronized (op6Var2.d) {
                        if (j == op6Var2.g) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        synchronized (op6Var2.d) {
                            i2 = op6Var2.h;
                            i3 = op6Var2.i;
                            z2 = op6Var2.j;
                            num = op6Var2.k;
                        }
                        int d = op6Var2.d(i2, z2, num);
                        int i7 = 4;
                        if (i3 != 1) {
                            i4 = 3;
                            break;
                        }
                        i4 = 4;
                        vr4 vr4Var = new vr4(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(mb3.F(op6Var2.a.b, d)));
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
                        lg0 lg0Var = op6Var2.a.b;
                        lg0Var.getClass();
                        if (mb3.C(lg0Var).contains(Integer.valueOf(i4))) {
                            i7 = i4;
                        } else if (!mb3.C(lg0Var).contains(4)) {
                            if (mb3.C(lg0Var).contains(1)) {
                                i7 = 1;
                            } else {
                                i7 = 0;
                            }
                        }
                        vr4 vr4Var2 = new vr4(key, Integer.valueOf(i7));
                        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
                        lg0 lg0Var2 = op6Var2.a.b;
                        lg0Var2.getClass();
                        if (mb3.D(lg0Var2).contains(1) || mb3.D(lg0Var2).contains(1)) {
                            i5 = 1;
                        }
                        try {
                            jg1 h = li7Var.h(c14.m0(vr4Var, vr4Var2, new vr4(key2, Integer.valueOf(i5))), ki7.DEFAULT, ji7.b);
                            synchronized (op6Var2.d) {
                                k1 = gt0.k1(op6Var2.f);
                            }
                            ((ed3) h).a0(new qk4(19, k1, op6Var2));
                        } catch (Exception e) {
                            op6Var2.c(e);
                        }
                    }
                }
                return jg7.a;
            default:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ig1 ig1Var = ((hg1) this.Z).A;
                ig1Var.getClass();
                ((tc6) this.Y).a(ig1Var);
                return jg7.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy5(eo2 eo2Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 1;
        this.Z = eo2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xy5(Object obj, Object obj2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = obj;
        this.Z = obj2;
    }
}
