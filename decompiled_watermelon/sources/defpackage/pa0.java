package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pa0  reason: default package */
/* loaded from: classes.dex */
public final class pa0 {
    public final dc0 a;
    public final ct6 b;
    public final int c;
    public final Map d;
    public final Map e;
    public final tf6 f;
    public final tg6 g;
    public final boolean h;
    public final int i;
    public final Object j;
    public boolean k;
    public na0 l;
    public final rh m;

    public pa0(dc0 dc0Var, ct6 ct6Var, int i, Map map, Map map2, tf6 tf6Var, tg6 tg6Var, boolean z) {
        dc0Var.getClass();
        ct6Var.getClass();
        map.getClass();
        map2.getClass();
        tg6Var.getClass();
        this.a = dc0Var;
        this.b = ct6Var;
        this.c = i;
        this.d = map;
        this.e = map2;
        this.f = tf6Var;
        this.g = tg6Var;
        this.h = z;
        cw cwVar = qa0.a;
        cwVar.getClass();
        this.i = cw.b.incrementAndGet(cwVar);
        this.j = new Object();
        List list = tf6Var.Y;
        rh rhVar = null;
        if (!list.isEmpty()) {
            qf6 qf6Var = (qf6) tq0.K0(list);
            Surface inputSurface = dc0Var.getInputSurface();
            if (inputSurface != null) {
                try {
                    rhVar = tq5.i(inputSurface, qf6Var.a, new pf6(qf6Var.b), ct6Var.a());
                } catch (RuntimeException e) {
                    Log.e("CXCP", "Failed to create ImageWriter for session " + this.a + "! Reprocessing will not be supported!", e);
                }
                if (rhVar != null) {
                    Log.d("CXCP", "Created ImageWriter " + rhVar + " for session " + this.a);
                }
            } else {
                i.n("inputSurface is required to create instance of imageWriter.");
                throw null;
            }
        }
        this.m = rhVar;
    }

    public static final void a(pa0 pa0Var, na0 na0Var) {
        Log.d("CXCP", "Waiting for the last repeating request sequence: " + na0Var);
        if (((o27) pa0Var.b.b(2000L, new oa0(na0Var, null, 0))) == null) {
            Log.e("CXCP", pa0Var + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + na0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0595 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.na0 b(boolean r34, java.util.List r35, java.util.Map r36, java.util.Map r37, java.util.Map r38, defpackage.t71 r39, java.util.List r40) {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa0.b(boolean, java.util.List, java.util.Map, java.util.Map, java.util.Map, t71, java.util.List):na0");
    }

    public final void c() {
        na0 na0Var;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.j) {
                if (!this.k) {
                    this.k = true;
                    rh rhVar = this.m;
                    if (rhVar != null) {
                        b31.y(rhVar);
                    }
                    Surface inputSurface = this.a.getInputSurface();
                    if (inputSurface != null) {
                        inputSurface.release();
                    }
                    na0Var = this.l;
                } else {
                    na0Var = null;
                }
            }
            if (this.h && na0Var != null) {
                a(this, na0Var);
            }
        } finally {
            Trace.endSection();
        }
    }

    public final Integer d(na0 na0Var) {
        Integer o;
        synchronized (this.j) {
            if (this.k) {
                Log.w("CXCP", this + " disconnected. " + na0Var + " won't be submitted");
                return null;
            }
            if (na0Var.c.size() == 1) {
                dc0 dc0Var = this.a;
                if (!(dc0Var instanceof bd)) {
                    if (na0Var.b) {
                        if (this.h) {
                            this.l = na0Var;
                        }
                        o = dc0Var.k((CaptureRequest) na0Var.c.get(0), na0Var);
                    } else {
                        o = dc0Var.X((CaptureRequest) na0Var.c.get(0), na0Var);
                    }
                    return o;
                }
            }
            boolean z = na0Var.b;
            dc0 dc0Var2 = this.a;
            ArrayList arrayList = na0Var.c;
            if (z) {
                o = dc0Var2.y(arrayList, na0Var);
            } else {
                o = dc0Var2.o(arrayList, na0Var);
            }
            return o;
        }
    }

    public final String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.i;
    }
}
