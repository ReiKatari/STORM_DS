package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f02  reason: default package */
/* loaded from: classes.dex */
public final class f02 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ sz1 Z;
    public final /* synthetic */ pq5 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f02(sz1 sz1Var, pq5 pq5Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = sz1Var;
        this.d0 = pq5Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((f02) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((f02) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((f02) q(r41Var, w61Var)).s(jg7Var);
            case 3:
                return ((f02) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((f02) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        pq5 pq5Var = this.d0;
        sz1 sz1Var = this.Z;
        switch (i) {
            case 0:
                return new f02(sz1Var, pq5Var, r41Var, 0);
            case 1:
                return new f02(sz1Var, pq5Var, r41Var, 1);
            case 2:
                return new f02(sz1Var, pq5Var, r41Var, 2);
            case 3:
                return new f02(sz1Var, pq5Var, r41Var, 3);
            default:
                return new f02(sz1Var, pq5Var, r41Var, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r10 == r0) goto L41;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        pq5 pq5Var = this.d0;
        sz1 sz1Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                pn5 pn5Var = sz1Var.g;
                String str = pq5Var.i;
                this.Y = 1;
                Object l = ((pl) pn5Var).l(str, this);
                if (l == x61Var) {
                    return x61Var;
                }
                return l;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                pn5 pn5Var2 = sz1Var.g;
                String str2 = pq5Var.i;
                this.Y = 1;
                Object l2 = ((pl) pn5Var2).l(str2, this);
                if (l2 == x61Var2) {
                    return x61Var2;
                }
                return l2;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    p06 p06Var = sz1Var.e;
                    Uri uri = pq5Var.d;
                    this.Y = 1;
                    obj = ((xb2) p06Var).l(uri, this);
                    break;
                }
                pq5 pq5Var2 = (pq5) obj;
                if (pq5Var2 != null) {
                    sz1Var.i1(pq5Var2);
                    jh jhVar = sz1Var.v;
                    this.Y = 2;
                    if (jhVar.m(pq5Var2, this) != x61Var3) {
                        return jg7Var;
                    }
                    return x61Var3;
                }
                return jg7Var;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object v = sz1.v(sz1Var, pq5Var, this);
                if (v == x61Var4) {
                    return x61Var4;
                }
                return v;
            default:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                jh jhVar2 = sz1Var.v;
                this.Y = 1;
                if (jhVar2.m(pq5Var, this) == x61Var5) {
                    return x61Var5;
                }
                return jg7Var;
        }
    }
}
