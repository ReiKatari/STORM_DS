package defpackage;

import androidx.work.CoroutineWorker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c71  reason: default package */
/* loaded from: classes.dex */
public final class c71 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ CoroutineWorker Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c71(CoroutineWorker coroutineWorker, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = coroutineWorker;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((c71) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((c71) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        CoroutineWorker coroutineWorker = this.Z;
        switch (i) {
            case 0:
                return new c71(coroutineWorker, r41Var, 0);
            default:
                return new c71(coroutineWorker, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        CoroutineWorker coroutineWorker = this.Z;
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
                this.Y = 1;
                Object f = coroutineWorker.f();
                if (f == x61Var) {
                    return x61Var;
                }
                return f;
            default:
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
                this.Y = 1;
                Object e = coroutineWorker.e(this);
                if (e == x61Var2) {
                    return x61Var2;
                }
                return e;
        }
    }
}
