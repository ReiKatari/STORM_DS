package defpackage;

import java.io.IOException;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xb4  reason: default package */
/* loaded from: classes.dex */
public final class xb4 implements y80 {
    public final db5 A;
    public final Object B;
    public final Object[] L;
    public final zb4 R;
    public final t11 X;
    public volatile boolean Y;
    public w45 Z;
    public Throwable c0;
    public boolean d0;

    public xb4(db5 db5Var, Object obj, Object[] objArr, zb4 zb4Var, t11 t11Var) {
        this.A = db5Var;
        this.B = obj;
        this.L = objArr;
        this.R = zb4Var;
        this.X = t11Var;
    }

    public final w45 a() {
        gu2 gu2Var;
        hu2 hu2Var;
        db5 db5Var = this.A;
        cg2[] cg2VarArr = db5Var.j;
        Object[] objArr = this.L;
        int length = objArr.length;
        if (length == cg2VarArr.length) {
            wa5 wa5Var = new wa5(db5Var.c, db5Var.b, db5Var.d, db5Var.e, db5Var.f, db5Var.g, db5Var.h, db5Var.i);
            if (db5Var.k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                cg2VarArr[i].t(wa5Var, objArr[i]);
            }
            gu2 gu2Var2 = wa5Var.d;
            if (gu2Var2 != null) {
                hu2Var = gu2Var2.b();
            } else {
                String str = wa5Var.c;
                hu2 hu2Var2 = wa5Var.b;
                hu2Var2.getClass();
                str.getClass();
                try {
                    gu2Var = new gu2(0);
                    gu2Var.e(hu2Var2, str);
                } catch (IllegalArgumentException unused) {
                    gu2Var = null;
                }
                if (gu2Var != null) {
                    hu2Var = gu2Var.b();
                } else {
                    hu2Var = null;
                }
                if (hu2Var == null) {
                    StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                    sb.append(hu2Var2);
                    vd6.h(sb, ", Relative: ", wa5Var.c);
                    return null;
                }
            }
            va5 va5Var = wa5Var.k;
            if (va5Var == null) {
                k91 k91Var = wa5Var.j;
                if (k91Var != null) {
                    va5Var = new bf2((ArrayList) k91Var.A, (ArrayList) k91Var.B);
                } else {
                    os osVar = wa5Var.i;
                    if (osVar != null) {
                        ArrayList arrayList2 = (ArrayList) osVar.R;
                        if (!arrayList2.isEmpty()) {
                            va5Var = new f14((w70) osVar.B, (cw3) osVar.L, ik7.i(arrayList2));
                        } else {
                            i.n("Multipart body must have at least one part.");
                            return null;
                        }
                    } else if (wa5Var.h) {
                        int i2 = ua5.a;
                        gk7.a(0L, 0L, 0L);
                        va5Var = new ta5(null, 0, new byte[0]);
                    }
                }
            }
            cw3 cw3Var = wa5Var.g;
            vq2 vq2Var = wa5Var.f;
            if (cw3Var != null) {
                if (va5Var != null) {
                    va5Var = new va5(va5Var, cw3Var);
                } else {
                    vq2Var.b("Content-Type", cw3Var.a);
                }
            }
            r9 r9Var = wa5Var.e;
            r9Var.getClass();
            r9Var.a = hu2Var;
            r9Var.c = vq2Var.f().d();
            r9Var.D(wa5Var.a, va5Var);
            r9Var.e = ((io2) r9Var.e).g0(q75.a(n53.class), new n53(this.B, db5Var.a, arrayList));
            ka kaVar = new ka(r9Var);
            zb4 zb4Var = this.R;
            zb4Var.getClass();
            return new w45(zb4Var, kaVar);
        }
        i.i(wh1.m(wh1.s("Argument count (", length, ") doesn't match expected count ("), cg2VarArr.length, ")"));
        return null;
    }

    public final w45 b() {
        w45 w45Var = this.Z;
        if (w45Var != null) {
            return w45Var;
        }
        Throwable th = this.c0;
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
            w45 a = a();
            this.Z = a;
            return a;
        } catch (IOException | Error | RuntimeException e) {
            ct3.U0(e);
            this.c0 = e;
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, t60] */
    public final dc5 c(ec5 ec5Var) {
        gc5 gc5Var = ec5Var.Z;
        cc5 i = ec5Var.i();
        i.g = new wb4(gc5Var.i(), gc5Var.d());
        ec5 a = i.a();
        boolean z = a.l0;
        int i2 = a.R;
        if (i2 >= 200 && i2 < 300) {
            if (i2 != 204 && i2 != 205) {
                vb4 vb4Var = new vb4(gc5Var);
                try {
                    Object k = this.X.k(vb4Var);
                    if (z) {
                        return new dc5(a, k);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e) {
                    IOException iOException = vb4Var.R;
                    if (iOException == null) {
                        throw e;
                    }
                    throw iOException;
                }
            } else if (z) {
                return new dc5(a, null);
            } else {
                i.i("rawResponse must be successful response");
                return null;
            }
        }
        try {
            gc5Var.p().S(new Object());
            gc5Var.i();
            gc5Var.d();
            if (!z) {
                return new dc5(a, null);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            gc5Var.close();
        }
    }

    @Override // defpackage.y80
    public final void cancel() {
        w45 w45Var;
        this.Y = true;
        synchronized (this) {
            w45Var = this.Z;
        }
        if (w45Var != null) {
            w45Var.cancel();
        }
    }

    @Override // defpackage.y80
    /* renamed from: clone */
    public final y80 mo11clone() {
        return new xb4(this.A, this.B, this.L, this.R, this.X);
    }

    @Override // defpackage.y80
    public final void d(e90 e90Var) {
        w45 w45Var;
        Throwable th;
        synchronized (this) {
            try {
                if (!this.d0) {
                    this.d0 = true;
                    w45Var = this.Z;
                    th = this.c0;
                    if (w45Var == null && th == null) {
                        w45 a = a();
                        this.Z = a;
                        w45Var = a;
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (th != null) {
            e90Var.b(this, th);
            return;
        }
        if (this.Y) {
            w45Var.cancel();
        }
        w45Var.e(new ci3(6, this, e90Var, false));
    }

    @Override // defpackage.y80
    public final synchronized ka i() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().B;
    }

    @Override // defpackage.y80
    public final boolean p() {
        boolean z = true;
        if (this.Y) {
            return true;
        }
        synchronized (this) {
            try {
                w45 w45Var = this.Z;
                if (w45Var == null || !w45Var.k0) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    public final Object clone() {
        return new xb4(this.A, this.B, this.L, this.R, this.X);
    }
}
