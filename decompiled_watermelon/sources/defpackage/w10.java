package defpackage;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w10 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ w10(y60 y60Var, String str, ki2 ki2Var, m14 m14Var, i90 i90Var) {
        this.A = 2;
        this.B = y60Var;
        this.R = str;
        this.L = ki2Var;
        this.X = m14Var;
        this.Y = i90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i24 i24Var;
        i24 C;
        int i = this.A;
        Object obj = this.Y;
        Object obj2 = this.X;
        Object obj3 = this.L;
        Object obj4 = this.R;
        Object obj5 = this.B;
        switch (i) {
            case 0:
                ds6 ds6Var = (ds6) obj5;
                sd3 sd3Var = (sd3) obj3;
                String str = (String) obj4;
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
                        ds6 T = cg2.T(ds6Var, sd3Var);
                        pp1 pp1Var = pp1.A;
                        ui uiVar = new ui(str, T, pp1Var, pp1Var, od2Var, od1Var);
                        uiVar.c();
                        uiVar.a();
                        ga6.q(j2);
                        C.w().x();
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
                ml6 ml6Var = (ml6) obj3;
                ml6 ml6Var2 = (ml6) obj4;
                View view = (View) obj;
                Window window = ((xp) obj2).getWindow();
                window.getClass();
                mi2 mi2Var = ml6Var.d;
                Resources resources = view.getResources();
                resources.getClass();
                boolean booleanValue = ((Boolean) mi2Var.n(resources)).booleanValue();
                mi2 mi2Var2 = ml6Var2.d;
                Resources resources2 = view.getResources();
                resources2.getClass();
                ((rn1) obj5).b(ml6Var, ml6Var2, window, view, booleanValue, ((Boolean) mi2Var2.n(resources2)).booleanValue());
                return;
            default:
                String str2 = (String) obj4;
                ki2 ki2Var = (ki2) obj3;
                m14 m14Var = (m14) obj2;
                i90 i90Var = (i90) obj;
                ((y60) obj5).getClass();
                boolean R = io2.R();
                if (R) {
                    try {
                        Trace.beginSection(io2.p0(str2));
                    } finally {
                        if (R) {
                            Trace.endSection();
                        }
                    }
                }
                ki2Var.c();
                te4 te4Var = iq0.k0;
                m14Var.g(te4Var);
                i90Var.a(te4Var);
                if (R) {
                    return;
                }
                return;
        }
    }

    public /* synthetic */ w10(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
    }
}
