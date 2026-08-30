package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: of0  reason: default package */
/* loaded from: classes.dex */
public final class of0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n75 Z;
    public final /* synthetic */ String c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of0(n75 n75Var, String str, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = n75Var;
        this.c0 = str;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        kd4 kd4Var = (kd4) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((of0) t(j11Var, kd4Var)).v(o27Var);
            default:
                return ((of0) t(j11Var, kd4Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        String str = this.c0;
        n75 n75Var = this.Z;
        switch (i) {
            case 0:
                of0 of0Var = new of0(n75Var, str, j11Var, 0);
                of0Var.Y = obj;
                return of0Var;
            default:
                of0 of0Var2 = new of0(n75Var, str, j11Var, 1);
                of0Var2.Y = obj;
                return of0Var2;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        n75 n75Var = this.Z;
        String str = this.c0;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                kd4 kd4Var = (kd4) this.Y;
                Log.d("CXCP", "tryOpenCamera: openCamera() for " + ((Object) od0.b(str)) + " returned");
                n75Var.A = null;
                return kd4Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                kd4 kd4Var2 = (kd4) this.Y;
                Log.d("CXCP", "tryOpenCamera: " + ((Object) od0.b(str)) + " opened");
                n75Var.A = null;
                return kd4Var2;
        }
    }
}
