package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs7  reason: default package */
/* loaded from: classes.dex */
public final class hs7 extends hw6 implements eo2 {
    public nh2 X;
    public int Y;
    public int Z;
    public int d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ nh2 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs7(nh2 nh2Var, r41 r41Var) {
        super(2, r41Var);
        this.f0 = nh2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((hs7) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        hs7 hs7Var = new hs7(this.f0, r41Var);
        hs7Var.e0 = obj;
        return hs7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0050 -> B:20:0x0053). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        nh2 nh2Var;
        int i;
        int i2;
        Object em5Var;
        w61 w61Var = (w61) this.e0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i3 = this.d0;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = this.Z;
                i = this.Y;
                nh2Var = this.X;
                oi2.Y(obj);
                i2++;
                if (i2 < i) {
                    try {
                    } catch (Throwable th) {
                        em5Var = new em5(th);
                    }
                    em5Var = Boolean.valueOf(nh2.a(nh2Var));
                    if (em5Var instanceof em5) {
                        this.e0 = w61Var;
                        this.X = nh2Var;
                        this.Y = i;
                        this.Z = i2;
                        this.d0 = 1;
                        if (q60.t(30L, this) == x61Var) {
                            return x61Var;
                        }
                        i2++;
                        if (i2 < i) {
                        }
                    }
                }
                return jg7.a;
            }
            i.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oi2.Y(obj);
        nh2Var = this.f0;
        i = 12;
        i2 = 0;
        if (i2 < i) {
        }
        return jg7.a;
    }
}
