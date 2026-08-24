package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a32  reason: default package */
/* loaded from: classes.dex */
public final class a32 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ vr4 Z;
    public final /* synthetic */ sz1 d0;
    public final /* synthetic */ String e0;
    public final /* synthetic */ String f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a32(vr4 vr4Var, sz1 sz1Var, String str, String str2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = vr4Var;
        this.d0 = sz1Var;
        this.e0 = str;
        this.f0 = str2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((a32) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((a32) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new a32(this.Z, this.d0, this.e0, this.f0, r41Var, 0);
            default:
                return new a32(this.Z, this.d0, this.e0, this.f0, r41Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r14.q(r13) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
        if (r14 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [ed3, tu0] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                sz1 sz1Var = this.d0;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oi2.Y(obj);
                            sz1Var.G0("hardcore_queue_session_closed", new vr4("reason", this.f0), new vr4("discarded", new Integer(((Number) obj).intValue())));
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    tu0 tu0Var = (tu0) this.Z.A;
                    if (tu0Var != null) {
                        this.Y = 1;
                        break;
                    }
                }
                iw2 iw2Var = sz1Var.o0;
                this.Y = 2;
                obj = iw2Var.d(this.e0, this);
                break;
            default:
                vr4 vr4Var = this.Z;
                ?? r12 = vr4Var.B;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        kg4 kg4Var = kg4.B;
                        a32 a32Var = new a32(vr4Var, this.d0, this.e0, this.f0, null, 0);
                        this.Y = 1;
                        if (hv.d0(kg4Var, a32Var, this) == x61Var2) {
                            return x61Var2;
                        }
                    }
                    r12 = (tu0) r12;
                    r12.b0(jg7Var);
                    return jg7Var;
                } catch (Throwable th) {
                    ((tu0) r12).b0(jg7Var);
                    throw th;
                }
        }
    }
}
