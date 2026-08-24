package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m9  reason: default package */
/* loaded from: classes.dex */
public final class m9 implements yo7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x016a  */
    @Override // defpackage.yo7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qo7 b(Class cls, m94 m94Var) {
        qo7 qo7Var;
        ro7 ro7Var;
        so7 so7Var;
        qo7 qo7Var2;
        qn2 qn2Var;
        qo7 qo7Var3 = null;
        switch (this.a) {
            case 0:
                return new o9(new pb1(((sb1) ((n9) hv.D((Context) this.b, n9.class))).b), new g60(m94Var));
            case 1:
                final lm5 lm5Var = new lm5();
                bt btVar = (bt) this.b;
                btVar.R = y46.a(m94Var);
                ub1 ub1Var = new ub1((sb1) btVar.B, (pb1) btVar.L, (v46) btVar.R);
                ub1 ub1Var2 = (ub1) ((px2) q60.B(px2.class, ub1Var));
                ub1Var2.getClass();
                wb1 wb1Var = new wb1(20);
                wb1Var.g("v10", ub1Var2.d);
                wb1Var.g("gp0", ub1Var2.e);
                wb1Var.g("aq0", ub1Var2.f);
                wb1Var.g("k81", ub1Var2.g);
                wb1Var.g("la1", ub1Var2.h);
                wb1Var.g("xa1", ub1Var2.i);
                wb1Var.g("vw1", ub1Var2.j);
                wb1Var.g("nx1", ub1Var2.k);
                wb1Var.g("sz1", ub1Var2.l);
                wb1Var.g("me.magnum.melonds.ui.inputsetup.b", ub1Var2.m);
                wb1Var.g("yl3", ub1Var2.n);
                wb1Var.g("qn3", ub1Var2.o);
                wb1Var.g("eo3", ub1Var2.p);
                wb1Var.g("sn5", ub1Var2.q);
                wb1Var.g("qv5", ub1Var2.r);
                wb1Var.g("hw5", ub1Var2.s);
                wb1Var.g("tz5", ub1Var2.t);
                wb1Var.g("yz5", ub1Var2.u);
                wb1Var.g("qh7", ub1Var2.v);
                wb1Var.g("qr7", ub1Var2.w);
                n55 n55Var = (n55) wb1Var.f().get(cls.getName());
                qn2 qn2Var2 = (qn2) m94Var.a.get(qx2.d);
                ((ub1) ((px2) q60.B(px2.class, ub1Var))).getClass();
                Object obj = Collections.EMPTY_MAP.get(cls);
                if (obj == null) {
                    if (qn2Var2 == null) {
                        if (n55Var != null) {
                            qo7Var = (qo7) n55Var.get();
                            qo7Var3 = qo7Var;
                            Closeable closeable = new Closeable() { // from class: ox2
                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                public final void close() {
                                    lm5.this.a();
                                }
                            };
                            qo7Var3.getClass();
                            ro7Var = qo7Var3.a;
                            if (ro7Var != null) {
                                if (ro7Var.d) {
                                    ro7.a(closeable);
                                } else {
                                    synchronized (ro7Var.a) {
                                        ro7Var.c.add(closeable);
                                    }
                                }
                            }
                        } else {
                            i.g(cls.getName(), " to be available in the multi-binding of @HiltViewModelMap but none was found.", "Expected the @HiltViewModel-annotated class ");
                        }
                    } else {
                        i.g(cls.getName(), " does not have an assisted factory specified in @HiltViewModel.", "Found creation callback but class ");
                    }
                    return qo7Var3;
                } else if (n55Var == null) {
                    if (qn2Var2 != null) {
                        qo7Var = (qo7) qn2Var2.g(obj);
                        qo7Var3 = qo7Var;
                        Closeable closeable2 = new Closeable() { // from class: ox2
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                lm5.this.a();
                            }
                        };
                        qo7Var3.getClass();
                        ro7Var = qo7Var3.a;
                        if (ro7Var != null) {
                        }
                        return qo7Var3;
                    }
                    i.g(cls.getName(), " using @AssistedInject but no creation callback was provided in CreationExtras.", "Found @HiltViewModel-annotated class ");
                    return qo7Var3;
                } else {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
            default:
                ar0 a = gh5.a(cls);
                so7[] so7VarArr = (so7[]) this.b;
                so7[] so7VarArr2 = (so7[]) Arrays.copyOf(so7VarArr, so7VarArr.length);
                int length = so7VarArr2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        so7Var = so7VarArr2[i];
                        if (!so7Var.a.equals(a)) {
                            i++;
                        }
                    } else {
                        so7Var = null;
                    }
                }
                if (so7Var != null && (qn2Var = so7Var.b) != null) {
                    qo7Var2 = (qo7) qn2Var.g(m94Var);
                } else {
                    qo7Var2 = null;
                }
                if (qo7Var2 != null) {
                    return qo7Var2;
                }
                u34.w(a.b(), "No initializer set for given class ");
                return null;
        }
    }
}
