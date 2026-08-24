package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pl3  reason: default package */
/* loaded from: classes.dex */
public final class pl3 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ yl3 Z;
    public final /* synthetic */ UUID d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl3(yl3 yl3Var, UUID uuid, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = yl3Var;
        this.d0 = uuid;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((pl3) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((pl3) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        UUID uuid = this.d0;
        yl3 yl3Var = this.Z;
        switch (i) {
            case 0:
                return new pl3(yl3Var, uuid, r41Var, 0);
            default:
                return new pl3(yl3Var, uuid, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object d;
        Object d2;
        fk3 a;
        String str;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        UUID uuid = this.d0;
        yl3 yl3Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        d = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    wa3 wa3Var = yl3Var.b;
                    this.Y = 1;
                    d = wa3Var.d(uuid, this);
                    if (d == x61Var) {
                        return x61Var;
                    }
                }
                fk3 fk3Var = (fk3) d;
                yl3Var.g = fk3Var;
                yl3Var.i.l(fk3Var);
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        d2 = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    wa3 wa3Var2 = yl3Var.b;
                    UUID uuid2 = fk3.h;
                    this.Y = 1;
                    d2 = wa3Var2.d(uuid2, this);
                    if (d2 == x61Var2) {
                        return x61Var2;
                    }
                }
                fk3 fk3Var2 = (fk3) d2;
                if (fk3Var2 != null) {
                    if (nb3.k(uuid, fk3.h)) {
                        str = "Пользовательский (на основе стандарта)";
                    } else {
                        str = "Пользовательская раскладка";
                    }
                    a = fk3.a(fk3Var2, null, str, dk3.CUSTOM, null, false, 0, null, 120);
                } else {
                    a = fk3.a(new fk3(null, null, dk3.CUSTOM, ck3.FOLLOW_SYSTEM, false, 50, zt1.A), null, "Пользовательская раскладка", null, null, false, 0, null, 125);
                }
                yl3Var.g = a;
                tp6 tp6Var = yl3Var.i;
                tp6Var.getClass();
                tp6Var.m(null, a);
                return jg7Var;
        }
    }
}
