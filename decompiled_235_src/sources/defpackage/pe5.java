package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pe5  reason: default package */
/* loaded from: classes.dex */
public final class pe5 {
    public final Context a;
    public final we1 b;
    public final ex6 c;
    public final m23 d;
    public final o41 e;
    public final ap3 f;
    public final uv0 g;
    public final ArrayList h;

    /* JADX WARN: Type inference failed for: r5v0, types: [s9, java.lang.Object] */
    public pe5(Context context, we1 we1Var, ex6 ex6Var, ex6 ex6Var2, ex6 ex6Var3, uv0 uv0Var, m23 m23Var) {
        this.a = context;
        this.b = we1Var;
        this.c = ex6Var;
        this.d = m23Var;
        gu6 c = oi2.c();
        xe1 xe1Var = xk1.a;
        this.e = g04.i(jw2.y(c, e04.a.Y).N(new qi2(this)));
        jx6 jx6Var = new jx6(this);
        ap3 ap3Var = new ap3(this, jx6Var);
        this.f = ap3Var;
        ?? obj = new Object();
        obj.a = gt0.m1(uv0Var.a);
        obj.b = gt0.m1(uv0Var.b);
        obj.c = gt0.m1(uv0Var.c);
        obj.d = gt0.m1(uv0Var.d);
        obj.e = gt0.m1(uv0Var.e);
        obj.g(new s90(3), i03.class);
        obj.g(new s90(6), String.class);
        obj.g(new s90(2), Uri.class);
        obj.g(new s90(5), Uri.class);
        obj.g(new s90(4), Integer.class);
        obj.g(new s90(0), byte[].class);
        Object obj2 = new Object();
        ArrayList arrayList = (ArrayList) obj.c;
        arrayList.add(new vr4(obj2, Uri.class));
        arrayList.add(new vr4(new ya2(m23Var.a), File.class));
        obj.h(new d03(ex6Var3, ex6Var2, m23Var.c), Uri.class);
        obj.h(new sv(5), File.class);
        obj.h(new sv(0), Uri.class);
        obj.h(new sv(3), Uri.class);
        obj.h(new sv(6), Uri.class);
        obj.h(new sv(4), Drawable.class);
        obj.h(new sv(1), Bitmap.class);
        obj.h(new sv(2), ByteBuffer.class);
        q40 q40Var = new q40(m23Var.d, m23Var.e);
        ArrayList arrayList2 = (ArrayList) obj.e;
        arrayList2.add(q40Var);
        List U = g04.U((ArrayList) obj.a);
        this.g = new uv0(U, g04.U((ArrayList) obj.b), g04.U(arrayList), g04.U((ArrayList) obj.d), g04.U(arrayList2));
        this.h = gt0.U0(new w42(this, jx6Var, ap3Var), U);
        new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(11:5|6|(5:(1:(1:(9:11|12|13|14|15|16|(4:18|(1:20)(2:27|(1:29)(1:30))|21|(1:23))(2:31|(1:33)(2:34|35))|24|25)(2:53|54))(12:55|56|57|58|59|60|61|62|63|64|(6:67|15|16|(0)(0)|24|25)|66))(4:78|79|80|81)|77|40|41|(3:43|24|25)(2:44|45))(4:98|99|100|(3:102|(1:104)|106)(2:107|108))|82|83|(1:85)|86|(1:88)|89|(8:91|59|60|61|62|63|64|(0))|66))|111|6|(0)(0)|82|83|(0)|86|(0)|89|(0)|66|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
        if (defpackage.lb4.n(r0, r2) == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
        r3 = r4;
        r4 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf A[Catch: all -> 0x00d3, TryCatch #3 {all -> 0x00d3, blocks: (B:43:0x00c5, B:45:0x00cf, B:48:0x00d8, B:50:0x00e2, B:51:0x00e5), top: B:103:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2 A[Catch: all -> 0x00d3, TryCatch #3 {all -> 0x00d3, blocks: (B:43:0x00c5, B:45:0x00cf, B:48:0x00d8, B:50:0x00e2, B:51:0x00e5), top: B:103:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132 A[Catch: all -> 0x0162, TryCatch #2 {all -> 0x0162, blocks: (B:61:0x012c, B:63:0x0132, B:70:0x0154, B:72:0x015b, B:66:0x0141, B:69:0x014e, B:77:0x0164, B:79:0x0168, B:82:0x0179, B:83:0x017e), top: B:102:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0164 A[Catch: all -> 0x0162, TryCatch #2 {all -> 0x0162, blocks: (B:61:0x012c, B:63:0x0132, B:70:0x0154, B:72:0x015b, B:66:0x0141, B:69:0x014e, B:77:0x0164, B:79:0x0168, B:82:0x0179, B:83:0x017e), top: B:102:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0193 A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:90:0x018f, B:92:0x0193, B:95:0x01a4, B:96:0x01ac), top: B:101:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a4 A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:90:0x018f, B:92:0x0193, B:95:0x01a4, B:96:0x01ac), top: B:101:0x018f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(pe5 pe5Var, z23 z23Var, int i, s41 s41Var) {
        oe5 oe5Var;
        Object obj;
        x61 x61Var;
        int i2;
        z23 a;
        k62 k62Var;
        z23 z23Var2;
        q20 q20Var;
        q20 q20Var2;
        iz6 iz6Var;
        pe5 pe5Var2;
        z23 z23Var3;
        Bitmap bitmap;
        k62 k62Var2;
        k62 k62Var3;
        Object obj2;
        Object obj3;
        pe5 pe5Var3;
        pe5 pe5Var4 = pe5Var;
        if (s41Var instanceof oe5) {
            oe5Var = (oe5) s41Var;
            int i3 = oe5Var.g0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oe5Var.g0 = i3 - Integer.MIN_VALUE;
                obj = oe5Var.e0;
                x61Var = x61.COROUTINE_SUSPENDED;
                i2 = oe5Var.g0;
                if (i2 == 0) {
                    try {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    k62Var3 = oe5Var.Z;
                                    z23Var2 = oe5Var.Y;
                                    q20Var = oe5Var.X;
                                    pe5 pe5Var5 = oe5Var.R;
                                    try {
                                        oi2.Y(obj);
                                        pe5Var2 = pe5Var5;
                                        try {
                                            obj3 = (a33) obj;
                                            if (!(obj3 instanceof bu6)) {
                                                bu6 bu6Var = (bu6) obj3;
                                                iz6 iz6Var2 = z23Var2.c;
                                                pe5Var2.getClass();
                                                z23 z23Var4 = bu6Var.b;
                                                if (iz6Var2 instanceof mw) {
                                                    fa7 a2 = z23Var4.i.a((mw) iz6Var2, bu6Var);
                                                    if (!(a2 instanceof qg4)) {
                                                        k62Var3.getClass();
                                                        a2.a();
                                                    }
                                                }
                                                k62Var3.getClass();
                                                y23 y23Var = z23Var4.d;
                                                obj2 = obj3;
                                                if (y23Var != null) {
                                                    y23Var.c();
                                                    obj2 = obj3;
                                                }
                                            } else if (obj3 instanceof b62) {
                                                iz6 iz6Var3 = z23Var2.c;
                                                pe5Var2.getClass();
                                                b((b62) obj3, iz6Var3, k62Var3);
                                                obj2 = obj3;
                                            } else {
                                                throw new RuntimeException();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            k62Var = k62Var3;
                                            pe5Var4 = pe5Var2;
                                            if (!(th instanceof CancellationException)) {
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        k62Var = k62Var3;
                                        pe5Var4 = pe5Var5;
                                    }
                                    return obj2;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Bitmap bitmap2 = oe5Var.d0;
                            k62 k62Var4 = oe5Var.Z;
                            z23 z23Var5 = oe5Var.Y;
                            q20Var2 = oe5Var.X;
                            pe5Var3 = oe5Var.R;
                            try {
                                oi2.Y(obj);
                                bitmap = bitmap2;
                                k62Var2 = k62Var4;
                                z23Var3 = z23Var5;
                                pe5Var2 = pe5Var3;
                                q20Var = q20Var2;
                                try {
                                    k62Var2.getClass();
                                    n61 n61Var = z23Var3.s;
                                    ji jiVar = new ji(z23Var3, pe5Var2, (wi6) obj, k62Var2, bitmap, null, 11);
                                    k62Var3 = k62Var2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    k62Var3 = k62Var2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                k62Var = k62Var4;
                                z23Var2 = z23Var5;
                            }
                            try {
                                oe5Var.R = pe5Var2;
                                oe5Var.X = q20Var;
                                oe5Var.Y = z23Var3;
                                oe5Var.Z = k62Var3;
                                oe5Var.d0 = null;
                                oe5Var.g0 = 3;
                                obj = hv.d0(n61Var, jiVar, oe5Var);
                            } catch (Throwable th5) {
                                th = th5;
                                k62Var = k62Var3;
                                z23Var2 = z23Var3;
                                pe5Var4 = pe5Var2;
                                if (!(th instanceof CancellationException)) {
                                }
                            }
                            if (obj != x61Var) {
                                z23Var2 = z23Var3;
                                obj3 = (a33) obj;
                                if (!(obj3 instanceof bu6)) {
                                }
                                return obj2;
                            }
                            return x61Var;
                        }
                        k62 k62Var5 = oe5Var.Z;
                        a = oe5Var.Y;
                        q20Var2 = oe5Var.X;
                        pe5Var3 = oe5Var.R;
                        try {
                            oi2.Y(obj);
                            k62Var = k62Var5;
                            pe5Var4 = pe5Var3;
                        } catch (Throwable th6) {
                            th = th6;
                            k62Var = k62Var5;
                            z23Var2 = a;
                        }
                        if (!(th instanceof CancellationException)) {
                            pe5Var4.f.getClass();
                            b62 r = ap3.r(z23Var2, th);
                            b(r, z23Var2.c, k62Var);
                            obj2 = r;
                            return obj2;
                        }
                        pe5Var4.getClass();
                        k62Var.getClass();
                        y23 y23Var2 = z23Var2.d;
                        throw th;
                    } finally {
                        q20Var.A.c(q20Var);
                    }
                    q20Var = q20Var2;
                    pe5Var4 = pe5Var3;
                } else {
                    oi2.Y(obj);
                    ap3 ap3Var = pe5Var4.f;
                    l61 l61Var = oe5Var.B;
                    l61Var.getClass();
                    rc3 u = yh2.u(l61Var);
                    ap3Var.getClass();
                    ut3 ut3Var = z23Var.w;
                    q20 q20Var3 = new q20(ut3Var, u);
                    x23 a3 = z23.a(z23Var);
                    a3.b = pe5Var4.b;
                    a3.v = null;
                    a = a3.a();
                    k62Var = k62.a;
                    try {
                        if (a.b != cs1.i0) {
                            ut3Var.a(q20Var3);
                            if (i == 0) {
                                ut3 ut3Var2 = a.w;
                                oe5Var.R = pe5Var4;
                                oe5Var.X = q20Var3;
                                oe5Var.Y = a;
                                oe5Var.Z = k62Var;
                                oe5Var.g0 = 1;
                            }
                            q20Var2 = q20Var3;
                        } else {
                            throw new RuntimeException("The request's data is null.");
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        z23Var2 = a;
                        q20Var = q20Var3;
                    }
                }
                if (((se5) pe5Var4.c.getValue()) != null) {
                    a.getClass();
                }
                Drawable drawable = a.B.j;
                we1 we1Var = h.a;
                iz6Var = a.c;
                if (iz6Var != null) {
                    iz6Var.a(drawable);
                }
                k62Var.getClass();
                fj6 fj6Var = a.x;
                oe5Var.R = pe5Var4;
                oe5Var.X = q20Var2;
                oe5Var.Y = a;
                oe5Var.Z = k62Var;
                oe5Var.d0 = null;
                oe5Var.g0 = 2;
                obj = fj6Var.e(oe5Var);
                if (obj != x61Var) {
                    pe5Var2 = pe5Var4;
                    z23Var3 = a;
                    bitmap = null;
                    k62Var2 = k62Var;
                    q20Var = q20Var2;
                    k62Var2.getClass();
                    n61 n61Var2 = z23Var3.s;
                    ji jiVar2 = new ji(z23Var3, pe5Var2, (wi6) obj, k62Var2, bitmap, null, 11);
                    k62Var3 = k62Var2;
                    oe5Var.R = pe5Var2;
                    oe5Var.X = q20Var;
                    oe5Var.Y = z23Var3;
                    oe5Var.Z = k62Var3;
                    oe5Var.d0 = null;
                    oe5Var.g0 = 3;
                    obj = hv.d0(n61Var2, jiVar2, oe5Var);
                    if (obj != x61Var) {
                    }
                }
                return x61Var;
            }
        }
        oe5Var = new oe5(pe5Var4, s41Var);
        obj = oe5Var.e0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i2 = oe5Var.g0;
        if (i2 == 0) {
        }
        if (((se5) pe5Var4.c.getValue()) != null) {
        }
        Drawable drawable2 = a.B.j;
        we1 we1Var2 = h.a;
        iz6Var = a.c;
        if (iz6Var != null) {
        }
        k62Var.getClass();
        fj6 fj6Var2 = a.x;
        oe5Var.R = pe5Var4;
        oe5Var.X = q20Var2;
        oe5Var.Y = a;
        oe5Var.Z = k62Var;
        oe5Var.d0 = null;
        oe5Var.g0 = 2;
        obj = fj6Var2.e(oe5Var);
        if (obj != x61Var) {
        }
        return x61Var;
    }

    public static void b(b62 b62Var, iz6 iz6Var, k62 k62Var) {
        z23 z23Var = b62Var.b;
        if (iz6Var instanceof mw) {
            fa7 a = z23Var.i.a((mw) iz6Var, b62Var);
            if (!(a instanceof qg4)) {
                k62Var.getClass();
                a.a();
            }
        }
        k62Var.getClass();
        y23 y23Var = z23Var.d;
        if (y23Var != null) {
            y23Var.b();
        }
    }
}
