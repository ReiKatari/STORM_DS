package defpackage;

import android.os.Trace;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r30  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r30 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ r30(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
        this.Z = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oa4 oa4Var;
        oa4 C;
        int i = this.A;
        Object obj = this.Z;
        Object obj2 = this.Y;
        Object obj3 = this.X;
        Object obj4 = this.R;
        Object obj5 = this.L;
        Object obj6 = this.B;
        switch (i) {
            case 0:
                s47 s47Var = (s47) obj6;
                kk3 kk3Var = (kk3) obj5;
                List list = (List) obj4;
                fp fpVar = (fp) obj3;
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
                        try {
                            s47 N = gi2.N(s47Var, kk3Var);
                            if (list == null) {
                                list = yt1.A;
                            }
                            s9 s9Var = new s9(fpVar, N, list, qh1Var, ki2Var);
                            s9Var.c();
                            s9Var.b();
                            vl6.q(j2);
                            C.w().m();
                            C.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            vl6.q(j2);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            default:
                ((s9) obj6).r((eg0) obj5, (eg0) obj4, (qv6) obj3, (qv6) obj2, (Map.Entry) obj);
                return;
        }
    }
}
