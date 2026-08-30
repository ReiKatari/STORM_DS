package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qf0  reason: default package */
/* loaded from: classes.dex */
public final class qf0 extends nk6 implements mi2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf0(Object obj, j11 j11Var, int i) {
        super(1, j11Var);
        this.X = i;
        this.Y = obj;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        Object obj2 = this.Y;
        j11 j11Var = (j11) obj;
        switch (i) {
            case 0:
                return new qf0((n75) obj2, j11Var, 0).v(o27Var);
            default:
                new qf0((qi0) obj2, j11Var, 1).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        Object obj2 = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                Log.d("CXCP", "tryOpenCamera: Camera open cancelled");
                ((n75) obj2).A = null;
                return new kd4(null, new uc0(13), 1);
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ((qi0) obj2).x.await();
                return o27.a;
        }
    }
}
