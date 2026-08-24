package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oq2  reason: default package */
/* loaded from: classes.dex */
public final class oq2 extends hw6 implements eo2 {
    public final /* synthetic */ qq2 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ kq2 Z;
    public final /* synthetic */ float d0;
    public final /* synthetic */ String e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq2(float f, r41 r41Var, kq2 kq2Var, qq2 qq2Var, String str, String str2) {
        super(2, r41Var);
        this.X = qq2Var;
        this.Y = str;
        this.Z = kq2Var;
        this.d0 = f;
        this.e0 = str2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        jg7 jg7Var = jg7.a;
        ((oq2) q((r41) obj2, (w61) obj)).s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new oq2(this.d0, r41Var, this.Z, this.X, this.Y, this.e0);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        Set set = qq2.i;
        this.X.e(this.Y, this.Z, this.d0, this.e0);
        return jg7.a;
    }
}
