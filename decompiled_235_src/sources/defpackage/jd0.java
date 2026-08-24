package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jd0  reason: default package */
/* loaded from: classes.dex */
public final class jd0 implements c82, yi7 {
    public final /* synthetic */ int A;
    public final da4 B;

    public jd0(da4 da4Var, int i) {
        this.A = i;
        switch (i) {
            case 4:
                this.B = da4Var;
                xx xxVar = kz6.D;
                Class cls = (Class) da4Var.b(xxVar, null);
                if (cls != null && !cls.equals(d23.class)) {
                    fa6.f("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                da4Var.m(zi7.T, bj7.IMAGE_CAPTURE);
                da4Var.m(xxVar, d23.class);
                xx xxVar2 = kz6.C;
                if (da4Var.b(xxVar2, null) == null) {
                    da4Var.m(xxVar2, d23.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 5:
                this.B = da4Var;
                xx xxVar3 = kz6.D;
                Class cls2 = (Class) da4Var.b(xxVar3, null);
                if (cls2 != null && !cls2.equals(p25.class)) {
                    fa6.f("Invalid target class configuration for ", this, ": ", cls2);
                    throw null;
                }
                da4Var.m(zi7.T, bj7.PREVIEW);
                da4Var.m(xxVar3, p25.class);
                xx xxVar4 = kz6.C;
                if (da4Var.b(xxVar4, null) == null) {
                    da4Var.m(xxVar4, p25.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                xx xxVar5 = n23.r;
                if (((Integer) da4Var.b(xxVar5, -1)).intValue() == -1) {
                    da4Var.m(xxVar5, 2);
                    return;
                }
                return;
            case 6:
                this.B = da4Var;
                xx xxVar6 = kz6.D;
                Class cls3 = (Class) da4Var.b(xxVar6, null);
                if (cls3 != null && !cls3.equals(pr6.class)) {
                    fa6.f("Invalid target class configuration for ", this, ": ", cls3);
                    throw null;
                }
                da4Var.m(zi7.T, bj7.STREAM_SHARING);
                da4Var.m(xxVar6, pr6.class);
                xx xxVar7 = kz6.C;
                if (da4Var.b(xxVar7, null) == null) {
                    da4Var.m(xxVar7, pr6.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            default:
                this.B = da4Var;
                xx xxVar8 = kz6.D;
                Class cls4 = (Class) da4Var.b(xxVar8, null);
                if (cls4 != null && !cls4.equals(r13.class)) {
                    fa6.f("Invalid target class configuration for ", this, ": ", cls4);
                    throw null;
                }
                da4Var.m(zi7.T, bj7.IMAGE_ANALYSIS);
                da4Var.m(xxVar8, r13.class);
                xx xxVar9 = kz6.C;
                if (da4Var.b(xxVar9, null) == null) {
                    da4Var.m(xxVar9, r13.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kd0, os0] */
    public kd0 a() {
        return new os0(go4.a(this.B));
    }

    public void b(yy0 yy0Var) {
        yy0Var.getClass();
        for (xx xxVar : yy0Var.c()) {
            xxVar.getClass();
            this.B.l(xxVar, yy0Var.j(xxVar), yy0Var.e(xxVar));
        }
    }

    @Override // defpackage.c82
    public da4 f() {
        int i = this.A;
        da4 da4Var = this.B;
        switch (i) {
            case 0:
                throw null;
            case 1:
            case 3:
            case 4:
            case 5:
            default:
                return da4Var;
            case 2:
                throw null;
        }
    }

    @Override // defpackage.yi7
    public zi7 h() {
        int i = this.A;
        da4 da4Var = this.B;
        switch (i) {
            case 3:
                return new v13(go4.a(da4Var));
            case 4:
                return new e23(go4.a(da4Var));
            case 5:
                return new q25(go4.a(da4Var));
            default:
                return new qr6(go4.a(da4Var));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jd0(int i) {
        this(da4.d(), 5);
        this.A = i;
        switch (i) {
            case 1:
                da4 d = da4.d();
                this.B = d;
                xx xxVar = kz6.D;
                Class cls = (Class) d.b(xxVar, null);
                if (cls != null && !cls.equals(gj0.class)) {
                    fa6.f("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                d.m(xxVar, gj0.class);
                xx xxVar2 = kz6.C;
                if (d.b(xxVar2, null) == null) {
                    d.m(xxVar2, gj0.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.B = da4.d();
                return;
            case 3:
                this(da4.d(), 3);
                return;
            case 4:
                this(da4.d(), 4);
                return;
            case 5:
                return;
            default:
                this.B = da4.d();
                return;
        }
    }
}
