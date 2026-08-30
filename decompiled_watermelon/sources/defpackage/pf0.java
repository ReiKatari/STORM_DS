package defpackage;

import android.util.Log;
import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pf0  reason: default package */
/* loaded from: classes.dex */
public final class pf0 extends nk6 implements mi2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Serializable Z;
    public final /* synthetic */ Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf0(Object obj, Serializable serializable, Object obj2, j11 j11Var, int i) {
        super(1, j11Var);
        this.X = i;
        this.Y = obj;
        this.Z = serializable;
        this.c0 = obj2;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        Object obj2 = this.c0;
        Serializable serializable = this.Z;
        Object obj3 = this.Y;
        switch (i) {
            case 0:
                return new pf0((n75) obj3, (n75) serializable, (hd) obj2, (j11) obj, 0).v(o27Var);
            default:
                return new pf0((dk4) obj3, (String) serializable, (mi2) obj2, (j11) obj, 1).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        Object obj2 = this.c0;
        Serializable serializable = this.Z;
        Object obj3 = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                Log.d("CXCP", "tryOpenCamera: 3000ms elapsed");
                ((n75) obj3).A = null;
                if (((n75) serializable).A == null) {
                    return null;
                }
                Log.e("CXCP", "tryOpenCamera: openCamera() timed out");
                ((hd) obj2).a();
                return new kd4(null, new uc0(13), 1);
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ns5 i0 = ((dk4) obj3).b.i0((String) serializable);
                try {
                    Object n = ((mi2) obj2).n(i0);
                    iq2.h(i0, null);
                    return n;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        iq2.h(i0, th);
                        throw th2;
                    }
                }
        }
    }
}
