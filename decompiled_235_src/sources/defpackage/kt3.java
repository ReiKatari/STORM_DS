package defpackage;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt3  reason: default package */
/* loaded from: classes.dex */
public final class kt3 {
    public final View a;
    public final u63 b;
    public jt3 e;
    public p27 f;
    public fo7 g;
    public Rect l;
    public final ft3 m;
    public qn2 c = new v83(18);
    public qn2 d = new v83(19);
    public c37 h = new c37("", 4, k47.b);
    public l33 i = l33.g;
    public final ArrayList j = new ArrayList();
    public final go3 k = kj2.M(xr3.NONE, new er2(this, 7));

    public kt3(View view, ii iiVar, u63 u63Var) {
        this.a = view;
        this.b = u63Var;
        this.m = new ft3(iiVar, u63Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lf5 a(EditorInfo editorInfo) {
        int i;
        gy3 gy3Var;
        int i2;
        int i3;
        c37 c37Var = this.h;
        String str = c37Var.a.B;
        long j = c37Var.b;
        l33 l33Var = this.i;
        int i4 = l33Var.e;
        int i5 = l33Var.d;
        boolean z = l33Var.a;
        if (i4 == 1) {
            if (!z) {
                i = 0;
                editorInfo.imeOptions = i;
                gy3Var = l33Var.f;
                if (nb3.k(gy3Var, gy3.L)) {
                    editorInfo.hintLocales = null;
                } else {
                    ArrayList arrayList = new ArrayList(ht0.v0(gy3Var, 10));
                    for (fy3 fy3Var : gy3Var.A) {
                        arrayList.add(fy3Var.a);
                    }
                    Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                    editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            i2 = 2;
                        } else if (i5 == 4) {
                            i2 = 3;
                        } else if (i5 == 5) {
                            i2 = 17;
                        } else if (i5 == 6) {
                            i2 = 33;
                        } else if (i5 == 7) {
                            i2 = 129;
                        } else if (i5 == 8) {
                            i2 = 18;
                        } else if (i5 == 9) {
                            i2 = 8194;
                        } else {
                            i.m("Invalid Keyboard Type");
                            return null;
                        }
                        editorInfo.inputType = i2;
                        if (!z && (i2 & 1) == 1) {
                            editorInfo.inputType = 131072 | i2;
                            if (l33Var.e == 1) {
                                editorInfo.imeOptions |= 1073741824;
                            }
                        }
                        i3 = editorInfo.inputType;
                        if ((i3 & 1) == 1) {
                            int i6 = l33Var.b;
                            if (i6 == 1) {
                                editorInfo.inputType = i3 | 4096;
                            } else if (i6 == 2) {
                                editorInfo.inputType = i3 | 8192;
                            } else if (i6 == 3) {
                                editorInfo.inputType = i3 | 16384;
                            }
                            if (l33Var.c) {
                                editorInfo.inputType |= 32768;
                            }
                        }
                        int i7 = k47.c;
                        editorInfo.initialSelStart = (int) (j >> 32);
                        editorInfo.initialSelEnd = (int) (j & 4294967295L);
                        jw2.C(editorInfo, str);
                        editorInfo.imeOptions |= 33554432;
                        if (!et6.a && i5 != 7 && i5 != 8) {
                            jw2.D(editorInfo, true);
                            editorInfo.setSupportedHandwritingGestures(hf.c0(gi.j(), gi.A(), gi.w(), gi.z(), gi.B(), gi.C(), gi.D()));
                            editorInfo.setSupportedHandwritingGesturePreviews(fv.V0(new Class[]{gi.j(), gi.A(), gi.w(), gi.z()}));
                        } else {
                            jw2.D(editorInfo, false);
                        }
                        gt3 gt3Var = ht3.a;
                        if (ws1.d()) {
                            ws1.a().i(editorInfo);
                        }
                        lf5 lf5Var = new lf5(this.h, new s63(this, 10), this.i.c, this.e, this.f, this.g);
                        this.j.add(new WeakReference(lf5Var));
                        return lf5Var;
                    }
                    editorInfo.imeOptions |= Integer.MIN_VALUE;
                }
                i2 = 1;
                editorInfo.inputType = i2;
                if (!z) {
                    editorInfo.inputType = 131072 | i2;
                    if (l33Var.e == 1) {
                    }
                }
                i3 = editorInfo.inputType;
                if ((i3 & 1) == 1) {
                }
                int i72 = k47.c;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                jw2.C(editorInfo, str);
                editorInfo.imeOptions |= 33554432;
                if (!et6.a) {
                }
                jw2.D(editorInfo, false);
                gt3 gt3Var2 = ht3.a;
                if (ws1.d()) {
                }
                lf5 lf5Var2 = new lf5(this.h, new s63(this, 10), this.i.c, this.e, this.f, this.g);
                this.j.add(new WeakReference(lf5Var2));
                return lf5Var2;
            }
            i = 6;
            editorInfo.imeOptions = i;
            gy3Var = l33Var.f;
            if (nb3.k(gy3Var, gy3.L)) {
            }
            if (i5 != 1) {
            }
            i2 = 1;
            editorInfo.inputType = i2;
            if (!z) {
            }
            i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
            }
            int i722 = k47.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            jw2.C(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (!et6.a) {
            }
            jw2.D(editorInfo, false);
            gt3 gt3Var22 = ht3.a;
            if (ws1.d()) {
            }
            lf5 lf5Var22 = new lf5(this.h, new s63(this, 10), this.i.c, this.e, this.f, this.g);
            this.j.add(new WeakReference(lf5Var22));
            return lf5Var22;
        }
        if (i4 == 0) {
            i = 1;
        } else if (i4 == 2) {
            i = 2;
        } else if (i4 == 6) {
            i = 5;
        } else if (i4 == 5) {
            i = 7;
        } else if (i4 == 3) {
            i = 3;
        } else if (i4 == 4) {
            i = 4;
        } else {
            if (i4 != 7) {
                i.m("invalid ImeAction");
                return null;
            }
            i = 6;
        }
        editorInfo.imeOptions = i;
        gy3Var = l33Var.f;
        if (nb3.k(gy3Var, gy3.L)) {
        }
        if (i5 != 1) {
        }
        i2 = 1;
        editorInfo.inputType = i2;
        if (!z) {
        }
        i3 = editorInfo.inputType;
        if ((i3 & 1) == 1) {
        }
        int i7222 = k47.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        jw2.C(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!et6.a) {
        }
        jw2.D(editorInfo, false);
        gt3 gt3Var222 = ht3.a;
        if (ws1.d()) {
        }
        lf5 lf5Var222 = new lf5(this.h, new s63(this, 10), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(lf5Var222));
        return lf5Var222;
    }
}
