package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xh0  reason: default package */
/* loaded from: classes.dex */
public final class xh0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ dh5 Z;
    public final /* synthetic */ String d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh0(dh5 dh5Var, String str, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = dh5Var;
        this.d0 = str;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        lm4 lm4Var = (lm4) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((xh0) q(r41Var, lm4Var)).s(jg7Var);
            default:
                return ((xh0) q(r41Var, lm4Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        String str = this.d0;
        dh5 dh5Var = this.Z;
        switch (i) {
            case 0:
                xh0 xh0Var = new xh0(dh5Var, str, r41Var, 0);
                xh0Var.Y = obj;
                return xh0Var;
            default:
                xh0 xh0Var2 = new xh0(dh5Var, str, r41Var, 1);
                xh0Var2.Y = obj;
                return xh0Var2;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        dh5 dh5Var = this.Z;
        String str = this.d0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                lm4 lm4Var = (lm4) this.Y;
                Log.d("CXCP", "tryOpenCamera: openCamera() for " + ((Object) xf0.b(str)) + " returned");
                dh5Var.A = null;
                return lm4Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                lm4 lm4Var2 = (lm4) this.Y;
                Log.d("CXCP", "tryOpenCamera: " + ((Object) xf0.b(str)) + " opened");
                dh5Var.A = null;
                return lm4Var2;
        }
    }
}
