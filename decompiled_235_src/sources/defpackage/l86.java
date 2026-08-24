package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l86  reason: default package */
/* loaded from: classes.dex */
public final class l86 extends hw6 implements eo2 {
    public long X;
    public int Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ m86 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l86(m86 m86Var, r41 r41Var) {
        super(2, r41Var);
        this.d0 = m86Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        long j = ((ol7) obj).a;
        l86 l86Var = new l86(this.d0, (r41) obj2);
        l86Var.Z = j;
        return l86Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        l86 l86Var = new l86(this.d0, r41Var);
        l86Var.Z = ((ol7) obj).a;
        return l86Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r15 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        m86 m86Var = this.d0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        j4 = this.X;
                        j3 = this.Z;
                        oi2.Y(obj);
                        return new ol7(ol7.d(j3, ol7.d(j4, ((ol7) obj).a)));
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = this.X;
                j = this.Z;
                oi2.Y(obj);
                long j5 = ((ol7) obj).a;
                eb ebVar = m86Var.f;
                long d = ol7.d(j2, j5);
                this.Z = j;
                this.X = j5;
                this.Y = 3;
                obj = ebVar.x(d, j5, this);
                if (obj != x61Var) {
                    j3 = j;
                    j4 = j5;
                    return new ol7(ol7.d(j3, ol7.d(j4, ((ol7) obj).a)));
                }
                return x61Var;
            }
            j = this.Z;
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            j = this.Z;
            eb ebVar2 = m86Var.f;
            this.Z = j;
            this.Y = 1;
            obj = ebVar2.y(j, this);
        }
        long d2 = ol7.d(j, ((ol7) obj).a);
        this.Z = j;
        this.X = d2;
        this.Y = 2;
        obj = m86Var.a(d2, this);
        if (obj != x61Var) {
            j2 = d2;
            long j52 = ((ol7) obj).a;
            eb ebVar3 = m86Var.f;
            long d3 = ol7.d(j2, j52);
            this.Z = j;
            this.X = j52;
            this.Y = 3;
            obj = ebVar3.x(d3, j52, this);
            if (obj != x61Var) {
            }
        }
        return x61Var;
    }
}
