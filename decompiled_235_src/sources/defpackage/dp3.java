package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dp3  reason: default package */
/* loaded from: classes.dex */
public final class dp3 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Object g;
    public final Object h;
    public Object i;

    public dp3(oo3 oo3Var) {
        this.g = oo3Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bp3(0, 0));
        this.a = arrayList;
        this.e = -1;
        this.h = new ArrayList();
        this.i = yt1.A;
    }

    public static dp3 a(dp3 dp3Var, int i, bk1 bk1Var, pa paVar, int i2) {
        if ((i2 & 1) != 0) {
            i = dp3Var.b;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            bk1Var = (bk1) dp3Var.h;
        }
        bk1 bk1Var2 = bk1Var;
        if ((i2 & 4) != 0) {
            paVar = (pa) dp3Var.i;
        }
        pa paVar2 = paVar;
        int i4 = dp3Var.c;
        int i5 = dp3Var.d;
        int i6 = dp3Var.e;
        paVar2.getClass();
        return new dp3((je5) dp3Var.g, dp3Var.a, i3, bk1Var2, paVar2, i4, i5, i6);
    }

    public int b() {
        return ((int) Math.sqrt((e() * 1.0d) / this.f)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (r9 < r8) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qj2 c(int i) {
        int i2;
        int i3;
        int i4;
        List list;
        ArrayList arrayList = (ArrayList) this.h;
        boolean z = true;
        if (!((oo3) this.g).j) {
            int i5 = this.f;
            int i6 = i * i5;
            int e = e() - i6;
            if (i5 > e) {
                i5 = e;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            if (i5 == ((List) this.i).size()) {
                list = (List) this.i;
            } else {
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i7 = 0; i7 < i5; i7++) {
                    arrayList2.add(new ju2(ej2.a(1)));
                }
                this.i = arrayList2;
                list = arrayList2;
            }
            return new qj2(i6, list);
        }
        ArrayList arrayList3 = this.a;
        int min = Math.min(i / b(), arrayList3.size() - 1);
        int b = b() * min;
        int i8 = ((bp3) arrayList3.get(min)).a;
        int i9 = ((bp3) arrayList3.get(min)).b;
        int i10 = this.b;
        if (b <= i10 && i10 <= i) {
            i8 = this.c;
            i9 = this.d;
            b = i10;
        } else if (min == this.e && (i2 = i - b) < arrayList.size()) {
            i8 = ((Number) arrayList.get(i2)).intValue();
            b = i;
            i9 = 0;
        }
        if (b % b() == 0) {
            int b2 = b();
            int i11 = i - b;
            if (2 <= i11) {
            }
        }
        z = false;
        if (z) {
            this.e = min;
            arrayList.clear();
        }
        if (b > i) {
            s53.c("currentLine (" + b + ") > lineIndex (" + i + ')');
        }
        while (b < i && i8 < e()) {
            if (z) {
                arrayList.add(Integer.valueOf(i8));
            }
            int i12 = 0;
            while (i12 < this.f && i8 < e()) {
                if (i9 == 0) {
                    i4 = i9;
                    i9 = g(i8);
                } else {
                    i4 = 0;
                }
                i12 += i9;
                if (i12 > this.f) {
                    break;
                }
                i8++;
                i9 = i4;
            }
            b++;
            if (b % b() == 0 && i8 < e()) {
                if (arrayList3.size() != b / b()) {
                    s53.c("invalid starting point");
                }
                arrayList3.add(new bp3(i8, i9));
            }
        }
        this.b = i;
        this.c = i8;
        this.d = i9;
        ArrayList arrayList4 = new ArrayList();
        int i13 = 0;
        int i14 = i8;
        while (i13 < this.f && i14 < e()) {
            if (i9 == 0) {
                int i15 = i9;
                i9 = g(i14);
                i3 = i15;
            } else {
                i3 = 0;
            }
            i13 += i9;
            if (i13 > this.f) {
                break;
            }
            i14++;
            arrayList4.add(new ju2(ej2.a(i9)));
            i9 = i3;
        }
        return new qj2(i8, arrayList4);
    }

    public int d(int i) {
        int i2;
        int i3;
        if (e() <= 0) {
            return 0;
        }
        if (i >= e()) {
            s53.a("ItemIndex > total count");
        }
        if (!((oo3) this.g).j) {
            return i / this.f;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        hf.h0(arrayList.size(), size);
        int i4 = size - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = ((bp3) arrayList.get(i2)).a - i;
                if (i6 < 0) {
                    i5 = i2 + 1;
                } else if (i6 <= 0) {
                    break;
                } else {
                    i4 = i2 - 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        if (i2 < 0) {
            i2 = (-i2) - 2;
        }
        int b = b() * i2;
        int i7 = ((bp3) arrayList.get(i2)).a;
        if (i7 > i) {
            s53.a("currentItemIndex > itemIndex");
        }
        int i8 = 0;
        while (i7 < i) {
            int i9 = i7 + 1;
            int g = g(i7);
            i8 += g;
            int i10 = this.f;
            if (i8 >= i10) {
                if (i8 == i10) {
                    b++;
                    i8 = 0;
                } else {
                    b++;
                    i8 = g;
                }
            }
            if (b % b() == 0 && b / b() >= arrayList.size()) {
                if (i8 > 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                arrayList.add(new bp3(i9 - i3, 0));
            }
            i7 = i9;
        }
        if (g(i) + i8 > this.f) {
            return b + 1;
        }
        return b;
    }

    public int e() {
        return ((oo3) this.g).i.B;
    }

    public wl5 f(pa paVar) {
        bk1 bk1Var = (bk1) this.h;
        paVar.getClass();
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i < arrayList.size()) {
            this.f++;
            if (bk1Var != null) {
                ue5 b = ((w62) bk1Var.B).b();
                i03 i03Var = (i03) paVar.B;
                b.getClass();
                i03Var.getClass();
                i03 i03Var2 = b.i.h;
                if (i03Var.e == i03Var2.e && nb3.k(i03Var.d, i03Var2.d)) {
                    if (this.f != 1) {
                        e41.g(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                        return null;
                    }
                } else {
                    e41.g(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                    return null;
                }
            }
            int i2 = i + 1;
            dp3 a = a(this, i2, null, paVar, 58);
            v93 v93Var = (v93) arrayList.get(i);
            wl5 a2 = v93Var.a(a);
            if (a2 != null) {
                if (bk1Var != null && i2 < arrayList.size() && a.f != 1) {
                    e41.g(v93Var, " must call proceed() exactly once", "network interceptor ");
                    return null;
                }
                return a2;
            }
            throw new NullPointerException("interceptor " + v93Var + " returned null");
        }
        i.m("Check failed.");
        return null;
    }

    public int g(int i) {
        cp3.b = this.f;
        bb3 d = ((oo3) this.g).i.d(i);
        return (int) ((ju2) ((mo3) d.c).b.o(cp3.a, Integer.valueOf(i - d.a))).a;
    }

    public dp3(je5 je5Var, ArrayList arrayList, int i, bk1 bk1Var, pa paVar, int i2, int i3, int i4) {
        paVar.getClass();
        this.g = je5Var;
        this.a = arrayList;
        this.b = i;
        this.h = bk1Var;
        this.i = paVar;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
