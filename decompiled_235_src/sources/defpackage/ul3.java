package defpackage;

import java.util.UUID;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ul3  reason: default package */
/* loaded from: classes.dex */
public final class ul3 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ yl3 Z;
    public final /* synthetic */ UUID d0;
    public final /* synthetic */ BackgroundMode e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ul3(yl3 yl3Var, UUID uuid, BackgroundMode backgroundMode, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = yl3Var;
        this.d0 = uuid;
        this.e0 = backgroundMode;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((ul3) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((ul3) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new ul3(this.Z, this.d0, this.e0, r41Var, 0);
            default:
                return new ul3(this.Z, this.d0, this.e0, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        BackgroundMode backgroundMode = this.e0;
        UUID uuid = this.d0;
        yl3 yl3Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ha3 ha3Var = yl3Var.c;
                    this.Y = 1;
                    obj = ha3Var.c(uuid, this);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                tp6 tp6Var = yl3Var.k;
                t26 t26Var = new t26((n00) obj, backgroundMode);
                tp6Var.getClass();
                tp6Var.m(null, t26Var);
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ha3 ha3Var2 = yl3Var.c;
                    this.Y = 1;
                    obj = ha3Var2.c(uuid, this);
                    if (obj == x61Var2) {
                        return x61Var2;
                    }
                }
                tp6 tp6Var2 = yl3Var.m;
                t26 t26Var2 = new t26((n00) obj, backgroundMode);
                tp6Var2.getClass();
                tp6Var2.m(null, t26Var2);
                return jg7Var;
        }
    }
}
