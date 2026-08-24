package defpackage;

import java.util.ArrayList;
import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dz5  reason: default package */
/* loaded from: classes.dex */
public final class dz5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ tz5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dz5(tz5 tz5Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = tz5Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((dz5) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((dz5) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((dz5) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        tz5 tz5Var = this.Z;
        switch (i) {
            case 0:
                return new dz5(tz5Var, r41Var, 0);
            case 1:
                return new dz5(tz5Var, r41Var, 1);
            default:
                return new dz5(tz5Var, r41Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        return r1;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        tz5 tz5Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                g21 o = ((xb2) tz5Var.b).o();
                bz5 bz5Var = new bz5(tz5Var, 1);
                this.Y = 1;
                if (o.b(bz5Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                tp6 tp6Var = tz5Var.F;
                de5 de5Var = new de5(((xb2) tz5Var.b).r);
                kz0 kz0Var = new kz0(tz5Var, null, 2);
                bz5 bz5Var2 = new bz5(tz5Var, 3);
                this.Y = 1;
                Object o2 = nb3.o(this, bz5Var2, jz.R, new o12(kz0Var, (r41) null, 5), new le2[]{tp6Var, de5Var});
                if (o2 != x61Var2) {
                    o2 = jg7Var;
                }
                if (o2 == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
            default:
                fg fgVar = tz5Var.g;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                try {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                oi2.Y(obj);
                                Iterable<DSiWareTitle> iterable = (Iterable) obj;
                                ArrayList arrayList = new ArrayList(ht0.v0(iterable, 10));
                                for (DSiWareTitle dSiWareTitle : iterable) {
                                    arrayList.add(tz5.e(tz5Var, tz5.h(tz5Var, dSiWareTitle), null));
                                }
                                return arrayList;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                    } else {
                        oi2.Y(obj);
                        this.Y = 1;
                        obj = fgVar.i(this);
                        break;
                    }
                    if (((mm4) obj).isFailure()) {
                        return yt1.A;
                    }
                    this.Y = 2;
                    obj = fgVar.h(this);
                    break;
                } finally {
                    fgVar.b();
                }
        }
    }
}
