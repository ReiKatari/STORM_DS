package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Trace;
import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xd0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xd0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ xd0(be0 be0Var, ae0 ae0Var, yk5 yk5Var, int i) {
        this.A = 0;
        this.L = be0Var;
        this.R = yk5Var;
        this.B = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9 a9Var;
        mh0 mh0Var;
        boolean z;
        int i = 0;
        switch (this.A) {
            case 0:
                ((be0) this.L).d(ae0.b((yk5) this.R), this.B);
                return;
            case 1:
                kv0 kv0Var = (kv0) this.L;
                int i2 = this.B;
                Serializable serializable = (Serializable) ((os0) this.R).B;
                String str = (String) kv0Var.a.get(Integer.valueOf(i2));
                if (str != null) {
                    g9 g9Var = (g9) kv0Var.e.get(str);
                    if (g9Var != null) {
                        a9Var = g9Var.a;
                    } else {
                        a9Var = null;
                    }
                    if (a9Var == null) {
                        kv0Var.g.remove(str);
                        kv0Var.f.put(str, serializable);
                        return;
                    }
                    a9 a9Var2 = g9Var.a;
                    a9Var2.getClass();
                    if (kv0Var.d.remove(str)) {
                        a9Var2.a(serializable);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((kv0) this.L).a(this.B, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.R));
                return;
            case 3:
                ((t35) ((qi1) this.L).d).j(this.B, this.R);
                return;
            default:
                nw4 nw4Var = (nw4) this.R;
                int i3 = this.B;
                f35 f35Var = (f35) ((ll0) this.L).get();
                jd0 jd0Var = new jd0(3);
                jd0Var.B.m(n23.w, new el5(cs1.B, new fl5(2, new Size(640, 480))));
                jd0Var.B.m(v13.X, 1);
                jd0Var.B.m(v13.B, 0);
                v13 v13Var = new v13(go4.a(jd0Var.B));
                n23.J(v13Var);
                r13 r13Var = new r13(v13Var);
                ExecutorService executorService = nw4Var.g;
                h61 h61Var = new h61(nw4Var, 17);
                synchronized (r13Var.q) {
                    try {
                        t13 t13Var = r13Var.r;
                        if (t13Var != null) {
                            h61 h61Var2 = new h61(h61Var, 8);
                            synchronized (t13Var.p0) {
                                t13Var.A = h61Var2;
                                t13Var.Z = executorService;
                            }
                        }
                        if (r13Var.t == null) {
                            r13Var.q();
                        }
                        r13Var.s = executorService;
                        r13Var.t = h61Var;
                    } finally {
                    }
                }
                if (i3 != 0) {
                    if (i3 == 1) {
                        mh0Var = mh0.b;
                    } else {
                        fa6.h(lb1.g(i3, "Unknown camera type "));
                        return;
                    }
                } else {
                    mh0Var = mh0.c;
                }
                mh0Var.getClass();
                f35Var.a.m();
                EmulatorActivity emulatorActivity = nw4Var.b.a;
                if (emulatorActivity != null) {
                    di7[] di7VarArr = {r13Var};
                    ci0 ci0Var = f35Var.a;
                    di7[] di7VarArr2 = (di7[]) Arrays.copyOf(di7VarArr, 1);
                    Trace.beginSection(ln2.f0("CX:bindToLifecycle"));
                    try {
                        gj0 gj0Var = (gj0) ci0Var.d;
                        if (gj0Var != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            gj0Var.getClass();
                            if0 if0Var = gj0Var.g;
                            if (if0Var != null) {
                                ze0 ze0Var = (ze0) if0Var.g;
                                synchronized (ze0Var.b) {
                                    i = ze0Var.e;
                                }
                            } else {
                                throw new IllegalStateException("CameraX not initialized yet.");
                            }
                        }
                        if (i != 2) {
                            ci0.e(ci0Var, 1);
                            ci0.g(ci0Var, emulatorActivity, mh0Var, new qi1(fv.C0(di7VarArr2), yt1.A));
                            Trace.endSection();
                            nw4Var.e = f35Var;
                            return;
                        }
                        throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                i.m("No current emulator lifecycle owner");
                return;
        }
    }

    public /* synthetic */ xd0(ll0 ll0Var, nw4 nw4Var, int i) {
        this.A = 4;
        this.L = ll0Var;
        this.R = nw4Var;
        this.B = i;
    }

    public /* synthetic */ xd0(Object obj, int i, int i2, Object obj2) {
        this.A = i2;
        this.L = obj;
        this.B = i;
        this.R = obj2;
    }
}
