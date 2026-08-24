package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mc7  reason: default package */
/* loaded from: classes.dex */
public final class mc7 extends hw6 implements eo2 {
    public ci4[] X;
    public nc7 Y;
    public d97 Z;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public final /* synthetic */ ci4[] h0;
    public final /* synthetic */ nc7 i0;
    public final /* synthetic */ d97 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc7(ci4[] ci4VarArr, nc7 nc7Var, d97 d97Var, r41 r41Var) {
        super(2, r41Var);
        this.h0 = ci4VarArr;
        this.i0 = nc7Var;
        this.j0 = d97Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((mc7) q((r41) obj2, (bt4) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new mc7(this.h0, this.i0, this.j0, r41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (defpackage.nc7.d(r8, r7, r13, r12) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (defpackage.nc7.c(r8, r7, r13, r12) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:20:0x005c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0077 -> B:27:0x0078). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int length;
        int i;
        d97 d97Var;
        ci4[] ci4VarArr;
        int i2;
        nc7 nc7Var;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i3 = this.g0;
        if (i3 != 0) {
            if (i3 == 1 || i3 == 2) {
                length = this.f0;
                i = this.e0;
                int i4 = this.d0;
                d97Var = this.Z;
                nc7Var = this.Y;
                ci4VarArr = this.X;
                oi2.Y(obj);
                i2 = i4;
                i++;
                if (i >= length) {
                    int i5 = i2 + 1;
                    int i6 = lc7.a[ci4VarArr[i].ordinal()];
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                this.X = ci4VarArr;
                                this.Y = nc7Var;
                                this.Z = d97Var;
                                this.d0 = i5;
                                this.e0 = i;
                                this.f0 = length;
                                this.g0 = 2;
                            } else {
                                i.d();
                                return null;
                            }
                        } else {
                            this.X = ci4VarArr;
                            this.Y = nc7Var;
                            this.Z = d97Var;
                            this.d0 = i5;
                            this.e0 = i;
                            this.f0 = length;
                            this.g0 = 1;
                        }
                        i2 = i4;
                        i++;
                        if (i >= length) {
                        }
                    } else {
                        i2 = i5;
                        i++;
                        if (i >= length) {
                            return jg7.a;
                        }
                    }
                }
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            ci4[] ci4VarArr2 = this.h0;
            length = ci4VarArr2.length;
            i = 0;
            nc7 nc7Var2 = this.i0;
            d97Var = this.j0;
            ci4VarArr = ci4VarArr2;
            i2 = 0;
            nc7Var = nc7Var2;
            if (i >= length) {
            }
        }
    }
}
