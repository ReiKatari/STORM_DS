package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e0  reason: default package */
/* loaded from: classes.dex */
public final class e0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ r94 Z;
    public final /* synthetic */ l25 d0;
    public final /* synthetic */ h0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(r94 r94Var, l25 l25Var, h0 h0Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = r94Var;
        this.d0 = l25Var;
        this.e0 = h0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((e0) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((e0) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new e0(this.Z, this.d0, this.e0, r41Var, 0);
            default:
                return new e0(this.Z, this.d0, this.e0, r41Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (defpackage.q60.t(r4, r10) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r3.a(r8, r10) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        if (defpackage.q60.t(r4, r10) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (r3.a(r8, r10) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return r0;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        h0 h0Var = this.e0;
        r94 r94Var = this.Z;
        l25 l25Var = this.d0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oi2.Y(obj);
                            h0Var.B0 = l25Var;
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    long j = pr0.a;
                    this.Y = 1;
                    break;
                }
                this.Y = 2;
                break;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            oi2.Y(obj);
                            h0Var.x0 = l25Var;
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    long j2 = pr0.a;
                    this.Y = 1;
                    break;
                }
                this.Y = 2;
                break;
        }
    }
}
