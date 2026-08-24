package defpackage;

import me.magnum.melonds.translator.capture.ScreenCaptureService;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai0  reason: default package */
/* loaded from: classes.dex */
public final class ai0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai0(int i, r41 r41Var, int i2) {
        super(i, r41Var);
        this.X = i2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((ai0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((ai0) q((r41) obj2, Integer.valueOf(((Number) obj).intValue()))).s(jg7Var);
            default:
                return ((ai0) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new ai0(2, r41Var, 0);
            case 1:
                ai0 ai0Var = new ai0(2, r41Var, 1);
                ai0Var.Y = ((Number) obj).intValue();
                return ai0Var;
            default:
                return new ai0(2, r41Var, 2);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        boolean z = true;
        switch (this.X) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i = this.Y;
                if (i != 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    if (q60.t(3000L, this) == x61Var) {
                        return x61Var;
                    }
                }
                return jg7.a;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (this.Y <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0 && i2 != 1) {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                do {
                    boolean z2 = ScreenCaptureService.A;
                    if (!ScreenCaptureService.A) {
                        this.Y = 1;
                    } else {
                        return jg7.a;
                    }
                } while (q60.t(50L, this) != x61Var3);
                return x61Var3;
        }
    }
}
