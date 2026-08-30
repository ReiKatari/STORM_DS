package y8;

import android.net.NetworkRequest;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import g2.z1;
import java.util.ArrayList;
import java.util.List;
import p7.t;
import p8.e0;
import p8.v;
import p8.y;
import q8.b0;
import q8.p;
import q8.r;
import u1.h1;
import x8.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f14797a = {13, 15, 14};

    public static final void a(p pVar, String str) {
        b0 b10;
        WorkDatabase workDatabase = pVar.f12373c;
        workDatabase.getClass();
        u w10 = workDatabase.w();
        x8.b r5 = workDatabase.r();
        ArrayList A = t.A(str);
        while (!A.isEmpty()) {
            String str2 = (String) zb.l.h0(A);
            e0 c4 = w10.c(str2);
            if (c4 != e0.SUCCEEDED && c4 != e0.FAILED) {
                ((Number) r.K(w10.f14444a, false, true, new z1(str2, 15))).intValue();
            }
            A.addAll(r5.a(str2));
        }
        q8.d dVar = pVar.f12376f;
        dVar.getClass();
        synchronized (dVar.f12351k) {
            v e6 = v.e();
            String str3 = q8.d.f12340l;
            e6.a(str3, "Processor cancelling " + str);
            dVar.f12349i.add(str);
            b10 = dVar.b(str);
        }
        q8.d.d(str, b10, 1);
        for (q8.f fVar : pVar.f12375e) {
            fVar.a(str);
        }
    }

    public static final void b(WorkDatabase workDatabase, p8.b bVar, q8.m mVar) {
        int i2;
        workDatabase.getClass();
        bVar.getClass();
        ArrayList A = t.A(mVar);
        int i10 = 0;
        while (!A.isEmpty()) {
            List<y> list = ((q8.m) zb.l.h0(A)).f12362d;
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (y yVar : list) {
                    if (!yVar.f11514b.f14429j.f11479i.isEmpty() && (i2 = i2 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
                continue;
            }
            i10 += i2;
        }
        if (i10 != 0) {
            int intValue = ((Number) r.K(workDatabase.w().f14444a, true, false, new h1(19))).intValue();
            int i11 = bVar.f11461j;
            if (intValue + i10 <= i11) {
                return;
            }
            a0.j.h(w.d.q(kc.a.j("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", i11, ";\nalready enqueued count: ", intValue, ";\ncurrent enqueue operation count: "), i10, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
        }
    }

    public static f c(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i2 : iArr) {
            try {
                builder.addCapability(i2);
            } catch (IllegalArgumentException e6) {
                v e10 = v.e();
                String str = f.f14795b;
                String str2 = f.f14795b;
                String str3 = "Ignoring adding capability '" + i2 + '\'';
                if (e10.f11509a <= 5) {
                    Log.w(str2, str3, e6);
                }
            }
        }
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = f14797a[i10];
            if (!zb.k.c(iArr, i11)) {
                try {
                    builder.removeCapability(i11);
                } catch (IllegalArgumentException e11) {
                    v e12 = v.e();
                    String str4 = f.f14795b;
                    String str5 = f.f14795b;
                    String str6 = "Ignoring removing default capability '" + i11 + '\'';
                    if (e12.f11509a <= 5) {
                        Log.w(str5, str6, e11);
                    }
                }
            }
        }
        for (int i12 : iArr2) {
            builder.addTransportType(i12);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return new f(build);
    }
}
