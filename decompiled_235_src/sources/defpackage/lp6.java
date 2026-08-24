package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lp6  reason: default package */
/* loaded from: classes.dex */
public final class lp6 extends hw6 implements fo2 {
    public int X;
    public /* synthetic */ ne2 Y;
    public /* synthetic */ int Z;
    public final /* synthetic */ mp6 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp6(mp6 mp6Var, r41 r41Var) {
        super(3, r41Var);
        this.d0 = mp6Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        lp6 lp6Var = new lp6(this.d0, (r41) obj3);
        lp6Var.Y = (ne2) obj;
        lp6Var.Z = intValue;
        return lp6Var.s(jg7.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r13.a(r0, r12) == r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (r0.a(r13, r12) == r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (defpackage.q60.t(r1, r12) == r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r0.a(r13, r12) == r3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        ne2 ne2Var;
        mp6 mp6Var = this.d0;
        long j = mp6Var.B;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ne2Var = this.Y;
                            oi2.Y(obj);
                            ch6 ch6Var = ch6.STOP_AND_RESET_REPLAY_CACHE;
                            this.Y = null;
                            this.X = 5;
                        }
                    } else {
                        ne2Var = this.Y;
                        oi2.Y(obj);
                        this.Y = ne2Var;
                        this.X = 4;
                    }
                } else {
                    ne2Var = this.Y;
                    oi2.Y(obj);
                    if (j > 0) {
                        ch6 ch6Var2 = ch6.STOP;
                        this.Y = ne2Var;
                        this.X = 3;
                    }
                    ch6 ch6Var3 = ch6.STOP_AND_RESET_REPLAY_CACHE;
                    this.Y = null;
                    this.X = 5;
                }
            }
            oi2.Y(obj);
            return jg7.a;
        }
        oi2.Y(obj);
        ne2 ne2Var2 = this.Y;
        if (this.Z > 0) {
            ch6 ch6Var4 = ch6.START;
            this.X = 1;
        } else {
            long j2 = mp6Var.A;
            this.Y = ne2Var2;
            this.X = 2;
            if (q60.t(j2, this) != x61Var) {
                ne2Var = ne2Var2;
                if (j > 0) {
                }
                ch6 ch6Var32 = ch6.STOP_AND_RESET_REPLAY_CACHE;
                this.Y = null;
                this.X = 5;
            }
        }
        return x61Var;
    }
}
