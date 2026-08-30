package defpackage;

import android.os.Looper;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jf0  reason: default package */
/* loaded from: classes.dex */
public final class jf0 {
    public final Object a = new Object();
    public final ka3 b = new ka3(10, (byte) 0);
    public final m14 c = new pq3();
    public jd0 d;
    public ud0 e;
    public rw f;
    public boolean g;
    public final LinkedHashMap h;

    /* JADX WARN: Type inference failed for: r0v2, types: [m14, pq3] */
    public jf0() {
        ud0 ud0Var = ud0.CLOSED;
        this.e = ud0Var;
        this.h = new LinkedHashMap();
        c(ud0Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.jd0 r8, defpackage.jn2 r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf0.a(jd0, jn2):void");
    }

    public final void b(jd0 jd0Var, jn2 jn2Var) {
        jn2Var.getClass();
        synchronized (this.a) {
            if (this.g) {
                if (ve2.I()) {
                    Log.w("CXCP", "Ignoring graph state update " + jn2Var + " on removed camera.");
                }
                return;
            }
            if (ve2.D("CXCP")) {
                Log.d("CXCP", jd0Var + " state updated to " + jn2Var);
            }
            a(jd0Var, jn2Var);
        }
    }

    public final void c(ud0 ud0Var, rw rwVar) {
        ef0 ef0Var;
        List<Map.Entry> n1;
        ((m14) this.b.B).g(new s2(2, ud0Var));
        ud0Var.getClass();
        int i = hf0.a[ud0Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            ef0Var = ef0.PENDING_OPEN;
                        } else {
                            f81.x(ud0Var, "Unexpected CameraInternal state: ");
                            return;
                        }
                    } else {
                        ef0Var = ef0.CLOSING;
                    }
                } else {
                    ef0Var = ef0.OPEN;
                }
            } else {
                ef0Var = ef0.OPENING;
            }
        } else {
            ef0Var = ef0.CLOSED;
        }
        qw qwVar = new qw(ef0Var, rwVar);
        m14 m14Var = this.c;
        m14Var.getClass();
        if (b53.x(Looper.myLooper(), Looper.getMainLooper())) {
            m14Var.f(qwVar);
        } else {
            m14Var.g(qwVar);
        }
        synchronized (this.a) {
            n1 = tq0.n1(this.h.entrySet());
        }
        for (Map.Entry entry : n1) {
            ((Executor) entry.getValue()).execute(new we(8, (wz0) entry.getKey(), qwVar));
        }
    }
}
