package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kl0  reason: default package */
/* loaded from: classes.dex */
public final class kl0 extends ct7 {
    public final ArrayList k;
    public int l;

    public kl0(l21 l21Var, int i) {
        super(l21Var);
        l21 l21Var2;
        xh1 xh1Var;
        int i2;
        xh1 xh1Var2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        l21 l21Var3 = this.b;
        l21 n = l21Var3.n(i);
        while (true) {
            l21Var2 = l21Var3;
            l21Var3 = n;
            if (l21Var3 == null) {
                break;
            }
            n = l21Var3.n(this.f);
        }
        this.b = l21Var2;
        int i3 = this.f;
        if (i3 == 0) {
            xh1Var = l21Var2.d;
        } else if (i3 == 1) {
            xh1Var = l21Var2.e;
        } else {
            xh1Var = null;
        }
        arrayList.add(xh1Var);
        l21 m = l21Var2.m(this.f);
        while (m != null) {
            int i4 = this.f;
            if (i4 == 0) {
                xh1Var2 = m.d;
            } else if (i4 == 1) {
                xh1Var2 = m.e;
            } else {
                xh1Var2 = null;
            }
            arrayList.add(xh1Var2);
            m = m.m(this.f);
        }
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ct7 ct7Var = (ct7) obj;
            int i6 = this.f;
            if (i6 == 0) {
                ct7Var.b.b = this;
            } else if (i6 == 1) {
                ct7Var.b.c = this;
            }
        }
        if (this.f == 0 && ((m21) this.b.U).y0 && arrayList.size() > 1) {
            this.b = ((ct7) arrayList.get(arrayList.size() - 1)).b;
        }
        int i7 = this.f;
        l21 l21Var4 = this.b;
        if (i7 == 0) {
            i2 = l21Var4.k0;
        } else {
            i2 = l21Var4.l0;
        }
        this.l = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x039b, code lost:
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    @Override // defpackage.xh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xh1 xh1Var) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        float f4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z3;
        boolean z4;
        int i20;
        ci1 ci1Var = this.h;
        if (ci1Var.j) {
            ci1 ci1Var2 = this.i;
            if (ci1Var2.j) {
                l21 l21Var = this.b.U;
                if (l21Var instanceof m21) {
                    z = ((m21) l21Var).y0;
                } else {
                    z = false;
                }
                int i21 = ci1Var2.g - ci1Var.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i22 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i22 < size) {
                        if (((ct7) arrayList.get(i22)).b.h0 != 8) {
                            break;
                        }
                        i22++;
                    } else {
                        i22 = -1;
                        break;
                    }
                }
                int i23 = size - 1;
                int i24 = i23;
                while (true) {
                    if (i24 < 0) {
                        break;
                    } else if (((ct7) arrayList.get(i24)).b.h0 != 8) {
                        i = i24;
                        break;
                    } else {
                        i24--;
                    }
                }
                int i25 = 0;
                while (i25 < 2) {
                    f = RecyclerView.B1;
                    i4 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    f2 = RecyclerView.B1;
                    while (i26 < size) {
                        ct7 ct7Var = (ct7) arrayList.get(i26);
                        l21 l21Var2 = ct7Var.b;
                        boolean z5 = z;
                        if (l21Var2.h0 != i2) {
                            i28++;
                            if (i26 > 0 && i26 >= i22) {
                                i4 += ct7Var.h.f;
                            }
                            rj1 rj1Var = ct7Var.e;
                            int i29 = rj1Var.g;
                            int i30 = i4;
                            if (ct7Var.d != k21.MATCH_CONSTRAINT) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                int i31 = this.f;
                                if (i31 != 0 || l21Var2.d.e.j) {
                                    if (i31 != 1 || l21Var2.e.e.j) {
                                        z4 = z3;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                z4 = z3;
                                if (ct7Var.a == 1 && i25 == 0) {
                                    i20 = rj1Var.m;
                                    i27++;
                                } else if (rj1Var.j) {
                                    i20 = i29;
                                }
                                z4 = true;
                                if (z4) {
                                    i27++;
                                    float f5 = l21Var2.m0[this.f];
                                    if (f5 >= RecyclerView.B1) {
                                        f2 += f5;
                                    }
                                    i4 = i30;
                                } else {
                                    i4 = i30 + i20;
                                }
                                if (i26 < i23 && i26 < i) {
                                    i4 += -ct7Var.i.f;
                                }
                            }
                            i20 = i29;
                            if (z4) {
                            }
                            if (i26 < i23) {
                                i4 += -ct7Var.i.f;
                            }
                        }
                        i26++;
                        z = z5;
                        i2 = 8;
                    }
                    z2 = z;
                    if (i4 >= i21 && i27 != 0) {
                        i25++;
                        z = z2;
                        i2 = 8;
                    } else {
                        i3 = i27;
                        i5 = i28;
                        break;
                    }
                }
                z2 = z;
                f = RecyclerView.B1;
                f2 = 0.0f;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                int i32 = ci1Var.g;
                if (z2) {
                    i32 = ci1Var2.g;
                }
                float f6 = 0.5f;
                if (i4 > i21) {
                    if (z2) {
                        i32 += (int) (((i4 - i21) / 2.0f) + 0.5f);
                    } else {
                        i32 -= (int) (((i4 - i21) / 2.0f) + 0.5f);
                    }
                }
                if (i3 > 0) {
                    float f7 = i21 - i4;
                    int i33 = (int) ((f7 / i3) + 0.5f);
                    int i34 = 0;
                    int i35 = 0;
                    while (i34 < size) {
                        float f8 = f6;
                        ct7 ct7Var2 = (ct7) arrayList.get(i34);
                        int i36 = i32;
                        l21 l21Var3 = ct7Var2.b;
                        int i37 = i3;
                        rj1 rj1Var2 = ct7Var2.e;
                        int i38 = i4;
                        float f9 = f7;
                        if (l21Var3.h0 == 8 || ct7Var2.d != k21.MATCH_CONSTRAINT || rj1Var2.j) {
                            i18 = i33;
                        } else {
                            if (f2 > f) {
                                i15 = (int) (((l21Var3.m0[this.f] * f9) / f2) + f8);
                            } else {
                                i15 = i33;
                            }
                            if (this.f == 0) {
                                i16 = l21Var3.v;
                                i17 = l21Var3.u;
                            } else {
                                i16 = l21Var3.y;
                                i17 = l21Var3.x;
                            }
                            i18 = i33;
                            if (ct7Var2.a == 1) {
                                i19 = Math.min(i15, rj1Var2.m);
                            } else {
                                i19 = i15;
                            }
                            int max = Math.max(i17, i19);
                            if (i16 > 0) {
                                max = Math.min(i16, max);
                            }
                            if (max != i15) {
                                i35++;
                                i15 = max;
                            }
                            rj1Var2.d(i15);
                        }
                        i34++;
                        i32 = i36;
                        f6 = f8;
                        i3 = i37;
                        i4 = i38;
                        f7 = f9;
                        i33 = i18;
                    }
                    i6 = i32;
                    f3 = f6;
                    int i39 = i3;
                    int i40 = i4;
                    if (i35 > 0) {
                        i3 = i39 - i35;
                        i4 = 0;
                        for (int i41 = 0; i41 < size; i41++) {
                            ct7 ct7Var3 = (ct7) arrayList.get(i41);
                            if (ct7Var3.b.h0 != 8) {
                                if (i41 > 0 && i41 >= i22) {
                                    i4 += ct7Var3.h.f;
                                }
                                i4 += ct7Var3.e.g;
                                if (i41 < i23 && i41 < i) {
                                    i4 += -ct7Var3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i39;
                        i4 = i40;
                    }
                    i8 = 2;
                    if (this.l == 2 && i35 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i32;
                    f3 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i4 > i21) {
                    this.l = i8;
                }
                if (i5 > 0 && i3 == 0 && i22 == i) {
                    this.l = i8;
                }
                int i42 = this.l;
                if (i42 == 1) {
                    if (i5 > 1) {
                        i13 = (i21 - i4) / (i5 - 1);
                    } else if (i5 == 1) {
                        i13 = (i21 - i4) / 2;
                    } else {
                        i13 = i7;
                    }
                    if (i3 > 0) {
                        i13 = i7;
                    }
                    int i43 = i6;
                    for (int i44 = i7; i44 < size; i44++) {
                        if (z2) {
                            i14 = size - (i44 + 1);
                        } else {
                            i14 = i44;
                        }
                        ct7 ct7Var4 = (ct7) arrayList.get(i14);
                        l21 l21Var4 = ct7Var4.b;
                        ci1 ci1Var3 = ct7Var4.i;
                        ci1 ci1Var4 = ct7Var4.h;
                        if (l21Var4.h0 == 8) {
                            ci1Var4.d(i43);
                            ci1Var3.d(i43);
                        } else {
                            if (i44 > 0) {
                                if (z2) {
                                    i43 -= i13;
                                } else {
                                    i43 += i13;
                                }
                            }
                            if (i44 > 0 && i44 >= i22) {
                                if (z2) {
                                    i43 -= ci1Var4.f;
                                } else {
                                    i43 += ci1Var4.f;
                                }
                            }
                            if (z2) {
                                ci1Var3.d(i43);
                            } else {
                                ci1Var4.d(i43);
                            }
                            rj1 rj1Var3 = ct7Var4.e;
                            int i45 = rj1Var3.g;
                            if (ct7Var4.d == k21.MATCH_CONSTRAINT && ct7Var4.a == 1) {
                                i45 = rj1Var3.m;
                            }
                            if (z2) {
                                i43 -= i45;
                            } else {
                                i43 += i45;
                            }
                            if (z2) {
                                ci1Var4.d(i43);
                            } else {
                                ci1Var3.d(i43);
                            }
                            ct7Var4.g = true;
                            if (i44 < i23 && i44 < i) {
                                if (z2) {
                                    i43 -= -ci1Var3.f;
                                } else {
                                    i43 += -ci1Var3.f;
                                }
                            }
                        }
                    }
                } else if (i42 == 0) {
                    int i46 = (i21 - i4) / (i5 + 1);
                    if (i3 > 0) {
                        i46 = i7;
                    }
                    int i47 = i6;
                    for (int i48 = i7; i48 < size; i48++) {
                        if (z2) {
                            i11 = size - (i48 + 1);
                        } else {
                            i11 = i48;
                        }
                        ct7 ct7Var5 = (ct7) arrayList.get(i11);
                        l21 l21Var5 = ct7Var5.b;
                        ci1 ci1Var5 = ct7Var5.i;
                        ci1 ci1Var6 = ct7Var5.h;
                        if (l21Var5.h0 == 8) {
                            ci1Var6.d(i47);
                            ci1Var5.d(i47);
                        } else {
                            if (z2) {
                                i12 = i47 - i46;
                            } else {
                                i12 = i47 + i46;
                            }
                            if (i48 > 0 && i48 >= i22) {
                                if (z2) {
                                    i12 -= ci1Var6.f;
                                } else {
                                    i12 += ci1Var6.f;
                                }
                            }
                            if (z2) {
                                ci1Var5.d(i12);
                            } else {
                                ci1Var6.d(i12);
                            }
                            rj1 rj1Var4 = ct7Var5.e;
                            int i49 = rj1Var4.g;
                            if (ct7Var5.d == k21.MATCH_CONSTRAINT && ct7Var5.a == 1) {
                                i49 = Math.min(i49, rj1Var4.m);
                            }
                            if (z2) {
                                i47 = i12 - i49;
                            } else {
                                i47 = i12 + i49;
                            }
                            if (z2) {
                                ci1Var6.d(i47);
                            } else {
                                ci1Var5.d(i47);
                            }
                            if (i48 < i23 && i48 < i) {
                                if (z2) {
                                    i47 -= -ci1Var5.f;
                                } else {
                                    i47 += -ci1Var5.f;
                                }
                            }
                        }
                    }
                } else if (i42 == 2) {
                    int i50 = this.f;
                    l21 l21Var6 = this.b;
                    if (i50 == 0) {
                        f4 = l21Var6.e0;
                    } else {
                        f4 = l21Var6.f0;
                    }
                    if (z2) {
                        f4 = 1.0f - f4;
                    }
                    int i51 = (int) (((i21 - i4) * f4) + f3);
                    if (i51 < 0 || i3 > 0) {
                        i51 = i7;
                    }
                    if (z2) {
                        i9 = i6 - i51;
                    } else {
                        i9 = i6 + i51;
                    }
                    for (int i52 = i7; i52 < size; i52++) {
                        if (z2) {
                            i10 = size - (i52 + 1);
                        } else {
                            i10 = i52;
                        }
                        ct7 ct7Var6 = (ct7) arrayList.get(i10);
                        l21 l21Var7 = ct7Var6.b;
                        ci1 ci1Var7 = ct7Var6.i;
                        ci1 ci1Var8 = ct7Var6.h;
                        if (l21Var7.h0 == 8) {
                            ci1Var8.d(i9);
                            ci1Var7.d(i9);
                        } else {
                            if (i52 > 0 && i52 >= i22) {
                                if (z2) {
                                    i9 -= ci1Var8.f;
                                } else {
                                    i9 += ci1Var8.f;
                                }
                            }
                            if (z2) {
                                ci1Var7.d(i9);
                            } else {
                                ci1Var8.d(i9);
                            }
                            rj1 rj1Var5 = ct7Var6.e;
                            int i53 = rj1Var5.g;
                            if (ct7Var6.d == k21.MATCH_CONSTRAINT && ct7Var6.a == 1) {
                                i53 = rj1Var5.m;
                            }
                            i9 += i53;
                            if (z2) {
                                ci1Var8.d(i9);
                            } else {
                                ci1Var7.d(i9);
                            }
                            if (i52 < i23 && i52 < i) {
                                if (z2) {
                                    i9 -= -ci1Var7.f;
                                } else {
                                    i9 += -ci1Var7.f;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ct7
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ct7) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        l21 l21Var = ((ct7) arrayList.get(0)).b;
        l21 l21Var2 = ((ct7) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        ci1 ci1Var = this.i;
        ci1 ci1Var2 = this.h;
        if (i2 == 0) {
            h11 h11Var = l21Var.I;
            h11 h11Var2 = l21Var2.K;
            ci1 i3 = ct7.i(h11Var, 0);
            int e = h11Var.e();
            l21 m = m();
            if (m != null) {
                e = m.I.e();
            }
            if (i3 != null) {
                ct7.b(ci1Var2, i3, e);
            }
            ci1 i4 = ct7.i(h11Var2, 0);
            int e2 = h11Var2.e();
            l21 n = n();
            if (n != null) {
                e2 = n.K.e();
            }
            if (i4 != null) {
                ct7.b(ci1Var, i4, -e2);
            }
        } else {
            h11 h11Var3 = l21Var.J;
            h11 h11Var4 = l21Var2.L;
            ci1 i5 = ct7.i(h11Var3, 1);
            int e3 = h11Var3.e();
            l21 m2 = m();
            if (m2 != null) {
                e3 = m2.J.e();
            }
            if (i5 != null) {
                ct7.b(ci1Var2, i5, e3);
            }
            ci1 i6 = ct7.i(h11Var4, 1);
            int e4 = h11Var4.e();
            l21 n2 = n();
            if (n2 != null) {
                e4 = n2.L.e();
            }
            if (i6 != null) {
                ct7.b(ci1Var, i6, -e4);
            }
        }
        ci1Var2.a = this;
        ci1Var.a = this;
    }

    @Override // defpackage.ct7
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i < arrayList.size()) {
                ((ct7) arrayList.get(i)).e();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ct7
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ct7) obj).f();
        }
    }

    @Override // defpackage.ct7
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            ct7 ct7Var = (ct7) arrayList.get(i);
            j = ct7Var.i.f + ct7Var.j() + j + ct7Var.h.f;
        }
        return j;
    }

    @Override // defpackage.ct7
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((ct7) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final l21 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i < arrayList.size()) {
                l21 l21Var = ((ct7) arrayList.get(i)).b;
                if (l21Var.h0 != 8) {
                    return l21Var;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final l21 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l21 l21Var = ((ct7) arrayList.get(size)).b;
            if (l21Var.h0 != 8) {
                return l21Var;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((ct7) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
