package defpackage;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q30  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class q30 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ q30(xd5 xd5Var, String str, on2 on2Var, s94 s94Var, qb0 qb0Var) {
        this.A = 2;
        this.B = xd5Var;
        this.R = str;
        this.L = on2Var;
        this.X = s94Var;
        this.Y = qb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oa4 oa4Var;
        oa4 C;
        int i = this.A;
        Object obj = this.Y;
        Object obj2 = this.X;
        Object obj3 = this.L;
        Object obj4 = this.R;
        Object obj5 = this.B;
        switch (i) {
            case 0:
                s47 s47Var = (s47) obj5;
                kk3 kk3Var = (kk3) obj3;
                String str = (String) obj4;
                qh1 qh1Var = (qh1) obj2;
                ki2 ki2Var = (ki2) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    vl6 j = bm6.j();
                    if (j instanceof oa4) {
                        oa4Var = (oa4) j;
                    } else {
                        oa4Var = null;
                    }
                    if (oa4Var != null && (C = oa4Var.C(null, null)) != null) {
                        vl6 j2 = C.j();
                        s47 N = gi2.N(s47Var, kk3Var);
                        yt1 yt1Var = yt1.A;
                        gj gjVar = new gj(str, N, yt1Var, yt1Var, ki2Var, qh1Var);
                        gjVar.c();
                        gjVar.b();
                        vl6.q(j2);
                        C.w().m();
                        C.c();
                        Trace.endSection();
                        return;
                    }
                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 1:
                ix6 ix6Var = (ix6) obj3;
                ix6 ix6Var2 = (ix6) obj4;
                View view = (View) obj;
                Window window = ((mv0) obj2).getWindow();
                window.getClass();
                qn2 qn2Var = ix6Var.d;
                Resources resources = view.getResources();
                resources.getClass();
                boolean booleanValue = ((Boolean) qn2Var.g(resources)).booleanValue();
                qn2 qn2Var2 = ix6Var2.d;
                Resources resources2 = view.getResources();
                resources2.getClass();
                ((bs1) obj5).b(ix6Var, ix6Var2, window, view, booleanValue, ((Boolean) qn2Var2.g(resources2)).booleanValue());
                return;
            default:
                String str2 = (String) obj4;
                on2 on2Var = (on2) obj3;
                s94 s94Var = (s94) obj2;
                qb0 qb0Var = (qb0) obj;
                ((xd5) obj5).getClass();
                boolean H = ln2.H();
                if (H) {
                    try {
                        Trace.beginSection(ln2.f0(str2));
                    } finally {
                        if (H) {
                            Trace.endSection();
                        }
                    }
                }
                on2Var.c();
                un4 un4Var = xd5.k0;
                s94Var.g(un4Var);
                qb0Var.a(un4Var);
                if (H) {
                    return;
                }
                return;
        }
    }

    public /* synthetic */ q30(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
    }
}
