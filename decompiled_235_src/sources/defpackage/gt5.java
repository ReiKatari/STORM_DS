package defpackage;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import me.magnum.melonds.database.MelonDatabase;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gt5  reason: default package */
/* loaded from: classes.dex */
public final class gt5 extends hw6 implements eo2 {
    public lx5 X;
    public String Y;
    public String Z;
    public String d0;
    public int e0;
    public final /* synthetic */ Context f0;
    public final /* synthetic */ pq5 g0;
    public final /* synthetic */ MelonDatabase h0;
    public final /* synthetic */ hp0 i0;
    public final /* synthetic */ qa4 j0;
    public final /* synthetic */ qa4 k0;
    public final /* synthetic */ qa4 l0;
    public final /* synthetic */ qa4 m0;
    public final /* synthetic */ om6 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt5(Context context, pq5 pq5Var, MelonDatabase melonDatabase, hp0 hp0Var, qa4 qa4Var, qa4 qa4Var2, qa4 qa4Var3, qa4 qa4Var4, om6 om6Var, r41 r41Var) {
        super(2, r41Var);
        this.f0 = context;
        this.g0 = pq5Var;
        this.h0 = melonDatabase;
        this.i0 = hp0Var;
        this.j0 = qa4Var;
        this.k0 = qa4Var2;
        this.l0 = qa4Var3;
        this.m0 = qa4Var4;
        this.n0 = om6Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((gt5) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new gt5(this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, r41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ab, code lost:
        if (r0.b(r14, r23) == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0167, code lost:
        if (r13 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017b, code lost:
        if (r15 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c2, code lost:
        if (r6 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e4, code lost:
        if (r6 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0200, code lost:
        if (r3 == r2) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ee  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        lx5 lx5Var;
        BufferedInputStream bufferedInputStream;
        lx5 J;
        String str;
        String c0;
        String k0;
        String str2;
        String str3;
        String str4;
        long j;
        cp2 cp2Var;
        Object h;
        lp2 lp2Var;
        Object b;
        Object c;
        Object S;
        String str5;
        Object S2;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.e0;
        yt1 yt1Var = yt1.A;
        hp0 hp0Var = this.i0;
        qa4 qa4Var = this.j0;
        MelonDatabase melonDatabase = this.h0;
        switch (i) {
            case 0:
                oi2.Y(obj);
                qa4Var.setValue(Boolean.TRUE);
                Context context = this.f0;
                pq5 pq5Var = this.g0;
                if (pq5Var.c()) {
                    String c02 = vy7.c0(pq5Var);
                    Long l = pq5Var.l;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    int i2 = (int) j;
                    String str6 = pq5Var.a;
                    lx5Var = new lx5(c02, i2, str6, str6, true);
                } else {
                    try {
                        InputStream openInputStream = context.getContentResolver().openInputStream(pq5Var.d);
                        if (openInputStream != null) {
                            if (openInputStream instanceof BufferedInputStream) {
                                bufferedInputStream = (BufferedInputStream) openInputStream;
                            } else {
                                bufferedInputStream = new BufferedInputStream(openInputStream, 8192);
                            }
                            bufferedInputStream.mark(4);
                            byte[] bArr = new byte[4];
                            int read = bufferedInputStream.read(bArr);
                            bufferedInputStream.reset();
                            if (read == 4 && bArr[0] == 80 && bArr[1] == 75) {
                                ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
                                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                                    String name = nextEntry.getName();
                                    name.getClass();
                                    String lowerCase = name.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    if (!xs6.Y(lowerCase, ".nds", false) && !xs6.Y(lowerCase, ".dsi", false) && !xs6.Y(lowerCase, ".ids", false)) {
                                    }
                                    J = kn2.J(pq5Var, zipInputStream);
                                }
                            } else {
                                J = kn2.J(pq5Var, bufferedInputStream);
                                bufferedInputStream.close();
                            }
                            lx5Var = J;
                        }
                        lx5Var = null;
                    } catch (Throwable unused) {
                        String c03 = vy7.c0(pq5Var);
                        int abs = Math.abs(pq5Var.a.hashCode());
                        String str7 = pq5Var.a;
                        lx5Var = new lx5(c03, abs, str7, str7, pq5Var.h);
                    }
                }
                this.k0.setValue(lx5Var);
                if (lx5Var != null) {
                    str = lx5Var.b();
                } else {
                    str = "";
                }
                if (lx5Var != null && (c0 = lx5Var.a) != null) {
                    if (qs6.v0(c0)) {
                        c0 = null;
                        break;
                    }
                }
                c0 = vy7.c0(pq5Var);
                if (lx5Var != null && (k0 = lx5Var.c) != null) {
                    if (qs6.v0(k0)) {
                        k0 = null;
                        break;
                    }
                }
                k0 = hf.k0(pq5Var);
                this.X = lx5Var;
                this.Y = str;
                this.Z = c0;
                this.d0 = k0;
                this.e0 = 1;
                xe1 xe1Var = xk1.a;
                String str8 = k0;
                String str9 = str;
                String str10 = c0;
                if (hv.d0(de1.L, new ja1(str10, str9, this.h0, str8, (r41) null), this) != x61Var) {
                    str2 = str10;
                    str3 = str9;
                    str4 = str8;
                    if (lx5Var == null) {
                        this.X = null;
                        this.Y = str3;
                        this.Z = str2;
                        this.d0 = str4;
                        this.e0 = 2;
                        h = ((h16) hp0Var).h(lx5Var, this);
                        break;
                    } else {
                        cp2Var = null;
                        if (cp2Var == null) {
                            if (!qs6.v0(str3)) {
                                ip2 v = melonDatabase.v();
                                this.X = null;
                                this.Y = str3;
                                this.Z = str2;
                                this.d0 = str4;
                                this.e0 = 3;
                                b = v.b(str3, this);
                                break;
                            } else {
                                lp2Var = null;
                                if (lp2Var == null) {
                                    ip2 v2 = melonDatabase.v();
                                    this.X = null;
                                    this.Y = str3;
                                    this.Z = str2;
                                    this.d0 = str4;
                                    this.e0 = 4;
                                    c = v2.c(str2, this);
                                    break;
                                }
                                if (lp2Var != null) {
                                    cp2Var = new cp2(lp2Var.a, lp2Var.b, lp2Var.c, lp2Var.d, yt1Var);
                                } else {
                                    cp2Var = null;
                                }
                            }
                        }
                        String str11 = str4;
                        String str12 = str2;
                        String str13 = str3;
                        this.l0.setValue(cp2Var);
                        if (cp2Var == null) {
                            le2 i3 = ((h16) hp0Var).i(cp2Var);
                            ft5 ft5Var = new ft5(this.h0, str12, str11, str13, this.m0, this.n0, this.j0);
                            this.X = null;
                            this.Y = null;
                            this.Z = null;
                            this.d0 = null;
                            this.e0 = 7;
                            break;
                        } else {
                            this.m0.setValue(yt1Var);
                            qa4Var.setValue(Boolean.FALSE);
                        }
                        return jg7.a;
                    }
                }
                return x61Var;
            case 1:
                str4 = this.d0;
                str2 = this.Z;
                str3 = this.Y;
                lx5Var = this.X;
                oi2.Y(obj);
                if (lx5Var == null) {
                }
                break;
            case 2:
                str4 = this.d0;
                str2 = this.Z;
                str3 = this.Y;
                oi2.Y(obj);
                h = obj;
                cp2Var = (cp2) h;
                if (cp2Var == null) {
                }
                String str112 = str4;
                String str122 = str2;
                String str132 = str3;
                this.l0.setValue(cp2Var);
                if (cp2Var == null) {
                }
                return jg7.a;
            case 3:
                str4 = this.d0;
                str2 = this.Z;
                str3 = this.Y;
                oi2.Y(obj);
                b = obj;
                lp2Var = (lp2) b;
                if (lp2Var == null) {
                }
                if (lp2Var != null) {
                }
                String str1122 = str4;
                String str1222 = str2;
                String str1322 = str3;
                this.l0.setValue(cp2Var);
                if (cp2Var == null) {
                }
                return jg7.a;
            case 4:
                str4 = this.d0;
                String str14 = this.Z;
                String str15 = this.Y;
                oi2.Y(obj);
                str3 = str15;
                str2 = str14;
                c = obj;
                lp2Var = (lp2) c;
                if (lp2Var == null) {
                    if (str2.length() >= 3) {
                        ip2 v3 = melonDatabase.v();
                        String S0 = qs6.S0(3, str2);
                        this.X = null;
                        this.Y = str3;
                        this.Z = str2;
                        this.d0 = str4;
                        this.e0 = 5;
                        S2 = hv.S(this, v3.a, true, false, new c70(S0, 9));
                        if (S2 != x61Var) {
                            str5 = str3;
                            lp2Var = (lp2) S2;
                            str3 = str5;
                        }
                    } else {
                        ip2 v4 = melonDatabase.v();
                        this.X = null;
                        this.Y = str3;
                        this.Z = str2;
                        this.d0 = str4;
                        this.e0 = 6;
                        S = hv.S(this, v4.a, true, false, new c70(str4, 10));
                        if (S != x61Var) {
                            str5 = str3;
                            lp2Var = (lp2) S;
                            str3 = str5;
                        }
                    }
                    return x61Var;
                }
                if (lp2Var != null) {
                }
                String str11222 = str4;
                String str12222 = str2;
                String str13222 = str3;
                this.l0.setValue(cp2Var);
                if (cp2Var == null) {
                }
                return jg7.a;
            case 5:
                str4 = this.d0;
                String str16 = this.Z;
                str5 = this.Y;
                oi2.Y(obj);
                str2 = str16;
                S2 = obj;
                lp2Var = (lp2) S2;
                str3 = str5;
                if (lp2Var != null) {
                }
                String str112222 = str4;
                String str122222 = str2;
                String str132222 = str3;
                this.l0.setValue(cp2Var);
                if (cp2Var == null) {
                }
                return jg7.a;
            case 6:
                str4 = this.d0;
                String str17 = this.Z;
                str5 = this.Y;
                oi2.Y(obj);
                str2 = str17;
                S = obj;
                lp2Var = (lp2) S;
                str3 = str5;
                if (lp2Var != null) {
                }
                String str1122222 = str4;
                String str1222222 = str2;
                String str1322222 = str3;
                this.l0.setValue(cp2Var);
                if (cp2Var == null) {
                }
                return jg7.a;
            case 7:
                oi2.Y(obj);
                return jg7.a;
            default:
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
