package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iz1  reason: default package */
/* loaded from: classes.dex */
public final class iz1 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public final /* synthetic */ sz1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iz1(int i, r41 r41Var, sz1 sz1Var) {
        super(2, r41Var);
        this.X = i;
        this.Z = sz1Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                ((iz1) q(r41Var, bool)).s(jg7Var);
                return jg7Var;
            case 1:
                ((iz1) q(r41Var, bool)).s(jg7Var);
                return jg7Var;
            case 2:
                ((iz1) q(r41Var, bool)).s(jg7Var);
                return jg7Var;
            case 3:
                ((iz1) q(r41Var, bool)).s(jg7Var);
                return jg7Var;
            case 4:
                ((iz1) q(r41Var, bool)).s(jg7Var);
                return jg7Var;
            default:
                ((iz1) q(r41Var, bool)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        sz1 sz1Var = this.Z;
        switch (i) {
            case 0:
                iz1 iz1Var = new iz1(0, r41Var, sz1Var);
                iz1Var.Y = ((Boolean) obj).booleanValue();
                return iz1Var;
            case 1:
                iz1 iz1Var2 = new iz1(1, r41Var, sz1Var);
                iz1Var2.Y = ((Boolean) obj).booleanValue();
                return iz1Var2;
            case 2:
                iz1 iz1Var3 = new iz1(2, r41Var, sz1Var);
                iz1Var3.Y = ((Boolean) obj).booleanValue();
                return iz1Var3;
            case 3:
                iz1 iz1Var4 = new iz1(3, r41Var, sz1Var);
                iz1Var4.Y = ((Boolean) obj).booleanValue();
                return iz1Var4;
            case 4:
                iz1 iz1Var5 = new iz1(4, r41Var, sz1Var);
                iz1Var5.Y = ((Boolean) obj).booleanValue();
                return iz1Var5;
            default:
                iz1 iz1Var6 = new iz1(5, r41Var, sz1Var);
                iz1Var6.Y = ((Boolean) obj).booleanValue();
                return iz1Var6;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        sz1 sz1Var = this.Z;
        boolean z = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                tp6 tp6Var = sz1Var.V0;
                Boolean valueOf = Boolean.valueOf(z);
                tp6Var.getClass();
                tp6Var.m(null, valueOf);
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                tp6 tp6Var2 = sz1Var.Z0;
                Boolean valueOf2 = Boolean.valueOf(z);
                tp6Var2.getClass();
                tp6Var2.m(null, valueOf2);
                return jg7Var;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                tp6 tp6Var3 = sz1Var.b1;
                Boolean valueOf3 = Boolean.valueOf(z);
                tp6Var3.getClass();
                tp6Var3.m(null, valueOf3);
                return jg7Var;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                tp6 tp6Var4 = sz1Var.d1;
                Boolean valueOf4 = Boolean.valueOf(z);
                tp6Var4.getClass();
                tp6Var4.m(null, valueOf4);
                return jg7Var;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                tp6 tp6Var5 = sz1Var.f1;
                Boolean valueOf5 = Boolean.valueOf(z);
                tp6Var5.getClass();
                tp6Var5.m(null, valueOf5);
                return jg7Var;
            default:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                tp6 tp6Var6 = sz1Var.h1;
                Boolean valueOf6 = Boolean.valueOf(z);
                tp6Var6.getClass();
                tp6Var6.m(null, valueOf6);
                return jg7Var;
        }
    }
}
