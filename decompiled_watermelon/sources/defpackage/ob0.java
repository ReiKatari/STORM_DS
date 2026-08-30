package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Trace;
import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ob0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ob0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ ob0(sb0 sb0Var, rb0 rb0Var, gb5 gb5Var, int i) {
        this.A = 0;
        this.L = sb0Var;
        this.R = gb5Var;
        this.B = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z8 z8Var;
        df0 df0Var;
        boolean z;
        int i = 0;
        switch (this.A) {
            case 0:
                ((sb0) this.L).d(rb0.b((gb5) this.R), this.B);
                return;
            case 1:
                ws0 ws0Var = (ws0) this.L;
                int i2 = this.B;
                Serializable serializable = (Serializable) ((bq0) this.R).B;
                String str = (String) ws0Var.a.get(Integer.valueOf(i2));
                if (str != null) {
                    f9 f9Var = (f9) ws0Var.e.get(str);
                    if (f9Var != null) {
                        z8Var = f9Var.a;
                    } else {
                        z8Var = null;
                    }
                    if (z8Var == null) {
                        ws0Var.g.remove(str);
                        ws0Var.f.put(str, serializable);
                        return;
                    }
                    z8 z8Var2 = f9Var.a;
                    z8Var2.getClass();
                    if (ws0Var.d.remove(str)) {
                        z8Var2.b(serializable);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((ws0) this.L).a(this.B, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.R));
                return;
            case 3:
                ((ou4) ((me1) this.L).d).m(this.B, this.R);
                return;
            default:
                in4 in4Var = (in4) this.R;
                int i3 = this.B;
                bu4 bu4Var = (bu4) ((cj0) this.L).get();
                bb0 bb0Var = new bb0(3);
                bb0Var.B.r(jw2.w, new mb5(sn1.B, new nb5(2, new Size(640, 480))));
                bb0Var.B.r(rv2.X, 1);
                bb0Var.B.r(rv2.B, 0);
                rv2 rv2Var = new rv2(ef4.b(bb0Var.B));
                jw2.H(rv2Var);
                nv2 nv2Var = new nv2(rv2Var);
                ExecutorService executorService = in4Var.g;
                a31 a31Var = new a31(18, in4Var);
                synchronized (nv2Var.q) {
                    try {
                        pv2 pv2Var = nv2Var.r;
                        if (pv2Var != null) {
                            a31 a31Var2 = new a31(9, a31Var);
                            synchronized (pv2Var.o0) {
                                pv2Var.A = a31Var2;
                                pv2Var.Z = executorService;
                            }
                        }
                        if (nv2Var.t == null) {
                            nv2Var.q();
                        }
                        nv2Var.s = executorService;
                        nv2Var.t = a31Var;
                    } finally {
                    }
                }
                if (i3 != 0) {
                    if (i3 == 1) {
                        df0Var = df0.b;
                    } else {
                        vd6.i(wh1.g(i3, "Unknown camera type "));
                        return;
                    }
                } else {
                    df0Var = df0.c;
                }
                df0Var.getClass();
                bu4Var.a.m();
                EmulatorActivity emulatorActivity = in4Var.b.a;
                if (emulatorActivity != null) {
                    f47[] f47VarArr = {nv2Var};
                    tf0 tf0Var = bu4Var.a;
                    f47[] f47VarArr2 = (f47[]) Arrays.copyOf(f47VarArr, 1);
                    Trace.beginSection(io2.p0("CX:bindToLifecycle"));
                    try {
                        xg0 xg0Var = (xg0) tf0Var.R;
                        if (xg0Var != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            xg0Var.getClass();
                            zc0 zc0Var = xg0Var.g;
                            if (zc0Var != null) {
                                qc0 qc0Var = (qc0) zc0Var.g;
                                synchronized (qc0Var.b) {
                                    i = qc0Var.e;
                                }
                            } else {
                                throw new IllegalStateException("CameraX not initialized yet.");
                            }
                        }
                        if (i != 2) {
                            tf0.e(tf0Var, 1);
                            tf0.g(tf0Var, emulatorActivity, df0Var, new me1(nu.o0(f47VarArr2), pp1.A));
                            Trace.endSection();
                            in4Var.e = bu4Var;
                            return;
                        }
                        throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                i.n("No current emulator lifecycle owner");
                return;
        }
    }

    public /* synthetic */ ob0(int i, int i2, Object obj, Object obj2) {
        this.A = i2;
        this.L = obj;
        this.B = i;
        this.R = obj2;
    }

    public /* synthetic */ ob0(cj0 cj0Var, in4 in4Var, int i) {
        this.A = 4;
        this.L = cj0Var;
        this.R = in4Var;
        this.B = i;
    }
}
