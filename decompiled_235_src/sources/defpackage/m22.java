package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m22  reason: default package */
/* loaded from: classes.dex */
public final class m22 extends hw6 implements qn2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Serializable e0;
    public final /* synthetic */ Serializable f0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m22(Object obj, Object obj2, Serializable serializable, Serializable serializable2, Object obj3, r41 r41Var, int i) {
        super(1, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
        this.e0 = serializable;
        this.f0 = serializable2;
        this.g0 = obj3;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.g0;
        Serializable serializable = this.f0;
        Serializable serializable2 = this.e0;
        Object obj3 = this.d0;
        Object obj4 = this.Z;
        switch (i) {
            case 0:
                return new m22((sz1) obj4, (zg5) obj3, (String) serializable2, (String) serializable, (nv4) obj2, (r41) obj, 0).s(jg7Var);
            default:
                return new m22((bn5) obj4, (ea5) obj3, (ArrayList) serializable2, (ArrayList) serializable, (ArrayList) obj2, (r41) obj, 1).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object b;
        hb5 hb5Var;
        String str;
        int i = this.X;
        Object obj2 = this.g0;
        Serializable serializable = this.f0;
        Serializable serializable2 = this.e0;
        Object obj3 = this.d0;
        Object obj4 = this.Z;
        boolean z = true;
        String str2 = null;
        switch (i) {
            case 0:
                sz1 sz1Var = (sz1) obj4;
                zg5 zg5Var = (zg5) obj3;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        b = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    pn5 pn5Var = sz1Var.g;
                    this.Y = 1;
                    b = ((pl) pn5Var).c.b(this);
                    if (b == x61Var) {
                        return x61Var;
                    }
                }
                if (b instanceof hb5) {
                    hb5Var = (hb5) b;
                } else {
                    hb5Var = null;
                }
                String str3 = (String) serializable2;
                String str4 = (String) serializable;
                if (hb5Var != null) {
                    str = hb5Var.a;
                } else {
                    str = null;
                }
                if (hb5Var != null) {
                    str2 = hb5Var.b;
                }
                z = (qs6.v0(str3) || qs6.v0(str4) || !str3.equals(str) || !str4.equals(str2)) ? false : false;
                zg5Var.A = z;
                sz1Var.G0("ra_logout_identity_checked", new vr4("identity_match", Boolean.valueOf(z)), new vr4("submission_allowed", Boolean.FALSE), new vr4("pending_total", new Integer(((bv4) ((nv4) obj2).i.A.getValue()).c.a)));
                return Boolean.valueOf(zg5Var.A);
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    if (vm5.F((bn5) obj4, (ea5) obj3, (ArrayList) serializable2, (ArrayList) serializable, (ArrayList) obj2, this) == x61Var2) {
                        return x61Var2;
                    }
                }
                return jg7.a;
        }
    }
}
