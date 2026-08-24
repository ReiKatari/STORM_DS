package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed1  reason: default package */
/* loaded from: classes.dex */
public final class ed1 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ gn Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ fd1 e0;
    public final /* synthetic */ t93 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed1(gn gnVar, float f, boolean z, fd1 fd1Var, t93 t93Var, r41 r41Var) {
        super(2, r41Var);
        this.Y = gnVar;
        this.Z = f;
        this.d0 = z;
        this.e0 = fd1Var;
        this.f0 = t93Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((ed1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new ed1(this.Y, this.Z, this.d0, this.e0, this.f0, r41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r9.e(r8, r1) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (defpackage.ms1.a(r9, r5, r2, r8.f0, r8) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        l25 l25Var = null;
        if (i != 0) {
            if (i != 1 && i != 2) {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            gn gnVar = this.Y;
            float f = ((om1) gnVar.e.getValue()).A;
            float f2 = this.Z;
            if (!om1.b(f, f2)) {
                if (!this.d0) {
                    om1 om1Var = new om1(f2);
                    this.X = 1;
                } else {
                    float f3 = ((om1) gnVar.e.getValue()).A;
                    if (om1.b(f3, 8.0f)) {
                        l25Var = new l25(0L);
                    } else if (om1.b(f3, 4.0f)) {
                        l25Var = new Object();
                    } else if (om1.b(f3, 4.0f)) {
                        l25Var = new Object();
                    }
                    this.X = 2;
                }
            }
        }
        return jg7.a;
    }
}
