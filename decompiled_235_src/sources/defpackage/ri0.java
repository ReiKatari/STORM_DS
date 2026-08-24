package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ri0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ri0 implements b31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ri0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.b31
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                bz bzVar = (bz) obj;
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                return;
            case 1:
                qf1 qf1Var = (qf1) obj3;
                wv6 wv6Var = (wv6) obj2;
                az azVar = (az) obj;
                wv6Var.close();
                Surface surface = (Surface) qf1Var.h.remove(wv6Var);
                if (surface != null) {
                    qm4 qm4Var = qf1Var.a;
                    bp2.d((AtomicBoolean) qm4Var.L, true);
                    bp2.c((Thread) qm4Var.X);
                    qm4Var.s(surface, true);
                    return;
                }
                return;
            case 2:
                mq1 mq1Var = (mq1) obj3;
                wv6 wv6Var2 = (wv6) obj2;
                az azVar2 = (az) obj;
                wv6Var2.close();
                Surface surface2 = (Surface) mq1Var.h.remove(wv6Var2);
                if (surface2 != null) {
                    iq1 iq1Var = mq1Var.a;
                    bp2.d((AtomicBoolean) iq1Var.L, true);
                    bp2.c((Thread) iq1Var.X);
                    iq1Var.s(surface2, true);
                    return;
                }
                return;
            default:
                xh6 xh6Var = (xh6) obj3;
                Activity activity = (Activity) obj2;
                Configuration configuration = (Configuration) obj;
                m44 m44Var = xh6Var.e;
                if (m44Var != null) {
                    m44Var.B(activity, xh6Var.a(activity));
                    return;
                }
                return;
        }
    }
}
