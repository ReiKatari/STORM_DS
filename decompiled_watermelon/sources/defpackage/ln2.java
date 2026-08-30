package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ln2  reason: default package */
/* loaded from: classes.dex */
public abstract class ln2 implements ey5 {
    public static ax2 A;
    public static final /* synthetic */ int B = 0;

    public static final float A(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = RecyclerView.A1;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void B(e31 e31Var) {
        c63 c63Var = (c63) e31Var.I(k45.d0);
        if (c63Var != null && !c63Var.d()) {
            throw c63Var.K();
        }
    }

    public static final c63 D(e31 e31Var) {
        c63 c63Var = (c63) e31Var.I(k45.d0);
        if (c63Var != null) {
            return c63Var;
        }
        f81.p(e31Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final eh1 E(c63 c63Var, boolean z, f63 f63Var) {
        if (c63Var instanceof p63) {
            return ((p63) c63Var).Y(z, f63Var);
        }
        return c63Var.f0(f63Var.q(), z, new z(1, f63Var, f63.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 24));
    }

    public static final m93 F(Object obj, m93... m93VarArr) {
        Class[] clsArr;
        try {
            if (m93VarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = m93VarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = m93.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(m93VarArr, m93VarArr.length));
            if (invoke instanceof m93) {
                return (m93) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e;
        }
    }

    public static final boolean G(e31 e31Var) {
        c63 c63Var = (c63) e31Var.I(k45.d0);
        if (c63Var != null) {
            return c63Var.d();
        }
        return true;
    }

    public static final boolean H(qo0 qo0Var) {
        qo0Var.getClass();
        Class a = qo0Var.a();
        a.getClass();
        return a.isInterface();
    }

    public static int I(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        f81.j(wh1.f(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    public static final long J(long j, long j2, float f) {
        return (Float.floatToRawIntBits(ep2.y(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f)) << 32) | (Float.floatToRawIntBits(ep2.y(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f)) & 4294967295L);
    }

    public static sh L(String str) {
        dw4 dw4Var;
        int i;
        String str2;
        if (gh6.n0(str, "HTTP/1.", false)) {
            i = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        dw4Var = dw4.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    dw4Var = dw4.HTTP_1_0;
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (gh6.n0(str, "ICY ", false)) {
            dw4Var = dw4.HTTP_1_0;
            i = 4;
        } else if (gh6.n0(str, "SOURCETABLE ", false)) {
            dw4Var = dw4.HTTP_1_1;
            i = 12;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            Integer o0 = gh6.o0(str.substring(i, i2));
            if (o0 != null) {
                int intValue = o0.intValue();
                if (str.length() > i2) {
                    if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new sh(dw4Var, intValue, str2);
            }
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    public static PorterDuff.Mode M(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case ig7.e /* 15 */:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static final void N(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        float A2;
        if (i == 0) {
            mz2.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        for (int i9 = 0; i9 < i3; i9++) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float A3 = A(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * A3);
                }
            }
            float sqrt = (float) Math.sqrt(A(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            for (int i13 = 0; i13 < i3; i13++) {
                if (i13 < i9) {
                    A2 = RecyclerView.A1;
                } else {
                    A2 = A(fArr7, fArr4[i13]);
                }
                fArr10[i13] = A2;
            }
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float A4 = A(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    A4 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = A4 / fArr11[i14];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e0, code lost:
        r0 = defpackage.hi2.e(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e4, code lost:
        defpackage.iq2.h(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.gm6 P(defpackage.ls5 r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln2.P(ls5, java.lang.String):gm6");
    }

    public static final l44 Q(k54[] k54VarArr, tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        Context context = (Context) sk2Var.j(ue.b);
        Object[] copyOf = Arrays.copyOf(k54VarArr, k54VarArr.length);
        ci3 ci3Var = new ci3(22, new qt0(18), new kb2(14, context));
        boolean h = sk2Var.h(context);
        Object L = sk2Var.L();
        if (h || L == su0.a) {
            L = new vg0(context, 5);
            sk2Var.h0(L);
        }
        l44 l44Var = (l44) jk2.O(copyOf, ci3Var, (ki2) L, sk2Var, 0, 4);
        for (k54 k54Var : k54VarArr) {
            l44Var.b.s.a(k54Var);
        }
        return l44Var;
    }

    public static final void R(List list, mi2 mi2Var) {
        list.getClass();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((Boolean) mi2Var.n(it.next())).booleanValue()) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            list.remove(i);
        }
    }

    public static final Object S(mt6 mt6Var, aj2 aj2Var) {
        E(mt6Var, true, new hh1(dk7.x(mt6Var.Y.a()).Q(mt6Var.Z, mt6Var, mt6Var.X)));
        return T(mt6Var, false, mt6Var, aj2Var);
    }

    public static final Object T(fv5 fv5Var, boolean z, fv5 fv5Var2, aj2 aj2Var) {
        ns0 ns0Var;
        Object d0;
        try {
            if (!(aj2Var instanceof m00)) {
                ns0Var = nk2.c0(aj2Var, fv5Var2, fv5Var);
            } else {
                l07.q(2, aj2Var);
                ns0Var = aj2Var.j(fv5Var2, fv5Var);
            }
        } catch (ig1 e) {
            Throwable th = e.A;
            fv5Var.c0(new ns0(th, false));
            throw th;
        } catch (Throwable th2) {
            ns0Var = new ns0(th2, false);
        }
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        if (ns0Var == p31Var || (d0 = fv5Var.d0(ns0Var)) == q63.b) {
            return p31Var;
        }
        fv5Var.w0();
        if (d0 instanceof ns0) {
            if (!z) {
                Throwable th3 = ((ns0) d0).a;
                if ((th3 instanceof lt6) && ((lt6) th3).A == fv5Var) {
                    if (ns0Var instanceof ns0) {
                        throw ((ns0) ns0Var).a;
                    }
                    return ns0Var;
                }
            }
            throw ((ns0) d0).a;
        }
        return q63.a(d0);
    }

    public static final long U(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * intBitsToFloat) << 32);
    }

    public static final Object V(long j, aj2 aj2Var, k11 k11Var) {
        if (j > 0) {
            Object S = S(new mt6(j, k11Var), aj2Var);
            p31 p31Var = p31.COROUTINE_SUSPENDED;
            return S;
        }
        throw new lt6("Timed out immediately", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, n75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W(long r7, defpackage.aj2 r9, defpackage.k11 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.nt6
            if (r0 == 0) goto L13
            r0 = r10
            nt6 r0 = (defpackage.nt6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            nt6 r0 = new nt6
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            n75 r7 = r0.R
            defpackage.me2.a0(r10)     // Catch: defpackage.lt6 -> L2a
            return r10
        L2a:
            r8 = move-exception
            goto L56
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            return r3
        L32:
            defpackage.me2.a0(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3c
            goto L5c
        L3c:
            n75 r10 = new n75
            r10.<init>()
            r0.R = r10     // Catch: defpackage.lt6 -> L54
            r0.Y = r4     // Catch: defpackage.lt6 -> L54
            mt6 r2 = new mt6     // Catch: defpackage.lt6 -> L54
            r2.<init>(r7, r0)     // Catch: defpackage.lt6 -> L54
            r10.A = r2     // Catch: defpackage.lt6 -> L54
            java.lang.Object r7 = S(r2, r9)     // Catch: defpackage.lt6 -> L54
            if (r7 != r1) goto L53
            return r1
        L53:
            return r7
        L54:
            r8 = move-exception
            r7 = r10
        L56:
            c63 r9 = r8.A
            java.lang.Object r7 = r7.A
            if (r9 != r7) goto L5d
        L5c:
            return r3
        L5d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln2.W(long, aj2, k11):java.lang.Object");
    }

    public static final Object X(j11 j11Var, mi2 mi2Var, sq5 sq5Var) {
        g31 g31Var;
        k06 k06Var;
        i51 i51Var = new i51(mi2Var, null);
        ow6 ow6Var = (ow6) j11Var.a().I(ow6.B);
        if (ow6Var != null) {
            g31Var = ow6Var.A;
        } else {
            g31Var = null;
        }
        if (g31Var != null) {
            return tq5.G(g31Var, i51Var, j11Var);
        }
        ih0 ih0Var = new ih0(1, nk2.J(j11Var));
        ih0Var.x();
        try {
            k06Var = sq5Var.d;
        } catch (RejectedExecutionException e) {
            ih0Var.r(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        if (k06Var != null) {
            k06Var.execute(new fs4(ih0Var, sq5Var, i51Var));
            Object v = ih0Var.v();
            p31 p31Var = p31.COROUTINE_SUSPENDED;
            return v;
        }
        b53.g0("internalTransactionExecutor");
        throw null;
    }

    public static final void e(final ax2 ax2Var, final long j, final String str, final ki2 ki2Var, tu0 tu0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1143998161);
        if (sk2Var.f(ax2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (sk2Var.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (sk2Var.f(str)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (sk2Var.h(ki2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i9 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            i20 i20Var = y60.h0;
            wy3 wy3Var = wy3.a;
            zy3 Y = b53.Y(a53.s(o76.c(wy3Var, 1.0f), false, null, ki2Var, 15), 18.0f, 12.0f);
            sr5 a = rr5.a(rt.a, i20Var, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            ev2.a(ax2Var, null, o76.h(wy3Var, 20.0f), j, sk2Var, (i9 & 14) | 432 | ((i9 << 6) & 7168), 0);
            cg2.k(sk2Var, o76.k(wy3Var, 14.0f));
            ir6.b(str, null, C.g, hi2.B(14), pe2.Z, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, ((i9 >> 6) & 14) | 199680, 0, 131026);
            sk2Var = sk2Var;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(j, str, ki2Var, i) { // from class: ik5
                public final /* synthetic */ long B;
                public final /* synthetic */ String L;
                public final /* synthetic */ ki2 R;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(1);
                    ln2.e(ax2.this, this.B, this.L, this.R, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static final c46 f() {
        return d46.b(0, 1, h60.DROP_OLDEST, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, ci4] */
    public static final void g(ya1 ya1Var, zy3 zy3Var, ih4 ih4Var, k45 k45Var, i20 i20Var, ba6 ba6Var, boolean z, u54 u54Var, sn1 sn1Var, eg egVar, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z2;
        ih4 ih4Var2;
        k45 k45Var2;
        i20 i20Var2;
        ba6 ba6Var2;
        xa1 xa1Var;
        sn1 sn1Var2;
        eg egVar2;
        i20 i20Var3;
        boolean z3;
        ba6 ba6Var3;
        int i3;
        k45 k45Var3;
        sn1 sn1Var3;
        mh4 mh4Var;
        eg a;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1860873769);
        if (sk2Var.f(ya1Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 811298176;
        boolean z4 = true;
        if ((306783379 & i4) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (sk2Var.O(i4 & 1, z2)) {
            sk2Var.T();
            if ((i & 1) != 0 && !sk2Var.y()) {
                sk2Var.R();
                i3 = i4 & (-29360129);
                mh4Var = ih4Var;
                k45Var3 = k45Var;
                i20Var3 = i20Var;
                ba6Var3 = ba6Var;
                xa1Var = u54Var;
                sn1Var3 = sn1Var;
                a = egVar;
            } else {
                mh4 mh4Var2 = new mh4(RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1);
                k45 k45Var4 = k45.i0;
                i20Var3 = y60.h0;
                int i5 = (i4 & 14) | 196608;
                ?? obj = new Object();
                x81 a2 = oc6.a(sk2Var);
                y55 y55Var = tc7.a;
                sc6 P0 = ct3.P0(RecyclerView.A1, 400.0f, Float.valueOf(1.0f), 1);
                od1 od1Var = (od1) sk2Var.j(ov0.h);
                sd3 sd3Var = (sd3) sk2Var.j(ov0.n);
                if ((((i5 & 14) ^ 6) > 4 && sk2Var.f(ya1Var)) || (i5 & 6) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean f = z3 | sk2Var.f(a2) | sk2Var.f(P0) | sk2Var.f(obj) | sk2Var.f(od1Var) | sk2Var.d(sd3Var.ordinal());
                Object L = sk2Var.L();
                Object obj2 = su0.a;
                if (f || L == obj2) {
                    Object ba6Var4 = new ba6(new ci3(ya1Var, new l4(7, ya1Var, sd3Var), (ci4) obj), a2, P0);
                    sk2Var.h0(ba6Var4);
                    L = ba6Var4;
                }
                ba6Var3 = (ba6) L;
                int i6 = i4 & (-29360129);
                jf4 jf4Var = jf4.Horizontal;
                int i7 = (i4 & 14) | 432;
                if ((((i7 & 14) ^ 6) <= 4 || !sk2Var.f(ya1Var)) && (i7 & 6) != 4) {
                    z4 = false;
                }
                Object L2 = sk2Var.L();
                if (z4 || L2 == obj2) {
                    L2 = new xa1(ya1Var, jf4Var);
                    sk2Var.h0(L2);
                }
                xa1Var = (xa1) L2;
                i3 = i6;
                k45Var3 = k45Var4;
                sn1Var3 = sn1.s0;
                mh4Var = mh4Var2;
                a = ug4.a(sk2Var);
            }
            sk2Var.q();
            jk2.g(zy3Var, ya1Var, mh4Var, jf4.Horizontal, ba6Var3, z, a, k45Var3, xa1Var, i20Var3, sn1Var3, et0Var, sk2Var, ((i3 << 3) & 112) | 907570566, 1797510);
            ih4Var2 = mh4Var;
            i20Var2 = i20Var3;
            sn1Var2 = sn1Var3;
            egVar2 = a;
            ba6Var2 = ba6Var3;
            k45Var2 = k45Var3;
        } else {
            sk2Var.R();
            ih4Var2 = ih4Var;
            k45Var2 = k45Var;
            i20Var2 = i20Var;
            ba6Var2 = ba6Var;
            xa1Var = u54Var;
            sn1Var2 = sn1Var;
            egVar2 = egVar;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new th4(ya1Var, zy3Var, ih4Var2, k45Var2, i20Var2, ba6Var2, z, xa1Var, sn1Var2, egVar2, et0Var, i);
        }
    }

    public static e63 h() {
        return new e63(null);
    }

    public static final void i(et0 et0Var, aj2 aj2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1302703572);
        if (sk2Var.h(et0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (sk2Var.h(aj2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i5 & 1, z)) {
            zy3 b0 = b53.b0(wy3.a, 16.0f, RecyclerView.A1, 8.0f, RecyclerView.A1, 10);
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = new wf(10);
                sk2Var.h0(L);
            }
            tv3 tv3Var = (tv3) L;
            int j0 = dt3.j0(sk2Var);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, b0);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, tv3Var);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l);
            dn dnVar3 = mu0.g;
            if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j0))) {
                b31.w(j0, sk2Var, j0, dnVar3);
            }
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            zy3 Z = b53.Z(iq2.w("text"), RecyclerView.A1, 6.0f, 1);
            j20 j20Var = y60.L;
            tv3 d = d50.d(j20Var, false);
            int j02 = dt3.j0(sk2Var);
            sm4 l2 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, Z);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d);
            oo2.S(sk2Var, dnVar2, l2);
            if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j02))) {
                b31.w(j02, sk2Var, j02, dnVar3);
            }
            oo2.S(sk2Var, dnVar4, e02);
            et0Var.j(sk2Var, Integer.valueOf(i5 & 14));
            sk2Var.p(true);
            zy3 w = iq2.w("action");
            tv3 d2 = d50.d(j20Var, false);
            int j03 = dt3.j0(sk2Var);
            sm4 l3 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, w);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d2);
            oo2.S(sk2Var, dnVar2, l3);
            if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j03))) {
                b31.w(j03, sk2Var, j03, dnVar3);
            }
            oo2.S(sk2Var, dnVar4, e03);
            aj2Var.j(sk2Var, Integer.valueOf((i5 >> 3) & 14));
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new s96(et0Var, aj2Var, i);
        }
    }

    public static final void j(boolean z, aj2 aj2Var, tu0 tu0Var, int i) {
        int i2;
        boolean z2;
        c54 c54Var;
        q9 q9Var;
        lc4 lc4Var;
        int i3;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-642000585);
        if ((i & 6) == 0) {
            if (sk2Var.g(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(aj2Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        boolean z3 = true;
        if ((i2 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i2 & 1, z2)) {
            Object a = zq3.a(sk2Var);
            if (a == null) {
                sk2Var.X(1512740606);
                a = ar3.a(sk2Var);
            } else {
                sk2Var.X(1512737723);
            }
            sk2Var.p(false);
            if (a != null) {
                boolean f = sk2Var.f(a);
                Object L = sk2Var.L();
                sn1 sn1Var = su0.a;
                if (f || L == sn1Var) {
                    kc4 kc4Var = null;
                    if (a instanceof c54) {
                        c54Var = (c54) a;
                    } else {
                        c54Var = null;
                    }
                    if (c54Var != null) {
                        q9Var = c54Var.a();
                    } else {
                        q9Var = null;
                    }
                    if (a instanceof lc4) {
                        lc4Var = (lc4) a;
                    } else {
                        lc4Var = null;
                    }
                    if (lc4Var != null) {
                        kc4Var = lc4Var.b();
                    }
                    L = new ny(q9Var, kc4Var);
                    sk2Var.h0(L);
                }
                ny nyVar = (ny) L;
                Object L2 = sk2Var.L();
                if (L2 == sn1Var) {
                    L2 = l.A(sk2Var);
                    sk2Var.h0(L2);
                }
                o31 o31Var = (o31) L2;
                long j = sk2Var.T;
                boolean f2 = sk2Var.f(nyVar) | sk2Var.e(j);
                Object L3 = sk2Var.L();
                if (f2 || L3 == sn1Var) {
                    L3 = new eu0(o31Var, new rr4(j, a));
                    sk2Var.h0(L3);
                }
                eu0 eu0Var = (eu0) L3;
                sk2Var.X(-348514256);
                boolean h = sk2Var.h(eu0Var) | sk2Var.h(aj2Var);
                Object L4 = sk2Var.L();
                if (h || L4 == sn1Var) {
                    L4 = new jd2(15, eu0Var, aj2Var);
                    sk2Var.h0(L4);
                }
                l.j((ki2) L4, sk2Var);
                Boolean valueOf = Boolean.valueOf(z);
                boolean h2 = sk2Var.h(eu0Var);
                int i5 = i2 & 14;
                if (i5 != 4) {
                    z3 = false;
                }
                boolean z4 = z3 | h2;
                Object L5 = sk2Var.L();
                if (z4 || L5 == sn1Var) {
                    L5 = new py(eu0Var, z, 4);
                    sk2Var.h0(L5);
                }
                gk2.h(valueOf, eu0Var, null, (mi2) L5, sk2Var, i5);
                boolean h3 = sk2Var.h(nyVar) | sk2Var.h(eu0Var);
                Object L6 = sk2Var.L();
                if (h3 || L6 == sn1Var) {
                    L6 = new gi2(29, nyVar, eu0Var);
                    sk2Var.h0(L6);
                }
                l.e(nyVar, eu0Var, (mi2) L6, sk2Var);
                sk2Var.p(false);
            } else {
                i.n("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new qy(z, aj2Var, i);
        }
    }

    public static final void k(final rg5 rg5Var, final ki2 ki2Var, final mi2 mi2Var, final mi2 mi2Var2, final mi2 mi2Var3, final mi2 mi2Var4, tu0 tu0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        sk2 sk2Var;
        m55 r;
        aj2 aj2Var;
        ki2Var.getClass();
        mi2Var.getClass();
        mi2Var2.getClass();
        mi2Var3.getClass();
        mi2Var4.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-249146493);
        if (sk2Var2.h(rg5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (sk2Var2.h(mi2Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i8 = i7 | i3;
        if (sk2Var2.h(mi2Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i9 = i8 | i4;
        if (sk2Var2.h(mi2Var3)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i10 = i9 | i5;
        if (sk2Var2.h(mi2Var4)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i11 = i10 | i6;
        if ((74899 & i11) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i11 & 1, z)) {
            if (rg5Var == null) {
                r = sk2Var2.r();
                if (r != null) {
                    aj2Var = new aj2(rg5Var, ki2Var, mi2Var, mi2Var2, mi2Var3, mi2Var4, i, 0) { // from class: ek5
                        public final /* synthetic */ int A;
                        public final /* synthetic */ rg5 B;
                        public final /* synthetic */ ki2 L;
                        public final /* synthetic */ mi2 R;
                        public final /* synthetic */ mi2 X;
                        public final /* synthetic */ mi2 Y;
                        public final /* synthetic */ mi2 Z;

                        {
                            this.A = r8;
                        }

                        @Override // defpackage.aj2
                        public final Object j(Object obj, Object obj2) {
                            int i12 = this.A;
                            o27 o27Var = o27.a;
                            switch (i12) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int I = ep2.I(49);
                                    ln2.k(this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj, I);
                                    return o27Var;
                                default:
                                    ((Integer) obj2).getClass();
                                    int I2 = ep2.I(49);
                                    ln2.k(this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj, I2);
                                    return o27Var;
                            }
                        }
                    };
                    r.d = aj2Var;
                }
                return;
            }
            sk2Var = sk2Var2;
            dt3.t(ki2Var, null, ct3.H0(-651446118, new fk5(mj2.C(sk2Var2), rg5Var, mi2Var, mi2Var2, ki2Var, mi2Var3, mi2Var4, 0), sk2Var2), sk2Var, 390, 2);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        r = sk2Var.r();
        if (r != null) {
            aj2Var = new aj2(rg5Var, ki2Var, mi2Var, mi2Var2, mi2Var3, mi2Var4, i, 1) { // from class: ek5
                public final /* synthetic */ int A;
                public final /* synthetic */ rg5 B;
                public final /* synthetic */ ki2 L;
                public final /* synthetic */ mi2 R;
                public final /* synthetic */ mi2 X;
                public final /* synthetic */ mi2 Y;
                public final /* synthetic */ mi2 Z;

                {
                    this.A = r8;
                }

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    int i12 = this.A;
                    o27 o27Var = o27.a;
                    switch (i12) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int I = ep2.I(49);
                            ln2.k(this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj, I);
                            return o27Var;
                        default:
                            ((Integer) obj2).getClass();
                            int I2 = ep2.I(49);
                            ln2.k(this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj, I2);
                            return o27Var;
                    }
                }
            };
            r.d = aj2Var;
        }
    }

    public static final iz5 l(vf3 vf3Var, boolean z) {
        yy3 yy3Var = (yy3) vf3Var.A0.g;
        gz5 gz5Var = null;
        if ((yy3Var.R & 8) != 0) {
            loop0: while (true) {
                if (yy3Var == null) {
                    break;
                }
                if ((yy3Var.L & 8) != 0) {
                    yy3 yy3Var2 = yy3Var;
                    o24 o24Var = null;
                    while (yy3Var2 != null) {
                        if (yy3Var2 instanceof gz5) {
                            gz5Var = yy3Var2;
                            break loop0;
                        }
                        if ((yy3Var2.L & 8) != 0 && (yy3Var2 instanceof xc1)) {
                            int i = 0;
                            for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                if ((yy3Var3.L & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        yy3Var2 = yy3Var3;
                                    } else {
                                        if (o24Var == null) {
                                            o24Var = new o24(new yy3[16]);
                                        }
                                        if (yy3Var2 != null) {
                                            o24Var.b(yy3Var2);
                                            yy3Var2 = null;
                                        }
                                        o24Var.b(yy3Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        yy3Var2 = l.p(o24Var);
                    }
                }
                if ((yy3Var.R & 8) == 0) {
                    break;
                }
                yy3Var = yy3Var.Y;
            }
        }
        gz5Var.getClass();
        yy3 yy3Var4 = ((yy3) gz5Var).A;
        ez5 w = vf3Var.w();
        if (w == null) {
            w = new ez5();
        }
        return new iz5(yy3Var4, z, vf3Var, w);
    }

    public static final void m(zy3 zy3Var, aj2 aj2Var, y26 y26Var, long j, long j2, float f, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        sk2 sk2Var;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-662779944);
        if ((i & 6) == 0) {
            if (sk2Var2.f(zy3Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var2.h(aj2Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        boolean z = false;
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var2.g(false)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (sk2Var2.f(y26Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (sk2Var2.e(j)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (sk2Var2.e(j2)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((i & 1572864) == 0) {
            if (sk2Var2.c(f)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (sk2Var2.h(et0Var)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if ((4793491 & i2) != 4793490) {
            z = true;
        }
        if (sk2Var2.O(i2 & 1, z)) {
            sk2Var2.T();
            if ((i & 1) != 0 && !sk2Var2.y()) {
                sk2Var2.R();
            }
            sk2Var2.q();
            int i11 = i2 >> 6;
            sk2Var = sk2Var2;
            mj2.f(zy3Var, y26Var, j, j2, f, ct3.H0(-1429068516, new s96(aj2Var, et0Var, 3), sk2Var2), sk2Var, 1572864 | (i2 & 14) | (i11 & 112) | (i11 & 896) | (i11 & 7168) | ((i2 >> 3) & 458752), 16);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new rp(zy3Var, aj2Var, y26Var, j, j2, f, et0Var, i);
        }
    }

    public static final void n(final p96 p96Var, zy3 zy3Var, y26 y26Var, long j, long j2, long j3, float f, tu0 tu0Var, final int i) {
        int i2;
        boolean z;
        sk2 sk2Var;
        final zy3 zy3Var2;
        final y26 y26Var2;
        final long j4;
        final long j5;
        final long j6;
        final float f2;
        int i3;
        int i4;
        long h;
        int i5;
        zy3 zy3Var3;
        long j7;
        long j8;
        float f3;
        fr5 fr5Var;
        et0 et0Var;
        boolean h2;
        int i6;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(258660814);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h2 = sk2Var2.f(p96Var);
            } else {
                h2 = sk2Var2.h(p96Var);
            }
            if (h2) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 432;
        if ((i & 3072) == 0) {
            i7 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i7 |= 8192;
        }
        if ((196608 & i) == 0) {
            i7 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i7 |= 524288;
        }
        int i8 = i7 | 12582912;
        if ((4793491 & i8) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i8 & 1, z)) {
            sk2Var2.T();
            if ((i & 1) != 0 && !sk2Var2.y()) {
                sk2Var2.R();
                zy3Var3 = zy3Var;
                fr5Var = y26Var;
                j7 = j;
                j8 = j2;
                f3 = f;
                i3 = 12582912;
                i5 = i8 & (-4193281);
                h = j3;
            } else {
                fr5 fr5Var2 = ((m36) sk2Var2.j(n36.a)).a;
                ye6 ye6Var = ir0.a;
                long r = mh7.r(xq0.b(0.8f, ((hr0) sk2Var2.j(ye6Var)).f()), ((hr0) sk2Var2.j(ye6Var)).j());
                long j9 = ((hr0) sk2Var2.j(ye6Var)).j();
                hr0 hr0Var = (hr0) sk2Var2.j(ye6Var);
                if (hr0Var.k()) {
                    i3 = 12582912;
                    i4 = i8;
                    h = mh7.r(xq0.b(0.6f, hr0Var.j()), hr0Var.g());
                } else {
                    i3 = 12582912;
                    i4 = i8;
                    h = hr0Var.h();
                }
                i5 = i4 & (-4193281);
                zy3Var3 = wy3.a;
                j7 = r;
                j8 = j9;
                f3 = 6.0f;
                fr5Var = fr5Var2;
            }
            sk2Var2.q();
            String str = p96Var.b;
            if (str != null) {
                sk2Var2.X(593497188);
                et0Var = ct3.H0(1843479216, new h7(h, p96Var, str), sk2Var2);
                sk2Var2.p(false);
            } else {
                sk2Var2.X(593796152);
                sk2Var2.p(false);
                et0Var = null;
            }
            sk2Var = sk2Var2;
            m(b53.X(zy3Var3, 12.0f), et0Var, fr5Var, j7, j8, f3, ct3.H0(-261845785, new m96(p96Var, 1), sk2Var2), sk2Var, (i5 & 896) | i3 | ((i5 >> 3) & 3670016));
            long j10 = h;
            zy3Var2 = zy3Var3;
            j6 = j10;
            y26Var2 = fr5Var;
            j4 = j7;
            j5 = j8;
            f2 = f3;
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
            zy3Var2 = zy3Var;
            y26Var2 = y26Var;
            j4 = j;
            j5 = j2;
            j6 = j3;
            f2 = f;
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new aj2() { // from class: t96
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ln2.n(p96.this, zy3Var2, y26Var2, j4, j5, j6, f2, (tu0) obj, ep2.I(i | 1));
                    return o27.a;
                }
            };
        }
    }

    public static final void o(boolean z, rb5 rb5Var, bq6 bq6Var, tu0 tu0Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        mr6 d;
        int i3;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1344558920);
        if ((i & 6) == 0) {
            if (sk2Var.g(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.d(rb5Var.ordinal())) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(bq6Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i2 & 1, z2)) {
            int i6 = i2 & 14;
            if (i6 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f = z3 | sk2Var.f(bq6Var);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (f || L == sn1Var) {
                L = new yp6(bq6Var, z);
                sk2Var.h0(L);
            }
            vo6 vo6Var = (vo6) L;
            boolean h = sk2Var.h(bq6Var);
            if (i6 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | h;
            Object L2 = sk2Var.L();
            if (z5 || L2 == sn1Var) {
                L2 = new cq6(bq6Var, z);
                sk2Var.h0(L2);
            }
            rb4 rb4Var = (rb4) L2;
            boolean g = vr6.g(bq6Var.n().b);
            if (z) {
                j = bq6Var.n().b >> 32;
            } else {
                j = bq6Var.n().b & 4294967295L;
            }
            int i7 = (int) j;
            hm3 hm3Var = bq6Var.d;
            float f2 = RecyclerView.A1;
            if (hm3Var != null && (d = hm3Var.d()) != null) {
                lr6 lr6Var = d.a;
                if (i7 >= 0) {
                    kr6 kr6Var = lr6Var.a;
                    q04 q04Var = lr6Var.b;
                    if (kr6Var.a.B.length() != 0) {
                        int min = Math.min(q04Var.d(i7), Math.min(q04Var.b - 1, q04Var.f - 1));
                        if (i7 <= q04Var.c(min, false)) {
                            q04Var.m(min);
                            ArrayList arrayList = q04Var.h;
                            wi4 wi4Var = (wi4) arrayList.get(yf2.r(min, arrayList));
                            qi qiVar = wi4Var.a;
                            int i8 = min - wi4Var.d;
                            jr6 jr6Var = qiVar.d;
                            f2 = jr6Var.e(i8) - jr6Var.g(i8);
                        }
                    }
                }
            }
            float f3 = f2;
            boolean h2 = sk2Var.h(vo6Var);
            Object L3 = sk2Var.L();
            if (h2 || L3 == sn1Var) {
                L3 = new dg(7, vo6Var);
                sk2Var.h0(L3);
            }
            se.d(rb4Var, z, rb5Var, g, 0L, f3, pk6.a(wy3.a, vo6Var, (PointerInputEventHandler) L3), sk2Var, (i2 << 3) & 1008);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new ml(z, rb5Var, bq6Var, i);
        }
    }

    public static final void p(et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(343813818);
        if (sk2Var.h(et0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = wf.k;
                sk2Var.h0(L);
            }
            tv3 tv3Var = (tv3) L;
            int j0 = dt3.j0(sk2Var);
            sm4 l = sk2Var.l();
            wy3 wy3Var = wy3.a;
            zy3 e0 = l07.e0(sk2Var, wy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, tv3Var);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l);
            dn dnVar3 = mu0.g;
            if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j0))) {
                b31.w(j0, sk2Var, j0, dnVar3);
            }
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            zy3 Y = b53.Y(wy3Var, 16.0f, 6.0f);
            tv3 d = d50.d(y60.L, false);
            int j02 = dt3.j0(sk2Var);
            sm4 l2 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, Y);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d);
            oo2.S(sk2Var, dnVar2, l2);
            if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j02))) {
                b31.w(j02, sk2Var, j02, dnVar3);
            }
            oo2.S(sk2Var, dnVar4, e02);
            et0Var.j(sk2Var, Integer.valueOf(i3 & 14));
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new sp(et0Var, i, 10);
        }
    }

    public static final void q(u57 u57Var, rp4 rp4Var, long j) {
        ac1 ac1Var = (ac1) u57Var.B;
        ac1Var.getClass();
        s77 s77Var = (s77) ac1Var.L;
        s77 s77Var2 = (s77) ac1Var.B;
        boolean o = ve2.o(rp4Var);
        long j2 = rp4Var.b;
        if (o) {
            nu.l0(0, r6.length, null, s77Var2.d);
            s77Var2.e = 0;
            nu.l0(0, r6.length, null, s77Var.d);
            s77Var.e = 0;
            ac1Var.A = 0L;
        }
        if (!ve2.q(rp4Var)) {
            List list = rp4Var.m;
            if (list == null) {
                list = pp1.A;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                ur2 ur2Var = (ur2) list.get(i);
                ac1Var.d(ur2Var.a, mb4.e(ur2Var.e, j));
                i++;
            }
            ac1Var.d(j2, mb4.e(rp4Var.n, j));
        }
        if (ve2.q(rp4Var) && j2 - ac1Var.A > 40) {
            nu.l0(0, r0.length, null, s77Var2.d);
            s77Var2.e = 0;
            nu.l0(0, r2.length, null, s77Var.d);
            s77Var.e = 0;
            ac1Var.A = 0L;
        }
        ac1Var.A = j2;
    }

    public static final List r(hm1 hm1Var, int i, int i2, ArrayList arrayList, i14 i14Var, int i3, int i4, int i5, mi2 mi2Var) {
        int i6;
        i14 i14Var2;
        hj3 hj3Var;
        long j;
        long j2;
        int i7;
        Object obj;
        int i8;
        int max;
        long j3;
        if (hm1Var != null && !arrayList.isEmpty() && (i6 = i14Var.b) != 0) {
            int i9 = -1;
            if (i2 - i >= 0 && i6 != 0) {
                d33 t0 = io2.t0(0, i6);
                int i10 = t0.A;
                int i11 = t0.B;
                int i12 = -1;
                if (i10 <= i11) {
                    while (i14Var.c(i10) <= i) {
                        i12 = i14Var.c(i10);
                        if (i10 == i11) {
                            break;
                        }
                        i10++;
                    }
                }
                if (i12 == -1) {
                    i14Var2 = x23.a;
                } else {
                    i14 i14Var3 = x23.a;
                    i14Var2 = new i14(1);
                    i14Var2.a(i12);
                }
            } else {
                i14Var2 = x23.a;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                Object obj2 = arrayList.get(i13);
                int index = ((hj3) obj2).getIndex();
                int[] iArr = i14Var.a;
                int i14 = i14Var.b;
                int i15 = 0;
                while (true) {
                    if (i15 >= i14) {
                        break;
                    } else if (iArr[i15] == index) {
                        arrayList3.add(obj2);
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            int[] iArr2 = i14Var2.a;
            int i16 = i14Var2.b;
            int i17 = 0;
            while (i17 < i16) {
                int i18 = iArr2[i17];
                int size2 = arrayList.size();
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    if (i20 < size2) {
                        Object obj3 = arrayList.get(i20);
                        i20++;
                        if (((hj3) obj3).getIndex() == i18) {
                            break;
                        }
                        i19++;
                    } else {
                        i19 = i9;
                        break;
                    }
                }
                if (i19 == i9) {
                    hj3Var = (hj3) mi2Var.n(Integer.valueOf(i18));
                } else {
                    hj3Var = (hj3) arrayList.remove(i19);
                }
                int e = hj3Var.e();
                if (i19 == i9) {
                    j = 4294967295L;
                    i7 = Integer.MIN_VALUE;
                } else {
                    long f = hj3Var.f(0);
                    if (hj3Var.b()) {
                        j = 4294967295L;
                        j2 = f & 4294967295L;
                    } else {
                        j = 4294967295L;
                        j2 = f >> 32;
                    }
                    i7 = (int) j2;
                }
                int size3 = arrayList3.size();
                int i21 = 0;
                while (true) {
                    if (i21 < size3) {
                        obj = arrayList3.get(i21);
                        if (((hj3) obj).getIndex() != i18) {
                            break;
                        }
                        i21++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                hj3 hj3Var2 = (hj3) obj;
                if (hj3Var2 != null) {
                    long f2 = hj3Var2.f(0);
                    if (hj3Var2.b()) {
                        j3 = f2 & j;
                    } else {
                        j3 = f2 >> 32;
                    }
                    i8 = (int) j3;
                } else {
                    i8 = Integer.MIN_VALUE;
                }
                if (i7 == Integer.MIN_VALUE) {
                    max = -i3;
                } else {
                    max = Math.max(-i3, i7);
                }
                if (i8 != Integer.MIN_VALUE) {
                    max = Math.min(max, i8 - e);
                }
                hj3Var.c();
                hj3Var.d(max, i4, i5);
                arrayList2.add(hj3Var);
                i17++;
                i9 = -1;
            }
            return arrayList2;
        }
        return pp1.A;
    }

    public static final float s(long j, float f, long j2, long j3) {
        long r = mh7.r(xq0.b(f, j), j3);
        float V = mh7.V(mh7.r(j2, r)) + 0.05f;
        float V2 = mh7.V(r) + 0.05f;
        return Math.max(V, V2) / Math.min(V, V2);
    }

    public static final void t(e31 e31Var, CancellationException cancellationException) {
        c63 c63Var = (c63) e31Var.I(k45.d0);
        if (c63Var != null) {
            c63Var.i(cancellationException);
        }
    }

    public static final Object u(c63 c63Var, nk6 nk6Var) {
        c63Var.i(null);
        Object Z = c63Var.Z(nk6Var);
        if (Z == p31.COROUTINE_SUSPENDED) {
            return Z;
        }
        return o27.a;
    }

    public static za1 v(int i, int i2, long j, tu0 tu0Var) {
        if ((i2 & 1) != 0) {
            j = ((hr0) ((sk2) tu0Var).j(ir0.a)).i();
        }
        long j2 = j;
        ye6 ye6Var = ir0.a;
        long b = xq0.b(0.6f, ((hr0) ((sk2) tu0Var).j(ye6Var)).f());
        sk2 sk2Var = (sk2) tu0Var;
        long f = ((hr0) sk2Var.j(ye6Var)).f();
        long j3 = ((xq0) sk2Var.j(e01.a)).a;
        if (((hr0) sk2Var.j(ye6Var)).k()) {
            mh7.V(j3);
        } else {
            mh7.V(j3);
        }
        long b2 = xq0.b(0.38f, f);
        boolean e = ((sk2) tu0Var).e(j2) | ((sk2) tu0Var).e(b) | ((sk2) tu0Var).e(b2);
        sk2 sk2Var2 = (sk2) tu0Var;
        Object L = sk2Var2.L();
        if (e || L == su0.a) {
            za1 za1Var = new za1(j2, b, b2);
            sk2Var2.h0(za1Var);
            L = za1Var;
        }
        return (za1) L;
    }

    public static final Object w(j11 j11Var, mi2 mi2Var, sq5 sq5Var) {
        if (sq5Var.k() && sq5Var.n() && sq5Var.l()) {
            return mi2Var.n(j11Var);
        }
        if (j11Var.a().I(nh0.L) == null) {
            return mi2Var.n(j11Var);
        }
        return X(j11Var, mi2Var, sq5Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:113)(1:64))(2:115|116))|(4:108|109|(8:82|83|(1:(3:85|(1:103)(1:(1:91)(2:88|89))|90)(2:104|(1:106)))|92|(1:102)(1:96)|97|(1:99)|101)|(1:71)(2:72|(1:78)(2:80|81)))|66|(1:68)|82|83|(2:(0)(0)|90)|92|(1:94)|102|97|(0)|101|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
        if (r11 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015e A[Catch: NoSuchFieldException -> 0x018e, TryCatch #0 {NoSuchFieldException -> 0x018e, blocks: (B:79:0x0150, B:81:0x015e, B:90:0x017b, B:92:0x0181, B:94:0x0187, B:96:0x018b, B:86:0x0173), top: B:112:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b A[Catch: NoSuchFieldException -> 0x018e, TRY_LEAVE, TryCatch #0 {NoSuchFieldException -> 0x018e, blocks: (B:79:0x0150, B:81:0x015e, B:90:0x017b, B:92:0x0181, B:94:0x0187, B:96:0x018b, B:86:0x0173), top: B:112:0x0150 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.m93 x(java.lang.Class r17, defpackage.m93... r18) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln2.x(java.lang.Class, m93[]):m93");
    }

    public static ta5 z(String str, cw3 cw3Var) {
        Charset charset = hk0.a;
        Charset a = cw3.a(cw3Var);
        if (a == null) {
            try {
                cw3Var = hi2.n(cw3Var + "; charset=utf-8");
            } catch (IllegalArgumentException unused) {
                cw3Var = null;
            }
        } else {
            charset = a;
        }
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        gk7.a(bytes.length, 0L, length);
        return new ta5(cw3Var, length, bytes);
    }

    public abstract Object C(b11 b11Var);

    public abstract int K(int i);

    public abstract int O(int i);

    @Override // defpackage.ey5
    public int a(int i) {
        return O(i);
    }

    @Override // defpackage.ey5
    public int b(int i) {
        return K(i);
    }

    @Override // defpackage.ey5
    public int c(int i) {
        int K = K(i);
        if (K == -1 || K(K) == -1) {
            return -1;
        }
        return K;
    }

    @Override // defpackage.ey5
    public int d(int i) {
        int O = O(i);
        if (O == -1 || O(O) == -1) {
            return -1;
        }
        return O;
    }

    public abstract boolean y(b11 b11Var);
}
