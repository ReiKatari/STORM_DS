package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zh0  reason: default package */
/* loaded from: classes.dex */
public final class zh0 extends hw6 implements qn2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh0(Object obj, r41 r41Var, int i) {
        super(1, r41Var);
        this.X = i;
        this.Y = obj;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.Y;
        r41 r41Var = (r41) obj;
        switch (i) {
            case 0:
                return new zh0((dh5) obj2, r41Var, 0).s(jg7Var);
            default:
                new zh0((yk0) obj2, r41Var, 1).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        Object obj2 = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                Log.d("CXCP", "tryOpenCamera: Camera open cancelled");
                ((dh5) obj2).A = null;
                return new lm4(null, new df0(13), 1);
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ((yk0) obj2).x.await();
                return jg7.a;
        }
    }
}
