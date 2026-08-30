package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: by1  reason: default package */
/* loaded from: classes.dex */
public final class by1 extends nk6 implements mi2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;
    public final /* synthetic */ Serializable d0;
    public final /* synthetic */ Serializable e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ by1(Object obj, Object obj2, Serializable serializable, Serializable serializable2, Object obj3, j11 j11Var, int i) {
        super(1, j11Var);
        this.X = i;
        this.Z = obj;
        this.c0 = obj2;
        this.d0 = serializable;
        this.e0 = serializable2;
        this.f0 = obj3;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        Object obj2 = this.f0;
        Serializable serializable = this.e0;
        Serializable serializable2 = this.d0;
        Object obj3 = this.c0;
        Object obj4 = this.Z;
        switch (i) {
            case 0:
                return new by1((hv1) obj4, (j75) obj3, (String) serializable2, (String) serializable, (jm4) obj2, (j11) obj, 0).v(o27Var);
            default:
                return new by1((hd5) obj4, (u05) obj3, (ArrayList) serializable2, (ArrayList) serializable, (ArrayList) obj2, (j11) obj, 1).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object b;
        x15 x15Var;
        String str;
        int i = this.X;
        Object obj2 = this.f0;
        Serializable serializable = this.e0;
        Serializable serializable2 = this.d0;
        Object obj3 = this.c0;
        Object obj4 = this.Z;
        boolean z = true;
        String str2 = null;
        switch (i) {
            case 0:
                hv1 hv1Var = (hv1) obj4;
                j75 j75Var = (j75) obj3;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        b = obj;
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    ud5 ud5Var = hv1Var.g;
                    this.Y = 1;
                    b = ((dl) ud5Var).c.b(this);
                    if (b == p31Var) {
                        return p31Var;
                    }
                }
                if (b instanceof x15) {
                    x15Var = (x15) b;
                } else {
                    x15Var = null;
                }
                String str3 = (String) serializable2;
                String str4 = (String) serializable;
                if (x15Var != null) {
                    str = x15Var.a;
                } else {
                    str = null;
                }
                if (x15Var != null) {
                    str2 = x15Var.b;
                }
                z = (zg6.B0(str3) || zg6.B0(str4) || !str3.equals(str) || !str4.equals(str2)) ? false : false;
                j75Var.A = z;
                hv1Var.I0("ra_logout_identity_checked", new ti4("identity_match", Boolean.valueOf(z)), new ti4("submission_allowed", Boolean.FALSE), new ti4("pending_total", new Integer(((yl4) ((jm4) obj2).i.A.getValue()).c.a)));
                return Boolean.valueOf(j75Var.A);
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    this.Y = 1;
                    if (bd5.F((hd5) obj4, (u05) obj3, (ArrayList) serializable2, (ArrayList) serializable, (ArrayList) obj2, this) == p31Var2) {
                        return p31Var2;
                    }
                }
                return o27.a;
        }
    }
}
