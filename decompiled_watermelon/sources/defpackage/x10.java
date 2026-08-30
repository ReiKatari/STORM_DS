package defpackage;

import android.os.Trace;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x10 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ x10(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
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
        i24 i24Var;
        i24 C;
        int i = this.A;
        Object obj = this.Z;
        Object obj2 = this.Y;
        Object obj3 = this.X;
        Object obj4 = this.R;
        Object obj5 = this.L;
        Object obj6 = this.B;
        switch (i) {
            case 0:
                ds6 ds6Var = (ds6) obj6;
                sd3 sd3Var = (sd3) obj5;
                List list = (List) obj4;
                to toVar = (to) obj3;
                od1 od1Var = (od1) obj2;
                od2 od2Var = (od2) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    ga6 j = ma6.j();
                    if (j instanceof i24) {
                        i24Var = (i24) j;
                    } else {
                        i24Var = null;
                    }
                    if (i24Var != null && (C = i24Var.C(null, null)) != null) {
                        ga6 j2 = C.j();
                        try {
                            ds6 T = cg2.T(ds6Var, sd3Var);
                            if (list == null) {
                                list = pp1.A;
                            }
                            r9 r9Var = new r9(toVar, T, list, od1Var, od2Var);
                            r9Var.c();
                            r9Var.a();
                            ga6.q(j2);
                            C.w().x();
                            C.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            ga6.q(j2);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            default:
                ((r9) obj6).r((vd0) obj5, (vd0) obj4, (wj6) obj3, (wj6) obj2, (Map.Entry) obj);
                return;
        }
    }
}
