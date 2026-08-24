package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w42  reason: default package */
/* loaded from: classes.dex */
public final class w42 {
    public final pe5 a;
    public final jx6 b;
    public final ap3 c;
    public final s63 d;

    public w42(pe5 pe5Var, jx6 jx6Var, ap3 ap3Var) {
        this.a = pe5Var;
        this.b = jx6Var;
        this.c = ap3Var;
        this.d = new s63(pe5Var, ap3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bf -> B:24:0x00c6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(w42 w42Var, mn6 mn6Var, uv0 uv0Var, z23 z23Var, Object obj, fo4 fo4Var, k62 k62Var, s41 s41Var) {
        r42 r42Var;
        w42 w42Var2;
        int i;
        z23 z23Var2;
        Object obj2;
        fo4 fo4Var2;
        k62 k62Var2;
        int i2;
        r42 r42Var2;
        mn6 mn6Var2;
        uv0 uv0Var2;
        List list;
        vr4 vr4Var;
        xa2 xa2Var;
        w42Var.getClass();
        if (s41Var instanceof r42) {
            r42Var = (r42) s41Var;
            int i3 = r42Var.j0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r42Var.j0 = i3 - Integer.MIN_VALUE;
                w42Var2 = w42Var;
                Object obj3 = r42Var.h0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = r42Var.j0;
                String str = null;
                if (i == 0) {
                    if (i == 1) {
                        int i4 = r42Var.g0;
                        k62 k62Var3 = r42Var.f0;
                        fo4 fo4Var3 = r42Var.e0;
                        Object obj4 = r42Var.d0;
                        z23 z23Var3 = r42Var.Z;
                        uv0 uv0Var3 = r42Var.Y;
                        mn6 mn6Var3 = r42Var.X;
                        w42 w42Var3 = r42Var.R;
                        oi2.Y(obj3);
                        r42 r42Var3 = r42Var;
                        uv0Var2 = uv0Var3;
                        i2 = i4;
                        w42Var2 = w42Var3;
                        k62Var2 = k62Var3;
                        z23Var2 = z23Var3;
                        fo4Var2 = fo4Var3;
                        obj2 = obj4;
                        qc1 qc1Var = (qc1) obj3;
                        k62Var2.getClass();
                        if (qc1Var == null) {
                            BitmapDrawable bitmapDrawable = qc1Var.a;
                            boolean z = qc1Var.b;
                            zb1 zb1Var = mn6Var3.c;
                            b33 b33Var = mn6Var3.a;
                            if (b33Var instanceof xa2) {
                                xa2Var = (xa2) b33Var;
                            } else {
                                xa2Var = null;
                            }
                            if (xa2Var != null) {
                                str = xa2Var.L;
                            }
                            return new q42(bitmapDrawable, z, zb1Var, str);
                        }
                        mn6Var2 = mn6Var3;
                        r42Var2 = r42Var3;
                        pe5 pe5Var = w42Var2.a;
                        list = uv0Var2.e;
                        if (i2 >= list.size()) {
                            q40 q40Var = (q40) list.get(i2);
                            q40Var.getClass();
                            vr4Var = new vr4(new s40(mn6Var2.a, fo4Var2, q40Var.b, q40Var.a), Integer.valueOf(i2));
                        } else {
                            vr4Var = null;
                        }
                        if (vr4Var == null) {
                            int intValue = ((Number) vr4Var.B).intValue() + 1;
                            k62Var2.getClass();
                            r42Var2.R = w42Var2;
                            r42Var2.X = mn6Var2;
                            r42Var2.Y = uv0Var2;
                            r42Var2.Z = z23Var2;
                            r42Var2.d0 = obj2;
                            r42Var2.e0 = fo4Var2;
                            r42Var2.f0 = k62Var2;
                            r42Var2.g0 = intValue;
                            r42Var2.j0 = 1;
                            Object a = ((s40) vr4Var.A).a(r42Var2);
                            if (a == x61Var) {
                                return x61Var;
                            }
                            r42 r42Var4 = r42Var2;
                            mn6Var3 = mn6Var2;
                            obj3 = a;
                            i2 = intValue;
                            r42Var3 = r42Var4;
                            qc1 qc1Var2 = (qc1) obj3;
                            k62Var2.getClass();
                            if (qc1Var2 == null) {
                            }
                        } else {
                            u34.i(obj2, "Unable to create a decoder that supports: ");
                            return null;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj3);
                    z23Var2 = z23Var;
                    obj2 = obj;
                    fo4Var2 = fo4Var;
                    k62Var2 = k62Var;
                    i2 = 0;
                    r42Var2 = r42Var;
                    mn6Var2 = mn6Var;
                    uv0Var2 = uv0Var;
                    pe5 pe5Var2 = w42Var2.a;
                    list = uv0Var2.e;
                    if (i2 >= list.size()) {
                    }
                    if (vr4Var == null) {
                    }
                }
            }
        }
        w42Var2 = w42Var;
        r42Var = new r42(w42Var2, s41Var);
        Object obj32 = r42Var.h0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = r42Var.j0;
        String str2 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x017a, code lost:
        if (r12.l == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0193, code lost:
        if (r1 == r7) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #2 {all -> 0x004e, blocks: (B:18:0x0049, B:40:0x0110, B:23:0x0063, B:30:0x00d4, B:32:0x00df, B:36:0x00f4, B:44:0x011e, B:46:0x0127, B:73:0x01ad, B:74:0x01b2), top: B:87:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:18:0x0049, B:40:0x0110, B:23:0x0063, B:30:0x00d4, B:32:0x00df, B:36:0x00f4, B:44:0x011e, B:46:0x0127, B:73:0x01ad, B:74:0x01b2), top: B:87:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c0  */
    /* JADX WARN: Type inference failed for: r11v0, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(w42 w42Var, z23 z23Var, Object obj, fo4 fo4Var, k62 k62Var, s41 s41Var) {
        s42 s42Var;
        dh5 dh5Var;
        Object obj2;
        w42 w42Var2;
        Object obj3;
        k62 k62Var2;
        dh5 dh5Var2;
        dh5 dh5Var3;
        dh5 dh5Var4;
        dh5 dh5Var5;
        z23 z23Var2;
        Object obj4;
        ja2 ja2Var;
        z23 z23Var3;
        dh5 dh5Var6;
        k62 k62Var3;
        w42 w42Var3;
        dh5 dh5Var7;
        w42 w42Var4;
        q42 q42Var;
        Object obj5;
        mn6 mn6Var;
        List list;
        Object obj6;
        Bitmap bitmap;
        try {
            if (s41Var instanceof s42) {
                s42Var = (s42) s41Var;
                int i = s42Var.j0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    s42Var.j0 = i - Integer.MIN_VALUE;
                    s42 s42Var2 = s42Var;
                    Object obj7 = s42Var2.h0;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    dh5Var = s42Var2.j0;
                    mn6 mn6Var2 = null;
                    BitmapDrawable bitmapDrawable = null;
                    if (dh5Var == 0) {
                        if (dh5Var != 1) {
                            if (dh5Var != 2) {
                                if (dh5Var == 3) {
                                    oi2.Y(obj7);
                                    q42 q42Var2 = (q42) obj7;
                                    Drawable drawable = q42Var2.a;
                                    if (drawable instanceof BitmapDrawable) {
                                        bitmapDrawable = (BitmapDrawable) drawable;
                                    }
                                    if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                                        bitmap.prepareToDraw();
                                    }
                                    return q42Var2;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            dh5Var5 = s42Var2.d0;
                            dh5Var7 = (dh5) s42Var2.Z;
                            k62Var3 = (k62) s42Var2.Y;
                            z23Var3 = s42Var2.X;
                            w42Var4 = s42Var2.R;
                            oi2.Y(obj7);
                            obj6 = obj7;
                            dh5Var6 = dh5Var7;
                            w42Var3 = w42Var4;
                            q42Var = (q42) obj6;
                            k62 k62Var4 = k62Var3;
                            z23 z23Var4 = z23Var3;
                            obj5 = dh5Var5.A;
                            if (obj5 instanceof mn6) {
                                mn6Var = (mn6) obj5;
                            } else {
                                mn6Var = null;
                            }
                            if (mn6Var != null) {
                                k.a(mn6Var.a);
                            }
                            fo4 fo4Var2 = (fo4) dh5Var6.A;
                            s42Var2.R = null;
                            s42Var2.X = null;
                            s42Var2.Y = null;
                            s42Var2.Z = null;
                            s42Var2.d0 = null;
                            s42Var2.e0 = null;
                            s42Var2.f0 = null;
                            s42Var2.g0 = null;
                            s42Var2.j0 = 3;
                            w42Var3.getClass();
                            list = z23Var4.h;
                            obj7 = q42Var;
                            if (!list.isEmpty()) {
                                if (!(q42Var.a instanceof BitmapDrawable)) {
                                    obj7 = q42Var;
                                }
                                obj7 = hv.d0(z23Var4.v, new v42(w42Var3, q42Var, fo4Var2, list, k62Var4, z23Var4, null), s42Var2);
                            }
                        } else {
                            dh5Var4 = s42Var2.g0;
                            dh5Var5 = s42Var2.f0;
                            dh5 dh5Var8 = s42Var2.e0;
                            dh5 dh5Var9 = s42Var2.d0;
                            k62 k62Var5 = (k62) s42Var2.Z;
                            Object obj8 = s42Var2.Y;
                            z23Var2 = s42Var2.X;
                            w42 w42Var5 = s42Var2.R;
                            oi2.Y(obj7);
                            dh5Var3 = dh5Var8;
                            dh5Var2 = dh5Var9;
                            k62Var2 = k62Var5;
                            obj3 = obj8;
                            w42Var2 = w42Var5;
                            obj4 = obj7;
                        }
                    } else {
                        oi2.Y(obj7);
                        ?? obj9 = new Object();
                        obj9.A = fo4Var;
                        ?? obj10 = new Object();
                        obj10.A = w42Var.a.g;
                        ?? obj11 = new Object();
                        try {
                            obj9.A = w42Var.c.x((fo4) obj9.A);
                            z23Var.getClass();
                            s42Var2.R = w42Var;
                            s42Var2.X = z23Var;
                            s42Var2.Y = obj;
                            s42Var2.Z = k62Var;
                            s42Var2.d0 = obj9;
                            s42Var2.e0 = obj10;
                            s42Var2.f0 = obj11;
                            s42Var2.g0 = obj11;
                            s42Var2.j0 = 1;
                            Object c = w42Var.c((uv0) obj10.A, z23Var, obj, (fo4) obj9.A, k62Var, s42Var2);
                            if (c != x61Var) {
                                w42Var2 = w42Var;
                                obj3 = obj;
                                k62Var2 = k62Var;
                                dh5Var2 = obj9;
                                dh5Var3 = obj10;
                                dh5Var4 = obj11;
                                dh5Var5 = dh5Var4;
                                z23Var2 = z23Var;
                                obj4 = c;
                            }
                            return x61Var;
                        } catch (Throwable th) {
                            th = th;
                            dh5Var = obj11;
                            obj2 = dh5Var.A;
                            if (obj2 instanceof mn6) {
                                mn6Var2 = (mn6) obj2;
                            }
                            if (mn6Var2 != null) {
                                k.a(mn6Var2.a);
                            }
                            throw th;
                        }
                    }
                    dh5Var4.A = obj4;
                    Object obj12 = dh5Var5.A;
                    ja2Var = (ja2) obj12;
                    if (!(ja2Var instanceof mn6)) {
                        n61 n61Var = z23Var2.u;
                        dh5 dh5Var10 = dh5Var5;
                        z23 z23Var5 = z23Var2;
                        try {
                            ja1 ja1Var = new ja1(w42Var2, dh5Var10, dh5Var3, z23Var5, obj3, dh5Var2, k62Var2, null, 3);
                            z23Var3 = z23Var5;
                            dh5 dh5Var11 = dh5Var2;
                            k62Var3 = k62Var2;
                            s42Var2.R = w42Var2;
                            s42Var2.X = z23Var3;
                            s42Var2.Y = k62Var3;
                            s42Var2.Z = dh5Var11;
                            s42Var2.d0 = dh5Var5;
                            s42Var2.e0 = null;
                            s42Var2.f0 = null;
                            s42Var2.g0 = null;
                            s42Var2.j0 = 2;
                            Object d0 = hv.d0(n61Var, ja1Var, s42Var2);
                            if (d0 != x61Var) {
                                dh5Var7 = dh5Var11;
                                w42Var4 = w42Var2;
                                obj6 = d0;
                                dh5Var6 = dh5Var7;
                                w42Var3 = w42Var4;
                                q42Var = (q42) obj6;
                                k62 k62Var42 = k62Var3;
                                z23 z23Var42 = z23Var3;
                                obj5 = dh5Var5.A;
                                if (obj5 instanceof mn6) {
                                }
                                if (mn6Var != null) {
                                }
                                fo4 fo4Var22 = (fo4) dh5Var6.A;
                                s42Var2.R = null;
                                s42Var2.X = null;
                                s42Var2.Y = null;
                                s42Var2.Z = null;
                                s42Var2.d0 = null;
                                s42Var2.e0 = null;
                                s42Var2.f0 = null;
                                s42Var2.g0 = null;
                                s42Var2.j0 = 3;
                                w42Var3.getClass();
                                list = z23Var42.h;
                                obj7 = q42Var;
                                if (!list.isEmpty()) {
                                }
                            } else {
                                return x61Var;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            dh5Var = dh5Var10;
                            obj2 = dh5Var.A;
                            if (obj2 instanceof mn6) {
                            }
                            if (mn6Var2 != null) {
                            }
                            throw th;
                        }
                    } else {
                        z23Var3 = z23Var2;
                        dh5Var6 = dh5Var2;
                        k62Var3 = k62Var2;
                        if (ja2Var instanceof wo1) {
                            w42Var3 = w42Var2;
                            q42Var = new q42(((wo1) obj12).a, ((wo1) obj12).b, ((wo1) obj12).c, null);
                            k62 k62Var422 = k62Var3;
                            z23 z23Var422 = z23Var3;
                            obj5 = dh5Var5.A;
                            if (obj5 instanceof mn6) {
                            }
                            if (mn6Var != null) {
                            }
                            fo4 fo4Var222 = (fo4) dh5Var6.A;
                            s42Var2.R = null;
                            s42Var2.X = null;
                            s42Var2.Y = null;
                            s42Var2.Z = null;
                            s42Var2.d0 = null;
                            s42Var2.e0 = null;
                            s42Var2.f0 = null;
                            s42Var2.g0 = null;
                            s42Var2.j0 = 3;
                            w42Var3.getClass();
                            list = z23Var422.h;
                            obj7 = q42Var;
                            if (!list.isEmpty()) {
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
            if (dh5Var == 0) {
            }
            dh5Var4.A = obj4;
            Object obj122 = dh5Var5.A;
            ja2Var = (ja2) obj122;
            if (!(ja2Var instanceof mn6)) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        s42Var = new s42(w42Var, s41Var);
        s42 s42Var22 = s42Var;
        Object obj72 = s42Var22.h0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        dh5Var = s42Var22.j0;
        mn6 mn6Var22 = null;
        BitmapDrawable bitmapDrawable2 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c7 -> B:29:0x00cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(uv0 uv0Var, z23 z23Var, Object obj, fo4 fo4Var, k62 k62Var, s41 s41Var) {
        t42 t42Var;
        w42 w42Var;
        int i;
        Object obj2;
        fo4 fo4Var2;
        k62 k62Var2;
        int i2;
        t42 t42Var2;
        uv0 uv0Var2;
        z23 z23Var2;
        int size;
        vr4 vr4Var;
        vr4 vr4Var2;
        mn6 mn6Var;
        if (s41Var instanceof t42) {
            t42Var = (t42) s41Var;
            int i3 = t42Var.i0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t42Var.i0 = i3 - Integer.MIN_VALUE;
                w42Var = this;
                Object obj3 = t42Var.g0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = t42Var.i0;
                vr4 vr4Var3 = null;
                if (i == 0) {
                    if (i == 1) {
                        int i4 = t42Var.f0;
                        k62 k62Var3 = t42Var.e0;
                        fo4Var2 = t42Var.d0;
                        Object obj4 = t42Var.Z;
                        z23 z23Var3 = t42Var.Y;
                        uv0 uv0Var3 = t42Var.X;
                        w42 w42Var2 = t42Var.R;
                        oi2.Y(obj3);
                        k62Var2 = k62Var3;
                        obj2 = obj4;
                        vr4Var = null;
                        t42 t42Var3 = t42Var;
                        z23Var2 = z23Var3;
                        i2 = i4;
                        w42Var = w42Var2;
                        ja2 ja2Var = (ja2) obj3;
                        try {
                            k62Var2.getClass();
                            if (ja2Var == null) {
                                return ja2Var;
                            }
                            uv0Var2 = uv0Var3;
                            t42Var2 = t42Var3;
                            vr4Var3 = vr4Var;
                            pe5 pe5Var = w42Var.a;
                            List list = uv0Var2.d;
                            size = list.size();
                            while (true) {
                                if (i2 >= size) {
                                    vr4 vr4Var4 = (vr4) list.get(i2);
                                    ka2 ka2Var = (ka2) vr4Var4.A;
                                    vr4Var = vr4Var3;
                                    if (((Class) vr4Var4.B).isAssignableFrom(obj2.getClass())) {
                                        ka2Var.getClass();
                                        la2 a = ka2Var.a(obj2, fo4Var2, pe5Var);
                                        if (a != null) {
                                            vr4Var2 = new vr4(a, Integer.valueOf(i2));
                                            break;
                                        }
                                    }
                                    i2++;
                                    vr4Var3 = vr4Var;
                                } else {
                                    vr4Var = vr4Var3;
                                    vr4Var2 = vr4Var;
                                    break;
                                }
                            }
                            if (vr4Var2 == null) {
                                i2 = ((Number) vr4Var2.B).intValue() + 1;
                                k62Var2.getClass();
                                t42Var2.R = w42Var;
                                t42Var2.X = uv0Var2;
                                t42Var2.Y = z23Var2;
                                t42Var2.Z = obj2;
                                t42Var2.d0 = fo4Var2;
                                t42Var2.e0 = k62Var2;
                                t42Var2.f0 = i2;
                                t42Var2.i0 = 1;
                                Object a2 = ((la2) vr4Var2.A).a(t42Var2);
                                if (a2 == x61Var) {
                                    return x61Var;
                                }
                                t42 t42Var4 = t42Var2;
                                uv0Var3 = uv0Var2;
                                obj3 = a2;
                                t42Var3 = t42Var4;
                                ja2 ja2Var2 = (ja2) obj3;
                                k62Var2.getClass();
                                if (ja2Var2 == null) {
                                }
                            } else {
                                u34.i(obj2, "Unable to create a fetcher that supports: ");
                                return vr4Var;
                            }
                        } catch (Throwable th) {
                            if (ja2Var2 instanceof mn6) {
                                mn6Var = (mn6) ja2Var2;
                            } else {
                                mn6Var = vr4Var;
                            }
                            if (mn6Var != 0) {
                                k.a(mn6Var.a);
                            }
                            throw th;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj3);
                    obj2 = obj;
                    fo4Var2 = fo4Var;
                    k62Var2 = k62Var;
                    i2 = 0;
                    t42Var2 = t42Var;
                    uv0Var2 = uv0Var;
                    z23Var2 = z23Var;
                    pe5 pe5Var2 = w42Var.a;
                    List list2 = uv0Var2.d;
                    size = list2.size();
                    while (true) {
                        if (i2 >= size) {
                        }
                        i2++;
                        vr4Var3 = vr4Var;
                    }
                    if (vr4Var2 == null) {
                    }
                }
            }
        }
        w42Var = this;
        t42Var = new t42(w42Var, s41Var);
        Object obj32 = t42Var.g0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = t42Var.i0;
        vr4 vr4Var32 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(re5 re5Var, s41 s41Var) {
        u42 u42Var;
        int i;
        d44 d44Var;
        w42 w42Var = this;
        re5 re5Var2 = re5Var;
        s63 s63Var = w42Var.d;
        if (s41Var instanceof u42) {
            u42Var = (u42) s41Var;
            int i2 = u42Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u42Var.d0 = i2 - Integer.MIN_VALUE;
                u42 u42Var2 = u42Var;
                Object obj = u42Var2.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = u42Var2.d0;
                if (i == 0) {
                    if (i == 1) {
                        re5 re5Var3 = u42Var2.X;
                        w42 w42Var2 = u42Var2.R;
                        try {
                            oi2.Y(obj);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            re5Var2 = re5Var3;
                            w42Var = w42Var2;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    try {
                        z23 z23Var = (z23) re5Var2.X;
                        Object obj2 = z23Var.b;
                        wi6 wi6Var = (wi6) re5Var2.Y;
                        Bitmap.Config[] configArr = k.a;
                        k62 k62Var = (k62) re5Var2.Z;
                        fo4 v = w42Var.c.v(z23Var, wi6Var);
                        y56 y56Var = v.e;
                        List list = w42Var.a.g.b;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            try {
                                vr4 vr4Var = (vr4) list.get(i3);
                                s90 s90Var = (s90) vr4Var.A;
                                if (((Class) vr4Var.B).isAssignableFrom(obj2.getClass())) {
                                    s90Var.getClass();
                                    Object a = s90Var.a(obj2, v);
                                    if (a != null) {
                                        obj2 = a;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                w42Var = this;
                            }
                        }
                        c44 q = s63Var.q(z23Var, obj2, v, k62Var);
                        if (q != null) {
                            d44Var = s63Var.n(z23Var, q, wi6Var, y56Var);
                        } else {
                            d44Var = null;
                        }
                        if (d44Var != null) {
                            return s63.u(re5Var2, z23Var, q, d44Var);
                        }
                        n61 n61Var = z23Var.t;
                        w42Var = this;
                        ja1 ja1Var = new ja1(w42Var, z23Var, obj2, v, k62Var, q, re5Var2, null, 4);
                        u42Var2.R = w42Var;
                        u42Var2.X = re5Var2;
                        u42Var2.d0 = 1;
                        Object d0 = hv.d0(n61Var, ja1Var, u42Var2);
                        if (d0 == x61Var) {
                            return x61Var;
                        }
                        return d0;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (th instanceof CancellationException) {
                    ap3 ap3Var = w42Var.c;
                    return ap3.r((z23) re5Var2.X, th);
                }
                throw th;
            }
        }
        u42Var = new u42(w42Var, s41Var);
        u42 u42Var22 = u42Var;
        Object obj3 = u42Var22.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = u42Var22.d0;
        if (i == 0) {
        }
        if (th instanceof CancellationException) {
        }
    }
}
