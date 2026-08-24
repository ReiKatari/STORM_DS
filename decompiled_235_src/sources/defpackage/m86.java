package defpackage;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m86  reason: default package */
/* loaded from: classes.dex */
public final class m86 {
    public f86 a;
    public sg b;
    public sd2 c;
    public lo4 d;
    public boolean e;
    public eb f;
    public final e86 g;
    public final a86 h;
    public boolean i;
    public int j = 1;
    public p76 k = y76.b;
    public final k86 l = new k86(this);
    public final ro5 m = new ro5(this, 8);

    public m86(f86 f86Var, sg sgVar, sd2 sd2Var, lo4 lo4Var, boolean z, eb ebVar, e86 e86Var, a86 a86Var) {
        this.a = f86Var;
        this.b = sgVar;
        this.c = sd2Var;
        this.d = lo4Var;
        this.e = z;
        this.f = ebVar;
        this.g = e86Var;
        this.h = a86Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Type inference failed for: r7v0, types: [ch5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, s41 s41Var) {
        h86 h86Var;
        int i;
        m86 m86Var;
        Throwable th;
        ch5 ch5Var;
        if (s41Var instanceof h86) {
            h86Var = (h86) s41Var;
            int i2 = h86Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h86Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = h86Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = h86Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        ch5Var = h86Var.R;
                        try {
                            oi2.Y(obj);
                            m86Var = this;
                        } catch (Throwable th2) {
                            th = th2;
                            m86Var = this;
                            m86Var.i = false;
                            throw th;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ?? obj2 = new Object();
                    obj2.A = j;
                    this.i = true;
                    try {
                        xa4 xa4Var = xa4.Default;
                        m86Var = this;
                        try {
                            j86 j86Var = new j86(m86Var, obj2, j, null);
                            h86Var.R = obj2;
                            h86Var.Z = 1;
                            if (m86Var.f(xa4Var, j86Var, h86Var) == x61Var) {
                                return x61Var;
                            }
                            ch5Var = obj2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            m86Var.i = false;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        m86Var = this;
                    }
                }
                m86Var.i = false;
                return new ol7(ch5Var.A);
            }
        }
        h86Var = new h86(this, s41Var);
        Object obj3 = h86Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = h86Var.Z;
        if (i == 0) {
        }
        m86Var.i = false;
        return new ol7(ch5Var.A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if ((r6 instanceof defpackage.wd1) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, boolean z, hw6 hw6Var) {
        int i;
        jg7 jg7Var = jg7.a;
        if (z) {
            sd2 sd2Var = this.c;
            r76 r76Var = y76.a;
        }
        if (this.d == lo4.Horizontal) {
            i = 1;
        } else {
            i = 2;
        }
        long a = ol7.a(j, RecyclerView.B1, RecyclerView.B1, i);
        l86 l86Var = new l86(this, null);
        sg sgVar = this.b;
        if (sgVar != null && (this.a.c() || this.a.b())) {
            Object b = sgVar.b(a, l86Var, hw6Var);
            if (b == x61.COROUTINE_SUSPENDED) {
                return b;
            }
        } else {
            l86 l86Var2 = new l86(this, hw6Var);
            l86Var2.Z = a;
            Object s = l86Var2.s(jg7Var);
            if (s == x61.COROUTINE_SUSPENDED) {
                return s;
            }
        }
        return jg7Var;
    }

    public final long c(p76 p76Var, long j, int i) {
        ge4 ge4Var;
        long j2;
        long a;
        ge4 ge4Var2 = (ge4) this.f.B;
        ge4 ge4Var3 = null;
        if (ge4Var2 != null) {
            ge4Var = ge4Var2.S0();
        } else {
            ge4Var = null;
        }
        long j3 = 0;
        if (ge4Var != null) {
            j2 = ge4Var.N(i, j);
        } else {
            j2 = 0;
        }
        long e = jk4.e(j, j2);
        if (this.d == lo4.Horizontal) {
            a = jk4.a(e, RecyclerView.B1, 1);
        } else {
            a = jk4.a(e, RecyclerView.B1, 2);
        }
        long e2 = e(h(p76Var.a(g(e(a)))));
        e86 e86Var = this.g;
        if (e86Var.j0) {
            ViewTreeObserver viewTreeObserver = ((te) nc1.g0(e86Var)).getViewTreeObserver();
            try {
                if (te.N1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    te.N1 = declaredMethod;
                }
                Method method = te.N1;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long e3 = jk4.e(e, e2);
        ge4 ge4Var4 = (ge4) this.f.B;
        if (ge4Var4 != null) {
            ge4Var3 = ge4Var4.S0();
        }
        ge4 ge4Var5 = ge4Var3;
        if (ge4Var5 != null) {
            j3 = ge4Var5.w0(e2, e3, i);
        }
        return jk4.f(jk4.f(j2, e2), j3);
    }

    public final float d(float f) {
        if (this.e) {
            return f * (-1.0f);
        }
        return f;
    }

    public final long e(long j) {
        if (this.e) {
            return jk4.g(-1.0f, j);
        }
        return j;
    }

    public final Object f(xa4 xa4Var, eo2 eo2Var, s41 s41Var) {
        Object d = this.a.d(xa4Var, new vy5(this, eo2Var, (r41) null, 4), s41Var);
        if (d == x61.COROUTINE_SUSPENDED) {
            return d;
        }
        return jg7.a;
    }

    public final float g(long j) {
        long j2;
        if (this.d == lo4.Horizontal) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public final long h(float f) {
        if (f == RecyclerView.B1) {
            return 0L;
        }
        if (this.d == lo4.Horizontal) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(RecyclerView.B1) << 32);
    }

    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        int i3 = (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)))) > 0.7853981633974483d ? 1 : (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)))) == 0.7853981633974483d ? 0 : -1));
        lo4 lo4Var = this.d;
        if (i3 >= 0) {
            if (lo4Var != lo4.Vertical) {
                return RecyclerView.B1;
            }
            return Float.intBitsToFloat(i);
        } else if (lo4Var != lo4.Horizontal) {
            return RecyclerView.B1;
        } else {
            return Float.intBitsToFloat(i2);
        }
    }
}
