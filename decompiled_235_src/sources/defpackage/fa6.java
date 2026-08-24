package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fa6 */
/* loaded from: classes.dex */
public final /* synthetic */ class fa6 implements ga6, m37, wq7, mo2 {
    public static final fa6 B = new fa6(8);
    public static final fa6 L = new fa6(9);
    public static final fa6 R = new fa6(10);
    public static final fa6 X = new fa6(11);
    public static final fa6 Y = new fa6(12);
    public final /* synthetic */ int A;

    public /* synthetic */ fa6(di7 di7Var) {
        this.A = 14;
    }

    public static /* synthetic */ void c() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void e(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void f(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void g(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void h(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IOException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void j(String str) {
        throw new zbuq(str);
    }

    @Override // defpackage.wq7
    public p97 a(fp fpVar) {
        return new p97(fpVar, lk4.a);
    }

    @Override // defpackage.mo2
    public Object apply(Object obj) {
        List<xw7> list = (List) obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
            for (xw7 xw7Var : list) {
                arrayList.add(xw7Var.a());
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x006b, code lost:
        if (r2.b == r3.b) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0090, code lost:
        if (((defpackage.a47) r11.e).a.a.B.length() != r5.b) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0094, code lost:
        r5 = (defpackage.ea6) r12.L;
        r6 = ((defpackage.a47) r11.e).a.a.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00a2, code lost:
        if (r5 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00a8, code lost:
        if (r6.length() != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00ac, code lost:
        r12 = r12.B;
        r6 = ((defpackage.a47) r11.e).a.a.B;
        r7 = r11.b;
        r8 = r6.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00c0, code lost:
        if (r7 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00c2, code lost:
        r5 = defpackage.mp2.w(0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c6, code lost:
        if (r12 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00da, code lost:
        if (r7 != r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00dc, code lost:
        r5 = defpackage.mp2.x(r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00e0, code lost:
        if (r12 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00f6, code lost:
        if (r5.c != true) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00f8, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00fb, code lost:
        if ((r12 ^ r4) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00fd, code lost:
        r5 = defpackage.mp2.x(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0102, code lost:
        r5 = defpackage.mp2.w(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0106, code lost:
        if (r12 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:?, code lost:
        return defpackage.ea6.a(r0, defpackage.ej2.l(r2, r11, r5), null, true, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:?, code lost:
        return defpackage.ea6.a(r0, null, defpackage.ej2.l(r3, r11, r5), false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:?, code lost:
        return defpackage.ea6.a(r0, defpackage.ej2.l(r2, r11, r5), null, false, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:?, code lost:
        return defpackage.ea6.a(r0, null, defpackage.ej2.l(r3, r11, r5), true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:?, code lost:
        return defpackage.ea6.a(r0, defpackage.ej2.l(r2, r11, r5), null, r4, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:?, code lost:
        return defpackage.ea6.a(r0, null, defpackage.ej2.l(r3, r11, r5), r4, 1);
     */
    @Override // defpackage.ga6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ea6 b(ci ciVar) {
        da6 f;
        da6 da6Var;
        da6 da6Var2;
        boolean z;
        da6 da6Var3;
        da6 da6Var4;
        switch (this.A) {
            case 0:
                return ej2.e(ciVar, cs1.k0);
            case 1:
                return ej2.e(ciVar, vs0.t0);
            default:
                ea6 ea6Var = (ea6) ciVar.L;
                ls0 ls0Var = (ls0) ciVar.R;
                if (ea6Var == null) {
                    return ej2.e(ciVar, cs1.k0);
                }
                da6 da6Var5 = ea6Var.b;
                da6 da6Var6 = ea6Var.a;
                if (ciVar.B) {
                    f = ej2.f(ciVar, ls0Var, da6Var6);
                    da6Var2 = da6Var5;
                    da6Var5 = da6Var6;
                    da6Var = f;
                } else {
                    f = ej2.f(ciVar, ls0Var, da6Var5);
                    da6Var = da6Var6;
                    da6Var2 = f;
                }
                if (!nb3.k(f, da6Var5)) {
                    boolean z2 = false;
                    if (ciVar.m() != m71.CROSSED && (ciVar.m() != m71.COLLAPSED || da6Var.b <= da6Var2.b)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ea6 ea6Var2 = new ea6(da6Var, da6Var2, z);
                    ls0 ls0Var2 = (ls0) ciVar.R;
                    da6 da6Var7 = ea6Var2.a;
                    long j = da6Var7.c;
                    da6 da6Var8 = ea6Var2.b;
                    if (j != da6Var8.c) {
                        boolean z3 = ea6Var2.c;
                        if (z3) {
                            da6Var3 = da6Var7;
                        } else {
                            da6Var3 = da6Var8;
                        }
                        if (da6Var3.b == 0) {
                            if (z3) {
                                da6Var4 = da6Var8;
                            } else {
                                da6Var4 = da6Var7;
                            }
                            break;
                        }
                    } else {
                        break;
                    }
                    return ea6Var2;
                }
                return ea6Var;
        }
    }

    public /* synthetic */ fa6(int i) {
        this.A = i;
    }
}
