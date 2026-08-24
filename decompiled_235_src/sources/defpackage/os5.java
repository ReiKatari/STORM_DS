package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: os5  reason: default package */
/* loaded from: classes.dex */
public final class os5 extends hw6 implements eo2 {
    public int X;
    public int Y;
    public final /* synthetic */ ss5 Z;
    public final /* synthetic */ int d0;
    public final /* synthetic */ int e0;
    public final /* synthetic */ int f0;
    public final /* synthetic */ ip3 g0;
    public final /* synthetic */ pr3 h0;
    public final /* synthetic */ om6 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os5(ss5 ss5Var, int i, int i2, int i3, ip3 ip3Var, pr3 pr3Var, om6 om6Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = ss5Var;
        this.d0 = i;
        this.e0 = i2;
        this.f0 = i3;
        this.g0 = ip3Var;
        this.h0 = pr3Var;
        this.i0 = om6Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((os5) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new os5(this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, r41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (defpackage.pr3.l(r10.h0, r1, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
        if (defpackage.ip3.j(r10.g0, r1, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (defpackage.nw7.O(r10.Z, r10.e0, r10.g0, r10.h0, r10.i0, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        return r0;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.Y;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    oi2.Y(obj);
                    return jg7.a;
                }
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.X;
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            ss5 ss5Var = this.Z;
            n06 n06Var = ss5Var.f;
            int[] iArr = ns5.a;
            int i3 = iArr[n06Var.ordinal()];
            int i4 = this.e0;
            int i5 = this.d0;
            if (i3 != 1) {
                if (i3 != 2) {
                    i.d();
                    return null;
                }
            } else {
                i4 -= this.f0;
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            i = i5 + i4;
            int i6 = iArr[ss5Var.f.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    this.X = i;
                    this.Y = 2;
                } else {
                    i.d();
                    return null;
                }
            } else {
                this.X = i;
                this.Y = 1;
            }
            return jg7.a;
        }
        this.X = i;
        this.Y = 3;
    }
}
