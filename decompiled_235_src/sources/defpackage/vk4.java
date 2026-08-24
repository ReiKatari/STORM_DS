package defpackage;

import java.io.IOException;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vk4  reason: default package */
/* loaded from: classes.dex */
public final class vk4 implements gb0 {
    public final vk5 A;
    public final Object B;
    public final Object[] L;
    public final xk4 R;
    public final b51 X;
    public volatile boolean Y;
    public je5 Z;
    public Throwable d0;
    public boolean e0;

    public vk4(vk5 vk5Var, Object obj, Object[] objArr, xk4 xk4Var, b51 b51Var) {
        this.A = vk5Var;
        this.B = obj;
        this.L = objArr;
        this.R = xk4Var;
        this.X = b51Var;
    }

    public final je5 a() {
        h03 h03Var;
        i03 i03Var;
        vk5 vk5Var = this.A;
        uj2[] uj2VarArr = vk5Var.j;
        Object[] objArr = this.L;
        int length = objArr.length;
        if (length == uj2VarArr.length) {
            ok5 ok5Var = new ok5(vk5Var.c, vk5Var.b, vk5Var.d, vk5Var.e, vk5Var.f, vk5Var.g, vk5Var.h, vk5Var.i);
            if (vk5Var.k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                uj2VarArr[i].l(ok5Var, objArr[i]);
            }
            h03 h03Var2 = ok5Var.d;
            if (h03Var2 != null) {
                i03Var = h03Var2.b();
            } else {
                String str = ok5Var.c;
                i03 i03Var2 = ok5Var.b;
                i03Var2.getClass();
                str.getClass();
                try {
                    h03Var = new h03(0);
                    h03Var.e(i03Var2, str);
                } catch (IllegalArgumentException unused) {
                    h03Var = null;
                }
                if (h03Var != null) {
                    i03Var = h03Var.b();
                } else {
                    i03Var = null;
                }
                if (i03Var == null) {
                    StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                    sb.append(i03Var2);
                    fa6.g(sb, ", Relative: ", ok5Var.c);
                    return null;
                }
            }
            nk5 nk5Var = ok5Var.k;
            if (nk5Var == null) {
                yc1 yc1Var = ok5Var.j;
                if (yc1Var != null) {
                    nk5Var = new ak2((ArrayList) yc1Var.A, (ArrayList) yc1Var.B);
                } else {
                    m44 m44Var = ok5Var.i;
                    if (m44Var != null) {
                        ArrayList arrayList2 = (ArrayList) m44Var.R;
                        if (!arrayList2.isEmpty()) {
                            nk5Var = new l94((da0) m44Var.B, (n34) m44Var.L, az7.j(arrayList2));
                        } else {
                            i.m("Multipart body must have at least one part.");
                            return null;
                        }
                    } else if (ok5Var.h) {
                        int i2 = mk5.a;
                        yy7.a(0L, 0L, 0L);
                        nk5Var = new lk5(null, 0, new byte[0]);
                    }
                }
            }
            n34 n34Var = ok5Var.g;
            ww2 ww2Var = ok5Var.f;
            if (n34Var != null) {
                if (nk5Var != null) {
                    nk5Var = new nk5(nk5Var, n34Var);
                } else {
                    ww2Var.b("Content-Type", n34Var.a);
                }
            }
            s9 s9Var = ok5Var.e;
            s9Var.getClass();
            s9Var.a = i03Var;
            s9Var.c = ww2Var.f().c();
            s9Var.D(ok5Var.a, nk5Var);
            s9Var.e = ((qo2) s9Var.e).F(gh5.a(ac3.class), new ac3(this.B, vk5Var.a, arrayList));
            pa paVar = new pa(s9Var);
            xk4 xk4Var = this.R;
            xk4Var.getClass();
            return new je5(xk4Var, paVar, false);
        }
        i.h(lb1.o(xg6.t("Argument count (", length, ") doesn't match expected count ("), uj2VarArr.length, ")"));
        return null;
    }

    public final je5 b() {
        je5 je5Var = this.Z;
        if (je5Var != null) {
            return je5Var;
        }
        Throwable th = this.d0;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw ((IOException) th);
        }
        try {
            je5 a = a();
            this.Z = a;
            return a;
        } catch (IOException | Error | RuntimeException e) {
            ak7.H0(e);
            this.d0 = e;
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [y80, java.lang.Object] */
    public final vl5 c(wl5 wl5Var) {
        yl5 yl5Var = wl5Var.Z;
        ul5 h = wl5Var.h();
        h.g = new uk4(yl5Var.k(), yl5Var.h());
        wl5 a = h.a();
        boolean z = a.m0;
        int i = a.R;
        if (i >= 200 && i < 300) {
            if (i != 204 && i != 205) {
                tk4 tk4Var = new tk4(yl5Var);
                try {
                    Object h2 = this.X.h(tk4Var);
                    if (z) {
                        return new vl5(a, h2);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e) {
                    IOException iOException = tk4Var.R;
                    if (iOException == null) {
                        throw e;
                    }
                    throw iOException;
                }
            } else if (z) {
                return new vl5(a, null);
            } else {
                i.h("rawResponse must be successful response");
                return null;
            }
        }
        try {
            yl5Var.n().C(new Object());
            yl5Var.k();
            yl5Var.h();
            if (!z) {
                return new vl5(a, null);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            yl5Var.close();
        }
    }

    @Override // defpackage.gb0
    public final void cancel() {
        je5 je5Var;
        this.Y = true;
        synchronized (this) {
            je5Var = this.Z;
        }
        if (je5Var != null) {
            je5Var.cancel();
        }
    }

    @Override // defpackage.gb0
    public final gb0 clone() {
        return new vk4(this.A, this.B, this.L, this.R, this.X);
    }

    @Override // defpackage.gb0
    public final void h(mb0 mb0Var) {
        je5 je5Var;
        Throwable th;
        synchronized (this) {
            try {
                if (!this.e0) {
                    this.e0 = true;
                    je5Var = this.Z;
                    th = this.d0;
                    if (je5Var == null && th == null) {
                        je5 a = a();
                        this.Z = a;
                        je5Var = a;
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (th != null) {
            mb0Var.f(this, th);
            return;
        }
        if (this.Y) {
            je5Var.cancel();
        }
        je5Var.d(new ap3(9, this, mb0Var, false));
    }

    @Override // defpackage.gb0
    public final boolean r() {
        boolean z = true;
        if (this.Y) {
            return true;
        }
        synchronized (this) {
            try {
                je5 je5Var = this.Z;
                if (je5Var == null || !je5Var.m0) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.gb0
    public final synchronized pa x() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().B;
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final Object m19clone() {
        return new vk4(this.A, this.B, this.L, this.R, this.X);
    }
}
