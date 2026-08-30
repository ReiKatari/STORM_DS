package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ji7  reason: default package */
/* loaded from: classes.dex */
public abstract class ji7 {
    public static final void a(zy3 zy3Var, sk0 sk0Var, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        sk2 sk2Var;
        long j;
        boolean z2;
        sk2 sk2Var2;
        zy3Var.getClass();
        sk0Var.getClass();
        ki2Var.getClass();
        sk2 sk2Var3 = (sk2) tu0Var;
        sk2Var3.Z(-2038549408);
        if (sk2Var3.h(sk0Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i4 = i | i2;
        if (sk2Var3.h(ki2Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var3.O(i5 & 1, z)) {
            jd7 C = mj2.C(sk2Var3);
            Object L = sk2Var3.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = b31.f(sk2Var3);
            }
            l14 l14Var = (l14) L;
            k24 a = bh7.a(l14Var, sk2Var3, 6);
            fr5 b = gr5.b(13.0f);
            zy3 t = a53.t(zy3Var, b);
            if (((Boolean) a.getValue()).booleanValue()) {
                sk2Var = sk2Var3;
                j = C.e;
            } else {
                sk2Var = sk2Var3;
                j = C.d;
            }
            is2 is2Var = iq2.g;
            zy3 i6 = dk7.i(t, j, is2Var);
            if (((Boolean) a.getValue()).booleanValue()) {
                i6 = b53.z(2.0f, C.j, i6, b);
            }
            zy3 zy3Var2 = i6;
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L2 = sk2Var.L();
            if (!z2 && L2 != sn1Var) {
                sk2Var2 = sk2Var;
            } else {
                L2 = new w7(8, ki2Var);
                sk2Var2 = sk2Var;
                sk2Var2.h0(L2);
            }
            zy3 Y = b53.Y(a53.r(zy3Var2, l14Var, null, false, null, (ki2) L2, 28), 14.0f, 13.0f);
            sr5 a2 = rr5.a(rt.a, y60.h0, sk2Var2, 48);
            int hashCode = Long.hashCode(sk2Var2.T);
            sm4 l = sk2Var2.l();
            zy3 e0 = l07.e0(sk2Var2, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var2, dnVar, a2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var2, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var2, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var2, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var2, dnVar4, e0);
            wy3 wy3Var = wy3.a;
            zy3 i7 = dk7.i(a53.t(o76.h(wy3Var, 34.0f), gr5.b(9.0f)), C.m, is2Var);
            tv3 d = d50.d(y60.Z, false);
            int hashCode2 = Long.hashCode(sk2Var2.T);
            sm4 l2 = sk2Var2.l();
            zy3 e02 = l07.e0(sk2Var2, i7);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar, d);
            oo2.S(sk2Var2, dnVar2, l2);
            b31.x(hashCode2, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar4, e02);
            ev2.a(fj7.b(), null, o76.h(wy3Var, 19.0f), C.l, sk2Var2, 432, 0);
            sk2Var2.p(true);
            cg2.k(sk2Var2, o76.k(wy3Var, 12.0f));
            sk2 sk2Var4 = sk2Var2;
            ir6.b(sk0Var.b, new xg3(1.0f, true), C.g, hi2.A(13.5d), pe2.c0, null, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var4, 199680, 3120, 120784);
            sk2Var3 = sk2Var4;
            ev2.a(nk2.E(), null, o76.h(wy3Var, 20.0f), C.i, sk2Var3, 432, 0);
            sk2Var3.p(true);
        } else {
            sk2Var3.R();
        }
        m55 r = sk2Var3.r();
        if (r != null) {
            r.d = new w3(zy3Var, sk0Var, ki2Var, i, 15);
        }
    }

    public abstract mq3 b(Context context, String str, WorkerParameters workerParameters);

    public mq3 c(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        mq3 b = b(context, str, workerParameters);
        if (b == null) {
            try {
                Class<? extends U> asSubclass = Class.forName(str).asSubclass(mq3.class);
                asSubclass.getClass();
                try {
                    Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    newInstance.getClass();
                    b = (mq3) newInstance;
                } catch (Throwable th) {
                    y70.f().e(ki7.a, "Could not instantiate ".concat(str), th);
                    throw th;
                }
            } catch (Throwable th2) {
                y70.f().e(ki7.a, "Invalid class: ".concat(str), th2);
                throw th2;
            }
        }
        if (!b.d) {
            return b;
        }
        String name = getClass().getName();
        throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
