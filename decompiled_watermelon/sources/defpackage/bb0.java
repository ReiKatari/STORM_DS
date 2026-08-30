package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bb0  reason: default package */
/* loaded from: classes.dex */
public final class bb0 implements k32, a57 {
    public final /* synthetic */ int A;
    public final x14 B;

    public bb0(x14 x14Var, int i) {
        this.A = i;
        switch (i) {
            case 4:
                this.B = x14Var;
                uw uwVar = an6.C;
                Class cls = (Class) x14Var.d(uwVar, null);
                if (cls != null && !cls.equals(zv2.class)) {
                    vd6.g("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                x14Var.r(b57.S, d57.IMAGE_CAPTURE);
                x14Var.r(uwVar, zv2.class);
                uw uwVar2 = an6.z;
                if (x14Var.d(uwVar2, null) == null) {
                    x14Var.r(uwVar2, zv2.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 5:
                this.B = x14Var;
                uw uwVar3 = an6.C;
                Class cls2 = (Class) x14Var.d(uwVar3, null);
                if (cls2 != null && !cls2.equals(nt4.class)) {
                    vd6.g("Invalid target class configuration for ", this, ": ", cls2);
                    throw null;
                }
                x14Var.r(b57.S, d57.PREVIEW);
                x14Var.r(uwVar3, nt4.class);
                uw uwVar4 = an6.z;
                if (x14Var.d(uwVar4, null) == null) {
                    x14Var.r(uwVar4, nt4.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                uw uwVar5 = jw2.r;
                if (((Integer) x14Var.d(uwVar5, -1)).intValue() == -1) {
                    x14Var.r(uwVar5, 2);
                    return;
                }
                return;
            case ig7.b /* 6 */:
                this.B = x14Var;
                uw uwVar6 = an6.C;
                Class cls3 = (Class) x14Var.d(uwVar6, null);
                if (cls3 != null && !cls3.equals(zf6.class)) {
                    vd6.g("Invalid target class configuration for ", this, ": ", cls3);
                    throw null;
                }
                x14Var.r(b57.S, d57.STREAM_SHARING);
                x14Var.r(uwVar6, zf6.class);
                uw uwVar7 = an6.z;
                if (x14Var.d(uwVar7, null) == null) {
                    x14Var.r(uwVar7, zf6.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            default:
                this.B = x14Var;
                uw uwVar8 = an6.C;
                Class cls4 = (Class) x14Var.d(uwVar8, null);
                if (cls4 != null && !cls4.equals(nv2.class)) {
                    vd6.g("Invalid target class configuration for ", this, ": ", cls4);
                    throw null;
                }
                x14Var.r(b57.S, d57.IMAGE_ANALYSIS);
                x14Var.r(uwVar8, nv2.class);
                uw uwVar9 = an6.z;
                if (x14Var.d(uwVar9, null) == null) {
                    x14Var.r(uwVar9, nv2.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bq0, cb0] */
    public cb0 a() {
        return new bq0(ef4.b(this.B));
    }

    @Override // defpackage.k32
    public x14 b() {
        int i = this.A;
        x14 x14Var = this.B;
        switch (i) {
            case 0:
                throw null;
            case 1:
            case 3:
            case 4:
            case 5:
            default:
                return x14Var;
            case 2:
                throw null;
        }
    }

    public void c(cw0 cw0Var) {
        cw0Var.getClass();
        for (uw uwVar : cw0Var.e()) {
            uwVar.getClass();
            this.B.m(uwVar, cw0Var.c(uwVar), cw0Var.g(uwVar));
        }
    }

    @Override // defpackage.a57
    public b57 d() {
        int i = this.A;
        x14 x14Var = this.B;
        switch (i) {
            case 3:
                return new rv2(ef4.b(x14Var));
            case 4:
                return new aw2(ef4.b(x14Var));
            case 5:
                return new ot4(ef4.b(x14Var));
            default:
                return new ag6(ef4.b(x14Var));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bb0(int i) {
        this(x14.f(), 5);
        this.A = i;
        switch (i) {
            case 1:
                x14 f = x14.f();
                this.B = f;
                uw uwVar = an6.C;
                Class cls = (Class) f.d(uwVar, null);
                if (cls != null && !cls.equals(xg0.class)) {
                    vd6.g("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                f.r(uwVar, xg0.class);
                uw uwVar2 = an6.z;
                if (f.d(uwVar2, null) == null) {
                    f.r(uwVar2, xg0.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.B = x14.f();
                return;
            case 3:
                this(x14.f(), 3);
                return;
            case 4:
                this(x14.f(), 4);
                return;
            case 5:
                return;
            default:
                this.B = x14.f();
                return;
        }
    }
}
