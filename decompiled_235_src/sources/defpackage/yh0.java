package defpackage;

import android.util.Log;
import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yh0  reason: default package */
/* loaded from: classes.dex */
public final class yh0 extends hw6 implements qn2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Serializable Z;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh0(Object obj, Serializable serializable, Object obj2, r41 r41Var, int i) {
        super(1, r41Var);
        this.X = i;
        this.Y = obj;
        this.Z = serializable;
        this.d0 = obj2;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.d0;
        Serializable serializable = this.Z;
        Object obj3 = this.Y;
        switch (i) {
            case 0:
                return new yh0((dh5) obj3, (dh5) serializable, (vd) obj2, (r41) obj, 0).s(jg7Var);
            default:
                return new yh0((ft4) obj3, (String) serializable, (qn2) obj2, (r41) obj, 1).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        Serializable serializable = this.Z;
        Object obj3 = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                Log.d("CXCP", "tryOpenCamera: 3000ms elapsed");
                ((dh5) obj3).A = null;
                if (((dh5) serializable).A == null) {
                    return null;
                }
                Log.e("CXCP", "tryOpenCamera: openCamera() timed out");
                ((vd) obj2).a();
                return new lm4(null, new df0(13), 1);
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                j36 i0 = ((ft4) obj3).b.i0((String) serializable);
                try {
                    Object g = ((qn2) obj2).g(i0);
                    lb4.p(i0, null);
                    return g;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        lb4.p(i0, th);
                        throw th2;
                    }
                }
        }
    }
}
